package cn.itcast.Advance.MutiThread.MythreadDemo;
//线程的名称 ：
//主线程 main 新的：Thread--0 -1 ....
public class GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread2  mt = new MyThread2();
        new MyThread2().start();
        new MyThread2().start();
        new MyThread2().start();
    }
}
