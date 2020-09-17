package cn.itcast.Generic;

public class testGereric {
    public static void main(String[] args) {
        //不写泛型，默认为object
        GenericClass gc = new GenericClass();
        gc.setName("1234");
        gc.getName();

        GenericClass gc2 = new GenericClass();
        gc2.setName(111);
        gc2.getName();
    }
}
