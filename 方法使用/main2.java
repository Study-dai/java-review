package 方法使用;
//使用方法计算1! + 2! + 3! + 4! + 5!  避免双重循环
public class main2 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=5; i++) {
            sum+=JSJC(i);
        }
        System.out.println(sum);
    }
    public static int JSJC(int n){
      int ret=1;
        for (int i = 1; i <=n; i++) {
            ret*=i;
        }
        return ret;
    }
}
/*
153
 */