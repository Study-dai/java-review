package 面向对象编程.继承;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat("小黑");
        cat.eat("猫粮");
        Bird bird=new Bird("小鸟");
        bird.fly();
    }
}
/*
protected关键字
对于类的调用者来说，protected修饰的字段和方法是不能访问的
对于类的子类和同一个包的其他类来说，protected修饰的方法是可以访问的
 */
/*
java中对于字段和方法共有四种访问权限控制
private 类内部能访问，类外部不能访问
default：默认权限，类内部能访问，同一个包中的类可以访问，其他类不能访问
protected：类内部能访问，子类和同一个包中的类可以访问，其他类不能访问
public：类内部和类的调用者都能访问
 */