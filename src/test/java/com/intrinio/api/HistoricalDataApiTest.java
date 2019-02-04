

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseHistoricalData;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoricalDataApi
 */
@Ignore
public class HistoricalDataApiTest {

    private final HistoricalDataApi api = new HistoricalDataApi();

    
    /**
     * Historical Data
     *
     * Returns historical values for the given &#x60;tag&#x60; and the entity represented by the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricalDataTest() throws ApiException {
        String identifier = null;
        String tag = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        BigDecimal pageSize = null;
        String nextPage = null;
        ApiResponseHistoricalData response = api.getHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
}
