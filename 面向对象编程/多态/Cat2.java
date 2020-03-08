package 面向对象编程.多态;

public class Cat2 extends Animal2{
    public Cat2(String name) {
        super(name);
    }
    public void run(){
        System.out.println(this.name+"正在跑");
    }
}
