import java.lang.reflect.Array;
import java.util.Arrays;
// Arrays are mutable and Strings are immutable.
public class PassbyValue_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));  // u know just checking
        int[] arr1 = {1,2,3,4,5};
        test(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void test(int[] arr){
        arr[0]=5576;
    }
}
