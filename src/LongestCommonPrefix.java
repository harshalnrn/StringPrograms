public class LongestCommonPrefix {
    public static void main(String[] args) {
        //i.e find longest common substring among all strings in string[]

        String s1 = "geeksforgeeks";
        String s2 = "geek";
        String s3 = "geeks";
                String s4 ="geezer";

                String[] arr={s1,s2,s3,s4};
                System.out.println(longestCommonPrefix(arr,4));
       /* String common = "";
        //let s2 be primary since its small

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == s1.charAt(i)) {
                common = common + s2.charAt(i);
            }
        }

        if (common.length() == 0) {
            System.out.println("no common seq");
        }
        System.out.println(common);*/

    }

    static String longestCommonPrefix(String arr[], int n) {
        //be careful of input constraints and choose appropriate datatype. this is required especially for edge cases.
            String min = "";
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    min = arr[i];
                } else {
                    if (arr[i].length() < min.length()) {
                        min = arr[i];
                        index = i;
                    }
                }
            }

            String prim = arr[index];
            String common = "";
            char[] primary=prim.toCharArray();

            for (int j=0;j<prim.length();j++){
                boolean comChar=false;
                for (int k=0;k<arr.length;k++){


                    //  compare each character of primary from left, with same indexes of other strings
                    //compare primary string and arr[k] and find update longest seq incrementally if longer that existing
                    if (arr[k].charAt(j)==primary[j]){
                        comChar=true;
                    }
                    else{
                        comChar=false;
                        break;
                    }

                }
                if (comChar){
                    common+=primary[j];
                }
                else{
                    break;
                }

            }
            if (common.length()==0){
                return "-1";
            }
            return common;
    }
//note: single common character wont be considered as prefix sequence.

}