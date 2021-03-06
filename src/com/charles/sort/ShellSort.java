package com.charles.sort;

/**希尔排序
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录 “基本有序” 时，再对全体记录进行依次直接插入排序。
 * @author 莫昌廉
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {9, 8, 1, 4, 2, 3, 5, 6, 7, 13, 12, 14, 11, 15, 16, 17, 19, 18, 10};
        PrintArray.print(array);
        shellSort(array);
        PrintArray.print(array);
    }

    public static void shellSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}

