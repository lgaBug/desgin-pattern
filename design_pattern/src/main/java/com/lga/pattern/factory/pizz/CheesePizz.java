package com.lga.pattern.factory.pizz;

public class CheesePizz extends Pizz {

    public CheesePizz() {
        this.setName("CheesePizz");
    }

    @Override
    public void prepar() {
        System.out.println(this.getName()+"正在准备乳酪等原材料");
    }
}
