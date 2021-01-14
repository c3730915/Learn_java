package cn.itcast.Advance.MutiThread.Sleep;

public class Demo01Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <60 ; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
