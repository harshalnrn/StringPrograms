package backbase_problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SoldProductsAggregator {

    private final EURExchangeService exchangeService; //implements interface backbase_problem.ExchangeService rate()

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {
//handling null edge cases
        if (products==null || products.count()==0){
            return null;
        }
        List<SimpleSoldProduct> list=new ArrayList<>();
        SoldProductsAggregate soldProductsAggregate=new SoldProductsAggregate();
        //a)need to iterate stream and b) convert to eur and calculate sum of price of each sold product
        BigDecimal[] sum=new BigDecimal[1];
        Arrays.fill(sum, BigDecimal.ZERO);
      //  BigDecimal sum=new BigDecimal(0);
        products.forEach(i -> {
            if (i.getPrice()!=null && i.getCurrency()!=null && !i.getCurrency().isEmpty() ){
                //map to SimpleSoldProducts and add to list

                SimpleSoldProduct simple=new SimpleSoldProduct(i.getName(),i.getPrice());
list.add(simple);
                Optional<BigDecimal> eurValue=exchangeService.rate(i.currency); //convert
                sum[0]=eurValue.get().add(sum[0]);
            }
            else{
                System.out.println("product decription wrong, since it doesnt have mandatory details");
            }
        });

        soldProductsAggregate.setProducts(list);
        soldProductsAggregate.setTotal(sum[0]);

        return soldProductsAggregate;



    }

}
