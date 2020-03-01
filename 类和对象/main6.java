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
/*
注意事项：
静态方法和实例无关，而是和类相关，因此导致两个情况：
静态方法不能直接使用费非静态数据成员或调用非静态方法
（非静态数据成员和方法都是和实例相关的）
this和super两个关键字不能再静态上下文中使用（this是当前实例的引用，super是当前实例父类实例的引用，也是和当前实例相关）

main方法是静态方法。
 */