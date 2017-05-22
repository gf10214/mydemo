package com.wondersgroup.mydemo.javaSE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public class CollectionDemo {
    public static void main(String[] args){
        Collection coll=new ArrayList();
        show(coll);
        Iterator a=coll.iterator();

    }
    public static void show(Collection coll){
        coll.add("abc1");
        coll.add("abc1");
        coll.add("abc3");
        System.out.println(coll);
        coll.remove("abc1");
        System.out.println(coll);
    }
}
