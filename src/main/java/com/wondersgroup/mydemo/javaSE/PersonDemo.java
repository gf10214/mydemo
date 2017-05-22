package com.wondersgroup.mydemo.javaSE;

/**
 * Created by Administrator on 2017/2/22 0022.
 */
class Person{
    private String name;
    private int num=3;
    Person(){
        show();
    }
    public void show(){
        System.out.println(num);
    }
    public void show_2(){
        System.out.println("person");
    }
}
class Student extends Person{
    private int num=4;

    @Override
    public void show_2() {
        System.out.println("student");
    }

    @Override
    public void show() {
        System.out.println(num);
    }
}
public class PersonDemo {
    public static boolean change(String aa){
        return  aa=="aa";
    }
    public static void main(String args[]){
        Person student=new Student();

       // student.show_2();
        //Usb usb=new MUseb();
        student.show();

        String a="aaa";
        boolean aa=change(a);
        System.out.println(aa);

    }

}
