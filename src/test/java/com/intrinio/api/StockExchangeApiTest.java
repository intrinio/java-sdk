

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseStockExchangeBetas;
import com.intrinio.models.ApiResponseStockExchangeMovers;
import com.intrinio.models.ApiResponseStockExchangeQuote;
import com.intrinio.models.ApiResponseStockExchangeRealtimeStockPrices;
import com.intrinio.models.ApiResponseStockExchangeSecurities;
import com.intrinio.models.ApiResponseStockExchangeStockPriceAdjustments;
import com.intrinio.models.ApiResponseStockExchangeStockPrices;
import com.intrinio.models.ApiResponseStockExchanges;
import java.math.BigDecimal;
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
     * All Stock Exchanges
     *
     * Returns all Stock Exchanges matching the specified parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStockExchangesTest() throws ApiException, NoSuchMethodException {
        String city = null;
        String country = null;
        String countryCode = null;
        Integer pageSize = null;
        ApiResponseStockExchanges response = api.getAllStockExchanges(city, country, countryCode, pageSize);

        // TODO: test validations
    }
    
    /**
     * Security Betas
     *
     * Returns security beta data in the Stock Exchange with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangeBetasTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String type = null;
        Object date = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockExchangeBetas response = api.getStockExchangeBetas(identifier, type, date, pageSize, nextPage);

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
    public void getStockExchangeByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        StockExchange response = api.getStockExchangeById(identifier);

        // TODO: test validations
    }
    
    /**
     * Top Gainers by Exchange
     *
     * Returns securities with the highest gain percent change traded on the chosen stock exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangeGainersTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        BigDecimal minPrice = null;
        Integer pageSize = null;
        String source = null;
        ApiResponseStockExchangeMovers response = api.getStockExchangeGainers(identifier, minPrice, pageSize, source);

        // TODO: test validations
    }
    
    /**
     * Top Losers by Exchange
     *
     * Returns securities with the highest loss percent change traded on the chosen stock exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangeLosersTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        BigDecimal minPrice = null;
        Integer pageSize = null;
        String source = null;
        ApiResponseStockExchangeMovers response = api.getStockExchangeLosers(identifier, minPrice, pageSize, source);

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
    public void getStockExchangePriceAdjustmentsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate date = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockExchangeStockPriceAdjustments response = api.getStockExchangePriceAdjustments(identifier, date, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Dividends by date for exchange
     *
     * Returns dividend adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangePriceAdjustmentsDividendsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate date = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockExchangeStockPriceAdjustments response = api.getStockExchangePriceAdjustmentsDividends(identifier, date, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Splits by date for exchange
     *
     * Returns split adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangePriceAdjustmentsSplitsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate date = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockExchangeStockPriceAdjustments response = api.getStockExchangePriceAdjustmentsSplits(identifier, date, pageSize, nextPage);

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
    public void getStockExchangePricesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate date = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        List<String> tickers = null;
        String nextPage2 = null;
        ApiResponseStockExchangeStockPrices response = api.getStockExchangePrices(identifier, date, startDate, endDate, pageSize, nextPage, tickers, nextPage2);

        // TODO: test validations
    }
    
    /**
     * Realtime Quote Prices by Exchange
     *
     * Returns many popular metrics for securities from a given exchange &#39;identifier&#39; from multiple products conveniently in one API. Realtime stock price data requires at least one realtime product subscription (IEX, NASDAQ Basic, and/or Delayed SIP).  If you are subscribed to multiple realtime stock price products, the api will return the most recent realtime stock price. Previous close price and percent change fields require both an EoD US Stock Price subscription and a realtime stock price subscription. Market_cap, price_to_earnings, and dividendyield data fields require a fundamentals subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStockExchangeQuoteTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        List<String> tickers = null;
        String source = null;
        Boolean activeOnly = null;
        ApiResponseStockExchangeQuote response = api.getStockExchangeQuote(identifier, tickers, source, activeOnly);

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
    public void getStockExchangeRealtimePricesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        List<String> source = null;
        Boolean activeOnly = null;
        Boolean tradedToday = null;
        Integer pageSize = null;
        List<String> tickers = null;
        String nextPage = null;
        ApiResponseStockExchangeRealtimeStockPrices response = api.getStockExchangeRealtimePrices(identifier, source, activeOnly, tradedToday, pageSize, tickers, nextPage);

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
    public void getStockExchangeSecuritiesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseStockExchangeSecurities response = api.getStockExchangeSecurities(identifier, pageSize, nextPage);

        // TODO: test validations
    }
    
}
