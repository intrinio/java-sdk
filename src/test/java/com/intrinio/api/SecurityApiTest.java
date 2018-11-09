

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseSecurities;
import com.intrinio.models.ApiResponseSecurityHistoricalData;
import com.intrinio.models.ApiResponseSecurityStockPriceAdjustments;
import com.intrinio.models.ApiResponseSecurityStockPrices;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import com.intrinio.models.Security;
import com.intrinio.models.SecurityScreenGroup;
import com.intrinio.models.SecurityScreenResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
@Ignore
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    
    /**
     * Get All Securiites
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSecuritiesTest() throws ApiException {
        String nextPage = null;
        ApiResponseSecurities response = api.getAllSecurities(nextPage);

        // TODO: test validations
    }
    
    /**
     * Get a Security by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityByIdTest() throws ApiException {
        String identifier = null;
        Security response = api.getSecurityById(identifier);

        // TODO: test validations
    }
    
    /**
     * Get Security Data Point (Number)
     *
     * Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityDataPointNumberTest() throws ApiException {
        String identifier = null;
        String tag = null;
        BigDecimal response = api.getSecurityDataPointNumber(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Get Security Data Point (Text)
     *
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityDataPointTextTest() throws ApiException {
        String identifier = null;
        String tag = null;
        String response = api.getSecurityDataPointText(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Get Security Historical Data
     *
     * Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityHistoricalDataTest() throws ApiException {
        String identifier = null;
        String tag = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        String nextPage = null;
        ApiResponseSecurityHistoricalData response = api.getSecurityHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage);

        // TODO: test validations
    }
    
    /**
     * Get Stock Price Adjustments for Security
     *
     * Return stock price adjustments for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityStockPriceAdjustmentsTest() throws ApiException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String nextPage = null;
        ApiResponseSecurityStockPriceAdjustments response = api.getSecurityStockPriceAdjustments(identifier, startDate, endDate, nextPage);

        // TODO: test validations
    }
    
    /**
     * Get Stock Prices for Security
     *
     * Return stock prices for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityStockPricesTest() throws ApiException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String frequency = null;
        String nextPage = null;
        ApiResponseSecurityStockPrices response = api.getSecurityStockPrices(identifier, startDate, endDate, frequency, nextPage);

        // TODO: test validations
    }
    
    /**
     * Screen Securities
     *
     * Screen securities using complex logic
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void screenSecuritiesTest() throws ApiException {
        SecurityScreenGroup logic = null;
        String orderColumn = null;
        String orderDirection = null;
        Boolean primaryOnly = null;
        List<SecurityScreenResult> response = api.screenSecurities(logic, orderColumn, orderDirection, primaryOnly);

        // TODO: test validations
    }
    
    /**
     * Search Securities
     *
     * Searches for Securities matching the text &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSecuritiesTest() throws ApiException {
        String query = null;
        ApiResponseSecurities response = api.searchSecurities(query);

        // TODO: test validations
    }
    
}
