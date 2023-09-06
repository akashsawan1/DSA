//              *
//             * *
//            *   *
//           *     *
//          *        *
//           *      *
//           *     *
//            *   *
//             * *
//              *




public class Pattern_6 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
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
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<n-i;j++){
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
