import java.util.Arrays;

public class FrequencyCharArray {


public static void main(String[] args){
createFreqArray("abcaabbcc");
}

    static String createFreqArray(String S){

        char[] str=S.toCharArray(); //this shall sffect space
        char[] uniqueWithFrequency=new char[str.length*2];  // note: here max size is str.length in case of all unique characters
int k=0; //index for k
Arrays.sort(str); //sorts str.
for (int i=0;i<str.length;i++){
//check for str[i[], only if frequency not yet calculated
    int freq=0;
    //linear search if it exists in uniqueWithFrequency
    if (linearSearch(str[i],uniqueWithFrequency)){
        continue;
    }
    //search the character across string to find frequency

    for(int j=i;j<str.length;j++){
        //add characte to array if not existing just once
        if (str[i]==str[j]) {
            if (freq==0){
                uniqueWithFrequency[k] = str[i];
                freq++;
            } else {
                //calculate freq
                freq++;
            }
        }
    }
    //integer to char
    String f=freq+"";
    uniqueWithFrequency[k+1]=f.charAt(0);
k+=2;
}

//concept learnt: default value of char datatype.
//note that default value of char is '\u0000'
System.out.println(String.valueOf(uniqueWithFrequency).replaceAll("\\u0000","")); //char[] to string
        return "";
        }


        public static boolean linearSearch(char c, char[] charArr){
    for(int i=0;i<charArr.length;i++){
if (c==charArr[i]){
    return true;
}
}
return false;
        }
}



