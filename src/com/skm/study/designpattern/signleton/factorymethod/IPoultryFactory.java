package com.skm.study.designpattern.signleton.factorymethod;

import com.skm.study.designpattern.signleton.IPoultry;

/**
* @描述: 家禽工厂
* @作者: 陆华
* @日期: 12:08 2019-03-30 0030
* @修改人:
**/
public interface IPoultryFactory {
    IPoultry get();
}
