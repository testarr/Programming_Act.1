package Matt;

public class FindingTheFirstNonRepeatingCharacter {

  public static void main(String[] args) {
   String S1 = " its this";
   for(char i : S1. toCharArray()) {
     if(S1.indexOf(i) == S1. lastIndexOf(i)) {
       
       System.out.println("First non repeated character is: " +i);
       
     }
   }
  }
}
