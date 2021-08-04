

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


import com.intrinio.models.ApiResponseOptionPrices;
import com.intrinio.models.ApiResponseOptions;
import com.intrinio.models.ApiResponseOptionsChain;
import com.intrinio.models.ApiResponseOptionsChainRealtime;
import com.intrinio.models.ApiResponseOptionsExpirations;
import com.intrinio.models.ApiResponseOptionsPriceRealtime;
import com.intrinio.models.ApiResponseOptionsPricesBatchRealtime;
import com.intrinio.models.ApiResponseOptionsRealtime;
import com.intrinio.models.ApiResponseOptionsStatsRealtime;
import com.intrinio.models.ApiResponseOptionsTickers;
import com.intrinio.models.ApiResponseOptionsUnusualActivity;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import com.intrinio.models.OptionContractsList;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionsApi {
    private ApiClient apiClient;

    public OptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllOptionsTickers
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllOptionsTickersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/tickers";

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
    private com.squareup.okhttp.Call getAllOptionsTickersValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllOptionsTickersCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Options Tickers
     * Returns all tickers that have existing options contracts.
     * @return ApiResponseOptionsTickers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsTickers getAllOptionsTickers() throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getAllOptionsTickersWithHttpInfo");
      
      Object[] apiCallArguments = {  };
      ApiResponse<ApiResponseOptionsTickers> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Options Tickers
     * Returns all tickers that have existing options contracts.
     * @return ApiResponse&lt;ApiResponseOptionsTickers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsTickers> getAllOptionsTickersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllOptionsTickersValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsTickers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Options Tickers (asynchronously)
     * Returns all tickers that have existing options contracts.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllOptionsTickersAsync(final ApiCallback<ApiResponseOptionsTickers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllOptionsTickersValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsTickers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionExpirationsRealtime
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionExpirationsRealtimeCall(String symbol, String after, String before, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/expirations/{symbol}/realtime"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("after", after));
        if (before != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("before", before));
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));

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
    private com.squareup.okhttp.Call getOptionExpirationsRealtimeValidateBeforeCall(String symbol, String after, String before, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getOptionExpirationsRealtime(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionExpirationsRealtimeCall(symbol, after, before, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Option Expirations Realtime
     * Returns all realtime option contract expiration dates for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponseOptionsExpirations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsExpirations getOptionExpirationsRealtime(String symbol, String after, String before, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionExpirationsRealtimeWithHttpInfo", String.class, String.class, String.class, String.class);
      
      Object[] apiCallArguments = { symbol, after, before, source };
      ApiResponse<ApiResponseOptionsExpirations> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Option Expirations Realtime
     * Returns all realtime option contract expiration dates for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsExpirations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsExpirations> getOptionExpirationsRealtimeWithHttpInfo(String symbol, String after, String before, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOptionExpirationsRealtimeValidateBeforeCall(symbol, after, before, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsExpirations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Option Expirations Realtime (asynchronously)
     * Returns all realtime option contract expiration dates for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionExpirationsRealtimeAsync(String symbol, String after, String before, String source, final ApiCallback<ApiResponseOptionsExpirations> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionExpirationsRealtimeValidateBeforeCall(symbol, after, before, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsExpirations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptions
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsCall(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/{symbol}"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (strike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike", strike));
        if (strikeGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_greater_than", strikeGreaterThan));
        if (strikeLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_less_than", strikeLessThan));
        if (expiration != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expiration", expiration));
        if (expirationAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expiration_after", expirationAfter));
        if (expirationBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expiration_before", expirationBefore));
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
    private com.squareup.okhttp.Call getOptionsValidateBeforeCall(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsCall(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Options
     * Returns the master list of option contracts for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseOptions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptions getOptions(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsWithHttpInfo", String.class, String.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage };
      ApiResponse<ApiResponseOptions> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Options
     * Returns the master list of option contracts for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseOptions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptions> getOptionsWithHttpInfo(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsValidateBeforeCall(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Options (asynchronously)
     * Returns the master list of option contracts for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsAsync(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, Integer pageSize, String nextPage, final ApiCallback<ApiResponseOptions> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsValidateBeforeCall(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsBySymbolRealtime
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsBySymbolRealtimeCall(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/{symbol}/realtime"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (strike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike", strike));
        if (strikeGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_greater_than", strikeGreaterThan));
        if (strikeLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_less_than", strikeLessThan));
        if (expiration != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expiration", expiration));
        if (expirationAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expiration_after", expirationAfter));
        if (expirationBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("expiration_before", expirationBefore));
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));

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
    private com.squareup.okhttp.Call getOptionsBySymbolRealtimeValidateBeforeCall(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getOptionsBySymbolRealtime(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsBySymbolRealtimeCall(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Options by Symbol Realtime
     * Returns the master list of realtime option contracts for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponseOptionsRealtime
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsRealtime getOptionsBySymbolRealtime(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsBySymbolRealtimeWithHttpInfo", String.class, String.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, String.class, String.class, String.class, String.class);
      
      Object[] apiCallArguments = { symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source };
      ApiResponse<ApiResponseOptionsRealtime> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Options by Symbol Realtime
     * Returns the master list of realtime option contracts for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsRealtime&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsRealtime> getOptionsBySymbolRealtimeWithHttpInfo(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsBySymbolRealtimeValidateBeforeCall(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsRealtime>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Options by Symbol Realtime (asynchronously)
     * Returns the master list of realtime option contracts for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param expiration The expiration date of the option contract. This will return options contracts with expiration dates on this date. (optional)
     * @param expirationAfter The expiration date of the option contract. This will return options contracts with expiration dates after this date. (optional)
     * @param expirationBefore The expiration date of the option contract. This will return options contracts with expiration dates before this date. (optional)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsBySymbolRealtimeAsync(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, String source, final ApiCallback<ApiResponseOptionsRealtime> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsBySymbolRealtimeValidateBeforeCall(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsRealtime>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsChain
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param date The date of the option price. Returns option prices on this date. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsChainCall(String symbol, String expiration, LocalDate date, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String moneyness, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/chain/{symbol}/{expiration}"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()))
            .replaceAll("\\{" + "expiration" + "\\}", apiClient.escapeString(expiration.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (strike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike", strike));
        if (strikeGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_greater_than", strikeGreaterThan));
        if (strikeLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_less_than", strikeLessThan));
        if (moneyness != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("moneyness", moneyness));
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
    private com.squareup.okhttp.Call getOptionsChainValidateBeforeCall(String symbol, String expiration, LocalDate date, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String moneyness, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getOptionsChain(Async)");
        }
        
        // verify the required parameter 'expiration' is set
        if (expiration == null) {
            throw new ApiException("Missing the required parameter 'expiration' when calling getOptionsChain(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsChainCall(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Options Chain
     * Returns all options contracts and their prices for the given symbol and expiration date.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param date The date of the option price. Returns option prices on this date. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponseOptionsChain
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsChain getOptionsChain(String symbol, String expiration, LocalDate date, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String moneyness, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsChainWithHttpInfo", String.class, String.class, LocalDate.class, String.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, String.class, Integer.class);
      
      Object[] apiCallArguments = { symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize };
      ApiResponse<ApiResponseOptionsChain> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Options Chain
     * Returns all options contracts and their prices for the given symbol and expiration date.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param date The date of the option price. Returns option prices on this date. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponse&lt;ApiResponseOptionsChain&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsChain> getOptionsChainWithHttpInfo(String symbol, String expiration, LocalDate date, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String moneyness, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsChainValidateBeforeCall(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsChain>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Options Chain (asynchronously)
     * Returns all options contracts and their prices for the given symbol and expiration date.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param date The date of the option price. Returns option prices on this date. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsChainAsync(String symbol, String expiration, LocalDate date, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String moneyness, Integer pageSize, final ApiCallback<ApiResponseOptionsChain> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsChainValidateBeforeCall(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsChain>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsChainRealtime
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param volumeGreaterThan The volume of the option contract. This will return options contracts with volumes greater than this amount. (optional)
     * @param volumeLessThan The volume of the option contract. This will return options contracts with volumes less than this amout. (optional)
     * @param openInterestGreaterThan The open interest of the option contract. This will return options contracts with open interest greater than this amount. (optional)
     * @param openInterestLessThan The open interest of the option contract. This will return options contracts with open interest less than this amount. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money.  Requires subscription to realtime stock price data. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsChainRealtimeCall(String symbol, String expiration, String source, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, BigDecimal volumeGreaterThan, BigDecimal volumeLessThan, BigDecimal openInterestGreaterThan, BigDecimal openInterestLessThan, String moneyness, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/chain/{symbol}/{expiration}/realtime"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()))
            .replaceAll("\\{" + "expiration" + "\\}", apiClient.escapeString(expiration.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (strike != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike", strike));
        if (strikeGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_greater_than", strikeGreaterThan));
        if (strikeLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strike_less_than", strikeLessThan));
        if (volumeGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("volume_greater_than", volumeGreaterThan));
        if (volumeLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("volume_less_than", volumeLessThan));
        if (openInterestGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_interest_greater_than", openInterestGreaterThan));
        if (openInterestLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_interest_less_than", openInterestLessThan));
        if (moneyness != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("moneyness", moneyness));

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
    private com.squareup.okhttp.Call getOptionsChainRealtimeValidateBeforeCall(String symbol, String expiration, String source, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, BigDecimal volumeGreaterThan, BigDecimal volumeLessThan, BigDecimal openInterestGreaterThan, BigDecimal openInterestLessThan, String moneyness, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getOptionsChainRealtime(Async)");
        }
        
        // verify the required parameter 'expiration' is set
        if (expiration == null) {
            throw new ApiException("Missing the required parameter 'expiration' when calling getOptionsChainRealtime(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsChainRealtimeCall(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Options Chain Realtime
     * Returns all realtime options contracts and their prices for the given symbol and expiration date.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param volumeGreaterThan The volume of the option contract. This will return options contracts with volumes greater than this amount. (optional)
     * @param volumeLessThan The volume of the option contract. This will return options contracts with volumes less than this amout. (optional)
     * @param openInterestGreaterThan The open interest of the option contract. This will return options contracts with open interest greater than this amount. (optional)
     * @param openInterestLessThan The open interest of the option contract. This will return options contracts with open interest less than this amount. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money.  Requires subscription to realtime stock price data. (optional)
     * @return ApiResponseOptionsChainRealtime
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsChainRealtime getOptionsChainRealtime(String symbol, String expiration, String source, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, BigDecimal volumeGreaterThan, BigDecimal volumeLessThan, BigDecimal openInterestGreaterThan, BigDecimal openInterestLessThan, String moneyness) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsChainRealtimeWithHttpInfo", String.class, String.class, String.class, String.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, String.class);
      
      Object[] apiCallArguments = { symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness };
      ApiResponse<ApiResponseOptionsChainRealtime> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Options Chain Realtime
     * Returns all realtime options contracts and their prices for the given symbol and expiration date.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param volumeGreaterThan The volume of the option contract. This will return options contracts with volumes greater than this amount. (optional)
     * @param volumeLessThan The volume of the option contract. This will return options contracts with volumes less than this amout. (optional)
     * @param openInterestGreaterThan The open interest of the option contract. This will return options contracts with open interest greater than this amount. (optional)
     * @param openInterestLessThan The open interest of the option contract. This will return options contracts with open interest less than this amount. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money.  Requires subscription to realtime stock price data. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsChainRealtime&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsChainRealtime> getOptionsChainRealtimeWithHttpInfo(String symbol, String expiration, String source, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, BigDecimal volumeGreaterThan, BigDecimal volumeLessThan, BigDecimal openInterestGreaterThan, BigDecimal openInterestLessThan, String moneyness) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsChainRealtimeValidateBeforeCall(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsChainRealtime>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Options Chain Realtime (asynchronously)
     * Returns all realtime options contracts and their prices for the given symbol and expiration date.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param expiration The expiration date of the options contract (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param type The option contract type. (optional)
     * @param strike The strike price of the option contract. This will return options contracts with strike price equal to this price. (optional)
     * @param strikeGreaterThan The strike price of the option contract. This will return options contracts with strike prices greater than this price. (optional)
     * @param strikeLessThan The strike price of the option contract. This will return options contracts with strike prices less than this price. (optional)
     * @param volumeGreaterThan The volume of the option contract. This will return options contracts with volumes greater than this amount. (optional)
     * @param volumeLessThan The volume of the option contract. This will return options contracts with volumes less than this amout. (optional)
     * @param openInterestGreaterThan The open interest of the option contract. This will return options contracts with open interest greater than this amount. (optional)
     * @param openInterestLessThan The open interest of the option contract. This will return options contracts with open interest less than this amount. (optional)
     * @param moneyness The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money.  Requires subscription to realtime stock price data. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsChainRealtimeAsync(String symbol, String expiration, String source, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, BigDecimal volumeGreaterThan, BigDecimal volumeLessThan, BigDecimal openInterestGreaterThan, BigDecimal openInterestLessThan, String moneyness, final ApiCallback<ApiResponseOptionsChainRealtime> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsChainRealtimeValidateBeforeCall(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsChainRealtime>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsExpirations
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsExpirationsCall(String symbol, String after, String before, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/expirations/{symbol}"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("after", after));
        if (before != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("before", before));

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
    private com.squareup.okhttp.Call getOptionsExpirationsValidateBeforeCall(String symbol, String after, String before, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getOptionsExpirations(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsExpirationsCall(symbol, after, before, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Options Expirations
     * Returns all option contract expiration dates for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @return ApiResponseOptionsExpirations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsExpirations getOptionsExpirations(String symbol, String after, String before) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsExpirationsWithHttpInfo", String.class, String.class, String.class);
      
      Object[] apiCallArguments = { symbol, after, before };
      ApiResponse<ApiResponseOptionsExpirations> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Options Expirations
     * Returns all option contract expiration dates for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsExpirations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsExpirations> getOptionsExpirationsWithHttpInfo(String symbol, String after, String before) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsExpirationsValidateBeforeCall(symbol, after, before, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsExpirations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Options Expirations (asynchronously)
     * Returns all option contract expiration dates for a given symbol.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param after Return option contract expiration dates after this date. (optional)
     * @param before Return option contract expiration dates before this date. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsExpirationsAsync(String symbol, String after, String before, final ApiCallback<ApiResponseOptionsExpirations> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsExpirationsValidateBeforeCall(symbol, after, before, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsExpirations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsPrices
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param startDate Return option contract prices on or after this date. (optional)
     * @param endDate Return option contract prices on or before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsPricesCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/prices/{identifier}"
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
    private com.squareup.okhttp.Call getOptionsPricesValidateBeforeCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getOptionsPrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsPricesCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Option Prices
     * Returns all option prices for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param startDate Return option contract prices on or after this date. (optional)
     * @param endDate Return option contract prices on or before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseOptionPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionPrices getOptionsPrices(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsPricesWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseOptionPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Option Prices
     * Returns all option prices for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param startDate Return option contract prices on or after this date. (optional)
     * @param endDate Return option contract prices on or before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseOptionPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionPrices> getOptionsPricesWithHttpInfo(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsPricesValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Option Prices (asynchronously)
     * Returns all option prices for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param startDate Return option contract prices on or after this date. (optional)
     * @param endDate Return option contract prices on or before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsPricesAsync(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseOptionPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsPricesValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsPricesBatchRealtime
     * @param body The contract symbols for which to return options prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsPricesBatchRealtimeCall(OptionContractsList body, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/options/prices/realtime/batch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOptionsPricesBatchRealtimeValidateBeforeCall(OptionContractsList body, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getOptionsPricesBatchRealtime(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsPricesBatchRealtimeCall(body, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Option Prices Batch Realtime
     * Returns options prices for a supplied list of option symbols.
     * @param body The contract symbols for which to return options prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponseOptionsPricesBatchRealtime
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsPricesBatchRealtime getOptionsPricesBatchRealtime(OptionContractsList body, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsPricesBatchRealtimeWithHttpInfo", OptionContractsList.class, String.class);
      
      Object[] apiCallArguments = { body, source };
      ApiResponse<ApiResponseOptionsPricesBatchRealtime> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Option Prices Batch Realtime
     * Returns options prices for a supplied list of option symbols.
     * @param body The contract symbols for which to return options prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsPricesBatchRealtime&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsPricesBatchRealtime> getOptionsPricesBatchRealtimeWithHttpInfo(OptionContractsList body, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsPricesBatchRealtimeValidateBeforeCall(body, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsPricesBatchRealtime>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Option Prices Batch Realtime (asynchronously)
     * Returns options prices for a supplied list of option symbols.
     * @param body The contract symbols for which to return options prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsPricesBatchRealtimeAsync(OptionContractsList body, String source, final ApiCallback<ApiResponseOptionsPricesBatchRealtime> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsPricesBatchRealtimeValidateBeforeCall(body, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsPricesBatchRealtime>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsPricesRealtime
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsPricesRealtimeCall(String identifier, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/prices/{identifier}/realtime"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));

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
    private com.squareup.okhttp.Call getOptionsPricesRealtimeValidateBeforeCall(String identifier, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getOptionsPricesRealtime(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsPricesRealtimeCall(identifier, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Option Prices Realtime
     * Returns all option prices for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponseOptionsPriceRealtime
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsPriceRealtime getOptionsPricesRealtime(String identifier, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsPricesRealtimeWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, source };
      ApiResponse<ApiResponseOptionsPriceRealtime> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Option Prices Realtime
     * Returns all option prices for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsPriceRealtime&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsPriceRealtime> getOptionsPricesRealtimeWithHttpInfo(String identifier, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsPricesRealtimeValidateBeforeCall(identifier, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsPriceRealtime>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Option Prices Realtime (asynchronously)
     * Returns all option prices for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsPricesRealtimeAsync(String identifier, String source, final ApiCallback<ApiResponseOptionsPriceRealtime> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsPricesRealtimeValidateBeforeCall(identifier, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsPriceRealtime>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOptionsStatsRealtime
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOptionsStatsRealtimeCall(String identifier, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/prices/{identifier}/realtime/stats"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));

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
    private com.squareup.okhttp.Call getOptionsStatsRealtimeValidateBeforeCall(String identifier, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getOptionsStatsRealtime(Async)");
        }
        

        com.squareup.okhttp.Call call = getOptionsStatsRealtimeCall(identifier, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Option Stats Realtime
     * Returns all option stats (greeks and implied volatility) and factors used to calculate them, for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponseOptionsStatsRealtime
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsStatsRealtime getOptionsStatsRealtime(String identifier, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getOptionsStatsRealtimeWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, source };
      ApiResponse<ApiResponseOptionsStatsRealtime> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Option Stats Realtime
     * Returns all option stats (greeks and implied volatility) and factors used to calculate them, for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsStatsRealtime&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsStatsRealtime> getOptionsStatsRealtimeWithHttpInfo(String identifier, String source) throws ApiException {
        com.squareup.okhttp.Call call = getOptionsStatsRealtimeValidateBeforeCall(identifier, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsStatsRealtime>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Option Stats Realtime (asynchronously)
     * Returns all option stats (greeks and implied volatility) and factors used to calculate them, for a given option contract identifier.
     * @param identifier The Intrinio ID or code of the options contract to request prices for. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOptionsStatsRealtimeAsync(String identifier, String source, final ApiCallback<ApiResponseOptionsStatsRealtime> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOptionsStatsRealtimeValidateBeforeCall(identifier, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsStatsRealtime>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUnusualActivity
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUnusualActivityCall(String symbol, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options/unusual_activity/{symbol}"
            .replaceAll("\\{" + "symbol" + "\\}", apiClient.escapeString(symbol.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));

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
    private com.squareup.okhttp.Call getUnusualActivityValidateBeforeCall(String symbol, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new ApiException("Missing the required parameter 'symbol' when calling getUnusualActivity(Async)");
        }
        

        com.squareup.okhttp.Call call = getUnusualActivityCall(symbol, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Options Unusual Activity
     * Returns unusual trades for a given identifier.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponseOptionsUnusualActivity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseOptionsUnusualActivity getUnusualActivity(String symbol, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = OptionsApi.class.getMethod("getUnusualActivityWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { symbol, source };
      ApiResponse<ApiResponseOptionsUnusualActivity> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Options Unusual Activity
     * Returns unusual trades for a given identifier.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @return ApiResponse&lt;ApiResponseOptionsUnusualActivity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseOptionsUnusualActivity> getUnusualActivityWithHttpInfo(String symbol, String source) throws ApiException {
        com.squareup.okhttp.Call call = getUnusualActivityValidateBeforeCall(symbol, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsUnusualActivity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Options Unusual Activity (asynchronously)
     * Returns unusual trades for a given identifier.
     * @param symbol The option symbol, corresponding to the underlying security. (required)
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUnusualActivityAsync(String symbol, String source, final ApiCallback<ApiResponseOptionsUnusualActivity> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUnusualActivityValidateBeforeCall(symbol, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseOptionsUnusualActivity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
