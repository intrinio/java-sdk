

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseOptionPrices;
import com.intrinio.models.ApiResponseOptions;
import com.intrinio.models.ApiResponseOptionsAggregates;
import com.intrinio.models.ApiResponseOptionsChain;
import com.intrinio.models.ApiResponseOptionsChainEod;
import com.intrinio.models.ApiResponseOptionsChainRealtime;
import com.intrinio.models.ApiResponseOptionsExpirations;
import com.intrinio.models.ApiResponseOptionsGreekContractRealtime;
import com.intrinio.models.ApiResponseOptionsGreeksByTickerRealtime;
import com.intrinio.models.ApiResponseOptionsImpliedMove;
import com.intrinio.models.ApiResponseOptionsPriceRealtime;
import com.intrinio.models.ApiResponseOptionsPricesBatchRealtime;
import com.intrinio.models.ApiResponseOptionsPricesByTickerEod;
import com.intrinio.models.ApiResponseOptionsPricesByTickerRealtime;
import com.intrinio.models.ApiResponseOptionsPricesEod;
import com.intrinio.models.ApiResponseOptionsRealtime;
import com.intrinio.models.ApiResponseOptionsStatsRealtime;
import com.intrinio.models.ApiResponseOptionsTickers;
import com.intrinio.models.ApiResponseOptionsUnusualActivity;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import com.intrinio.models.OptionContractsList;
import com.intrinio.models.OptionIntervalsMoversResult;
import com.intrinio.models.OptionIntervalsResult;
import com.intrinio.models.OptionSnapshotsResult;
import com.intrinio.models.OptionTradesResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OptionsApi
 */
@Ignore
public class OptionsApiTest {

