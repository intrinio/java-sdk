

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


import com.intrinio.models.ApiResponseFilingNotes;
import com.intrinio.models.ApiResponseFilingNotesSearch;
import com.intrinio.models.ApiResponseFilings;
import java.math.BigDecimal;
import com.intrinio.models.Filing;
import com.intrinio.models.FilingNote;
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * Returns Filings that match the specified filters
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by report type (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseFilings filterFilings(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        ApiResponse<ApiResponseFilings> resp = filterFilingsWithHttpInfo(company, reportType, startDate, endDate, nextPage);
        return resp.getData();
    }

    /**
     * Filter Filings
     * Returns Filings that match the specified filters
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by report type (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilings> filterFilingsWithHttpInfo(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterFilingsValidateBeforeCall(company, reportType, startDate, endDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Filings (asynchronously)
     * Returns Filings that match the specified filters
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by report type (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterFilingsAsync(String company, String reportType, LocalDate startDate, LocalDate endDate, String nextPage, final ApiCallback<ApiResponseFilings> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for filterNotes
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given report type (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call filterNotesCall(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/notes/filter";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (company != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company", company));
        if (reportType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("report_type", reportType));
        if (filingStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filing_start_date", filingStartDate));
        if (filingEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filing_end_date", filingEndDate));
        if (periodEndedStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period_ended_start_date", periodEndedStartDate));
        if (periodEndedEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period_ended_end_date", periodEndedEndDate));
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
    private com.squareup.okhttp.Call filterNotesValidateBeforeCall(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = filterNotesCall(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filter Filing Notes
     * Returns Filing Notes that match the specified filters
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given report type (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseFilingNotes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseFilingNotes filterNotes(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, String nextPage) throws ApiException {
        ApiResponse<ApiResponseFilingNotes> resp = filterNotesWithHttpInfo(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, nextPage);
        return resp.getData();
    }

    /**
     * Filter Filing Notes
     * Returns Filing Notes that match the specified filters
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given report type (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseFilingNotes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilingNotes> filterNotesWithHttpInfo(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterNotesValidateBeforeCall(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Filing Notes (asynchronously)
     * Returns Filing Notes that match the specified filters
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given report type (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterNotesAsync(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, String nextPage, final ApiCallback<ApiResponseFilingNotes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = filterNotesValidateBeforeCall(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotes>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllFilingsValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllFilingsCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Filings
     * Returns all Filings
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseFilings getAllFilings(String nextPage) throws ApiException {
        ApiResponse<ApiResponseFilings> resp = getAllFilingsWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * All Filings
     * Returns all Filings
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilings> getAllFilingsWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllFilingsValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Filings (asynchronously)
     * Returns all Filings
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllFilingsAsync(String nextPage, final ApiCallback<ApiResponseFilings> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllNotes
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllNotesCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/notes";

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
    private com.squareup.okhttp.Call getAllNotesValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllNotesCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Filing Notes
     * Return all Notes from all Filings, most-recent first
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseFilingNotes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseFilingNotes getAllNotes(String nextPage) throws ApiException {
        ApiResponse<ApiResponseFilingNotes> resp = getAllNotesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * All Filing Notes
     * Return all Notes from all Filings, most-recent first
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseFilingNotes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilingNotes> getAllNotesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllNotesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Filing Notes (asynchronously)
     * Return all Notes from all Filings, most-recent first
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllNotesAsync(String nextPage, final ApiCallback<ApiResponseFilingNotes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllNotesValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotes>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * Lookup Filing
     * Returns the Filing with the given &#x60;identifier&#x60;
     * @param id The Intrinio ID of the Filing (required)
     * @return Filing
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Filing getFilingById(String id) throws ApiException {
        ApiResponse<Filing> resp = getFilingByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Lookup Filing
     * Returns the Filing with the given &#x60;identifier&#x60;
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
     * Lookup Filing (asynchronously)
     * Returns the Filing with the given &#x60;identifier&#x60;
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
    /**
     * Build call for getNote
     * @param identifier The Intrinio ID of the filing note (required)
     * @param contentFormat Returns content in html (as filed) or plain text (optional, default to text)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNoteCall(String identifier, String contentFormat, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/notes/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (contentFormat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("content_format", contentFormat));

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
    private com.squareup.okhttp.Call getNoteValidateBeforeCall(String identifier, String contentFormat, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getNote(Async)");
        }
        

        com.squareup.okhttp.Call call = getNoteCall(identifier, contentFormat, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filing Note by ID
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @param contentFormat Returns content in html (as filed) or plain text (optional, default to text)
     * @return FilingNote
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilingNote getNote(String identifier, String contentFormat) throws ApiException {
        ApiResponse<FilingNote> resp = getNoteWithHttpInfo(identifier, contentFormat);
        return resp.getData();
    }

    /**
     * Filing Note by ID
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @param contentFormat Returns content in html (as filed) or plain text (optional, default to text)
     * @return ApiResponse&lt;FilingNote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilingNote> getNoteWithHttpInfo(String identifier, String contentFormat) throws ApiException {
        com.squareup.okhttp.Call call = getNoteValidateBeforeCall(identifier, contentFormat, null, null);
        Type localVarReturnType = new TypeToken<FilingNote>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filing Note by ID (asynchronously)
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @param contentFormat Returns content in html (as filed) or plain text (optional, default to text)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNoteAsync(String identifier, String contentFormat, final ApiCallback<FilingNote> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNoteValidateBeforeCall(identifier, contentFormat, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilingNote>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNoteHtml
     * @param identifier The Intrinio ID of the filing note (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNoteHtmlCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/notes/{identifier}/html"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call getNoteHtmlValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getNoteHtml(Async)");
        }
        

        com.squareup.okhttp.Call call = getNoteHtmlCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filing Note HTML
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getNoteHtml(String identifier) throws ApiException {
        ApiResponse<String> resp = getNoteHtmlWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Filing Note HTML
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getNoteHtmlWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getNoteHtmlValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filing Note HTML (asynchronously)
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNoteHtmlAsync(String identifier, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNoteHtmlValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNoteText
     * @param identifier The Intrinio ID of the filing note (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNoteTextCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/notes/{identifier}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call getNoteTextValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getNoteText(Async)");
        }
        

        com.squareup.okhttp.Call call = getNoteTextCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filing Note Text
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getNoteText(String identifier) throws ApiException {
        ApiResponse<String> resp = getNoteTextWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Filing Note Text
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getNoteTextWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getNoteTextValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filing Note Text (asynchronously)
     * 
     * @param identifier The Intrinio ID of the filing note (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNoteTextAsync(String identifier, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNoteTextValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchNotes
     * @param query Search for notes that contain all or parts of this text (required)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchNotesCall(String query, LocalDate filingStartDate, LocalDate filingEndDate, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/notes/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
        if (filingStartDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filing_start_date", filingStartDate));
        if (filingEndDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filing_end_date", filingEndDate));
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchNotesValidateBeforeCall(String query, LocalDate filingStartDate, LocalDate filingEndDate, BigDecimal pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchNotes(Async)");
        }
        

        com.squareup.okhttp.Call call = searchNotesCall(query, filingStartDate, filingEndDate, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Filing Notes
     * Searches for Filing Notes using the &#x60;query&#x60;
     * @param query Search for notes that contain all or parts of this text (required)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponseFilingNotesSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseFilingNotesSearch searchNotes(String query, LocalDate filingStartDate, LocalDate filingEndDate, BigDecimal pageSize) throws ApiException {
        ApiResponse<ApiResponseFilingNotesSearch> resp = searchNotesWithHttpInfo(query, filingStartDate, filingEndDate, pageSize);
        return resp.getData();
    }

    /**
     * Search Filing Notes
     * Searches for Filing Notes using the &#x60;query&#x60;
     * @param query Search for notes that contain all or parts of this text (required)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponse&lt;ApiResponseFilingNotesSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilingNotesSearch> searchNotesWithHttpInfo(String query, LocalDate filingStartDate, LocalDate filingEndDate, BigDecimal pageSize) throws ApiException {
        com.squareup.okhttp.Call call = searchNotesValidateBeforeCall(query, filingStartDate, filingEndDate, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotesSearch>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Filing Notes (asynchronously)
     * Searches for Filing Notes using the &#x60;query&#x60;
     * @param query Search for notes that contain all or parts of this text (required)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchNotesAsync(String query, LocalDate filingStartDate, LocalDate filingEndDate, BigDecimal pageSize, final ApiCallback<ApiResponseFilingNotesSearch> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchNotesValidateBeforeCall(query, filingStartDate, filingEndDate, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotesSearch>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
