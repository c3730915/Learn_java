package cn.itcast.Basic.Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection.add("6");
        java.util.Iterator<String> it = collection.iterator(); //多态方法 左边是接口 右边是实现类
        boolean b = it.hasNext();
        for (int i =0;i<8;i++)
        {
            String s = it.next();
            System.out.println(s);

        }

    }
}
