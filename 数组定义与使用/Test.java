package 数组定义与使用;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        String newarr= Arrays.toString(arr);
        System.out.println(newarr);
        ToString(arr);
    }
    //实现一个自己版本的数组转字符串
    public static void ToString(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1) {
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
}
/*
[1, 2, 3, 4, 5, 6]
 */