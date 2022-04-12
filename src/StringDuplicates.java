public class StringDuplicates {


    // Solution: via secondary array to keep track of unique elements
    public static void main(String[] args) {

        //Q1: print duplicates / print unique  characters of String
        //Q2: print frequency of each character of String

        String str = "abcaaabbcc";
        char[] str1 = str.toCharArray();
        char[] checked = new char[str1.length]; //max possible lenght
        int checkedIndex = 0;

        for (int i = 0; i < str1.length; i++) {
            //options
            //1. linear search : if str1[i] already present in checked, then skip
           // OR
            //2. backtrack in loop from 0 to i and search in previous element // this saves on memory and time.
            int freq = 0; //for each pass
/*            if (search(str1[i], checked)) {
                continue; //skip
            }*/

            if(backtrack(str1[i],str1,i)){
                continue; //skip and move to next
            }
            for (int j = i; j < str1.length; j++) {

                //check frequency for this pass
         /*       if (freq > 1) {
                    //print duplicates
                    System.out.println("duplicate values exist of" + str1[i]);
                    break;
                }*/
                if (str1[i] == str1[j]) {
                    //linear search : if str1[i] present in checked
                    if (freq==0) {
                        //add to array
                        checked[checkedIndex] = str1[i];
                        checkedIndex++;
                        freq++;
                    } else {
                        freq++;
                    }
                }

            }

            System.out.println("frequency of character:"+str1[i]+ ":" + freq);
        }
    }

    //linear search
//binary search needs sorting. so not going with it.
    public static boolean search(char c, char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean backtrack(char c, char[] arr, int index) {


        for(int i=0;i< index;i++){
            if (arr[i]==c){
                return true;
            }
        }
        return false;
    }
}
