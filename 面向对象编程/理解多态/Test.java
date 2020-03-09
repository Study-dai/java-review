package 面向对象编程.理解多态;
/*
当类的调用者在编写drawmap这个方法的时候。参数类型为Shape(父类）
此时在该方法内部并不知道，也不关注当前的shape引用指向的是哪个类型
（哪一个子类）的实例，此时shape这个引用调用show方法可能会有多种不同的表现形式
和shape对应的实例相关，这种行为就叫多态。
 */
public class Test {
    public static void main(String[] args) {
        Shape shape1=new Flower();
        Shape shape2=new Cycle();
        Shape shape3=new Rect();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
    public static void drawMap(Shape shape){
        shape.show();
    }
}
/*
♣
○
□
 */
/*
使用多态的好处
封装是让类的调用者不需要知道类的实现细节
多态能让类的调用者连这个类是什么类型都不必知道，只需要知道对象具有某个方法就行了
因此多态可以理解成封装的更近一步，让类的调用者对类的使用成本进一步降低



 */