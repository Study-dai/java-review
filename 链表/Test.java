package 链表;

public class Test {
    public static void main(String[] args) {
        TestAddFirst();
        TestAddlast();
        TestAddIndex();
        TestContains();
        Testrem(2);
        TestremoveallKey(2);
        TestClear();
    }
    //头插
    public static void TestAddFirst(){
        LinkedList list=new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.display();
    }
    //尾插
    public static void TestAddlast(){
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.display();
    }
    //中间插入
    public static void TestAddIndex(){
        LinkedList list=new LinkedList();
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.display();
        list.addIndex(1,10);
        list.display();
    }
    //测试contains方法
    public static void TestContains(){
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        System.out.println(list.contains(3));
    }
    //删除链表中的元素
    public static void Testrem(int toRemove){
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(2);
        list.display();
        list.remove(toRemove);
        list.display();
    }
    //removeallkey
    public static void TestremoveallKey(int key){
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(2);
        list.display();
        list.removeAllkey(key);
        list.display();
    }
    public static void TestClear(){
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(2);
        list.display();
        list.Clear();
        list.display();
    }

}
