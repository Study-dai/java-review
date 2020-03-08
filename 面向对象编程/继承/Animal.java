package 面向对象编程.继承;
/*
代码中创建的类，主要是为了抽象现实中的一些事物（包含属性和方法）
有的时候客观事物之间就存在一些关联，那么表示成类和对象的时候也会存在一定的关联
设计一个类表示动物

 使用extends指定继承的父类
 java中一个子类只能继承一个父类(单继承)
 子类会继承父类所有的public的字段和方法
 对于父类的private方法，，子类中是无法访问的
 子类的实例中，也包含着父类的实例，可以使用super关键字得到父类实例的引用
 */
public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
