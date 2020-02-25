package 数组定义与使用;
//求数组中元素的平均值
public class main6 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(avg(arr));
    }
    public static double avg(int[] arr){
        int sum=0;
        for (int x: arr) {
            sum+=x;
        }
        return (double)sum/(double)arr.length;
    }
}
