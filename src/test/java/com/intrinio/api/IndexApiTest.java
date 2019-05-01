

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseEconomicIndexHistoricalData;
import com.intrinio.models.ApiResponseEconomicIndices;
import com.intrinio.models.ApiResponseEconomicIndicesSearch;
import com.intrinio.models.ApiResponseSICIndexHistoricalData;
import com.intrinio.models.ApiResponseSICIndices;
import com.intrinio.models.ApiResponseSICIndicesSearch;
import com.intrinio.models.ApiResponseStockMarketIndexHistoricalData;
import com.intrinio.models.ApiResponseStockMarketIndices;
import com.intrinio.models.ApiResponseStockMarketIndicesSearch;
import java.math.BigDecimal;
import com.intrinio.models.EconomicIndex;
import org.threeten.bp.LocalDate;
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
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEconomicIndicesTest() throws ApiException {
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseEconomicIndices response = api.getAllEconomicIndices(pageSize, nextPage);

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
    public void getAllSicIndicesTest() throws ApiException {
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
    public void getAllStockMarketIndicesTest() throws ApiException {
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockMarketIndices response = api.getAllStockMarketIndices(pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Economic Index
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexByIdTest() throws ApiException {
        String identifier = null;
        EconomicIndex response = api.getEconomicIndexById(identifier);

        // TODO: test validations
    }
    
    /**
     * Data Point (Number) for an Economic Index
     *
     * Returns a numeric value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexDataPointNumberTest() throws ApiException {
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
    public void getEconomicIndexDataPointTextTest() throws ApiException {
        String identifier = null;
        String tag = null;
        String response = api.getEconomicIndexDataPointText(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Historical Data for an Economic Index
     *
     * Returns historical values for the given &#x60;tag&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexHistoricalDataTest() throws ApiException {
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
     * Lookup SIC Index
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexByIdTest() throws ApiException {
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
    public void getSicIndexDataPointNumberTest() throws ApiException {
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
    public void getSicIndexDataPointTextTest() throws ApiException {
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
    public void getSicIndexHistoricalDataTest() throws ApiException {
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
    public void getStockMarketIndexByIdTest() throws ApiException {
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
    public void getStockMarketIndexDataPointNumberTest() throws ApiException {
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
    public void getStockMarketIndexDataPointTextTest() throws ApiException {
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
    public void getStockMarketIndexHistoricalDataTest() throws ApiException {
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
     * Searches for indices using the text in &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchEconomicIndicesTest() throws ApiException {
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
    public void searchSicIndicesTest() throws ApiException {
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
    public void searchStockMarketsIndicesTest() throws ApiException {
        String query = null;
        Integer pageSize = null;
        ApiResponseStockMarketIndicesSearch response = api.searchStockMarketsIndices(query, pageSize);

        // TODO: test validations
    }
    
}
