package cn.itcast.Basic.Multi;

public class Multi {
    public static void main(String[] args) {
        Father obj = new Child(); //左侧父类的引用，指向了右类子类的对象 多态
        obj.method();
        //优先使用new 的方法
        obj.methodFather();
        /*
        * 如果父子都有，优先用子类 因为new 如果子类没有但是父类有，那么就向上寻找
        * */
    }
}
