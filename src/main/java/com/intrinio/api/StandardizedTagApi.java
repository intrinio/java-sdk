

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
import com.intrinio.models.HistoricalData;
import org.threeten.bp.LocalDate;
import com.intrinio.models.StandardizedTag;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StandardizedTagApi {
    private ApiClient apiClient;

    public StandardizedTagApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StandardizedTagApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for filterStandardizedTags
     * @param tag Tag (optional)
     * @param type Type (optional)
     * @param parent ID of tag parent (optional)
     * @param statementCode Statement Code (optional)
     * @param fsTemplate Template (optional, default to industrial)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call filterStandardizedTagsCall(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standardized_tags/filter";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("tag", tag));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (parent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("parent", parent));
        if (statementCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("statement_code", statementCode));
        if (fsTemplate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fs_template", fsTemplate));
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
    private com.squareup.okhttp.Call filterStandardizedTagsValidateBeforeCall(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = filterStandardizedTagsCall(tag, type, parent, statementCode, fsTemplate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filter Standardized Tags
     * Returns Standarized Tags that match the given filters
     * @param tag Tag (optional)
     * @param type Type (optional)
     * @param parent ID of tag parent (optional)
     * @param statementCode Statement Code (optional)
     * @param fsTemplate Template (optional, default to industrial)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;StandardizedTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<StandardizedTag> filterStandardizedTags(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage) throws ApiException {
        ApiResponse<List<StandardizedTag>> resp = filterStandardizedTagsWithHttpInfo(tag, type, parent, statementCode, fsTemplate, nextPage);
        return resp.getData();
    }

    /**
     * Filter Standardized Tags
     * Returns Standarized Tags that match the given filters
     * @param tag Tag (optional)
     * @param type Type (optional)
     * @param parent ID of tag parent (optional)
     * @param statementCode Statement Code (optional)
     * @param fsTemplate Template (optional, default to industrial)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;StandardizedTag&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<StandardizedTag>> filterStandardizedTagsWithHttpInfo(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterStandardizedTagsValidateBeforeCall(tag, type, parent, statementCode, fsTemplate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<StandardizedTag>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Standardized Tags (asynchronously)
     * Returns Standarized Tags that match the given filters
     * @param tag Tag (optional)
     * @param type Type (optional)
     * @param parent ID of tag parent (optional)
     * @param statementCode Statement Code (optional)
     * @param fsTemplate Template (optional, default to industrial)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterStandardizedTagsAsync(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage, final ApiCallback<List<StandardizedTag>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = filterStandardizedTagsValidateBeforeCall(tag, type, parent, statementCode, fsTemplate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<StandardizedTag>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllStandardizedTags
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllStandardizedTagsCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standardized_tags";

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
    private com.squareup.okhttp.Call getAllStandardizedTagsValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllStandardizedTagsCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Standardized Tags
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;StandardizedTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<StandardizedTag> getAllStandardizedTags(String nextPage) throws ApiException {
        ApiResponse<List<StandardizedTag>> resp = getAllStandardizedTagsWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Standardized Tags
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;StandardizedTag&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<StandardizedTag>> getAllStandardizedTagsWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllStandardizedTagsValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<StandardizedTag>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Standardized Tags (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllStandardizedTagsAsync(String nextPage, final ApiCallback<List<StandardizedTag>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllStandardizedTagsValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<StandardizedTag>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStandardizedTagById
     * @param tagId The Intrinio ID for the tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStandardizedTagByIdCall(String tagId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standardized_tags/{tag_id}"
            .replaceAll("\\{" + "tag_id" + "\\}", apiClient.escapeString(tagId.toString()));

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
    private com.squareup.okhttp.Call getStandardizedTagByIdValidateBeforeCall(String tagId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling getStandardizedTagById(Async)");
        }
        

        com.squareup.okhttp.Call call = getStandardizedTagByIdCall(tagId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Standardized Tag by ID
     * 
     * @param tagId The Intrinio ID for the tag (required)
     * @return StandardizedTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardizedTag getStandardizedTagById(String tagId) throws ApiException {
        ApiResponse<StandardizedTag> resp = getStandardizedTagByIdWithHttpInfo(tagId);
        return resp.getData();
    }

    /**
     * Get a Standardized Tag by ID
     * 
     * @param tagId The Intrinio ID for the tag (required)
     * @return ApiResponse&lt;StandardizedTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardizedTag> getStandardizedTagByIdWithHttpInfo(String tagId) throws ApiException {
        com.squareup.okhttp.Call call = getStandardizedTagByIdValidateBeforeCall(tagId, null, null);
        Type localVarReturnType = new TypeToken<StandardizedTag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Standardized Tag by ID (asynchronously)
     * 
     * @param tagId The Intrinio ID for the tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStandardizedTagByIdAsync(String tagId, final ApiCallback<StandardizedTag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStandardizedTagByIdValidateBeforeCall(tagId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardizedTag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStandardizedTagDataPointNumber
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStandardizedTagDataPointNumberCall(String id, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standardized_tags/{id}/data_point/{identifier}/number"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
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
    private com.squareup.okhttp.Call getStandardizedTagDataPointNumberValidateBeforeCall(String id, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getStandardizedTagDataPointNumber(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStandardizedTagDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getStandardizedTagDataPointNumberCall(id, identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Data Point (Number) for The Standardized Tag
     * Returns a numeric data point for the Standardized Tag and entity &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getStandardizedTagDataPointNumber(String id, String identifier) throws ApiException {
        ApiResponse<BigDecimal> resp = getStandardizedTagDataPointNumberWithHttpInfo(id, identifier);
        return resp.getData();
    }

    /**
     * Get Data Point (Number) for The Standardized Tag
     * Returns a numeric data point for the Standardized Tag and entity &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getStandardizedTagDataPointNumberWithHttpInfo(String id, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getStandardizedTagDataPointNumberValidateBeforeCall(id, identifier, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Data Point (Number) for The Standardized Tag (asynchronously)
     * Returns a numeric data point for the Standardized Tag and entity &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStandardizedTagDataPointNumberAsync(String id, String identifier, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStandardizedTagDataPointNumberValidateBeforeCall(id, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStandardizedTagDataPointText
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStandardizedTagDataPointTextCall(String id, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standardized_tags/{id}/data_point/{identifier}/text"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
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
    private com.squareup.okhttp.Call getStandardizedTagDataPointTextValidateBeforeCall(String id, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getStandardizedTagDataPointText(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStandardizedTagDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getStandardizedTagDataPointTextCall(id, identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Data Point (Text) for the Standardized Tag
     * Returns a text data point for the Standardized Tag and entity &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getStandardizedTagDataPointText(String id, String identifier) throws ApiException {
        ApiResponse<String> resp = getStandardizedTagDataPointTextWithHttpInfo(id, identifier);
        return resp.getData();
    }

    /**
     * Get Data Point (Text) for the Standardized Tag
     * Returns a text data point for the Standardized Tag and entity &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getStandardizedTagDataPointTextWithHttpInfo(String id, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getStandardizedTagDataPointTextValidateBeforeCall(id, identifier, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Data Point (Text) for the Standardized Tag (asynchronously)
     * Returns a text data point for the Standardized Tag and entity &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStandardizedTagDataPointTextAsync(String id, String identifier, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStandardizedTagDataPointTextValidateBeforeCall(id, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStandardizedTagHistoricalData
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
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
    public com.squareup.okhttp.Call getStandardizedTagHistoricalDataCall(String id, String identifier, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standardized_tags/{id}/historical_data/{identifier}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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

        String[] localVarAuthNames = new String[] { "HttpHeaderApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStandardizedTagHistoricalDataValidateBeforeCall(String id, String identifier, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getStandardizedTagHistoricalData(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStandardizedTagHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getStandardizedTagHistoricalDataCall(id, identifier, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Historical Data for the Standardized Tag
     * Returns historical values for the Standardized Tag and the Entity represented by the given &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;HistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<HistoricalData> getStandardizedTagHistoricalData(String id, String identifier, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        ApiResponse<List<HistoricalData>> resp = getStandardizedTagHistoricalDataWithHttpInfo(id, identifier, type, startDate, endDate, sortOrder, nextPage);
        return resp.getData();
    }

    /**
     * Get Historical Data for the Standardized Tag
     * Returns historical values for the Standardized Tag and the Entity represented by the given &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;HistoricalData&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<HistoricalData>> getStandardizedTagHistoricalDataWithHttpInfo(String id, String identifier, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStandardizedTagHistoricalDataValidateBeforeCall(id, identifier, type, startDate, endDate, sortOrder, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Historical Data for the Standardized Tag (asynchronously)
     * Returns historical values for the Standardized Tag and the Entity represented by the given &#x60;identifier&#x60;
     * @param id The Intrinio Standardized Tag ID or its tag (required)
     * @param identifier An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStandardizedTagHistoricalDataAsync(String id, String identifier, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ApiCallback<List<HistoricalData>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStandardizedTagHistoricalDataValidateBeforeCall(id, identifier, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchStandardizedTags
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchStandardizedTagsCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/standardized_tags/search";

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
    private com.squareup.okhttp.Call searchStandardizedTagsValidateBeforeCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchStandardizedTags(Async)");
        }
        

        com.squareup.okhttp.Call call = searchStandardizedTagsCall(query, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Standardized Tags
     * Searches for Standardized Tags matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;StandardizedTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<StandardizedTag> searchStandardizedTags(String query, String nextPage) throws ApiException {
        ApiResponse<List<StandardizedTag>> resp = searchStandardizedTagsWithHttpInfo(query, nextPage);
        return resp.getData();
    }

    /**
     * Search Standardized Tags
     * Searches for Standardized Tags matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;StandardizedTag&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<StandardizedTag>> searchStandardizedTagsWithHttpInfo(String query, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = searchStandardizedTagsValidateBeforeCall(query, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<StandardizedTag>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Standardized Tags (asynchronously)
     * Searches for Standardized Tags matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchStandardizedTagsAsync(String query, String nextPage, final ApiCallback<List<StandardizedTag>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchStandardizedTagsValidateBeforeCall(query, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<StandardizedTag>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
