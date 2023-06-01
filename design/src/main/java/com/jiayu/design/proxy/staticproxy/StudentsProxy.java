package com.jiayu.design.proxy.staticproxy;

/**
 * @ClassName : StudentsProxy
 * @Description : 代理类
 * @Author : jiayu
 * @Date: 2023-05-31 16:13
 */

/**
 * 学生代理类，也实现了Person接口，保存一个学生实体，这样既可以代理学生产生行为
 * @author Gonjan
 *
 */
public class StudentsProxy implements Person{
    //被代理的学生
    Student stu;

    public StudentsProxy(Person stu) {
        // 只代理学生对象
        if(stu.getClass() == Student.class) {
            this.stu = (Student)stu;
        }
    }

    //代理上交班费，调用被代理学生的上交班费行为
    public void giveMoney() {
        System.out.println("交钱之前事件");
        stu.giveMoney();
        System.out.println("交钱之后事件");
    }
}
