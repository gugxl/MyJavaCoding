package com.gugu.sort;

/**
 * @author gugu
 * @Classname CountingSort
 * @Description 计数排序
 * @Date 2020/6/16 10:44
 */
public class CountingSort {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{7,5,2,1,7,5,2,9};
        countingSort(arr, 9);
        MyPrint.print(arr);
    }

    private static void countingSort(int[] arr, int range) throws Exception {
        if (range <= 0){
            throw new Exception("最大值范围大于0");
        }
        int[] countArray  = new int[range+1];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value < 0 || value > range){
                throw new Exception("value范围不正确");
            }
            countArray[value] += 1;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i >= 0 ; i--) {
            int value = arr[i];
            int position = countArray[value] - 1;
            temp[position] = value;
            countArray[value] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
