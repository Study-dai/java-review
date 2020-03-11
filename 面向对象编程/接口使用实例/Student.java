package 面向对象编程.接口使用实例;

public class Student implements Comparable{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return  "[" + this.name + ":" + this.score + "]";
    }


    @Override
    public int compareTo(Object o) {
        Student s=(Student)o;
        if(this.score>s.score){
            return -1;
        }else if(this.score<s.score){
            return 1;
        }else{
            return 0;
        }
    }
}
/*
在sort方法中会自动调用compareTo方法，compareTo的参数是Object，其实传入的就是Student对象
然后比较当前对象和参数的大小关系，（按照分数来算）
如果当前对象应排在参数对象之前，返回小于0的数字
如果当前对象应排在参数对象之后，返回大于0的数字
如果当前对象和参数对象不分先后，返回0

 */