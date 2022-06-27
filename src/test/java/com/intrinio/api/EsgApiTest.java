

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseESGCompanies;
import com.intrinio.models.ApiResponseESGCompanyRatingHistory;
import com.intrinio.models.ApiResponseESGLatest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EsgApi
 */
@Ignore
public class EsgApiTest {

    private final EsgApi api = new EsgApi();

    
    /**
     * ESG Companies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEsgCompaniesTest() throws ApiException, NoSuchMethodException {
        String country = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseESGCompanies response = api.getEsgCompanies(country, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * ESG Company Ratings History
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEsgCompanyRatingsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseESGCompanyRatingHistory response = api.getEsgCompanyRatings(identifier, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * ESG Latest
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEsgLatestTest() throws ApiException, NoSuchMethodException {
        String country = null;
        String country2 = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseESGLatest response = api.getEsgLatest(country, country2, pageSize, nextPage);

        // TODO: test validations
    }
    
}
