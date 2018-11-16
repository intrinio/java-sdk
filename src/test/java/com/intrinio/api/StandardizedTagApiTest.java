

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import java.math.BigDecimal;
import com.intrinio.models.HistoricalData;
import org.threeten.bp.LocalDate;
import com.intrinio.models.StandardizedTag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StandardizedTagApi
 */
@Ignore
public class StandardizedTagApiTest {

    private final StandardizedTagApi api = new StandardizedTagApi();

    
    /**
     * Filter Standardized Tags
     *
     * Returns Standarized Tags that match the given filters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterStandardizedTagsTest() throws ApiException {
        String tag = null;
        String type = null;
        String parent = null;
        String statementCode = null;
        String fsTemplate = null;
        String nextPage = null;
        List<StandardizedTag> response = api.filterStandardizedTags(tag, type, parent, statementCode, fsTemplate, nextPage);

        // TODO: test validations
    }
    
    /**
     * Get All Standardized Tags
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStandardizedTagsTest() throws ApiException {
        String nextPage = null;
        List<StandardizedTag> response = api.getAllStandardizedTags(nextPage);

        // TODO: test validations
    }
    
    /**
     * Get a Standardized Tag by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardizedTagByIdTest() throws ApiException {
        String tagId = null;
        StandardizedTag response = api.getStandardizedTagById(tagId);

        // TODO: test validations
    }
    
    /**
     * Get Data Point (Number) for The Standardized Tag
     *
     * Returns a numeric data point for the Standardized Tag and entity &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardizedTagDataPointNumberTest() throws ApiException {
        String id = null;
        String identifier = null;
        BigDecimal response = api.getStandardizedTagDataPointNumber(id, identifier);

        // TODO: test validations
    }
    
    /**
     * Get Data Point (Text) for the Standardized Tag
     *
     * Returns a text data point for the Standardized Tag and entity &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardizedTagDataPointTextTest() throws ApiException {
        String id = null;
        String identifier = null;
        String response = api.getStandardizedTagDataPointText(id, identifier);

        // TODO: test validations
    }
    
    /**
     * Get Historical Data for the Standardized Tag
     *
     * Returns historical values for the Standardized Tag and the Entity represented by the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandardizedTagHistoricalDataTest() throws ApiException {
        String id = null;
        String identifier = null;
        String type = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String sortOrder = null;
        String nextPage = null;
        List<HistoricalData> response = api.getStandardizedTagHistoricalData(id, identifier, type, startDate, endDate, sortOrder, nextPage);

        // TODO: test validations
    }
    
    /**
     * Search Standardized Tags
     *
     * Searches for Standardized Tags matching the text &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchStandardizedTagsTest() throws ApiException {
        String query = null;
        String nextPage = null;
        List<StandardizedTag> response = api.searchStandardizedTags(query, nextPage);

        // TODO: test validations
    }
    
}
