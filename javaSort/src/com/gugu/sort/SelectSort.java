package com.gugu.sort;

/**
 * @author gugu
 * @Classname BubbleSort
 * @Description 选择排序
 * @Date 2020/6/15 18:56
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,5,2,9};
        SelectSort(arr, arr.length);
        MyPrint.print(arr);
    }
    
    public static void SelectSort(int[] arr, int length) {
        for (int i = 0 ; i < length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // 如果不相同进行交换
            if ( minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    }



}
