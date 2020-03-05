package 面向对象编程;


//访问权限控制
//如果某个成员不包含public和private关键字，此时这个成员可以在包内部的其他类使用，但是不能再包外部的类使用
public class main2 {
    public static void main(String[] args) {
        Demo demo=new Demo();
        System.out.println(demo.value);
    }
}
class Demo{
    int value=0;
}