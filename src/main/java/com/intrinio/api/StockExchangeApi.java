

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


import com.intrinio.models.ApiResponseStockExchangeBetas;
import com.intrinio.models.ApiResponseStockExchangeMovers;
import com.intrinio.models.ApiResponseStockExchangeQuote;
import com.intrinio.models.ApiResponseStockExchangeRealtimeStockPrices;
import com.intrinio.models.ApiResponseStockExchangeSecurities;
import com.intrinio.models.ApiResponseStockExchangeStockPriceAdjustments;
import com.intrinio.models.ApiResponseStockExchangeStockPrices;
import com.intrinio.models.ApiResponseStockExchanges;
import java.math.BigDecimal;
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
     * Build call for getStockExchangeBetas
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param type Only of the given type (optional, default to weekly)
     * @param date Return data for this period end date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeBetasCall(String identifier, String type, Object date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/betas"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
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
    private com.squareup.okhttp.Call getStockExchangeBetasValidateBeforeCall(String identifier, String type, Object date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeBetas(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeBetasCall(identifier, type, date, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security Betas
     * Returns security beta data in the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param type Only of the given type (optional, default to weekly)
     * @param date Return data for this period end date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeBetas
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeBetas getStockExchangeBetas(String identifier, String type, Object date, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeBetasWithHttpInfo", String.class, String.class, Object.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, type, date, pageSize, nextPage };
      ApiResponse<ApiResponseStockExchangeBetas> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security Betas
     * Returns security beta data in the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param type Only of the given type (optional, default to weekly)
     * @param date Return data for this period end date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeBetas&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeBetas> getStockExchangeBetasWithHttpInfo(String identifier, String type, Object date, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeBetasValidateBeforeCall(identifier, type, date, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeBetas>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security Betas (asynchronously)
     * Returns security beta data in the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param type Only of the given type (optional, default to weekly)
     * @param date Return data for this period end date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeBetasAsync(String identifier, String type, Object date, Integer pageSize, String nextPage, final ApiCallback<ApiResponseStockExchangeBetas> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeBetasValidateBeforeCall(identifier, type, date, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeBetas>(){}.getType();
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
     * Build call for getStockExchangeGainers
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeGainersCall(String identifier, BigDecimal minPrice, Integer pageSize, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/gainers"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (minPrice != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("min_price", minPrice));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
    private com.squareup.okhttp.Call getStockExchangeGainersValidateBeforeCall(String identifier, BigDecimal minPrice, Integer pageSize, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeGainers(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeGainersCall(identifier, minPrice, pageSize, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Top Gainers by Exchange
     * Returns securities with the highest gain percent change traded on the chosen stock exchange.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @return ApiResponseStockExchangeMovers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeMovers getStockExchangeGainers(String identifier, BigDecimal minPrice, Integer pageSize, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeGainersWithHttpInfo", String.class, BigDecimal.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, minPrice, pageSize, source };
      ApiResponse<ApiResponseStockExchangeMovers> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Top Gainers by Exchange
     * Returns securities with the highest gain percent change traded on the chosen stock exchange.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeMovers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeMovers> getStockExchangeGainersWithHttpInfo(String identifier, BigDecimal minPrice, Integer pageSize, String source) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeGainersValidateBeforeCall(identifier, minPrice, pageSize, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeMovers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Top Gainers by Exchange (asynchronously)
     * Returns securities with the highest gain percent change traded on the chosen stock exchange.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeGainersAsync(String identifier, BigDecimal minPrice, Integer pageSize, String source, final ApiCallback<ApiResponseStockExchangeMovers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeGainersValidateBeforeCall(identifier, minPrice, pageSize, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeMovers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangeLosers
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeLosersCall(String identifier, BigDecimal minPrice, Integer pageSize, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/losers"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (minPrice != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("min_price", minPrice));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
    private com.squareup.okhttp.Call getStockExchangeLosersValidateBeforeCall(String identifier, BigDecimal minPrice, Integer pageSize, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeLosers(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeLosersCall(identifier, minPrice, pageSize, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Top Losers by Exchange
     * Returns securities with the highest loss percent change traded on the chosen stock exchange.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @return ApiResponseStockExchangeMovers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeMovers getStockExchangeLosers(String identifier, BigDecimal minPrice, Integer pageSize, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeLosersWithHttpInfo", String.class, BigDecimal.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, minPrice, pageSize, source };
      ApiResponse<ApiResponseStockExchangeMovers> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Top Losers by Exchange
     * Returns securities with the highest loss percent change traded on the chosen stock exchange.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeMovers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeMovers> getStockExchangeLosersWithHttpInfo(String identifier, BigDecimal minPrice, Integer pageSize, String source) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeLosersValidateBeforeCall(identifier, minPrice, pageSize, source, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeMovers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Top Losers by Exchange (asynchronously)
     * Returns securities with the highest loss percent change traded on the chosen stock exchange.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param minPrice The minimum price filter (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeLosersAsync(String identifier, BigDecimal minPrice, Integer pageSize, String source, final ApiCallback<ApiResponseStockExchangeMovers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeLosersValidateBeforeCall(identifier, minPrice, pageSize, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeMovers>(){}.getType();
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
     * Build call for getStockExchangePriceAdjustmentsDividends
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return dividends (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePriceAdjustmentsDividendsCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/prices/adjustments/dividends"
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
    private com.squareup.okhttp.Call getStockExchangePriceAdjustmentsDividendsValidateBeforeCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangePriceAdjustmentsDividends(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsDividendsCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Dividends by date for exchange
     * Returns dividend adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return dividends (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeStockPriceAdjustments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeStockPriceAdjustments getStockExchangePriceAdjustmentsDividends(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangePriceAdjustmentsDividendsWithHttpInfo", String.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, date, pageSize, nextPage };
      ApiResponse<ApiResponseStockExchangeStockPriceAdjustments> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Dividends by date for exchange
     * Returns dividend adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return dividends (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeStockPriceAdjustments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeStockPriceAdjustments> getStockExchangePriceAdjustmentsDividendsWithHttpInfo(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsDividendsValidateBeforeCall(identifier, date, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPriceAdjustments>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Dividends by date for exchange (asynchronously)
     * Returns dividend adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return dividends (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePriceAdjustmentsDividendsAsync(String identifier, LocalDate date, Integer pageSize, String nextPage, final ApiCallback<ApiResponseStockExchangeStockPriceAdjustments> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsDividendsValidateBeforeCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPriceAdjustments>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangePriceAdjustmentsSplits
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return splits (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePriceAdjustmentsSplitsCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/prices/adjustments/splits"
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
    private com.squareup.okhttp.Call getStockExchangePriceAdjustmentsSplitsValidateBeforeCall(String identifier, LocalDate date, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangePriceAdjustmentsSplits(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsSplitsCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Splits by date for exchange
     * Returns split adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return splits (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeStockPriceAdjustments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeStockPriceAdjustments getStockExchangePriceAdjustmentsSplits(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangePriceAdjustmentsSplitsWithHttpInfo", String.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, date, pageSize, nextPage };
      ApiResponse<ApiResponseStockExchangeStockPriceAdjustments> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Splits by date for exchange
     * Returns split adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return splits (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeStockPriceAdjustments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeStockPriceAdjustments> getStockExchangePriceAdjustmentsSplitsWithHttpInfo(String identifier, LocalDate date, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsSplitsValidateBeforeCall(identifier, date, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPriceAdjustments>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Splits by date for exchange (asynchronously)
     * Returns split adjustments for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return splits (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePriceAdjustmentsSplitsAsync(String identifier, LocalDate date, Integer pageSize, String nextPage, final ApiCallback<ApiResponseStockExchangeStockPriceAdjustments> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangePriceAdjustmentsSplitsValidateBeforeCall(identifier, date, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPriceAdjustments>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangePrices
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices. May not be used with the start_date and end_date parameters. (optional)
     * @param startDate The start of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param endDate The end of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param tickers The comma-delimited list of ticker symbols to filter down to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePricesCall(String identifier, LocalDate date, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, List<String> tickers, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/prices"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));
        if (tickers != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "tickers", tickers));
        if (nextPage2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage2));

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
    private com.squareup.okhttp.Call getStockExchangePricesValidateBeforeCall(String identifier, LocalDate date, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, List<String> tickers, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangePrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangePricesCall(identifier, date, startDate, endDate, pageSize, nextPage, tickers, nextPage2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Stock Prices by Exchange
     * Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices. May not be used with the start_date and end_date parameters. (optional)
     * @param startDate The start of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param endDate The end of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param tickers The comma-delimited list of ticker symbols to filter down to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeStockPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeStockPrices getStockExchangePrices(String identifier, LocalDate date, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, List<String> tickers, String nextPage2) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangePricesWithHttpInfo", String.class, LocalDate.class, LocalDate.class, LocalDate.class, Integer.class, String.class, List.class, String.class);
      
      Object[] apiCallArguments = { identifier, date, startDate, endDate, pageSize, nextPage, tickers, nextPage2 };
      ApiResponse<ApiResponseStockExchangeStockPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Stock Prices by Exchange
     * Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices. May not be used with the start_date and end_date parameters. (optional)
     * @param startDate The start of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param endDate The end of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param tickers The comma-delimited list of ticker symbols to filter down to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeStockPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeStockPrices> getStockExchangePricesWithHttpInfo(String identifier, LocalDate date, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, List<String> tickers, String nextPage2) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangePricesValidateBeforeCall(identifier, date, startDate, endDate, pageSize, nextPage, tickers, nextPage2, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Stock Prices by Exchange (asynchronously)
     * Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param date The date for which to return prices. May not be used with the start_date and end_date parameters. (optional)
     * @param startDate The start of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param endDate The end of the date range you&#39;re querying. May not be used with date parameter. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param tickers The comma-delimited list of ticker symbols to filter down to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangePricesAsync(String identifier, LocalDate date, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, List<String> tickers, String nextPage2, final ApiCallback<ApiResponseStockExchangeStockPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangePricesValidateBeforeCall(identifier, date, startDate, endDate, pageSize, nextPage, tickers, nextPage2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeStockPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangeQuote
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param tickers The comma-delimited list of ticker symbols to return quotes for. (required)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeQuoteCall(String identifier, List<String> tickers, String source, Boolean activeOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/quote"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (activeOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("active_only", activeOnly));
        if (tickers != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "tickers", tickers));

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
    private com.squareup.okhttp.Call getStockExchangeQuoteValidateBeforeCall(String identifier, List<String> tickers, String source, Boolean activeOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeQuote(Async)");
        }
        
        // verify the required parameter 'tickers' is set
        if (tickers == null) {
            throw new ApiException("Missing the required parameter 'tickers' when calling getStockExchangeQuote(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeQuoteCall(identifier, tickers, source, activeOnly, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Realtime Quote Prices by Exchange
     * Returns many popular metrics for securities from a given exchange &#39;identifier&#39; from multiple products conveniently in one API. Realtime stock price data requires at least one realtime product subscription (IEX, NASDAQ Basic, and/or Delayed SIP).  If you are subscribed to multiple realtime stock price products, the api will return the most recent realtime stock price. Previous close price and percent change fields require both an EoD US Stock Price subscription and a realtime stock price subscription. Market_cap, price_to_earnings, and dividendyield data fields require a fundamentals subscription.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param tickers The comma-delimited list of ticker symbols to return quotes for. (required)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @return ApiResponseStockExchangeQuote
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeQuote getStockExchangeQuote(String identifier, List<String> tickers, String source, Boolean activeOnly) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeQuoteWithHttpInfo", String.class, List.class, String.class, Boolean.class);
      
      Object[] apiCallArguments = { identifier, tickers, source, activeOnly };
      ApiResponse<ApiResponseStockExchangeQuote> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Realtime Quote Prices by Exchange
     * Returns many popular metrics for securities from a given exchange &#39;identifier&#39; from multiple products conveniently in one API. Realtime stock price data requires at least one realtime product subscription (IEX, NASDAQ Basic, and/or Delayed SIP).  If you are subscribed to multiple realtime stock price products, the api will return the most recent realtime stock price. Previous close price and percent change fields require both an EoD US Stock Price subscription and a realtime stock price subscription. Market_cap, price_to_earnings, and dividendyield data fields require a fundamentals subscription.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param tickers The comma-delimited list of ticker symbols to return quotes for. (required)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeQuote&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeQuote> getStockExchangeQuoteWithHttpInfo(String identifier, List<String> tickers, String source, Boolean activeOnly) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeQuoteValidateBeforeCall(identifier, tickers, source, activeOnly, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeQuote>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Realtime Quote Prices by Exchange (asynchronously)
     * Returns many popular metrics for securities from a given exchange &#39;identifier&#39; from multiple products conveniently in one API. Realtime stock price data requires at least one realtime product subscription (IEX, NASDAQ Basic, and/or Delayed SIP).  If you are subscribed to multiple realtime stock price products, the api will return the most recent realtime stock price. Previous close price and percent change fields require both an EoD US Stock Price subscription and a realtime stock price subscription. Market_cap, price_to_earnings, and dividendyield data fields require a fundamentals subscription.
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param tickers The comma-delimited list of ticker symbols to return quotes for. (required)
     * @param source Return the realtime price from the specified source instead of the most recent. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeQuoteAsync(String identifier, List<String> tickers, String source, Boolean activeOnly, final ApiCallback<ApiResponseStockExchangeQuote> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeQuoteValidateBeforeCall(identifier, tickers, source, activeOnly, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeQuote>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getStockExchangeRealtimePrices
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified comma-delimited data sources. If no source is specified, all sources available to user are used. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @param tradedToday Returns prices only from securities which have traded on the most recent trading day. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param tickers The comma-delimited list of ticker symbols to filter to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeRealtimePricesCall(String identifier, List<String> source, Boolean activeOnly, Boolean tradedToday, Integer pageSize, List<String> tickers, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stock_exchanges/{identifier}/prices/realtime"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "source", source));
        if (activeOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("active_only", activeOnly));
        if (tradedToday != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("traded_today", tradedToday));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (tickers != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "tickers", tickers));
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
    private com.squareup.okhttp.Call getStockExchangeRealtimePricesValidateBeforeCall(String identifier, List<String> source, Boolean activeOnly, Boolean tradedToday, Integer pageSize, List<String> tickers, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getStockExchangeRealtimePrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getStockExchangeRealtimePricesCall(identifier, source, activeOnly, tradedToday, pageSize, tickers, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Realtime Stock Prices by Exchange
     * Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified comma-delimited data sources. If no source is specified, all sources available to user are used. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @param tradedToday Returns prices only from securities which have traded on the most recent trading day. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param tickers The comma-delimited list of ticker symbols to filter to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseStockExchangeRealtimeStockPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseStockExchangeRealtimeStockPrices getStockExchangeRealtimePrices(String identifier, List<String> source, Boolean activeOnly, Boolean tradedToday, Integer pageSize, List<String> tickers, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = StockExchangeApi.class.getMethod("getStockExchangeRealtimePricesWithHttpInfo", String.class, List.class, Boolean.class, Boolean.class, Integer.class, List.class, String.class);
      
      Object[] apiCallArguments = { identifier, source, activeOnly, tradedToday, pageSize, tickers, nextPage };
      ApiResponse<ApiResponseStockExchangeRealtimeStockPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Realtime Stock Prices by Exchange
     * Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified comma-delimited data sources. If no source is specified, all sources available to user are used. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @param tradedToday Returns prices only from securities which have traded on the most recent trading day. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param tickers The comma-delimited list of ticker symbols to filter to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseStockExchangeRealtimeStockPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseStockExchangeRealtimeStockPrices> getStockExchangeRealtimePricesWithHttpInfo(String identifier, List<String> source, Boolean activeOnly, Boolean tradedToday, Integer pageSize, List<String> tickers, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getStockExchangeRealtimePricesValidateBeforeCall(identifier, source, activeOnly, tradedToday, pageSize, tickers, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseStockExchangeRealtimeStockPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Realtime Stock Prices by Exchange (asynchronously)
     * Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;
     * @param identifier A Stock Exchange identifier (MIC or Intrinio ID) (required)
     * @param source Return realtime prices from the specified comma-delimited data sources. If no source is specified, all sources available to user are used. (optional)
     * @param activeOnly Returns prices only from the most recent trading day. (optional)
     * @param tradedToday Returns prices only from securities which have traded on the most recent trading day. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param tickers The comma-delimited list of ticker symbols to filter to. If not provided, the entire stock exchange is returned. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStockExchangeRealtimePricesAsync(String identifier, List<String> source, Boolean activeOnly, Boolean tradedToday, Integer pageSize, List<String> tickers, String nextPage, final ApiCallback<ApiResponseStockExchangeRealtimeStockPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStockExchangeRealtimePricesValidateBeforeCall(identifier, source, activeOnly, tradedToday, pageSize, tickers, nextPage, progressListener, progressRequestListener);
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
