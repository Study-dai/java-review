package 面向对象编程.抽象类;
/*
在打印图形的例子中，我们发现，父类Shape中的draw方法，并没有什么实际工作，
主要的绘制图形都是由Shape的各种子类的draw方法，来完成，像这种没有实际工作的方法
我们可以把它设计成一个抽象方法，包含抽象方法的类我们称为抽象类。
 */
abstract class Shape {
    abstract public void draw();
}
/*
在draw方法前加上abstract方法，表示一个抽象方法，同时抽象方法没有方法体{}；不能执行具体的任务
对于包含抽象方法的类，必须加上abstract关键字表示这是一个抽象类。

注意事项：
1）抽象类不能被实例化
Shape shape =new Shape();
Error:(30, 23) java: Shape是抽象的; 无法实例化
2)抽象方法不能是private的
abstract class  Shape{
   abstract private void draw();
}
编译出错
Error:(4, 27) java: 非法的修饰符组合: abstract和private
因为抽象类创建出来的抽象方法就是要被外部使用的，设置成私有的就不能被调用

3）抽象类中可以包含其他非抽象方法，也可以包含字段，这个非抽象方法和普通方法的
规则都是一样的可以被重写也可以被子类调用
abstract  class Shape{
    abstract public void draw();

    void func(){
    System.out.Println("func");
    }
    class Rect extend Shape{

    }
    public class Test{
    public static void main(String[] args) {
    Shape shape = new Rect();
    shape.func();
    }
}
抽象类的作用：
抽象类存在的最大意义就是为了被继承
抽象类本身不能被实例化，要想使用，只能创建该抽象类的子类，然后让子类
重写抽象类中的方法。（虽然普通的方法也可以被实现继承重写等等）
但是使用抽象类相当于多了一重编译器校验
使用抽象类的场景就如同打印图形的代码，实际工作不应该由父类完成，而是由
子类完成，那么如果不小心误用成父类，使用普通编译器是不会报错的，但是父类是抽象类
在实例化的时候会提示错误。尽早发现问题。
 */