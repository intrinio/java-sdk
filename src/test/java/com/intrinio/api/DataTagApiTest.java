

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseDataTags;
import com.intrinio.models.ApiResponseDataTagsSearch;
import com.intrinio.models.DataTag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataTagApi
 */
@Ignore
public class DataTagApiTest {

    private final DataTagApi api = new DataTagApi();

    
    /**
     * All Data Tags
     *
     * Returns all Data Tags. Returns Data Tags matching parameters when specified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDataTagsTest() throws ApiException, NoSuchMethodException {
        String tag = null;
        String type = null;
        String parent = null;
        String statementCode = null;
        String fsTemplate = null;
        Integer pageSize = null;
        String nextPage = null;
        ApiResponseDataTags response = api.getAllDataTags(tag, type, parent, statementCode, fsTemplate, pageSize, nextPage);

        // TODO: test validations
    }
    
    /**
     * Lookup Data Tag
     *
     * Returns the Data Tag with the given &#x60;identifier&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDataTagByIdTest() throws ApiException, NoSuchMethodException {
        String identifier = null;
        DataTag response = api.getDataTagById(identifier);

        // TODO: test validations
    }
    
    /**
     * Search Data Tags
     *
     * Searches for Data Tags matching the text &#x60;query&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDataTagsTest() throws ApiException, NoSuchMethodException {
        String query = null;
        Integer pageSize = null;
        ApiResponseDataTagsSearch response = api.searchDataTags(query, pageSize);

        // TODO: test validations
    }
    
}
