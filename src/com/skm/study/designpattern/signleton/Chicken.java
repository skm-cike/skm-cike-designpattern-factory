package com.skm.study.designpattern.signleton;

import com.skm.study.designpattern.signleton.IPoultry;

/**
* @描述: 鸡
* @作者: 陆华
* @日期: 11:50 2019-03-30 0030
* @修改人:
**/
public class Chicken implements IPoultry {
    @Override
    public void getName() {
        System.out.println("这是一只鸡");
    }
}
