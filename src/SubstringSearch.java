public class SubstringSearch {

    //Naive pattern searching
    //case sensitive search
    //case insensitive search
    //single occurance check
    //multiple occurance check

/*          Algorithm steps
            1. n = length [str]
            2. m = length [pattern]
            3. for s = 0 to n -m do
            4. if P [1.....m] = T [s + 1....s + m]
            5. then print s*/
    public static void main(String[] args){
        String s1="An apple pie";
        String pattern="pie";

        int n=s1.length();
        int m=pattern.length();

        //note: contains() is case sensitive. hence convert to same case and do check
 /*       if(s1.contains(pattern)){
            System.out.println(true);
        }*/

        //O((n-m) * m))

        //here n-m=9
        //outerloop  only for matching first character of pattern in the string. for rest character its string1[i+j] //if susbtring will exist, max iteration required would be (n-m) and not complete n.
        for(int i=0;i<=n-m;i++){
            int j;
            //pattern string length loop
            for (j = 0; j < m; j++) {
                if (s1.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == m)  // denotes all characters of pattern found
                System.out.println("Pattern occurs at index " + i);
        }

    }


    }

