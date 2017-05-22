package com.wondersgroup.mydemo.javaSE.net;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
public class Chat {
    public static void main(String args[]) throws SocketException {
        DatagramSocket ds=new DatagramSocket();
        DatagramSocket rece=new DatagramSocket(10001);
        Send s=new Send(ds);
        Recive r=new Recive(rece);
        new Thread(s).start();
        new Thread(r).start();
    }

}
