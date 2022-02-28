package Matt;

public class CheckingWetherTwoStringsAreAnagram {

  public static void main(String[] args) {
   String S1 = "read";
     String S2 = "dare";
     S1 = S1.toLowerCase();
     S2 = S2.toLowerCase();
     
     if(S1.length() == S2.length()) {
       char[] charArray1 = S1.toCharArray();
       char[] charArray2 = S2.toCharArray();
 
       Arrays.sort(charArray1);
       Arrays.sort(charArray2);
       boolean result = Arrays.equals(charArray1, charArray2);
 
       if(result) {
         System.out.println(S1 + " and " + S2 + " are anagram.");
       }
       else {
         System.out.println(S1 + " and " + S2 + " are not anagram.");
       }
     }
     else {
       System.out.println(S1 + " and " + S2 + " are not anagram.");
     }
  }
}
