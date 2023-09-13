public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[]  arr = {9,8,7,2,1};
        int ans = BinarySearch(arr,2);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid= start + (end- start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start = mid+1;
                } else if (arr[mid]>target) {
                    end = mid -1;
                }
            } else {
                if(arr[mid]>target){
                    start = mid+1;
                } else if (arr[mid]<target){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
