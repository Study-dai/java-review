package 面向对象编程.多态;

public class Bird2 extends Animal2{
    public Bird2(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}
