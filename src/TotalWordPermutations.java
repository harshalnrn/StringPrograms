import java.util.LinkedList;
import java.util.List;

public class TotalWordPermutations {

    public static void main(String[] args){
        String s="abc";
        List<String> substrings=new LinkedList<>();
        int n=s.length();
        int output=0;
        //summation of nPr
        if(n>=1) {
            for (int i = 1; i <= n; i++) {

                output += (factorial(n) /factorial(n - i));
            }
            System.out.println(output);
        }
    }

    public static int factorial(int n){
        int output=1;
        for(int i=1;i<=n;i++){
            output=output*i;
        }
        return output;
    }
}
