public class DailyLeetcodeonethirtytwoPattern {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6,7,8,9,10};
        boolean ans= find132pattern(arr);
        System.out.println(ans);
    }
    static boolean find132pattern(int[] nums) {
        int max = Maximum(nums);
        if(max==nums[nums.length-1]){
            for(int i=2;i<nums.length;i++){
                if(nums[i]<nums[i-1]&&nums[i]>nums[i-2]){
                    return true;
                }
            }
            return false;
        } else{
            int k=nums[nums.length-1];
            int j=Integer.MIN_VALUE;
            for(int i=nums.length-1;i>=0;i--){
                if(j != Integer.MIN_VALUE&&nums[i]<j){
                    return true;
                }
                if(nums[i]>k){
                    j=k;
                    k=nums[i];
                }
            }
            return false;
        }
    }
    static int Maximum(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    }

