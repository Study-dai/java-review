package 数组定义与使用;
//感受二分查找的效率
public class main9 {
    static int count=0;
    public static void main(String[] args) {
        int [] arr=makebigarr();
        System.out.println(binarysearch(arr,6));
        System.out.println(count);
    }
    public static int binarysearch(int [] arr,int  tofind){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            count ++;
            int mid=(left+right)/2;
            if(tofind<arr[mid]){
                right=mid-1;
            }else if(tofind>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    public static int [] makebigarr(){
        int [] arr=new int[10000];
        for (int i = 0; i <10000; i++) {
            arr[i]=i;
        }
        return arr;
    }
}
