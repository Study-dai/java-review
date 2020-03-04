package 类和对象;
//匿名对象
public class main14 {
    public static void main(String[] args) {
        new Per14("caocao",18).show();
        //并没有创建对象，而是同匿名对象调用方法
    }
}
class Per14{
    private String name;
    private int age;
    public Per14(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void show() {
        System.out.println("name:"+name+" " + "age:"+age);
    }
}
/*
一个类可以产生无数对象，类就是模板，对象就是具体实例
类中定义的属性，大概分为:类属性，对象属性，其中被static所修饰的称为类属性，
static修饰的称为类方法，特点是不依赖于对象，只需要通过类名就可以调用其属性或者方法
静态代码块优先实例代码块，实例代码块优先于构造函数
this表示当前对象的引用
 */