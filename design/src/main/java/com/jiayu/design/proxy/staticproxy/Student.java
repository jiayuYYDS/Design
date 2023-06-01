package com.jiayu.design.proxy.staticproxy;

/**
 * @ClassName : Student
 * @Description : 被代理类
 * @Author : jiayu
 * @Date: 2023-05-31 15:57
 */

public class Student implements Person {
    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println("切点中事件");
        System.out.println(name + "上交班费50元");
    }
}
