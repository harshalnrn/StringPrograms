import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.(basically equal)
//sort strings in lexicographical order: dictionary order
public class LexicographicalStrings {
    //note: 'equals' is more or less same as 'lexicographically equal' in context to 2 strings
    /*    equals()
    returns boolean by just comparing 2 compatible object(equal or not equal)
    vs
   compareTo()
    returns integer by comparing 2 objects of same type.
    this is required more for sorting purpose (equal/greater/less than)
    */
    //https://stackoverflow.com/questions/1551235/compareto-vs-equals#:~:text=The%202%20main%20differences%20are,how%20the%20Strings%20compare%20lexicographically.

public static void main(String[] args){

    List<String> list=new LinkedList<>();

    list.add("sdsd");
    list.add("asas");
    list.add("bfsg");
    list.add("csgsgs");
    list.add("dfsfs");

    //String implements Comparator internally compareTo(), which returns which among 2 strings is 'lexicographically' greater/smaller/equal)
    Collections.sort(list);
    System.out.println(list);


}



}
