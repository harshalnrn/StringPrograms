import java.util.Arrays;


//O(n2) complexity problems
public class CharSequenceChecker {


    public static void main(String[] args) {
System.out.println(check());
    }
    //return true if s2 should contains all characters of s2 in same seq, not necessarily consecutive
    //should return false if >=0 characters not existing only or
    // existing with wrong char sequence (not necessarily consecutive)


    public static boolean check(){
        String s1="opia"; //iterator set
String s2="apobpcia"; //lookup set

char set1[]=s1.toCharArray();
char set2[]=s2.toCharArray();

int seqIndex=-1;
//individual characters of primary string
for (int i=0;i<set1.length;i++) {
    boolean flag = false; // for existence of each char
    for (int j = seqIndex + 1; j < set2.length; j++) {
        //check if s2 contains primary character
        if (set1[i] == set2[j]) {
            //true
            flag = true;
            if (j > seqIndex)
                seqIndex = j;
            else
                return false; // wrong sequence
        }
    }
    //if any char of primary not found in entire s2
    if (!flag) return false;
}

return true;
    }

}
