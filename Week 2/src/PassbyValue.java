public class PassbyValue {
    public static void main(String[] args) {
        String name = "Akash Sawan";
//        String test = greet(name);
//        System.out.println(test);   // it will return 'ksh Sw'
        greet(name);
        System.out.println(name);
    }

    static String greet(String naam) {
        naam = "ksh Sw";
        return naam;
    }

}
