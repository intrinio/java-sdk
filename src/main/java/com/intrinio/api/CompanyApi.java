

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


import com.intrinio.models.ApiResponseCompanies;
import com.intrinio.models.ApiResponseCompanyFilings;
import com.intrinio.models.ApiResponseCompanyFundamentals;
import com.intrinio.models.ApiResponseCompanyHistoricalData;
import com.intrinio.models.ApiResponseCompanyNews;
import com.intrinio.models.ApiResponseCompanySecurities;
import com.intrinio.models.ApiResponseNews;
import java.math.BigDecimal;
import com.intrinio.models.Company;
import com.intrinio.models.Fundamental;
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @return ApiResponseCompanies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanies filterCompanies(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanies> resp = filterCompaniesWithHttpInfo(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage);
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
     * @return ApiResponse&lt;ApiResponseCompanies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanies> filterCompaniesWithHttpInfo(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterCompaniesValidateBeforeCall(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
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
    public com.squareup.okhttp.Call filterCompaniesAsync(LocalDate lastFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, String nextPage, final ApiCallback<ApiResponseCompanies> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
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
     * @param endDate Only on or before the given date (optional)
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @param endDate Only on or before the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyFundamentals
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanyFundamentals filterCompanyFundamentals(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanyFundamentals> resp = filterCompanyFundamentalsWithHttpInfo(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage);
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
     * @param endDate Only on or before the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyFundamentals&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyFundamentals> filterCompanyFundamentalsWithHttpInfo(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterCompanyFundamentalsValidateBeforeCall(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFundamentals>(){}.getType();
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
     * @param endDate Only on or before the given date (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterCompanyFundamentalsAsync(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, LocalDate startDate, LocalDate endDate, String nextPage, final ApiCallback<ApiResponseCompanyFundamentals> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFundamentals>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @return ApiResponseCompanies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanies getAllCompanies(String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanies> resp = getAllCompaniesWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Companies
     * 
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanies> getAllCompaniesWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompaniesValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
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
    public com.squareup.okhttp.Call getAllCompaniesAsync(String nextPage, final ApiCallback<ApiResponseCompanies> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllCompanyNews
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyNewsCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/news";

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
    private com.squareup.okhttp.Call getAllCompanyNewsValidateBeforeCall(String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllCompanyNewsCall(nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Company News
     * Returns all news for all companies
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseNews
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseNews getAllCompanyNews(String nextPage) throws ApiException {
        ApiResponse<ApiResponseNews> resp = getAllCompanyNewsWithHttpInfo(nextPage);
        return resp.getData();
    }

    /**
     * Get All Company News
     * Returns all news for all companies
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseNews&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseNews> getAllCompanyNewsWithHttpInfo(String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompanyNewsValidateBeforeCall(nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseNews>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Company News (asynchronously)
     * Returns all news for all companies
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyNewsAsync(String nextPage, final ApiCallback<ApiResponseNews> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCompanyNewsValidateBeforeCall(nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseNews>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @param tag An Intrinio data tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointNumberCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/data_point/{tag}/number"
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
    private com.squareup.okhttp.Call getCompanyDataPointNumberValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyDataPointNumber(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getCompanyDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyDataPointNumberCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Company Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BigDecimal getCompanyDataPointNumber(String identifier, String tag) throws ApiException {
        ApiResponse<BigDecimal> resp = getCompanyDataPointNumberWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Company Data Point (Number)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getCompanyDataPointNumberWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyDataPointNumberValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Company Data Point (Number) (asynchronously)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointNumberAsync(String identifier, String tag, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyDataPointNumberValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyDataPointText
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointTextCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/data_point/{tag}/text"
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
    private com.squareup.okhttp.Call getCompanyDataPointTextValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyDataPointText(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getCompanyDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyDataPointTextCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Company Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getCompanyDataPointText(String identifier, String tag) throws ApiException {
        ApiResponse<String> resp = getCompanyDataPointTextWithHttpInfo(identifier, tag);
        return resp.getData();
    }

    /**
     * Get Company Data Point (Text)
     * Returns a text value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getCompanyDataPointTextWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyDataPointTextValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Company Data Point (Text) (asynchronously)
     * Returns a text value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointTextAsync(String identifier, String tag, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyDataPointTextValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyFilings
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyFilingsCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCompanyFilingsValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyFilings(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyFilingsCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Filings for a Company
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanyFilings getCompanyFilings(String identifier, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanyFilings> resp = getCompanyFilingsWithHttpInfo(identifier, nextPage);
        return resp.getData();
    }

    /**
     * Get Filings for a Company
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyFilings> getCompanyFilingsWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyFilingsValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Filings for a Company (asynchronously)
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyFilingsAsync(String identifier, String nextPage, final ApiCallback<ApiResponseCompanyFilings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyFilingsValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyFundamentals
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyFundamentalsCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCompanyFundamentalsValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyFundamentals(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyFundamentalsCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get All Fundamentals for a Company
     * Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyFundamentals
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanyFundamentals getCompanyFundamentals(String identifier, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanyFundamentals> resp = getCompanyFundamentalsWithHttpInfo(identifier, nextPage);
        return resp.getData();
    }

    /**
     * Get All Fundamentals for a Company
     * Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyFundamentals&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyFundamentals> getCompanyFundamentalsWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyFundamentalsValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFundamentals>(){}.getType();
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
    public com.squareup.okhttp.Call getCompanyFundamentalsAsync(String identifier, String nextPage, final ApiCallback<ApiResponseCompanyFundamentals> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyFundamentalsValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFundamentals>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyHistoricalData
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag Item (required)
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
    public com.squareup.okhttp.Call getCompanyHistoricalDataCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/historical_data/{tag}"
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
    private com.squareup.okhttp.Call getCompanyHistoricalDataValidateBeforeCall(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyHistoricalData(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getCompanyHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyHistoricalDataCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Company Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag Item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyHistoricalData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanyHistoricalData getCompanyHistoricalData(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanyHistoricalData> resp = getCompanyHistoricalDataWithHttpInfo(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
        return resp.getData();
    }

    /**
     * Get Company Historical Data
     * Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag Item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyHistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyHistoricalData> getCompanyHistoricalDataWithHttpInfo(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyHistoricalData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Company Historical Data (asynchronously)
     * Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag Item (required)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyHistoricalDataAsync(String identifier, String tag, String type, LocalDate startDate, LocalDate endDate, String sortOrder, String nextPage, final ApiCallback<ApiResponseCompanyHistoricalData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyHistoricalDataValidateBeforeCall(identifier, tag, type, startDate, endDate, sortOrder, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyHistoricalData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyNews
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyNewsCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCompanyNewsValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyNews(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyNewsCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get News for a Company
     * Returns news for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyNews
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanyNews getCompanyNews(String identifier, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanyNews> resp = getCompanyNewsWithHttpInfo(identifier, nextPage);
        return resp.getData();
    }

    /**
     * Get News for a Company
     * Returns news for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyNews&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyNews> getCompanyNewsWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyNewsValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyNews>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get News for a Company (asynchronously)
     * Returns news for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyNewsAsync(String identifier, String nextPage, final ApiCallback<ApiResponseCompanyNews> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyNewsValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyNews>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanySecurities
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanySecuritiesCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/securities"
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCompanySecuritiesValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanySecurities(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanySecuritiesCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Securities by Company
     * Return Securities for the Company with &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanySecurities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanySecurities getCompanySecurities(String identifier, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCompanySecurities> resp = getCompanySecuritiesWithHttpInfo(identifier, nextPage);
        return resp.getData();
    }

    /**
     * Get Securities by Company
     * Return Securities for the Company with &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanySecurities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanySecurities> getCompanySecuritiesWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanySecuritiesValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanySecurities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Securities by Company (asynchronously)
     * Return Securities for the Company with &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanySecuritiesAsync(String identifier, String nextPage, final ApiCallback<ApiResponseCompanySecurities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanySecuritiesValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanySecurities>(){}.getType();
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
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
     * @return Fundamental
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fundamental lookupCompanyFundamental(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear) throws ApiException {
        ApiResponse<Fundamental> resp = lookupCompanyFundamentalWithHttpInfo(identifier, statementCode, fiscalPeriod, fiscalYear);
        return resp.getData();
    }

    /**
     * Lookup a Fundamental for a Company
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @return ApiResponse&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fundamental> lookupCompanyFundamentalWithHttpInfo(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear) throws ApiException {
        com.squareup.okhttp.Call call = lookupCompanyFundamentalValidateBeforeCall(identifier, statementCode, fiscalPeriod, fiscalYear, null, null);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
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
    public com.squareup.okhttp.Call lookupCompanyFundamentalAsync(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear, final ApiCallback<Fundamental> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchCompanies
     * @param query Search parameters (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchCompaniesCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/search";

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
    private com.squareup.okhttp.Call searchCompaniesValidateBeforeCall(String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchCompanies(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCompaniesCall(query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Companies
     * Searches for Companies matching the text &#x60;query&#x60;
     * @param query Search parameters (required)
     * @return ApiResponseCompanies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCompanies searchCompanies(String query) throws ApiException {
        ApiResponse<ApiResponseCompanies> resp = searchCompaniesWithHttpInfo(query);
        return resp.getData();
    }

    /**
     * Search Companies
     * Searches for Companies matching the text &#x60;query&#x60;
     * @param query Search parameters (required)
     * @return ApiResponse&lt;ApiResponseCompanies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanies> searchCompaniesWithHttpInfo(String query) throws ApiException {
        com.squareup.okhttp.Call call = searchCompaniesValidateBeforeCall(query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Companies (asynchronously)
     * Searches for Companies matching the text &#x60;query&#x60;
     * @param query Search parameters (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchCompaniesAsync(String query, final ApiCallback<ApiResponseCompanies> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchCompaniesValidateBeforeCall(query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
