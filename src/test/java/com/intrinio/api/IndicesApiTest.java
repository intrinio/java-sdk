

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseIndexIntervals;
import org.threeten.bp.LocalDate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndicesApi
 */
@Ignore
public class IndicesApiTest {

    private final IndicesApi api = new IndicesApi();

    
    /**
     * Index Intervals
     *
     * Returns a list of interval data points for a specified index, including open, close, high, low, volume, and average price. Intervals are available in 60-minute, 30-minute, 15-minute, 10-minute, 5-minute, and 1-minute increments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndexIntervalsTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String intervalSize = null;
        LocalDate startDate = null;
        String startTime = null;
        LocalDate endDate = null;
        String endTime = null;
        String timezone = null;
        Integer pageSize = null;
        ApiResponseIndexIntervals response = api.getIndexIntervals(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize);

        // TODO: test validations
    }
    
}
