package com.skm.study.designpattern.signleton.abstractfactory;

import com.skm.study.designpattern.signleton.ILivestock;
import com.skm.study.designpattern.signleton.IPoultry;

public interface IFarmFactory {
    IPoultry getPoultry();
    ILivestock getLivestock();
}
