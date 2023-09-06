//             *
//            * *
//           *   *
//          *     *
//         *       *
//        ***********



public class Pattern_13 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            if(i==n-1){
                for(int j=0;j<=2*i;j++){
                    System.out.print("*");
                }
                break;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<=2*i-1;j++){
                if(j==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
