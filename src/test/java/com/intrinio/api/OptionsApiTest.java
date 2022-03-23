

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseOptionPrices;
import com.intrinio.models.ApiResponseOptions;
import com.intrinio.models.ApiResponseOptionsChain;
import com.intrinio.models.ApiResponseOptionsChainEod;
import com.intrinio.models.ApiResponseOptionsChainRealtime;
import com.intrinio.models.ApiResponseOptionsExpirations;
import com.intrinio.models.ApiResponseOptionsPriceRealtime;
import com.intrinio.models.ApiResponseOptionsPricesBatchRealtime;
import com.intrinio.models.ApiResponseOptionsPricesEod;
import com.intrinio.models.ApiResponseOptionsRealtime;
import com.intrinio.models.ApiResponseOptionsStatsRealtime;
import com.intrinio.models.ApiResponseOptionsTickers;
import com.intrinio.models.ApiResponseOptionsUnusualActivity;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import com.intrinio.models.OptionContractsList;
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
     * Options Tickers
     *
     * Returns all tickers that have existing options contracts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllOptionsTickersTest() throws ApiException, NoSuchMethodException {
        ApiResponseOptionsTickers response = api.getAllOptionsTickers();

        // TODO: test validations
    }
    
    /**
     * Option Expirations Realtime
     *
     * Returns all realtime option contract expiration dates for a given symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionExpirationsRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String after = null;
        String before = null;
        String source = null;
        ApiResponseOptionsExpirations response = api.getOptionExpirationsRealtime(symbol, after, before, source);

        // TODO: test validations
    }
    
    /**
     * Option Strikes Realtime
     *
     * Returns all realtime options contracts and their prices for the given symbol and strike.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionStrikesRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        BigDecimal strike = null;
        ApiResponseOptionsChainRealtime response = api.getOptionStrikesRealtime(symbol, strike);

        // TODO: test validations
    }
    
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
     * Options by Symbol Realtime
     *
     * Returns the master list of realtime option contracts for a given symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsBySymbolRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String expiration = null;
        String expirationAfter = null;
        String expirationBefore = null;
        String source = null;
        ApiResponseOptionsRealtime response = api.getOptionsBySymbolRealtime(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source);

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
     * Options Chain EOD
     *
     * Returns all EOD options contracts and their prices for the given symbol and expiration date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsChainEodTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String expiration = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        ApiResponseOptionsChainEod response = api.getOptionsChainEod(symbol, expiration, type, strike, strikeGreaterThan, strikeLessThan);

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
     * Option Prices Batch Realtime
     *
     * Returns options prices for a supplied list of option symbols.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesBatchRealtimeTest() throws ApiException, NoSuchMethodException {
        OptionContractsList body = null;
        String source = null;
        ApiResponseOptionsPricesBatchRealtime response = api.getOptionsPricesBatchRealtime(body, source);

        // TODO: test validations
    }
    
    /**
     * Option Prices EOD
     *
     * Returns all option prices for a given option contract identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesEodTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ApiResponseOptionsPricesEod response = api.getOptionsPricesEod(identifier);

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
        ApiResponseOptionsPriceRealtime response = api.getOptionsPricesRealtime(identifier, source);

        // TODO: test validations
    }
    
    /**
     * Option Stats Realtime
     *
     * Returns all option stats (greeks and implied volatility) and factors used to calculate them, for a given option contract identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsStatsRealtimeTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        ApiResponseOptionsStatsRealtime response = api.getOptionsStatsRealtime(identifier, source);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity
     *
     * Returns unusual trades for a given identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String source = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivity(symbol, source);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity Intraday
     *
     * Returns unusual trades for a given identifier within the query parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityIntradayTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String nextPage = null;
        Integer pageSize = null;
        String activityType = null;
        String sentiment = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Object minimumTotalValue = null;
        Object maximumTotalValue = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivityIntraday(symbol, nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity Universal
     *
     * Returns nusual trades for all underlying security symbols.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityUniversalTest() throws ApiException, NoSuchMethodException {
        String source = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivityUniversal(source);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity Universal Intraday
     *
     * Returns unusual trades for all underlying security symbols within the query parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityUniversalIntradayTest() throws ApiException, NoSuchMethodException {
        String nextPage = null;
        Integer pageSize = null;
        String activityType = null;
        String sentiment = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Object minimumTotalValue = null;
        Object maximumTotalValue = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivityUniversalIntraday(nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue);

        // TODO: test validations
    }
    
}
