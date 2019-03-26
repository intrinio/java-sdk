

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseOptionPrices;
import com.intrinio.models.ApiResponseOptions;
import com.intrinio.models.ApiResponseOptionsChain;
import com.intrinio.models.ApiResponseOptionsExpirations;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OptionsApi
 */
@Ignore
public class OptionsApiTest {

    private final OptionsApi api = new OptionsApi();

    
    /**
     * Options
     *
     * Returns the master list of option contracts for a given symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsTest() throws ApiException {
        String symbol = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String expiration = null;
        String expirationAfter = null;
        String expirationBefore = null;
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseOptions response = api.getOptions(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Options Chain
     *
     * Returns all options contracts and their prices for the given symbol and expiration date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsChainTest() throws ApiException {
        String symbol = null;
        String expiration = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String moneyness = null;
        BigDecimal pageSize = null;
        ApiResponseOptionsChain response = api.getOptionsChain(symbol, expiration, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize);

        // TODO: test validations
    }
    
    /**
     * Options Expirations
     *
     * Returns all option contract expiration dates for a given symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsExpirationsTest() throws ApiException {
        String symbol = null;
        String after = null;
        String before = null;
        ApiResponseOptionsExpirations response = api.getOptionsExpirations(symbol, after, before);

        // TODO: test validations
    }
    
    /**
     * Option Prices
     *
     * Returns all option prices for a given option contract identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesTest() throws ApiException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseOptionPrices response = api.getOptionsPrices(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
}
