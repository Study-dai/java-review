package 类和对象;
//static 修饰方法
/*
如果在任何方法上加上static关键字，此方法称为静态方法。
静态方法属于类，不属于对象。
可以通过类名直接调用静态方法，不需要创建实例化对象。
静态方法可以访问静态数据成员，并且可以更改静态数据成员的值。
 */
public class main6 {
    public static void main(String[] args) {
        TestDemp.chage();//无需创建实例化对象，就可以直接调用。
        System.out.println(TestDemp.count);
    }
}
class TestDemp{
    public int a;
    public static int count;
    public static void chage(){//静态方法，无需创建试了换对象，就可以调用。
        count=100;
      //  a=10; 静态的方法不能访问非静态的数据成员
    }
}
/*
100
 */