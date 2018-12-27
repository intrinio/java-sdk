

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseStockExchangeRealtimeStockPrices;
import com.intrinio.models.ApiResponseStockExchangeSecurities;
import com.intrinio.models.ApiResponseStockExchangeStockPriceAdjustments;
import com.intrinio.models.ApiResponseStockExchangeStockPrices;
import com.intrinio.models.ApiResponseStockExchanges;
import org.threeten.bp.LocalDate;
import com.intrinio.models.StockExchange;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StockExchangeApi
 */
@Ignore
public class StockExchangeApiTest {

    private final StockExchangeApi api = new StockExchangeApi();

    
    /**
     * Filter Stock Exchanges
     *
     * Returns Stock Exchanges matching the given filters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterStockExchangesTest() throws ApiException {
        String city = null;
        String country = null;
        String countryCode = null;
        ApiResponseStockExchanges response = api.filterStockExchanges(city, country, countryCode);

        // TODO: test validations
    }
    
    /**
     * All Stock Exchanges
     *
     * Returns all Stock Exchanges
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStockExchangesTest() throws ApiException {
        ApiResponseStockExchanges response = api.getAllStockExchanges();

        // TODO: test validations
    }
    
    /**
     * Lookup Stock Exchange
     *
     * Returns the Stock Exchange with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangeByIdTest() throws ApiException {
        String identifier = null;
        StockExchange response = api.getStockExchangeById(identifier);

        // TODO: test validations
    }
    
    /**
     * Stock Price Adjustments by Exchange
     *
     * Returns stock price adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangePriceAdjustmentsTest() throws ApiException {
        String identifier = null;
        LocalDate date = null;
        String nextPage = null;
        ApiResponseStockExchangeStockPriceAdjustments response = api.getStockExchangePriceAdjustments(identifier, date, nextPage);

        // TODO: test validations
    }
    
    /**
     * Stock Prices by Exchange
     *
     * Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangePricesTest() throws ApiException {
        String identifier = null;
        LocalDate date = null;
        String nextPage = null;
        ApiResponseStockExchangeStockPrices response = api.getStockExchangePrices(identifier, date, nextPage);

        // TODO: test validations
    }
    
    /**
     * Realtime Stock Prices by Exchange
     *
     * Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangeRealtimePricesTest() throws ApiException {
        String identifier = null;
        String source = null;
        String nextPage = null;
        ApiResponseStockExchangeRealtimeStockPrices response = api.getStockExchangeRealtimePrices(identifier, source, nextPage);

        // TODO: test validations
    }
    
    /**
     * Securities by Exchange
     *
     * Returns Securities traded on the Stock Exchange with &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangeSecuritiesTest() throws ApiException {
        String identifier = null;
        String nextPage = null;
        ApiResponseStockExchangeSecurities response = api.getStockExchangeSecurities(identifier, nextPage);

        // TODO: test validations
    }
    
}
