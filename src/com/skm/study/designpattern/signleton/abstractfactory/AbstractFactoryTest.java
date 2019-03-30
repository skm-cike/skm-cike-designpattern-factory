package com.skm.study.designpattern.signleton.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFarmFactory farmFactoryA = new FarmFactoryA();
        IFarmFactory farmFactoryB = new FarmFactoryB();
        farmFactoryA.getLivestock().getName();
        farmFactoryA.getPoultry().getName();
        farmFactoryB.getLivestock().getName();
        farmFactoryB.getPoultry().getName();
    }
}
