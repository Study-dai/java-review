package 类和对象;
//toString 方法
//把对象的属性打印的时候，都自己实现了show方法 其实可以实现toString 方法来解决
public class main12 {
    public static void main(String[] args) {
        Person12 person = new Person12("caocao",19);
        person.show();
        System.out.println(person);
    }
}
class Person12 {
    private String name;
    private int age;
    public Person12(String name,int age) {
        this.age = age;
        this.name = name;
    }
    public void show() {
        System.out.println("name:"+name+" " + "age:"+age);
    }
    //重写Object的toString方法
    @Override
    public String toString() {
        return "Person12{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
注意事项：
toString方法会在println的时候自动调用
将对象转换成字符串这样的操作称为序列化
toString是Object类提供的方法，自己创建的类默认继承自Object方法，
//可以重写ToString方法实现自己版本的转换成字符串的方法
 */