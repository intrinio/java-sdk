

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseCryptoAccumulationDistributionIndex;
import com.intrinio.models.ApiResponseCryptoAverageDailyTradingVolume;
import com.intrinio.models.ApiResponseCryptoAverageDirectionalIndex;
import com.intrinio.models.ApiResponseCryptoAverageTrueRange;
import com.intrinio.models.ApiResponseCryptoAwesomeOscillator;
import com.intrinio.models.ApiResponseCryptoBollingerBands;
import com.intrinio.models.ApiResponseCryptoBook;
import com.intrinio.models.ApiResponseCryptoBookAsks;
import com.intrinio.models.ApiResponseCryptoBookBids;
import com.intrinio.models.ApiResponseCryptoChaikinMoneyFlow;
import com.intrinio.models.ApiResponseCryptoCommodityChannelIndex;
import com.intrinio.models.ApiResponseCryptoCurrencies;
import com.intrinio.models.ApiResponseCryptoDetrendedPriceOscillator;
import com.intrinio.models.ApiResponseCryptoDonchianChannel;
import com.intrinio.models.ApiResponseCryptoEaseOfMovement;
import com.intrinio.models.ApiResponseCryptoExchanges;
import com.intrinio.models.ApiResponseCryptoForceIndex;
import com.intrinio.models.ApiResponseCryptoIchimokuKinkoHyo;
import com.intrinio.models.ApiResponseCryptoKeltnerChannel;
import com.intrinio.models.ApiResponseCryptoKnowSureThing;
import com.intrinio.models.ApiResponseCryptoMassIndex;
import com.intrinio.models.ApiResponseCryptoMoneyFlowIndex;
import com.intrinio.models.ApiResponseCryptoMovingAverageConvergenceDivergence;
import com.intrinio.models.ApiResponseCryptoNegativeVolumeIndex;
import com.intrinio.models.ApiResponseCryptoOnBalanceVolume;
import com.intrinio.models.ApiResponseCryptoOnBalanceVolumeMean;
import com.intrinio.models.ApiResponseCryptoPairs;
import com.intrinio.models.ApiResponseCryptoPrices;
import com.intrinio.models.ApiResponseCryptoRelativeStrengthIndex;
import com.intrinio.models.ApiResponseCryptoSimpleMovingAverage;
import com.intrinio.models.ApiResponseCryptoSnapshot;
import com.intrinio.models.ApiResponseCryptoStats;
import com.intrinio.models.ApiResponseCryptoStochasticOscillator;
import com.intrinio.models.ApiResponseCryptoTripleExponentialAverage;
import com.intrinio.models.ApiResponseCryptoTrueStrengthIndex;
import com.intrinio.models.ApiResponseCryptoUltimateOscillator;
import com.intrinio.models.ApiResponseCryptoVolumePriceTrend;
import com.intrinio.models.ApiResponseCryptoVolumeWeightedAveragePrice;
import com.intrinio.models.ApiResponseCryptoVortexIndicator;
import com.intrinio.models.ApiResponseCryptoWilliamsR;
import org.threeten.bp.LocalDate;
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
     * Accumulation/Distribution Index
     *
     * Returns the Accumulation/Distribution Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsAdiTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoAccumulationDistributionIndex response = api.getCryptoPriceTechnicalsAdi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Average Daily Trading Volume
     *
     * Returns the Average Daily Trading Volume values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsAdtvTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoAverageDailyTradingVolume response = api.getCryptoPriceTechnicalsAdtv(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Average Directional Index
     *
     * Returns the Average Directional Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsAdxTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoAverageDirectionalIndex response = api.getCryptoPriceTechnicalsAdx(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Awesome Oscillator
     *
     * Returns the Awesome Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsAoTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer shortPeriod = null;
        Integer longPeriod = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoAwesomeOscillator response = api.getCryptoPriceTechnicalsAo(pair, exchange, currency, shortPeriod, longPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Average True Range
     *
     * Returns the Average True Range values of Crypto Currency Prices for Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsAtrTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoAverageTrueRange response = api.getCryptoPriceTechnicalsAtr(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Bollinger Bands
     *
     * Returns the Bollinger Bands values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsBbTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        Float standardDeviations = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoBollingerBands response = api.getCryptoPriceTechnicalsBb(pair, exchange, currency, period, standardDeviations, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Commodity Channel Index
     *
     * Returns the Commodity Channel Index values of Crypto Currency Prices for Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsCciTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        Float constant = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoCommodityChannelIndex response = api.getCryptoPriceTechnicalsCci(pair, exchange, currency, period, constant, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Chaikin Money Flow
     *
     * Returns the Chaikin Money Flow values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsCmfTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoChaikinMoneyFlow response = api.getCryptoPriceTechnicalsCmf(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Donchian Channel
     *
     * Returns the Donchian Channel values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsDcTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoDonchianChannel response = api.getCryptoPriceTechnicalsDc(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Detrended Price Oscillator
     *
     * Returns the Detrended Price Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsDpoTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoDetrendedPriceOscillator response = api.getCryptoPriceTechnicalsDpo(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Ease of Movement
     *
     * Returns the Ease of Movement values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsEomTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoEaseOfMovement response = api.getCryptoPriceTechnicalsEom(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Force Index
     *
     * Returns the Force Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsFiTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoForceIndex response = api.getCryptoPriceTechnicalsFi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Ichimoku Kinko Hyo
     *
     * Returns the Ichimoku Kinko Hyo values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsIchimokuTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer lowPeriod = null;
        Integer mediumPeriod = null;
        Integer highPeriod = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoIchimokuKinkoHyo response = api.getCryptoPriceTechnicalsIchimoku(pair, exchange, currency, lowPeriod, mediumPeriod, highPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Keltner Channel
     *
     * Returns the Keltner Channel values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsKcTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoKeltnerChannel response = api.getCryptoPriceTechnicalsKc(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Know Sure Thing
     *
     * Returns the Know Sure Thing values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsKstTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer roc1 = null;
        Integer roc2 = null;
        Integer roc3 = null;
        Integer roc4 = null;
        Integer sma1 = null;
        Integer sma2 = null;
        Integer sma3 = null;
        Integer sma4 = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoKnowSureThing response = api.getCryptoPriceTechnicalsKst(pair, exchange, currency, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Moving Average Convergence Divergence
     *
     * Returns the Moving Average Convergence Divergence values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsMacdTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer fastPeriod = null;
        Integer slowPeriod = null;
        Integer signalPeriod = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoMovingAverageConvergenceDivergence response = api.getCryptoPriceTechnicalsMacd(pair, exchange, currency, fastPeriod, slowPeriod, signalPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Money Flow Index
     *
     * Returns the Money Flow Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsMfiTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoMoneyFlowIndex response = api.getCryptoPriceTechnicalsMfi(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Mass Index
     *
     * Returns the Mass Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsMiTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer emaPeriod = null;
        Integer sumPeriod = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoMassIndex response = api.getCryptoPriceTechnicalsMi(pair, exchange, currency, emaPeriod, sumPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Negative Volume Index
     *
     * Returns the Negative Volume Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsNviTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoNegativeVolumeIndex response = api.getCryptoPriceTechnicalsNvi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * On-balance Volume
     *
     * Returns the On-balance Volume values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsObvTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoOnBalanceVolume response = api.getCryptoPriceTechnicalsObv(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * On-balance Volume Mean
     *
     * Returns the On-balance Volume Mean values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsObvMeanTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoOnBalanceVolumeMean response = api.getCryptoPriceTechnicalsObvMean(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Relative Strength Index
     *
     * Returns the Relative Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsRsiTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoRelativeStrengthIndex response = api.getCryptoPriceTechnicalsRsi(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Simple Moving Average
     *
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsSmaTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoSimpleMovingAverage response = api.getCryptoPriceTechnicalsSma(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Stochastic Oscillator
     *
     * Returns the Stochastic Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsSrTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        Integer signalPeriod = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoStochasticOscillator response = api.getCryptoPriceTechnicalsSr(pair, exchange, currency, period, signalPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Triple Exponential Average
     *
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsTrixTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoTripleExponentialAverage response = api.getCryptoPriceTechnicalsTrix(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * True Strength Index
     *
     * Returns the True Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsTsiTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer lowPeriod = null;
        Integer highPeriod = null;
        String priceKey = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoTrueStrengthIndex response = api.getCryptoPriceTechnicalsTsi(pair, exchange, currency, lowPeriod, highPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Ultimate Oscillator
     *
     * Returns the Ultimate Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsUoTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer shortPeriod = null;
        Integer mediumPeriod = null;
        Integer longPeriod = null;
        Float shortWeight = null;
        Float mediumWeight = null;
        Float longWeight = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoUltimateOscillator response = api.getCryptoPriceTechnicalsUo(pair, exchange, currency, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Vortex Indicator
     *
     * Returns the Vortex Indicator values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsViTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoVortexIndicator response = api.getCryptoPriceTechnicalsVi(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Volume-price Trend
     *
     * Returns the Volume-price Trend values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsVptTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoVolumePriceTrend response = api.getCryptoPriceTechnicalsVpt(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Volume Weighted Average Price
     *
     * Returns the Volume Weighted Average Price values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsVwapTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoVolumeWeightedAveragePrice response = api.getCryptoPriceTechnicalsVwap(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Williams %R
     *
     * Returns the Williams %R values of Crypto Currency Prices for a Crypto Currency Pair
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCryptoPriceTechnicalsWrTest() throws ApiException {
        String pair = null;
        String exchange = null;
        String currency = null;
        Integer period = null;
        String timeframe = null;
        String timezone = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCryptoWilliamsR response = api.getCryptoPriceTechnicalsWr(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);

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
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
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
