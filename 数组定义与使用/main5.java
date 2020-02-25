package 数组定义与使用;
//找出数组中最大的元素
public class main5 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(findmax(arr));
    }
    public static int  findmax(int []arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
