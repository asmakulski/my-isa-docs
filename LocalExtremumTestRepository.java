package com.isa.aem.local.extremum;

        import com.isa.aem.Currency;

        import java.time.LocalDate;
        import java.util.Arrays;
        import java.util.List;

public class LocalExtremumTestRepository {

    public List<Currency> manyCurrenciesWithTheSameRate = Arrays.asList(
            new Currency ("CHF", LocalDate.of(1980, 12, 12), 1.222),
            new Currency ("CHF", LocalDate.of(1999, 6, 26), 1.222),
            new Currency ("CHF", LocalDate.of(2018, 3, 1), 1.222),
            new Currency ("CHF", LocalDate.of(1980, 12, 12), 3.888),
            new Currency ("CHF", LocalDate.of(1999, 6, 26), 3.888),
            new Currency ("CHF", LocalDate.of(2018, 3, 1), 3.888)
    );

    public List<Currency> emptyList = Arrays.asList(
    );



    public List<Currency> currencyList = Arrays.asList(
            new Currency ("CHF", LocalDate.of(1980, 12, 12)),
            new Currency ("CHF", LocalDate.of(1999, 6, 26)),
            new Currency ("CHF", LocalDate.of(1999, 6, 26)),
            new Currency ("CHF", LocalDate.of(2000, 6, 26)),
            new Currency ("CHF", LocalDate.of(2018, 6, 26)),
            new Currency ("EUR", LocalDate.of(2000, 6, 26)),
            new Currency ("EUR", LocalDate.of(2005, 2, 2)),
            new Currency ("EUR", LocalDate.of(2008, 3, 15)),
            new Currency ("EUR", LocalDate.of(2010, 10, 10)),
            new Currency ("GBP", LocalDate.of(2018, 1, 1)),
            new Currency ("GBP", LocalDate.of(2018, 2, 1)),
            new Currency ("GBP", LocalDate.of(2018, 3, 1))
    );

}


