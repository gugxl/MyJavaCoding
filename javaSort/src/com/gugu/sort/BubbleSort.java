package com.gugu.sort;

/**
 * @author gugu
 * @Classname BubbleSort
 * @Description 冒泡排序
 * @Date 2020/6/15 18:56
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,5,2,9};
        // 冒泡
        BubbleSort0(arr);
        MyPrint.print(arr);
        BubbleSort1(arr);
    }
    
    public static void BubbleSort0(int[] arr) {
        int temp; //临时变量

        for (int i = 0, n = arr.length; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        MyPrint.print(arr);
    }

    public static void BubbleSort1(int[] arr) {
        int temp; //临时变量
        boolean flag; //交换标志

        for (int i = 0, n = arr.length; i < n-1; i++) {
            flag = false;
            for (int j = n-1; j > i; j--) {
                if (arr[j] < arr[j-1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!flag){
                break;
            }
        }
        MyPrint.print(arr);
    }



}
