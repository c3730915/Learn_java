package cn.itcast.Basic.Interface.Interface_Imp;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("Open mouse");
    }

    @Override
    public void close() {
        System.out.println("Close mouse");

    }
    public void click(){
        System.out.println("Click mouse");
    }
}
