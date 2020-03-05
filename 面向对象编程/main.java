package 面向对象编程;
/*
 包是组织的一种形式
 使用包的主要目的是保证类的唯一性（相同的类名可以放在不同的包中，就不会产生冲突）
 */
public class main {
    public static void main(String[] args) {
    java.util.Date date= new java.util.Date();
    //得到一个毫秒级别的时间戳
        System.out.println(date.getTime());
    }
}
/*
如果需要使用其他类，可以使用import java.util*
 */
/*
静态导入   使用import static 可以导入包中静态的方法和字段
import static java.util.lang.system.*
public class test{
        public static void main(String [] args){
        out.println("hello");
        }
}
 */