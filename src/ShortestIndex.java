import java.util.ArrayList;
import java.util.List;

public class ShortestIndex {

    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("iug");
        list.add("srj");
        list.add("ut");
        list.add("iug");
        list.add("ut");
        list.add("iug");

        String w1="ut";
        String w2="srj";
       int shortest=-1;

      List<Integer> word1=new ArrayList<>();
        List<Integer> word2=new ArrayList<>();

        for(int i=0;i<list.size();i++){

            if (list.get(i).equals(w1)){
                word1.add(i);
            }

            if (list.get(i).equals(w2)){
               word2.add(i);
            }
        }

        //comparing indexes and finding shorted

        for(int j=0;j<word1.size();j++){
            for (int k=0;k<word2.size();k++){
                if (j==0 && k==0){
                    shortest=Math.abs(word2.get(k)-word1.get(j)); //initialise shortest as first diff. // common smallest/largest algo
                }
                //find difference between index and update shortest.
                else{
                   int diff= Math.abs(word2.get(k)-word1.get(j));
                   if(diff<shortest){
                       shortest=diff;
                   }
                }
            }
        }

        //thus we have list of indexes of both words in respective lists

System.out.println(shortest);


    }
}
