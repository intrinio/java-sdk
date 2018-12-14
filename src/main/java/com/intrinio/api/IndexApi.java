

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


import com.intrinio.models.ApiResponseEconomicIndexHistoricalData;
import com.intrinio.models.ApiResponseEconomicIndices;
import com.intrinio.models.ApiResponseSICIndexHistoricalData;
import com.intrinio.models.ApiResponseSICIndices;
import com.intrinio.models.ApiResponseStockMarketIndexHistoricalData;
import com.intrinio.models.ApiResponseStockMarketIndices;
import java.math.BigDecimal;
import com.intrinio.models.EconomicIndex;
import org.threeten.bp.LocalDate;
import com.intrinio.models.SICIndex;
import com.intrinio.models.StockMarketIndex;

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllEconomicIndicesValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllEconomicIndicesCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Economic Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseEconomicIndices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseEconomicIndices getAllEconomicIndices(String nextPage) throws ApiException {
        ApiResponse<ApiResponseEconomicIndices> resp = getAllEconomicIndicesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Economic Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseEconomicIndices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseEconomicIndices> getAllEconomicIndicesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllEconomicIndicesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseEconomicIndices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Economic Indices (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllEconomicIndicesAsync(String nextPage, final ApiCallback<ApiResponseEconomicIndices> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseEconomicIndices>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @return ApiResponseSICIndices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSICIndices getAllSicIndices(String nextPage) throws ApiException {
        ApiResponse<ApiResponseSICIndices> resp = getAllSicIndicesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All SIC Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSICIndices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSICIndices> getAllSicIndicesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllSicIndicesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSICIndices>(){}.getType();
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
    public com.squareup.okhttp.Call getAllSicIndicesAsync(String nextPage, final ApiCallback<ApiResponseSICIndices> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseSICIndices>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @return ApiResponseStockMarketIndices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseStockMarketIndices getAllStockMarketIndices(String nextPage) throws ApiException {
        ApiResponse<ApiResponseStockMarketIndices> resp = getAllStockMarketIndicesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Stock Market Indices
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockMarketIndices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockMarketIndices> getAllStockMarketIndicesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllStockMarketIndicesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockMarketIndices>(){}.getType();
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
    public com.squareup.okhttp.Call getAllStockMarketIndicesAsync(String nextPage, final ApiCallback<ApiResponseStockMarketIndices> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseStockMarketIndices>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointNumberCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/{identifier}/data_point/{tag}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getEconomicIndexDataPointNumberValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEconomicIndexDataPointNumber(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getEconomicIndexDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getEconomicIndexDataPointNumberCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Economic Index Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getEconomicIndexDataPointNumber(String identifier, String tag) throws ApiException {
        ApiResponse<BigDecimal> resp = getEconomicIndexDataPointNumberWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Economic Index Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getEconomicIndexDataPointNumberWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getEconomicIndexDataPointNumberValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Economic Index Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointNumberAsync(String identifier, String tag, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEconomicIndexDataPointNumberValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEconomicIndexDataPointText
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointTextCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/{identifier}/data_point/{tag}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getEconomicIndexDataPointTextValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEconomicIndexDataPointText(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getEconomicIndexDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getEconomicIndexDataPointTextCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Economic Index Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getEconomicIndexDataPointText(String identifier, String tag) throws ApiException {
        ApiResponse<String> resp = getEconomicIndexDataPointTextWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Economic Index Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getEconomicIndexDataPointTextWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getEconomicIndexDataPointTextValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Economic Index Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexDataPointTextAsync(String identifier, String tag, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEconomicIndexDataPointTextValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getEconomicIndexHistoricalData
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexHistoricalDataCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/{identifier}/historical_data/{tag}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

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
    private com.squareup.okhttp.Call getEconomicIndexHistoricalDataValidateBeforeCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getEconomicIndexHistoricalData(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getEconomicIndexHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getEconomicIndexHistoricalDataCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Economic Index Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseEconomicIndexHistoricalData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseEconomicIndexHistoricalData getEconomicIndexHistoricalData(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        ApiResponse<ApiResponseEconomicIndexHistoricalData> resp = getEconomicIndexHistoricalDataWithHttpInfo(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
        return resp.getData();
    }

    /**
     * Get Economic Index Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseEconomicIndexHistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseEconomicIndexHistoricalData> getEconomicIndexHistoricalDataWithHttpInfo(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getEconomicIndexHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseEconomicIndexHistoricalData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Economic Index Historical Data (asynchronously)
     * Returns historical values for the given &#x60;tag&#x60; and the Economic Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEconomicIndexHistoricalDataAsync(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ApiCallback<ApiResponseEconomicIndexHistoricalData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEconomicIndexHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseEconomicIndexHistoricalData>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointNumberCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/{identifier}/data_point/{tag}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getSicIndexDataPointNumberValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSicIndexDataPointNumber(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSicIndexDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getSicIndexDataPointNumberCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get SIC Index Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getSicIndexDataPointNumber(String identifier, String tag) throws ApiException {
        ApiResponse<BigDecimal> resp = getSicIndexDataPointNumberWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get SIC Index Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getSicIndexDataPointNumberWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getSicIndexDataPointNumberValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get SIC Index Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointNumberAsync(String identifier, String tag, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSicIndexDataPointNumberValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSicIndexDataPointText
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointTextCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/{identifier}/data_point/{tag}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getSicIndexDataPointTextValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSicIndexDataPointText(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSicIndexDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getSicIndexDataPointTextCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get SIC Index Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getSicIndexDataPointText(String identifier, String tag) throws ApiException {
        ApiResponse<String> resp = getSicIndexDataPointTextWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get SIC Index Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getSicIndexDataPointTextWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getSicIndexDataPointTextValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get SIC Index Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSicIndexDataPointTextAsync(String identifier, String tag, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSicIndexDataPointTextValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSicIndexHistoricalData
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSicIndexHistoricalDataCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/{identifier}/historical_data/{tag}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

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
    private com.squareup.okhttp.Call getSicIndexHistoricalDataValidateBeforeCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSicIndexHistoricalData(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSicIndexHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getSicIndexHistoricalDataCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get SIC Index Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSICIndexHistoricalData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSICIndexHistoricalData getSicIndexHistoricalData(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSICIndexHistoricalData> resp = getSicIndexHistoricalDataWithHttpInfo(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
        return resp.getData();
    }

    /**
     * Get SIC Index Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSICIndexHistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSICIndexHistoricalData> getSicIndexHistoricalDataWithHttpInfo(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSicIndexHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSICIndexHistoricalData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get SIC Index Historical Data (asynchronously)
     * Returns historical values for the given &#x60;tag&#x60; and the SIC Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSicIndexHistoricalDataAsync(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ApiCallback<ApiResponseSICIndexHistoricalData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSicIndexHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSICIndexHistoricalData>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointNumberCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/{identifier}/data_point/{tag}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getStockMarketIndexDataPointNumberValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockMarketIndexDataPointNumber(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getStockMarketIndexDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointNumberCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Market Index Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getStockMarketIndexDataPointNumber(String identifier, String tag) throws ApiException {
        ApiResponse<BigDecimal> resp = getStockMarketIndexDataPointNumberWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Stock Market Index Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getStockMarketIndexDataPointNumberWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getStockMarketIndexDataPointNumberValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Market Index Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointNumberAsync(String identifier, String tag, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointNumberValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockMarketIndexDataPointText
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointTextCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/{identifier}/data_point/{tag}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getStockMarketIndexDataPointTextValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockMarketIndexDataPointText(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getStockMarketIndexDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointTextCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Market Index Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getStockMarketIndexDataPointText(String identifier, String tag) throws ApiException {
        ApiResponse<String> resp = getStockMarketIndexDataPointTextWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Stock Market Index Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getStockMarketIndexDataPointTextWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getStockMarketIndexDataPointTextValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Market Index Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexDataPointTextAsync(String identifier, String tag, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockMarketIndexDataPointTextValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockMarketIndexHistoricalData
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexHistoricalDataCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/{identifier}/historical_data/{tag}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

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
    private com.squareup.okhttp.Call getStockMarketIndexHistoricalDataValidateBeforeCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockMarketIndexHistoricalData(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getStockMarketIndexHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockMarketIndexHistoricalDataCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Market Index Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockMarketIndexHistoricalData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseStockMarketIndexHistoricalData getStockMarketIndexHistoricalData(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        ApiResponse<ApiResponseStockMarketIndexHistoricalData> resp = getStockMarketIndexHistoricalDataWithHttpInfo(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
        return resp.getData();
    }

    /**
     * Get Stock Market Index Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockMarketIndexHistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockMarketIndexHistoricalData> getStockMarketIndexHistoricalDataWithHttpInfo(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockMarketIndexHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockMarketIndexHistoricalData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Market Index Historical Data (asynchronously)
     * Returns historical values for the given &#x60;tag&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;
     * @param identifier An Index Identifier (symbol, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockMarketIndexHistoricalDataAsync(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ApiCallback<ApiResponseStockMarketIndexHistoricalData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockMarketIndexHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockMarketIndexHistoricalData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchEconomicIndices
     * @param query Search query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchEconomicIndicesCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/economic/search";

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
    private com.squareup.okhttp.Call searchEconomicIndicesValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchEconomicIndices(Async)");
        }
        

        com.squareup.okhttp.Call call = searchEconomicIndicesCall(query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Economic Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @return ApiResponseEconomicIndices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseEconomicIndices searchEconomicIndices(String query) throws ApiException {
        ApiResponse<ApiResponseEconomicIndices> resp = searchEconomicIndicesWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * Search Economic Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @return ApiResponse&lt;ApiResponseEconomicIndices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseEconomicIndices> searchEconomicIndicesWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = searchEconomicIndicesValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseEconomicIndices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Economic Indices (asynchronously)
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchEconomicIndicesAsync(String query, final ApiCallback<ApiResponseEconomicIndices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchEconomicIndicesValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseEconomicIndices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchSicIndices
     * @param query Search query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchSicIndicesCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/sic/search";

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
    private com.squareup.okhttp.Call searchSicIndicesValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchSicIndices(Async)");
        }
        

        com.squareup.okhttp.Call call = searchSicIndicesCall(query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search SIC Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @return ApiResponseSICIndices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSICIndices searchSicIndices(String query) throws ApiException {
        ApiResponse<ApiResponseSICIndices> resp = searchSicIndicesWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * Search SIC Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @return ApiResponse&lt;ApiResponseSICIndices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSICIndices> searchSicIndicesWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = searchSicIndicesValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSICIndices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search SIC Indices (asynchronously)
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchSicIndicesAsync(String query, final ApiCallback<ApiResponseSICIndices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchSicIndicesValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSICIndices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchStockMarketsIndices
     * @param query Search query (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchStockMarketsIndicesCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/indices/stock_market/search";

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
    private com.squareup.okhttp.Call searchStockMarketsIndicesValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchStockMarketsIndices(Async)");
        }
        

        com.squareup.okhttp.Call call = searchStockMarketsIndicesCall(query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Stock Market Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @return ApiResponseStockMarketIndices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseStockMarketIndices searchStockMarketsIndices(String query) throws ApiException {
        ApiResponse<ApiResponseStockMarketIndices> resp = searchStockMarketsIndicesWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * Search Stock Market Indices
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @return ApiResponse&lt;ApiResponseStockMarketIndices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockMarketIndices> searchStockMarketsIndicesWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = searchStockMarketsIndicesValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockMarketIndices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Stock Market Indices (asynchronously)
     * Searches for indices using the text in &#x60;query&#x60;
     * @param query Search query (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchStockMarketsIndicesAsync(String query, final ApiCallback<ApiResponseStockMarketIndices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchStockMarketsIndicesValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockMarketIndices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
