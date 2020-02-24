package 数组定义与使用;

import java.util.Arrays;

//实现自己版本的拷贝数组
public class main4 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copyof(arr)));

    }
    public static int [] copyof(int [] arr){
        int [] ret=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ret[i]=arr[i];
        }
        return ret;
    }

}
