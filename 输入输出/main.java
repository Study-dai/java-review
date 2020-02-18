package 输入输出;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("姓名：");
        String name=scanner.nextLine();//读取字符串
        System.out.println("年龄：");
        int age=scanner.nextInt();//读取int 类型
        System.out.println("工资：");
        float gz= scanner.nextFloat();//读取float类型
        System.out.println("你的信息：");
        System.out.println("姓名："+name+" 工资："+gz+" 年龄："+age);
        scanner.close();//最后一定要调用关闭方法
    }
}
/*
执行结果：
姓名：
阿萨
年龄：
12
工资：
20.6156
你的信息：
姓名：阿萨 工资：20.6156 年龄：12

 */