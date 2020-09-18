package cn.itcast.SetMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
斗地主综合案例 有序版本
1.准备牌
2.洗牌
3.发牌
4.排序
5.看牌
 */
public class AdvancedDoudizhu {
    public static void main(String[] args) {
        //准备牌，创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //map存储牌的索引和组装好的牌
        //list存储牌的索引
        List<String> colors = List.of("♠", "♥", "♦", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //把大王和小王都存储在集合中
        //定义牌的索引，
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;

        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //寻欢嵌套遍历两个集合，组装52张牌
        for(String number :numbers){
            for (String color : colors){
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }

        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);
        //洗牌使用shuffle（list）
        Collections.shuffle(pokerIndex);
        //定义四个集合，储存玩家和底牌的索引
        ArrayList<Integer> play01 = new ArrayList<>();
        ArrayList<Integer> play02 = new ArrayList<>();
        ArrayList<Integer> play03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍历存储牌的索引，获取每一个牌的索引
        for (int i =0;i<pokerIndex.size();i++){
            Integer in = pokerIndex.get(i);
            if(i>=51){
                dipai.add(in);

            }else if(i%3==0){
                play01.add(in);
            }else if(i%3==1){
                play01.add(in);
            }else if(i%3==2){
                play01.add(in);
            }
        }
        Collections.sort(play01);
        Collections.sort(play02);
        Collections.sort(play03);
        Collections.sort(dipai);
        //看牌
        lookPoker("刘德华",poker,play01);
        lookPoker("zhangsan",poker,play02);
        lookPoker("lisi",poker,play03);
        lookPoker("wangwu",poker,dipai);
    }
    //定义一个看牌的方法
    //参数:
    /*
    string name 玩家名称

        HashMap<Integer,String> poker 存储牌的poker集合
         ArrayList<Integer> pokerIndex 存储玩家和底牌的list集合
         查表法：
         遍历玩家或者底牌集合，获取牌的索引
         使用牌的索引，到map集合中，找到相应的牌
     */
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer>list){
        System.out.print(name +" :   "); //输出玩家的姓名，不换行
        //遍历玩家或者底牌集合，获取牌的索引
        for (Integer key :list){
            String value = poker.get(key);
            System.out.print(value+" ");
            //使用牌的索引，到Map中 找到相应的牌
        }
        System.out.println(); //打印完一个玩家的牌，进行换行
    }
}
