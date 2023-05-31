package com.jiayu.design.singleton;

/**
 * @ClassName : Hungry
 * @Description : 饿汉式  内存充足时候可以用
 * @Author : jiayu
 * @Date: 2023-05-31 10:06
 */

public class Hungry {
    private Hungry(){}
    private final static Hungry HUNGRY = new Hungry();
    public static Hungry getInstance(){
        return HUNGRY;
    }
}