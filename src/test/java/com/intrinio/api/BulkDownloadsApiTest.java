

package com.intrinio.api;

import com.intrinio.invoker.ApiException;
import com.intrinio.models.ApiResponseBulkDownloadLinks;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BulkDownloadsApi
 */
@Ignore
public class BulkDownloadsApiTest {

    private final BulkDownloadsApi api = new BulkDownloadsApi();

    
    /**
     * Bulk Downloads
     *
     * Returns all active bulk downloads for your account with links to download.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBulkDownloadLinksTest() throws ApiException {
        ApiResponseBulkDownloadLinks response = api.getBulkDownloadLinks();

        // TODO: test validations
    }
    
}
