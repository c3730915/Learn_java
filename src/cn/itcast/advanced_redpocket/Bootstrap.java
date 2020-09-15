package cn.itcast.advanced_redpocket;
/*
红包发出去之后，所有人都抢红包，让后最后一个红包给群主自己
红包分发策略：普通红包 total/count 余数放在最后一个红包中
手气红包 （随机)最少一分钱，最多不超过平均数的两倍



 */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("Java");
        red.setOwnerName("王健林");
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
       // red.setOpenWay();


    }
}
