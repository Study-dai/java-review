package 泛型;

import java.util.HashMap;
import java.util.Map;

public class demoMap {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        //求长度
        System.out.println(map.size());
        //判断是否是空
        System.out.println(map.isEmpty());
        //根据K查找V
        System.out.println(map.get("作者"));
        //根据K查找v,没有用默认值代替
        System.out.println(map.getOrDefault("作者", "匿名"));
        //判断是否包含key
        System.out.println(map.containsKey("作者"));
        //判断是否包含value
        System.out.println(map.containsValue("匿名"));
        //将指定的key-value放入map中
        map.put("作者", "鲁迅");
        map.put("标题", "狂人日记");
        map.put("发表时间", "1918年");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        for (Map.Entry<String, String> entry :map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
