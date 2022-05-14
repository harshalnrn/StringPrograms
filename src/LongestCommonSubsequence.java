public class LongestCommonSubsequence {
    //The naive solution is brute force: build the longest subsequence between both given sequences by traversing across all characters in nested loop fashion
    public static void main(String[] args) {
//tried n^3 nested loop aproach.
     //this test data is give wrong output with this algo. validate
        String s1 = "oxcpqrsvwf"; //iterator set
        String s2 = "shmtulqrypy"; //lookup set
        char set1[] = {};
        char set2[] = {};
        if (s1.length() < s2.length()) {
            set1 = s1.toCharArray();
            set2 = s2.toCharArray();
        } else {
            set1 = s2.toCharArray();
            set2 = s1.toCharArray();
        }

        int seqIndex = -1;
        String longestSubSeq = "";
//individual characters of primary string
        for (int i = 0; i < set1.length; i++) {
            for (int j = seqIndex + 1; j < set2.length; j++) {
                //check if s2 contains primary character
                if (set1[i] == set2[j]) {
                    longestSubSeq+= set1[i];
                    seqIndex = j;
                }
            }

        }
        System.out.println(longestSubSeq);
    }
}