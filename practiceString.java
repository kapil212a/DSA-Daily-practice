package practice;
import java.util.*;

public class practiceString {
    public static int vowelCount(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }return count;
    }

    public static void anagram(String str ,String str1){
        str.toLowerCase();
        str1.toLowerCase();
        if(str.length()==str1.length()){
            char[] str11 = str.toCharArray();
            char[] str22 = str1.toCharArray();
            Arrays.sort(str11);
            Arrays.sort(str22);
            boolean result = Arrays.equals(str11,str22);
            if(result){
                System.out.println("Both Are Anagram");
            }
            else{
                System.out.println("Both Are Not Anagram");
            }
        }else{
            System.out.println("Both Are Not Anagram");
        }
    }


    public static void main(String[] args) {
        String str = "earth";
        String str1 = "heart";
        //anagram(str, str1);
        anagram(str, str1);


        // Scanner sc = new Scanner (System.in);
        // System.out.print("Enter The String :");
        // String str = sc.next();
        // System.out.println(vowelCount(str));
    }
}
