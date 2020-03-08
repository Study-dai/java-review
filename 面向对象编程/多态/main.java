package 面向对象编程.多态;
//方法返回
public class main {
    public static void main(String[] args) {
        Animal2 animal2=findmyanimal();
    }
    public static Animal2 findmyanimal(){
        Bird2 bird2=new Bird2("园园");
        return  bird2;
    }
}
/*
此时方法findmyanimal返回的是一个Animal类型的引用，但是实际上对应到Bird的实例
 */