package com.wondersgroup.mydemo.javaSE.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Administrator on 2017/3/19 0019.
 */
public class Recive implements Runnable{
    private DatagramSocket ds;

    public Recive(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        byte[] buf=new byte[1024];
        DatagramPacket p=new DatagramPacket(buf,buf.length);
        while(true){
            try {
                ds.receive(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String ip=p.getAddress().getHostAddress();
            int port=p.getPort();
            String txt=new String(p.getData(),0,p.getLength());
            if(txt.equals("886")){
                System.out.println("退出聊天室");
            }
            System.out.println(txt);
        }
    }
}
