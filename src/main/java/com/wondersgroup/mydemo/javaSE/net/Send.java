package com.wondersgroup.mydemo.javaSE.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
public class Send implements Runnable {
    private DatagramSocket ds;

    public Send(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        try {
            while((line=buff.readLine())!=null){
                if("over".equals(line)){
                    break;
                }
                DatagramPacket p=new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getByName("192.168.199.160"),10001);
                ds.send(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ds.close();
    }
}
