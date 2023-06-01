package com.jiayu.design.proxy.dynamicproxy;

/**
 * @ClassName : MonitorUtil
 * @Description :
 * @Author : jiayu
 * @Date: 2023-06-01 08:57
 */

public class MonitorUtil {

    private static ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
    }
}
