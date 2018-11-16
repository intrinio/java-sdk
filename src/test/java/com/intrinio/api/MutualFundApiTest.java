

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import org.threeten.bp.LocalDate;
import com.intrinio.models.MutualFund;
import com.intrinio.models.MutualFundStat;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MutualFundApi
 */
@Ignore
public class MutualFundApiTest {

    private final MutualFundApi api = new MutualFundApi();

    
    /**
     * Get All Mutual Funds
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMutualFundsTest() throws ApiException {
        String nextPage = null;
        List<MutualFund> response = api.getAllMutualFunds(nextPage);

        // TODO: test validations
    }
    
    /**
     * Get a Mutual Fund by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMutualFundByIdTest() throws ApiException {
        String identifier = null;
        MutualFund response = api.getMutualFundById(identifier);

        // TODO: test validations
    }
    
    /**
     * Get Stats for a Mutual Fund
     *
     * Returns stats for the  Mutual Fund with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMutualFundStatsTest() throws ApiException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String nextPage = null;
        List<MutualFundStat> response = api.getMutualFundStats(identifier, startDate, endDate, nextPage);

        // TODO: test validations
    }
    
    /**
     * Search Mutual Funds
     *
     * Searches for Mutual Funds matching the text &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchMutualFundsTest() throws ApiException {
        String query = null;
        String nextPage = null;
        List<MutualFund> response = api.searchMutualFunds(query, nextPage);

        // TODO: test validations
    }
    
}
