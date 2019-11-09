package com.lga.pattern.factory.pizz;

public class PepperPizz extends Pizz {

    public PepperPizz() {
        this.setName("PepperPizz");
    }

    @Override
    public void prepar() {
        System.out.println(this.getName()+"正在准备胡椒等原材料");
    }
}
