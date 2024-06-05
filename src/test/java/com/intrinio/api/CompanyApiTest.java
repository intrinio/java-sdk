

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseCompanies;
import com.intrinio.models.ApiResponseCompaniesSearch;
import com.intrinio.models.ApiResponseCompanyAnswers;
import com.intrinio.models.ApiResponseCompanyDailyMetrics;
import com.intrinio.models.ApiResponseCompanyFilings;
import com.intrinio.models.ApiResponseCompanyFundamentals;
import com.intrinio.models.ApiResponseCompanyHistoricalData;
import com.intrinio.models.ApiResponseCompanyNews;
import com.intrinio.models.ApiResponseCompanyPublicFloatResult;
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
        Boolean theaEnabled = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanies response = api.getAllCompanies(latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, theaEnabled, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Companies daily metrics
     *
     * Returns the company metrics for a date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCompaniesDailyMetricsTest() throws ApiException, NoSuchMethodException {
        LocalDate onDate = null;
        Integer pageSize = null;
        String nextPage = null;
        String nextPage2 = null;
        ApiResponseCompanyDailyMetrics response = api.getAllCompaniesDailyMetrics(onDate, pageSize, nextPage, nextPage2);

        // TODO: test validations
    }
    
    /**
     * All News
     *
     * Returns the latest news article links, headlines and summaries for all US traded companies allowing you to keep a pulse on companies and their business operations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCompanyNewsTest() throws ApiException, NoSuchMethodException {
        String specificSource = null;
        Integer pageSize = null;
        String sentiment = null;
        String topic = null;
        String company = null;
        String security = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String language = null;
        Integer wordCountGreaterThan = null;
        Integer wordCountLessThan = null;
        Boolean isSpam = null;
        BigDecimal businessRelevanceGreaterThan = null;
        BigDecimal businessRelevanceLessThan = null;
        String nextPage = null;
        ApiResponseNews response = api.getAllCompanyNews(specificSource, pageSize, sentiment, topic, company, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Company
     *
     * Returns company reference and metadata such as tickers, CIK, and a unique company identifier, as well as company metadata such as business description, employee count, and company URL.
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
     * Company Answers
     *
     * Returns answers for a question about the Company with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyAnswersTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String query = null;
        ApiResponseCompanyAnswers response = api.getCompanyAnswers(identifier, query);

        // TODO: test validations
    }
    
    /**
     * Company metrics by Company
     *
     * Returns the latest company metrics.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyDailyMetricsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate onDate = null;
        Integer pageSize = null;
        String nextPage = null;
        String nextPage2 = null;
        ApiResponseCompanyDailyMetrics response = api.getCompanyDailyMetrics(identifier, onDate, pageSize, nextPage, nextPage2);

        // TODO: test validations
    }
    
    /**
     * Data Point (Number) for Company
     *
     * Returns latest value for calculations, metrics, and financial data points for a company.
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
     * Returns latest value for metadata items for a company.
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
        Boolean theaEnabled = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanyFilings response = api.getCompanyFilings(identifier, reportType, startDate, endDate, theaEnabled, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Fundamentals by Company
     *
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular company. Useful to obtain all historical and/or latest fundamental IDs for a given company to then use to loop through and pull all fundamental data available.
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
        LocalDate updatedAfter = null;
        LocalDate updatedBefore = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseCompanyFundamentals response = api.getCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, updatedAfter, updatedBefore, pageSize, nextPage);

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
     * Returns a list of historical, current, and upcoming initial public offerings (IPOs) across the major US Exchanges. Includes relevant information such as the IPO status, the offer amount, the total share count and target share price.
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
     * Returns the latest and historical news article links, headlines and summaries for a specified US traded company.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyNewsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String specificSource = null;
        Integer pageSize = null;
        String sentiment = null;
        String topic = null;
        String security = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String language = null;
        Integer wordCountGreaterThan = null;
        Integer wordCountLessThan = null;
        Boolean isSpam = null;
        BigDecimal businessRelevanceGreaterThan = null;
        BigDecimal businessRelevanceLessThan = null;
        String nextPage = null;
        ApiResponseCompanyNews response = api.getCompanyNews(identifier, specificSource, pageSize, sentiment, topic, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage);

        // TODO: test validations
    }
    
    /**
     * Get Company&#39;s public float
     *
     * Returns a list of public float data tied to a given company identifier.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompanyPublicFloatTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate floatDateGreaterThan = null;
        LocalDate floatDateLessThan = null;
        String nextPage = null;
        String nextPage2 = null;
        ApiResponseCompanyPublicFloatResult response = api.getCompanyPublicFloat(identifier, floatDateGreaterThan, floatDateLessThan, nextPage, nextPage2);

        // TODO: test validations
    }
    
    /**
     * All Securities by Company
     *
     * Returns a list of underlying securities with associated reference data tied to a given company identifier.
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
        String nextPage = null;
        Integer pageSize = null;
        String sortBy = null;
        String nextPage2 = null;
        ApiResponseInsiderTransactionFilings response = api.insiderTransactionFilingsByCompany(identifier, startDate, endDate, ownershipType, nextPage, pageSize, sortBy, nextPage2);

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
     * Search the companies database and return a list of companies matching the text query parameter passed through. Query parameter searches across the company ticker and name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCompaniesTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Boolean active = null;
        String mode = null;
        Integer pageSize = null;
        ApiResponseCompaniesSearch response = api.searchCompanies(query, active, mode, pageSize);

        // TODO: test validations
    }
    
    /**
     * Shares Outstanding by Company
     *
     * Returns the shares outstanding reported on the front cover of the SEC 10-K and 10-Q filings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sharesOutstandingByCompanyTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate endDateGreaterThan = null;
        LocalDate endDateLessThan = null;
        ApiResponseCompanySharesOutstanding response = api.sharesOutstandingByCompany(identifier, endDateGreaterThan, endDateLessThan);

        // TODO: test validations
    }
    
}
