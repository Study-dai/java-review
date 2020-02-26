package 数组定义与使用;

import java.util.Arrays;

//冒泡排序
public class main11 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 10};
        maopao(arr);
        System.out.println(Arrays.toString(arr));
        //sort(arr);
        //z这是java中内置的高效算法
    }

    public static void maopao(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    //java 中内置的高效排序算法
    public static void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

