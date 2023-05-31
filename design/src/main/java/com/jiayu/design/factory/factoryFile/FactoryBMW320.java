package com.jiayu.design.factory.factoryFile;

/**
 * @ClassName : FactoryBMW320
 * @Description :
 * @Author : jiayu
 * @Date: 2023-05-31 14:32
 */

public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}
