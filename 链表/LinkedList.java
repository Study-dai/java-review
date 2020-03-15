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
    public void addLast(int elem){
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
    //往任意位置插入，第一个数据结点为0号下标
    public void addIndex(int index,int elem){
        LinkedNode node=new LinkedNode(elem);
        //先对Index 进行一个合法校验
        //这就需要创建一个size方法求长度
        int len=size();
        if(index<0||index>len){
            return;
        }
        //如果是0直接头插
        if(index==0){
            addFirst(elem);
            return;
        }
        //如果等于len直接尾插
        if(index==len){
            addLast(elem);
            return;
        }
        //中间插入，需要找到结点的前一个位置

    }

}
