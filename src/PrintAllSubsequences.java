import java.util.HashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
//Try out recursion, which is the original solution for this
public class PrintAllSubsequences {
    // Function to find subsequence
    static String subsequence(String s,
                              int binary,
                              int len)
    {
        String sub = "";

        for(int j = 0; j < len; j++)

            // Check if jth bit in binary is 1
            if ((binary & (1 << j)) != 0)

                // If jth bit is 1, include it
                // in subsequence
                sub += s.charAt(j);

        return sub;
    }
    // Function to print all subsequences
    static void possibleSubsequences(String s)
    {


        // Map to store subsequence
        // lexicographically by length
        SortedMap<Integer, HashSet<String>> sorted_subsequence = new TreeMap<>();

        int len = s.length();

        // Total number of non-empty subsequence
        // in String is 2^len-1
        int limit = (int) Math.pow(2, len);

        // i=0, corresponds to empty subsequence
        for(int i = 1; i <= limit - 1; i++)
        {

            // Subsequence for binary pattern i
            String sub = subsequence(s, i, len);

            // Storing sub in map
            if (!sorted_subsequence.containsKey(sub.length()))
                sorted_subsequence.put(
                        sub.length(), new HashSet<>());
            sorted_subsequence.get(
                    sub.length()).add(sub);
        }

        for(Map.Entry<Integer,
                HashSet<String>> it : sorted_subsequence.entrySet())
        {

            // it.first is length of Subsequence
            // it.second is set<String>
            System.out.println("Subsequences of length = " +
                    it.getKey() + " are:");

            for(String ii : it.getValue())

                // ii is iterator of type set<String>
                System.out.print(ii + " ");

            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abc";

        possibleSubsequences(s);
    }
}



//also try distinct subsequences