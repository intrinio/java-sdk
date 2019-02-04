

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseSecurities;
import com.intrinio.models.ApiResponseSecuritiesSearch;
import com.intrinio.models.ApiResponseSecurityHistoricalData;
import com.intrinio.models.ApiResponseSecurityIntradayPrices;
import com.intrinio.models.ApiResponseSecurityStockPriceAdjustments;
import com.intrinio.models.ApiResponseSecurityStockPrices;
import java.math.BigDecimal;
import com.intrinio.models.DividendRecord;
import com.intrinio.models.EarningsRecord;
import org.threeten.bp.LocalDate;
import com.intrinio.models.RealtimeStockPrice;
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
     * All Securities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSecuritiesTest() throws ApiException {
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseSecurities response = api.getAllSecurities(pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Security
     *
     * Returns the Security with the given &#x60;identifier&#x60;
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
     * Data Point (Number) for Security
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
     * Data Point (Text) for Security
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
     * Historical Data for Security
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
        String frequency = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseSecurityHistoricalData response = api.getSecurityHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Intraday Stock Prices for Security
     *
     * Return intraday stock prices for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityIntradayPricesTest() throws ApiException {
        String identifier = null;
        String source = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        ApiResponseSecurityIntradayPrices response = api.getSecurityIntradayPrices(identifier, source, startDate, startTime, endDate, endTime);

        // TODO: test validations
    }
    
    /**
     * Lastest Dividend Record for Security
     *
     * Returns the latest available dividend information for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityLatestDividendRecordTest() throws ApiException {
        String identifier = null;
        DividendRecord response = api.getSecurityLatestDividendRecord(identifier);

        // TODO: test validations
    }
    
    /**
     * Lastest Earnings Record for Security
     *
     * Returns latest available earnings information for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityLatestEarningsRecordTest() throws ApiException {
        String identifier = null;
        EarningsRecord response = api.getSecurityLatestEarningsRecord(identifier);

        // TODO: test validations
    }
    
    /**
     * Realtime Stock Price for Security
     *
     * Return the realtime stock price for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityRealtimePriceTest() throws ApiException {
        String identifier = null;
        String source = null;
        RealtimeStockPrice response = api.getSecurityRealtimePrice(identifier, source);

        // TODO: test validations
    }
    
    /**
     * Stock Price Adjustments by Security
     *
     * Returns stock price adjustments for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityStockPriceAdjustmentsTest() throws ApiException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseSecurityStockPriceAdjustments response = api.getSecurityStockPriceAdjustments(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Stock Prices by Security
     *
     * Return end-of-day stock prices for the Security with the given &#x60;identifier&#x60;
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
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseSecurityStockPrices response = api.getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Screen Securities
     *
     * Screen Securities using complex logic
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
        BigDecimal pageSize = null;
        List<SecurityScreenResult> response = api.screenSecurities(logic, orderColumn, orderDirection, primaryOnly, pageSize);

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
        BigDecimal pageSize = null;
        ApiResponseSecuritiesSearch response = api.searchSecurities(query, pageSize);

        // TODO: test validations
    }
    
}
