public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7,8};
        int ans = BinarySearch(arr,8);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start =0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2; // here we are using this instead of (start+ end)/2 to not exceed the int data type
            if(target< arr[mid]){
                end = mid-1;
            } else if (target> arr[mid]) {
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}