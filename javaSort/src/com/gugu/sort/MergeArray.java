package com.gugu.sort;

/**
 * @author gugu
 * @Classname MemeryArray
 * @Description 归并排序
 * @Date 2020/6/16 8:52
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7};
        int[] arr2 = new int[]{2,3,6,9};
        int[] arr = new int[arr1.length + arr2.length];
        int m = arr1.length;
        int n = arr2.length;
        mergeArray(arr1, m, arr2, n, arr);
        MyPrint.print(arr);
    }

    private static void mergeArray(int[] arr1, int m, int[] arr2, int n, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < m && j < n){
            if (arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }else {
                arr[k++] = arr2[j++];
            }
        }
        while (i<m){
            arr[k++] = arr1[i++];
        }
        while (j<n){
            arr[k++] = arr2[j++];
        }
    }
}
