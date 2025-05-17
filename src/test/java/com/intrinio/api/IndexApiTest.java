

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseEconomicIndexHistoricalData;
import com.intrinio.models.ApiResponseEconomicIndices;
import com.intrinio.models.ApiResponseEconomicIndicesSearch;
import com.intrinio.models.ApiResponseEodIndexPrices;
import com.intrinio.models.ApiResponseEodIndexPricesAll;
import com.intrinio.models.ApiResponseIndex;
import com.intrinio.models.ApiResponseIndexConstituents;
import com.intrinio.models.ApiResponseIndexIntervals;
import com.intrinio.models.ApiResponseIndices;
import com.intrinio.models.ApiResponseRealtimeIndexPrices;
import com.intrinio.models.ApiResponseSICIndexHistoricalData;
import com.intrinio.models.ApiResponseSICIndices;
import com.intrinio.models.ApiResponseSICIndicesSearch;
import com.intrinio.models.ApiResponseStockMarketIndexHistoricalData;
import com.intrinio.models.ApiResponseStockMarketIndices;
import com.intrinio.models.ApiResponseStockMarketIndicesSearch;
import java.math.BigDecimal;
import com.intrinio.models.EconomicIndex;
import org.threeten.bp.LocalDate;
import com.intrinio.models.RealtimeIndexPrice;
import com.intrinio.models.SICIndex;
import com.intrinio.models.StockMarketIndex;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndexApi
 */
@Ignore
public class IndexApiTest {

    private final IndexApi api = new IndexApi();

    
    /**
     * All Economic Indices
     *
     * Returns a list of reference data on more than 200,000 economic indices from the Federal Reserve Economic Data (FRED) database.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEconomicIndicesTest() throws ApiException, NoSuchMethodException {
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseEconomicIndices response = api.getAllEconomicIndices(pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * All End of Day Index Prices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEodIndexPricesTest() throws ApiException, NoSuchMethodException {
        Integer pageSize = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        ApiResponseEodIndexPricesAll response = api.getAllEodIndexPrices(pageSize, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * All Index Summaries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllIndexSummariesTest() throws ApiException, NoSuchMethodException {
        Integer pageSize = null;
        ApiResponseIndices response = api.getAllIndexSummaries(pageSize);

        // TODO: test validations
    }
    
    /**
     * All Realtime Index Prices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRealtimeIndexPricesTest() throws ApiException, NoSuchMethodException {
        Integer pageSize = null;
        ApiResponseRealtimeIndexPrices response = api.getAllRealtimeIndexPrices(pageSize);

        // TODO: test validations
    }
    
    /**
     * All SIC Indices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSicIndicesTest() throws ApiException, NoSuchMethodException {
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSICIndices response = api.getAllSicIndices(pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Stock Market Indices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStockMarketIndicesTest() throws ApiException, NoSuchMethodException {
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockMarketIndices response = api.getAllStockMarketIndices(pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Economic Index
     *
     * Returns reference data for a specified Federal Reserve Economic Data (FRED) series ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        EconomicIndex response = api.getEconomicIndexById(identifier);

        // TODO: test validations
    }
    
    /**
     * Data Point (Number) for an Economic Index
     *
     * Returns latest data for a specified Federal Reserve Economic Data (FRED) ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexDataPointNumberTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        BigDecimal response = api.getEconomicIndexDataPointNumber(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Data Point (Text) for an Economic Index
     *
     * Returns a text value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexDataPointTextTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String response = api.getEconomicIndexDataPointText(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Historical Data for an Economic Index
     *
     * Returns historical data for a specified Federal Reserve Economic Data (FRED) ID over a period of time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexHistoricalDataTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseEconomicIndexHistoricalData response = api.getEconomicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * End of Day Index Prices By Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEodIndexPriceByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        ApiResponseEodIndexPrices response = api.getEodIndexPriceById(identifier, pageSize, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Index Constituents By Index Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndexConstituentsByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ApiResponseIndexConstituents response = api.getIndexConstituentsById(identifier);

        // TODO: test validations
    }
    
    /**
     * Index Intervals
     *
     * Returns a list of interval data points for a specified index, including open, close, high, low, volume, and average price. Intervals are available in 60-minute, 30-minute, 15-minute, 10-minute, 5-minute, and 1-minute increments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndexIntervalsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String intervalSize = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        String timezone = null;
        Integer pageSize = null;
        ApiResponseIndexIntervals response = api.getIndexIntervals(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize);

        // TODO: test validations
    }
    
    /**
     * Index Summary By Identifier
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndexSummaryByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ApiResponseIndex response = api.getIndexSummaryById(identifier);

        // TODO: test validations
    }
    
    /**
     * Realtime Index Price By Identifier
     *
     * Returns the realtime price for an index.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRealtimeIndexPriceByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        RealtimeIndexPrice response = api.getRealtimeIndexPriceById(identifier);

        // TODO: test validations
    }
    
    /**
     * Lookup SIC Index
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        SICIndex response = api.getSicIndexById(identifier);

        // TODO: test validations
    }
    
    /**
     * Data Point (Number) for an SIC Index
     *
     * Returns a numeric value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexDataPointNumberTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        BigDecimal response = api.getSicIndexDataPointNumber(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Data Point (Text) for an SIC Index
     *
     * Returns a text value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexDataPointTextTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String response = api.getSicIndexDataPointText(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Historical Data for an SIC Index
     *
     * Returns historical values for the given &#x60;tag&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexHistoricalDataTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSICIndexHistoricalData response = api.getSicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Stock Market Index
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockMarketIndexByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        StockMarketIndex response = api.getStockMarketIndexById(identifier);

        // TODO: test validations
    }
    
    /**
     * Data Point (Number) for Stock Market Index
     *
     * Returns a numeric value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockMarketIndexDataPointNumberTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        BigDecimal response = api.getStockMarketIndexDataPointNumber(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Data Point (Text) for Stock Market Index
     *
     * Returns a text value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockMarketIndexDataPointTextTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String response = api.getStockMarketIndexDataPointText(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Historical Data for Stock Market Index
     *
     * Returns historical values for the given &#x60;tag&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockMarketIndexHistoricalDataTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockMarketIndexHistoricalData response = api.getStockMarketIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Search Economic Indices
     *
     * Search the Federal Reserve Economic Data (FRED) database and return a list of economic indices matching the text query parameter passed through.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchEconomicIndicesTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Integer pageSize = null;
        ApiResponseEconomicIndicesSearch response = api.searchEconomicIndices(query, pageSize);

        // TODO: test validations
    }
    
    /**
     * Search SIC Indices
     *
     * Searches for indices using the text in &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSicIndicesTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Integer pageSize = null;
        ApiResponseSICIndicesSearch response = api.searchSicIndices(query, pageSize);

        // TODO: test validations
    }
    
    /**
     * Search Stock Market Indices
     *
     * Searches for indices using the text in &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchStockMarketsIndicesTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Integer pageSize = null;
        ApiResponseStockMarketIndicesSearch response = api.searchStockMarketsIndices(query, pageSize);

        // TODO: test validations
    }
    
}
