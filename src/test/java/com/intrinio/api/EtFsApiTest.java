

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
     * Returns a list of all currently listed ETFs, with relevant identification information including the ETF Name, Ticker, FIGI Ticker, and Exchange MIC for further usage with our ETF Metadata, Holdings, Stats, and Analytics offerings.
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
     * Returns classifications and reference data which consists of ~90 columns that give detailed information about an ETF. These granular details include asset class, expense ratio, index name, index weighting scheme, smart beta type and specific investment objectives.
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
     * Returns latest market analytics for a specified US ETF, including volume, trailing volumen, market cap, 52 week high, and 52 week low.
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
     * Returns holdings data that details all the constituent securities in each ETF with names, identifiers, and the weights for each security providing granular level transparency.
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
     * Returns comprehensive key US ETF performance statistics, including prices, NAVs, flows, returns, and much more for both trailing and calendar year periods.
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
     * Accepts a string of keyword combinations, and searches across the ETF name and ticker and returns a list of ETFs with related keywords.
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
