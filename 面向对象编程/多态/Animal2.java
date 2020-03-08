package 面向对象编程.多态;

public class Animal2 {
    public String name;

    public Animal2(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
