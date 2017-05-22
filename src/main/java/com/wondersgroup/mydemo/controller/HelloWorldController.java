package com.wondersgroup.mydemo.controller;


import com.wondersgroup.mydemo.client.JawTbsService;
import com.wondersgroup.mydemo.client.Tcmci;
import com.wondersgroup.mydemo.client.TcmciSaveInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhangsnke on 2016/12/2.
 */
@RestController
@RequestMapping("/index")
public class HelloWorldController {
    @Autowired
    private JawTbsService jawTbsService;
    @RequestMapping("/hello")
    public String index(){
        Tcmci tcmci=new Tcmci();
        tcmci.setIdNumber("111920263x");//52272719860920263x
        tcmci.setXm("测试");
        tcmci.setDfphz(1);
        tcmci.setDfqxz(2);
        tcmci.setDfyaxz(3);
        tcmci.setDfyixz(4);
        tcmci.setDftsz(5);
        tcmci.setDfrsz(6);
        tcmci.setDfxyz(7);
        tcmci.setDfqyz(8);
        tcmci.setDftbz(9);
        tcmci.setWtjlcp("1");
        tcmci.setWtrypl("2");
        tcmci.setWtryjd("3");
        tcmci.setWtsywl("4");
        tcmci.setWtqxdc("5");
        tcmci.setWtjlba("1");
        tcmci.setWtgdsl("2");
        tcmci.setWthpsj("3");
        tcmci.setWtbmi("4");
        tcmci.setWtyjgs("5");//10
        tcmci.setWtsjfl("1");
        tcmci.setWtstpl("2");
        tcmci.setWtnshl("3");
        tcmci.setWtrygma("4");
        tcmci.setWtgmlt("5");
        tcmci.setWtkndh("1");
        tcmci.setWtrygmi("2");
        tcmci.setWtryxmz("3");
        tcmci.setWtqzyb("4");
        tcmci.setWtrczh("5");//20
        tcmci.setWtpfkcgz("1");
        tcmci.setWtztmm("2");
        tcmci.setWtmbyn("3");
        tcmci.setWtmkha("4");
        tcmci.setWtpfsz("5");
        tcmci.setWtkgyz("1");
        tcmci.setWtkqyw("2");
        tcmci.setWtfbfd("3");
        tcmci.setWtcwylsbs("4");
        tcmci.setWtdbnz("5");
        tcmci.setWtdbgz("1");
        tcmci.setWtsthn("2");
        tcmci.setWtsxjmyz("3");
        tcmci.setCpjgShiCode("00");
        tcmci.setCpjgCode("01");
        TcmciSaveInfo tcmciSaveInfo=jawTbsService.saveTcmciInfomation(tcmci);
        return tcmciSaveInfo.getMsg();
    }
}
