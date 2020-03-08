package 面向对象编程.继承;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}
/*
更复杂的继承关系
针对cat这种类   可能还需要表示更多种类的猫
需要多层继承的方式，就是子类还可以派生出新的子类
但是考虑复杂性，一般要求代码的继承关系不超过三层

 */