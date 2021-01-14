package cn.itcast.Basic.advanced_redpocket;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode  implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        //最少一分钱，最多不超过剩下平均数的两倍
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        //随机发n-1个 因为最后一个不需要随机发钱
        for (int i =0;i<totalCount-1;i++){
           int money = r.nextInt(leftMoney/leftCount*2)+1;
           list.add(money);
           leftMoney -=money;
           leftCount--;

        }
        list.add(leftMoney);



        return list;
    }
}
