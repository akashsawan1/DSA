public class SpecialElementWithXElement {
    public static void main(String[] args) {
        int[] arr= {3,5};
        int ans = specialArray(arr);
        System.out.println(ans);
        int count=0;
        count-=5;

    }
    static int specialArray(int[] nums) {
        for(int i=0;i<1011;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i){
                    count++;
                }
            }
            if(count==i){
                return i;
            }
        }
        return -1;
    }
}
