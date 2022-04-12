

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class BigDatatypes {

public static void main(String[] arr){
    List<Integer> list=new ArrayList<>();
    Stream<Integer> stream=list.stream();
    BigDecimal sum=new BigDecimal(5);
    BigDecimal sum1=new BigDecimal(6);
    sum=sum.add(sum1);
    System.out.println(sum);

    }

}
