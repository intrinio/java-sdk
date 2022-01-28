

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseOwnerInsiderTransactionFilings;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InsiderTransactionFilingsApi
 */
@Ignore
public class InsiderTransactionFilingsApiTest {

    private final InsiderTransactionFilingsApi api = new InsiderTransactionFilingsApi();

    
    /**
     * All Insider Transactions Filings
     *
     * Returns all insider transactions filings fitting the optional supplied start and end date.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllInsiderTransactionFilingsTest() throws ApiException, NoSuchMethodException {
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer pageSize = null;
        String sortBy = null;
        String nextPage = null;
        ApiResponseOwnerInsiderTransactionFilings response = api.getAllInsiderTransactionFilings(startDate, endDate, pageSize, sortBy, nextPage);

        // TODO: test validations
    }
    
}
