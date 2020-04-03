package 包装类;
/*
基本数据类型和
包装类对应
int-Integer byte-Byte short-Short long_Long float-Float
double-Double char-Character boolean_Boolean
 */
public class main {
    public static void main(String[] args) {
        int i=1;
        //自动装箱
        Integer ii=i;
        Integer ij=(Integer)i;
        //自动拆箱
        int j=ii;
        int k=(int)ii;
    }
}
