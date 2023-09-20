import java.util.Arrays;

public class Split_largest_sum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int ans = splitArray(arr,2);
        System.out.println(ans);
        }

    static int splitArray(int[] nums, int k) {
    int start = 0;
    int end = 0;
        for(int num : nums){
            start= Math.max(start,num);
            end +=num;
        }
        while (start<end) {
            int mid = start + (end-start)/2;
            int sum=0;
            int peice = 1;
            for (int num: nums){
                if(num+sum>mid){
                    sum = num;
                    peice++;
                }else {
                    sum+=num;
                }
            }
            if(peice<=k){  // we are putting equalto to check for more possible ans i.e piece = k;

                end = mid;
            }
            else {

                start = mid+1;
            }
        }
        return start; //or mid/end; coz start = mid = end;
    }
}
