package 面向对象编程.接口使用实例;
//接口间的继承
//接口可以继承一个接口，达到复用的效果使用extends关键字
interface  IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
//两栖动物，能跑能游泳
interface  IAmphibious extends IRunning,ISwimming{

}
class Frog implements  IAmphibious{
    @Override
    public void run() {
    }
    @Override
    public void swim() {
    }
}

public class main {
}
/*
抽象类和接口都是java中多态的常见使用形式，要认清两者的区别。
核心区别：
抽象类中可以包含普通方法和普通字段，这样的普通方法和字段可以被子类直接使用
而接口中不能包含普通方法，子类必须重写所有的抽象方法。
 */