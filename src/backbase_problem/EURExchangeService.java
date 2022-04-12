package backbase_problem;

import java.math.BigDecimal;
import java.util.Optional;

public class EURExchangeService implements ExchangeService{

    //method provides formula to convert any curr to eur.
    @Override
    public Optional<BigDecimal> rate(String currency) {
        return Optional.empty();
    }
}
