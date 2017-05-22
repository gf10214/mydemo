package com.wondersgroup.mydemo.javaSE;

/**
 * Created by Administrator on 2017/3/2 0002.
 */
class Resource1{
    private String name;
    private int count=1;
    private boolean flag=false;
    public synchronized void set(){
        while(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"..生产....."+name+count);
        flag=true;
        notifyAll();
    }
    public synchronized void out(){
        while(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"..xiaofei....."+name+count);
        flag=false;
        notifyAll();
    }
}
class Produce implements Runnable{
    Resource1 r;
    Produce(Resource1 r){
        this.r=r;
    }
    @Override
    public void run() {
        while (true){
            r.set();
        }
    }
}
class Consumer implements Runnable{
    Resource1 r;
    Consumer(Resource1 r){
        this.r=r;
    }
    @Override
    public void run() {
        while (true){
            r.out();
        }
    }
}
public class ProduceConsumerDemo {

    public static void main(String[] args){
        Resource1 resource1=new Resource1();
        Thread t0=new Thread(new Produce(resource1));
        Thread t1=new Thread(new Produce(resource1));
        Thread t2=new Thread(new Consumer(resource1));
        Thread t3=new Thread(new Consumer(resource1));
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
