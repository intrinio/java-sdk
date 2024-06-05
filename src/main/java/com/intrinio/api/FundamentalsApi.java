

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


import com.intrinio.models.ApiResponseReportedFinancials;
import com.intrinio.models.ApiResponseStandardizedFinancials;
import com.intrinio.models.ApiResponseStandardizedFinancialsDimensions;
import com.intrinio.models.Fundamental;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FundamentalsApi {
    private ApiClient apiClient;

    public FundamentalsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FundamentalsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for filterFundamental
     * @param filedAfter Only include fundamentals that were filed on or after this date. (optional)
     * @param filedBefore Only include fundamentals that were filed on or before this date. (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param startDate Only include fundamentals where covered period is on or after this date. (optional)
     * @param endDate Only include fundamentals where covered period is on or before this date. (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param template The financial statement template used by Intrinio to standardize the as reported data (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call filterFundamentalCall(LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fiscalPeriod, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, LocalDate updatedBefore, String template, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fundamentals";

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
        if (fiscalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_period", fiscalPeriod));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (updatedAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updated_after", updatedAfter));
        if (updatedBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updated_before", updatedBefore));
        if (template != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("template", template));
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
    private com.squareup.okhttp.Call filterFundamentalValidateBeforeCall(LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fiscalPeriod, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, LocalDate updatedBefore, String template, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = filterFundamentalCall(filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fiscalPeriod, startDate, endDate, updatedAfter, updatedBefore, template, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Filter Fundamental
     * Returns fundamentals that meet the set of filters specified in parameters.
     * @param filedAfter Only include fundamentals that were filed on or after this date. (optional)
     * @param filedBefore Only include fundamentals that were filed on or before this date. (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param startDate Only include fundamentals where covered period is on or after this date. (optional)
     * @param endDate Only include fundamentals where covered period is on or before this date. (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param template The financial statement template used by Intrinio to standardize the as reported data (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return Fundamental
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Fundamental filterFundamental(LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fiscalPeriod, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, LocalDate updatedBefore, String template, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = FundamentalsApi.class.getMethod("filterFundamentalWithHttpInfo", LocalDate.class, LocalDate.class, Boolean.class, Integer.class, String.class, String.class, String.class, LocalDate.class, LocalDate.class, LocalDate.class, LocalDate.class, String.class, String.class);
      
      Object[] apiCallArguments = { filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fiscalPeriod, startDate, endDate, updatedAfter, updatedBefore, template, nextPage };
      ApiResponse<Fundamental> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Filter Fundamental
     * Returns fundamentals that meet the set of filters specified in parameters.
     * @param filedAfter Only include fundamentals that were filed on or after this date. (optional)
     * @param filedBefore Only include fundamentals that were filed on or before this date. (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param startDate Only include fundamentals where covered period is on or after this date. (optional)
     * @param endDate Only include fundamentals where covered period is on or before this date. (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param template The financial statement template used by Intrinio to standardize the as reported data (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fundamental> filterFundamentalWithHttpInfo(LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fiscalPeriod, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, LocalDate updatedBefore, String template, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = filterFundamentalValidateBeforeCall(filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fiscalPeriod, startDate, endDate, updatedAfter, updatedBefore, template, nextPage, null, null);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Filter Fundamental (asynchronously)
     * Returns fundamentals that meet the set of filters specified in parameters.
     * @param filedAfter Only include fundamentals that were filed on or after this date. (optional)
     * @param filedBefore Only include fundamentals that were filed on or before this date. (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param startDate Only include fundamentals where covered period is on or after this date. (optional)
     * @param endDate Only include fundamentals where covered period is on or before this date. (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param template The financial statement template used by Intrinio to standardize the as reported data (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call filterFundamentalAsync(LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fiscalPeriod, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, LocalDate updatedBefore, String template, String nextPage, final ApiCallback<Fundamental> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = filterFundamentalValidateBeforeCall(filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fiscalPeriod, startDate, endDate, updatedAfter, updatedBefore, template, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFundamentalById
     * @param id The Intrinio ID for the Fundamental (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFundamentalByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fundamentals/{id}"
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
    private com.squareup.okhttp.Call getFundamentalByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFundamentalById(Async)");
        }
        

        com.squareup.okhttp.Call call = getFundamentalByIdCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fundamental by ID
     * Returns a specific fundamental associated with a particular unique fundamental ID. Useful for pulling reference data for a specific fundamental.
     * @param id The Intrinio ID for the Fundamental (required)
     * @return Fundamental
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Fundamental getFundamentalById(String id) throws ApiException, NoSuchMethodException {
      Method targetMethod = FundamentalsApi.class.getMethod("getFundamentalByIdWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { id };
      ApiResponse<Fundamental> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Fundamental by ID
     * Returns a specific fundamental associated with a particular unique fundamental ID. Useful for pulling reference data for a specific fundamental.
     * @param id The Intrinio ID for the Fundamental (required)
     * @return ApiResponse&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fundamental> getFundamentalByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getFundamentalByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fundamental by ID (asynchronously)
     * Returns a specific fundamental associated with a particular unique fundamental ID. Useful for pulling reference data for a specific fundamental.
     * @param id The Intrinio ID for the Fundamental (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFundamentalByIdAsync(String id, final ApiCallback<Fundamental> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFundamentalByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFundamentalReportedFinancials
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFundamentalReportedFinancialsCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fundamentals/{id}/reported_financials"
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
    private com.squareup.okhttp.Call getFundamentalReportedFinancialsValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFundamentalReportedFinancials(Async)");
        }
        

        com.squareup.okhttp.Call call = getFundamentalReportedFinancialsCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Reported Financials
     * Returns as-reported financial statement data for income statement, balance sheet, and cash flow statement. Data for income statement and cash flow statement is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @return ApiResponseReportedFinancials
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseReportedFinancials getFundamentalReportedFinancials(String id) throws ApiException, NoSuchMethodException {
      Method targetMethod = FundamentalsApi.class.getMethod("getFundamentalReportedFinancialsWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { id };
      ApiResponse<ApiResponseReportedFinancials> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Reported Financials
     * Returns as-reported financial statement data for income statement, balance sheet, and cash flow statement. Data for income statement and cash flow statement is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @return ApiResponse&lt;ApiResponseReportedFinancials&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseReportedFinancials> getFundamentalReportedFinancialsWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getFundamentalReportedFinancialsValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseReportedFinancials>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Reported Financials (asynchronously)
     * Returns as-reported financial statement data for income statement, balance sheet, and cash flow statement. Data for income statement and cash flow statement is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFundamentalReportedFinancialsAsync(String id, final ApiCallback<ApiResponseReportedFinancials> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFundamentalReportedFinancialsValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseReportedFinancials>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFundamentalStandardizedFinancials
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFundamentalStandardizedFinancialsCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fundamentals/{id}/standardized_financials"
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
    private com.squareup.okhttp.Call getFundamentalStandardizedFinancialsValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFundamentalStandardizedFinancials(Async)");
        }
        

        com.squareup.okhttp.Call call = getFundamentalStandardizedFinancialsCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Standardized Financials
     * Returns standardized financial statement data for income statement, balance sheet, cash flow statement and over 100 associated calculations for a given company. Data for income statement, cash flow statement, and calculations is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @return ApiResponseStandardizedFinancials
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStandardizedFinancials getFundamentalStandardizedFinancials(String id) throws ApiException, NoSuchMethodException {
      Method targetMethod = FundamentalsApi.class.getMethod("getFundamentalStandardizedFinancialsWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { id };
      ApiResponse<ApiResponseStandardizedFinancials> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Standardized Financials
     * Returns standardized financial statement data for income statement, balance sheet, cash flow statement and over 100 associated calculations for a given company. Data for income statement, cash flow statement, and calculations is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @return ApiResponse&lt;ApiResponseStandardizedFinancials&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStandardizedFinancials> getFundamentalStandardizedFinancialsWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getFundamentalStandardizedFinancialsValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStandardizedFinancials>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Standardized Financials (asynchronously)
     * Returns standardized financial statement data for income statement, balance sheet, cash flow statement and over 100 associated calculations for a given company. Data for income statement, cash flow statement, and calculations is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFundamentalStandardizedFinancialsAsync(String id, final ApiCallback<ApiResponseStandardizedFinancials> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFundamentalStandardizedFinancialsValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStandardizedFinancials>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getFundamentalStandardizedFinancialsDimensions
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFundamentalStandardizedFinancialsDimensionsCall(String id, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fundamentals/{id}/standardized_financials/dimensions/{tag}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
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
    private com.squareup.okhttp.Call getFundamentalStandardizedFinancialsDimensionsValidateBeforeCall(String id, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFundamentalStandardizedFinancialsDimensions(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getFundamentalStandardizedFinancialsDimensions(Async)");
        }
        

        com.squareup.okhttp.Call call = getFundamentalStandardizedFinancialsDimensionsCall(id, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Standardized Financials Dimensions
     * Returns as reported dimensionality of a data tag
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return ApiResponseStandardizedFinancialsDimensions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStandardizedFinancialsDimensions getFundamentalStandardizedFinancialsDimensions(String id, String tag) throws ApiException, NoSuchMethodException {
      Method targetMethod = FundamentalsApi.class.getMethod("getFundamentalStandardizedFinancialsDimensionsWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { id, tag };
      ApiResponse<ApiResponseStandardizedFinancialsDimensions> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Standardized Financials Dimensions
     * Returns as reported dimensionality of a data tag
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return ApiResponse&lt;ApiResponseStandardizedFinancialsDimensions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStandardizedFinancialsDimensions> getFundamentalStandardizedFinancialsDimensionsWithHttpInfo(String id, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getFundamentalStandardizedFinancialsDimensionsValidateBeforeCall(id, tag, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStandardizedFinancialsDimensions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Standardized Financials Dimensions (asynchronously)
     * Returns as reported dimensionality of a data tag
     * @param id The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFundamentalStandardizedFinancialsDimensionsAsync(String id, String tag, final ApiCallback<ApiResponseStandardizedFinancialsDimensions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFundamentalStandardizedFinancialsDimensionsValidateBeforeCall(id, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStandardizedFinancialsDimensions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for lookupFundamental
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalYear The fiscal year (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call lookupFundamentalCall(String identifier, String statementCode, Integer fiscalYear, String fiscalPeriod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "statement_code" + "\\}", apiClient.escapeString(statementCode.toString()))
            .replaceAll("\\{" + "fiscal_year" + "\\}", apiClient.escapeString(fiscalYear.toString()))
            .replaceAll("\\{" + "fiscal_period" + "\\}", apiClient.escapeString(fiscalPeriod.toString()));

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
    private com.squareup.okhttp.Call lookupFundamentalValidateBeforeCall(String identifier, String statementCode, Integer fiscalYear, String fiscalPeriod, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling lookupFundamental(Async)");
        }
        
        // verify the required parameter 'statementCode' is set
        if (statementCode == null) {
            throw new ApiException("Missing the required parameter 'statementCode' when calling lookupFundamental(Async)");
        }
        
        // verify the required parameter 'fiscalYear' is set
        if (fiscalYear == null) {
            throw new ApiException("Missing the required parameter 'fiscalYear' when calling lookupFundamental(Async)");
        }
        
        // verify the required parameter 'fiscalPeriod' is set
        if (fiscalPeriod == null) {
            throw new ApiException("Missing the required parameter 'fiscalPeriod' when calling lookupFundamental(Async)");
        }
        

        com.squareup.okhttp.Call call = lookupFundamentalCall(identifier, statementCode, fiscalYear, fiscalPeriod, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lookup Fundamental
     * Returns a specific fundamental with unique fundamental ID associated with a particular company, year, period and statement. Useful for pulling the unique fundamental ID and reference data for a specific fundamental.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalYear The fiscal year (required)
     * @param fiscalPeriod The fiscal period (required)
     * @return Fundamental
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Fundamental lookupFundamental(String identifier, String statementCode, Integer fiscalYear, String fiscalPeriod) throws ApiException, NoSuchMethodException {
      Method targetMethod = FundamentalsApi.class.getMethod("lookupFundamentalWithHttpInfo", String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, statementCode, fiscalYear, fiscalPeriod };
      ApiResponse<Fundamental> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Lookup Fundamental
     * Returns a specific fundamental with unique fundamental ID associated with a particular company, year, period and statement. Useful for pulling the unique fundamental ID and reference data for a specific fundamental.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalYear The fiscal year (required)
     * @param fiscalPeriod The fiscal period (required)
     * @return ApiResponse&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fundamental> lookupFundamentalWithHttpInfo(String identifier, String statementCode, Integer fiscalYear, String fiscalPeriod) throws ApiException {
        com.squareup.okhttp.Call call = lookupFundamentalValidateBeforeCall(identifier, statementCode, fiscalYear, fiscalPeriod, null, null);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lookup Fundamental (asynchronously)
     * Returns a specific fundamental with unique fundamental ID associated with a particular company, year, period and statement. Useful for pulling the unique fundamental ID and reference data for a specific fundamental.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalYear The fiscal year (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call lookupFundamentalAsync(String identifier, String statementCode, Integer fiscalYear, String fiscalPeriod, final ApiCallback<Fundamental> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = lookupFundamentalValidateBeforeCall(identifier, statementCode, fiscalYear, fiscalPeriod, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
