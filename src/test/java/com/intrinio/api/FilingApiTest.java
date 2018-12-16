

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseFilings;
import com.intrinio.models.Filing;
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
     * Returns filings that match the specified filters
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
     * Get All Filings
     *
     * Returns all filings
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
     * Get a Filing by ID
     *
     * Return the filing with the given ID
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
    
}