    private final OptionsApi api = new OptionsApi();

    
    /**
     * Options Tickers
     *
     * Returns all tickers that have existing options contracts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllOptionsTickersTest() throws ApiException, NoSuchMethodException {
        Boolean useUnderlyingSymbols = null;
        ApiResponseOptionsTickers response = api.getAllOptionsTickers(useUnderlyingSymbols);

        // TODO: test validations
    }
    
    /**
     * Total open interest and volume aggregated by ticker
     *
     * Returns total open interest and volume by ticker
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionAggregatesTest() throws ApiException, NoSuchMethodException {
        Object date = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseOptionsAggregates response = api.getOptionAggregates(date, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Options Expirations
     *
     * Returns a list of all current and upcoming option contract expiration dates for a particular symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionExpirationsRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String after = null;
        String before = null;
        String source = null;
        Boolean includeRelatedSymbols = null;
        ApiResponseOptionsExpirations response = api.getOptionExpirationsRealtime(symbol, after, before, source, includeRelatedSymbols);

        // TODO: test validations
    }
    
    /**
     * Option Strikes Realtime
     *
     * Returns a list of the latest top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all call/put contracts that match the strike and symbol specified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionStrikesRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        BigDecimal strike = null;
        String source = null;
        String stockPriceSource = null;
        String model = null;
        Boolean showExtendedPrice = null;
        Boolean includeRelatedSymbols = null;
        ApiResponseOptionsChainRealtime response = api.getOptionStrikesRealtime(symbol, strike, source, stockPriceSource, model, showExtendedPrice, includeRelatedSymbols);

        // TODO: test validations
    }
    
    /**
     * Option Trades
     *
     * Returns all trades between start time and end time, up to seven days ago for the specified source.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionTradesTest() throws ApiException, NoSuchMethodException {
        String source = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        String timezone = null;
        Integer pageSize = null;
        Integer minSize = null;
        String security = null;
        String nextPage = null;
        OptionTradesResult response = api.getOptionTrades(source, startDate, startTime, endDate, endTime, timezone, pageSize, minSize, security, nextPage);

        // TODO: test validations
    }
    
    /**
     * Option Trades By Contract
     *
     * Returns all trades for a contract between start time and end time, up to seven days ago for the specified source.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionTradesByContractTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        String timezone = null;
        Integer pageSize = null;
        Integer minSize = null;
        String nextPage = null;
        OptionTradesResult response = api.getOptionTradesByContract(identifier, source, startDate, startTime, endDate, endTime, timezone, pageSize, minSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Options
     *
     * Returns a list of all securities that have options listed and are tradable on a US market exchange. Useful to retrieve the entire universe.  Available via a 3rd party, contact sales for a trial.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String expiration = null;
        String expirationAfter = null;
        String expirationBefore = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseOptions response = api.getOptions(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Options by Symbol Realtime
     *
     * Returns a list of all securities that have options listed and are tradable on a US market exchange. Useful to retrieve the entire universe.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsBySymbolRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String expiration = null;
        String expirationAfter = null;
        String expirationBefore = null;
        String source = null;
        Boolean includeRelatedSymbols = null;
        ApiResponseOptionsRealtime response = api.getOptionsBySymbolRealtime(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source, includeRelatedSymbols);

        // TODO: test validations
    }
    
    /**
     * Options Chain
     *
     * Returns a list of the historical end-of-day top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all option contracts currently associated with the option chain.  Available via a 3rd party, contact sales for a trial.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsChainTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String expiration = null;
        LocalDate date = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        String moneyness = null;
        Integer pageSize = null;
        ApiResponseOptionsChain response = api.getOptionsChain(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize);

        // TODO: test validations
    }
    
    /**
     * Options Chain EOD
     *
     * Returns all EOD options contracts and their prices for the given symbol and expiration date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsChainEodTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String expiration = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        LocalDate date = null;
        Boolean includeRelatedSymbols = null;
        ApiResponseOptionsChainEod response = api.getOptionsChainEod(symbol, expiration, type, strike, strikeGreaterThan, strikeLessThan, date, includeRelatedSymbols);

        // TODO: test validations
    }
    
    /**
     * Options Chain Realtime
     *
     * Returns a list of the latest National Best Bid &amp; Offer (NBBO) top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all option contracts currently associated with the option chain.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsChainRealtimeTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String expiration = null;
        String source = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        BigDecimal volumeGreaterThan = null;
        BigDecimal volumeLessThan = null;
        BigDecimal openInterestGreaterThan = null;
        BigDecimal openInterestLessThan = null;
        String moneyness = null;
        String stockPriceSource = null;
        String model = null;
        Boolean showExtendedPrice = null;
        Boolean includeRelatedSymbols = null;
        ApiResponseOptionsChainRealtime response = api.getOptionsChainRealtime(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness, stockPriceSource, model, showExtendedPrice, includeRelatedSymbols);

        // TODO: test validations
    }
    
    /**
     * Options Expirations
     *
     * Returns a list of all current and upcoming option contract expiration dates for a particular symbol.  Available via a 3rd party, contact sales for a trial.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsExpirationsTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String after = null;
        String before = null;
        ApiResponseOptionsExpirations response = api.getOptionsExpirations(symbol, after, before);

        // TODO: test validations
    }
    
    /**
     * Options Expirations
     *
     * Returns a list of all current and upcoming option contract expiration dates for a particular symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsExpirationsEodTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String after = null;
        String before = null;
        Boolean includeRelatedSymbols = null;
        ApiResponseOptionsExpirations response = api.getOptionsExpirationsEod(symbol, after, before, includeRelatedSymbols);

        // TODO: test validations
    }
    
    /**
     * Options Implied Move By Symbol
     *
     * Returns the implied move data points for a ticker symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsImpliedMoveBySymbolTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        LocalDate expirationDate = null;
        Object percentage = null;
        String source = null;
        ApiResponseOptionsImpliedMove response = api.getOptionsImpliedMoveBySymbol(symbol, expirationDate, percentage, source);

        // TODO: test validations
    }
    
    /**
     * Options Intervals By Contract
     *
     * Returns a list of interval data points for a contract.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsIntervalByContractTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String intervalSize = null;
        String source = null;
        Integer pageSize = null;
        OffsetDateTime endTime = null;
        OptionIntervalsResult response = api.getOptionsIntervalByContract(identifier, intervalSize, source, pageSize, endTime);

        // TODO: test validations
    }
    
    /**
     * Options Intervals Movers
     *
     * Returns a list of intervals for the biggest movers over the last hour interval.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsIntervalMoversTest() throws ApiException, NoSuchMethodException {
        String source = null;
        OffsetDateTime openTime = null;
        OptionIntervalsMoversResult response = api.getOptionsIntervalMovers(source, openTime);

        // TODO: test validations
    }
    
    /**
     * Options Intervals Movers By Change
     *
     * Returns a list of intervals for the biggest movers by change over the last hour interval.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsIntervalMoversChangeTest() throws ApiException, NoSuchMethodException {
        String source = null;
        OffsetDateTime openTime = null;
        OptionIntervalsMoversResult response = api.getOptionsIntervalMoversChange(source, openTime);

        // TODO: test validations
    }
    
    /**
     * Options Intervals Movers By Volume
     *
     * Returns a list of intervals for the biggest movers by volume over the last hour interval.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsIntervalMoversVolumeTest() throws ApiException, NoSuchMethodException {
        String source = null;
        OffsetDateTime openTime = null;
        OptionIntervalsMoversResult response = api.getOptionsIntervalMoversVolume(source, openTime);

        // TODO: test validations
    }
    
    /**
     * Option Prices
     *
     * Returns all price data from inception to expiration for a particular contract.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseOptionPrices response = api.getOptionsPrices(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Option Prices Batch Realtime
     *
     * Returns a list of latest price data for up to 250 option contracts per request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesBatchRealtimeTest() throws ApiException, NoSuchMethodException {
        OptionContractsList body = null;
        String source = null;
        Boolean showStats = null;
        String stockPriceSource = null;
        String model = null;
        Boolean showExtendedPrice = null;
        ApiResponseOptionsPricesBatchRealtime response = api.getOptionsPricesBatchRealtime(body, source, showStats, stockPriceSource, model, showExtendedPrice);

        // TODO: test validations
    }
    
    /**
     * Option Prices EOD
     *
     * Returns all option prices for a given option contract identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesEodTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String nextPage = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        ApiResponseOptionsPricesEod response = api.getOptionsPricesEod(identifier, nextPage, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Option Prices End of Day By Ticker
     *
     * Returns a list of end of day pricing information for all option contracts currently associated with the ticker.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesEodByTickerTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        Integer pageSize = null;
        Object date = null;
        String type = null;
        BigDecimal strike = null;
        BigDecimal strikeGreaterThan = null;
        BigDecimal strikeLessThan = null;
        Boolean includeRelatedSymbols = null;
        String nextPage = null;
        ApiResponseOptionsPricesByTickerEod response = api.getOptionsPricesEodByTicker(symbol, pageSize, date, type, strike, strikeGreaterThan, strikeLessThan, includeRelatedSymbols, nextPage);

        // TODO: test validations
    }
    
    /**
     * Option Prices Realtime
     *
     * Returns all option prices for a given option contract identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesRealtimeTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        String stockPriceSource = null;
        String model = null;
        Boolean showExtendedPrice = null;
        ApiResponseOptionsPriceRealtime response = api.getOptionsPricesRealtime(identifier, source, stockPriceSource, model, showExtendedPrice);

        // TODO: test validations
    }
    
    /**
     * Option Prices Realtime By Ticker
     *
     * Returns a list of the latest National Best Bid &amp; Offer (NBBO) top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all option contracts currently associated with the ticker.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsPricesRealtimeByTickerTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String source = null;
        String ivMode = null;
        String nextPage = null;
        Integer pageSize = null;
        String stockPriceSource = null;
        String model = null;
        Boolean showExtendedPrice = null;
        Object expirationStartDate = null;
        Object expirationEndDate = null;
        BigDecimal strike = null;
        ApiResponseOptionsPricesByTickerRealtime response = api.getOptionsPricesRealtimeByTicker(symbol, source, ivMode, nextPage, pageSize, stockPriceSource, model, showExtendedPrice, expirationStartDate, expirationEndDate, strike);

        // TODO: test validations
    }
    
    /**
     * Option Prices Realtime Snapshot
     *
     * Returns all options snapshots for the queried interval with links to download.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsSnapshotsTest() throws ApiException, NoSuchMethodException {
        String source = null;
        OffsetDateTime atDatetime = null;
        Boolean withGreeks = null;
        String stockPriceSource = null;
        Boolean withUnderlyingPrice = null;
        OptionSnapshotsResult response = api.getOptionsSnapshots(source, atDatetime, withGreeks, stockPriceSource, withUnderlyingPrice);

        // TODO: test validations
    }
    
    /**
     * Option Stats Realtime
     *
     * Returns all option stats (greeks and implied volatility) as well as the underlying factors used to calculate them, for a particular option contract.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOptionsStatsRealtimeTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        Boolean showExtendedPrice = null;
        ApiResponseOptionsStatsRealtime response = api.getOptionsStatsRealtime(identifier, source, showExtendedPrice);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity
     *
     * Returns unusual options activity for a particular company across all option chains. Unusual options activity includes large trades, sweeps, and block trades.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String source = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivity(symbol, source);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity Intraday
     *
     * Returns unusual trades for a given identifier within the query parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityIntradayTest() throws ApiException, NoSuchMethodException {
        String symbol = null;
        String nextPage = null;
        Integer pageSize = null;
        String activityType = null;
        String sentiment = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Object minimumTotalValue = null;
        Object maximumTotalValue = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivityIntraday(symbol, nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity Universal
     *
     * Returns the latest unusual options activity across all US companies with across all option chains. Unusual options activity includes large trades, sweeps, and block trades.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityUniversalTest() throws ApiException, NoSuchMethodException {
        String source = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivityUniversal(source);

        // TODO: test validations
    }
    
    /**
     * Options Unusual Activity Universal Intraday
     *
     * Returns unusual trades for all underlying security symbols within the query parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnusualActivityUniversalIntradayTest() throws ApiException, NoSuchMethodException {
        String nextPage = null;
        Integer pageSize = null;
        String activityType = null;
        String sentiment = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Object minimumTotalValue = null;
        Object maximumTotalValue = null;
        ApiResponseOptionsUnusualActivity response = api.getUnusualActivityUniversalIntraday(nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue);

        // TODO: test validations
    }
    
    /**
     * Get realtime options greeks by ticker
     *
     * Retrieves realtime options greeks data for all contracts of a given ticker symbol
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optionsGreeksByTickerIdentifierRealtimeGetTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        String model = null;
        String ivMode = null;
        String stockPriceSource = null;
        LocalDate expirationStartDate = null;
        LocalDate expirationEndDate = null;
        Float strike = null;
        Float strikeGreaterThan = null;
        Float strikeLessThan = null;
        Integer pageSize = null;
        ApiResponseOptionsGreeksByTickerRealtime response = api.optionsGreeksByTickerIdentifierRealtimeGet(identifier, source, model, ivMode, stockPriceSource, expirationStartDate, expirationEndDate, strike, strikeGreaterThan, strikeLessThan, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get realtime options greeks for a specific contract
     *
     * Retrieves realtime options greeks data for a specific options contract
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void optionsGreeksContractRealtimeGetTest() throws ApiException, NoSuchMethodException {
        String contract = null;
        String source = null;
        String model = null;
        String ivMode = null;
        String stockPriceSource = null;
        ApiResponseOptionsGreekContractRealtime response = api.optionsGreeksContractRealtimeGet(contract, source, model, ivMode, stockPriceSource);

        // TODO: test validations
    }
    
}
