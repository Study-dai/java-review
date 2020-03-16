package 链表;

public class LinkedList {
    //先创建头结点，有了头结点剩下的都可以获取到
    private LinkedNode head=null;
    public void display(){
        System.out.print("[");
        for(LinkedNode node=this.head;node!=null;node=node.next){
            System.out.print(node.data);
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
      if(this.head==null){
          this.head=node;
          return;
      }
      node.next=head;
      this.head=node;
      return;
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
        if (this.head == null) {
            this.head=node;
            return;
        }
        LinkedNode cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //往任意位置插入，第一个数据结点为0号下标
    public void addIndex(int index,int elem){
       LinkedNode node=new LinkedNode(elem);
       int len=size();
       if(index<0||index>len){
           return;
       }
       if(index==0){
           addFirst(elem);
           return;
       }
       if(index==len){
           addLast(elem);
           return;
       }
        LinkedNode prev=getIndexpos(index-1);
       prev.next=node.next;
       prev.next=node;
    }
    //根据结点查找前一个元素的位置
    private  LinkedNode getIndexpos(int index){
        LinkedNode prev=new LinkedNode();
        for (int i = 0; i <index; i++) {
            prev=prev.next;
        }
        return prev;
    }

    //查找关键字key是否在单链表中
    public boolean contains(int key){
        for(LinkedNode cur=this.head;cur!=null;cur=cur.next){
            if(cur.data==key){
                return true;
            }
        }
        return false;
    }
    //删除第一次出现关键字为key的结点
    //删除元素的核心是要找到要删除元素的前一个结点
    public void remove(int toRemove){
       if(head==null){
           return;
       }
       if(head.data==toRemove){
           this.head=this.head.next;
           return;
       }
       LinkedNode prev=SearchPrev(toRemove);
       LinkedNode cur=prev.next;
       prev.next=cur.next;
    }

    //根据data找前一个结点
    public LinkedNode SearchPrev(int toRemove){
        LinkedNode prev=this.head;
        while(prev.next!=null){
            if(prev.next.data==toRemove){
                return prev;
            }
            prev=prev.next;
        }
        return null;
    }
    //删除所有值为key的结点
    public void removeAllkey(int key){
        if(head==null){
            return;
        }
        LinkedNode prev=this.head;
        LinkedNode cur=head.next;
        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=prev.next;
            }else{
                prev=cur;
                cur=cur.next;
                if(this.head.data==key){
                    this.head=this.head.next;
                }
            }
        }
    }
    //清除链表操作
    public void Clear(){
        this.head=null;
    }
}
