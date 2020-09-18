package cn.itcast.Advance.Exception;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = sdf.parse("1999-0909");
        try {
            //可能会异常的代码
            System.out.println("fff");
        }
        catch (java.lang.Exception e){


        }
    }
}
