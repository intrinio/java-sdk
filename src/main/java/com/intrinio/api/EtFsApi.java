

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


import com.intrinio.models.ApiResponseETFHoldings;
import com.intrinio.models.ApiResponseETFs;
import com.intrinio.models.ETF;
import com.intrinio.models.ETFAnalytics;
import com.intrinio.models.ETFStats;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtFsApi {
    private ApiClient apiClient;

    public EtFsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EtFsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllEtfs
     * @param exchange  (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllEtfsCall(String exchange, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/etfs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
    private com.squareup.okhttp.Call getAllEtfsValidateBeforeCall(String exchange, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllEtfsCall(exchange, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All ETFs
     * Returns a list of Exchange Traded Funds (ETFs) sourced from FirstBridge
     * @param exchange  (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseETFs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseETFs getAllEtfs(String exchange, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseETFs> resp = getAllEtfsWithHttpInfo(exchange, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * All ETFs
     * Returns a list of Exchange Traded Funds (ETFs) sourced from FirstBridge
     * @param exchange  (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseETFs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseETFs> getAllEtfsWithHttpInfo(String exchange, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllEtfsValidateBeforeCall(exchange, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseETFs>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All ETFs (asynchronously)
     * Returns a list of Exchange Traded Funds (ETFs) sourced from FirstBridge
     * @param exchange  (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllEtfsAsync(String exchange, Integer pageSize, String nextPage, final ApiCallback<ApiResponseETFs> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllEtfsValidateBeforeCall(exchange, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseETFs>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEtf
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEtfCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/etfs/{identifier}"
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEtfValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEtf(Async)");
        }
        

        com.squareup.okhttp.Call call = getEtfCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lookup ETF
     * Returns the Exchange Traded Fund (ETF) with the given identifier
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @return ETF
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ETF getEtf(String identifier) throws ApiException {
        ApiResponse<ETF> resp = getEtfWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Lookup ETF
     * Returns the Exchange Traded Fund (ETF) with the given identifier
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @return ApiResponse&lt;ETF&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ETF> getEtfWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getEtfValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<ETF>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lookup ETF (asynchronously)
     * Returns the Exchange Traded Fund (ETF) with the given identifier
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEtfAsync(String identifier, final ApiCallback<ETF> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEtfValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ETF>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEtfAnalytics
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEtfAnalyticsCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/etfs/{identifier}/analytics"
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEtfAnalyticsValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEtfAnalytics(Async)");
        }
        

        com.squareup.okhttp.Call call = getEtfAnalyticsCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * ETF Analytics
     * Returns analytics for the Exchange Traded Fund (ETF) including volume, market cap, 52 week high, and 52 week low
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @return ETFAnalytics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ETFAnalytics getEtfAnalytics(String identifier) throws ApiException {
        ApiResponse<ETFAnalytics> resp = getEtfAnalyticsWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * ETF Analytics
     * Returns analytics for the Exchange Traded Fund (ETF) including volume, market cap, 52 week high, and 52 week low
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @return ApiResponse&lt;ETFAnalytics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ETFAnalytics> getEtfAnalyticsWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getEtfAnalyticsValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<ETFAnalytics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * ETF Analytics (asynchronously)
     * Returns analytics for the Exchange Traded Fund (ETF) including volume, market cap, 52 week high, and 52 week low
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEtfAnalyticsAsync(String identifier, final ApiCallback<ETFAnalytics> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEtfAnalyticsValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ETFAnalytics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEtfHoldings
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEtfHoldingsCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/etfs/{identifier}/holdings"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
    private com.squareup.okhttp.Call getEtfHoldingsValidateBeforeCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEtfHoldings(Async)");
        }
        

        com.squareup.okhttp.Call call = getEtfHoldingsCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * ETF Holdings
     * Returns the holdings sorted by weight descending and the Exchange Traded Fund (ETF) summary
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseETFHoldings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseETFHoldings getEtfHoldings(String identifier, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseETFHoldings> resp = getEtfHoldingsWithHttpInfo(identifier, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * ETF Holdings
     * Returns the holdings sorted by weight descending and the Exchange Traded Fund (ETF) summary
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseETFHoldings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseETFHoldings> getEtfHoldingsWithHttpInfo(String identifier, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getEtfHoldingsValidateBeforeCall(identifier, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseETFHoldings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * ETF Holdings (asynchronously)
     * Returns the holdings sorted by weight descending and the Exchange Traded Fund (ETF) summary
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEtfHoldingsAsync(String identifier, Integer pageSize, String nextPage, final ApiCallback<ApiResponseETFHoldings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEtfHoldingsValidateBeforeCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseETFHoldings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEtfStats
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEtfStatsCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/etfs/{identifier}/stats"
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEtfStatsValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEtfStats(Async)");
        }
        

        com.squareup.okhttp.Call call = getEtfStatsCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Exchange Traded Fund (ETF) stats
     * Returns daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @return ETFStats
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ETFStats getEtfStats(String identifier) throws ApiException {
        ApiResponse<ETFStats> resp = getEtfStatsWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Exchange Traded Fund (ETF) stats
     * Returns daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @return ApiResponse&lt;ETFStats&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ETFStats> getEtfStatsWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getEtfStatsValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<ETFStats>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Exchange Traded Fund (ETF) stats (asynchronously)
     * Returns daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility
     * @param identifier An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEtfStatsAsync(String identifier, final ApiCallback<ETFStats> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEtfStatsValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ETFStats>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchEtfs
     * @param query  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchEtfsCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/etfs/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));

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
    private com.squareup.okhttp.Call searchEtfsValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchEtfs(Async)");
        }
        

        com.squareup.okhttp.Call call = searchEtfsCall(query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search ETFs
     * Searches for Exchange Traded Funds (ETFs) matching the text &#x60;query&#x60;
     * @param query  (required)
     * @return ApiResponseETFs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseETFs searchEtfs(String query) throws ApiException {
        ApiResponse<ApiResponseETFs> resp = searchEtfsWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * Search ETFs
     * Searches for Exchange Traded Funds (ETFs) matching the text &#x60;query&#x60;
     * @param query  (required)
     * @return ApiResponse&lt;ApiResponseETFs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseETFs> searchEtfsWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = searchEtfsValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseETFs>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search ETFs (asynchronously)
     * Searches for Exchange Traded Funds (ETFs) matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchEtfsAsync(String query, final ApiCallback<ApiResponseETFs> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchEtfsValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseETFs>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
