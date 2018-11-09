

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


import com.intrinio.models.ApiResponseSecurities;
import com.intrinio.models.ApiResponseSecurityHistoricalData;
import com.intrinio.models.ApiResponseSecurityStockPriceAdjustments;
import com.intrinio.models.ApiResponseSecurityStockPrices;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import com.intrinio.models.Security;
import com.intrinio.models.SecurityScreenGroup;
import com.intrinio.models.SecurityScreenResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityApi {
    private ApiClient apiClient;

    public SecurityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllSecurities
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllSecuritiesCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities";

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
    private com.squareup.okhttp.Call getAllSecuritiesValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllSecuritiesCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Securiites
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSecurities getAllSecurities(String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurities> resp = getAllSecuritiesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Securiites
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurities> getAllSecuritiesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllSecuritiesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Securiites (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllSecuritiesAsync(String nextPage, final ApiCallback<ApiResponseSecurities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllSecuritiesValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityById
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}"
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
    private com.squareup.okhttp.Call getSecurityByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityById(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Security by ID
     * 
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return Security
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Security getSecurityById(String identifier) throws ApiException {
        ApiResponse<Security> resp = getSecurityByIdWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get a Security by ID
     * 
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return ApiResponse&lt;Security&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Security> getSecurityByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<Security>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Security by ID (asynchronously)
     * 
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityByIdAsync(String identifier, final ApiCallback<Security> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Security>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityDataPointNumber
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointNumberCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/data_point/{tag}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

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
    private com.squareup.okhttp.Call getSecurityDataPointNumberValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityDataPointNumber(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSecurityDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityDataPointNumberCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Security Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getSecurityDataPointNumber(String identifier, String tag) throws ApiException {
        ApiResponse<BigDecimal> resp = getSecurityDataPointNumberWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Security Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getSecurityDataPointNumberWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityDataPointNumberValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Security Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointNumberAsync(String identifier, String tag, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityDataPointNumberValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityDataPointText
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointTextCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/data_point/{tag}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

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
    private com.squareup.okhttp.Call getSecurityDataPointTextValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityDataPointText(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSecurityDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityDataPointTextCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Security Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getSecurityDataPointText(String identifier, String tag) throws ApiException {
        ApiResponse<String> resp = getSecurityDataPointTextWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Security Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getSecurityDataPointTextWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityDataPointTextValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Security Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointTextAsync(String identifier, String tag, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityDataPointTextValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityHistoricalData
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoricalDataCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/historical_data/{tag}"
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
    private com.squareup.okhttp.Call getSecurityHistoricalDataValidateBeforeCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityHistoricalData(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSecurityHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityHistoricalDataCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Security Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityHistoricalData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSecurityHistoricalData getSecurityHistoricalData(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityHistoricalData> resp = getSecurityHistoricalDataWithHttpInfo(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
        return resp.getData();
    }

    /**
     * Get Security Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityHistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityHistoricalData> getSecurityHistoricalDataWithHttpInfo(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityHistoricalData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Security Historical Data (asynchronously)
     * Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoricalDataAsync(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ApiCallback<ApiResponseSecurityHistoricalData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityHistoricalData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityStockPriceAdjustments
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPriceAdjustmentsCall(String identifier, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/adjustments"
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSecurityStockPriceAdjustmentsValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityStockPriceAdjustments(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityStockPriceAdjustmentsCall(identifier, startDate, endDate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Price Adjustments for Security
     * Return stock price adjustments for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityStockPriceAdjustments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSecurityStockPriceAdjustments getSecurityStockPriceAdjustments(String identifier, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityStockPriceAdjustments> resp = getSecurityStockPriceAdjustmentsWithHttpInfo(identifier, startDate, endDate, nextPage);
        return resp.getData();
    }

    /**
     * Get Stock Price Adjustments for Security
     * Return stock price adjustments for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityStockPriceAdjustments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityStockPriceAdjustments> getSecurityStockPriceAdjustmentsWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityStockPriceAdjustmentsValidateBeforeCall(identifier, startDate, endDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPriceAdjustments>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Price Adjustments for Security (asynchronously)
     * Return stock price adjustments for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPriceAdjustmentsAsync(String identifier, LocalDate startDate, LocalDate endDate, String nextPage, final ApiCallback<ApiResponseSecurityStockPriceAdjustments> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityStockPriceAdjustmentsValidateBeforeCall(identifier, startDate, endDate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPriceAdjustments>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityStockPrices
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPricesCall(String identifier, LocalDate startDate, LocalDate endDate, String frequency, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (frequency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("frequency", frequency));
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
    private com.squareup.okhttp.Call getSecurityStockPricesValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, String frequency, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityStockPrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityStockPricesCall(identifier, startDate, endDate, frequency, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Stock Prices for Security
     * Return stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityStockPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSecurityStockPrices getSecurityStockPrices(String identifier, LocalDate startDate, LocalDate endDate, String frequency, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityStockPrices> resp = getSecurityStockPricesWithHttpInfo(identifier, startDate, endDate, frequency, nextPage);
        return resp.getData();
    }

    /**
     * Get Stock Prices for Security
     * Return stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityStockPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityStockPrices> getSecurityStockPricesWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, String frequency, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityStockPricesValidateBeforeCall(identifier, startDate, endDate, frequency, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Stock Prices for Security (asynchronously)
     * Return stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPricesAsync(String identifier, LocalDate startDate, LocalDate endDate, String frequency, String nextPage, final ApiCallback<ApiResponseSecurityStockPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityStockPricesValidateBeforeCall(identifier, startDate, endDate, frequency, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for screenSecurities
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call screenSecuritiesCall(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = logic;

        // create path and map variables
        String localVarPath = "/securities/screen";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (orderColumn != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_column", orderColumn));
        if (orderDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));
        if (primaryOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("primary_only", primaryOnly));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call screenSecuritiesValidateBeforeCall(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = screenSecuritiesCall(logic, orderColumn, orderDirection, primaryOnly, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Screen Securities
     * Screen securities using complex logic
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @return List&lt;SecurityScreenResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SecurityScreenResult> screenSecurities(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly) throws ApiException {
        ApiResponse<List<SecurityScreenResult>> resp = screenSecuritiesWithHttpInfo(logic, orderColumn, orderDirection, primaryOnly);
        return resp.getData();
    }

    /**
     * Screen Securities
     * Screen securities using complex logic
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @return ApiResponse&lt;List&lt;SecurityScreenResult&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SecurityScreenResult>> screenSecuritiesWithHttpInfo(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly) throws ApiException {
        com.squareup.okhttp.Call call = screenSecuritiesValidateBeforeCall(logic, orderColumn, orderDirection, primaryOnly, null, null);
        Type localVarReturnType = new TypeToken<List<SecurityScreenResult>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Screen Securities (asynchronously)
     * Screen securities using complex logic
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call screenSecuritiesAsync(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, final ApiCallback<List<SecurityScreenResult>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = screenSecuritiesValidateBeforeCall(logic, orderColumn, orderDirection, primaryOnly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SecurityScreenResult>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchSecurities
     * @param query  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchSecuritiesCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/search";

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
    private com.squareup.okhttp.Call searchSecuritiesValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchSecurities(Async)");
        }
        

        com.squareup.okhttp.Call call = searchSecuritiesCall(query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Securities
     * Searches for Securities matching the text &#x60;query&#x60;
     * @param query  (required)
     * @return ApiResponseSecurities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSecurities searchSecurities(String query) throws ApiException {
        ApiResponse<ApiResponseSecurities> resp = searchSecuritiesWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * Search Securities
     * Searches for Securities matching the text &#x60;query&#x60;
     * @param query  (required)
     * @return ApiResponse&lt;ApiResponseSecurities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurities> searchSecuritiesWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = searchSecuritiesValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Securities (asynchronously)
     * Searches for Securities matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchSecuritiesAsync(String query, final ApiCallback<ApiResponseSecurities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchSecuritiesValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
