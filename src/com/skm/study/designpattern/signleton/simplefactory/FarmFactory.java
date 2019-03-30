package com.skm.study.designpattern.signleton.simplefactory;

import com.skm.study.designpattern.signleton.IPoultry;

/**
* @描述: 养殖场工厂
* @作者: 陆华
* @日期: 11:50 2019-03-30 0030
* @修改人:
**/
public class FarmFactory {
    public IPoultry get(Class<?  extends IPoultry> clazz) throws IllegalAccessException, InstantiationException {
        if (null == clazz) {
            return null;
        }
        return clazz.newInstance();
    }
}
