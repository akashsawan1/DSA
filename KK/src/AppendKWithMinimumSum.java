public class AppendKWithMinimumSum {
    public static void main(String[] args) {
        int[] arr = {5,6};
        System.out.println(minimalKSum(arr,6));
    }

   public static long minimalKSum(int[] nums, int k) {
        int sum =0;
        int count =1;
        int stop=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<nums.length;j++){
                if(stop==k){
                   return sum;
                }
                if(nums[j]==count){
                    count++;
                }else {
                    sum +=count;
                    stop++;
                }
            }
        }
        return -1;
    }
}
