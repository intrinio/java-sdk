

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


import java.math.BigDecimal;
import com.intrinio.models.EconomicIndex;
import com.intrinio.models.EconomicIndexSummary;
import com.intrinio.models.HistoricalData;
import org.threeten.bp.LocalDate;
import com.intrinio.models.SICIndex;
import com.intrinio.models.StockMarketIndex;
import com.intrinio.models.StockMarketIndexSummary;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexApi {
    private ApiClient apiClient;

    public IndexApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IndexApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllEconomicIndices
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllEconomicIndicesCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic";

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
    private com.squareup.okhttp.Call getAllEconomicIndicesValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllEconomicIndicesCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get ALl Economic Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;EconomicIndexSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EconomicIndexSummary> getAllEconomicIndices(String nextPage) throws ApiException {
        ApiResponse<List<EconomicIndexSummary>> resp = getAllEconomicIndicesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get ALl Economic Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;EconomicIndexSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EconomicIndexSummary>> getAllEconomicIndicesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllEconomicIndicesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<EconomicIndexSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get ALl Economic Indices (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllEconomicIndicesAsync(String nextPage, final ApiCallback<List<EconomicIndexSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllEconomicIndicesValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EconomicIndexSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllSicIndices
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllSicIndicesCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic";

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
    private com.squareup.okhttp.Call getAllSicIndicesValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllSicIndicesCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All SIC Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;SICIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SICIndex> getAllSicIndices(String nextPage) throws ApiException {
        ApiResponse<List<SICIndex>> resp = getAllSicIndicesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All SIC Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;SICIndex&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SICIndex>> getAllSicIndicesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllSicIndicesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<SICIndex>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All SIC Indices (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllSicIndicesAsync(String nextPage, final ApiCallback<List<SICIndex>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllSicIndicesValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SICIndex>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllStockMarketIndices
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllStockMarketIndicesCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market";

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
    private com.squareup.okhttp.Call getAllStockMarketIndicesValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllStockMarketIndicesCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Stock Market Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;StockMarketIndexSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<StockMarketIndexSummary> getAllStockMarketIndices(String nextPage) throws ApiException {
        ApiResponse<List<StockMarketIndexSummary>> resp = getAllStockMarketIndicesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Stock Market Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;StockMarketIndexSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<StockMarketIndexSummary>> getAllStockMarketIndicesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllStockMarketIndicesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<StockMarketIndexSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Stock Market Indices (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllStockMarketIndicesAsync(String nextPage, final ApiCallback<List<StockMarketIndexSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllStockMarketIndicesValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<StockMarketIndexSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEconomicIndexById
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/{identifier}"
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
    private com.squareup.okhttp.Call getEconomicIndexByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEconomicIndexById(Async)");
        }
        

        com.squareup.okhttp.Call call = getEconomicIndexByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an Economic Index by ID
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @return EconomicIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EconomicIndex getEconomicIndexById(String identifier) throws ApiException {
        ApiResponse<EconomicIndex> resp = getEconomicIndexByIdWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get an Economic Index by ID
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @return ApiResponse&lt;EconomicIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EconomicIndex> getEconomicIndexByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getEconomicIndexByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<EconomicIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an Economic Index by ID (asynchronously)
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexByIdAsync(String identifier, final ApiCallback<EconomicIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEconomicIndexByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EconomicIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEconomicIndexDataPointNumber
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointNumberCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/{identifier}/data_point/{item}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

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
    private com.squareup.okhttp.Call getEconomicIndexDataPointNumberValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEconomicIndexDataPointNumber(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getEconomicIndexDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getEconomicIndexDataPointNumberCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Economic Index Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getEconomicIndexDataPointNumber(String identifier, String item) throws ApiException {
        ApiResponse<BigDecimal> resp = getEconomicIndexDataPointNumberWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get Economic Index Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getEconomicIndexDataPointNumberWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getEconomicIndexDataPointNumberValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Economic Index Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointNumberAsync(String identifier, String item, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEconomicIndexDataPointNumberValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEconomicIndexDataPointText
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointTextCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/{identifier}/data_point/{item}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

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
    private com.squareup.okhttp.Call getEconomicIndexDataPointTextValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEconomicIndexDataPointText(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getEconomicIndexDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getEconomicIndexDataPointTextCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Economic Index Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getEconomicIndexDataPointText(String identifier, String item) throws ApiException {
        ApiResponse<String> resp = getEconomicIndexDataPointTextWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get Economic Index Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getEconomicIndexDataPointTextWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getEconomicIndexDataPointTextValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Economic Index Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointTextAsync(String identifier, String item, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEconomicIndexDataPointTextValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEconomicIndexHistoricalData
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexHistoricalDataCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/{identifier}/historical_data/{item}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_order", sortOrder));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));

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
    private com.squareup.okhttp.Call getEconomicIndexHistoricalDataValidateBeforeCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEconomicIndexHistoricalData(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getEconomicIndexHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getEconomicIndexHistoricalDataCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Economic Index Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @return List&lt;HistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<HistoricalData> getEconomicIndexHistoricalData(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize) throws ApiException {
        ApiResponse<List<HistoricalData>> resp = getEconomicIndexHistoricalDataWithHttpInfo(identifier, item, type, startDate, endDate, sortOrder, pageSize);
        return resp.getData();
    }

    /**
     * Get Economic Index Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @return ApiResponse&lt;List&lt;HistoricalData&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<HistoricalData>> getEconomicIndexHistoricalDataWithHttpInfo(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getEconomicIndexHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, null, null);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Economic Index Historical Data (asynchronously)
     * Returns historical values for the given &#x60;item&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexHistoricalDataAsync(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ApiCallback<List<HistoricalData>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEconomicIndexHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSicIndexById
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSicIndexByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/{identifier}"
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
    private com.squareup.okhttp.Call getSicIndexByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSicIndexById(Async)");
        }
        

        com.squareup.okhttp.Call call = getSicIndexByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an SIC Index by ID
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @return SICIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SICIndex getSicIndexById(String identifier) throws ApiException {
        ApiResponse<SICIndex> resp = getSicIndexByIdWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get an SIC Index by ID
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @return ApiResponse&lt;SICIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SICIndex> getSicIndexByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getSicIndexByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<SICIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an SIC Index by ID (asynchronously)
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSicIndexByIdAsync(String identifier, final ApiCallback<SICIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSicIndexByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SICIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSicIndexDataPointNumber
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointNumberCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/{identifier}/data_point/{item}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

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
    private com.squareup.okhttp.Call getSicIndexDataPointNumberValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSicIndexDataPointNumber(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getSicIndexDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getSicIndexDataPointNumberCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get SIC Index Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getSicIndexDataPointNumber(String identifier, String item) throws ApiException {
        ApiResponse<BigDecimal> resp = getSicIndexDataPointNumberWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get SIC Index Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getSicIndexDataPointNumberWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getSicIndexDataPointNumberValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get SIC Index Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointNumberAsync(String identifier, String item, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSicIndexDataPointNumberValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSicIndexDataPointText
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointTextCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/{identifier}/data_point/{item}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

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
    private com.squareup.okhttp.Call getSicIndexDataPointTextValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSicIndexDataPointText(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getSicIndexDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getSicIndexDataPointTextCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get SIC Index Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getSicIndexDataPointText(String identifier, String item) throws ApiException {
        ApiResponse<String> resp = getSicIndexDataPointTextWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get SIC Index Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getSicIndexDataPointTextWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getSicIndexDataPointTextValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get SIC Index Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointTextAsync(String identifier, String item, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSicIndexDataPointTextValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSicIndexHistoricalData
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSicIndexHistoricalDataCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/{identifier}/historical_data/{item}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_order", sortOrder));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));

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
    private com.squareup.okhttp.Call getSicIndexHistoricalDataValidateBeforeCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSicIndexHistoricalData(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getSicIndexHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getSicIndexHistoricalDataCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get SIC Index Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @return List&lt;HistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<HistoricalData> getSicIndexHistoricalData(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize) throws ApiException {
        ApiResponse<List<HistoricalData>> resp = getSicIndexHistoricalDataWithHttpInfo(identifier, item, type, startDate, endDate, sortOrder, pageSize);
        return resp.getData();
    }

    /**
     * Get SIC Index Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @return ApiResponse&lt;List&lt;HistoricalData&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<HistoricalData>> getSicIndexHistoricalDataWithHttpInfo(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getSicIndexHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, null, null);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get SIC Index Historical Data (asynchronously)
     * Returns historical values for the given &#x60;item&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSicIndexHistoricalDataAsync(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ApiCallback<List<HistoricalData>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSicIndexHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockMarketIndexById
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/{identifier}"
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
    private com.squareup.okhttp.Call getStockMarketIndexByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockMarketIndexById(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockMarketIndexByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Stock Market Index by ID
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @return StockMarketIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StockMarketIndex getStockMarketIndexById(String identifier) throws ApiException {
        ApiResponse<StockMarketIndex> resp = getStockMarketIndexByIdWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get a Stock Market Index by ID
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @return ApiResponse&lt;StockMarketIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StockMarketIndex> getStockMarketIndexByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getStockMarketIndexByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<StockMarketIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Stock Market Index by ID (asynchronously)
     * 
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexByIdAsync(String identifier, final ApiCallback<StockMarketIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockMarketIndexByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StockMarketIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockMarketIndexDataPointNumber
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointNumberCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/{identifier}/data_point/{item}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

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
    private com.squareup.okhttp.Call getStockMarketIndexDataPointNumberValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockMarketIndexDataPointNumber(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getStockMarketIndexDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointNumberCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Market Index Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getStockMarketIndexDataPointNumber(String identifier, String item) throws ApiException {
        ApiResponse<BigDecimal> resp = getStockMarketIndexDataPointNumberWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get Stock Market Index Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getStockMarketIndexDataPointNumberWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getStockMarketIndexDataPointNumberValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Market Index Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointNumberAsync(String identifier, String item, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointNumberValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockMarketIndexDataPointText
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointTextCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/{identifier}/data_point/{item}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

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
    private com.squareup.okhttp.Call getStockMarketIndexDataPointTextValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockMarketIndexDataPointText(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getStockMarketIndexDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointTextCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Market Index Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getStockMarketIndexDataPointText(String identifier, String item) throws ApiException {
        ApiResponse<String> resp = getStockMarketIndexDataPointTextWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get Stock Market Index Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getStockMarketIndexDataPointTextWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getStockMarketIndexDataPointTextValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Market Index Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointTextAsync(String identifier, String item, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointTextValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockMarketIndexHistoricalData
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexHistoricalDataCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/{identifier}/historical_data/{item}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "item" + "\\}", apiClient.escapeString(item.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_order", sortOrder));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));

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
    private com.squareup.okhttp.Call getStockMarketIndexHistoricalDataValidateBeforeCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockMarketIndexHistoricalData(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getStockMarketIndexHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockMarketIndexHistoricalDataCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Market Index Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @return List&lt;HistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<HistoricalData> getStockMarketIndexHistoricalData(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize) throws ApiException {
        ApiResponse<List<HistoricalData>> resp = getStockMarketIndexHistoricalDataWithHttpInfo(identifier, item, type, startDate, endDate, sortOrder, pageSize);
        return resp.getData();
    }

    /**
     * Get Stock Market Index Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @return ApiResponse&lt;List&lt;HistoricalData&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<HistoricalData>> getStockMarketIndexHistoricalDataWithHttpInfo(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getStockMarketIndexHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, null, null);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Market Index Historical Data (asynchronously)
     * Returns historical values for the given &#x60;item&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param item An Intrinio data tag or other item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize  (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexHistoricalDataAsync(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, BigDecimal pageSize, final ApiCallback<List<HistoricalData>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockMarketIndexHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchEconomicIndices
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchEconomicIndicesCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/search";

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
    private com.squareup.okhttp.Call searchEconomicIndicesValidateBeforeCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchEconomicIndices(Async)");
        }
        

        com.squareup.okhttp.Call call = searchEconomicIndicesCall(query, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Economic Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;EconomicIndexSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EconomicIndexSummary> searchEconomicIndices(String query, String nextPage) throws ApiException {
        ApiResponse<List<EconomicIndexSummary>> resp = searchEconomicIndicesWithHttpInfo(query, nextPage);
        return resp.getData();
    }

    /**
     * Search Economic Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;EconomicIndexSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EconomicIndexSummary>> searchEconomicIndicesWithHttpInfo(String query, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = searchEconomicIndicesValidateBeforeCall(query, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<EconomicIndexSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Economic Indices (asynchronously)
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchEconomicIndicesAsync(String query, String nextPage, final ApiCallback<List<EconomicIndexSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchEconomicIndicesValidateBeforeCall(query, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EconomicIndexSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchSicIndices
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchSicIndicesCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/search";

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
    private com.squareup.okhttp.Call searchSicIndicesValidateBeforeCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchSicIndices(Async)");
        }
        

        com.squareup.okhttp.Call call = searchSicIndicesCall(query, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search SIC Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;SICIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SICIndex> searchSicIndices(String query, String nextPage) throws ApiException {
        ApiResponse<List<SICIndex>> resp = searchSicIndicesWithHttpInfo(query, nextPage);
        return resp.getData();
    }

    /**
     * Search SIC Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;SICIndex&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SICIndex>> searchSicIndicesWithHttpInfo(String query, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = searchSicIndicesValidateBeforeCall(query, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<SICIndex>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search SIC Indices (asynchronously)
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchSicIndicesAsync(String query, String nextPage, final ApiCallback<List<SICIndex>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchSicIndicesValidateBeforeCall(query, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SICIndex>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchStockMarketsIndices
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchStockMarketsIndicesCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/search";

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
    private com.squareup.okhttp.Call searchStockMarketsIndicesValidateBeforeCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchStockMarketsIndices(Async)");
        }
        

        com.squareup.okhttp.Call call = searchStockMarketsIndicesCall(query, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Stock Market Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;StockMarketIndexSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<StockMarketIndexSummary> searchStockMarketsIndices(String query, String nextPage) throws ApiException {
        ApiResponse<List<StockMarketIndexSummary>> resp = searchStockMarketsIndicesWithHttpInfo(query, nextPage);
        return resp.getData();
    }

    /**
     * Search Stock Market Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;StockMarketIndexSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<StockMarketIndexSummary>> searchStockMarketsIndicesWithHttpInfo(String query, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = searchStockMarketsIndicesValidateBeforeCall(query, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<StockMarketIndexSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Stock Market Indices (asynchronously)
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchStockMarketsIndicesAsync(String query, String nextPage, final ApiCallback<List<StockMarketIndexSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchStockMarketsIndicesValidateBeforeCall(query, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<StockMarketIndexSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
