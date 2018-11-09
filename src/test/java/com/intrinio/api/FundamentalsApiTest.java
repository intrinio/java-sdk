

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseReportedFinancials;
import com.intrinio.models.ApiResponseStandardizedFinancials;
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
     * Get a Fundamental by ID
     *
     * Retrieves detailed fundamental data for the given &#x60;fundamental_id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundamentalByIdTest() throws ApiException {
        String id = null;
        Fundamental response = api.getFundamentalById(id);

        // TODO: test validations
    }
    
    /**
     * Get Reported Financials for a Fundamental
     *
     * Returns the As-Reported Financials directly from the financial statements of the XBRL filings from the company
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundamentalReportedFinancialsTest() throws ApiException {
        String id = null;
        ApiResponseReportedFinancials response = api.getFundamentalReportedFinancials(id);

        // TODO: test validations
    }
    
    /**
     * Get Standardized Financials for a Fundamental
     *
     * Returns professional-grade historical financial data. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as reported financial statements because of the inherent complexity of reporting standards.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFundamentalStandardizedFinancialsTest() throws ApiException {
        String id = null;
        ApiResponseStandardizedFinancials response = api.getFundamentalStandardizedFinancials(id);

        // TODO: test validations
    }
    
    /**
     * Lookup a Fundamental
     *
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lookupFundamentalTest() throws ApiException {
        String identifier = null;
        String statementCode = null;
        String fiscalPeriod = null;
        Integer fiscalYear = null;
        List<Fundamental> response = api.lookupFundamental(identifier, statementCode, fiscalPeriod, fiscalYear);

        // TODO: test validations
    }
    
}
