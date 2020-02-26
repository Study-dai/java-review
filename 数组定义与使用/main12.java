package 数组定义与使用;

import java.util.Arrays;

//数组逆序
public class main12 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int [] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
    }
}
/*
[4, 3, 2, 1]
 */