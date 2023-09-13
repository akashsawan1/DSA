public class Recursion {
    public static void main(String[] args) {
        // Printing 1 to 5
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);  //tail recursion
    }
}
