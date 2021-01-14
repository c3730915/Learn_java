package cn.itcast.Advance.MutiThread.SetName;

//Thread的子类
public class MyThread extends Thread{

    public  MyThread(){}
    public  MyThread(String name){
        super(name);//把线程传递给父类，让父类Thread给线程起名字
    }
    @Override
    public void run(){
        for (int i = 0; i <20 ; i++) {
            System.out.println("run"+i);
        }
    }

}
