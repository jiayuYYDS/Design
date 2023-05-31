package com.jiayu.design.factory.simplefactory;

/**
 * @ClassName : Customer
 * @Description : 客户端测试简单工厂
 * @Author : jiayu
 * @Date: 2023-05-31 12:41
 */

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BMW bmw320 = factory.createBMW(320);
        BMW bmw523 = factory.createBMW(523);
    }
}
