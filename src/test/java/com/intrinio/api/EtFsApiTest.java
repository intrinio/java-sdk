

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseETFHoldings;
import com.intrinio.models.ApiResponseETFs;
import com.intrinio.models.ETF;
import com.intrinio.models.ETFAnalytics;
import com.intrinio.models.ETFStats;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EtFsApi
 */
@Ignore
public class EtFsApiTest {

    private final EtFsApi api = new EtFsApi();

    
    /**
     * All ETFs
     *
     * Returns a list of Exchange Traded Funds (ETFs) sourced from FirstBridge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEtfsTest() throws ApiException, NoSuchMethodException {
        String exchange = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseETFs response = api.getAllEtfs(exchange, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup ETF
     *
     * Returns the Exchange Traded Fund (ETF) with the given identifier
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEtfTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ETF response = api.getEtf(identifier);

        // TODO: test validations
    }
    
    /**
     * ETF Analytics
     *
     * Returns analytics for the Exchange Traded Fund (ETF) including volume, market cap, 52 week high, and 52 week low
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEtfAnalyticsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ETFAnalytics response = api.getEtfAnalytics(identifier);

        // TODO: test validations
    }
    
    /**
     * ETF Holdings
     *
     * Returns the holdings sorted by weight descending and the Exchange Traded Fund (ETF) summary
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEtfHoldingsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseETFHoldings response = api.getEtfHoldings(identifier, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Exchange Traded Fund (ETF) stats
     *
     * Returns daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEtfStatsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ETFStats response = api.getEtfStats(identifier);

        // TODO: test validations
    }
    
    /**
     * Search ETFs
     *
     * Searches for Exchange Traded Funds (ETFs) matching the text &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchEtfsTest() throws ApiException, NoSuchMethodException {
        String query = null;
        ApiResponseETFs response = api.searchEtfs(query);

        // TODO: test validations
    }
    
}
