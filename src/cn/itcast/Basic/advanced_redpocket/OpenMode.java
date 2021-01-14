package cn.itcast.Basic.advanced_redpocket;

import java.util.ArrayList;

public interface OpenMode {
    //请将totalmoney分成count份，保存到ArrayList中，并且返回
    //@param totalMoney 总金额，单位为分
    //@parm totalCount 红包个数
    ArrayList<Integer> divide(int totalMoney,int totalCount);
}
