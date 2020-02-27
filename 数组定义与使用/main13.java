package 数组定义与使用;

import java.util.Arrays;

//给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
//设定两个下标分别指向第一个元素和最后一个元素.
//用前一个下标从左往右找到第一个奇数, 用后一个下标从右往左找到第一个偶数, 然后交换两个位置的元素.
//依次循环即可
public class main13 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        transfrom(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transfrom(int [] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right&&arr[left]%2==0){
                left++;
            }
            while(left<right&&arr[right]%2!=0){
                right--;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
    }
}
