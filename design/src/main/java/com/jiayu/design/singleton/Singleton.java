package com.jiayu.design.singleton;

/**
 * @ClassName : Singleton
 * @Description : 单例模式   双端检查+锁+volatile 禁止指定重排
 * @Author : jiayu
 * @Date: 2023-05-31 10:27
 * @url: https://blog.csdn.net/weixin_41949328/article/details/107296517?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522168549263116800192243040%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=168549263116800192243040&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-107296517-null-null.142^v88^control_2,239^v2^insert_chatgpt&utm_term=%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F&spm=1018.2226.3001.4187
 */

public class Singleton {

    private static volatile Singleton singleton;   //volatite 禁止指令重排

    private Singleton(){}

    public static Singleton getInstance() {
        if (singleton == null) {  // 线程A和线程B同时看到singleton = null，如果不为null，则直接返回singleton
            synchronized(Singleton.class) { // 线程A或线程B获得该锁进行初始化
                if (singleton == null) { // 其中一个线程进入该分支，另外一个线程则不会进入该分支
                    singleton = new Singleton();
                    System.out.println("当前线程::::"+Thread.currentThread().getName());
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(()->{
                getInstance();
            }).start();
        }
    }

}