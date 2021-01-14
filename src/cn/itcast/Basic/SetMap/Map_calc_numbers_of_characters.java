package cn.itcast.Basic.SetMap;

import java.util.HashMap;
import java.util.Scanner;

public class Map_calc_numbers_of_characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = scanner.next();
        HashMap<Character,Integer> map = new HashMap<>();
        //创建map集合，key是字符串的字符，value是字符的个数
        for(char c:str.toCharArray()){
            if(map.containsKey(c))
            {
                Integer value = map.get(c);
                value++;
                map.put(c,value);

            }
            else {
                map.put(c,1);
            }
        }

        for(Character key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
