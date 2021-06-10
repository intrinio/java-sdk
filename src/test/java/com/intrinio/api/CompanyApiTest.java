

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseCompanies;
import com.intrinio.models.ApiResponseCompaniesSearch;
import com.intrinio.models.ApiResponseCompanyFilings;
import com.intrinio.models.ApiResponseCompanyFundamentals;
import com.intrinio.models.ApiResponseCompanyHistoricalData;
import com.intrinio.models.ApiResponseCompanyNews;
import com.intrinio.models.ApiResponseCompanyRecognize;
import com.intrinio.models.ApiResponseCompanySecurities;
import com.intrinio.models.ApiResponseCompanySharesOutstanding;
import com.intrinio.models.ApiResponseInitialPublicOfferings;
import com.intrinio.models.ApiResponseInsiderTransactionFilings;
import com.intrinio.models.ApiResponseNews;
import java.math.BigDecimal;
import com.intrinio.models.Company;
import com.intrinio.models.Fundamental;
import com.intrinio.models.InsiderTransactionFiling;
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
     * All Companies
     *
     * Returns all Companies. When parameters are specified, returns matching companies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCompaniesTest() throws ApiException, NoSuchMethodException {
        LocalDate latestFilingDate = null;
        String sic = null;
        String template = null;
        String sector = null;
        String industryCategory = null;
        String industryGroup = null;
        Boolean hasFundamentals = null;
        Boolean hasStockPrices = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanies response = api.getAllCompanies(latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, pageSize, nextPage);

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
    public void getAllCompanyNewsTest() throws ApiException, NoSuchMethodException {
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseNews response = api.getAllCompanyNews(pageSize, nextPage);

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
    public void getCompanyTest() throws ApiException, NoSuchMethodException {
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
    public void getCompanyDataPointNumberTest() throws ApiException, NoSuchMethodException {
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
    public void getCompanyDataPointTextTest() throws ApiException, NoSuchMethodException {
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
    public void getCompanyFilingsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String reportType = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanyFilings response = api.getCompanyFilings(identifier, reportType, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Fundamentals by Company
     *
     * Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;. Returns Fundamentals matching parameters when supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyFundamentalsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate filedAfter = null;
        LocalDate filedBefore = null;
        Boolean reportedOnly = null;
        Integer fiscalYear = null;
        String statementCode = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanyFundamentals response = api.getCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, pageSize, nextPage);

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
    public void getCompanyHistoricalDataTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String frequency = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanyHistoricalData response = api.getCompanyHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * IPOs
     *
     * Returns initial public offerings (IPOs). An IPO is a public offering of private company stock. The act of \&quot;going public\&quot; is initiated by an IPO, at which point the company&#39;s stock trades on a major stock exchange (such as NYSE or NASDAQ). Intrinio covers all upcoming and recent IPOs for US exchanges.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyIposTest() throws ApiException, NoSuchMethodException {
        String ticker = null;
        String status = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer offerAmountGreaterThan = null;
        Integer offerAmountLessThan = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseInitialPublicOfferings response = api.getCompanyIpos(ticker, status, startDate, endDate, offerAmountGreaterThan, offerAmountLessThan, pageSize, nextPage);

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
    public void getCompanyNewsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanyNews response = api.getCompanyNews(identifier, pageSize, nextPage);

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
    public void getCompanySecuritiesTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String nextPage = null;
        ApiResponseCompanySecurities response = api.getCompanySecurities(identifier, nextPage);

        // TODO: test validations
    }
    
    /**
     * Insider Transaction Filings by Company
     *
     * Returns a list of all insider transaction filings in a company. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insiderTransactionFilingsByCompanyTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String ownershipType = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseInsiderTransactionFilings response = api.insiderTransactionFilingsByCompany(identifier, startDate, endDate, ownershipType, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Latest Insider Transaction Filing by Company
     *
     * Returns the latest insider transaction filing for a company.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void latestInsiderTransactionFilingByCompanyTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String nextPage = null;
        InsiderTransactionFiling response = api.latestInsiderTransactionFilingByCompany(identifier, nextPage);

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
    public void lookupCompanyFundamentalTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String statementCode = null;
        String fiscalPeriod = null;
        Integer fiscalYear = null;
        Fundamental response = api.lookupCompanyFundamental(identifier, statementCode, fiscalPeriod, fiscalYear);

        // TODO: test validations
    }
    
    /**
     * Recognize Company
     *
     * Returns a list of companies recognized by the Thea API in the given &#x60;text&#x60; query string parameter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recognizeCompanyTest() throws ApiException, NoSuchMethodException {
        String text = null;
        ApiResponseCompanyRecognize response = api.recognizeCompany(text);

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
    public void searchCompaniesTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Boolean active = null;
        Integer pageSize = null;
        ApiResponseCompaniesSearch response = api.searchCompanies(query, active, pageSize);

        // TODO: test validations
    }
    
    /**
     * Shares Outstanding by Company
     *
     * Returns shares outstanding for the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sharesOutstandingByCompanyTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        ApiResponseCompanySharesOutstanding response = api.sharesOutstandingByCompany(identifier);

        // TODO: test validations
    }
    
}
