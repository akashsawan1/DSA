public class MonotonicArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        boolean ans = isMonotonic(arr);
        System.out.println(ans);
    }
    static boolean isMonotonic(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=nums[nums.length-1]){
                if(i!=nums.length-1 && nums[i]>nums[i+1]){
                    return false;
                }
            }else if(nums[i]>=nums[nums.length-1]){
                if(i!=nums.length-1 && nums[i]<nums[i+1]){
                    return false;
                }
            }

        }
        return true;
    }
}
