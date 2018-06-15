

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


import org.threeten.bp.LocalDate;
import com.intrinio.models.MutualFund;
import com.intrinio.models.MutualFundStat;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MutualFundApi {
    private ApiClient apiClient;

    public MutualFundApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MutualFundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllMutualFunds
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllMutualFundsCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/mutual_funds";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        String[] localVarAuthNames = new String[] { "HttpHeaderApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllMutualFundsValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllMutualFundsCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Mutual Funds
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;MutualFund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MutualFund> getAllMutualFunds(String nextPage) throws ApiException {
        ApiResponse<List<MutualFund>> resp = getAllMutualFundsWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Mutual Funds
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;MutualFund&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MutualFund>> getAllMutualFundsWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllMutualFundsValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<MutualFund>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Mutual Funds (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllMutualFundsAsync(String nextPage, final ApiCallback<List<MutualFund>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllMutualFundsValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MutualFund>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMutualFundById
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMutualFundByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/mutual_funds/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "HttpHeaderApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMutualFundByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getMutualFundById(Async)");
        }
        

        com.squareup.okhttp.Call call = getMutualFundByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Mutual Fund by ID
     * 
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @return MutualFund
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MutualFund getMutualFundById(String identifier) throws ApiException {
        ApiResponse<MutualFund> resp = getMutualFundByIdWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get a Mutual Fund by ID
     * 
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @return ApiResponse&lt;MutualFund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MutualFund> getMutualFundByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getMutualFundByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<MutualFund>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Mutual Fund by ID (asynchronously)
     * 
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMutualFundByIdAsync(String identifier, final ApiCallback<MutualFund> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMutualFundByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MutualFund>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMutualFundStats
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @param startDate Return stats on or after the date (optional)
     * @param endDate Return stats on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMutualFundStatsCall(String identifier, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/mutual_funds/{identifier}/stats"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
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

        String[] localVarAuthNames = new String[] { "HttpHeaderApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMutualFundStatsValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getMutualFundStats(Async)");
        }
        

        com.squareup.okhttp.Call call = getMutualFundStatsCall(identifier, startDate, endDate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stats for a Mutual Fund
     * Returns stats for the  Mutual Fund with the given &#x60;identifier&#x60;
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @param startDate Return stats on or after the date (optional)
     * @param endDate Return stats on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;MutualFundStat&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MutualFundStat> getMutualFundStats(String identifier, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        ApiResponse<List<MutualFundStat>> resp = getMutualFundStatsWithHttpInfo(identifier, startDate, endDate, nextPage);
        return resp.getData();
    }

    /**
     * Get Stats for a Mutual Fund
     * Returns stats for the  Mutual Fund with the given &#x60;identifier&#x60;
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @param startDate Return stats on or after the date (optional)
     * @param endDate Return stats on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;MutualFundStat&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MutualFundStat>> getMutualFundStatsWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getMutualFundStatsValidateBeforeCall(identifier, startDate, endDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<MutualFundStat>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stats for a Mutual Fund (asynchronously)
     * Returns stats for the  Mutual Fund with the given &#x60;identifier&#x60;
     * @param identifier A Mutual Fund identifier (CUSIP, Intrinio ID) (required)
     * @param startDate Return stats on or after the date (optional)
     * @param endDate Return stats on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMutualFundStatsAsync(String identifier, LocalDate startDate, LocalDate endDate, String nextPage, final ApiCallback<List<MutualFundStat>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMutualFundStatsValidateBeforeCall(identifier, startDate, endDate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MutualFundStat>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchMutualFunds
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchMutualFundsCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/mutual_funds/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
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

        String[] localVarAuthNames = new String[] { "HttpHeaderApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchMutualFundsValidateBeforeCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchMutualFunds(Async)");
        }
        

        com.squareup.okhttp.Call call = searchMutualFundsCall(query, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Mutual Funds
     * Searches for Mutual Funds matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;MutualFund&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MutualFund> searchMutualFunds(String query, String nextPage) throws ApiException {
        ApiResponse<List<MutualFund>> resp = searchMutualFundsWithHttpInfo(query, nextPage);
        return resp.getData();
    }

    /**
     * Search Mutual Funds
     * Searches for Mutual Funds matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;MutualFund&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MutualFund>> searchMutualFundsWithHttpInfo(String query, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = searchMutualFundsValidateBeforeCall(query, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<MutualFund>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Mutual Funds (asynchronously)
     * Searches for Mutual Funds matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchMutualFundsAsync(String query, String nextPage, final ApiCallback<List<MutualFund>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchMutualFundsValidateBeforeCall(query, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MutualFund>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
