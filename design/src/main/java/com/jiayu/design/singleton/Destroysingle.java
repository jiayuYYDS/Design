package com.jiayu.design.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @ClassName : Destroysingle
 * @Description :  破坏单例模式
 * @Author : jiayu
 * @Date: 2023-05-31 11:07
 */

public class Destroysingle {
    public static void main(String[] args) throws Exception {
        // 获取类的显式构造器
        Constructor<Singleton> construct = Singleton.class.getDeclaredConstructor();
        // 可访问私有构造器
        construct.setAccessible(true);
        // 利用反射构造新对象
        Singleton obj1 = construct.newInstance();
        // 通过正常方式获取单例对象
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2); // false


        System.out.println("======利用序列化与反序列化破坏单例模式=======");

        // 创建输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Singleton.file"));
        // 将单例对象写到文件中
        oos.writeObject(Singleton.getInstance());
        // 从文件中读取单例对象
        File file = new File("Singleton.file");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
        Singleton newInstance = (Singleton) ois.readObject();
        // 判断是否是同一个对象
        System.out.println(newInstance == Singleton.getInstance()); // false

    }
}
