package 数组定义与使用;

import java.util.Arrays;

public class main3 {
    //数组拷贝
    public static void main(String[] args) {
        int []arr={1,2,3};
        int [] newarr= Arrays.copyOf(arr,arr.length);
        System.out.println("newArr:"+Arrays.toString(newarr));
        //注意事项: 相比于 newArr = arr 这样的赋值, copyOf 是将数组进行了 深拷贝, 即又创建了一个数组对象, 拷贝原有
        //数组中的所有元素到新数组中. 因此, 修改原数组, 不会影响到新数组.
        arr[0]=10;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newarr));
    }
}
/*
执行结果：
newArr:[1, 2, 3]
arr: [10, 2, 3]
newArr: [1, 2, 3]
 */