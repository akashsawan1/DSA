import java.util.Arrays;
import java.util.Scanner;

public class SwapNosInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+  " values of array");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Swap(0,1,arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] Swap(int a,int b, int[] arr){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return arr;
    }
}
