package com.skm.study.designpattern.signleton.simplefactory;

import com.skm.study.designpattern.signleton.Chicken;
import com.skm.study.designpattern.signleton.Duck;
import com.skm.study.designpattern.signleton.IPoultry;

public class SimpleFactoryTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        FarmFactory factory = new FarmFactory();
        IPoultry chicken = factory.get(Chicken.class);
        IPoultry duck = factory.get(Duck.class);
        chicken.getName();
        duck.getName();
    }
}
