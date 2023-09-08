

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.MarketStatusResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketApi
 */
@Ignore
public class MarketApiTest {

    private final MarketApi api = new MarketApi();

    
    /**
     * Market Status
     *
     * Returns the market status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketStatusTest() throws ApiException, NoSuchMethodException {
        MarketStatusResult response = api.getMarketStatus();

        // TODO: test validations
    }
    
}
