

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
import com.intrinio.models.Fundamental;

import java.lang.reflect.Type;
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
     * Get a Fundamental by ID
     * Retrieves detailed fundamental data for the given &#x60;fundamental_id&#x60;.
     * @param id The Intrinio ID for the Fundamental (required)
     * @return Fundamental
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fundamental getFundamentalById(String id) throws ApiException {
        ApiResponse<Fundamental> resp = getFundamentalByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get a Fundamental by ID
     * Retrieves detailed fundamental data for the given &#x60;fundamental_id&#x60;.
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
     * Get a Fundamental by ID (asynchronously)
     * Retrieves detailed fundamental data for the given &#x60;fundamental_id&#x60;.
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
     * @param id The Intrinio ID for the Fundamental (required)
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
     * Get Reported Financials for a Fundamental
     * Returns the As-Reported Financials directly from the financial statements of the XBRL filings from the company
     * @param id The Intrinio ID for the Fundamental (required)
     * @return ApiResponseReportedFinancials
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseReportedFinancials getFundamentalReportedFinancials(String id) throws ApiException {
        ApiResponse<ApiResponseReportedFinancials> resp = getFundamentalReportedFinancialsWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Reported Financials for a Fundamental
     * Returns the As-Reported Financials directly from the financial statements of the XBRL filings from the company
     * @param id The Intrinio ID for the Fundamental (required)
     * @return ApiResponse&lt;ApiResponseReportedFinancials&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseReportedFinancials> getFundamentalReportedFinancialsWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getFundamentalReportedFinancialsValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseReportedFinancials>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Reported Financials for a Fundamental (asynchronously)
     * Returns the As-Reported Financials directly from the financial statements of the XBRL filings from the company
     * @param id The Intrinio ID for the Fundamental (required)
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
     * @param id The Intrinio ID for the Fundamental (required)
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
     * Get Standardized Financials for a Fundamental
     * Returns professional-grade historical financial data. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as reported financial statements because of the inherent complexity of reporting standards.
     * @param id The Intrinio ID for the Fundamental (required)
     * @return ApiResponseStandardizedFinancials
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseStandardizedFinancials getFundamentalStandardizedFinancials(String id) throws ApiException {
        ApiResponse<ApiResponseStandardizedFinancials> resp = getFundamentalStandardizedFinancialsWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Standardized Financials for a Fundamental
     * Returns professional-grade historical financial data. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as reported financial statements because of the inherent complexity of reporting standards.
     * @param id The Intrinio ID for the Fundamental (required)
     * @return ApiResponse&lt;ApiResponseStandardizedFinancials&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStandardizedFinancials> getFundamentalStandardizedFinancialsWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getFundamentalStandardizedFinancialsValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStandardizedFinancials>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Standardized Financials for a Fundamental (asynchronously)
     * Returns professional-grade historical financial data. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as reported financial statements because of the inherent complexity of reporting standards.
     * @param id The Intrinio ID for the Fundamental (required)
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
     * Lookup a Fundamental
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalYear The fiscal year (required)
     * @param fiscalPeriod The fiscal period (required)
     * @return Fundamental
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fundamental lookupFundamental(String identifier, String statementCode, Integer fiscalYear, String fiscalPeriod) throws ApiException {
        ApiResponse<Fundamental> resp = lookupFundamentalWithHttpInfo(identifier, statementCode, fiscalYear, fiscalPeriod);
        return resp.getData();
    }

    /**
     * Lookup a Fundamental
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
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
     * Lookup a Fundamental (asynchronously)
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
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
