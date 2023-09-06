//             *
//            ***
//           *****
//          *******
//         *********
//        ***********
//         *********
//          *******
//          *****
//           ***
//            *



public class Pattern_11 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
