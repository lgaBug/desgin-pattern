package com.lga.pattern.factory.store;

import com.lga.pattern.factory.SimpleFactory;
import com.lga.pattern.factory.pizz.Pizz;

/**
 *describe: pizz商店，pizz的制作过程都是在商店里面
 * 
 *@author lga 
 *@date  2019/11/9 0009 23:34
 */ 

public class PizzStore {

    public void orderPizz(String pizzName){
        Pizz pizz = null;
        //获取披萨
        pizz = SimpleFactory.getPizz(pizzName);
        pizz.prepar();
        pizz.bake();
        pizz.cut();
        pizz.box();
    }

    public static void main(String[] args){

        PizzStore pizzStore = new PizzStore();
        pizzStore.orderPizz("GreekPizz");
        System.out.println("--------------------");
        pizzStore.orderPizz("PepperPizz");

    }
}
