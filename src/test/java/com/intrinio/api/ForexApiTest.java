

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseForexCurrencies;
import com.intrinio.models.ApiResponseForexPairs;
import com.intrinio.models.ApiResponseForexPrices;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ForexApi
 */
@Ignore
public class ForexApiTest {

    private final ForexApi api = new ForexApi();

    
    /**
     * Forex Currencies
     *
     * Returns a list of forex currencies for which prices are available.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getForexCurrenciesTest() throws ApiException {
        ApiResponseForexCurrencies response = api.getForexCurrencies();

        // TODO: test validations
    }
    
    /**
     * Forex Currency Pairs
     *
     * Returns a list of currency pairs used to request foreign exchange (forex) market price data. The currency that is used as the reference is called quote currency and the currency that is quoted in relation is called the base currency. For example, in the pair code “EURGBP” with a price of 0.88, one Euro (base currency) can be exchanged for 0.88 British Pounds (quote currency).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getForexPairsTest() throws ApiException {
        ApiResponseForexPairs response = api.getForexPairs();

        // TODO: test validations
    }
    
    /**
     * Forex Currency Prices
     *
     * Provides a list of forex price quotes for a given forex currency pair and timeframe.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getForexPricesTest() throws ApiException {
        String pair = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseForexPrices response = api.getForexPrices(pair, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
}
