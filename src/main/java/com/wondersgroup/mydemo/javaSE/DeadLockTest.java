package com.wondersgroup.mydemo.javaSE;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
class Test implements Runnable{
    private boolean flag;
    Test(boolean flag){
        this.flag=flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.objecta){
                System.out.println("if...locka....");
                synchronized (MyLock.objectb){
                    System.out.println("if...locab....");
                }
            }
        }else {
            synchronized (MyLock.objectb){
                System.out.println("else...locka....");
                synchronized (MyLock.objecta){
                    System.out.println("else...lockb....");
                }
            }
        }
    }
}
class MyLock{
    public static final Object objecta=new Object();
    public static final Object objectb=new Object();
}
public class DeadLockTest {
    public static void main(String args[]){
        Test1 a=new Test1(true);
        Test1 b=new Test1(false);
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}
