package 输入输出;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏
public class main3 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int tmp=random.nextInt(100);
        while(true){
            int num=sc.nextInt();
            if(num>tmp){
                System.out.println("大了");
            }else if(num<tmp){
                System.out.println("小了");
            }else{
                System.out.println("对了");
                break;
            }
        }
        sc.close();
    }
}
