public class For_test {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    static int mySqrt(int x) {
        // int ans = (int) Math.sqrt(x);
        // return ans;
        int start =0;
        int end = x;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if((long)mid*mid>x){
                end = mid-1;
            }else if(mid*mid<x){
                start = mid+1;
            } else{
                return Math.round((int)mid);
            }
        }
        return Math.round(end);
    }
}
