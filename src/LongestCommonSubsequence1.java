/*LCS[i][j] matrix
//psud0code to fill the matrix and return LCS[row size][column size]
if (i==0 || j==0){
    LCS[i][j]=0
        }
else if ( str1[i-1]==str2[j-1]){
    LCS[i][j]=1+LCS[i-1][j-1]
        }
else{
    LCS[i][j]=max(LCS[i-1][j], LCS[i][j-1])
        }*/


public class LongestCommonSubsequence1 {
    public static void main(String[] args) {

        String s1 = "oxcpqrsvwf";
        String s2 = "shmtulqrypy";

char[] str1=s1.toCharArray();
char[] str2=s2.toCharArray();
int row=s1.length();
int col=s2.length();

//filling matrix, where its indexed 0
        int[][] table=new int[row+1][col+2];
for(int i=0;i<=row;i++){

    for(int j=0;j<=col;j++){
       if (i==0||j==0){
table[i][j]=0; //fill these cells.
       }

       //1+diagonal(self)
       else if(str1[i-1]==str2[j-1]){
           table[i][j]=1+table[i-1][j-1];
       }
      // max(other diagonal pair) )
       else{
           table[i][j]=Math.max(table[i-1][j],table[i][j-1]);
       }
    }

}
        System.out.println("longest subsequence length:"+table[row][col]);

//backtraversing the matrix to find the actual longest subsequence
    }
}
