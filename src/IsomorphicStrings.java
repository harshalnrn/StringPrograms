public class IsomorphicStrings {
    public static void main(String[] args){
        String s1="aba";
        String s2="xyy";
        System.out.println(areIsomorphic(s1,s2));

    }


    public static boolean areIsomorphic(String s1,String s2) {

        if (s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            int index1=0;
            int index2=0;
            if(!alreadyChecked(s1,i,s1.charAt(i))){

                // check freq of s1.charAt(i)

                for(int j=i;j<s1.length();j++){
                    if(s1.charAt(i)==s1.charAt(j)){
                        index1++;
                    }
                }
            }

            if(!alreadyChecked(s2,i,s2.charAt(i))){
                //check freq of s2.charAt(i)
                for(int k=i;k<s1.length();k++){
                    if(s2.charAt(i)==s2.charAt(k)){
                        index2++;
                    }
                }
            }

            //equate both freq and return false if not matching
            if (index1!=index2){
                return false;
            }
        }

        return true;
    }

    public static boolean alreadyChecked(String str, int j,char c) {

        for(int i=0;i<j;i++){
            if (str.charAt(i)==c){
                return true;
            }
        }
        return false;
    }

}
