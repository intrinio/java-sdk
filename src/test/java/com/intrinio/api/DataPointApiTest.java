

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataPointApi
 */
@Ignore
public class DataPointApiTest {

    private final DataPointApi api = new DataPointApi();

    
    /**
     * Data Point (Number)
     *
     * Returns a numeric value for the given &#x60;tag&#x60; and the entity with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataPointNumberTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        BigDecimal response = api.getDataPointNumber(identifier, tag);

        // TODO: test validations
    }
    
    /**
     * Data Point (Text)
     *
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataPointTextTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        String tag = null;
        String response = api.getDataPointText(identifier, tag);

        // TODO: test validations
    }
    
}
