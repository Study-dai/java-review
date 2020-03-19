package 四种引用;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class main {
    public static void main(String[] args) {
        //强引用
        String str="hello";
        str=null;
        //软引用
        SoftReference<String> wname=new SoftReference<>("dai");
        //弱引用
        WeakReference<String> weakReference=new WeakReference<>("hellp");
        //虚引用
        ReferenceQueue<String> queue=new ReferenceQueue<>();
        PhantomReference<String> pr=new PhantomReference<String>(new String("hello"),queue);
    }
}
