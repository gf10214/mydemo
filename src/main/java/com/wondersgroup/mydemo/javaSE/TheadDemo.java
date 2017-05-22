package com.wondersgroup.mydemo.javaSE;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
class Ticket implements Runnable{
    private int num=500;
    Object o=new Object();
    @Override
    public void run() {
        while(true){
            synchronized (o){
                if(num>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+".....sale....."+num--);
                }
            }
        }
    }
}
public class TheadDemo {
    public static void main(String args[]){
        Ticket ticket=new Ticket();
        Thread t1=new Thread(ticket);
        Thread t2=new Thread(ticket);
        Thread t3=new Thread(ticket);
        Thread t4=new Thread(ticket);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
