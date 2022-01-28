

package com.intrinio.api;

import com.intrinio.invoker.ApiCallback;
import com.intrinio.invoker.ApiClient;
import com.intrinio.invoker.ApiException;
import com.intrinio.invoker.ApiResponse;
import com.intrinio.invoker.Configuration;
import com.intrinio.invoker.Pair;
import com.intrinio.invoker.ProgressRequestBody;
import com.intrinio.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.intrinio.models.ApiResponseOwnerInsiderTransactionFilings;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsiderTransactionFilingsApi {
    private ApiClient apiClient;

    public InsiderTransactionFilingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InsiderTransactionFilingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllInsiderTransactionFilings
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;.  Valid values are - &#39;filing_date&#39;, &#39;updated_on&#39;. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllInsiderTransactionFilingsCall(LocalDate startDate, LocalDate endDate, Integer pageSize, String sortBy, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/insider_transaction_filings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", sortBy));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllInsiderTransactionFilingsValidateBeforeCall(LocalDate startDate, LocalDate endDate, Integer pageSize, String sortBy, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllInsiderTransactionFilingsCall(startDate, endDate, pageSize, sortBy, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Insider Transactions Filings
     * Returns all insider transactions filings fitting the optional supplied start and end date.
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;.  Valid values are - &#39;filing_date&#39;, &#39;updated_on&#39;. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseOwnerInsiderTransactionFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOwnerInsiderTransactionFilings getAllInsiderTransactionFilings(LocalDate startDate, LocalDate endDate, Integer pageSize, String sortBy, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = InsiderTransactionFilingsApi.class.getMethod("getAllInsiderTransactionFilingsWithHttpInfo", LocalDate.class, LocalDate.class, Integer.class, String.class, String.class);
      
      Object[] apiCallArguments = { startDate, endDate, pageSize, sortBy, nextPage };
      ApiResponse<ApiResponseOwnerInsiderTransactionFilings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Insider Transactions Filings
     * Returns all insider transactions filings fitting the optional supplied start and end date.
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;.  Valid values are - &#39;filing_date&#39;, &#39;updated_on&#39;. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseOwnerInsiderTransactionFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOwnerInsiderTransactionFilings> getAllInsiderTransactionFilingsWithHttpInfo(LocalDate startDate, LocalDate endDate, Integer pageSize, String sortBy, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllInsiderTransactionFilingsValidateBeforeCall(startDate, endDate, pageSize, sortBy, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOwnerInsiderTransactionFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Insider Transactions Filings (asynchronously)
     * Returns all insider transactions filings fitting the optional supplied start and end date.
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;.  Valid values are - &#39;filing_date&#39;, &#39;updated_on&#39;. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllInsiderTransactionFilingsAsync(LocalDate startDate, LocalDate endDate, Integer pageSize, String sortBy, String nextPage, final ApiCallback<ApiResponseOwnerInsiderTransactionFilings> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllInsiderTransactionFilingsValidateBeforeCall(startDate, endDate, pageSize, sortBy, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOwnerInsiderTransactionFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
