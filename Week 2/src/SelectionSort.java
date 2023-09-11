import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,4,3,22};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           int minimum = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minimum]){
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }
}
