package cn.itcast.Interface.exercise1;

public class Demo02Interface {
    public static void main(String[] args) {
        MyinterfaceDefaultA a = new MyinterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();
        //调用默认方法，如果实现类中没有相应的方法，回从接口中找到方法
    }
}
