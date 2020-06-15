package com.gugu.sort;

/**
 * @author gugu
 * @Classname MyPrint
 * @Description 自定义打印类，方便使用
 * @Date 2020/6/16 0:45
 */
public class MyPrint {
    public static void print(int[] arr) {
        for (int i:arr) {
            System.out.print(i+ "\t");
        }
        System.out.println();
    }
}
