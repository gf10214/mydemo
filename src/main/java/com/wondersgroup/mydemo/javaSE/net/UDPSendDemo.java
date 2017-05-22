package com.wondersgroup.mydemo.javaSE.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket d=new DatagramSocket();
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while((line=buff.readLine())!=null){
            if("over".equals(line)){
                break;
            }
            DatagramPacket p=new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getByName("192.168.199.160"),10000);
            d.send(p);
        }
        String str="udp传输演示";

        d.close();
    }


}
