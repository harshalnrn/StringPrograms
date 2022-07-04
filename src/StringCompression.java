public class StringCompression {
    public static void main(String[] args) {
        //Focus on TDD
        String str1 = "harrrrrsrhhsal";
        //String str2='har5srh2sal'; //expected
        String str2 = "";
        char[] str = str1.toCharArray();

        int newIndex = 0; // sometimes good to use variables for single purpose, to keep it clean. hence have separate index.
        for (int i = 0; i < str.length; ) {   // be careful with custom index operation, since it could lead to infinite loop
            int frequency = 0;

            for (int j = i; j < str.length; j++) {

                //i==j in two cases:
                if (str[i] == str[j]) {
                    frequency++;
                } else {
                    newIndex = j;
                    break;
                }
                if (j == str.length - 1) {
                    newIndex = ++j; // be careful on pre and post incrementer during assignment
                }

            }

            //be thoughtful of edge cases, to cover all conditional blocks
            if (frequency > 1) {
                str2 += str[i] + "" + frequency;  //be careful with operators priority in multi operand expressions (i.e fundamentals). not related to this expressinon// note operands always evaluated left to right.
            } else {
                str2 += str[i];  // base careful with += -=. this trick question is covered in another program.
            }

            i = newIndex;
        }

        System.out.println(str2);
    }
}
