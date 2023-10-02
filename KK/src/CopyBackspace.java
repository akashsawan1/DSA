import java.lang.StringBuilder;
public class CopyBackspace {
    public static void main(String[] args) {
        StringBuilder ans = length("akash#sawan");
        StringBuilder ans2= length("axbd#c#c");

//        if(ans.equals(ans2)){
//            System.out.println("both are equal");
//        }else{
//            System.out.println("jingalala");
//        }
        System.out.println(ans);
    }

    static StringBuilder length(String test) {
        StringBuilder str = new StringBuilder(test);
        if (test.contains("#")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '#') {
                    int index = i;
                    int prev = i - 1;
                    if (prev >= 0) {
                        str.deleteCharAt(index);
                        str.deleteCharAt(prev);
                        i-=2;
                    } else {
                        str.deleteCharAt(index);
                        i--;
                    }
                }
            }
        }
        return str;
    }

}
