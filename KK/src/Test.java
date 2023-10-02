public class Test {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        boolean ans = BinarySearch(arr,0);
        System.out.println(ans);
    }
    static boolean BinarySearch(int[] arr,int target){
        if(target == 0){
            int count=0;
            int start=0;
            int end= arr.length-1;
            while(start<=end){
                int mid= start + (end-start)/2;
                if(arr[mid]==target){
                    count++;
                }
                if(arr[mid]<target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }

            }
            if(count>1){
                return true;
            }
        }
        return false;
    }
}
