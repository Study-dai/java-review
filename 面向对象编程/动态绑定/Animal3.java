package 面向对象编程.动态绑定;

public class Animal3 {
    protected String name;

    public Animal3(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println("我是一只小动物");
        System.out.println(this.name + "正在吃" + food);
    }
}
