package cn.itcast.Basic.Interface.Interface_Imp;

public class Computer {
    public void powerOn(){
        System.out.println("Laptop on");
    }
    public void powerOff(){
        System.out.println("Laptop off");
    }
    //使用usb设备方法，并且把usb当作方法参数
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
           Mouse mouse = (Mouse) usb;
           mouse.click();
        } else if (usb instanceof  Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();

        }
        usb.close();
    }
}
