package cn.itcast.Basic.DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌，定义存储一个54张牌的Arraylist集合，泛型用String
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠","♥","♦","♣"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String number:numbers){
            for(String color:colors){
//                System.out.println(color+number);
                poker.add(color+number);
            }
        }
        /*
        洗牌 用shuffle
         */
        Collections.shuffle(poker);
        System.out.println(poker);
        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //四个玩家
        //遍历poker，通过索引轮流发牌
        for (int i =0;i<poker.size();i++){
            String p = poker.get(i);
            if (i>=51){
                dipai.add(p);
                //底牌发牌
            }
            else if(i%3==0){
                play01.add(p);
            }
            else if(i%3==1){
                play02.add(p);
            }

            else if(i%3==2){
                play03.add(p);
            }
        }
        //给玩家一二三发牌
        System.out.println("刘德华"+play01);
        System.out.println("周星驰"+play02);
        System.out.println("周润发"+play03);
        System.out.println("底牌"+dipai);
    }
}
