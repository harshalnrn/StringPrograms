public class ReverseStringSequence {

    public static void main(String[] args){
        String s1="i.like.this.program.very.much";
        //create string[]
        //note to escape, since . is a special character to be escaped
        String[] s2=s1.split("\\.");
        String s3="";
        //incremental concatenate from reverse
        for(int i=s2.length-1;i>=0;i--){
            if (i!=0) {
                s3 = s3 + s2[i] + ".";
            }
            else{
                s3 = s3 + s2[i]     ;
            }
        }
        System.out.println(s3);
    }
}
