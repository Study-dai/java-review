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