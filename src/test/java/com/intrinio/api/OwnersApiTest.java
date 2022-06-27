

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseOwnerInsiderTransactionFilings;
import com.intrinio.models.ApiResponseOwnerInstitutionalHoldings;
import com.intrinio.models.ApiResponseOwners;
import org.threeten.bp.LocalDate;
import com.intrinio.models.Owner;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OwnersApi
 */
@Ignore
public class OwnersApiTest {

    private final OwnersApi api = new OwnersApi();

    
    /**
     * All Owners
     *
     * Returns all owners and information for all insider and institutional owners of securities covered by Intrinio.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllOwnersTest() throws ApiException, NoSuchMethodException {
        Boolean institutional = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseOwners response = api.getAllOwners(institutional, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Owner by ID
     *
     * Returns the Owner with the given ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOwnerByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Owner response = api.getOwnerById(identifier);

        // TODO: test validations
    }
    
    /**
     * Insider Transaction Filings by Owner
     *
     * Returns a list of all insider transaction filings by an owner in as many companies as the owner may be considered an insider. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insiderTransactionFilingsByOwnerTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseOwnerInsiderTransactionFilings response = api.insiderTransactionFilingsByOwner(identifier, startDate, endDate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Institutional Holdings by Owner
     *
     * Returns a list of all ownership interests and the value of their interests by a single institutional owner.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void institutionalHoldingsByOwnerTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        Integer pageSize = null;
        LocalDate asOfDate = null;
        String nextPage = null;
        ApiResponseOwnerInstitutionalHoldings response = api.institutionalHoldingsByOwner(identifier, pageSize, asOfDate, nextPage);

        // TODO: test validations
    }
    
    /**
     * Search Owners
     *
     * Searches for Owners matching the text &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchOwnersTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Boolean institutional = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseOwners response = api.searchOwners(query, institutional, pageSize, nextPage);

        // TODO: test validations
    }
    
}
