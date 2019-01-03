

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseFilingNotes;
import com.intrinio.models.ApiResponseFilingNotesSearch;
import com.intrinio.models.ApiResponseFilings;
import java.math.BigDecimal;
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
     * Filter Filings
     *
     * Returns Filings that match the specified filters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterFilingsTest() throws ApiException {
        String company = null;
        String reportType = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String nextPage = null;
        ApiResponseFilings response = api.filterFilings(company, reportType, startDate, endDate, nextPage);

        // TODO: test validations
    }
    
    /**
     * Filter Filing Notes
     *
     * Returns Filing Notes that match the specified filters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterNotesTest() throws ApiException {
        String company = null;
        String reportType = null;
        LocalDate filingStartDate = null;
        LocalDate filingEndDate = null;
        LocalDate periodEndedStartDate = null;
        LocalDate periodEndedEndDate = null;
        String nextPage = null;
        ApiResponseFilingNotes response = api.filterNotes(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, nextPage);

        // TODO: test validations
    }
    
    /**
     * All Filings
     *
     * Returns all Filings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFilingsTest() throws ApiException {
        String nextPage = null;
        ApiResponseFilings response = api.getAllFilings(nextPage);

        // TODO: test validations
    }
    
    /**
     * All Filing Notes
     *
     * Return all Notes from all Filings, most-recent first
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNotesTest() throws ApiException {
        String nextPage = null;
        ApiResponseFilingNotes response = api.getAllNotes(nextPage);

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
        BigDecimal pageSize = null;
        ApiResponseFilingNotesSearch response = api.searchNotes(query, filingStartDate, filingEndDate, pageSize);

        // TODO: test validations
    }
    
}
