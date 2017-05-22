package com.wondersgroup.mydemo.javaSE;

/**
 * Created by Administrator on 2017/3/1 0001.
 * 线程间通讯
 */
class Resource{
    String name;
    String sex;
    boolean flag=false;
}

class Input implements Runnable{
    Resource r;
    Object obj=new Object();
    public Input(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x=0;
        while (true){
            synchronized (r){
                if(x==0){
                    r.name="mike";
                    r.sex="nan";
                }else {
                    r.name="理理";
                    r.sex="女";
                }
            }
            r.flag=true;
            x=(x+1)%2;
        }
    }
}

class Output implements Runnable{
    Resource r;

    public Output(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true){
            synchronized (r){
                System.out.println(r.name+"....."+r.sex);
            }
            r.flag=false;
        }
    }
}
public class ResourceDemo {

    public static void main(String[] args){
        Resource r=new Resource();
        Input in=new Input(r);
        Output out=new Output(r);
        Thread thread1=new Thread(in);
        Thread thread2=new Thread(out);
        thread1.start();
        thread2.start();
    }
}
