

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
import com.intrinio.models.Company;
import com.intrinio.models.CompanyNews;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.FilingSummary;
import com.intrinio.models.Fundamental;
import com.intrinio.models.HistoricalData;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyApi {
    private ApiClient apiClient;

    public CompanyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for filterCompanies
     * @param lastFilingDate Last filing date (optional)
     * @param sic Standard Industrial Classification code (optional)
     * @param template Template (optional)
     * @param sector Industry sector (optional)
     * @param industryCategory Industry category (optional)
     * @param industryGroup Industry group (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call filterCompaniesCall(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/filter";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lastFilingDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("last_filing_date", lastFilingDate));
        if (sic != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sic", sic));
        if (template != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("template", template));
        if (sector != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sector", sector));
        if (industryCategory != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_category", industryCategory));
        if (industryGroup != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_group", industryGroup));
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
    private com.squareup.okhttp.Call filterCompaniesValidateBeforeCall(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = filterCompaniesCall(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filter Companies
     * Returns Companies matching the specified filters
     * @param lastFilingDate Last filing date (optional)
     * @param sic Standard Industrial Classification code (optional)
     * @param template Template (optional)
     * @param sector Industry sector (optional)
     * @param industryCategory Industry category (optional)
     * @param industryGroup Industry group (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;CompanySummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CompanySummary> filterCompanies(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage) throws ApiException {
        ApiResponse<List<CompanySummary>> resp = filterCompaniesWithHttpInfo(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage);
        return resp.getData();
    }

    /**
     * Filter Companies
     * Returns Companies matching the specified filters
     * @param lastFilingDate Last filing date (optional)
     * @param sic Standard Industrial Classification code (optional)
     * @param template Template (optional)
     * @param sector Industry sector (optional)
     * @param industryCategory Industry category (optional)
     * @param industryGroup Industry group (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;CompanySummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CompanySummary>> filterCompaniesWithHttpInfo(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterCompaniesValidateBeforeCall(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<CompanySummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Companies (asynchronously)
     * Returns Companies matching the specified filters
     * @param lastFilingDate Last filing date (optional)
     * @param sic Standard Industrial Classification code (optional)
     * @param template Template (optional)
     * @param sector Industry sector (optional)
     * @param industryCategory Industry category (optional)
     * @param industryGroup Industry group (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterCompaniesAsync(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage, final ApiCallback<List<CompanySummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = filterCompaniesValidateBeforeCall(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CompanySummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for filterCompanyFundamentals
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call filterCompanyFundamentalsCall(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/fundamentals/filter"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filedAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filed_after", filedAfter));
        if (filedBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filed_before", filedBefore));
        if (reportedOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reported_only", reportedOnly));
        if (fiscalYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_year", fiscalYear));
        if (statementCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("statement_code", statementCode));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
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
    private com.squareup.okhttp.Call filterCompanyFundamentalsValidateBeforeCall(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling filterCompanyFundamentals(Async)");
        }
        

        com.squareup.okhttp.Call call = filterCompanyFundamentalsCall(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filter Fundamentals for a Company
     * Returns Fundamentals for the Company with the given &#x60;identifier&#x60; and matching the specified filters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Fundamental> filterCompanyFundamentals(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        ApiResponse<List<Fundamental>> resp = filterCompanyFundamentalsWithHttpInfo(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage);
        return resp.getData();
    }

    /**
     * Filter Fundamentals for a Company
     * Returns Fundamentals for the Company with the given &#x60;identifier&#x60; and matching the specified filters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;Fundamental&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Fundamental>> filterCompanyFundamentalsWithHttpInfo(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterCompanyFundamentalsValidateBeforeCall(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<Fundamental>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Fundamentals for a Company (asynchronously)
     * Returns Fundamentals for the Company with the given &#x60;identifier&#x60; and matching the specified filters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or after the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterCompanyFundamentalsAsync(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage, final ApiCallback<List<Fundamental>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = filterCompanyFundamentalsValidateBeforeCall(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Fundamental>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllCompanies
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCompaniesCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies";

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
    private com.squareup.okhttp.Call getAllCompaniesValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllCompaniesCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Companies
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;CompanySummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CompanySummary> getAllCompanies(String nextPage) throws ApiException {
        ApiResponse<List<CompanySummary>> resp = getAllCompaniesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Companies
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;CompanySummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CompanySummary>> getAllCompaniesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompaniesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<CompanySummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Companies (asynchronously)
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCompaniesAsync(String nextPage, final ApiCallback<List<CompanySummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCompaniesValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CompanySummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllCompanyFilings
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyFilingsCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/filings"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call getAllCompanyFilingsValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getAllCompanyFilings(Async)");
        }
        

        com.squareup.okhttp.Call call = getAllCompanyFilingsCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filings
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;FilingSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FilingSummary> getAllCompanyFilings(String identifier, String nextPage) throws ApiException {
        ApiResponse<List<FilingSummary>> resp = getAllCompanyFilingsWithHttpInfo(identifier, nextPage);
        return resp.getData();
    }

    /**
     * Filings
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;FilingSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FilingSummary>> getAllCompanyFilingsWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompanyFilingsValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<FilingSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filings (asynchronously)
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyFilingsAsync(String identifier, String nextPage, final ApiCallback<List<FilingSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCompanyFilingsValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FilingSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllCompanyFundamentals
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyFundamentalsCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/fundamentals"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call getAllCompanyFundamentalsValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getAllCompanyFundamentals(Async)");
        }
        

        com.squareup.okhttp.Call call = getAllCompanyFundamentalsCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Fundamentals for a Company
     * Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Fundamental> getAllCompanyFundamentals(String identifier, String nextPage) throws ApiException {
        ApiResponse<List<Fundamental>> resp = getAllCompanyFundamentalsWithHttpInfo(identifier, nextPage);
        return resp.getData();
    }

    /**
     * Get All Fundamentals for a Company
     * Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;Fundamental&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Fundamental>> getAllCompanyFundamentalsWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompanyFundamentalsValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<Fundamental>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Fundamentals for a Company (asynchronously)
     * Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyFundamentalsAsync(String identifier, String nextPage, final ApiCallback<List<Fundamental>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCompanyFundamentalsValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Fundamental>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompany
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}"
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
    private com.squareup.okhttp.Call getCompanyValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompany(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Company by ID
     * 
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @return Company
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Company getCompany(String identifier) throws ApiException {
        ApiResponse<Company> resp = getCompanyWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get a Company by ID
     * 
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @return ApiResponse&lt;Company&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Company> getCompanyWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<Company>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Company by ID (asynchronously)
     * 
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyAsync(String identifier, final ApiCallback<Company> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Company>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyDataPointNumber
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointNumberCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/data_point/{item}/number"
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
    private com.squareup.okhttp.Call getCompanyDataPointNumberValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyDataPointNumber(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getCompanyDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyDataPointNumberCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Company Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getCompanyDataPointNumber(String identifier, String item) throws ApiException {
        ApiResponse<BigDecimal> resp = getCompanyDataPointNumberWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get Company Data Point (Number)
     * Returns a numeric value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getCompanyDataPointNumberWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyDataPointNumberValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Company Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointNumberAsync(String identifier, String item, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyDataPointNumberValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyDataPointText
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointTextCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/data_point/{item}/text"
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
    private com.squareup.okhttp.Call getCompanyDataPointTextValidateBeforeCall(String identifier, String item, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyDataPointText(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getCompanyDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyDataPointTextCall(identifier, item, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Company Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getCompanyDataPointText(String identifier, String item) throws ApiException {
        ApiResponse<String> resp = getCompanyDataPointTextWithHttpInfo(identifier, item);
        return resp.getData();
    }

    /**
     * Get Company Data Point (Text)
     * Returns a text value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getCompanyDataPointTextWithHttpInfo(String identifier, String item) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyDataPointTextValidateBeforeCall(identifier, item, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Company Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item An Intrinio data tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointTextAsync(String identifier, String item, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyDataPointTextValidateBeforeCall(identifier, item, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyHistoricalData
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item Item (required)
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
    public com.squareup.okhttp.Call getCompanyHistoricalDataCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/historical_data/{item}"
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
    private com.squareup.okhttp.Call getCompanyHistoricalDataValidateBeforeCall(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyHistoricalData(Async)");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new ApiException("Missing the required parameter 'item' when calling getCompanyHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyHistoricalDataCall(identifier, item, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Company Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item Item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;HistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<HistoricalData> getCompanyHistoricalData(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        ApiResponse<List<HistoricalData>> resp = getCompanyHistoricalDataWithHttpInfo(identifier, item, type, startDate, endDate, sortOrder, nextPage);
        return resp.getData();
    }

    /**
     * Get Company Historical Data
     * Returns historical values for the given &#x60;item&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item Item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;HistoricalData&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<HistoricalData>> getCompanyHistoricalDataWithHttpInfo(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Company Historical Data (asynchronously)
     * Returns historical values for the given &#x60;item&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param item Item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyHistoricalDataAsync(String identifier, String item, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ApiCallback<List<HistoricalData>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyHistoricalDataValidateBeforeCall(identifier, item, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<HistoricalData>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNews
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNewsCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/news"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call getNewsValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getNews(Async)");
        }
        

        com.squareup.okhttp.Call call = getNewsCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * News
     * Returns news for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;CompanyNews&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CompanyNews> getNews(String identifier, String nextPage) throws ApiException {
        ApiResponse<List<CompanyNews>> resp = getNewsWithHttpInfo(identifier, nextPage);
        return resp.getData();
    }

    /**
     * News
     * Returns news for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;CompanyNews&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CompanyNews>> getNewsWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getNewsValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<CompanyNews>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * News (asynchronously)
     * Returns news for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNewsAsync(String identifier, String nextPage, final ApiCallback<List<CompanyNews>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNewsValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CompanyNews>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for lookupCompanyFundamental
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call lookupCompanyFundamentalCall(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "statement_code" + "\\}", apiClient.escapeString(statementCode.toString()))
            .replaceAll("\\{" + "fiscal_period" + "\\}", apiClient.escapeString(fiscalPeriod.toString()))
            .replaceAll("\\{" + "fiscal_year" + "\\}", apiClient.escapeString(fiscalYear.toString()));

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
    private com.squareup.okhttp.Call lookupCompanyFundamentalValidateBeforeCall(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling lookupCompanyFundamental(Async)");
        }
        
        // verify the required parameter 'statementCode' is set
        if (statementCode == null) {
            throw new ApiException("Missing the required parameter 'statementCode' when calling lookupCompanyFundamental(Async)");
        }
        
        // verify the required parameter 'fiscalPeriod' is set
        if (fiscalPeriod == null) {
            throw new ApiException("Missing the required parameter 'fiscalPeriod' when calling lookupCompanyFundamental(Async)");
        }
        
        // verify the required parameter 'fiscalYear' is set
        if (fiscalYear == null) {
            throw new ApiException("Missing the required parameter 'fiscalYear' when calling lookupCompanyFundamental(Async)");
        }
        

        com.squareup.okhttp.Call call = lookupCompanyFundamentalCall(identifier, statementCode, fiscalPeriod, fiscalYear, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lookup a Fundamental for a Company
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @return List&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Fundamental> lookupCompanyFundamental(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear) throws ApiException {
        ApiResponse<List<Fundamental>> resp = lookupCompanyFundamentalWithHttpInfo(identifier, statementCode, fiscalPeriod, fiscalYear);
        return resp.getData();
    }

    /**
     * Lookup a Fundamental for a Company
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @return ApiResponse&lt;List&lt;Fundamental&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Fundamental>> lookupCompanyFundamentalWithHttpInfo(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear) throws ApiException {
        com.squareup.okhttp.Call call = lookupCompanyFundamentalValidateBeforeCall(identifier, statementCode, fiscalPeriod, fiscalYear, null, null);
        Type localVarReturnType = new TypeToken<List<Fundamental>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lookup a Fundamental for a Company (asynchronously)
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call lookupCompanyFundamentalAsync(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear, final ApiCallback<List<Fundamental>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = lookupCompanyFundamentalValidateBeforeCall(identifier, statementCode, fiscalPeriod, fiscalYear, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Fundamental>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchCompanies
     * @param query Search parameters (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchCompaniesCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/search";

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
    private com.squareup.okhttp.Call searchCompaniesValidateBeforeCall(String query, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchCompanies(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCompaniesCall(query, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Companies
     * Searches for Companies matching the text &#x60;query&#x60;
     * @param query Search parameters (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return List&lt;CompanySummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CompanySummary> searchCompanies(String query, String nextPage) throws ApiException {
        ApiResponse<List<CompanySummary>> resp = searchCompaniesWithHttpInfo(query, nextPage);
        return resp.getData();
    }

    /**
     * Search Companies
     * Searches for Companies matching the text &#x60;query&#x60;
     * @param query Search parameters (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;List&lt;CompanySummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CompanySummary>> searchCompaniesWithHttpInfo(String query, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = searchCompaniesValidateBeforeCall(query, nextPage, null, null);
        Type localVarReturnType = new TypeToken<List<CompanySummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Companies (asynchronously)
     * Searches for Companies matching the text &#x60;query&#x60;
     * @param query Search parameters (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchCompaniesAsync(String query, String nextPage, final ApiCallback<List<CompanySummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchCompaniesValidateBeforeCall(query, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CompanySummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
