//        0
//        0 1
//        0 1 2
//        0 1 2 3
//        0 1 2 3 4
//        0 1 2 3 4 5



public class Pattern_3 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
