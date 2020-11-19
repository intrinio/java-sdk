

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseOptionPrices;
import com.intrinio.models.ApiResponseOptionPricesRealtime;
import com.intrinio.models.ApiResponseOptions;
import com.intrinio.models.ApiResponseOptionsChain;
import com.intrinio.models.ApiResponseOptionsChainRealtime;
import com.intrinio.models.ApiResponseOptionsExpirations;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
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
    public void getOptionsTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String expiration = null;
        String expirationAfter = null;
        String expirationBefore = null;
        Integer pageSize = null;
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
    public void getOptionsChainTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String expiration = null;
        LocalDate date = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String moneyness = null;
        Integer pageSize = null;
        ApiResponseOptionsChain response = api.getOptionsChain(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize);

        // TODO: test validations
    }
    
    /**
     * Options Chain Realtime
     *
     * Returns all realtime options contracts and their prices for the given symbol and expiration date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsChainRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String expiration = null;
        String source = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        BigDecimal volumeGreaterThan = null;
        BigDecimal volumeLessThan = null;
        BigDecimal openInterestGreaterThan = null;
        BigDecimal openInterestLessThan = null;
        String moneyness = null;
        ApiResponseOptionsChainRealtime response = api.getOptionsChainRealtime(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness);

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
    public void getOptionsExpirationsTest() throws ApiException, NoSuchMethodException {
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
    public void getOptionsPricesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseOptionPrices response = api.getOptionsPrices(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Option Prices Realtime
     *
     * Returns all option prices for a given option contract identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesRealtimeTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        ApiResponseOptionPricesRealtime response = api.getOptionsPricesRealtime(identifier, source);

        // TODO: test validations
    }
    
}
