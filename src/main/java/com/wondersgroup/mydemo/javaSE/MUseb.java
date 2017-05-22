package com.wondersgroup.mydemo.javaSE;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/25 0025.
 */
public class MUseb implements Usb {
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void close() {
        System.out.println("close");
    }

    public void work() {
        System.out.println("work");
    }
//    public static void main(String args[]){
////        Student student=new Student();
////        student.show_2();
//        Usb usb=new MUseb();
//    }
    public static void main(String[] arg){
        Date d=new Date();
        System.out.println(d.getTime());
    }
}
