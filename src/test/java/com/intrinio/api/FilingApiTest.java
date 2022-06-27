

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseFilingAnswers;
import com.intrinio.models.ApiResponseFilingFundamentals;
import com.intrinio.models.ApiResponseFilingNotes;
import com.intrinio.models.ApiResponseFilingNotesSearch;
import com.intrinio.models.ApiResponseFilings;
import com.intrinio.models.Filing;
import com.intrinio.models.FilingNote;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilingApi
 */
@Ignore
public class FilingApiTest {

    private final FilingApi api = new FilingApi();

    
    /**
     * All Filings
     *
     * Returns pertinent filing reference data for a specific company filing or latest filings for all companies. Useful for tracking the latest filings submitted and updating your database accordingly with the new information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFilingsTest() throws ApiException, NoSuchMethodException {
        String company = null;
        String reportType = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String industryCategory = null;
        String industryGroup = null;
        Boolean theaEnabled = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseFilings response = api.getAllFilings(company, reportType, startDate, endDate, industryCategory, industryGroup, theaEnabled, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Filing Notes
     *
     * Returns a list of the latest XBRL filing note sections from the SEC 10-K and 10-Q statements. The returned Intrinio XBRL filing note ID can then be utilized with the “Filing Note by ID” endpoint to retrieve the contents of the note in HTML or text format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNotesTest() throws ApiException, NoSuchMethodException {
        String company = null;
        String reportType = null;
        LocalDate filingStartDate = null;
        LocalDate filingEndDate = null;
        LocalDate periodEndedStartDate = null;
        LocalDate periodEndedEndDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseFilingNotes response = api.getAllNotes(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Filing Answers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilingAnswersTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String query = null;
        ApiResponseFilingAnswers response = api.getFilingAnswers(identifier, query);

        // TODO: test validations
    }
    
    /**
     * Lookup Filing
     *
     * Returns the Filing with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilingByIdTest() throws ApiException, NoSuchMethodException {
        String id = null;
        Filing response = api.getFilingById(id);

        // TODO: test validations
    }
    
    /**
     * All Fundamentals by Filing
     *
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular &#x60;Intrinio Filing ID&#x60; (if applicable) that have been updated or created as a result of a company&#x60;s latest SEC filing. Useful to ensure your database is up to date with the latest fundamentals.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilingFundamentalsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String statementCode = null;
        String type = null;
        Integer fiscalYear = null;
        String fiscalPeriod = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String nextPage = null;
        ApiResponseFilingFundamentals response = api.getFilingFundamentals(identifier, statementCode, type, fiscalYear, fiscalPeriod, startDate, endDate, nextPage);

        // TODO: test validations
    }
    
    /**
     * Filing Html
     *
     * Returns a SEC filing in HTML Format for a specified filing ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilingHtmlTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String response = api.getFilingHtml(identifier);

        // TODO: test validations
    }
    
    /**
     * Filing Text
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilingTextTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String response = api.getFilingText(identifier);

        // TODO: test validations
    }
    
    /**
     * Filing Note by ID
     *
     * Returns the XBRL filing note contents in HTML or text format for a specified Intrinio XBRL filing note ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String contentFormat = null;
        FilingNote response = api.getNote(identifier, contentFormat);

        // TODO: test validations
    }
    
    /**
     * Filing Note HTML
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteHtmlTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String response = api.getNoteHtml(identifier);

        // TODO: test validations
    }
    
    /**
     * Filing Note Text
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteTextTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String response = api.getNoteText(identifier);

        // TODO: test validations
    }
    
    /**
     * Search Filing Notes
     *
     * Search the XBRL note database and return a list of XBRL note sections containing text from the text query parameter passed through.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchNotesTest() throws ApiException, NoSuchMethodException {
        String query = null;
        LocalDate filingStartDate = null;
        LocalDate filingEndDate = null;
        Integer pageSize = null;
        ApiResponseFilingNotesSearch response = api.searchNotes(query, filingStartDate, filingEndDate, pageSize);

        // TODO: test validations
    }
    
}
