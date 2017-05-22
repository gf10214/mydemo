package com.wondersgroup.mydemo.javaSE.extend;

/**
 * Created by Administrator on 2017/2/27 0027.
 */
public class Base {
    int num;
    public int num1;
    protected int num2=1;
    private int num3=1;
    void show (){
        System.out.println("父类default......"+num);
    }
    public void show1(){
        System.out.println("父类public......"+num);
    }
    protected void show2(){
        System.out.println("父类protect......"+num);
    }
    private void show3(){
        System.out.println("父类private......"+num);
    }
}
