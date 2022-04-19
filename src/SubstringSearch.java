public class SubstringSearch {

    //Naive pattern searching
    //case sensitive search
    //case insensitive search
    //single occurance check
    //multiple occurance check

/*          Algorithm steps
            1. n = length [str]
            2. m = length [pattern]
            3. for1 s = [0 to n -m] do
            4. for2 j= [0 to m)
            5. if str [s+j] != pattern [j]  break inner,  else continue // we make conditional incremental of s here via s+j
            6. end for2
            7.for each pass check if j==m break;
            8. end for1
            9. then print found with s or not found*/
    public static void main(String[] args){
        String s1="An apple pie adadad";
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
                //extra conditional incremental indexof i acheived by (i+j)
                if (s1.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == m) { // denotes all characters of pattern found
                System.out.println("Pattern occurs at index " + i);
                break;
            }
        }

    }


    }

