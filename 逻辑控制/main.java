package 逻辑控制;

public class main {

    public static void main(String[] args) {
        PDJO(121);
        PDZF(12);
        PDyear(1900);
        SwtichCase(3);
        Display(1);
        Display2(10);
        Display3(1);
        He(100);
        He2(100);
        JC(5);
        JC2(5);
        JChe(5);
        JChe2(5);
        Find(100,200,3);
        FindAll(100,200,3);
    }
    //1.判断一个数是奇数还是偶数
    public static void PDJO(int a){
        if(a%2==0){
            System.out.println("是偶数");
        }else{
            System.out.println("是奇数");
        }
    }

    //2、判断一个数是正数还是负数
    public static void PDZF(int num){
        if(num>0){
            System.out.println("正数");
        }else{
            System.out.println("负数");
        }
    }
    // 3、判定某一年份是否是闰年
    public static void PDyear(int year){
        if(year%100==0) {
            if (year % 400 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("非闰年");
            }
        }else{
            if(year%4==0){
                System.out.println("是闰年");
            }else{
                System.out.println("非闰年");
            }
        }
    }
    //4.根据day的值输出日期
    public static void SwtichCase(int day){
        switch (day){//switch 中的值只能是整数、枚举、字符、字符串
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
            case 3:
                System.out.println("三");
                break;
            case 4:
                System.out.println("四");
            case 5:
                System.out.println("五");
                break;
            case 6:
                System.out.println("六");
            case 7:
                System.out.println("七");
                break;
                default:
                    System.out.println("输入有误");
        }
    }
    //5.打印 1 - 10 的数字
    public static void Display(int num){
        while(num<=10){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
    public static void Display2(int num){
        for (int i = 1; i <=num; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void Display3(int num){
        do{
            System.out.print(num+ " ");
            num++;
        }while (num<=10);
    }

    //6、计算1-num的和
    public static int He(int num){
        int n=1;
        int ret=0;
        while(n<=num){
            ret+=n;
            n++;
        }
        System.out.println(ret);
        return ret;
    }
    public static int He2(int num){
        int ret=0;
        for (int i = 1; i <=num; i++) {
            ret+=i;
        }
        System.out.println(ret);
        return ret;
    }
    //7.计算n的阶乘
    public static int JC(int num){
        int n=1;
        int ret=1;
        while(n<=num){
            ret*=n;
            n++;
        }
        System.out.println(ret);
        return ret;
    }
    public static int JC2(int num){
        int ret=1;
        for (int i = 1; i <=num; i++) {
            ret*=i;
        }
        System.out.println(ret);
        return ret;
    }
    //8.计算 1! + 2! + 3! + 4! + 5!
    public static int JChe(int num){
        int ret=0;
        int n=1;
        while(n<=num){
            int tmp=1;
            int cur=1;
            while (tmp<=n){
                cur*=tmp;
                tmp++;
            }
            ret+=cur;
            n++;
        }
        System.out.println(ret);
        return ret;
    }
    public static int JChe2(int num){
        int ret=0;
        for (int i = 1; i <=num; i++) {
            int cur=1;
            for (int j = 1; j <=i; j++) {
                cur*=j;
            }
            ret+=cur;
        }
        System.out.println(ret);
        return ret;
    }
    //9.找到 100 - 200 中第一个 3 的倍数
    public static int Find(int a,int b,int x){
        if(x>b){
            System.out.println("ERROR");
        }
       while(a<b){
           a++;
           if (a % x == 0) {
               break;
           }
       }
        System.out.println(a);
       return a;
    }
    //10.找到 100 - 200 中所有 3 的倍数
    public static int FindAll(int a,int b,int x){
        if(x>b){
            System.out.println("ERROR");
        }
        while(a<b){
            a++;
            if(a%x==0){
                System.out.print(a+" ");
                continue;
            }
            a++;
        }
        System.out.println();
        return a;
    }
}
