

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


import com.intrinio.models.ApiResponseFilingAnswers;
import com.intrinio.models.ApiResponseFilingFundamentals;
import com.intrinio.models.ApiResponseFilingNotes;
import com.intrinio.models.ApiResponseFilingNotesSearch;
import com.intrinio.models.ApiResponseFilings;
import com.intrinio.models.Filing;
import com.intrinio.models.FilingNote;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
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
     * Build call for getAllFilings
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Filter by report type. Separate values with commas to return multiple The filing &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report types&lt;/a&gt;. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param earningsRelease Return filings that have been tagged as having Results of Operations and Financial Conditions (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllFilingsCall(String company, String reportType, LocalDate startDate, LocalDate endDate, String industryCategory, String industryGroup, Boolean theaEnabled, Boolean earningsRelease, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings";

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
        if (industryCategory != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_category", industryCategory));
        if (industryGroup != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_group", industryGroup));
        if (theaEnabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("thea_enabled", theaEnabled));
        if (earningsRelease != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("earnings_release", earningsRelease));
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
    private com.squareup.okhttp.Call getAllFilingsValidateBeforeCall(String company, String reportType, LocalDate startDate, LocalDate endDate, String industryCategory, String industryGroup, Boolean theaEnabled, Boolean earningsRelease, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllFilingsCall(company, reportType, startDate, endDate, industryCategory, industryGroup, theaEnabled, earningsRelease, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Filings
     * Returns pertinent filing reference data for a specific company filing or latest filings for all companies. Useful for tracking the latest filings submitted and updating your database accordingly with the new information.
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Filter by report type. Separate values with commas to return multiple The filing &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report types&lt;/a&gt;. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param earningsRelease Return filings that have been tagged as having Results of Operations and Financial Conditions (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseFilings getAllFilings(String company, String reportType, LocalDate startDate, LocalDate endDate, String industryCategory, String industryGroup, Boolean theaEnabled, Boolean earningsRelease, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getAllFilingsWithHttpInfo", String.class, String.class, LocalDate.class, LocalDate.class, String.class, String.class, Boolean.class, Boolean.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { company, reportType, startDate, endDate, industryCategory, industryGroup, theaEnabled, earningsRelease, pageSize, nextPage };
      ApiResponse<ApiResponseFilings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Filings
     * Returns pertinent filing reference data for a specific company filing or latest filings for all companies. Useful for tracking the latest filings submitted and updating your database accordingly with the new information.
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Filter by report type. Separate values with commas to return multiple The filing &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report types&lt;/a&gt;. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param earningsRelease Return filings that have been tagged as having Results of Operations and Financial Conditions (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilings> getAllFilingsWithHttpInfo(String company, String reportType, LocalDate startDate, LocalDate endDate, String industryCategory, String industryGroup, Boolean theaEnabled, Boolean earningsRelease, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllFilingsValidateBeforeCall(company, reportType, startDate, endDate, industryCategory, industryGroup, theaEnabled, earningsRelease, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Filings (asynchronously)
     * Returns pertinent filing reference data for a specific company filing or latest filings for all companies. Useful for tracking the latest filings submitted and updating your database accordingly with the new information.
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Filter by report type. Separate values with commas to return multiple The filing &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report types&lt;/a&gt;. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param earningsRelease Return filings that have been tagged as having Results of Operations and Financial Conditions (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllFilingsAsync(String company, String reportType, LocalDate startDate, LocalDate endDate, String industryCategory, String industryGroup, Boolean theaEnabled, Boolean earningsRelease, Integer pageSize, String nextPage, final ApiCallback<ApiResponseFilings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllFilingsValidateBeforeCall(company, reportType, startDate, endDate, industryCategory, industryGroup, theaEnabled, earningsRelease, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllNotes
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt; (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllNotesCall(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/notes";

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
    private com.squareup.okhttp.Call getAllNotesValidateBeforeCall(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllNotesCall(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Filing Notes
     * Returns a list of the latest XBRL filing note sections from the SEC 10-K and 10-Q statements. The returned Intrinio XBRL filing note ID can then be utilized with the “Filing Note by ID” endpoint to retrieve the contents of the note in HTML or text format.
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt; (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseFilingNotes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseFilingNotes getAllNotes(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getAllNotesWithHttpInfo", String.class, String.class, LocalDate.class, LocalDate.class, LocalDate.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage };
      ApiResponse<ApiResponseFilingNotes> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Filing Notes
     * Returns a list of the latest XBRL filing note sections from the SEC 10-K and 10-Q statements. The returned Intrinio XBRL filing note ID can then be utilized with the “Filing Note by ID” endpoint to retrieve the contents of the note in HTML or text format.
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt; (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseFilingNotes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilingNotes> getAllNotesWithHttpInfo(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllNotesValidateBeforeCall(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Filing Notes (asynchronously)
     * Returns a list of the latest XBRL filing note sections from the SEC 10-K and 10-Q statements. The returned Intrinio XBRL filing note ID can then be utilized with the “Filing Note by ID” endpoint to retrieve the contents of the note in HTML or text format.
     * @param company A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param reportType Notes contained in filings that match the given &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt; (optional)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param periodEndedStartDate Limit search to filings with a period end date on or after this date (optional)
     * @param periodEndedEndDate Limit search to filings with a period end date on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllNotesAsync(String company, String reportType, LocalDate filingStartDate, LocalDate filingEndDate, LocalDate periodEndedStartDate, LocalDate periodEndedEndDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseFilingNotes> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllNotesValidateBeforeCall(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFilingAnswers
     * @param identifier A Filing identifier (required)
     * @param query The query to ask the Thea API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilingAnswersCall(String identifier, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/{identifier}/answers"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call getFilingAnswersValidateBeforeCall(String identifier, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getFilingAnswers(Async)");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling getFilingAnswers(Async)");
        }
        

        com.squareup.okhttp.Call call = getFilingAnswersCall(identifier, query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filing Answers
     * 
     * @param identifier A Filing identifier (required)
     * @param query The query to ask the Thea API (required)
     * @return ApiResponseFilingAnswers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseFilingAnswers getFilingAnswers(String identifier, String query) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getFilingAnswersWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, query };
      ApiResponse<ApiResponseFilingAnswers> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Filing Answers
     * 
     * @param identifier A Filing identifier (required)
     * @param query The query to ask the Thea API (required)
     * @return ApiResponse&lt;ApiResponseFilingAnswers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilingAnswers> getFilingAnswersWithHttpInfo(String identifier, String query) throws ApiException {
        com.squareup.okhttp.Call call = getFilingAnswersValidateBeforeCall(identifier, query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilingAnswers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filing Answers (asynchronously)
     * 
     * @param identifier A Filing identifier (required)
     * @param query The query to ask the Thea API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilingAnswersAsync(String identifier, String query, final ApiCallback<ApiResponseFilingAnswers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFilingAnswersValidateBeforeCall(identifier, query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseFilingAnswers>(){}.getType();
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
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Filing getFilingById(String id) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getFilingByIdWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { id };
      ApiResponse<Filing> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
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
     * Build call for getFilingFundamentals
     * @param identifier A Filing identifier (required)
     * @param statementCode Filters fundamentals by statement code (optional)
     * @param type Filters fundamentals by type (optional)
     * @param fiscalYear Filters fundamentals by fiscal year (optional)
     * @param fiscalPeriod Filters fundamentals by fiscal period (optional)
     * @param startDate Returns fundamentals on or after the given date (optional)
     * @param endDate Returns fundamentals on or before the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilingFundamentalsCall(String identifier, String statementCode, String type, Integer fiscalYear, String fiscalPeriod, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/{identifier}/fundamentals"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (statementCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("statement_code", statementCode));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (fiscalYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_year", fiscalYear));
        if (fiscalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_period", fiscalPeriod));
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
    private com.squareup.okhttp.Call getFilingFundamentalsValidateBeforeCall(String identifier, String statementCode, String type, Integer fiscalYear, String fiscalPeriod, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getFilingFundamentals(Async)");
        }
        

        com.squareup.okhttp.Call call = getFilingFundamentalsCall(identifier, statementCode, type, fiscalYear, fiscalPeriod, startDate, endDate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Fundamentals by Filing
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular &#x60;Intrinio Filing ID&#x60; (if applicable) that have been updated or created as a result of a company&#x60;s latest SEC filing. Useful to ensure your database is up to date with the latest fundamentals.
     * @param identifier A Filing identifier (required)
     * @param statementCode Filters fundamentals by statement code (optional)
     * @param type Filters fundamentals by type (optional)
     * @param fiscalYear Filters fundamentals by fiscal year (optional)
     * @param fiscalPeriod Filters fundamentals by fiscal period (optional)
     * @param startDate Returns fundamentals on or after the given date (optional)
     * @param endDate Returns fundamentals on or before the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseFilingFundamentals
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseFilingFundamentals getFilingFundamentals(String identifier, String statementCode, String type, Integer fiscalYear, String fiscalPeriod, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getFilingFundamentalsWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class, LocalDate.class, LocalDate.class, String.class);
      
      Object[] apiCallArguments = { identifier, statementCode, type, fiscalYear, fiscalPeriod, startDate, endDate, nextPage };
      ApiResponse<ApiResponseFilingFundamentals> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Fundamentals by Filing
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular &#x60;Intrinio Filing ID&#x60; (if applicable) that have been updated or created as a result of a company&#x60;s latest SEC filing. Useful to ensure your database is up to date with the latest fundamentals.
     * @param identifier A Filing identifier (required)
     * @param statementCode Filters fundamentals by statement code (optional)
     * @param type Filters fundamentals by type (optional)
     * @param fiscalYear Filters fundamentals by fiscal year (optional)
     * @param fiscalPeriod Filters fundamentals by fiscal period (optional)
     * @param startDate Returns fundamentals on or after the given date (optional)
     * @param endDate Returns fundamentals on or before the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseFilingFundamentals&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilingFundamentals> getFilingFundamentalsWithHttpInfo(String identifier, String statementCode, String type, Integer fiscalYear, String fiscalPeriod, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getFilingFundamentalsValidateBeforeCall(identifier, statementCode, type, fiscalYear, fiscalPeriod, startDate, endDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilingFundamentals>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Fundamentals by Filing (asynchronously)
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular &#x60;Intrinio Filing ID&#x60; (if applicable) that have been updated or created as a result of a company&#x60;s latest SEC filing. Useful to ensure your database is up to date with the latest fundamentals.
     * @param identifier A Filing identifier (required)
     * @param statementCode Filters fundamentals by statement code (optional)
     * @param type Filters fundamentals by type (optional)
     * @param fiscalYear Filters fundamentals by fiscal year (optional)
     * @param fiscalPeriod Filters fundamentals by fiscal period (optional)
     * @param startDate Returns fundamentals on or after the given date (optional)
     * @param endDate Returns fundamentals on or before the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilingFundamentalsAsync(String identifier, String statementCode, String type, Integer fiscalYear, String fiscalPeriod, LocalDate startDate, LocalDate endDate, String nextPage, final ApiCallback<ApiResponseFilingFundamentals> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFilingFundamentalsValidateBeforeCall(identifier, statementCode, type, fiscalYear, fiscalPeriod, startDate, endDate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseFilingFundamentals>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFilingHtml
     * @param identifier A Filing identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilingHtmlCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/{identifier}/html"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/html"
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
    private com.squareup.okhttp.Call getFilingHtmlValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getFilingHtml(Async)");
        }
        

        com.squareup.okhttp.Call call = getFilingHtmlCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filing Html
     * Returns a SEC filing in HTML Format for a specified filing ID.
     * @param identifier A Filing identifier (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public String getFilingHtml(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getFilingHtmlWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<String> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Filing Html
     * Returns a SEC filing in HTML Format for a specified filing ID.
     * @param identifier A Filing identifier (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getFilingHtmlWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getFilingHtmlValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filing Html (asynchronously)
     * Returns a SEC filing in HTML Format for a specified filing ID.
     * @param identifier A Filing identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilingHtmlAsync(String identifier, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFilingHtmlValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFilingText
     * @param identifier A Filing identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFilingTextCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/filings/{identifier}/text"
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
    private com.squareup.okhttp.Call getFilingTextValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getFilingText(Async)");
        }
        

        com.squareup.okhttp.Call call = getFilingTextCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filing Text
     * 
     * @param identifier A Filing identifier (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public String getFilingText(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getFilingTextWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<String> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Filing Text
     * 
     * @param identifier A Filing identifier (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getFilingTextWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getFilingTextValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filing Text (asynchronously)
     * 
     * @param identifier A Filing identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFilingTextAsync(String identifier, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFilingTextValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
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
     * Returns the XBRL filing note contents in HTML or text format for a specified Intrinio XBRL filing note ID.
     * @param identifier The Intrinio ID of the filing note (required)
     * @param contentFormat Returns content in html (as filed) or plain text (optional, default to text)
     * @return FilingNote
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public FilingNote getNote(String identifier, String contentFormat) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getNoteWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, contentFormat };
      ApiResponse<FilingNote> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Filing Note by ID
     * Returns the XBRL filing note contents in HTML or text format for a specified Intrinio XBRL filing note ID.
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
     * Returns the XBRL filing note contents in HTML or text format for a specified Intrinio XBRL filing note ID.
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
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public String getNoteHtml(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getNoteHtmlWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<String> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
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
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public String getNoteText(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("getNoteTextWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<String> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
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
    public com.squareup.okhttp.Call searchNotesCall(String query, LocalDate filingStartDate, LocalDate filingEndDate, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call searchNotesValidateBeforeCall(String query, LocalDate filingStartDate, LocalDate filingEndDate, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchNotes(Async)");
        }
        

        com.squareup.okhttp.Call call = searchNotesCall(query, filingStartDate, filingEndDate, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Filing Notes
     * Search the XBRL note database and return a list of XBRL note sections containing text from the text query parameter passed through.
     * @param query Search for notes that contain all or parts of this text (required)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponseFilingNotesSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseFilingNotesSearch searchNotes(String query, LocalDate filingStartDate, LocalDate filingEndDate, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = FilingApi.class.getMethod("searchNotesWithHttpInfo", String.class, LocalDate.class, LocalDate.class, Integer.class);
      
      Object[] apiCallArguments = { query, filingStartDate, filingEndDate, pageSize };
      ApiResponse<ApiResponseFilingNotesSearch> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Search Filing Notes
     * Search the XBRL note database and return a list of XBRL note sections containing text from the text query parameter passed through.
     * @param query Search for notes that contain all or parts of this text (required)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponse&lt;ApiResponseFilingNotesSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseFilingNotesSearch> searchNotesWithHttpInfo(String query, LocalDate filingStartDate, LocalDate filingEndDate, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = searchNotesValidateBeforeCall(query, filingStartDate, filingEndDate, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseFilingNotesSearch>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Filing Notes (asynchronously)
     * Search the XBRL note database and return a list of XBRL note sections containing text from the text query parameter passed through.
     * @param query Search for notes that contain all or parts of this text (required)
     * @param filingStartDate Limit search to filings on or after this date (optional)
     * @param filingEndDate Limit search to filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchNotesAsync(String query, LocalDate filingStartDate, LocalDate filingEndDate, Integer pageSize, final ApiCallback<ApiResponseFilingNotesSearch> callback) throws ApiException {

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
