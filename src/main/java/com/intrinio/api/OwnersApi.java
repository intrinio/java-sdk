

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


import com.intrinio.models.ApiResponseOwnerInsiderTransactionFilings;
import com.intrinio.models.ApiResponseOwnerInstitutionalHoldings;
import com.intrinio.models.ApiResponseOwners;
import org.threeten.bp.LocalDate;
import com.intrinio.models.Owner;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OwnersApi {
    private ApiClient apiClient;

    public OwnersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OwnersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllOwners
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllOwnersCall(Boolean institutional, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/owners";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (institutional != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("institutional", institutional));
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
    private com.squareup.okhttp.Call getAllOwnersValidateBeforeCall(Boolean institutional, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllOwnersCall(institutional, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Owners
     * Returns all owners and information for all insider and institutional owners of securities covered by Intrinio.
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseOwners
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOwners getAllOwners(Boolean institutional, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = OwnersApi.class.getMethod("getAllOwnersWithHttpInfo", Boolean.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { institutional, pageSize, nextPage };
      ApiResponse<ApiResponseOwners> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Owners
     * Returns all owners and information for all insider and institutional owners of securities covered by Intrinio.
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseOwners&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOwners> getAllOwnersWithHttpInfo(Boolean institutional, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllOwnersValidateBeforeCall(institutional, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOwners>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Owners (asynchronously)
     * Returns all owners and information for all insider and institutional owners of securities covered by Intrinio.
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllOwnersAsync(Boolean institutional, Integer pageSize, String nextPage, final ApiCallback<ApiResponseOwners> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllOwnersValidateBeforeCall(institutional, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOwners>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOwnerById
     * @param identifier An Intrinio ID or CIK of an Owner (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOwnerByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/owners/{identifier}"
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
    private com.squareup.okhttp.Call getOwnerByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getOwnerById(Async)");
        }
        

        com.squareup.okhttp.Call call = getOwnerByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Owner by ID
     * Returns the Owner with the given ID
     * @param identifier An Intrinio ID or CIK of an Owner (required)
     * @return Owner
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Owner getOwnerById(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = OwnersApi.class.getMethod("getOwnerByIdWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<Owner> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Owner by ID
     * Returns the Owner with the given ID
     * @param identifier An Intrinio ID or CIK of an Owner (required)
     * @return ApiResponse&lt;Owner&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Owner> getOwnerByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getOwnerByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<Owner>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Owner by ID (asynchronously)
     * Returns the Owner with the given ID
     * @param identifier An Intrinio ID or CIK of an Owner (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOwnerByIdAsync(String identifier, final ApiCallback<Owner> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOwnerByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Owner>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for insiderTransactionFilingsByOwner
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param startDate Return Owner&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Owner&#39;s insider transaction filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insiderTransactionFilingsByOwnerCall(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/owners/{identifier}/insider_transaction_filings"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
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
    private com.squareup.okhttp.Call insiderTransactionFilingsByOwnerValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling insiderTransactionFilingsByOwner(Async)");
        }
        

        com.squareup.okhttp.Call call = insiderTransactionFilingsByOwnerCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insider Transaction Filings by Owner
     * Returns a list of all insider transaction filings by an owner in as many companies as the owner may be considered an insider. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param startDate Return Owner&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Owner&#39;s insider transaction filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseOwnerInsiderTransactionFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOwnerInsiderTransactionFilings insiderTransactionFilingsByOwner(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = OwnersApi.class.getMethod("insiderTransactionFilingsByOwnerWithHttpInfo", String.class, LocalDate.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseOwnerInsiderTransactionFilings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Insider Transaction Filings by Owner
     * Returns a list of all insider transaction filings by an owner in as many companies as the owner may be considered an insider. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param startDate Return Owner&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Owner&#39;s insider transaction filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseOwnerInsiderTransactionFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOwnerInsiderTransactionFilings> insiderTransactionFilingsByOwnerWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = insiderTransactionFilingsByOwnerValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOwnerInsiderTransactionFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insider Transaction Filings by Owner (asynchronously)
     * Returns a list of all insider transaction filings by an owner in as many companies as the owner may be considered an insider. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param startDate Return Owner&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Owner&#39;s insider transaction filings on or before this date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insiderTransactionFilingsByOwnerAsync(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseOwnerInsiderTransactionFilings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = insiderTransactionFilingsByOwnerValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOwnerInsiderTransactionFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for institutionalHoldingsByOwner
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param asOfDate Return only holdings filed before this date. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call institutionalHoldingsByOwnerCall(String identifier, Integer pageSize, Object asOfDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/owners/{identifier}/institutional_holdings"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (asOfDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("as_of_date", asOfDate));
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
    private com.squareup.okhttp.Call institutionalHoldingsByOwnerValidateBeforeCall(String identifier, Integer pageSize, Object asOfDate, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling institutionalHoldingsByOwner(Async)");
        }
        

        com.squareup.okhttp.Call call = institutionalHoldingsByOwnerCall(identifier, pageSize, asOfDate, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Institutional Holdings by Owner
     * Returns a list of all ownership interests and the value of their interests by a single institutional owner.
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param asOfDate Return only holdings filed before this date. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseOwnerInstitutionalHoldings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOwnerInstitutionalHoldings institutionalHoldingsByOwner(String identifier, Integer pageSize, Object asOfDate, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = OwnersApi.class.getMethod("institutionalHoldingsByOwnerWithHttpInfo", String.class, Integer.class, Object.class, String.class);
      
      Object[] apiCallArguments = { identifier, pageSize, asOfDate, nextPage };
      ApiResponse<ApiResponseOwnerInstitutionalHoldings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Institutional Holdings by Owner
     * Returns a list of all ownership interests and the value of their interests by a single institutional owner.
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param asOfDate Return only holdings filed before this date. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseOwnerInstitutionalHoldings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOwnerInstitutionalHoldings> institutionalHoldingsByOwnerWithHttpInfo(String identifier, Integer pageSize, Object asOfDate, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = institutionalHoldingsByOwnerValidateBeforeCall(identifier, pageSize, asOfDate, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOwnerInstitutionalHoldings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Institutional Holdings by Owner (asynchronously)
     * Returns a list of all ownership interests and the value of their interests by a single institutional owner.
     * @param identifier The Central Index Key issued by the SEC, which is the unique identifier all owner filings are issued under. (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param asOfDate Return only holdings filed before this date. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call institutionalHoldingsByOwnerAsync(String identifier, Integer pageSize, Object asOfDate, String nextPage, final ApiCallback<ApiResponseOwnerInstitutionalHoldings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = institutionalHoldingsByOwnerValidateBeforeCall(identifier, pageSize, asOfDate, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOwnerInstitutionalHoldings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchOwners
     * @param query  (required)
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchOwnersCall(String query, Boolean institutional, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/owners/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
        if (institutional != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("institutional", institutional));
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
    private com.squareup.okhttp.Call searchOwnersValidateBeforeCall(String query, Boolean institutional, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchOwners(Async)");
        }
        

        com.squareup.okhttp.Call call = searchOwnersCall(query, institutional, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Owners
     * Searches for Owners matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseOwners
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOwners searchOwners(String query, Boolean institutional, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = OwnersApi.class.getMethod("searchOwnersWithHttpInfo", String.class, Boolean.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { query, institutional, pageSize, nextPage };
      ApiResponse<ApiResponseOwners> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Search Owners
     * Searches for Owners matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseOwners&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOwners> searchOwnersWithHttpInfo(String query, Boolean institutional, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = searchOwnersValidateBeforeCall(query, institutional, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOwners>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Owners (asynchronously)
     * Searches for Owners matching the text &#x60;query&#x60;
     * @param query  (required)
     * @param institutional Returns insider owners who have filed forms 3, 4, or 5 with the SEC only. Possible values are true, false, or omit for both. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchOwnersAsync(String query, Boolean institutional, Integer pageSize, String nextPage, final ApiCallback<ApiResponseOwners> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchOwnersValidateBeforeCall(query, institutional, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOwners>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
