package Matt;

public class CountingDuplicateCharacters {

  public static void main(String[] args) {
   String s1 = "Duplicated input characters";
       int T1;
     char ss1[] =s1. toCharArray();
     
     System.out.println("Duplicated Characters: ");
    
    for (int i = 0; i <ss1.length; i++)    {
      T1 = 1;
      for (int j = i+1; j <ss1.length; j++) {
        if(ss1[i] == ss1[j] && ss1[i] != ' ') {
          T1++;
     ss1[j] = '0';
     
        }
      }
      if(T1 > 1 && ss1[i] != '0')
      System.out.print(ss1[i] + ", ");
    }
  }
}
