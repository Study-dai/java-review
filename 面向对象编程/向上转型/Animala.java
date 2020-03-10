package 面向对象编程.向上转型;

public class Animala {
    protected String name;
    public Animala(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println("我是一只小动物");
        System.out.println(this.name + "正在吃" + food);
    }
}