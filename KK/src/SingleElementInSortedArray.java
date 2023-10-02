public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {7,7,10,11,11,12,12};
        int ans= singleNonDuplicate(arr);
        System.out.println(ans);
    }
    static int singleNonDuplicate(int[] nums) {
        int start= 1;
        int end = nums.length-2;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
                return mid;
            }else if(mid%2==0){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
