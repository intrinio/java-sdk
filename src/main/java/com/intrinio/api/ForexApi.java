

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


import com.intrinio.models.ApiResponseForexCurrencies;
import com.intrinio.models.ApiResponseForexPairs;
import com.intrinio.models.ApiResponseForexPrices;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForexApi {
    private ApiClient apiClient;

    public ForexApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ForexApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getForexCurrencies
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getForexCurrenciesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/forex/currencies";

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
    private com.squareup.okhttp.Call getForexCurrenciesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getForexCurrenciesCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Forex Currencies
     * Returns a list of forex currencies for which prices are available.
     * @return ApiResponseForexCurrencies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseForexCurrencies getForexCurrencies() throws ApiException {
        ApiResponse<ApiResponseForexCurrencies> resp = getForexCurrenciesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Forex Currencies
     * Returns a list of forex currencies for which prices are available.
     * @return ApiResponse&lt;ApiResponseForexCurrencies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseForexCurrencies> getForexCurrenciesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getForexCurrenciesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiResponseForexCurrencies>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Forex Currencies (asynchronously)
     * Returns a list of forex currencies for which prices are available.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getForexCurrenciesAsync(final ApiCallback<ApiResponseForexCurrencies> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getForexCurrenciesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseForexCurrencies>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getForexPairs
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getForexPairsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/forex/pairs";

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
    private com.squareup.okhttp.Call getForexPairsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getForexPairsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Forex Currency Pairs
     * Returns a list of currency pairs used to request foreign exchange (forex) market price data. The currency that is used as the reference is called quote currency and the currency that is quoted in relation is called the base currency. For example, in the pair code “EURGBP” with a price of 0.88, one Euro (base currency) can be exchanged for 0.88 British Pounds (quote currency).
     * @return ApiResponseForexPairs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseForexPairs getForexPairs() throws ApiException {
        ApiResponse<ApiResponseForexPairs> resp = getForexPairsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Forex Currency Pairs
     * Returns a list of currency pairs used to request foreign exchange (forex) market price data. The currency that is used as the reference is called quote currency and the currency that is quoted in relation is called the base currency. For example, in the pair code “EURGBP” with a price of 0.88, one Euro (base currency) can be exchanged for 0.88 British Pounds (quote currency).
     * @return ApiResponse&lt;ApiResponseForexPairs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseForexPairs> getForexPairsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getForexPairsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiResponseForexPairs>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Forex Currency Pairs (asynchronously)
     * Returns a list of currency pairs used to request foreign exchange (forex) market price data. The currency that is used as the reference is called quote currency and the currency that is quoted in relation is called the base currency. For example, in the pair code “EURGBP” with a price of 0.88, one Euro (base currency) can be exchanged for 0.88 British Pounds (quote currency).
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getForexPairsAsync(final ApiCallback<ApiResponseForexPairs> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getForexPairsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseForexPairs>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getForexPrices
     * @param pair The Forex Currency Pair code (required)
     * @param timeframe The time interval for the quotes (required)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param startDate Return Forex Prices on or after this date (optional)
     * @param startTime Return Forex Prices at or after this time (24-hour) (optional)
     * @param endDate Return Forex Prices on or before this date (optional)
     * @param endTime Return Forex Prices at or before this time (24-hour) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getForexPricesCall(String pair, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/forex/prices/{pair}/{timeframe}"
            .replaceAll("\\{" + "pair" + "\\}", apiClient.escapeString(pair.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (timeframe != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timeframe", timeframe));
        if (timezone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timezone", timezone));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
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
    private com.squareup.okhttp.Call getForexPricesValidateBeforeCall(String pair, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pair' is set
        if (pair == null) {
            throw new ApiException("Missing the required parameter 'pair' when calling getForexPrices(Async)");
        }
        
        // verify the required parameter 'timeframe' is set
        if (timeframe == null) {
            throw new ApiException("Missing the required parameter 'timeframe' when calling getForexPrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getForexPricesCall(pair, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Forex Currency Prices
     * Provides a list of forex price quotes for a given forex currency pair and timeframe.
     * @param pair The Forex Currency Pair code (required)
     * @param timeframe The time interval for the quotes (required)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param startDate Return Forex Prices on or after this date (optional)
     * @param startTime Return Forex Prices at or after this time (24-hour) (optional)
     * @param endDate Return Forex Prices on or before this date (optional)
     * @param endTime Return Forex Prices at or before this time (24-hour) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseForexPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseForexPrices getForexPrices(String pair, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseForexPrices> resp = getForexPricesWithHttpInfo(pair, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Forex Currency Prices
     * Provides a list of forex price quotes for a given forex currency pair and timeframe.
     * @param pair The Forex Currency Pair code (required)
     * @param timeframe The time interval for the quotes (required)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param startDate Return Forex Prices on or after this date (optional)
     * @param startTime Return Forex Prices at or after this time (24-hour) (optional)
     * @param endDate Return Forex Prices on or before this date (optional)
     * @param endTime Return Forex Prices at or before this time (24-hour) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseForexPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseForexPrices> getForexPricesWithHttpInfo(String pair, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getForexPricesValidateBeforeCall(pair, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseForexPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Forex Currency Prices (asynchronously)
     * Provides a list of forex price quotes for a given forex currency pair and timeframe.
     * @param pair The Forex Currency Pair code (required)
     * @param timeframe The time interval for the quotes (required)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param startDate Return Forex Prices on or after this date (optional)
     * @param startTime Return Forex Prices at or after this time (24-hour) (optional)
     * @param endDate Return Forex Prices on or before this date (optional)
     * @param endTime Return Forex Prices at or before this time (24-hour) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getForexPricesAsync(String pair, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseForexPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getForexPricesValidateBeforeCall(pair, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseForexPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
