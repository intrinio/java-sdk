

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


import com.intrinio.models.ApiResponseDataTags;
import com.intrinio.models.DataTag;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTagApi {
    private ApiClient apiClient;

    public DataTagApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataTagApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for filterDataTags
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
    public com.squareup.okhttp.Call filterDataTagsCall(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data_tags/filter";

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call filterDataTagsValidateBeforeCall(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = filterDataTagsCall(tag, type, parent, statementCode, fsTemplate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filter Data Tags
     * Returns Data Tags that match the given filters
     * @param tag Tag (optional)
     * @param type Type (optional)
     * @param parent ID of tag parent (optional)
     * @param statementCode Statement Code (optional)
     * @param fsTemplate Template (optional, default to industrial)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseDataTags
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseDataTags filterDataTags(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage) throws ApiException {
        ApiResponse<ApiResponseDataTags> resp = filterDataTagsWithHttpInfo(tag, type, parent, statementCode, fsTemplate, nextPage);
        return resp.getData();
    }

    /**
     * Filter Data Tags
     * Returns Data Tags that match the given filters
     * @param tag Tag (optional)
     * @param type Type (optional)
     * @param parent ID of tag parent (optional)
     * @param statementCode Statement Code (optional)
     * @param fsTemplate Template (optional, default to industrial)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseDataTags&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseDataTags> filterDataTagsWithHttpInfo(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterDataTagsValidateBeforeCall(tag, type, parent, statementCode, fsTemplate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseDataTags>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Data Tags (asynchronously)
     * Returns Data Tags that match the given filters
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
    public com.squareup.okhttp.Call filterDataTagsAsync(String tag, String type, String parent, String statementCode, String fsTemplate, String nextPage, final ApiCallback<ApiResponseDataTags> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = filterDataTagsValidateBeforeCall(tag, type, parent, statementCode, fsTemplate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseDataTags>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllDataTags
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllDataTagsCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data_tags";

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
    private com.squareup.okhttp.Call getAllDataTagsValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllDataTagsCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Data Tags
     * Returns All Data Tags
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseDataTags
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseDataTags getAllDataTags(String nextPage) throws ApiException {
        ApiResponse<ApiResponseDataTags> resp = getAllDataTagsWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Data Tags
     * Returns All Data Tags
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseDataTags&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseDataTags> getAllDataTagsWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllDataTagsValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseDataTags>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Data Tags (asynchronously)
     * Returns All Data Tags
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllDataTagsAsync(String nextPage, final ApiCallback<ApiResponseDataTags> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllDataTagsValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseDataTags>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDataTagById
     * @param identifier The Intrinio ID or the code-name of the Data Tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDataTagByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data_tags/{identifier}"
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
    private com.squareup.okhttp.Call getDataTagByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getDataTagById(Async)");
        }
        

        com.squareup.okhttp.Call call = getDataTagByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Data Tag by ID
     * Returns a Data Tag with the specified &#x60;identifier&#x60;
     * @param identifier The Intrinio ID or the code-name of the Data Tag (required)
     * @return DataTag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DataTag getDataTagById(String identifier) throws ApiException {
        ApiResponse<DataTag> resp = getDataTagByIdWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get a Data Tag by ID
     * Returns a Data Tag with the specified &#x60;identifier&#x60;
     * @param identifier The Intrinio ID or the code-name of the Data Tag (required)
     * @return ApiResponse&lt;DataTag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DataTag> getDataTagByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getDataTagByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<DataTag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Data Tag by ID (asynchronously)
     * Returns a Data Tag with the specified &#x60;identifier&#x60;
     * @param identifier The Intrinio ID or the code-name of the Data Tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDataTagByIdAsync(String identifier, final ApiCallback<DataTag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDataTagByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DataTag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchDataTags
     * @param query  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchDataTagsCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data_tags/search";

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
    private com.squareup.okhttp.Call searchDataTagsValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchDataTags(Async)");
        }
        

        com.squareup.okhttp.Call call = searchDataTagsCall(query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Data Tags
     * Searches for Data Tags matching the text &#x60;query&#x60;
     * @param query  (required)
     * @return ApiResponseDataTags
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseDataTags searchDataTags(String query) throws ApiException {
        ApiResponse<ApiResponseDataTags> resp = searchDataTagsWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * Search Data Tags
     * Searches for Data Tags matching the text &#x60;query&#x60;
     * @param query  (required)
     * @return ApiResponse&lt;ApiResponseDataTags&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseDataTags> searchDataTagsWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = searchDataTagsValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseDataTags>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Data Tags (asynchronously)
     * Searches for Data Tags matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchDataTagsAsync(String query, final ApiCallback<ApiResponseDataTags> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchDataTagsValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseDataTags>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
