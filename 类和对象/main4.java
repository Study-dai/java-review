package 类和对象;
//方法：用于描述一个对象的行为
public class main4 {
    public static void main(String[] args) {
        man man=new man();
        man.show();
        man man1=new man();
        man1.name="xiao";
        man1.age=20;
        man1.show();
    }
}
class man{
    public  int age=18;
    public String name="dai";
    public void show (){
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
}
/*
我叫dai, 今年18岁
我叫xiao, 今年20岁
此处的 show 方法, 表示 Person 这个对象具有一个 "展示自我" 的行为.
这样的 show 方法是和 person 实例相关联的. 如果创建了其他实例, 那么 show 的行为就会发生变化

 方法中还有一种方法叫构造方法
 在实例化对象的时候会被自动调用到的方法，方法名字和类名相同，用于对象的初始化。
 虽然我们之前已经能将属性就地初始化，但是有些时候可能需要进行一些更复杂的初始化逻辑，那么久可以使用构造方法。
 */