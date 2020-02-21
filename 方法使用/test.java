package 方法使用;
//方法重载
/*
有时候需要一个函数同时兼容多种参数的情况，这个时候就需要方法的重载
方法的名字都叫 add. 但是有的 add 是计算 int 相加, 有的是 double 相加; 有的计算两个数字相加, 有的是计算三个数字相加.
同一个方法名字, 提供不同版本的实现, 称为 方法重载
方法重载的规则：
针对同一个类：
方法名称相同
方法参数类型或者方法参数个数不相同
方法的返回值类型不影响重载

当两个方法名字相同，参数也个数和类型也相同，但是返回值不同的时候，不构成重载
 */
public class test {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        add(a,b);

        int c=30;
        add(a,b,c);

        double d=12.7;
        double e=15.45;
        add(d,e);
    }
    public static void add(int x,int y){
        System.out.println(x+y);
    }
    public static void add(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public static double add(double x,double y){
        double ret=x+y;
        System.out.println(ret);
        return ret;
    }
}
