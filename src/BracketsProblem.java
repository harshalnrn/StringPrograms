/*Problem: given a string of brackets,find the equal point, from where number of open bracket BEFORE this index,
 equals number of closed brackets FROM and AFTER this index. ex: (())))(
        ex: */
public class BracketsProblem {

    public static void main(String[] args) {

        //2 aproaches. O(n^2) , O(n)
        //----------------------------------------------------------------------------------------------------

//time: nk + nj  (i.e ~O(2*n^2))  //very bad

        String str = "()))";
        System.out.println(equalPoint(str));
        //   char[] str1=str.toCharArray();

       /* int middleIndex=-1;
        for(int i=0;i<str1.length;i++){
//each character serves as split point, with 0 > i-1 as left array and i -> lenght as right array. //note the split character goes to right array
           //be careful about initialization/reinitialization
            //be careful about possible test cases including edge cases.
            int leftCount=0;
            int  rightCount=0;
            //linear search in left from 0 to i and increment leftindex   (i.e like left array)

            for(int k=0;k<i;k++){

                if(str1[k]=='('){
                    leftCount++;
                }
            }
            //linear search in right from i to length-1 and increment right index    (i.e like right array)

            for (int j=i;j<str1.length;j++){
                if (str1[j] == ')') {

                    rightCount++;
                }
            }
            //break if left ==right

            if (leftCount==rightCount){
                middleIndex=i;
                break;
            }

        }
        System.out.println("middle index is:"+middleIndex);*/


    }


//O(n) complexity

    // Algorithm:
  /*  Store the number of opening brackets appears in the string up to every index, it must start from starting index.
      Similarly, Store the number of closing brackets appears in the string upto each and every index but it should be done from last index.
      Check if any index has the same value of opening and closing brackets.*/
    public static int equalPoint(String s) {
        int closingBracket = 0;
        int openingBracket = 0;
//find total count of closing bracket
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                closingBracket++;
            }
        }

        //find incremental count of both opening and closing and appropriatly ++ / --

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                closingBracket--;
            } else {
                openingBracket++;
            }

            if (openingBracket == closingBracket) {
                return i + 1; // since, for closed its including FROM the index.hence +1
            }

        }

        return -1;
    }
}


