package 面向对象编程.动态绑定;

public class Bird3 extends Animal3{
    public Bird3(String name) {
        super(name);
    }
    public void eat(String food) {
        System.out.println("我是一只小鸟");
        System.out.println(this.name + "正在吃" + food);
    }
}
