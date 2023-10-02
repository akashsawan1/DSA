public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int ans = search(arr,3);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int pivot=pivot(nums);
        if(pivot ==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(target==nums[pivot]){
            return pivot;
        }else if(target>=nums[start]){
            return binarySearch(nums,target,start,pivot);
        }else{
            return binarySearch(nums,target,pivot+1,end);
        }
    }
    static int pivot(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<end&&nums[mid]>nums[mid+1]){
                return mid;
            }else if(mid>start&&nums[mid]<nums[mid-1]){
                return mid-1;
            }else if(nums[start]<nums[mid]){
                start=mid+1;
            }else if(nums[start]>=nums[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end= mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
