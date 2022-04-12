import java.math.BigInteger;

public class StringToNumber {

public static void main(String[] args){


   System.out.println(isdivisible7("8955795758"));
}



    static int isdivisible7(String num){
        // code here

        //validate is string is number via exception handlign
        int output=0;
        //be careful while dealing with big wrapper datatypes (BigInteger, BigDecimal)
        // they are to be used as objects unlike primitive types.
        try{
            BigInteger numm=new BigInteger(num);
            BigInteger n=BigInteger.valueOf(7);
            BigInteger m=BigInteger.valueOf(0);
            if (numm.mod(n).equals(m)){
                output=1;
            }
        }
        catch (NumberFormatException e){
System.out.println(e);
        }
        return output;
    }
}
