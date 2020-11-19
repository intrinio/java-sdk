

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
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
import com.intrinio.models.ApiResponseSecurityIchimokuKinkoHyo;
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
import com.intrinio.models.ApiResponseSecurityTripleExponentialAverage;
import com.intrinio.models.ApiResponseSecurityTrueStrengthIndex;
import com.intrinio.models.ApiResponseSecurityUltimateOscillator;
import com.intrinio.models.ApiResponseSecurityVolumePriceTrend;
import com.intrinio.models.ApiResponseSecurityVolumeWeightedAveragePrice;
import com.intrinio.models.ApiResponseSecurityVortexIndicator;
import com.intrinio.models.ApiResponseSecurityWilliamsR;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TechnicalApi
 */
@Ignore
public class TechnicalApiTest {

    private final TechnicalApi api = new TechnicalApi();

    
    /**
     * Accumulation/Distribution Index
     *
     * Returns the Accumulation/Distribution Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Average Daily Trading Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Average Directional Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Awesome Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Average True Range values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Bollinger Bands values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Commodity Channel Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Chaikin Money Flow values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Donchian Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Detrended Price Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Ease of Movement values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Force Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Ichimoku Kinko Hyo values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Keltner Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Know Sure Thing values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Moving Average Convergence Divergence values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Money Flow Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Mass Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Negative Volume Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the On-balance Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the On-balance Volume Mean values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Relative Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Stochastic Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the True Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Ultimate Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Vortex Indicator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Volume-price Trend values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Volume Weighted Average Price values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
     * Returns the Williams %R values of Stock Prices for the Security with the given &#x60;identifier&#x60;
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
    
}
