package 数组定义与使用;
//检查数组有序性
public class main10 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
