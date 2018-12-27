

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseCompanies;
import com.intrinio.models.ApiResponseCompanyFilings;
import com.intrinio.models.ApiResponseCompanyFundamentals;
import com.intrinio.models.ApiResponseCompanyHistoricalData;
import com.intrinio.models.ApiResponseCompanyNews;
import com.intrinio.models.ApiResponseCompanySecurities;
import com.intrinio.models.ApiResponseNews;
import java.math.BigDecimal;
import com.intrinio.models.Company;
import com.intrinio.models.Fundamental;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompanyApi
 */
@Ignore
public class CompanyApiTest {

    private final CompanyApi api = new CompanyApi();

    
    /**
     * Filter Companies
     *
     * Returns Companies matching the specified filters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterCompaniesTest() throws ApiException {
        LocalDate lastFilingDate = null;
        String sic = null;
        String template = null;
        String sector = null;
        String industryCategory = null;
        String industryGroup = null;
        String nextPage = null;
        ApiResponseCompanies response = api.filterCompanies(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage);

        // TODO: test validations
    }
    
    /**
     * Filter Fundamentals by Company
     *
     * Returns Fundamentals for the Company with the given &#x60;identifier&#x60; and matching the specified filters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterCompanyFundamentalsTest() throws ApiException {
        String identifier = null;
        LocalDate filedAfter = null;
        LocalDate filedBefore = null;
        Boolean reportedOnly = null;
        Integer fiscalYear = null;
        String statementCode = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String nextPage = null;
        ApiResponseCompanyFundamentals response = api.filterCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Companies
     *
     * Returns all Companies
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCompaniesTest() throws ApiException {
        String nextPage = null;
        ApiResponseCompanies response = api.getAllCompanies(nextPage);

        // TODO: test validations
    }
    
    /**
     * All News
     *
     * Returns all News for all Companies
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCompanyNewsTest() throws ApiException {
        String nextPage = null;
        ApiResponseNews response = api.getAllCompanyNews(nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Company
     *
     * Returns the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyTest() throws ApiException {
        String identifier = null;
        Company response = api.getCompany(identifier);

        // TODO: test validations
    }
    
    /**
     * Data Point (Number) for Company
     *
     * Returns a numeric value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyDataPointNumberTest() throws ApiException {
        String identifier = null;
        String tag = null;
        BigDecimal response = api.getCompanyDataPointNumber(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Data Point (Text) for Company
     *
     * Returns a text value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyDataPointTextTest() throws ApiException {
        String identifier = null;
        String tag = null;
        String response = api.getCompanyDataPointText(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * All Filings by Company
     *
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyFilingsTest() throws ApiException {
        String identifier = null;
        String nextPage = null;
        ApiResponseCompanyFilings response = api.getCompanyFilings(identifier, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Fundamentals by Company
     *
     * Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyFundamentalsTest() throws ApiException {
        String identifier = null;
        String nextPage = null;
        ApiResponseCompanyFundamentals response = api.getCompanyFundamentals(identifier, nextPage);

        // TODO: test validations
    }
    
    /**
     * Historical Data for Company
     *
     * Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyHistoricalDataTest() throws ApiException {
        String identifier = null;
        String tag = null;
        String frequency = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        String nextPage = null;
        ApiResponseCompanyHistoricalData response = api.getCompanyHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, nextPage);

        // TODO: test validations
    }
    
    /**
     * All News by Company
     *
     * Returns news for the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyNewsTest() throws ApiException {
        String identifier = null;
        String nextPage = null;
        ApiResponseCompanyNews response = api.getCompanyNews(identifier, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Securities by Company
     *
     * Returns Securities for the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanySecuritiesTest() throws ApiException {
        String identifier = null;
        String nextPage = null;
        ApiResponseCompanySecurities response = api.getCompanySecurities(identifier, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Fundamental by Company
     *
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lookupCompanyFundamentalTest() throws ApiException {
        String identifier = null;
        String statementCode = null;
        String fiscalPeriod = null;
        Integer fiscalYear = null;
        Fundamental response = api.lookupCompanyFundamental(identifier, statementCode, fiscalPeriod, fiscalYear);

        // TODO: test validations
    }
    
    /**
     * Search Companies
     *
     * Searches for Companies matching the text &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCompaniesTest() throws ApiException {
        String query = null;
        ApiResponseCompanies response = api.searchCompanies(query);

        // TODO: test validations
    }
    
}
