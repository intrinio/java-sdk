

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
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
     * Returns all Filings. Returns Filings matching parameters when supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFilingsTest() throws ApiException {
        String company = null;
        String reportType = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseFilings response = api.getAllFilings(company, reportType, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Filing Notes
     *
     * Return all Notes from all Filings, most-recent first. Returns notes matching parameters when supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNotesTest() throws ApiException {
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
     * Lookup Filing
     *
     * Returns the Filing with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilingByIdTest() throws ApiException {
        String id = null;
        Filing response = api.getFilingById(id);

        // TODO: test validations
    }
    
    /**
     * All Fundamentals by Filing
     *
     * Returns all Fundamentals for the SEC Filing with the given &#x60;identifier&#x60;. Returns Fundamentals matching parameters when supplied.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilingFundamentalsTest() throws ApiException {
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
     * Filing Note by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteTest() throws ApiException {
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
    public void getNoteHtmlTest() throws ApiException {
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
    public void getNoteTextTest() throws ApiException {
        String identifier = null;
        String response = api.getNoteText(identifier);

        // TODO: test validations
    }
    
    /**
     * Search Filing Notes
     *
     * Searches for Filing Notes using the &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchNotesTest() throws ApiException {
        String query = null;
        LocalDate filingStartDate = null;
        LocalDate filingEndDate = null;
        Integer pageSize = null;
        Integer pageSize2 = null;
        ApiResponseFilingNotesSearch response = api.searchNotes(query, filingStartDate, filingEndDate, pageSize, pageSize2);

        // TODO: test validations
    }
    
}
