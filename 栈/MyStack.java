package 栈;
/*
栈是一种特殊的线性表，其只允许在固定一段进行插入和删除元素操作
进行插入和删除的一端称为栈顶，另一端称为栈底，栈中的元素先进后出。
压栈：栈的插入操作叫压栈，入数据在栈顶。尾插
出栈：栈的删除操作叫出栈，出数据在栈顶。头删

实现方式有两种：
1.利用顺序表实现  即使用尾插+尾删
2.利用链表实现，头尾都行
 */
//相对来说，顺序表实现简单一点。
public class MyStack {
    //先不考虑扩容问题
    private int [] array=new int [100];
    private int size=0;
    //压栈
    public void push(int v){
        array[size++]=v;
    }
    //返回栈顶元素，并删除它
    public int pop(){
        return array[--size];
    }
    //返回栈顶元素,但是不删除
    public int peek(){
        return array[size-1];
    }
    public int size(){
        return size;
    }
}
class Test{
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        //返回栈顶元素并删除
        System.out.println(stack.pop());
        //返回栈顶元素不删除
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}