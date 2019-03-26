

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseCryptoBook;
import com.intrinio.models.ApiResponseCryptoBookAsks;
import com.intrinio.models.ApiResponseCryptoBookBids;
import com.intrinio.models.ApiResponseCryptoCurrencies;
import com.intrinio.models.ApiResponseCryptoExchanges;
import com.intrinio.models.ApiResponseCryptoPairs;
import com.intrinio.models.ApiResponseCryptoPrices;
import com.intrinio.models.ApiResponseCryptoSnapshot;
import com.intrinio.models.ApiResponseCryptoStats;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CryptoApi
 */
@Ignore
public class CryptoApiTest {

    private final CryptoApi api = new CryptoApi();

    
    /**
     * Crypto Book Asks
     *
     * Returns the entire ask order book for a given Crypto Currency Pair and Crypto Exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoBookAsksTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        ApiResponseCryptoBookAsks response = api.getCryptoBookAsks(pair, exchange, currency);

        // TODO: test validations
    }
    
    /**
     * Crypto Book Bids
     *
     * Returns the entire bid order book for a given Crypto Currency Pair and Crypto Exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoBookBidsTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        ApiResponseCryptoBookBids response = api.getCryptoBookBids(pair, exchange, currency);

        // TODO: test validations
    }
    
    /**
     * Crypto Book Summary
     *
     * Returns the order book summary (bid/ask prices and size) for a given Crypto Currency Pair and Crypto Exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoBookSummaryTest() throws ApiException {
        Integer levels = null;
        String pair = null;
        String exchange = null;
        String currency = null;
        ApiResponseCryptoBook response = api.getCryptoBookSummary(levels, pair, exchange, currency);

        // TODO: test validations
    }
    
    /**
     * Crypto Currencies
     *
     * Returns a list of Crypto Currencies for which prices are available.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoCurrenciesTest() throws ApiException {
        String exchange = null;
        ApiResponseCryptoCurrencies response = api.getCryptoCurrencies(exchange);

        // TODO: test validations
    }
    
    /**
     * Crypto Exchanges
     *
     * Returns a list of Crypto Exchanges for which prices are available.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoExchangesTest() throws ApiException {
        String pair = null;
        ApiResponseCryptoExchanges response = api.getCryptoExchanges(pair);

        // TODO: test validations
    }
    
    /**
     * Crypto Pairs
     *
     * Returns a list of Crypto Currency Pairs for which data is available.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPairsTest() throws ApiException {
        String exchange = null;
        String currency = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoPairs response = api.getCryptoPairs(exchange, currency, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Crypto Prices
     *
     * Returns a list of available Crypto Currency Prices.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPricesTest() throws ApiException {
        String timeframe = null;
        String pair = null;
        String exchange = null;
        String currency = null;
        String timezone = null;
        String startDate = null;
        String startTime = null;
        String endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoPrices response = api.getCryptoPrices(timeframe, pair, exchange, currency, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Crypto Snapshot
     *
     * Returns a market snapshot over that last 24 hours for the given currency pair and exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoSnapshotTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        ApiResponseCryptoSnapshot response = api.getCryptoSnapshot(pair, exchange, currency);

        // TODO: test validations
    }
    
    /**
     * Crypto Stats
     *
     * Returns available stats on Crypto Currencies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoStatsTest() throws ApiException {
        String exchange = null;
        String currency = null;
        ApiResponseCryptoStats response = api.getCryptoStats(exchange, currency);

        // TODO: test validations
    }
    
}
