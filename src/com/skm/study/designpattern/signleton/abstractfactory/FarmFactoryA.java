package com.skm.study.designpattern.signleton.abstractfactory;

import com.skm.study.designpattern.signleton.Chicken;
import com.skm.study.designpattern.signleton.ILivestock;
import com.skm.study.designpattern.signleton.IPoultry;
import com.skm.study.designpattern.signleton.Pig;

public class FarmFactoryA implements IFarmFactory{
    @Override
    public IPoultry getPoultry() {
        System.out.println("养殖场A养殖-->");
        return new Chicken();
    }

    @Override
    public ILivestock getLivestock() {
        System.out.println("养殖场A养殖-->");
        return new Pig();
    }
}
