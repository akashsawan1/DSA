import java.util.Arrays;
import java.util.Scanner;

public class PlaceTheLastNoinSortedPos {
    public static void main(String[] args) {
        int[] arr = {5,88,99,111,76};
        SortLast(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SortLast(int[] arr){
        int last = arr[arr.length-1];
        int swapindex = arr.length-2;
        while (swapindex>=0 && arr[swapindex]>last){
            swapindex--;
        }
        for (int i=arr.length-1;i>swapindex+1;i--){
            arr[i] = arr[i-1];
        }
        arr[swapindex+1] = last;
    }
}
