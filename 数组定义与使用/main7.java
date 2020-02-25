package 数组定义与使用;
//查找数组中指定的元素（顺序查找）
public class main7 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        System.out.println(find(arr,5));
    }
    public static int find(int [] arr, int tofinnd){
        for (int i = 0; i <arr.length; i++) {
            if(tofinnd==arr[i]){
                return arr[i];
            }
        }
        return -1;//表示没找到
    }
}
