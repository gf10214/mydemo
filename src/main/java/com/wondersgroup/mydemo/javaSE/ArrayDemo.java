package com.wondersgroup.mydemo.javaSE;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class ArrayDemo {
    /**
     * 获取数组最大值
     */
    public static int getMax(int[] a){
        int max=a[0];
        for(int x=0;x<a.length;x++){
            if(a[x]>max){
                max=a[x];
            }
        }
        return max;
    }

    /**
     * 选择排序
     * @param a
     */
    public static void selectSort(int[] a){
        for(int x=0;x<a.length-1;x++){
            for(int y=x+1;y<a.length;y++){
                if(a[x]>a[y]){
                    int temp=a[x];
                    a[x]=a[y];
                    a[y]=temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @param a
     */
    public static void bubbleSort(int[] a){
        for(int x=0;x<a.length-1;x++){
            for(int y=0;y<a.length-1-x;y++){
                if (a[y]>a[y+1]){
                    int temp=a[y];
                    a[y]=a[y+1];
                    a[y+1]=temp;
                }
            }
        }
    }

    /**
     * 二分查找
     * @param arr
     * @param key
     * @return
     */
    public static int halfSearch(int[] arr,int key){
        int max,min,mid;
        min=0;
        max=arr.length-1;
        mid=(max+min)/2;
        while (arr[mid]!=key){
            if(key>arr[mid]){
                min=mid+1;
            }else if(key<arr[mid]){
                max=mid-1;
            }
            if(max<min){
                return -1;
            }
            mid=(max+min)/2;
        }
        return mid;
    }
    public static void main(String[] args){
//        int[] arr={13,21,1,4,6};
//        System.out.print(halfSearch(arr,1));
//        int max=getMax(arr);
//        System.out.println(max);
//        bubbleSort(arr);
//        for(int x=0;x<arr.length;x++){
//            System.out.println(arr[x]);
//        }
        Integer a=new Integer(5);
        Integer b=new Integer(5);
        System.out.println(a==b);

    }
}
