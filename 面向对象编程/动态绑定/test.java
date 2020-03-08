package 面向对象编程.动态绑定;

public class test {
    public static void main(String[] args) {
        Animal3  animal1=new Animal3("yuan园");
        animal1.eat("g谷子");
        Animal3 animal3=new Bird3("扁扁");
        animal3.eat("谷子");
    }
}
/*
我是一只小动物
yuan园正在吃g谷子
我是一只小鸟
扁扁正在吃谷子
 */
/*
此时发现：
animal1和animal3都是Animal类型的引用，但是animal指向Animal类型的实例，animal2指向Bird的实例
针对animal1和animal2 分别调用eat方法，发现animal2 调用了子类的方法
animal1 调用了父类的方法。

针对eat方法来说
子类实现父类的同名方法，并且参数的类型和个数完全相同，这种情况成为重写。
重写和重载完全不一样
普通方法可以重写，static修饰的方法不能重写
重写中子类的方法的访问权限不能低于父类中方法的访问权限。
另外针对重写的方法，可以使用@Override注解来显式指定
 */