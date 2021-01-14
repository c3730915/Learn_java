package cn.itcast.Advance.MutiThread.MythreadDemo;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        String name = getName();
        System.out.println(name);
    }
}
