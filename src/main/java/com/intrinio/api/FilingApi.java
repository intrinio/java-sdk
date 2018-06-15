

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


import com.intrinio.models.Filing;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilingApi {
    private ApiClient apiClient;

    public FilingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for filterFilings
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by report type (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call filterFilingsCall(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/filter";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (company != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company", company));
        if (reportType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("report_type", reportType));
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
    private com.squareup.okhttp.Call filterFilingsValidateBeforeCall(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'company' is set
        if (company == null) {
            throw new ApiException("Missing the required parameter 'company' when calling filterFilings(Async)");
        }
        

        com.squareup.okhttp.Call call = filterFilingsCall(company, reportType, startDate, endDate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filter Filings
     * 
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by report type (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;Filing&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Filing> filterFilings(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        ApiResponse<List<Filing>> resp = filterFilingsWithHttpInfo(company, reportType, startDate, endDate, nextPage);
        return resp.getData();
    }

    /**
     * Filter Filings
     * 
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by report type (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;Filing&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Filing>> filterFilingsWithHttpInfo(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterFilingsValidateBeforeCall(company, reportType, startDate, endDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<Filing>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Filings (asynchronously)
     * 
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by report type (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterFilingsAsync(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage, final ApiCallback<List<Filing>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = filterFilingsValidateBeforeCall(company, reportType, startDate, endDate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Filing>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllFilings
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllFilingsCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings";

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
    private com.squareup.okhttp.Call getAllFilingsValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllFilingsCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Filings
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;Filing&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Filing> getAllFilings(String nextPage) throws ApiException {
        ApiResponse<List<Filing>> resp = getAllFilingsWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Filings
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;Filing&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Filing>> getAllFilingsWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllFilingsValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<Filing>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Filings (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllFilingsAsync(String nextPage, final ApiCallback<List<Filing>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllFilingsValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Filing>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFilingById
     * @param id The Intrinio ID of the Filing (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilingByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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
    private com.squareup.okhttp.Call getFilingByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFilingById(Async)");
        }
        

        com.squareup.okhttp.Call call = getFilingByIdCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Filing by ID
     * 
     * @param id The Intrinio ID of the Filing (required)
     * @return Filing
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Filing getFilingById(String id) throws ApiException {
        ApiResponse<Filing> resp = getFilingByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get a Filing by ID
     * 
     * @param id The Intrinio ID of the Filing (required)
     * @return ApiResponse&lt;Filing&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Filing> getFilingByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getFilingByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Filing>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Filing by ID (asynchronously)
     * 
     * @param id The Intrinio ID of the Filing (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilingByIdAsync(String id, final ApiCallback<Filing> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFilingByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Filing>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
