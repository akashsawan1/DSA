import java.util.Scanner;

public class SmallestNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array, you want to create");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Emter "+ n + " values in the array");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = SmallestNo(arr);
        System.out.println("the smallest No in the array is: "+result);
    }
    static int SmallestNo(int[] arr){
        int smallestNo = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<smallestNo){
                smallestNo = arr[i];
            }
        }
        return smallestNo;
    }
}
