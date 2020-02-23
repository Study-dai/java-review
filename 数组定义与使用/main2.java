package 数组定义与使用;
//数组作为方法的返回值
//写一个方法将数组中的每个元素*2
public class main2 {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        transfrom(arr);
        printArray(arr);

        int [] output=transfrom2(arr);
        printArray(output);
    }
    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void transfrom(int []arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*2;
        }
    }
    //不改变原来数组，返回一个新的数组
    public static int [] transfrom2(int [] arr) {
    int ret[] =new int [arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ret[i]=arr[i]*2;
        }
        return ret;
    }
}
