public class LeetCodeTest {
    public static void main(String[] args) {
        int[] arr= {8,17,23,34,37,42};
        int ans = findKthPositive(arr,8);
        System.out.println(ans);
    }
    static int findKthPositive(int[] arr, int k) {
        int count = 1;
        int a = 1;
        int i = 0;
        if(k==1){
            a=0;
            while (a < k ) {
                if (i < arr.length && arr[i] == count) {
                    count++;
                    i++;
                }else {
                    a++;
                }
            }
            return count;
        }
//        while (a < k ) {
//            if (i < arr.length && arr[i] == count) {
//                count++;
//                i++;
//            } else {
//                count++;
//                a++;
//            }
//        }



        if (a == k) {
            return count;
        }

        return -1;
    }
}
