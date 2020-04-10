package 泛型;


/*

顺序表可以保存int类型的变量，如果需要保存指向Person类型对象的引用
顺序表，就需要把顺序表元素类型定义成Object类型，这样Object的类型引用可以
指向Person类型的对象户或者指向其他类型的对象。

泛型是为了解决某些容器，算法等代码的通用性而引入的，并且能在编译期间做类型检查。
泛型利用的是Object，并且父类的引用可以指向子类对象的特定二工作的。
泛型是一种编译期的机制，即myArrayLIst<Person>是一种机制，在运行期间是一个类型。
泛型的标志就是尖括号<>.

 */
public class myArrayList {
    private Object[]array;
    private int size;

    public void add(Object o){}

}

class Test{
    public static void main(String[] args) {
        myArrayList books=new myArrayList();
        for (int i = 0; i <10 ; i++) {
           books.add(new Book("java编程","dai"));
        }
        myArrayList people =new myArrayList();
        for (int i = 0; i <10; i++) {
            people.add(new Person("dai"));
        }
        myArrayList bks=new myArrayList();
        bks.add(new Book("java","zhao"));

        //Person person=(Person) bks.get(0);
    }
}


