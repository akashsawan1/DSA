import java.util.Arrays;

public class InsertionSOrt {
    public static void main(String[] args) {
        int[] arr = {9,8,7,4,3,22};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i=1;i<arr.length;i++){
            int last = arr[i];
            int swapIndex = i-1;
            while (swapIndex>=0 && arr[swapIndex]>last){
                swapIndex--;
            }
            for (int j=i;j>swapIndex+1;j--){
                arr[j] = arr[j-1];
            }
            arr[swapIndex+1] =last;
        }
    }
}
