package 类和对象;
//字段就地初始化
//很多时候我们不希望字段使用默认值, 而是需要我们显式设定初值.
public class main3 {
    public static void main(String[] args) {
        Pers p1=new Pers();
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}
class Pers {
    public String name = "张三";
    public int age = 18;
}
/*
张三
18
 */