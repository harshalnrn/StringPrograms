import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//An anagram of a string is another string that contains the same characters, only the order of characters can be different.
//here via k value, only at most K number of characters can be different between 2 strings
public class K_Anagrams {

    public static void main(String[] args){
System.out.println(checkKanagram());
    }

  public static boolean checkKanagram(){
        //duplicate characters example
      String s1="wurkbxkgkfmlzofn";
      String s2="mczujslxzvhecrpy";
     /* String iterable="";
      String lookup="";

      //Use dynamic data strcutures, where initial size is not required, and there is dynamic grow or shrinking.
      List<Character> list=new LinkedList<>();
      List<Character> list1=new LinkedList<>();

      //evaluating which string is iterable and which lookup (string with more unique characters becomes lookup string)
      for (int i=0;i<s1.length();i++) {
         if(!list.contains((Character) s1.charAt(i)) ){
           list.add((Character) s1.charAt(i))  ;
         }
      }
      for (int i=0;i<s2.length();i++) {
          if(!list1.contains((Character) s2.charAt(i)) ){
              list1.add((Character) s2.charAt(i))  ;
          }
      }

      if(list.size()>list1.size()){
          iterable=s1;
          lookup=s2;
      }
      else{
         iterable=s2;
         lookup=s1;
      }
*/
      int k=10;

      int anagramCount=0;

      //create unique array for both string and take string with more unique characters as iterable

      //sort both strings alphabetically, such that they can be compared character to character, with both having same order now

      char[] str1=s1.toCharArray();
      char[] str2=s2.toCharArray();
     Arrays.sort(str1);
     Arrays.sort(str2);

     if(str1.length!=str2.length){
       return false;
     }
     for(int i=0;i<str1.length;i++){
         if(str1[i]!=str2[i]){
             anagramCount++;
         }
         if (anagramCount>k){
             return false;
         }
     }

      return true;
  }



}//https://www.geeksforgeeks.org/check-two-strings-k-anagrams-not/


