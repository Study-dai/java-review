package 类和对象;
//字段
public class main2 {
    public static void main(String[] args) {
        Ps ps=new Ps();
        System.out.println(ps.name);
        System.out.println(ps.age);
    }
}
class Ps{
    public String name;//字段
    public int age;
}
/*
null
0

使用 . 访问对象的字段
访问既包含 读 也包含 写
对于一个对象的字段如果没有显式设置初始值，那么会被设置一个默认的初始值。
对于各种数字类型, 默认值为 0.
对于 boolean 类型, 默认值为 false.
对于引用类型(String, Array, 以及自定制类), 默认值为 nul
 */