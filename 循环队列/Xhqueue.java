package 循环队列;

public class Xhqueue {
    public Xhqueue(int i) {
    }

    //添加数据 从队尾添加
    public void insert(int val){
        Node node=new Node(val);
        if(node.end==node.arr.length-1){
            node.end=-1;
        }
        node.arr[++node.end]=val;
        node.size++;
    }
    //删除元素，从队头删除
    public int remove(){
        Node node =new Node();
        int value=node.arr[node.front++];
        if(node.front==node.arr.length){
            node.front=0;
        }
        node.size--;
        return value;
    }
    //查看数据 从队头查看
    public int peek(){
        Node node=new Node();
        return node.arr[node.front];
    }
    //判断是否满了
    public boolean isfull(){
        Node node=new Node();
        return node.size==node.arr.length;
    }
    //判断是否是空
    public boolean isEmpty(){
        Node node=new Node();
        return node.size==0;
    }

}
class test{
    public static void main(String[] args) {
        Xhqueue xh=new Xhqueue(4);
        xh.insert(10);
        xh.insert(20);
        xh.insert(30);
        xh.insert(40);
        //判断是否满了
        System.out.println(xh.isfull());
        //判断是否为空
        System.out.println(xh.isEmpty());
        //查看队首元素
        System.out.println(xh.peek());
        //出队列，尾部删除一个
        xh.remove();
        System.out.println(xh.isfull());
        System.out.println(xh.peek());
        System.out.println(xh.peek());

        while(!xh.isEmpty()){
            System.out.println(xh.remove()+" ");
        }
        System.out.println();
        xh.insert(23);
        xh.insert(2);
        xh.insert(45);
        xh.insert(1);
        while(!xh.isEmpty()){
            System.out.println(xh.remove()+" ");
        }
    }
}
