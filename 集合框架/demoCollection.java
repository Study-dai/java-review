package 集合框架;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class demoCollection {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        //求长度
        System.out.println(list.size());
        //判断集合是否是空
        System.out.println(list.isEmpty());
        //将元素放到集合中
         list.add("d");
        list.add("z");
        list.add("y");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        //返回一个装有所有集合中元素的数组
        Object [] arary=list.toArray();
        System.out.println(Arrays.toString(arary));
        for (String s:list) {
            System.out.println(s);
        }
        list.remove("z");
        for (String s:list) {
            System.out.println(s);
        }
        //清除集合中的元素
        list.clear();
        for (String s:list) {
            System.out.println(s);
        }
    }
}
