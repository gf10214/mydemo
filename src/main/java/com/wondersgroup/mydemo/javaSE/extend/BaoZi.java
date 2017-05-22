package com.wondersgroup.mydemo.javaSE.extend;

/**
 * Created by Administrator on 2017/2/27 0027.
 */
public class BaoZi extends Base{
    {
        System.out.println("我是构造代码块");
    }
    public BaoZi(){
        System.out.println("我是构造方法");
    }
    public static void main(String[] args) {
//        BaoZi d1  = new BaoZi();
//        BaoZi d2  = new BaoZi();
//        String a="1234";
//        String b="12"+"34";
//        System.out.println(a==b);
        String s=new String("123");
        s.hashCode();
    }
}
