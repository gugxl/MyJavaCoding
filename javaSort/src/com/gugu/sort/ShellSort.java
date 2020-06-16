package com.gugu.sort;

/**
 * @author gugu
 * @Classname ShellSort
 * @Description TODO
 * @Date 2020/6/16 8:33
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,5,2,9};
        shellSort(arr, arr.length);
        MyPrint.print(arr);
    }

    private static void shellSort(int[] arr, int length) {
        int temp;
        int incre = length;
        while (true){
            incre = incre / 2;
            for (int i = 0; i < incre; i++) { //根据增量分为若干子序列
                for (int j = i+incre ; j < length; j += incre) {
                    for (int k = j; k > i ; k -= incre) {
                        if (arr[k] < arr[k - incre]){
                            temp = arr[k-incre];
                            arr[k-incre] = arr[k];
                            arr[k] = temp;

                        }else {
                            break;
                        }
                    }
                }
            }
            if (incre ==1){
                break;
            }
        }
    }
}
