package 面向对象编程.接口;

public class Test {
    public static void main(String[] args) {
        IShape shape=new Cycle();
        shape.draw();
    }
}
/*
使用interface定义一个接口
接口中的方法一定是抽象方法，因此可以省略abstract
接口中的方法一定是public，因此可以省略public
Cycle 使用implements继承接口，此时表达的含义不在是扩展，而是实现
在调用接口的时候同样可以创建一个接口的引用，对应到一个子类的实例
接口不能单独被实例化
extends Vs  implements
扩展指的是当前已经有一定的功能了，进一步扩充
实现指的是当前啥都没有，需要从头构造出来
接口中只能包含抽象方法，对于字段来说，接口中只能包含静态常量final static
 */
