package cn.itcast.Advance.MutiThread.MythreadDemo;

public class Mythread extends Thread{
    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
