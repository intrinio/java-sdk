

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseSecurities;
import com.intrinio.models.ApiResponseSecuritiesSearch;
import com.intrinio.models.ApiResponseSecurityAccumulationDistributionIndex;
import com.intrinio.models.ApiResponseSecurityAverageDailyTradingVolume;
import com.intrinio.models.ApiResponseSecurityAverageDirectionalIndex;
import com.intrinio.models.ApiResponseSecurityAverageTrueRange;
import com.intrinio.models.ApiResponseSecurityAwesomeOscillator;
import com.intrinio.models.ApiResponseSecurityBollingerBands;
import com.intrinio.models.ApiResponseSecurityChaikinMoneyFlow;
import com.intrinio.models.ApiResponseSecurityCommodityChannelIndex;
import com.intrinio.models.ApiResponseSecurityDetrendedPriceOscillator;
import com.intrinio.models.ApiResponseSecurityDonchianChannel;
import com.intrinio.models.ApiResponseSecurityEaseOfMovement;
import com.intrinio.models.ApiResponseSecurityForceIndex;
import com.intrinio.models.ApiResponseSecurityHistoricalData;
import com.intrinio.models.ApiResponseSecurityIchimokuKinkoHyo;
import com.intrinio.models.ApiResponseSecurityInstitutionalOwnership;
import com.intrinio.models.ApiResponseSecurityIntervalPrices;
import com.intrinio.models.ApiResponseSecurityIntradayPrices;
import com.intrinio.models.ApiResponseSecurityKeltnerChannel;
import com.intrinio.models.ApiResponseSecurityKnowSureThing;
import com.intrinio.models.ApiResponseSecurityMassIndex;
import com.intrinio.models.ApiResponseSecurityMoneyFlowIndex;
import com.intrinio.models.ApiResponseSecurityMovingAverageConvergenceDivergence;
import com.intrinio.models.ApiResponseSecurityNegativeVolumeIndex;
import com.intrinio.models.ApiResponseSecurityOnBalanceVolume;
import com.intrinio.models.ApiResponseSecurityOnBalanceVolumeMean;
import com.intrinio.models.ApiResponseSecurityRelativeStrengthIndex;
import com.intrinio.models.ApiResponseSecuritySimpleMovingAverage;
import com.intrinio.models.ApiResponseSecurityStochasticOscillator;
import com.intrinio.models.ApiResponseSecurityStockPriceAdjustments;
import com.intrinio.models.ApiResponseSecurityStockPrices;
import com.intrinio.models.ApiResponseSecurityTripleExponentialAverage;
import com.intrinio.models.ApiResponseSecurityTrueStrengthIndex;
import com.intrinio.models.ApiResponseSecurityUltimateOscillator;
import com.intrinio.models.ApiResponseSecurityVolumePriceTrend;
import com.intrinio.models.ApiResponseSecurityVolumeWeightedAveragePrice;
import com.intrinio.models.ApiResponseSecurityVortexIndicator;
import com.intrinio.models.ApiResponseSecurityWilliamsR;
import com.intrinio.models.ApiResponseSecurityZacksAnalystRatings;
import com.intrinio.models.ApiResponseSecurityZacksAnalystRatingsSnapshot;
import com.intrinio.models.ApiResponseSecurityZacksEPSSurprises;
import com.intrinio.models.ApiResponseSecurityZacksSalesSurprises;
import java.math.BigDecimal;
import com.intrinio.models.DividendRecord;
import com.intrinio.models.EarningsRecord;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import com.intrinio.models.RealtimeStockPrice;
import com.intrinio.models.Security;
import com.intrinio.models.SecurityScreenGroup;
import com.intrinio.models.SecurityScreenResult;
import com.intrinio.models.SecuritySnapshotsResult;
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
     * Returns a list of all securities available. Delisted securities included.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSecuritiesTest() throws ApiException, NoSuchMethodException {
        Boolean active = null;
        Boolean delisted = null;
        String code = null;
        String currency = null;
        String ticker = null;
        String name = null;
        String compositeMic = null;
        String exchangeMic = null;
        LocalDate stockPricesAfter = null;
        LocalDate stockPricesBefore = null;
        String cik = null;
        String figi = null;
        String compositeFigi = null;
        String shareClassFigi = null;
        String figiUniqueId = null;
        Boolean includeNonFigi = null;
        Integer pageSize = null;
        Boolean primaryListing = null;
        String nextPage = null;
        ApiResponseSecurities response = api.getAllSecurities(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, primaryListing, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Security
     *
     * Returns security reference data such as ticker, FIGI, primary exchange, CIK, and a unique security identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityByIdTest() throws ApiException, NoSuchMethodException {
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
    public void getSecurityDataPointNumberTest() throws ApiException, NoSuchMethodException {
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
    public void getSecurityDataPointTextTest() throws ApiException, NoSuchMethodException {
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
    public void getSecurityHistoricalDataTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String frequency = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityHistoricalData response = api.getSecurityHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Institutional Ownership by Security
     *
     * Returns a list of all institutional owners of a given security.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityInsiderOwnershipTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ApiResponseSecurityInstitutionalOwnership response = api.getSecurityInsiderOwnership(identifier);

        // TODO: test validations
    }
    
    /**
     * Interval Stock Prices for Security
     *
     * Return Open, High, Low, Close, and Volume for a particular interval for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityIntervalPricesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        String timezone = null;
        String intervalSize = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityIntervalPrices response = api.getSecurityIntervalPrices(identifier, source, startDate, startTime, endDate, endTime, timezone, intervalSize, pageSize, nextPage);

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
    public void getSecurityIntradayPricesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityIntradayPrices response = api.getSecurityIntradayPrices(identifier, source, startDate, startTime, endDate, endTime, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Latest Dividend Record for Security
     *
     * Returns the latest available dividend information for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityLatestDividendRecordTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        DividendRecord response = api.getSecurityLatestDividendRecord(identifier);

        // TODO: test validations
    }
    
    /**
     * Latest Earnings Record for Security
     *
     * Returns latest available earnings information for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityLatestEarningsRecordTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        EarningsRecord response = api.getSecurityLatestEarningsRecord(identifier);

        // TODO: test validations
    }
    
    /**
     * Accumulation/Distribution Index
     *
     * The Accumulation / Distribution Indicator is a volume-based technical indicator which uses the relationship between the stock&#x60;s price and volume flow to determine the underlying trend of a stock, up, down, or sideways trend of a stock.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsAdiTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityAccumulationDistributionIndex response = api.getSecurityPriceTechnicalsAdi(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Average Daily Trading Volume
     *
     * Average Daily Trading Volume is the average number of shares traded over a given period, usually between 20 to 30 trading days.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsAdtvTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityAverageDailyTradingVolume response = api.getSecurityPriceTechnicalsAdtv(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Average Directional Index
     *
     * The Average Directional Index indicator is often used to identify decreasing or increasing price momentum for an underlying security, it is composed of a total of three indicators, the current trendline (adx), a positive directional indicator (di_pos), and a negative directional indicator (di_neg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsAdxTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityAverageDirectionalIndex response = api.getSecurityPriceTechnicalsAdx(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Awesome Oscillator
     *
     * The Awesome Oscillator (ao) is a momentum indicator and is calculated by taking the difference between the latest 5 period simple moving average and the 34 period simple moving average. Rather than using the closing price like other indicators, the Awesome Oscillator uses the latest period&#x60;s midpoint value (period_high - period_low / 2). The Awesome Oscillator is useful in identifying and trading, zero-line crossovers, twin-peaks trading, and bullish/bearish saucers - Awesome Oscillator is often aggregated with additional technical indicators.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsAoTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer shortPeriod = null;
        Integer longPeriod = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityAwesomeOscillator response = api.getSecurityPriceTechnicalsAo(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Average True Range
     *
     * The Average True Range (ATR) is a non-directional market volatility indicator often used to generate stop-out or entry indications. An increasing or expanding ATR typically indicates higher volatility, and a decreasing ATR indicates sideways price action and lower volatility.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsAtrTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityAverageTrueRange response = api.getSecurityPriceTechnicalsAtr(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Bollinger Bands
     *
     * Bollinger Bands can be a useful technical analysis tool for generating oversold or overbought indicators. Bollinger Bands are composed of three lines, a simple moving average (middle band) and an upper and lower band – the upper and lower bands are typically 2 standard deviations +/- from a 20-day simple moving average, but can be modified. Traders typically consider an underlying security to be overbought as the underlying&#x60;s price moves towards the upper band and oversold as the underlying price moves towards the lower band.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsBbTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        Float standardDeviations = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityBollingerBands response = api.getSecurityPriceTechnicalsBb(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Commodity Channel Index
     *
     * The Commodity Channel Index (CCI) is a technical indicator used to generate buy and sell signals by indicating periods of strength and weakness in the market. CCI signals that fall below -100 are often perceived as weakness in the underlying price movement and CCI signals that rise above 100 indicate strength behind the underlying price movement.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsCciTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        Float constant = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityCommodityChannelIndex response = api.getSecurityPriceTechnicalsCci(identifier, period, constant, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Chaikin Money Flow
     *
     * The Chaikin Money Flow (CMF) utilizes exponential moving averages as an indicator to monitor the flow of money and momentum. The CMF indicator oscillates around a midrange 0-line and ranges between 100 and -100.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsCmfTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityChaikinMoneyFlow response = api.getSecurityPriceTechnicalsCmf(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Donchian Channel
     *
     * The Donchian Channel consists of an Upper Bound (upper_bound) and Lower Bound (lower_bound) that track the recent highs and lows and is often used to signal entry and exit points for a position. As the price of the underlying symbol increases the Upper Bound raises, if the price becomes range bound the Upper Bound will remain flat and if the price begins to decrease, the Upper Bound will fall (and vice-versa for the Lower Bound).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsDcTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityDonchianChannel response = api.getSecurityPriceTechnicalsDc(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Detrended Price Oscillator
     *
     * The Detrended Price Oscillator (DPO) signals the peaks and troughs of the underlying symbol’s price for a set period of time and is often used by traders to estimate future peaks and troughs using this as guidance to enter or exit a position.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsDpoTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityDetrendedPriceOscillator response = api.getSecurityPriceTechnicalsDpo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Ease of Movement
     *
     * The Ease of Movement (EOM) is a volume based oscillator that fluctuates around a midrange 0-line into positive and negative values. Positive values indicate that the underlying symbol&#x60;s price is rising with relative ease and negative value indicates the underlying symbol&#x60;s price is failing with relative ease.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsEomTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityEaseOfMovement response = api.getSecurityPriceTechnicalsEom(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Force Index
     *
     * The Force Index (FI) is an oscillator that takes into account the intensity of an underlying symbol&#x60;s price movement and its corresponding volume. It is used to confirm price breakouts and signal underlying trends.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsFiTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityForceIndex response = api.getSecurityPriceTechnicalsFi(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Ichimoku Kinko Hyo
     *
     * The Ichimoku Kinko Hyo was designed to be an all-in-one trading indicator that could help traders determine momentum, support, and resistance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsIchimokuTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer lowPeriod = null;
        Integer mediumPeriod = null;
        Integer highPeriod = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityIchimokuKinkoHyo response = api.getSecurityPriceTechnicalsIchimoku(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Keltner Channel
     *
     * The Keltner Channel is a volatility based signal, with upper, middle, and lower bands. It is often used at market open, when the largest moves tend to occur. In general, traders tend to buy if the price breaks up above the upper band or sell short if the price drops below the lower band.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsKcTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityKeltnerChannel response = api.getSecurityPriceTechnicalsKc(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Know Sure Thing
     *
     * The Know Sure Thing indicator (KST) is a momentum based oscillator that is calculated by measuring the momentum of four separate price cycles. KST fluctuates above and below a zero line and is used to identify overbought and oversold conditions, and is often used with additional indicators to boost signal strength.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsKstTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer roc1 = null;
        Integer roc2 = null;
        Integer roc3 = null;
        Integer roc4 = null;
        Integer sma1 = null;
        Integer sma2 = null;
        Integer sma3 = null;
        Integer sma4 = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityKnowSureThing response = api.getSecurityPriceTechnicalsKst(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Moving Average Convergence Divergence
     *
     * Moving average convergence divergence (MACD) is a trend-following momentum oscillator that consists of three indicators: (1) a 12 period short-term exponential moving average (EMA) a 26 period long-term EMA and a 9 period EMA signal line. Traders using MACD often look for signal line crossovers, centerline crossovers, and EMA divergences to indicate the momentum and underlying trend of a security&#x60;s price.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsMacdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer fastPeriod = null;
        Integer slowPeriod = null;
        Integer signalPeriod = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityMovingAverageConvergenceDivergence response = api.getSecurityPriceTechnicalsMacd(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Money Flow Index
     *
     * The Money Flow Index (MFI) is a technical oscillator that incorporates both price and volume, moving between 0 and 100. Traders often consider a MFI above 80 as overbought conditions and below 20 as oversold conditions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsMfiTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityMoneyFlowIndex response = api.getSecurityPriceTechnicalsMfi(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Mass Index
     *
     * The mass index (MI) is a technical indicator used by traders to predict trend reversals. A trend reversal signal is said to occur when the 25-day MI reaches 27.0 and then falls below 26.0.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsMiTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer emaPeriod = null;
        Integer sumPeriod = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityMassIndex response = api.getSecurityPriceTechnicalsMi(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Negative Volume Index
     *
     * The negative volume index (NVI) is often referred to as the &#x60;smart money indicator.&#x60; It works by the assumption that smart money (institutional money) is at work when volume decreases and vice versa when volume increases. NVI starts at 1000 and increases in regard to the percentage price change when volume decreases over a 255-day EMA period. Traders often use this technical indicator when researching broder markets and indices.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsNviTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityNegativeVolumeIndex response = api.getSecurityPriceTechnicalsNvi(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * On-balance Volume
     *
     * On-balance volume (OBV) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. When both OBV and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsObvTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityOnBalanceVolume response = api.getSecurityPriceTechnicalsObv(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * On-balance Volume Mean
     *
     * On-balance volume mean (OBVM) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. The difference between OBV and OBVM is that OBVM takes the mean average of a provided period.  When both OBVM and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsObvMeanTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityOnBalanceVolumeMean response = api.getSecurityPriceTechnicalsObvMean(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Relative Strength Index
     *
     * Relative strength index (RSI) is a momentum oscillator that ranges between 0 and 100. Traders believe that an RSI value over 70 indicates that a security is overbought and an RSI under 30 indicates that a security is oversold.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsRsiTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityRelativeStrengthIndex response = api.getSecurityPriceTechnicalsRsi(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Simple Moving Average
     *
     * A simple moving average (SMA) adds recent prices for a specified period and divides the total by that same number of periods. SMA is typically used to indicate whether a security is in an uptrend or downtrend and can also be combined with a long-term moving average to improve the signal&#x60;s abilities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsSmaTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecuritySimpleMovingAverage response = api.getSecurityPriceTechnicalsSma(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Stochastic Oscillator
     *
     * The Stochastic Oscillator (SO) is a range-bound momentum indicator that ranges from 0 to 100 and follows the velocity of the momentum itself, not the underlying price or volume. When SO is above 80 it indicates that a security is trading at the high end of its period&#x60;s high-low range and vice versa if the reading is below 20.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsSrTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        Integer signalPeriod = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityStochasticOscillator response = api.getSecurityPriceTechnicalsSr(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Triple Exponential Average
     *
     * The Triple Exponential Average (TEA) is a momentum indicator used to identify when a security is oversold and overbought. By exponentially smoothing out the underlying security&#x60;s moving average, the TEA  filters out insignificant price movements. A positive TEA is often believed to indicate momentum is increasing and a negative TEA indicates that momentum is decreasing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsTrixTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityTripleExponentialAverage response = api.getSecurityPriceTechnicalsTrix(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * True Strength Index
     *
     * The True Strength Index (TSI) is a momentum oscillator used to identify building trends and trend reversals, typically by signalling overbought and oversold conditions. TSI fluctuates between positive and negative values, and traders typically combine its signal with other momentum oscillators to increase its strength. When TSI crosses the signal line into positive territory it is presumed to be an entrance opportunity and vice versa when the TSI crosses into negative territory.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsTsiTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer lowPeriod = null;
        Integer highPeriod = null;
        String priceKey = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityTrueStrengthIndex response = api.getSecurityPriceTechnicalsTsi(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Ultimate Oscillator
     *
     * The Ultimate Oscillator (UO) is a range bound technical indicator that moves between 0 and 100 and is calculated with 3 timeframes, typically 7, 14, and 28 day periods. When UO&#x60;s value is above 70 a security is categorized as overbought and when UO&#x60;s value is below 30 a security is categorized as oversold.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsUoTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer shortPeriod = null;
        Integer mediumPeriod = null;
        Integer longPeriod = null;
        Float shortWeight = null;
        Float mediumWeight = null;
        Float longWeight = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityUltimateOscillator response = api.getSecurityPriceTechnicalsUo(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Vortex Indicator
     *
     * The Vortex Indicator (VI) is composed of an uptrend line (VI+) and a downtrend line (VI-). When VI+ crosses VI- from below it typically indicates an entry into a given security. When VI- crosses VI+ from below it typically triggers an exit and that the current trend is reversing course.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsViTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityVortexIndicator response = api.getSecurityPriceTechnicalsVi(identifier, period, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Volume-price Trend
     *
     * The volume price trend (VPT) is a technical indicator that uses price &amp; volume to determine whether a trend is established. Typically, when a security is trending upwards, there is more volume on positive days than negative ones, and as a result VPT should be increasing on these days as well. However, if VPT fails to increase past its previous high during an outbreak, this is suggested to indicate the rally is losing strength.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsVptTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityVolumePriceTrend response = api.getSecurityPriceTechnicalsVpt(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Volume Weighted Average Price
     *
     * Volume Weighted Average Price (VWAP) is a lagging technical indicator that is used in combination with a security&#x60;s price. When the underlying price rises above its VWAP, it is often interpreted as a bullish signal, and vice versa in the opposite direction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsVwapTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityVolumeWeightedAveragePrice response = api.getSecurityPriceTechnicalsVwap(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Williams %R
     *
     * Williams %R is a momentum indicator used to determine overbought and oversold environments for a security and fluctuates between 0 and -100. When Williams %R is above -20 the security is considered to be overbought and when Williams %R is under -80 the security is considered to be oversold.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceTechnicalsWrTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer period = null;
        String startDate = null;
        String endDate = null;
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseSecurityWilliamsR response = api.getSecurityPriceTechnicalsWr(identifier, period, startDate, endDate, pageSize, nextPage);

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
    public void getSecurityRealtimePriceTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String source = null;
        RealtimeStockPrice response = api.getSecurityRealtimePrice(identifier, source);

        // TODO: test validations
    }
    
    /**
     * Realtime Stock Prices Snapshot
     *
     * Returns all security snapshots for the queried interval with links to download.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecuritySnapshotsTest() throws ApiException, NoSuchMethodException {
        OffsetDateTime atDatetime = null;
        SecuritySnapshotsResult response = api.getSecuritySnapshots(atDatetime);

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
    public void getSecurityStockPriceAdjustmentsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer pageSize = null;
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
    public void getSecurityStockPricesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String frequency = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityStockPrices response = api.getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks Analyst Ratings for Security
     *
     * This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityZacksAnalystRatingsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String startDate = null;
        String endDate = null;
        BigDecimal meanGreater = null;
        BigDecimal meanLess = null;
        Integer strongBuysGreater = null;
        Integer strongBuysLess = null;
        Integer buysGreater = null;
        Integer buysLess = null;
        Integer holdsGreater = null;
        Integer holdsLess = null;
        Integer sellsGreater = null;
        Integer sellsLess = null;
        Integer strongSellsGreater = null;
        Integer strongSellsLess = null;
        Integer totalGreater = null;
        Integer totalLess = null;
        Integer pageSize = null;
        ApiResponseSecurityZacksAnalystRatings response = api.getSecurityZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize);

        // TODO: test validations
    }
    
    /**
     * Zacks Analyst Ratings Snapshot
     *
     * This database offers current and historical consensus analyst recommendation snapshots for over 5,000 US and Canadian listed companies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityZacksAnalystRatingsSnapshotTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String date = null;
        ApiResponseSecurityZacksAnalystRatingsSnapshot response = api.getSecurityZacksAnalystRatingsSnapshot(identifier, date);

        // TODO: test validations
    }
    
    /**
     * Zacks EPS Surprises for Security
     *
     * Returns historical estimated and actual earnings, guidance, and announcement dates for a specified symbol.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityZacksEpsSurprisesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityZacksEPSSurprises response = api.getSecurityZacksEpsSurprises(identifier, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks Sales Surprises for Security
     *
     * This database returns historical estimated and actual sales, guidance, and announcement dates for a specified US or Canadian company.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityZacksSalesSurprisesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseSecurityZacksSalesSurprises response = api.getSecurityZacksSalesSurprises(identifier, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Screen Securities
     *
     * Screen Securities using complex logic. Use POST only. See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void screenSecuritiesTest() throws ApiException, NoSuchMethodException {
        SecurityScreenGroup logic = null;
        String orderColumn = null;
        String orderDirection = null;
        Boolean primaryOnly = null;
        Integer pageSize = null;
        List<SecurityScreenResult> response = api.screenSecurities(logic, orderColumn, orderDirection, primaryOnly, pageSize);

        // TODO: test validations
    }
    
    /**
     * Search Securities
     *
     * Search the securities database and return a list of securities matching the text query parameter passed through. Query parameter searches across the security ticker and name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSecuritiesTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Integer pageSize = null;
        ApiResponseSecuritiesSearch response = api.searchSecurities(query, pageSize);

        // TODO: test validations
    }
    
}
