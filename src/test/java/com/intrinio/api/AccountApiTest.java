

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseAccountCurrentUsages;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * Account Current Usage
     *
     * Returns a list of all access codes available with their current usage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountCurrentUsageTest() throws ApiException, NoSuchMethodException {
        ApiResponseAccountCurrentUsages response = api.getAccountCurrentUsage();

        // TODO: test validations
    }
    
}
