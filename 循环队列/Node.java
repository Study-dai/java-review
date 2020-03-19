package 循环队列;

public class Node {
    //底层采用数组实现
    protected int  [] arr;
    //长度
    protected int size;

    protected int front;//头
    protected int end;//尾
//默认构造
    public Node() {
        this.arr = new int[10];
        this.size = 0;
        this.front = 0;
        this.end = -1;
    }
    //带参数的构造
    public Node(int maxsize) {
        this.arr = new int [maxsize];
        this.size = 0;
        this.front = 0;
        this.end = -1;
    }

}

