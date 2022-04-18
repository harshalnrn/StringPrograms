import java.util.Locale;

//A pangram is a sentence that contains each and every 27 letters of the English Alphabet
//edge cases: note: can contain special characters, can contain duplicates. in the end all alphabets should exist in the string sentence
public class Panagrams {

public static void main(String[] args){
    String s="Bawds jog, flick quartz, vex nymph";
    s=s.toLowerCase(); //for consistency
  //  char[] str=s.toCharArray();
    //iteratable progression character set (i.e similar to integer counter)
    for(char i='a';i<='z' ;i++){
        //understand what happens behind scenes.Every data --unicode numbers --binary.
        // Encoding formats and their mapping with data.
        //java uses unicode of data. check out ASCII table for character mappings. unicode is incremented and get value corresponding to new unicode
        //https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        System.out.println((int)i); //we get unicode value
           if(!s.contains(i+"")){
          System.out.println("false");
       }
    }

    System.out.println("true");
}

}
