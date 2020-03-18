package 集合框架;

public class myArrayList {
    private Object[]array;
    private int size;

    public void add(Object o){}


}

class Test{
    public static void main(String[] args) {
        myArrayList books=new myArrayList();
        for (int i = 0; i <10 ; i++) {
            books.add(new Book());
        }
        myArrayList people =new myArrayList();
        for (int i = 0; i <10; i++) {
            people.add(new Persion());
        }
    }
}


