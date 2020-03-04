package 类和对象;
//构造方法
//构造方法是一种特殊的方法，使用关键字new 实例化对象的时候会被自动调用，用于完成初始化操作
/*
new 执行过程
为对象分配内存空间
调用对象的构造方法
语法规则
如果类中没有提供任何构造函数，那么编译器会默认生成一个不带有参数的构造函数
若类中定义了构造方法，则默认的无参构造将不再生成
构造方法支持重载，规则和普通方法的重载一致
 */
public class main10 {
    public static void main(String[] args) {
        MAN man=new MAN();//调用不带参数的构造方法 如果程序没有会自动生成不带参数构造方法并自动调用
        man.show();
        MAN man1=new MAN("d",32,"男");
        man1.show();
    }
}
class MAN{
    private String name;
    private int age;
    private String sex;
    //默认构造函数  构造对象
    public MAN(){
        //注意此处方法名字必须与类名相同
        //构造方法没有返回值类型声明
        //每个类中一定存在至少一个构造方法（没有回自动生成）
        this.name = "dzy";
        this.age = 10;
        this.sex = "男";
    }

    //带有三个参数的构造方法
    public MAN(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}
/*
name: dzy age: 10 sex: 男
name: d age: 32 sex: 男

 */