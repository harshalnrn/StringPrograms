public class LongestCommonSubstring {

    public static void main(String[] args){
        String s1="acdef";  //primary being the smaller one
        String s2="sgcdefmssgsdpefa";

        String longestSub="";

        //outer iteration is for individual characters of s1
    for (int i=0;i<s1.length();i++){
        //innner iteration for substrings of s1
        for(int j=i+1;j<=s1.length();j++){

            String c=s1.substring(i,j);
            if (s2.contains(c)) {
                //here is same lenght, the first one will remain
                if(c.length()>longestSub.length())
                { longestSub=c;}
            }
        }

    }
    if (longestSub.length()==0){
        System.out.println("no common substring found between both");
    }
    else{
        System.out.println("longest common substring: "+longestSub);
    }

    }
}


//be careful of
// -loop limits and termination conditions
// -edge cases conditional blocks
//- input constraints based datatype
//run in debug mode from the start, to avoid waste of time.
