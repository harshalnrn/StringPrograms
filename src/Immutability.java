import java.util.ArrayList;
import java.util.List;

public class Immutability {


    //String (String object vs String literal)
    // StringBuilder, StringBuffer
    public static void main(String[]args){
     String s1="Harshal";
     String s2=new String("Kaushal");

     //note String declared in both ways shall remain immutable, where pass by value/reference doesn't come into picture for String.
     StringBuilder sb=new StringBuilder("Amar");

     StringBuffer sb1=new StringBuffer("Raj");

    concat1(s1);
    concat1(s2);
    concat2(sb);
    concat3(sb1);

    System.out.println(s1); //immutable
    System.out.println(s2); //imutable
    System.out.println(sb); //mutable
    System.out.println(sb1);//mutable


    }


    public static void concat1(String s1){

s1=s1+"narayan";
System.out.println("inside concat1 : "+s1);
//note here s1 did not get mutable, but s1 was made to point to new concatenated object, with method parameter having reference no more.
//return s1;
    }
    public static void concat2(StringBuilder s1){
s1.append("narayan");
//return s1;
    }
    public static void concat3(StringBuffer s1){
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


//make this object immutable (i.e meaning once the object is created, it content cannot be modified in any way)
final class Person{
   // If the instance variable declared as final, JVM won't provide any default value for the final instance variable.
   private final String name;
   private final int age;
   private final List<String> interests;

    public Person(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        //IMP: make another object copy and then assign,so that pass by reference doesnt impact initialization, this making it immuatable
        List<String> list1=new ArrayList<>(interests);
        this.interests = list1;
    }

    public static void main(String[] args){
        List<String> list=new ArrayList<>();
Person person=new Person("afaaf",14, list);


/*             - The class must be declared as final so that child classes can’t be created.
                - Data members in the class must be declared private so that direct access is not allowed.
                - Data members in the class must be declared as final so that we can’t change the value of it after object creation.
                - A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
                - Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)*/


}



//Solving pass by reference issue with making a copy
}