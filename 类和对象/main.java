package 类和对象;
class Person{
    public int age;//成员属性  实例变量
    public String name;
    public String sex;
    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public  void sleep(){
        System.out.println("睡觉");
    }
}
public class main {
    public static void main(String[] args) {
        Person person=new Person();//通过new实例化对象
        person.eat();
        person.sleep();
        //产生对象   实例化对象
        Person person1=new Person();
        Person person2=new Person();
    }
}
/*
类就是一类对象的统称，对象就是一个类的实例化
一个类可以实例化无数个对象
类相当于一个模板，对象是由模板产生的，一个类，可以产生无数个对象
声明一个类就是创建一个新的数据类型，而类在java中属于引用类型，java中采用关键字class来声明类

类中的元素称为：成员属性 类中的函数称为：成员方法。
类的实例化
类只是一个模型一样的东西，限定了类有哪些成员，定义出一个类并没有分配实际的内存空间来存储它
一个类可以实例化出多个对象，实例化出的对象，占用实际的物理空间，存储成员变量。
注意：只有实例化出的对象才能占用实际的存储数据，占用物理空间。
 */
/*
注意事项：
new关键字用于创建一个对象的实例
使用  . 来访问对象中的属性和方法
同一个类可以创建多个实例

类的成员可以包含以下：字段、方法、代码块、内部类和接口
 */