/*
 * Intrinio API
 * Welcome to the Intrinio API! Through our Marketplace, we offer a wide selection of financial data feeds sourced by our own proprietary processes as well as from many data vendors. The primary application of the Intrinio API is for use in third-party applications and integrations or for end-users utilizing the Excel add-in and Google Sheets add-on. The Intrinio API uses HTTPS verbs and a RESTful endpoint structure, which makes it easy to request data from Intrinio. Responses are delivered in JSON format. If you need additional help in using the API, go to our home page (https://intrinio.com) and click on the chat icon in the lower right corner.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import java.math.BigDecimal;
import com.intrinio.models.EconomicIndex;
import com.intrinio.models.EconomicIndexSummary;
import com.intrinio.models.HistoricalData;
import org.threeten.bp.LocalDate;
import com.intrinio.models.SICIndex;
import com.intrinio.models.StockMarketIndex;
import com.intrinio.models.StockMarketIndexSummary;
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
     * Get ALl Economic Indices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllEconomicIndicesTest() throws ApiException {
        String nextPage = null;
        List<EconomicIndexSummary> response = api.getAllEconomicIndices(nextPage);

        // TODO: test validations
    }
    
    /**
     * Get All SIC Indices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSicIndicesTest() throws ApiException {
        String nextPage = null;
        List<SICIndex> response = api.getAllSicIndices(nextPage);

        // TODO: test validations
    }
    
    /**
     * Get All Stock Market Indices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStockMarketIndicesTest() throws ApiException {
        String nextPage = null;
        List<StockMarketIndexSummary> response = api.getAllStockMarketIndices(nextPage);

        // TODO: test validations
    }
    
    /**
     * Get an Economic Index by ID
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
     * Get Economic Index Data Point (Number)
     *
     * Returns a numeric value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexDataPointNumberTest() throws ApiException {
        String identifier = null;
        String item = null;
        BigDecimal response = api.getEconomicIndexDataPointNumber(identifier, item);

        // TODO: test validations
    }
    
    /**
     * Get Economic Index Data Point (Text)
     *
     * Returns a text value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexDataPointTextTest() throws ApiException {
        String identifier = null;
        String item = null;
        String response = api.getEconomicIndexDataPointText(identifier, item);

        // TODO: test validations
    }
    
    /**
     * Get Economic Index Historical Data
     *
     * Returns historical values for the given &#x60;item&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEconomicIndexHistoricalDataTest() throws ApiException {
        String identifier = null;
        String item = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        BigDecimal pageSize = null;
        List<HistoricalData> response = api.getEconomicIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get an SIC Index by ID
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
     * Get SIC Index Data Point (Number)
     *
     * Returns a numeric value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexDataPointNumberTest() throws ApiException {
        String identifier = null;
        String item = null;
        BigDecimal response = api.getSicIndexDataPointNumber(identifier, item);

        // TODO: test validations
    }
    
    /**
     * Get SIC Index Data Point (Text)
     *
     * Returns a text value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexDataPointTextTest() throws ApiException {
        String identifier = null;
        String item = null;
        String response = api.getSicIndexDataPointText(identifier, item);

        // TODO: test validations
    }
    
    /**
     * Get SIC Index Historical Data
     *
     * Returns historical values for the given &#x60;item&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSicIndexHistoricalDataTest() throws ApiException {
        String identifier = null;
        String item = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        BigDecimal pageSize = null;
        List<HistoricalData> response = api.getSicIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a Stock Market Index by ID
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
     * Get Stock Market Index Data Point (Number)
     *
     * Returns a numeric value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockMarketIndexDataPointNumberTest() throws ApiException {
        String identifier = null;
        String item = null;
        BigDecimal response = api.getStockMarketIndexDataPointNumber(identifier, item);

        // TODO: test validations
    }
    
    /**
     * Get Stock Market Index Data Point (Text)
     *
     * Returns a text value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockMarketIndexDataPointTextTest() throws ApiException {
        String identifier = null;
        String item = null;
        String response = api.getStockMarketIndexDataPointText(identifier, item);

        // TODO: test validations
    }
    
    /**
     * Get Stock Market Index Historical Data
     *
     * Returns historical values for the given &#x60;item&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockMarketIndexHistoricalDataTest() throws ApiException {
        String identifier = null;
        String item = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        BigDecimal pageSize = null;
        List<HistoricalData> response = api.getStockMarketIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize);

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
        String nextPage = null;
        List<EconomicIndexSummary> response = api.searchEconomicIndices(query, nextPage);

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
        String nextPage = null;
        List<SICIndex> response = api.searchSicIndices(query, nextPage);

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
        String nextPage = null;
        List<StockMarketIndexSummary> response = api.searchStockMarketsIndices(query, nextPage);

        // TODO: test validations
    }
    
}
