

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseReportedFinancials;
import com.intrinio.models.ApiResponseStandardizedFinancials;
import com.intrinio.models.ApiResponseStandardizedFinancialsDimensions;
import com.intrinio.models.Fundamental;
import org.threeten.bp.LocalDate;
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
     * Filter Fundamental
     *
     * Returns fundamentals that meet the set of filters specified in parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterFundamentalTest() throws ApiException, NoSuchMethodException {
        LocalDate filedAfter = null;
        LocalDate filedBefore = null;
        Boolean reportedOnly = null;
        Integer fiscalYear = null;
        String statementCode = null;
        String type = null;
        String fiscalPeriod = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        LocalDate updatedAfter = null;
        LocalDate updatedBefore = null;
        String template = null;
        String nextPage = null;
        Fundamental response = api.filterFundamental(filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fiscalPeriod, startDate, endDate, updatedAfter, updatedBefore, template, nextPage);

        // TODO: test validations
    }
    
    /**
     * Fundamental by ID
     *
     * Returns a specific fundamental associated with a particular unique fundamental ID. Useful for pulling reference data for a specific fundamental.
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
     * Returns as-reported financial statement data for income statement, balance sheet, and cash flow statement. Data for income statement and cash flow statement is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
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
     * Returns standardized financial statement data for income statement, balance sheet, cash flow statement and over 100 associated calculations for a given company. Data for income statement, cash flow statement, and calculations is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
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
     * Returns a specific fundamental with unique fundamental ID associated with a particular company, year, period and statement. Useful for pulling the unique fundamental ID and reference data for a specific fundamental.
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
