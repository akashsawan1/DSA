//             1
//            212
//           32123
//          4321234
//         543212345
//        65432123456



public class Pattern_9 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print(i);
            for(int k=i-1;k>=1;k--) {
                System.out.print(k);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
