package 面向对象编程;
//final关键字
/*
使用final修饰的变量的时候，表示常量（不能被更改）
使用final修饰类的时候，表示类不能被继承
 */
public class final关键字 {
}
final class Animal1{
    public String name;

    public Animal1(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}
//class bird extends Animal1{//编译出错

//}