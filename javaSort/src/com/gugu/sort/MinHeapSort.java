package com.gugu.sort;

/**
 * @author gugu
 * @Classname MinHeapSort
 * @Description 小頂堆排序
 * @Date 2020/6/16 10:25
 */
public class MinHeapSort {
    public static void main(String[] args) {
        int arr[] = new int[]{1,7,5,2,9,6,3};
        int n = arr.length;
        minHeapSort(arr,n);
        MyPrint.print(arr);
    }

    private static void minHeapSort(int[] arr, int n) {
        int temp = 0;
        makeMinHeap(arr, n);
        for (int i = n-1; i >= 0 ; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            minHeapFixdown(arr, 0 , i);
        }
    }

    //构建最小堆
    private static void makeMinHeap(int[] arr, int n) {
        for (int i = (n-1)/2; i >= 0 ; i--) {
            minHeapFixdown(arr,i,n);
        }
    }

    //从i节点开始调整,n为节点总数 从0开始计算 i节点的子节点为 2*i+1, 2*i+2
    private static void minHeapFixdown(int[] arr, int i, int n) {
        int j = 2 * i + 1; //子节点
        int temp;
        while (j < n){
            //在左右子节点中寻找最小的
            if (j+1 < n && arr[j+1] < arr[j]){
                j++;
            }
            if (arr[i] <= arr[j]){
                break;
            }
            //较大节点下移
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i = j ;
            j = 2*i + 1;
        }
    }
}
