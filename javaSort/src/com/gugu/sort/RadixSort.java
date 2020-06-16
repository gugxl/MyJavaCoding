package com.gugu.sort;

import java.util.Arrays;

/**
 * @author gugu
 * @Classname RadixSort
 * @Description 基数排序
 * @Date 2020/6/16 15:04
 */
public class RadixSort  {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,5,2,9};
        MyPrint.print(sort(arr));
    }

    private static int[] sort(int[] sourceArray) {
//        对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int maxDigit = getMaxDigit(arr);
        return radixSort(arr, maxDigit);
    }

    //获取最高位数
    private static int getMaxDigit(int[] arr) {
        int maxValue = getMaxValue(arr);
        return getNumLength(maxValue);
    }

    private static int getNumLength(int num) {
        if (num == 0){
            return 1;
        }
        int length = 0;
        for (long temp = num; temp != 0; temp /= 10) {
            length++ ;
        }
        return  length;
    }


    private static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value:arr) {
            if (maxValue < value){
                maxValue = value;
            }
        }
        return maxValue;
    }
    private static int[] radixSort(int[] arr, int maxDigit) {
        int mod = 10;
        int dev = 1;
        for (int i = 0; i < maxDigit; i++, dev *= 10, mod *= 10) {
        //考虑负数的情况，这里扩展一倍队列数，其中 [0-9]对应负数，[10-19]对应正数 (bucket + 10)
            int[][] counter = new int[mod * 2][0];
            for (int j = 0; j < arr.length; j++) {
                int bucket = ((arr[j] % mod) / dev) + mod;
                counter[bucket] = arrayAppend(counter[bucket], arr[j]);
            }
            int pos = 0;
            for (int[] bucket:counter) {
                for (int value:bucket) {
                    arr[pos++] = value;
                }
            }
        }

        return arr;
    }
    //自动扩容，并保存数据
    private static int[] arrayAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }
}
