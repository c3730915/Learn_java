package cn.itcast.Basic.Hash;

public class HashCode {
    public static void main(String[] args) {
        Person person = new Person();
        int h1 = person.hashCode();
        System.out.println(h1);
    }


}
