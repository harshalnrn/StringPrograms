import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Immutability {


    //String (String object vs String literal)
    // StringBuilder, StringBuffer
    public static void main(String[] args) {
        String s1 = "Harshal";
        String s2 = new String("Kaushal");

        //note String declared in both ways shall remain immutable, where pass by value/reference doesn't come into picture for String.
        StringBuilder sb = new StringBuilder("Amar");

        StringBuffer sb1 = new StringBuffer("Raj");

        concat1(s1);
        concat1(s2);
        concat2(sb);
        concat3(sb1);

        System.out.println(s1); //immutable
        System.out.println(s2); //imutable
        System.out.println(sb); //mutable
        System.out.println(sb1);//mutable


    }


    public static void concat1(String s1) {

        s1 = s1 + "narayan";
        System.out.println("inside concat1 : " + s1);
//note here s1 did not get mutable, but s1 was made to point to new concatenated object, with method parameter having reference no more.
//return s1;
    }

    public static void concat2(StringBuilder s1) {
        s1.append("narayan");
//return s1;
    }

    public static void concat3(StringBuffer s1) {
        s1.append("narayan");
//return s1;
    }


}


//note: since java8, string constant pool is part of heap-space. hence garbage allocation of empty literals would happen similar to empty reference variables.
//Important Question: For concatenation: when to use string-builder/buffer instead of using normal String cancatenation using + or concat()
//https://stackoverflow.com/questions/4645020/when-to-use-stringbuilder-in-java
//prefer builder/buffer to avoid GC cost involved in iterative concatenation or long concatenation happening in parts.(i.e building address string, json, xml string)

//when to use builder(thread safe) vs buffer(thread unsafe)


// String regex pattern validation: String.matches () vs Pattern.matcher()
//----------------------------------------------------------------------------------------------------------------

//make this object immutable (i.e meaning once the object is created, it content cannot be modified in any way)
final class Person {
    // If the instance variable declared as final, JVM won't provide any default value for the final instance variable.
    private String name; //is already immutable // hence can be left
    private final int age;
    private final List<String> interests;

    public Person(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age; //pass by value
        //IMP: make another object copy and then assign,so that pass by reference doesnt impact initialization, this making it immuatable
        List<String> list1 = new ArrayList<>(interests);
        this.interests = list1;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //exposing reference members with deep copy in getter.
    public List<String> getInterests() {
        //return a copy
        List<String> list = new LinkedList<String>(this.interests);
        return list;
    }


    public static void main(String[] args) {

        String s = "harshal";
        List<String> list = new LinkedList<>();
        list.add("amar");
        int i = 9;
        Person person = new Person(s, i, list);
        list.add(0, "joy"); // modify variable passed as reference
        s = "kaushal"; //test string being immutable //pass by reference doesnt apply to string . but note it would apply to string-builder, buffer
        i = 10; //is pass by value, hence shouldn't affect

        //Test immutability now
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getInterests().get(0));

    }
}

//Notes: 1. How to make a class immutable
   /*          - The class must be declared as final so it cannot be inherited
                - Data members in the class must be declared private and shouldn't be directly exposed at all outisde, with no public setters
                - Data members in the class must be declared as final so that we can’t change the value of it after object creation even from within, with reassignment
                - A parameterized constructor should initialize all the fields performing a deep copy of reference variables so that data members can’t be modified with an object reference.
                - Deep Copy of objects should also be performed in the getter methods, to return a copy rather than returning the actual object reference, so that they can retreive them, but not modify the members)*/

/*   2. Backtrack and Think why do we make classes immutable ?
*   - whenever object needs to have fixed instance (i.e object and its members cannot be modified in any way)
*   example: Class value object like String, wrapper classes need to preserve their state : i.e strings and integers are often treated as values. Making this conclusion is important, on what object can be treated as fixed value and which variable references.
*   - They get treated as pass-by-value and not pass by reference, making it more simple to use by having single state, safe and consistent
*   - They are thread safe by default, since immutable objects can be shared across multiple threads, where they cant be mutated
*
*
* refer Effective Java by Joshua Bloch
* */
