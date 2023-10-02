import java.util.Arrays;

public class CheckN_If_Its_doubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,7,3,0,0,-13};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }
    static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++ ){
            if(BinarySearch(arr,2*arr[i])){
                return true;
            }
        }

        return false;
    }
    static boolean BinarySearch(int[] arr,int target){
        if(target == 0){
            int start=0;
            int end= arr.length-1;
            while(start<=end){
                int mid= start + (end-start)/2;
                if(arr[mid]==target){
                    if(mid!=0){
                        if(arr[mid]==arr[mid-1]||arr[mid]==arr[mid+1]){
                            return true;
                        }else {
                            return false;
                        }
                    }
                    else if(mid==0){
                        if(arr[mid]==arr[mid+1]){
                            return true;
                        }else {
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
                else if(arr[mid]<target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            return false;

        }
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return false;
    }
}
