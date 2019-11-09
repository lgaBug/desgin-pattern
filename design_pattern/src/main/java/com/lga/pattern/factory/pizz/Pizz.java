package com.lga.pattern.factory.pizz;



/**
 *describe: 披萨基类
 * 
 *@author lga 
 *@date  2019/11/9 0009 23:19
 */ 
public abstract class Pizz {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepar();

    public void bake(){
        System.out.println(this.name+"正在烘烤");
    }

    public void cut(){
        System.out.println(this.name+"正在切块");
    }

    public void box(){
        System.out.println(this.name+"正在打包");
    }
}
