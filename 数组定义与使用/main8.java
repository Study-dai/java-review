package 数组定义与使用;
//查找数组中指定的元素（二分查找）
//针对有序数组，可以使用高效率的二分查找的方法
public class main8 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(binarysearch(arr,6));
    }
    public static int binarysearch(int [] arr,int tofind){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(tofind<arr[mid]){
                right=mid-1;
            }else if(tofind>arr[mid]){
                left=mid+1;
            }else{
                return mid;
                //找到返回下标
            }
        }
        return -1;
    }
}
