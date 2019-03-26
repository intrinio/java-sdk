

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


import com.intrinio.models.ApiResponseCryptoBook;
import com.intrinio.models.ApiResponseCryptoBookAsks;
import com.intrinio.models.ApiResponseCryptoBookBids;
import com.intrinio.models.ApiResponseCryptoCurrencies;
import com.intrinio.models.ApiResponseCryptoExchanges;
import com.intrinio.models.ApiResponseCryptoPairs;
import com.intrinio.models.ApiResponseCryptoPrices;
import com.intrinio.models.ApiResponseCryptoSnapshot;
import com.intrinio.models.ApiResponseCryptoStats;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CryptoApi {
    private ApiClient apiClient;

    public CryptoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CryptoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCryptoBookAsks
     * @param pair Return the order book asks for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book asks for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book asks for the given Crypto Currency. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoBookAsksCall(String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/book/asks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

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
    private com.squareup.okhttp.Call getCryptoBookAsksValidateBeforeCall(String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoBookAsksCall(pair, exchange, currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Book Asks
     * Returns the entire ask order book for a given Crypto Currency Pair and Crypto Exchange.
     * @param pair Return the order book asks for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book asks for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book asks for the given Crypto Currency. (optional)
     * @return ApiResponseCryptoBookAsks
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoBookAsks getCryptoBookAsks(String pair, String exchange, String currency) throws ApiException {
        ApiResponse<ApiResponseCryptoBookAsks> resp = getCryptoBookAsksWithHttpInfo(pair, exchange, currency);
        return resp.getData();
    }

    /**
     * Crypto Book Asks
     * Returns the entire ask order book for a given Crypto Currency Pair and Crypto Exchange.
     * @param pair Return the order book asks for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book asks for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book asks for the given Crypto Currency. (optional)
     * @return ApiResponse&lt;ApiResponseCryptoBookAsks&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoBookAsks> getCryptoBookAsksWithHttpInfo(String pair, String exchange, String currency) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoBookAsksValidateBeforeCall(pair, exchange, currency, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBookAsks>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Book Asks (asynchronously)
     * Returns the entire ask order book for a given Crypto Currency Pair and Crypto Exchange.
     * @param pair Return the order book asks for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book asks for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book asks for the given Crypto Currency. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoBookAsksAsync(String pair, String exchange, String currency, final ApiCallback<ApiResponseCryptoBookAsks> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoBookAsksValidateBeforeCall(pair, exchange, currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBookAsks>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoBookBids
     * @param pair Return the order book bids for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book bids for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book bids for the given Crypto Currency. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoBookBidsCall(String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/book/bids";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

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
    private com.squareup.okhttp.Call getCryptoBookBidsValidateBeforeCall(String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoBookBidsCall(pair, exchange, currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Book Bids
     * Returns the entire bid order book for a given Crypto Currency Pair and Crypto Exchange.
     * @param pair Return the order book bids for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book bids for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book bids for the given Crypto Currency. (optional)
     * @return ApiResponseCryptoBookBids
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoBookBids getCryptoBookBids(String pair, String exchange, String currency) throws ApiException {
        ApiResponse<ApiResponseCryptoBookBids> resp = getCryptoBookBidsWithHttpInfo(pair, exchange, currency);
        return resp.getData();
    }

    /**
     * Crypto Book Bids
     * Returns the entire bid order book for a given Crypto Currency Pair and Crypto Exchange.
     * @param pair Return the order book bids for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book bids for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book bids for the given Crypto Currency. (optional)
     * @return ApiResponse&lt;ApiResponseCryptoBookBids&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoBookBids> getCryptoBookBidsWithHttpInfo(String pair, String exchange, String currency) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoBookBidsValidateBeforeCall(pair, exchange, currency, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBookBids>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Book Bids (asynchronously)
     * Returns the entire bid order book for a given Crypto Currency Pair and Crypto Exchange.
     * @param pair Return the order book bids for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book bids for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book bids for the given Crypto Currency. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoBookBidsAsync(String pair, String exchange, String currency, final ApiCallback<ApiResponseCryptoBookBids> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoBookBidsValidateBeforeCall(pair, exchange, currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBookBids>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoBookSummary
     * @param levels The number of prices/levels to return on each side. For example, the max of 50 levels will return up to 50 bid prices and 50 ask prices. (optional)
     * @param pair Return the order book summary for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book summary for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book summary for the given Crypto Currency. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoBookSummaryCall(Integer levels, String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/book";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (levels != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("levels", levels));
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

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
    private com.squareup.okhttp.Call getCryptoBookSummaryValidateBeforeCall(Integer levels, String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoBookSummaryCall(levels, pair, exchange, currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Book Summary
     * Returns the order book summary (bid/ask prices and size) for a given Crypto Currency Pair and Crypto Exchange.
     * @param levels The number of prices/levels to return on each side. For example, the max of 50 levels will return up to 50 bid prices and 50 ask prices. (optional)
     * @param pair Return the order book summary for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book summary for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book summary for the given Crypto Currency. (optional)
     * @return ApiResponseCryptoBook
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoBook getCryptoBookSummary(Integer levels, String pair, String exchange, String currency) throws ApiException {
        ApiResponse<ApiResponseCryptoBook> resp = getCryptoBookSummaryWithHttpInfo(levels, pair, exchange, currency);
        return resp.getData();
    }

    /**
     * Crypto Book Summary
     * Returns the order book summary (bid/ask prices and size) for a given Crypto Currency Pair and Crypto Exchange.
     * @param levels The number of prices/levels to return on each side. For example, the max of 50 levels will return up to 50 bid prices and 50 ask prices. (optional)
     * @param pair Return the order book summary for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book summary for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book summary for the given Crypto Currency. (optional)
     * @return ApiResponse&lt;ApiResponseCryptoBook&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoBook> getCryptoBookSummaryWithHttpInfo(Integer levels, String pair, String exchange, String currency) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoBookSummaryValidateBeforeCall(levels, pair, exchange, currency, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBook>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Book Summary (asynchronously)
     * Returns the order book summary (bid/ask prices and size) for a given Crypto Currency Pair and Crypto Exchange.
     * @param levels The number of prices/levels to return on each side. For example, the max of 50 levels will return up to 50 bid prices and 50 ask prices. (optional)
     * @param pair Return the order book summary for the given Crypto Currency Pair. (optional)
     * @param exchange Return the order book summary for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the order book summary for the given Crypto Currency. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoBookSummaryAsync(Integer levels, String pair, String exchange, String currency, final ApiCallback<ApiResponseCryptoBook> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoBookSummaryValidateBeforeCall(levels, pair, exchange, currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBook>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoCurrencies
     * @param exchange Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoCurrenciesCall(String exchange, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/currencies";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));

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
    private com.squareup.okhttp.Call getCryptoCurrenciesValidateBeforeCall(String exchange, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoCurrenciesCall(exchange, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Currencies
     * Returns a list of Crypto Currencies for which prices are available.
     * @param exchange Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @return ApiResponseCryptoCurrencies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoCurrencies getCryptoCurrencies(String exchange) throws ApiException {
        ApiResponse<ApiResponseCryptoCurrencies> resp = getCryptoCurrenciesWithHttpInfo(exchange);
        return resp.getData();
    }

    /**
     * Crypto Currencies
     * Returns a list of Crypto Currencies for which prices are available.
     * @param exchange Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @return ApiResponse&lt;ApiResponseCryptoCurrencies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoCurrencies> getCryptoCurrenciesWithHttpInfo(String exchange) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoCurrenciesValidateBeforeCall(exchange, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoCurrencies>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Currencies (asynchronously)
     * Returns a list of Crypto Currencies for which prices are available.
     * @param exchange Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoCurrenciesAsync(String exchange, final ApiCallback<ApiResponseCryptoCurrencies> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoCurrenciesValidateBeforeCall(exchange, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoCurrencies>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoExchanges
     * @param pair Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoExchangesCall(String pair, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/exchanges";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));

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
    private com.squareup.okhttp.Call getCryptoExchangesValidateBeforeCall(String pair, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoExchangesCall(pair, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Exchanges
     * Returns a list of Crypto Exchanges for which prices are available.
     * @param pair Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @return ApiResponseCryptoExchanges
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoExchanges getCryptoExchanges(String pair) throws ApiException {
        ApiResponse<ApiResponseCryptoExchanges> resp = getCryptoExchangesWithHttpInfo(pair);
        return resp.getData();
    }

    /**
     * Crypto Exchanges
     * Returns a list of Crypto Exchanges for which prices are available.
     * @param pair Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @return ApiResponse&lt;ApiResponseCryptoExchanges&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoExchanges> getCryptoExchangesWithHttpInfo(String pair) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoExchangesValidateBeforeCall(pair, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoExchanges>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Exchanges (asynchronously)
     * Returns a list of Crypto Exchanges for which prices are available.
     * @param pair Returns Crypto Currencies traded on the given Crypto Exchange. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoExchangesAsync(String pair, final ApiCallback<ApiResponseCryptoExchanges> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoExchangesValidateBeforeCall(pair, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoExchanges>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPairs
     * @param exchange Return pairs traded on the given Crypto Exchange. (optional)
     * @param currency Return pairs with one side being the given Crypto Currency. (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPairsCall(String exchange, String currency, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/pairs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPairsValidateBeforeCall(String exchange, String currency, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPairsCall(exchange, currency, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Pairs
     * Returns a list of Crypto Currency Pairs for which data is available.
     * @param exchange Return pairs traded on the given Crypto Exchange. (optional)
     * @param currency Return pairs with one side being the given Crypto Currency. (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoPairs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoPairs getCryptoPairs(String exchange, String currency, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoPairs> resp = getCryptoPairsWithHttpInfo(exchange, currency, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Crypto Pairs
     * Returns a list of Crypto Currency Pairs for which data is available.
     * @param exchange Return pairs traded on the given Crypto Exchange. (optional)
     * @param currency Return pairs with one side being the given Crypto Currency. (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoPairs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoPairs> getCryptoPairsWithHttpInfo(String exchange, String currency, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPairsValidateBeforeCall(exchange, currency, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoPairs>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Pairs (asynchronously)
     * Returns a list of Crypto Currency Pairs for which data is available.
     * @param exchange Return pairs traded on the given Crypto Exchange. (optional)
     * @param currency Return pairs with one side being the given Crypto Currency. (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPairsAsync(String exchange, String currency, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoPairs> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPairsValidateBeforeCall(exchange, currency, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoPairs>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPrices
     * @param timeframe The time interval for the prices. (required)
     * @param pair Return prices for the given Crypto Currency Pair. (optional)
     * @param exchange Return prices for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return prices for the given Crypto Currency. (optional)
     * @param timezone Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return Crypto Prices on or after this date. (optional)
     * @param startTime Return Crypto Prices at or after this time (24-hour). (optional)
     * @param endDate Return Crypto Prices on or before this date. (optional)
     * @param endTime Return Crypto Prices at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPricesCall(String timeframe, String pair, String exchange, String currency, String timezone, String startDate, String startTime, String endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices"
            .replaceAll("\\{" + "timeframe" + "\\}", apiClient.escapeString(timeframe.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPricesValidateBeforeCall(String timeframe, String pair, String exchange, String currency, String timezone, String startDate, String startTime, String endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'timeframe' is set
        if (timeframe == null) {
            throw new ApiException("Missing the required parameter 'timeframe' when calling getCryptoPrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getCryptoPricesCall(timeframe, pair, exchange, currency, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Prices
     * Returns a list of available Crypto Currency Prices.
     * @param timeframe The time interval for the prices. (required)
     * @param pair Return prices for the given Crypto Currency Pair. (optional)
     * @param exchange Return prices for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return prices for the given Crypto Currency. (optional)
     * @param timezone Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return Crypto Prices on or after this date. (optional)
     * @param startTime Return Crypto Prices at or after this time (24-hour). (optional)
     * @param endDate Return Crypto Prices on or before this date. (optional)
     * @param endTime Return Crypto Prices at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoPrices getCryptoPrices(String timeframe, String pair, String exchange, String currency, String timezone, String startDate, String startTime, String endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoPrices> resp = getCryptoPricesWithHttpInfo(timeframe, pair, exchange, currency, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Crypto Prices
     * Returns a list of available Crypto Currency Prices.
     * @param timeframe The time interval for the prices. (required)
     * @param pair Return prices for the given Crypto Currency Pair. (optional)
     * @param exchange Return prices for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return prices for the given Crypto Currency. (optional)
     * @param timezone Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return Crypto Prices on or after this date. (optional)
     * @param startTime Return Crypto Prices at or after this time (24-hour). (optional)
     * @param endDate Return Crypto Prices on or before this date. (optional)
     * @param endTime Return Crypto Prices at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoPrices> getCryptoPricesWithHttpInfo(String timeframe, String pair, String exchange, String currency, String timezone, String startDate, String startTime, String endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPricesValidateBeforeCall(timeframe, pair, exchange, currency, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Prices (asynchronously)
     * Returns a list of available Crypto Currency Prices.
     * @param timeframe The time interval for the prices. (required)
     * @param pair Return prices for the given Crypto Currency Pair. (optional)
     * @param exchange Return prices for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return prices for the given Crypto Currency. (optional)
     * @param timezone Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return Crypto Prices on or after this date. (optional)
     * @param startTime Return Crypto Prices at or after this time (24-hour). (optional)
     * @param endDate Return Crypto Prices on or before this date. (optional)
     * @param endTime Return Crypto Prices at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPricesAsync(String timeframe, String pair, String exchange, String currency, String timezone, String startDate, String startTime, String endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPricesValidateBeforeCall(timeframe, pair, exchange, currency, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoSnapshot
     * @param pair Return the snapshot for the given Crypto Currency Pair. (optional)
     * @param exchange Return the snapshot for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the snapshot for the given Crypto Currency. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoSnapshotCall(String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/snapshot";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

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
    private com.squareup.okhttp.Call getCryptoSnapshotValidateBeforeCall(String pair, String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoSnapshotCall(pair, exchange, currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Snapshot
     * Returns a market snapshot over that last 24 hours for the given currency pair and exchange.
     * @param pair Return the snapshot for the given Crypto Currency Pair. (optional)
     * @param exchange Return the snapshot for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the snapshot for the given Crypto Currency. (optional)
     * @return ApiResponseCryptoSnapshot
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoSnapshot getCryptoSnapshot(String pair, String exchange, String currency) throws ApiException {
        ApiResponse<ApiResponseCryptoSnapshot> resp = getCryptoSnapshotWithHttpInfo(pair, exchange, currency);
        return resp.getData();
    }

    /**
     * Crypto Snapshot
     * Returns a market snapshot over that last 24 hours for the given currency pair and exchange.
     * @param pair Return the snapshot for the given Crypto Currency Pair. (optional)
     * @param exchange Return the snapshot for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the snapshot for the given Crypto Currency. (optional)
     * @return ApiResponse&lt;ApiResponseCryptoSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoSnapshot> getCryptoSnapshotWithHttpInfo(String pair, String exchange, String currency) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoSnapshotValidateBeforeCall(pair, exchange, currency, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoSnapshot>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Snapshot (asynchronously)
     * Returns a market snapshot over that last 24 hours for the given currency pair and exchange.
     * @param pair Return the snapshot for the given Crypto Currency Pair. (optional)
     * @param exchange Return the snapshot for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return the snapshot for the given Crypto Currency. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoSnapshotAsync(String pair, String exchange, String currency, final ApiCallback<ApiResponseCryptoSnapshot> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoSnapshotValidateBeforeCall(pair, exchange, currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoSnapshot>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoStats
     * @param exchange Returns stats for Crypto Currencies that trade on the specified Crypto Exchange. (optional)
     * @param currency Returns stats for the specified Crypto Currency. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoStatsCall(String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/stats";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

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
    private com.squareup.okhttp.Call getCryptoStatsValidateBeforeCall(String exchange, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoStatsCall(exchange, currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Crypto Stats
     * Returns available stats on Crypto Currencies.
     * @param exchange Returns stats for Crypto Currencies that trade on the specified Crypto Exchange. (optional)
     * @param currency Returns stats for the specified Crypto Currency. (optional)
     * @return ApiResponseCryptoStats
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoStats getCryptoStats(String exchange, String currency) throws ApiException {
        ApiResponse<ApiResponseCryptoStats> resp = getCryptoStatsWithHttpInfo(exchange, currency);
        return resp.getData();
    }

    /**
     * Crypto Stats
     * Returns available stats on Crypto Currencies.
     * @param exchange Returns stats for Crypto Currencies that trade on the specified Crypto Exchange. (optional)
     * @param currency Returns stats for the specified Crypto Currency. (optional)
     * @return ApiResponse&lt;ApiResponseCryptoStats&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoStats> getCryptoStatsWithHttpInfo(String exchange, String currency) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoStatsValidateBeforeCall(exchange, currency, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoStats>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Crypto Stats (asynchronously)
     * Returns available stats on Crypto Currencies.
     * @param exchange Returns stats for Crypto Currencies that trade on the specified Crypto Exchange. (optional)
     * @param currency Returns stats for the specified Crypto Currency. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoStatsAsync(String exchange, String currency, final ApiCallback<ApiResponseCryptoStats> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoStatsValidateBeforeCall(exchange, currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoStats>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
