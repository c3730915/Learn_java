package cn.itcast.Basic.Interface.Interface_Imp;

public class Main_Interface {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标，让电脑进行使用
        Mouse mouse = new Mouse();

        //首先进行向上转型
        USB usb = mouse;
        //多态
        computer.useDevice(usb);
        //参数为usb类型 正好传递usb类型的鼠标
        //没有用多态写法
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);
        //正确，自动向上转型

        computer.powerOff();
    }
}
