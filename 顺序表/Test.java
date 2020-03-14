package 顺序表;


public class Test {
    public static void main(String[] args) {
        SeqList seqList=new SeqList();
        seqList.display();
        TestAdd();
        Testcontains(20);//判断是否包含20
        TestSearch(10);//判断是否包含10 返回下标为0
        TestGetPos(0);
        Testsetpos(1,2);
        Testremove(20);
        TestSizeandClear();
    }
    //add
    public static void TestAdd(){
        SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        seqList.add(3,40);
        seqList.display();
    }
    //contains
    public static void Testcontains(int tofind){
        SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        System.out.println(seqList.contains(tofind));
    }
    //search
    public static void TestSearch(int tofind){
        SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        System.out.println(seqList.search(tofind));
    }
    //GetPos
    public static void TestGetPos(int pos){
        SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        System.out.println(seqList.getPos(pos));
    }
    //setPos
    public static void Testsetpos(int pos,int value){
        SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        seqList.setPos(pos,value);
        seqList.display();
    }
    //remove
    public static void Testremove(int toremove){
        SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.add(3,20);
        seqList.add(4,30);
        seqList.display();
        seqList.remove(toremove);
        seqList.display();
    }
    //size
    public static void TestSizeandClear(){
        SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.display();
        System.out.println(seqList.size());
        seqList.clear();
        seqList.display();
    }
}
