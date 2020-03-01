package 类和对象;

public class main7 {
    public static void main(String[] args) {
        //产生对象 实例化对象
        person p=new person();//p为对象的引用
        System.out.println(p.age);//默认为0
        System.out.println(p.name);//默认为null
        System.out.println(p.count);

        //正确访问方式：
        System.out.println(person.count);
        System.out.println(person.COUNT);
        person.staticTest();
        //总结：所有被static修饰的方法或属性，全部不依赖于对象
        p.eat();
        p.sleep();
    }
}
class person{
    public int age;//实例变量 存放在对象内
    public String name;//实例变量
    public String sex;//实例变量

    public static int count;//静态变量，也叫类变量，编译的时候已经产生，属于类本身，而且只有一份，存放在方法区

    public final int size=10;
    //被final修饰的叫常量，也属于对象，被final修饰之后，后面就不能再更改。

    public static final int COUNT=99;
    //静态的常量，属于类本身，只有一份，被final修饰，后序不能更改

    //实例成员函数
    public void eat(){
        int a=10;//局部变量
        System.out.println("eat()!");
    }
    //静态成员函数
    public void sleep(){
        System.out.println("sleep()!");
    }
    //静态成员函数
    public static void staticTest(){
        //不能访问非静态成员
        //sex="man";error
        System.out.println("staticTest()!");
    }
}