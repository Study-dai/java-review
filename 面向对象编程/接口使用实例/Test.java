package 面向对象编程.接口使用实例;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student [] students=new Student[]{
                new Student("张三", 95),
                new Student("李四", 96),
                new Student("王五", 97),
                new Student("赵六", 92),
        };
        Arrays.sort(students);//对数组元素进行排序
        System.out.println(Arrays.toString(students));
    }
}
/*
因为 int 类型可以比较大小，但是String类型不能比较大小。所以会抛出异常
如果要比较大小，可以实现Comparable接口，并且实现其中的compareTo 方法


再次执行：
[[王五:97], [李四:96], [张三:95], [赵六:92]]
 */