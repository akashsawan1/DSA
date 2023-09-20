public class FloorOfaNo {

        public static void main(String[] args) {
            int[]  arr = {2,3,5,9,14,16,18};
            int ans = Floor(arr,15);
            System.out.println(ans);
        }
        static int Floor(int[] arr, int target){
            if(target<arr[0]){   // no need for this coz end automatically become -1 if this condition is met
                return -1;
            }
            int start =0;
            int end= arr.length-1;
            while (start<=end){
                int mid = start + (end-start)/2; // here we are using this instead of (start+ end)/2 to not exceed the int data type
                if(target< arr[mid]){
                    end = mid-1;
                } else if (target> arr[mid]) {
                    start = mid+1;
                }
                else {
                    return mid;
                }
            }
            return arr[end];
        }
    }


