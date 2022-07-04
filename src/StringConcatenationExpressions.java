public class StringConcatenationExpressions {

    public static void main(String[] args) {
        String s = "harshal";
        String s1 = "harshal";
        s += 'c' + 1; // but here ('c' + 1 is first, and then concant to s)
        s1 = s1 + 'c' + 1; //simple left to right evalution

        //2 notes
        // 1. know the above trick related to += or -=
        // 2. be careful with characters, which is nothing but an integer(i.e corresponding ACII code)

        System.out.println(s);
        System.out.println(s1);
    }
}
