

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseZacksAnalystRatings;
import com.intrinio.models.ApiResponseZacksEPSSurprises;
import com.intrinio.models.ApiResponseZacksSalesSurprises;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZacksApi
 */
@Ignore
public class ZacksApiTest {

    private final ZacksApi api = new ZacksApi();

    
    /**
     * Zacks Analyst Ratings
     *
     * Returns buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. Zack’s storied research team aggregates and validates the ratings from professional analysts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksAnalystRatingsTest() throws ApiException {
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
        String nextPage = null;
        ApiResponseZacksAnalystRatings response = api.getZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks EPS Surprises
     *
     * Returns Zacks eps surprise data for all Securities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksEpsSurprisesTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        BigDecimal epsActualGreater = null;
        BigDecimal epsActualLess = null;
        BigDecimal epsMeanEstimateGreater = null;
        BigDecimal epsMeanEstimateLess = null;
        BigDecimal epsAmountDiffGreater = null;
        BigDecimal epsAmountDiffLess = null;
        BigDecimal epsPercentDiffGreater = null;
        BigDecimal epsPercentDiffLess = null;
        BigDecimal epsCountEstimateGreater = null;
        BigDecimal epsCountEstimateLess = null;
        BigDecimal epsStdDevEstimateGreater = null;
        BigDecimal epsStdDevEstimateLess = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksEPSSurprises response = api.getZacksEpsSurprises(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks Sales Surprises
     *
     * Returns Zacks sales surprise data for all Securities.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksSalesSurprisesTest() throws ApiException {
        String startDate = null;
        String endDate = null;
        BigDecimal salesActualGreater = null;
        BigDecimal salesActualLess = null;
        BigDecimal salesMeanEstimateGreater = null;
        BigDecimal salesMeanEstimateLess = null;
        BigDecimal salesAmountDiffGreater = null;
        BigDecimal salesAmountDiffLess = null;
        BigDecimal salesPercentDiffGreater = null;
        BigDecimal salesPercentDiffLess = null;
        BigDecimal salesCountEstimateGreater = null;
        BigDecimal salesCountEstimateLess = null;
        BigDecimal salesStdDevEstimateGreater = null;
        BigDecimal salesStdDevEstimateLess = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksSalesSurprises response = api.getZacksSalesSurprises(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage);

        // TODO: test validations
    }
    
}
