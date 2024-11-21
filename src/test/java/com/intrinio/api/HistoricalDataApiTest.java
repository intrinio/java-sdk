

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseHistoricalData;
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
     * $$v2_historical_data_description$$
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricalDataTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String frequency = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseHistoricalData response = api.getHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);

        // TODO: test validations
    }
    
}
