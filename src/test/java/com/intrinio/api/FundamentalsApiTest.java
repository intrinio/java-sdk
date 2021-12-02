

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseReportedFinancials;
import com.intrinio.models.ApiResponseStandardizedFinancials;
import com.intrinio.models.ApiResponseStandardizedFinancialsDimensions;
import com.intrinio.models.Fundamental;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FundamentalsApi
 */
@Ignore
public class FundamentalsApiTest {

    private final FundamentalsApi api = new FundamentalsApi();

    
    /**
     * Fundamental by ID
     *
     * Returns detailed fundamental data for the given &#x60;id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundamentalByIdTest() throws ApiException, NoSuchMethodException {
        String id = null;
        Fundamental response = api.getFundamentalById(id);

        // TODO: test validations
    }
    
    /**
     * Reported Financials
     *
     * Returns the As-Reported Financials directly from the financial statements of the XBRL filings from the company
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundamentalReportedFinancialsTest() throws ApiException, NoSuchMethodException {
        String id = null;
        ApiResponseReportedFinancials response = api.getFundamentalReportedFinancials(id);

        // TODO: test validations
    }
    
    /**
     * Standardized Financials
     *
     * Returns professional-grade historical financial data. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies&#39; fundamentals.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundamentalStandardizedFinancialsTest() throws ApiException, NoSuchMethodException {
        String id = null;
        ApiResponseStandardizedFinancials response = api.getFundamentalStandardizedFinancials(id);

        // TODO: test validations
    }
    
    /**
     * Standardized Financials Dimensions
     *
     * Returns as reported dimensionality of a data tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundamentalStandardizedFinancialsDimensionsTest() throws ApiException, NoSuchMethodException {
        String id = null;
        String tag = null;
        ApiResponseStandardizedFinancialsDimensions response = api.getFundamentalStandardizedFinancialsDimensions(id, tag);

        // TODO: test validations
    }
    
    /**
     * Lookup Fundamental
     *
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lookupFundamentalTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String statementCode = null;
        Integer fiscalYear = null;
        String fiscalPeriod = null;
        Fundamental response = api.lookupFundamental(identifier, statementCode, fiscalYear, fiscalPeriod);

        // TODO: test validations
    }
    
}
