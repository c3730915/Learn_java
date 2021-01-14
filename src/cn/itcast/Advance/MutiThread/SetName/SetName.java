package cn.itcast.Advance.MutiThread.SetName;

import cn.itcast.Advance.MutiThread.MythreadDemo.Mythread;

public class SetName {
    public static void main(String[] args) {
        //开启多线程
        Mythread mt = new Mythread();
        mt.setName("xiaoqiang");
        mt.start();

        //开启多线程
        new MyThread("wangcai").start();
    }
}
