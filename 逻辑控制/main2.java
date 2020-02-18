package 输入输出;

import java.util.Scanner;

//使用 Scanner 循环读取 N 个数字
public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum = 0.0;
        int num = 0;
        while (sc.hasNextDouble()) {
            double tmp = sc.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("sum="+sum);
        System.out.println("avg="+sum/num);
        sc.close();
    }

}
/*
结果：
10
40.5
50.5
^z
sum=101.0
avg=33.666666666666664

 */