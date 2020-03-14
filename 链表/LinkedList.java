package 链表;

public class LinkedList {
    //先创建头结点，有了头结点剩下的都可以获取到
    private LinkedNode head=null;
    public void display(){
        System.out.print("[");
        for (LinkedNode node=this.head;node!=null;node=node.next){
            System.out.println(node.data);
            if(node.next!=null){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    //头插法
    public void addFirst(int data){
        //先创建结点
        LinkedNode node=new LinkedNode(data);
        //判断是否是空的
        if(this.head==null){
            this.head=node;
            return;
        }
        node.next=head;
        this.head=node;
    }
    //求链表长度
    public int size(){
        int size=0;
        for (LinkedNode cur=this.head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
    //尾插法
    public void AddLast(int elem){
        LinkedNode node=new LinkedNode(elem);
        if(this.head==null){
            this.head=node;
            return;
        }
        //先定义一个cur来判断是不是最后一个结点
        LinkedNode cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //
}
