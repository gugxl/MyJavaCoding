package com.gugu.sort;

import java.security.Key;

/**
 * @author gugu
 * @Classname QuickSort
 * @Description 快排
 * @Date 2020/6/16 8:52
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,5,2,9,6,3};
        int l = 0; // 排序的开始位置
        int r = arr.length-1; //排序的结束位置

        quickSort(arr, l, r);
        MyPrint.print(arr);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l;
        int j = r;
        int key = arr[l]; //选择第一个数为key

        while (i < j){ // 指针相遇，左边全部小于key，右边全部大于key

            while ( i < j && arr[j] >= key){ //从右向左找第一个小于key的值
                j--;
            }
            if ( i < j ){
                arr[i] = arr[j];
                i++;
            }

            while ( i < j && arr[i] < key){//从左向右找第一个大于key的值
                i++;
            }
            if (i < j){
                arr[j] = arr[i];
                j--;
            }
        }

        // i ==j
        arr[i] = key;
        // 对于key左边排序
        quickSort(arr,l,i-1);
        // 对key右边递归
        quickSort(arr,i+1,r);
    }


}
