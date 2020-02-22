package 方法使用;
/*
方法递归：
一个方法在执行过程中调用自身，就称为“递归”
递归相当于数学上的“数学归纳法”。有一个起始条件，然后又一个递推公式

例如：求N！
起始条件：N=1的时候，N!为1，这个起始条件相当于递归的结束条件
递归公式：求N!，直接不好求，可以把问题转换成N!=>N*（N-1）！
 */
public class test2 {
    public static void main(String[] args) {
        int n=5;
        int ret=DiGui(n);
        System.out.println(ret);
        DIGUI(5);
        System.out.println(add(10));
        System.out.println(sum(1729));
        System.out.println(fib(4));
    }
    public static int DiGui(int n){
        if(n==1){
            return 1;
        }
        return n*DiGui(n-1);
    }
    //加上日志的版本
    public static int DIGUI(int n){
        System.out.println("函数开始，n= "+n);
        if(n==1){
            System.out.println("函数结束，n=1,ret=1");
            return 1;
        }
        int ret=n*DIGUI(n-1);
        System.out.println("函数结束，n= "+n + " ret="+ret);
        return ret;
    }
    /*
函数开始，n= 5
函数开始，n= 4
函数开始，n= 3
函数开始，n= 2
函数开始，n= 1
函数结束，n=1,ret=1
函数结束，n= 2 ret=2
函数结束，n= 3 ret=6
函数结束，n= 4 ret=24
函数结束，n= 5 ret=120
 */
        //递归求1+2+3+。。+10
    public static int add(int n){
        if(n==1){
            return 1;
        }
        return n+add(n-1);
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和. 例如，输入 1729, 则应该返回1+7+2+9，
    //它的和是19
    public static int sum(int n){
        if(n<10){
            return n;
        }
        return n%10+sum(n/10);
    }

    //求斐波那契数列的第n项
    //F(n)=F(n-1)+F(n-2)，n≥3，F(1)=1，F(2)=1。
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

}
