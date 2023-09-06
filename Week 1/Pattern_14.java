//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//            5 6
//           4 5 6
//          3 4 5 6
//         2 3 4 5 6
//        1 2 3 4 5 6
public class Pattern_14 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i+1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i+1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
