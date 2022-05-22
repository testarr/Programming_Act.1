import java.util.*;

public class CountingDuplicateCharacters {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Insert String: ");
        String A = sc1.nextLine();
        int C = 0;

        char o[] = A.toCharArray();

        int i;
        int ii;

        for(i=0; i < A.length(); ){

            for(ii = i+1; ii<A.length(); ){

                if(o[i]==o[ii] && o[i]!= ' ') {
                    C++;
                    o[i] = ' ';
                }

                ii++;
            }

            i++;
        }

    System.out.println("Duplicated Characters are: " + (C));




    }
}
