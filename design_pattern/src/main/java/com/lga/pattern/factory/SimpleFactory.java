package com.lga.pattern.factory;

import com.lga.pattern.factory.pizz.CheesePizz;
import com.lga.pattern.factory.pizz.GreekPizz;
import com.lga.pattern.factory.pizz.PepperPizz;
import com.lga.pattern.factory.pizz.Pizz;

public class SimpleFactory {

    public static Pizz getPizz(String pizzName){
        Pizz pizz = null;
        if ("GreekPizz".equals(pizzName)) {
            pizz = new GreekPizz();
        }else if("CheesePizz".equals(pizzName)){
            pizz = new CheesePizz();
        }else if ("PepperPizz".equals(pizzName)){
            pizz = new PepperPizz();
        }else {
            System.out.println("没有该pizz");
        }
        System.out.println(pizz.getName()+"创建成功");
        return pizz;
    }
}
