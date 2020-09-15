package cn.itcast.Interface.exercise1;
//从java 8开始，接口允许定义默认方法
//格式为public default 返回值类型 方法名称
//接口中的默认方法，可以解决接口升级的问题
public interface MyinterfaceDefault {
    public abstract void methodAbs();
//    public abstract void methodAbs2();
    //接口升级,如果不重写2就会报错
    public default void methodDefault(){
        System.out.println("新添加的默认方法");
    }



}
