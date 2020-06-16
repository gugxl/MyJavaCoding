package com.gugu.sort;

import java.util.LinkedList;

/**
 * @author gugu
 * @Classname BucketSort
 * @Description 桶排序
 * @Date 2020/6/16 14:22
 */
public class BucketSort {
    public static void main(String[] args) {
        Double[] arr = new Double[]{0.3,0.5,0.7,0.2};
        bucketSort(arr);
        MyPrint.print(arr);
    }

    private static void bucketSort(Double[] arr) {
        int n = arr.length;
        // 创建链表（桶）集合并初始化，集合中的链表用于存放相应的元素
        int bucketNum  = 10;// 桶数
        LinkedList<LinkedList<Double>> buckets = new LinkedList<LinkedList<Double>>();
        for (int i = 0; i < bucketNum; i++) {
            LinkedList<Double> bucket = new LinkedList<>();
            buckets.add(bucket);
        }
        // 把元素放进相应的桶中
        for (int i = 0; i < n; i++) {
            int index = (int) (arr[i] * bucketNum);
            buckets.get(index).add(arr[i]);
        }
        //对每个桶中的元素排序，并放进a中
        int index = 0;
        for (LinkedList<Double> linkedList :buckets) {
            int size = linkedList.size();
            if (size == 0){
                continue;
            }
            //把LinkedList<Double>转化为Double[]的原因是，之前已经实现了对数组进行排序的算法
            Double[] temp = new Double[size];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = linkedList.get(i);
            }
            // 利用插入排序对temp排序
            InsertSort.insertSort(temp);
            for (int i = 0; i < temp.length; i++) {
                arr[index] = temp[i];
                index++;
            }
        }
    }
}
