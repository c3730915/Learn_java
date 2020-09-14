package cn.itcast.RedPocket;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger manger = new Manger("manger",100);
        Member one = new Member("MemberA",0);
        Member two = new Member("MemberB",0);
        Member three = new Member("MemberC",0);
        Member four = new Member("MemberD",0);
        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("====================================================");
        ArrayList<Integer> redlist = manger.send(20,3);
       one.receive(redlist);

       two.receive(redlist);
       three.receive(redlist);
       four .receive(redlist);

        manger.show();
        one.show();
        two.show();
        three.show();
    }
}
