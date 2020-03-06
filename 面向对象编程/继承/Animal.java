package 面向对象编程.继承;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
