public class KthMissingNo {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7};
        System.out.println(findKthPositive(arr,3));

    }
    static int findKthPositive(int[] arr, int k) {
       int start = 0;
       int end= arr.length-1;
       if(k<arr[0]){
           return k;
       }
       while (start<=end){
           int mid=start+(end-start)/2;
           int MissiongNo = arr[mid]-(mid+1);
           if(MissiongNo<k){
               start = mid+1;
           }else {
               end = mid-1;
           }
       }
       int more = k- (arr[end]-(end+1));
       return arr[end]+more;
//        return k+start;
       // or here you can remove the condition k<arr[0] and use return k+(end+1) or k+ start;
    }
}
