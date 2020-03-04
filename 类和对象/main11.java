package 类和对象;
//this关键字
//this 表示当前对象的引用（注意不是当前对象）可以借助this来访问对象的字段和方法
public class main11 {
    public static void main(String[] args) {
        One one=new One();//调用不带参数的构造函数
        one.show();
    }
}
class One{
    private String name;//实例成员变量
    private int age;
    private String sex;
    //默认构造函数 构造对象
    public One() {
//this调用构造函数
        this("dzy", 12, "man");//必须放在第一行进行显示
    }
    //这两个构造函数之间的关系为重载。
    public One(String name,int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show() {
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}
/*
One
在构造函数内部，可以使用this关键字，构造函数是用来构造对象的，对象还没有构造好，就使用this，那么this就不是代表当前对象

 */