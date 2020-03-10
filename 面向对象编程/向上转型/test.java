package 面向对象编程.向上转型;

public class test {
    public static void main(String[] args) {
        Animala animal = new Birda("圆圆");
        animal.eat("谷子");
        ((Birda) animal).fly();
    }
}
/*
在编译过程中，animal的类型是Animal，此时编译器只知道这个类中有一个eat方法，没有fly方法
虽然animal实际引用的是一个Bird对象，但是编译器是以animal的类型来查看有哪些方法的。
编译器检查有哪些方法存在，看的是Animal这个类型
执行时究竟执行父类的方法还是子类的方法，看的是Bird这个类型

super关键字
super表示获取到父类实例的引用，涉及到两种用法
使用super来调用父类构造器
public Bird(String name) {
super(name);
}
使用super来调用父类的普通方法
public class Bird extends Animal {
public Bird(String name) {
super(name);
}
@Override
public void eat(String food) {
// 修改代码, 让子调用父类的接口.
super.eat(food);
System.out.println("我是一只小鸟");
System.out.println(this.name + "正在吃" + food);
}
}
在这个代码中，如果子类的eat方法中直接调用eat方法，不加super关键字，
那么此时认为调用的是子类的方法，加上之后才调用的是父类的eat方法。
 */