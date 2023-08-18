import java.lang.reflect.Array;
import java.util.Arrays;

//12. Anagram program in java
class Program12 {
    public static void main(String[] args) {
        String a = "sekar";
        String b = "rakes";
       if(a.length()==b.length()){
           char [] ch1 = a.toCharArray();
           char [] ch2 = b.toCharArray();

           Arrays.sort(ch1);
           Arrays.sort(ch2);

           boolean result = Arrays.equals(ch1,ch2);
           if(result){
               System.out.println("Anagram");
           } else {
               System.out.println("Not a Anagram");
           }
       }
       else {
           System.out.println("Not a Anagram");
       }
    }
}
