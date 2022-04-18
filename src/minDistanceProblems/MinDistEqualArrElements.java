package minDistanceProblems;

import java.util.HashMap;
import java.util.Map;

public class MinDistEqualArrElements {

    public static void main(String[] args) {
        int[] input = {2,5,3,4,5,3,7,3,3,3};
//global min distance variable
        int minDistance = 0;
        Map<Integer, Integer> map = new HashMap<>();
       /* //nested loop approach
        for(int i=0;i<input.length;i++){
            //for each char, search in rest of the array.
            //below variabl initialize for each pass.
            int latest=i;
            int previous=0;
            for(int j=i+1;j<input.length;j++){

                    if(input[i]==input[j]){
                        previous=latest;
                        latest=j;
                        minDistance=la test-previous;
                    }
                }
            }*/

        for (int i = 0; i < input.length; i++) {
            //check if exists in map and find diff and update latest value in map, else add in map
            if (map.containsKey(input[i])) {
                //subtract latest-previous(hashmap)
                int diff = i - map.get(input[i]);
                map.put(input[i], i);  // update index value corresponding to key.

                //conditonally update mindistance
                if(minDistance==0){
                    minDistance=diff;
                }
                else if(minDistance>diff){
                    minDistance=diff;
                }
            } else {
                map.put(input[i], i);
            }
        }
System.out.println(minDistance);
    }

}