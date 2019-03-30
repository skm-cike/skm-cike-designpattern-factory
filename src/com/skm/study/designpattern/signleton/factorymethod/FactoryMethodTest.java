package com.skm.study.designpattern.signleton.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IPoultryFactory poultrya = new PoultryFactoryA();
        IPoultryFactory poultryb = new PoultryFactoryB();
        System.out.print("养殖场a-->");
        poultrya.get().getName();
        System.out.println();
        System.out.println("养殖场b-->");
        poultryb.get().getName();
    }
}
