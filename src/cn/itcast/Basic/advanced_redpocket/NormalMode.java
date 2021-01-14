package cn.itcast.Basic.advanced_redpocket;

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount; //零头
        for(int i=0;i<totalCount -1;i++)
        {
            list.add(avg);
        }
        list.add(avg+mod);
        //如果有零头，放在最后一个红包中
        return list;
    }
}
