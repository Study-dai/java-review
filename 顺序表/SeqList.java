package 顺序表;

public class SeqList {
    private int [] arr=new int [3];
    private  int size=0;
    //size表示当前数组有效元素有多少个

    //打印顺序表
    public void display(){
        System.out.print("[");
        for (int i = 0; i <size; i++) {
            System.out.print(this.arr[i]);
            if(i!=size-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    //在pos位置新增元素
    public void add (int pos,int data){
       //pos位置无效
        if(pos<0||pos>size){
            return;
        }
        if(pos>=size){
            realloc();
        }
        if(pos==size){
            this.arr[pos]=data;
            this.size++;
            return;
        }
        for (int i = size; i >pos ; i--) {
            this.arr[i]=this.arr[i+1];
        }
        this.arr[pos]=data;
        this.size++;
    }
    //扩容
    private void realloc(){
        int [] newArr=new int[this.arr.length*2];
        for (int i = 0; i <this.arr.length ; i++) {
            newArr[i]=this.arr[i];
        }
        this.arr=newArr;
    }


    //判断是否包某个元素
    public boolean contains(int tofind){
        for (int i = 0; i < this.size; i++) {
            if(this.arr[i]==tofind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public  int search(int tofind){
        for (int i = 0; i <this.size ; i++) {
            if(this.arr[i]==tofind){
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        return this.arr[pos];
    }
    //给pos位置的元素设置成value
    public int setPos(int pos,int value){
       return this.arr[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        //先由search函数找到toremove元素的下标
        int pos=search(toRemove);
        if(pos==-1){
            return;
        }
        if(pos==this.size){
            this.size--;
            return;
        }
        for (int i = pos; i <this.size; i++) {
            this.arr[i]=this.arr[i+1];
        }
        this.size--;
    }
    //获取顺序表的长度
    public int size(){
        return this.size;
    }
    //清空顺序表
    public void clear(){
        this.size=0;
    }
}
