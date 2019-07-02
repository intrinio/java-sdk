

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
import com.intrinio.models.ApiResponseOptionsExpirations;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
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
     */
    public ApiResponseOptions getOptions(String symbol, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String expiration, String expirationAfter, String expirationBefore, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseOptions> resp = getOptionsWithHttpInfo(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage);
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
     */
    public ApiResponseOptionsChain getOptionsChain(String symbol, String expiration, LocalDate date, String type, BigDecimal strike, BigDecimal strikeGreaterThan, BigDecimal strikeLessThan, String moneyness, Integer pageSize) throws ApiException {
        ApiResponse<ApiResponseOptionsChain> resp = getOptionsChainWithHttpInfo(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize);
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
     */
    public ApiResponseOptionsExpirations getOptionsExpirations(String symbol, String after, String before) throws ApiException {
        ApiResponse<ApiResponseOptionsExpirations> resp = getOptionsExpirationsWithHttpInfo(symbol, after, before);
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
     */
    public ApiResponseOptionPrices getOptionsPrices(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseOptionPrices> resp = getOptionsPricesWithHttpInfo(identifier, startDate, endDate, pageSize, nextPage);
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
}
