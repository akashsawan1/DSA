//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1




import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        System.out.print("Enter no. please :  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Here goes your result");
        pattern(n);
    }
    static void pattern(int n){
        for (int i=0;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
