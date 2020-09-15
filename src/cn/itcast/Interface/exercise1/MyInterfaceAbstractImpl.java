package cn.itcast.Interface.exercise1;

public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void methodAbs() {
        System.out.println("First method");
    }

    @Override
    public void methodAbs2() {

        System.out.println("Second method");
    }

    @Override
    public void methodAbs3() {

        System.out.println("Third method");
    }

    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs2();

    }
}
