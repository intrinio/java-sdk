

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


import com.intrinio.models.ApiResponseSecurityAccumulationDistributionIndex;
import com.intrinio.models.ApiResponseSecurityAverageDailyTradingVolume;
import com.intrinio.models.ApiResponseSecurityAverageDirectionalIndex;
import com.intrinio.models.ApiResponseSecurityAverageTrueRange;
import com.intrinio.models.ApiResponseSecurityAwesomeOscillator;
import com.intrinio.models.ApiResponseSecurityBollingerBands;
import com.intrinio.models.ApiResponseSecurityChaikinMoneyFlow;
import com.intrinio.models.ApiResponseSecurityCommodityChannelIndex;
import com.intrinio.models.ApiResponseSecurityDetrendedPriceOscillator;
import com.intrinio.models.ApiResponseSecurityDonchianChannel;
import com.intrinio.models.ApiResponseSecurityEaseOfMovement;
import com.intrinio.models.ApiResponseSecurityForceIndex;
import com.intrinio.models.ApiResponseSecurityIchimokuKinkoHyo;
import com.intrinio.models.ApiResponseSecurityKeltnerChannel;
import com.intrinio.models.ApiResponseSecurityKnowSureThing;
import com.intrinio.models.ApiResponseSecurityMassIndex;
import com.intrinio.models.ApiResponseSecurityMoneyFlowIndex;
import com.intrinio.models.ApiResponseSecurityMovingAverageConvergenceDivergence;
import com.intrinio.models.ApiResponseSecurityNegativeVolumeIndex;
import com.intrinio.models.ApiResponseSecurityOnBalanceVolume;
import com.intrinio.models.ApiResponseSecurityOnBalanceVolumeMean;
import com.intrinio.models.ApiResponseSecurityRelativeStrengthIndex;
import com.intrinio.models.ApiResponseSecuritySimpleMovingAverage;
import com.intrinio.models.ApiResponseSecurityStochasticOscillator;
import com.intrinio.models.ApiResponseSecurityTripleExponentialAverage;
import com.intrinio.models.ApiResponseSecurityTrueStrengthIndex;
import com.intrinio.models.ApiResponseSecurityUltimateOscillator;
import com.intrinio.models.ApiResponseSecurityVolumePriceTrend;
import com.intrinio.models.ApiResponseSecurityVolumeWeightedAveragePrice;
import com.intrinio.models.ApiResponseSecurityVortexIndicator;
import com.intrinio.models.ApiResponseSecurityWilliamsR;
import java.math.BigDecimal;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechnicalApi {
    private ApiClient apiClient;

    public TechnicalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TechnicalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getSecurityPriceTechnicalsAdi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAdiCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/adi"
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsAdiValidateBeforeCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsAdi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdiCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Accumulation/Distribution Index
     * Returns the Accumulation/Distribution Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityAccumulationDistributionIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityAccumulationDistributionIndex getSecurityPriceTechnicalsAdi(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsAdiWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAccumulationDistributionIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Accumulation/Distribution Index
     * Returns the Accumulation/Distribution Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityAccumulationDistributionIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityAccumulationDistributionIndex> getSecurityPriceTechnicalsAdiWithHttpInfo(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdiValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAccumulationDistributionIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Accumulation/Distribution Index (asynchronously)
     * Returns the Accumulation/Distribution Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAdiAsync(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityAccumulationDistributionIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdiValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAccumulationDistributionIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsAdtv
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume (optional, default to 22)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAdtvCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/adtv"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsAdtvValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsAdtv(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdtvCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Average Daily Trading Volume
     * Returns the Average Daily Trading Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume (optional, default to 22)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityAverageDailyTradingVolume
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityAverageDailyTradingVolume getSecurityPriceTechnicalsAdtv(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsAdtvWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAverageDailyTradingVolume> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Average Daily Trading Volume
     * Returns the Average Daily Trading Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume (optional, default to 22)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityAverageDailyTradingVolume&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityAverageDailyTradingVolume> getSecurityPriceTechnicalsAdtvWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdtvValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAverageDailyTradingVolume>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Average Daily Trading Volume (asynchronously)
     * Returns the Average Daily Trading Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume (optional, default to 22)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAdtvAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityAverageDailyTradingVolume> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdtvValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAverageDailyTradingVolume>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsAdx
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Directional Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAdxCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/adx"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsAdxValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsAdx(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdxCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Average Directional Index
     * Returns the Average Directional Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Directional Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityAverageDirectionalIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityAverageDirectionalIndex getSecurityPriceTechnicalsAdx(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsAdxWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAverageDirectionalIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Average Directional Index
     * Returns the Average Directional Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Directional Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityAverageDirectionalIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityAverageDirectionalIndex> getSecurityPriceTechnicalsAdxWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdxValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAverageDirectionalIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Average Directional Index (asynchronously)
     * Returns the Average Directional Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average Directional Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAdxAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityAverageDirectionalIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAdxValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAverageDirectionalIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsAo
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator (optional, default to 34)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAoCall(String identifier, Integer shortPeriod, Integer longPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/ao"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shortPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("short_period", shortPeriod));
        if (longPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("long_period", longPeriod));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsAoValidateBeforeCall(String identifier, Integer shortPeriod, Integer longPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsAo(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAoCall(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Awesome Oscillator
     * Returns the Awesome Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator (optional, default to 34)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityAwesomeOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityAwesomeOscillator getSecurityPriceTechnicalsAo(String identifier, Integer shortPeriod, Integer longPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsAoWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAwesomeOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Awesome Oscillator
     * Returns the Awesome Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator (optional, default to 34)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityAwesomeOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityAwesomeOscillator> getSecurityPriceTechnicalsAoWithHttpInfo(String identifier, Integer shortPeriod, Integer longPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAoValidateBeforeCall(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAwesomeOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Awesome Oscillator (asynchronously)
     * Returns the Awesome Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator (optional, default to 34)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAoAsync(String identifier, Integer shortPeriod, Integer longPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityAwesomeOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAoValidateBeforeCall(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAwesomeOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsAtr
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average True Range (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAtrCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/atr"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsAtrValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsAtr(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAtrCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Average True Range
     * Returns the Average True Range values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average True Range (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityAverageTrueRange
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityAverageTrueRange getSecurityPriceTechnicalsAtr(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsAtrWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAverageTrueRange> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Average True Range
     * Returns the Average True Range values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average True Range (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityAverageTrueRange&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityAverageTrueRange> getSecurityPriceTechnicalsAtrWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAtrValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAverageTrueRange>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Average True Range (asynchronously)
     * Returns the Average True Range values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Average True Range (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsAtrAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityAverageTrueRange> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsAtrValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityAverageTrueRange>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsBb
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Bollinger Bands (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands (optional, default to 2.0)
     * @param priceKey The Stock Price field to use when calculating Bollinger Bands (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsBbCall(String identifier, Integer period, Float standardDeviations, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/bb"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (standardDeviations != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("standard_deviations", standardDeviations));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsBbValidateBeforeCall(String identifier, Integer period, Float standardDeviations, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsBb(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsBbCall(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bollinger Bands
     * Returns the Bollinger Bands values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Bollinger Bands (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands (optional, default to 2.0)
     * @param priceKey The Stock Price field to use when calculating Bollinger Bands (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityBollingerBands
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityBollingerBands getSecurityPriceTechnicalsBb(String identifier, Integer period, Float standardDeviations, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsBbWithHttpInfo", String.class, Integer.class, Float.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityBollingerBands> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Bollinger Bands
     * Returns the Bollinger Bands values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Bollinger Bands (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands (optional, default to 2.0)
     * @param priceKey The Stock Price field to use when calculating Bollinger Bands (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityBollingerBands&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityBollingerBands> getSecurityPriceTechnicalsBbWithHttpInfo(String identifier, Integer period, Float standardDeviations, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsBbValidateBeforeCall(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityBollingerBands>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bollinger Bands (asynchronously)
     * Returns the Bollinger Bands values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Bollinger Bands (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands (optional, default to 2.0)
     * @param priceKey The Stock Price field to use when calculating Bollinger Bands (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsBbAsync(String identifier, Integer period, Float standardDeviations, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityBollingerBands> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsBbValidateBeforeCall(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityBollingerBands>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsCci
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Commodity Channel Index (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index (optional, default to 0.015)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsCciCall(String identifier, Integer period, Float constant, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/cci"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (constant != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("constant", constant));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsCciValidateBeforeCall(String identifier, Integer period, Float constant, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsCci(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsCciCall(identifier, period, constant, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Commodity Channel Index
     * Returns the Commodity Channel Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Commodity Channel Index (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index (optional, default to 0.015)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityCommodityChannelIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityCommodityChannelIndex getSecurityPriceTechnicalsCci(String identifier, Integer period, Float constant, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsCciWithHttpInfo", String.class, Integer.class, Float.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, constant, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityCommodityChannelIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Commodity Channel Index
     * Returns the Commodity Channel Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Commodity Channel Index (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index (optional, default to 0.015)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityCommodityChannelIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityCommodityChannelIndex> getSecurityPriceTechnicalsCciWithHttpInfo(String identifier, Integer period, Float constant, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsCciValidateBeforeCall(identifier, period, constant, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityCommodityChannelIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Commodity Channel Index (asynchronously)
     * Returns the Commodity Channel Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Commodity Channel Index (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index (optional, default to 0.015)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsCciAsync(String identifier, Integer period, Float constant, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityCommodityChannelIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsCciValidateBeforeCall(identifier, period, constant, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityCommodityChannelIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsCmf
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsCmfCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/cmf"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsCmfValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsCmf(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsCmfCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Chaikin Money Flow
     * Returns the Chaikin Money Flow values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityChaikinMoneyFlow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityChaikinMoneyFlow getSecurityPriceTechnicalsCmf(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsCmfWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityChaikinMoneyFlow> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Chaikin Money Flow
     * Returns the Chaikin Money Flow values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityChaikinMoneyFlow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityChaikinMoneyFlow> getSecurityPriceTechnicalsCmfWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsCmfValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityChaikinMoneyFlow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Chaikin Money Flow (asynchronously)
     * Returns the Chaikin Money Flow values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsCmfAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityChaikinMoneyFlow> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsCmfValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityChaikinMoneyFlow>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsDc
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Donchian Channel (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Donchian Channel (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsDcCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/dc"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsDcValidateBeforeCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsDc(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsDcCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Donchian Channel
     * Returns the Donchian Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Donchian Channel (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Donchian Channel (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityDonchianChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityDonchianChannel getSecurityPriceTechnicalsDc(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsDcWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityDonchianChannel> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Donchian Channel
     * Returns the Donchian Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Donchian Channel (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Donchian Channel (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityDonchianChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityDonchianChannel> getSecurityPriceTechnicalsDcWithHttpInfo(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsDcValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityDonchianChannel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Donchian Channel (asynchronously)
     * Returns the Donchian Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Donchian Channel (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Donchian Channel (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsDcAsync(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityDonchianChannel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsDcValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityDonchianChannel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsDpo
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Detrended Price Oscillator (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsDpoCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/dpo"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsDpoValidateBeforeCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsDpo(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsDpoCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Detrended Price Oscillator
     * Returns the Detrended Price Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Detrended Price Oscillator (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityDetrendedPriceOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityDetrendedPriceOscillator getSecurityPriceTechnicalsDpo(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsDpoWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityDetrendedPriceOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Detrended Price Oscillator
     * Returns the Detrended Price Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Detrended Price Oscillator (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityDetrendedPriceOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityDetrendedPriceOscillator> getSecurityPriceTechnicalsDpoWithHttpInfo(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsDpoValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityDetrendedPriceOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detrended Price Oscillator (asynchronously)
     * Returns the Detrended Price Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Detrended Price Oscillator (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsDpoAsync(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityDetrendedPriceOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsDpoValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityDetrendedPriceOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsEom
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Ease of Movement (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsEomCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/eom"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsEomValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsEom(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsEomCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Ease of Movement
     * Returns the Ease of Movement values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Ease of Movement (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityEaseOfMovement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityEaseOfMovement getSecurityPriceTechnicalsEom(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsEomWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityEaseOfMovement> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Ease of Movement
     * Returns the Ease of Movement values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Ease of Movement (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityEaseOfMovement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityEaseOfMovement> getSecurityPriceTechnicalsEomWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsEomValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityEaseOfMovement>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ease of Movement (asynchronously)
     * Returns the Ease of Movement values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Ease of Movement (optional, default to 20)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsEomAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityEaseOfMovement> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsEomValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityEaseOfMovement>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsFi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsFiCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/fi"
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsFiValidateBeforeCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsFi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsFiCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Force Index
     * Returns the Force Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityForceIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityForceIndex getSecurityPriceTechnicalsFi(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsFiWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityForceIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Force Index
     * Returns the Force Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityForceIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityForceIndex> getSecurityPriceTechnicalsFiWithHttpInfo(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsFiValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityForceIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Force Index (asynchronously)
     * Returns the Force Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsFiAsync(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityForceIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsFiValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityForceIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsIchimoku
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo (optional, default to 52)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsIchimokuCall(String identifier, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/ichimoku"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lowPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("low_period", lowPeriod));
        if (mediumPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("medium_period", mediumPeriod));
        if (highPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("high_period", highPeriod));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsIchimokuValidateBeforeCall(String identifier, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsIchimoku(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsIchimokuCall(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Ichimoku Kinko Hyo
     * Returns the Ichimoku Kinko Hyo values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo (optional, default to 52)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityIchimokuKinkoHyo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityIchimokuKinkoHyo getSecurityPriceTechnicalsIchimoku(String identifier, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsIchimokuWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityIchimokuKinkoHyo> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Ichimoku Kinko Hyo
     * Returns the Ichimoku Kinko Hyo values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo (optional, default to 52)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityIchimokuKinkoHyo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityIchimokuKinkoHyo> getSecurityPriceTechnicalsIchimokuWithHttpInfo(String identifier, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsIchimokuValidateBeforeCall(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityIchimokuKinkoHyo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ichimoku Kinko Hyo (asynchronously)
     * Returns the Ichimoku Kinko Hyo values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo (optional, default to 52)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsIchimokuAsync(String identifier, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityIchimokuKinkoHyo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsIchimokuValidateBeforeCall(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityIchimokuKinkoHyo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsKc
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Kelter Channel (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsKcCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/kc"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsKcValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsKc(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsKcCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Keltner Channel
     * Returns the Keltner Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Kelter Channel (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityKeltnerChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityKeltnerChannel getSecurityPriceTechnicalsKc(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsKcWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityKeltnerChannel> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Keltner Channel
     * Returns the Keltner Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Kelter Channel (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityKeltnerChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityKeltnerChannel> getSecurityPriceTechnicalsKcWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsKcValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityKeltnerChannel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Keltner Channel (asynchronously)
     * Returns the Keltner Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Kelter Channel (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsKcAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityKeltnerChannel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsKcValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityKeltnerChannel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsKst
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1 (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2 (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3 (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4 (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1 (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2 (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3 (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4 (optional, default to 15)
     * @param priceKey The Stock Price field to use when calculating Know Sure Thing (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsKstCall(String identifier, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/kst"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (roc1 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("roc1", roc1));
        if (roc2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("roc2", roc2));
        if (roc3 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("roc3", roc3));
        if (roc4 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("roc4", roc4));
        if (sma1 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sma1", sma1));
        if (sma2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sma2", sma2));
        if (sma3 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sma3", sma3));
        if (sma4 != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sma4", sma4));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsKstValidateBeforeCall(String identifier, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsKst(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsKstCall(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Know Sure Thing
     * Returns the Know Sure Thing values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1 (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2 (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3 (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4 (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1 (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2 (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3 (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4 (optional, default to 15)
     * @param priceKey The Stock Price field to use when calculating Know Sure Thing (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityKnowSureThing
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityKnowSureThing getSecurityPriceTechnicalsKst(String identifier, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsKstWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityKnowSureThing> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Know Sure Thing
     * Returns the Know Sure Thing values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1 (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2 (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3 (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4 (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1 (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2 (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3 (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4 (optional, default to 15)
     * @param priceKey The Stock Price field to use when calculating Know Sure Thing (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityKnowSureThing&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityKnowSureThing> getSecurityPriceTechnicalsKstWithHttpInfo(String identifier, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsKstValidateBeforeCall(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityKnowSureThing>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Know Sure Thing (asynchronously)
     * Returns the Know Sure Thing values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1 (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2 (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3 (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4 (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1 (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2 (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3 (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4 (optional, default to 15)
     * @param priceKey The Stock Price field to use when calculating Know Sure Thing (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsKstAsync(String identifier, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityKnowSureThing> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsKstValidateBeforeCall(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityKnowSureThing>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsMacd
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence (optional, default to 9)
     * @param priceKey The Stock Price field to use when calculating Moving Average Convergence Divergence (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsMacdCall(String identifier, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/macd"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fastPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fast_period", fastPeriod));
        if (slowPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("slow_period", slowPeriod));
        if (signalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("signal_period", signalPeriod));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsMacdValidateBeforeCall(String identifier, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsMacd(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMacdCall(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Moving Average Convergence Divergence
     * Returns the Moving Average Convergence Divergence values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence (optional, default to 9)
     * @param priceKey The Stock Price field to use when calculating Moving Average Convergence Divergence (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityMovingAverageConvergenceDivergence
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityMovingAverageConvergenceDivergence getSecurityPriceTechnicalsMacd(String identifier, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsMacdWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityMovingAverageConvergenceDivergence> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Moving Average Convergence Divergence
     * Returns the Moving Average Convergence Divergence values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence (optional, default to 9)
     * @param priceKey The Stock Price field to use when calculating Moving Average Convergence Divergence (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityMovingAverageConvergenceDivergence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityMovingAverageConvergenceDivergence> getSecurityPriceTechnicalsMacdWithHttpInfo(String identifier, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMacdValidateBeforeCall(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityMovingAverageConvergenceDivergence>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Moving Average Convergence Divergence (asynchronously)
     * Returns the Moving Average Convergence Divergence values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence (optional, default to 9)
     * @param priceKey The Stock Price field to use when calculating Moving Average Convergence Divergence (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsMacdAsync(String identifier, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityMovingAverageConvergenceDivergence> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMacdValidateBeforeCall(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityMovingAverageConvergenceDivergence>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsMfi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Money Flow Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsMfiCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/mfi"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsMfiValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsMfi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMfiCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Money Flow Index
     * Returns the Money Flow Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Money Flow Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityMoneyFlowIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityMoneyFlowIndex getSecurityPriceTechnicalsMfi(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsMfiWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityMoneyFlowIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Money Flow Index
     * Returns the Money Flow Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Money Flow Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityMoneyFlowIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityMoneyFlowIndex> getSecurityPriceTechnicalsMfiWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMfiValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityMoneyFlowIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Money Flow Index (asynchronously)
     * Returns the Money Flow Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Money Flow Index (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsMfiAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityMoneyFlowIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMfiValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityMoneyFlowIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsMi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index (optional, default to 25)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsMiCall(String identifier, Integer emaPeriod, Integer sumPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/mi"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (emaPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ema_period", emaPeriod));
        if (sumPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sum_period", sumPeriod));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsMiValidateBeforeCall(String identifier, Integer emaPeriod, Integer sumPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsMi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMiCall(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Mass Index
     * Returns the Mass Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index (optional, default to 25)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityMassIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityMassIndex getSecurityPriceTechnicalsMi(String identifier, Integer emaPeriod, Integer sumPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsMiWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityMassIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Mass Index
     * Returns the Mass Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index (optional, default to 25)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityMassIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityMassIndex> getSecurityPriceTechnicalsMiWithHttpInfo(String identifier, Integer emaPeriod, Integer sumPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMiValidateBeforeCall(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityMassIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Mass Index (asynchronously)
     * Returns the Mass Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index (optional, default to 25)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsMiAsync(String identifier, Integer emaPeriod, Integer sumPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityMassIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsMiValidateBeforeCall(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityMassIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsNvi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsNviCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/nvi"
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsNviValidateBeforeCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsNvi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsNviCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Negative Volume Index
     * Returns the Negative Volume Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityNegativeVolumeIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityNegativeVolumeIndex getSecurityPriceTechnicalsNvi(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsNviWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityNegativeVolumeIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Negative Volume Index
     * Returns the Negative Volume Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityNegativeVolumeIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityNegativeVolumeIndex> getSecurityPriceTechnicalsNviWithHttpInfo(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsNviValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityNegativeVolumeIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Negative Volume Index (asynchronously)
     * Returns the Negative Volume Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsNviAsync(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityNegativeVolumeIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsNviValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityNegativeVolumeIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsObv
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsObvCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/obv"
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsObvValidateBeforeCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsObv(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsObvCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * On-balance Volume
     * Returns the On-balance Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityOnBalanceVolume
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityOnBalanceVolume getSecurityPriceTechnicalsObv(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsObvWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityOnBalanceVolume> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * On-balance Volume
     * Returns the On-balance Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityOnBalanceVolume&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityOnBalanceVolume> getSecurityPriceTechnicalsObvWithHttpInfo(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsObvValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityOnBalanceVolume>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * On-balance Volume (asynchronously)
     * Returns the On-balance Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsObvAsync(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityOnBalanceVolume> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsObvValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityOnBalanceVolume>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsObvMean
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsObvMeanCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/obv_mean"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsObvMeanValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsObvMean(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsObvMeanCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * On-balance Volume Mean
     * Returns the On-balance Volume Mean values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityOnBalanceVolumeMean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityOnBalanceVolumeMean getSecurityPriceTechnicalsObvMean(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsObvMeanWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityOnBalanceVolumeMean> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * On-balance Volume Mean
     * Returns the On-balance Volume Mean values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityOnBalanceVolumeMean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityOnBalanceVolumeMean> getSecurityPriceTechnicalsObvMeanWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsObvMeanValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityOnBalanceVolumeMean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * On-balance Volume Mean (asynchronously)
     * Returns the On-balance Volume Mean values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean (optional, default to 10)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsObvMeanAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityOnBalanceVolumeMean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsObvMeanValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityOnBalanceVolumeMean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsRsi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Relative Strength Index (optional, default to 14)
     * @param priceKey The Stock Price field to use when calculating Relative Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsRsiCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/rsi"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsRsiValidateBeforeCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsRsi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsRsiCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Relative Strength Index
     * Returns the Relative Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Relative Strength Index (optional, default to 14)
     * @param priceKey The Stock Price field to use when calculating Relative Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityRelativeStrengthIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityRelativeStrengthIndex getSecurityPriceTechnicalsRsi(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsRsiWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityRelativeStrengthIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Relative Strength Index
     * Returns the Relative Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Relative Strength Index (optional, default to 14)
     * @param priceKey The Stock Price field to use when calculating Relative Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityRelativeStrengthIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityRelativeStrengthIndex> getSecurityPriceTechnicalsRsiWithHttpInfo(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsRsiValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityRelativeStrengthIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Relative Strength Index (asynchronously)
     * Returns the Relative Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Relative Strength Index (optional, default to 14)
     * @param priceKey The Stock Price field to use when calculating Relative Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsRsiAsync(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityRelativeStrengthIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsRsiValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityRelativeStrengthIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsSma
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Simple Moving Average (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Simple Moving Average (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsSmaCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/sma"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsSmaValidateBeforeCall(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsSma(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsSmaCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Simple Moving Average
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Simple Moving Average (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Simple Moving Average (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecuritySimpleMovingAverage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecuritySimpleMovingAverage getSecurityPriceTechnicalsSma(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsSmaWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecuritySimpleMovingAverage> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Simple Moving Average
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Simple Moving Average (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Simple Moving Average (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecuritySimpleMovingAverage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecuritySimpleMovingAverage> getSecurityPriceTechnicalsSmaWithHttpInfo(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsSmaValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecuritySimpleMovingAverage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Simple Moving Average (asynchronously)
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Simple Moving Average (optional, default to 20)
     * @param priceKey The Stock Price field to use when calculating Simple Moving Average (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsSmaAsync(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecuritySimpleMovingAverage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsSmaValidateBeforeCall(identifier, period, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecuritySimpleMovingAverage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsSr
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator (optional, default to 3)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsSrCall(String identifier, Integer period, Integer signalPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/sr"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (signalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("signal_period", signalPeriod));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsSrValidateBeforeCall(String identifier, Integer period, Integer signalPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsSr(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsSrCall(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Stochastic Oscillator
     * Returns the Stochastic Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator (optional, default to 3)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityStochasticOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityStochasticOscillator getSecurityPriceTechnicalsSr(String identifier, Integer period, Integer signalPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsSrWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityStochasticOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Stochastic Oscillator
     * Returns the Stochastic Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator (optional, default to 3)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityStochasticOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityStochasticOscillator> getSecurityPriceTechnicalsSrWithHttpInfo(String identifier, Integer period, Integer signalPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsSrValidateBeforeCall(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStochasticOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Stochastic Oscillator (asynchronously)
     * Returns the Stochastic Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator (optional, default to 3)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsSrAsync(String identifier, Integer period, Integer signalPeriod, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityStochasticOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsSrValidateBeforeCall(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStochasticOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsTrix
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average (optional, default to 15)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsTrixCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/trix"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsTrixValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsTrix(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsTrixCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Triple Exponential Average
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average (optional, default to 15)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityTripleExponentialAverage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityTripleExponentialAverage getSecurityPriceTechnicalsTrix(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsTrixWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityTripleExponentialAverage> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Triple Exponential Average
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average (optional, default to 15)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityTripleExponentialAverage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityTripleExponentialAverage> getSecurityPriceTechnicalsTrixWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsTrixValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityTripleExponentialAverage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Triple Exponential Average (asynchronously)
     * Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average (optional, default to 15)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsTrixAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityTripleExponentialAverage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsTrixValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityTripleExponentialAverage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsTsi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index (optional, default to 25)
     * @param priceKey The Stock Price field to use when calculating True Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsTsiCall(String identifier, Integer lowPeriod, Integer highPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/tsi"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (lowPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("low_period", lowPeriod));
        if (highPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("high_period", highPeriod));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsTsiValidateBeforeCall(String identifier, Integer lowPeriod, Integer highPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsTsi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsTsiCall(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * True Strength Index
     * Returns the True Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index (optional, default to 25)
     * @param priceKey The Stock Price field to use when calculating True Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityTrueStrengthIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityTrueStrengthIndex getSecurityPriceTechnicalsTsi(String identifier, Integer lowPeriod, Integer highPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsTsiWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityTrueStrengthIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * True Strength Index
     * Returns the True Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index (optional, default to 25)
     * @param priceKey The Stock Price field to use when calculating True Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityTrueStrengthIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityTrueStrengthIndex> getSecurityPriceTechnicalsTsiWithHttpInfo(String identifier, Integer lowPeriod, Integer highPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsTsiValidateBeforeCall(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityTrueStrengthIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * True Strength Index (asynchronously)
     * Returns the True Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index (optional, default to 25)
     * @param priceKey The Stock Price field to use when calculating True Strength Index (optional, default to close)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsTsiAsync(String identifier, Integer lowPeriod, Integer highPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityTrueStrengthIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsTsiValidateBeforeCall(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityTrueStrengthIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsUo
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator (optional, default to 1.0)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsUoCall(String identifier, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/uo"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (shortPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("short_period", shortPeriod));
        if (mediumPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("medium_period", mediumPeriod));
        if (longPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("long_period", longPeriod));
        if (shortWeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("short_weight", shortWeight));
        if (mediumWeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("medium_weight", mediumWeight));
        if (longWeight != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("long_weight", longWeight));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsUoValidateBeforeCall(String identifier, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsUo(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsUoCall(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Ultimate Oscillator
     * Returns the Ultimate Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator (optional, default to 1.0)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityUltimateOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityUltimateOscillator getSecurityPriceTechnicalsUo(String identifier, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsUoWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, Float.class, Float.class, Float.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityUltimateOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Ultimate Oscillator
     * Returns the Ultimate Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator (optional, default to 1.0)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityUltimateOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityUltimateOscillator> getSecurityPriceTechnicalsUoWithHttpInfo(String identifier, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsUoValidateBeforeCall(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityUltimateOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ultimate Oscillator (asynchronously)
     * Returns the Ultimate Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator (optional, default to 1.0)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsUoAsync(String identifier, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityUltimateOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsUoValidateBeforeCall(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityUltimateOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsVi
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Vortex Indicator (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsViCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/vi"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsViValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsVi(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsViCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Vortex Indicator
     * Returns the Vortex Indicator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Vortex Indicator (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityVortexIndicator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityVortexIndicator getSecurityPriceTechnicalsVi(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsViWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityVortexIndicator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Vortex Indicator
     * Returns the Vortex Indicator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Vortex Indicator (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityVortexIndicator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityVortexIndicator> getSecurityPriceTechnicalsViWithHttpInfo(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsViValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityVortexIndicator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Vortex Indicator (asynchronously)
     * Returns the Vortex Indicator values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to calculate Vortex Indicator (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsViAsync(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityVortexIndicator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsViValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityVortexIndicator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsVpt
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsVptCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/vpt"
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsVptValidateBeforeCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsVpt(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsVptCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Volume-price Trend
     * Returns the Volume-price Trend values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityVolumePriceTrend
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityVolumePriceTrend getSecurityPriceTechnicalsVpt(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsVptWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityVolumePriceTrend> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Volume-price Trend
     * Returns the Volume-price Trend values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityVolumePriceTrend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityVolumePriceTrend> getSecurityPriceTechnicalsVptWithHttpInfo(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsVptValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityVolumePriceTrend>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Volume-price Trend (asynchronously)
     * Returns the Volume-price Trend values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsVptAsync(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityVolumePriceTrend> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsVptValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityVolumePriceTrend>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsVwap
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsVwapCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/vwap"
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsVwapValidateBeforeCall(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsVwap(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsVwapCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Volume Weighted Average Price
     * Returns the Volume Weighted Average Price values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityVolumeWeightedAveragePrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityVolumeWeightedAveragePrice getSecurityPriceTechnicalsVwap(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsVwapWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityVolumeWeightedAveragePrice> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Volume Weighted Average Price
     * Returns the Volume Weighted Average Price values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityVolumeWeightedAveragePrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityVolumeWeightedAveragePrice> getSecurityPriceTechnicalsVwapWithHttpInfo(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsVwapValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityVolumeWeightedAveragePrice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Volume Weighted Average Price (asynchronously)
     * Returns the Volume Weighted Average Price values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsVwapAsync(String identifier, String startDate, String endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityVolumeWeightedAveragePrice> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsVwapValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityVolumeWeightedAveragePrice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityPriceTechnicalsWr
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to look-back when calculating Williams %R (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsWrCall(String identifier, Integer period, String startDate, String endDate, BigDecimal pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/technicals/wr"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getSecurityPriceTechnicalsWrValidateBeforeCall(String identifier, Integer period, String startDate, String endDate, BigDecimal pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityPriceTechnicalsWr(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsWrCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Williams %R
     * Returns the Williams %R values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to look-back when calculating Williams %R (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityWilliamsR
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityWilliamsR getSecurityPriceTechnicalsWr(String identifier, Integer period, String startDate, String endDate, BigDecimal pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = TechnicalApi.class.getMethod("getSecurityPriceTechnicalsWrWithHttpInfo", String.class, Integer.class, String.class, String.class, BigDecimal.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityWilliamsR> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Williams %R
     * Returns the Williams %R values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to look-back when calculating Williams %R (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityWilliamsR&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityWilliamsR> getSecurityPriceTechnicalsWrWithHttpInfo(String identifier, Integer period, String startDate, String endDate, BigDecimal pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsWrValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityWilliamsR>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Williams %R (asynchronously)
     * Returns the Williams %R values of Stock Prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param period The number of observations, per period, to look-back when calculating Williams %R (optional, default to 14)
     * @param startDate Return technical indicator values on or after the date (optional)
     * @param endDate Return technical indicator values on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityPriceTechnicalsWrAsync(String identifier, Integer period, String startDate, String endDate, BigDecimal pageSize, String nextPage, final ApiCallback<ApiResponseSecurityWilliamsR> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityPriceTechnicalsWrValidateBeforeCall(identifier, period, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityWilliamsR>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
