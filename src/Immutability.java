public class Immutability {

    //String , StringBuilder, StringBuffer
    public static void main(String[]args){
     String s1="Harshal";
     String s2=new String("Kaushal");

     //note String declared in both ways shall remain mutable, where pass by value/reference doesn't come into picture for String.
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




//Important Question: For concatenation: when to use string-builder/buffer instead of using normal String cancatenation using + or concat()
//https://stackoverflow.com/questions/4645020/when-to-use-stringbuilder-in-java
//prefer builder/buffer to avoid GC cost involved in iterative concatenation or too many concatenation happening in parts.

//when to use builder vs buffer. (honselty havent seen much usage of buffer)



// String: matches () vs Pattern.matcher()