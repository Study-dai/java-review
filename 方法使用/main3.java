package 方法使用;
//交换两个整型变量
public class main3 {
    public static void main(String[] args) {
       int arr[] ={1,2};
        swap(arr);
        System.out.println("a="+arr[0]+" b="+arr[1]);
    }
    public static void swap(int [] arr){
        int tmp=arr[0];
        arr[0]=arr[1];
        arr[1]=tmp;
    }
}
/*
a=2 b=1
 */