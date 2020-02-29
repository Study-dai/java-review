package 类和对象;
//static 关键字修饰属性
//一旦某个属性被static修饰，那么这个属性就与对象无关，所有的类共享，不属于对象。
/*
1、修饰属性:Java静态属性和类相关, 和具体的实例无关. 换句话说, 同一个类的不同实例共用同一个静态属性
2、修饰方法
3、代码块
4、修饰类
 */
public class main5 {
    public static void main(String[] args) {
            Demo d1=new Demo();
            d1.a++;
            Demo.count++;
        System.out.println(d1.a);
        System.out.println(Demo.count);
        System.out.println("===================");
        Demo d2=new Demo();
        d2.a++;
        Demo.count++;
        System.out.println(d2.a);
        System.out.println(Demo.count);
    }
}
class Demo{
    public int a;
    public static int count;//count被static修饰，所有类共享，且不属于对象，访问方式为 类名.属性
}
/*
1
1
===================
1
2
 */