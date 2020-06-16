package com.gugu.sort;

/**
 * @author gugu
 * @Classname InsertSort
 * @Description 插入排序
 * @Date 2020/6/16 0:44
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,5,2,9};
        insertSort(arr, arr.length);
        MyPrint.print(arr);
    }

    public static void insertSort(int[] arr, int length) {
        int temp ;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }/*else{
                    break;
                }*/
            }
        }
    }
    public static void insertSort(Double[] arr) {
        Double temp ;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }/*else{
                    break;
                }*/
            }
        }
    }

}
