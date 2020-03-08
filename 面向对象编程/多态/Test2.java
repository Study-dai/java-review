package 面向对象编程.多态;

public class Test2 {
    Bird2 bird2=new Bird2("园园");
    Animal2 bird=new Bird2("园园");
    /*
    一个父类的引用，指向一个子类的实例，这叫多态的向上转型
     向上转型发生的时机：
     直接赋值
     方法传参
     方法返回
     */
    public static void main(String[] args) {
        Bird2 bird2=new Bird2("园园");
        feed(bird2);
    }
    public static void feed(Animal2 animal2){
        animal2.eat("谷子");
    }
    //此时形参animal的类型是Animal（基类），实际上对应到Bird（父类）的实例
}
