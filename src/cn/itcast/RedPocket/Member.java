package cn.itcast.RedPocket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }
    public void receive(ArrayList<Integer>list){
        //从多个红包中随便抽取一个
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        //根据索引，从红包集合中随便抽取一个给我自己
        int money = super.getMoney();
        super.setMoney(money+delta);
        //加上红包的金额
    }
}
