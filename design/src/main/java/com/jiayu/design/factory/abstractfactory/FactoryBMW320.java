package com.jiayu.design.factory.abstractfactory;

/**
 * @ClassName : FactoryBMW320
 * @Description :
 * @Author : jiayu
 * @Date: 2023-05-31 14:58
 */


//为宝马320系列生产配件
public class FactoryBMW320 implements AbstractFactory{
    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
