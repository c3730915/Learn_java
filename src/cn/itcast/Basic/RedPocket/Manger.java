package cn.itcast.Basic.RedPocket;

import java.util.ArrayList;

public class Manger extends User {
    public Manger(){

    }

    public Manger(String name, int money) {
        super(name, money); //调用父类
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();//Left money of manger
        if (totalMoney>leftMoney){
            System.out.println("余额不足！！");
            return redList; //return empty
        }
        super.setMoney(leftMoney -totalMoney);
        //发红包平均拆成cout份
        int avg = totalMoney/count;
        int mod = totalMoney%count;
        //如果有剩余的话，把钱放在最后一个红包中
        for (int i =0;i<count;i++){
           redList.add(avg);
        }
        int last =avg+mod;
        redList.add(last);
        return redList;

    }

}
