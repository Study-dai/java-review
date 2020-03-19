package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("C");
        list.add("python");
        list.add("java");
        list.add("C++");
        list.add("GO");
        //可以添加重复元素
        list.add("C");
        System.out.println(list);
        //类似数组下标访问方式
        System.out.println(list.get(0));
        System.out.println(list);
        //将0号下标设成计算机基础
        list.set(0,"计算机基础");
        System.out.println(list);
        //截取部分
        List<String> subCourses=list.subList(1,3);
        System.out.println(subCourses);
        //重新构造
        List<String> list2=new ArrayList<>(list);
        System.out.println(list2);

        List<String> list3=new LinkedList<>(list);
        System.out.println(list3);

        //引用转换
        ArrayList<String> list4= (ArrayList<String>) list2;
        System.out.println(list4);
        LinkedList<String> list5 = (LinkedList<String>) list3;
        System.out.println(list5);
    }
}
