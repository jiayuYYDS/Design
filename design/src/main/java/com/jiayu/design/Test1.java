package com.jiayu.design;

import com.jiayu.design.singleton.Singleton;

/**
 * @ClassName : Test1
 * @Description : 测试
 * @Author : jiayu
 * @Date: 2023-05-31 10:01
 */

public class Test1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
