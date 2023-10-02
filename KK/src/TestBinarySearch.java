public class TestBinarySearch {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7,8};
        int ans = BS(arr,5);
        System.out.println(ans);
    }
    static int BS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=target){
                end = mid;
            }else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return end; // you can return start too.
    }
}
// one main issue is there suppose if the element is not present in the array , it will still return the last index as the mid== target conditione is not der the method.
