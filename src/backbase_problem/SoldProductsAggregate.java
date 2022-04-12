package backbase_problem;

import java.math.BigDecimal;
import java.util.List;

public class SoldProductsAggregate {

    List<SimpleSoldProduct> products;
    BigDecimal total; //total in eur

    public List<SimpleSoldProduct> getProducts() {
        return products;
    }

    public void setProducts(List<SimpleSoldProduct> products) {
        this.products = products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
