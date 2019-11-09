package com.lga.pattern.factory.pizz;

public class GreekPizz extends Pizz {

    public GreekPizz() {
        this.setName("GreekPizz");
    }

    @Override
    public void prepar() {
        System.out.println(this.getName()+"正在正在准备所需要的原材料");
    }
}
