package cn.itcast.Basic.Generic;
/*
含有泛型的接口，接口实现类 实现接口 指定接口泛型
 */
public class GerericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
