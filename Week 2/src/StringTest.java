public class StringTest {
    public static void main(String[] args) {
        String name = new String("akash");
        //or
        String name1 = "akash";
        String name2 = "akash";
//        if(name == name1){
//            System.out.println("true");
//        }
//        else System.out.println("false");
//        if(name1 == name2){
//            System.out.println("both is same");
//        } else System.out.println("both is not same");
        if(name.equals(name1)){
            System.out.println("Both are same");
        }
        if(name1.equals(name2)){
            System.out.println("this is also same");
        }
    }

}
// equals is case sensitive.
// In not primitives datatypes   When we use == (double equal to) then actually we check the references not the value.