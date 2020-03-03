package 类和对象;
//getter和setter方法
//当我们使用private来修饰字段的时候，就无法直接使用这个字段了
//如果要获取或者修改这个私有属性，就需要使用getter和setter方法
class Man{
    private String name;//实例成员变量
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public  void show(){
        System.out.println("name: "+name+" age: "+age);
    }
}
public class main9 {
    public static void main(String[] args) {
        Man man=new Man();
        man.setName("caocao");
        String name=man.getName();
        System.out.println(name);
        man.show();
    }
}
/*
caocao
name: caocao age: 0
 */
/*
getName即为Getter方法，表示获取这个成员的值
setName即为Setter方法，表示设置这个成员的值
当set方法的形参名字和类中的成员属性名字一样的时候，如果不能使用this，相当于自己赋值.this表示当前实例的引用
不是所有的字段都一定要提供setter/getter方法，而是要根据实际情况决定提供那种方法

简单来说，就是通过public方法，使private的属性可以被实例化对象修改或者获取。
 */
//字段和属性的区别
//通常将类的数据成员称为字段，如果该字段同时提供了getter和setter方法，那么我们也可以将他称为属性。