package 类和对象;
//代码块
/*
普通代码块：定义在方法中的代码块
构造代码块：定义在类中的代码块（不加修饰符），也叫实例代码块，构造代码块一般用于初始换实例成员变量
静态代码块：使用static定义的代码块，一般用于初始化实例成员变量

 */
public class main13 {
    public static void main(String[] args) {
        {//直接使用{}定义 普通方法块
            int x=10;
            System.out.println("x1 = " +x);
        }
        int x=100;
        System.out.println("x1 = " +x);

        Person13 person13=new Person13();
        person13.show();

        Person13 P2=new Person13();
    }
}

class Person13{
    private String name;//实例成员变量
    private int age;
    private String sex;
    private static int count=0;//静态成员变量   由类共享  储存在方法区
    public Person13() {
        System.out.println("我是普通代码块");
    }
    //实例代码块
    {
        this.age=12;
        this.name="dao";
        this.sex="man";
        System.out.println("我是实例代码块");
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }

    //实例代码块
    static{
      count =10;
        System.out.println("我是静态代码块");
    }
}
/*
x1 = 10
x1 = 100
我是实例代码块
我是普通代码块
name: dao age: 12 sex: man
 */
//注意事项：实例代码块优先于构造函数执行
//静态代码块不管生成多少个对象，只会执行一次，且最先执行
//静态代码块执行完成之后，实例代码块执行，然后使构造方法执行