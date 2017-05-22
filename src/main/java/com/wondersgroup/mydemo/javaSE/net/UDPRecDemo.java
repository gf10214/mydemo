package com.wondersgroup.mydemo.javaSE.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
public class UDPRecDemo {
    public static void main(String args[]) throws IOException {
        DatagramSocket r=new DatagramSocket(10000);
        byte[] buf=new byte[1024];
        DatagramPacket p=new DatagramPacket(buf,buf.length);
        while(true){
            r.receive(p);
            String ip=p.getAddress().getHostAddress();
            int port=p.getPort();
            String txt=new String(p.getData(),0,p.getLength());
            System.out.println(txt);
        }
      //  r.close();
    }
}
