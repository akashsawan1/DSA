//        ******
//        *****
//        ****
//        ***
//        **
//        *


public class Pattern_7 {
    public static void main(String[] args) {
        patter(6);
    }
    static void patter(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
