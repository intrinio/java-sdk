

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


import com.intrinio.models.ApiResponseStockExchangeRealtimeStockPrices;
import com.intrinio.models.ApiResponseStockExchangeSecurities;
import com.intrinio.models.ApiResponseStockExchangeStockPriceAdjustments;
import com.intrinio.models.ApiResponseStockExchangeStockPrices;
import com.intrinio.models.ApiResponseStockExchanges;
import org.threeten.bp.LocalDate;
import com.intrinio.models.StockExchange;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchangeApi {
    private ApiClient apiClient;

    public StockExchangeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StockExchangeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllStockExchanges
     * @param city Filter by city (optional)
     * @param country Filter by country (optional)
     * @param countryCode Filter by ISO country code (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllStockExchangesCall(String city, String country, String countryCode, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("city", city));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("country", country));
        if (countryCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("country_code", countryCode));
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
    private com.squareup.okhttp.Call getAllStockExchangesValidateBeforeCall(String city, String country, String countryCode, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllStockExchangesCall(city, country, countryCode, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Stock Exchanges
     * Returns all Stock Exchanges matching the specified parameters
     * @param city Filter by city (optional)
     * @param country Filter by country (optional)
     * @param countryCode Filter by ISO country code (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponseStockExchanges
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchanges getAllStockExchanges(String city, String country, String countryCode, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getAllStockExchangesWithHttpInfo", String.class, String.class, String.class, Integer.class);
      
      Object[] apiCallArguments = { city, country, countryCode, pageSize };
      ApiResponse<ApiResponseStockExchanges> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Stock Exchanges
     * Returns all Stock Exchanges matching the specified parameters
     * @param city Filter by city (optional)
     * @param country Filter by country (optional)
     * @param countryCode Filter by ISO country code (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponse&lt;ApiResponseStockExchanges&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchanges> getAllStockExchangesWithHttpInfo(String city, String country, String countryCode, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getAllStockExchangesValidateBeforeCall(city, country, countryCode, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchanges>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Stock Exchanges (asynchronously)
     * Returns all Stock Exchanges matching the specified parameters
     * @param city Filter by city (optional)
     * @param country Filter by country (optional)
     * @param countryCode Filter by ISO country code (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllStockExchangesAsync(String city, String country, String countryCode, Integer pageSize, final ApiCallback<ApiResponseStockExchanges> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllStockExchangesValidateBeforeCall(city, country, countryCode, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchanges>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangeById
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}"
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
    private com.squareup.okhttp.Call getStockExchangeByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeById(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lookup Stock Exchange
     * Returns the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @return StockExchange
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public StockExchange getStockExchangeById(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeByIdWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<StockExchange> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Lookup Stock Exchange
     * Returns the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @return ApiResponse&lt;StockExchange&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StockExchange> getStockExchangeByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<StockExchange>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lookup Stock Exchange (asynchronously)
     * Returns the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeByIdAsync(String identifier, final ApiCallback<StockExchange> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StockExchange>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangePriceAdjustments
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return price adjustments (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePriceAdjustmentsCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/prices/adjustments"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));
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
    private com.squareup.okhttp.Call getStockExchangePriceAdjustmentsValidateBeforeCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangePriceAdjustments(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Stock Price Adjustments by Exchange
     * Returns stock price adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return price adjustments (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeStockPriceAdjustments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeStockPriceAdjustments getStockExchangePriceAdjustments(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangePriceAdjustmentsWithHttpInfo", String.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, date, pageSize, nextPage };
      ApiResponse<ApiResponseStockExchangeStockPriceAdjustments> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Stock Price Adjustments by Exchange
     * Returns stock price adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return price adjustments (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeStockPriceAdjustments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeStockPriceAdjustments> getStockExchangePriceAdjustmentsWithHttpInfo(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsValidateBeforeCall(identifier, date, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPriceAdjustments>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Stock Price Adjustments by Exchange (asynchronously)
     * Returns stock price adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return price adjustments (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePriceAdjustmentsAsync(String identifier, LocalDate date, Integer pageSize, String nextPage, final ApiCallback<ApiResponseStockExchangeStockPriceAdjustments> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsValidateBeforeCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPriceAdjustments>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangePrices
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePricesCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/prices"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));
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
    private com.squareup.okhttp.Call getStockExchangePricesValidateBeforeCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangePrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangePricesCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Stock Prices by Exchange
     * Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeStockPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeStockPrices getStockExchangePrices(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangePricesWithHttpInfo", String.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, date, pageSize, nextPage };
      ApiResponse<ApiResponseStockExchangeStockPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Stock Prices by Exchange
     * Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeStockPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeStockPrices> getStockExchangePricesWithHttpInfo(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangePricesValidateBeforeCall(identifier, date, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Stock Prices by Exchange (asynchronously)
     * Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePricesAsync(String identifier, LocalDate date, Integer pageSize, String nextPage, final ApiCallback<ApiResponseStockExchangeStockPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangePricesValidateBeforeCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangeRealtimePrices
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified data source. If no source is specified, all sources are used. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeRealtimePricesCall(String identifier, String source, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/prices/realtime"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
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
    private com.squareup.okhttp.Call getStockExchangeRealtimePricesValidateBeforeCall(String identifier, String source, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeRealtimePrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeRealtimePricesCall(identifier, source, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Realtime Stock Prices by Exchange
     * Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified data source. If no source is specified, all sources are used. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeRealtimeStockPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeRealtimeStockPrices getStockExchangeRealtimePrices(String identifier, String source, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeRealtimePricesWithHttpInfo", String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, source, pageSize, nextPage };
      ApiResponse<ApiResponseStockExchangeRealtimeStockPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Realtime Stock Prices by Exchange
     * Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified data source. If no source is specified, all sources are used. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeRealtimeStockPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeRealtimeStockPrices> getStockExchangeRealtimePricesWithHttpInfo(String identifier, String source, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeRealtimePricesValidateBeforeCall(identifier, source, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeRealtimeStockPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Realtime Stock Prices by Exchange (asynchronously)
     * Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified data source. If no source is specified, all sources are used. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeRealtimePricesAsync(String identifier, String source, Integer pageSize, String nextPage, final ApiCallback<ApiResponseStockExchangeRealtimeStockPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeRealtimePricesValidateBeforeCall(identifier, source, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeRealtimeStockPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangeSecurities
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeSecuritiesCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/securities"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getStockExchangeSecuritiesValidateBeforeCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeSecurities(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeSecuritiesCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Securities by Exchange
     * Returns Securities traded on the Stock Exchange with &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeSecurities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeSecurities getStockExchangeSecurities(String identifier, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeSecuritiesWithHttpInfo", String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, pageSize, nextPage };
      ApiResponse<ApiResponseStockExchangeSecurities> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Securities by Exchange
     * Returns Securities traded on the Stock Exchange with &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeSecurities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeSecurities> getStockExchangeSecuritiesWithHttpInfo(String identifier, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeSecuritiesValidateBeforeCall(identifier, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeSecurities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Securities by Exchange (asynchronously)
     * Returns Securities traded on the Stock Exchange with &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeSecuritiesAsync(String identifier, Integer pageSize, String nextPage, final ApiCallback<ApiResponseStockExchangeSecurities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeSecuritiesValidateBeforeCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeSecurities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
