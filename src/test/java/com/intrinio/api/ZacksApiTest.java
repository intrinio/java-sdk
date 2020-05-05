

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseZacksAnalystRatings;
import com.intrinio.models.ApiResponseZacksEPSEstimates;
import com.intrinio.models.ApiResponseZacksEPSGrowthRates;
import com.intrinio.models.ApiResponseZacksEPSSurprises;
import com.intrinio.models.ApiResponseZacksETFHoldings;
import com.intrinio.models.ApiResponseZacksInstitutionalHoldingCompanies;
import com.intrinio.models.ApiResponseZacksInstitutionalHoldingOwners;
import com.intrinio.models.ApiResponseZacksInstitutionalHoldings;
import com.intrinio.models.ApiResponseZacksLongTermGrowthRates;
import com.intrinio.models.ApiResponseZacksSalesSurprises;
import com.intrinio.models.ApiResponseZacksTargetPriceConsensuses;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
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
        LocalDate startDate = null;
        LocalDate endDate = null;
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
     * Zacks EPS Estimates
     *
     * Returns Zacks consensus earnings-per-share (EPS) data for all Companies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksEpsEstimatesTest() throws ApiException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer fiscalYear = null;
        String fiscalPeriod = null;
        Integer calendarYear = null;
        String calendarPeriod = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksEPSEstimates response = api.getZacksEpsEstimates(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks EPS Growth Rates
     *
     * Returns the latest Zacks EPS growth rates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksEpsGrowthRatesTest() throws ApiException {
        String company = null;
        String industryGroupName = null;
        String industryGroupNumber = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksEPSGrowthRates response = api.getZacksEpsGrowthRates(company, industryGroupName, industryGroupNumber, pageSize, nextPage);

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
        LocalDate startDate = null;
        LocalDate endDate = null;
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
     * Zacks ETF Holdings
     *
     * Returns Zacks ETF holdings data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksEtfHoldingsTest() throws ApiException {
        String etfTicker = null;
        String holdingSymbol = null;
        BigDecimal weightGreater = null;
        BigDecimal weightLess = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksETFHoldings response = api.getZacksEtfHoldings(etfTicker, holdingSymbol, weightGreater, weightLess, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks Institutional Holding Companies
     *
     * Returns Zacks institutional holding companies data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksInstitutionalHoldingCompaniesTest() throws ApiException {
        String ticker = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksInstitutionalHoldingCompanies response = api.getZacksInstitutionalHoldingCompanies(ticker, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks Institutional Holding Owners
     *
     * Returns Zacks institutional holding owners data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksInstitutionalHoldingOwnersTest() throws ApiException {
        String cik = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksInstitutionalHoldingOwners response = api.getZacksInstitutionalHoldingOwners(cik, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks Institutional Holdings
     *
     * Returns Zacks institutional holdings data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksInstitutionalHoldingsTest() throws ApiException {
        String ticker = null;
        String ownerCik = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksInstitutionalHoldings response = api.getZacksInstitutionalHoldings(ticker, ownerCik, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Zacks Long Term Growth Rates
     *
     * Returns the latest Zacks long term growth rates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksLongTermGrowthRatesTest() throws ApiException {
        String identifier = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksLongTermGrowthRates response = api.getZacksLongTermGrowthRates(identifier, pageSize, nextPage);

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
        LocalDate startDate = null;
        LocalDate endDate = null;
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
    
    /**
     * Zacks Target Price Consensuses
     *
     * Returns the latest Zacks target price consensus data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getZacksTargetPriceConsensusesTest() throws ApiException {
        String identifier = null;
        String industryGroupNumber = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseZacksTargetPriceConsensuses response = api.getZacksTargetPriceConsensuses(identifier, industryGroupNumber, pageSize, nextPage);

        // TODO: test validations
    }
    
}
