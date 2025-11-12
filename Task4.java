import java.util.*;
public class Task4 {
    
public static void main(String[] args) {


    while(true){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string to check if the string is a Palindrome:");
        String ComparedWord = new String(s.nextLine());
        StringBuilder ReversedWord = new StringBuilder(ComparedWord);
        if("end".equals(ComparedWord)){
            break;
        }
        if(ComparedWord.equals(ReversedWord.reverse().toString())){
        System.out.println("The input string is a Palindrome.");
        System.out.println();
        }
        else{
        System.out.println("The input string is not a Palindrome.");
        System.out.println();
        }
    }
    
  }
}
