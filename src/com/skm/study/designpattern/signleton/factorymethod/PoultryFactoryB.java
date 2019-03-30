package com.skm.study.designpattern.signleton.factorymethod;

import com.skm.study.designpattern.signleton.Chicken;
import com.skm.study.designpattern.signleton.IPoultry;

/**
* @描述: 家禽工厂
* @作者: 陆华
* @日期: 12:07 2019-03-30 0030
* @修改人:
**/
public class PoultryFactoryB implements IPoultryFactory{
    @Override
    public IPoultry get() {
        return new Chicken();
    }
}
