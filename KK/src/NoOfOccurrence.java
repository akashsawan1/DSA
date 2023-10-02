public class NoOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,5,1,2,43};
        int ans= Cpunt(arr,1);
        System.out.println(ans);
    }
    static int Cpunt(int[] arr, int target){
        int count=0;
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid= start+ (end-start)/2;
            if(arr[mid]==target){
                count++;
                end= mid;
            }
            else if(arr[mid]>=target){
                end= mid;
            }else{
                start = mid+1;
            }
        }
        return count;
    }
}