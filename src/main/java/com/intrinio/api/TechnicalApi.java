

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


import com.intrinio.models.ApiResponseCryptoAccumulationDistributionIndex;
import com.intrinio.models.ApiResponseCryptoAverageDailyTradingVolume;
import com.intrinio.models.ApiResponseCryptoAverageDirectionalIndex;
import com.intrinio.models.ApiResponseCryptoAverageTrueRange;
import com.intrinio.models.ApiResponseCryptoAwesomeOscillator;
import com.intrinio.models.ApiResponseCryptoBollingerBands;
import com.intrinio.models.ApiResponseCryptoChaikinMoneyFlow;
import com.intrinio.models.ApiResponseCryptoCommodityChannelIndex;
import com.intrinio.models.ApiResponseCryptoDetrendedPriceOscillator;
import com.intrinio.models.ApiResponseCryptoDonchianChannel;
import com.intrinio.models.ApiResponseCryptoEaseOfMovement;
import com.intrinio.models.ApiResponseCryptoForceIndex;
import com.intrinio.models.ApiResponseCryptoIchimokuKinkoHyo;
import com.intrinio.models.ApiResponseCryptoKeltnerChannel;
import com.intrinio.models.ApiResponseCryptoKnowSureThing;
import com.intrinio.models.ApiResponseCryptoMassIndex;
import com.intrinio.models.ApiResponseCryptoMoneyFlowIndex;
import com.intrinio.models.ApiResponseCryptoMovingAverageConvergenceDivergence;
import com.intrinio.models.ApiResponseCryptoNegativeVolumeIndex;
import com.intrinio.models.ApiResponseCryptoOnBalanceVolume;
import com.intrinio.models.ApiResponseCryptoOnBalanceVolumeMean;
import com.intrinio.models.ApiResponseCryptoRelativeStrengthIndex;
import com.intrinio.models.ApiResponseCryptoSimpleMovingAverage;
import com.intrinio.models.ApiResponseCryptoStochasticOscillator;
import com.intrinio.models.ApiResponseCryptoTripleExponentialAverage;
import com.intrinio.models.ApiResponseCryptoTrueStrengthIndex;
import com.intrinio.models.ApiResponseCryptoUltimateOscillator;
import com.intrinio.models.ApiResponseCryptoVolumePriceTrend;
import com.intrinio.models.ApiResponseCryptoVolumeWeightedAveragePrice;
import com.intrinio.models.ApiResponseCryptoVortexIndicator;
import com.intrinio.models.ApiResponseCryptoWilliamsR;
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
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
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
     * Build call for getCryptoPriceTechnicalsAdi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAdiCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/adi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsAdiValidateBeforeCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdiCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Accumulation/Distribution Index
     * Returns the Accumulation/Distribution Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoAccumulationDistributionIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoAccumulationDistributionIndex getCryptoPriceTechnicalsAdi(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoAccumulationDistributionIndex> resp = getCryptoPriceTechnicalsAdiWithHttpInfo(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Accumulation/Distribution Index
     * Returns the Accumulation/Distribution Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoAccumulationDistributionIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoAccumulationDistributionIndex> getCryptoPriceTechnicalsAdiWithHttpInfo(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdiValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAccumulationDistributionIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Accumulation/Distribution Index (asynchronously)
     * Returns the Accumulation/Distribution Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAdiAsync(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoAccumulationDistributionIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdiValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAccumulationDistributionIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsAdtv
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAdtvCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/adtv";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsAdtvValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdtvCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Average Daily Trading Volume
     * Returns the Average Daily Trading Volume values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoAverageDailyTradingVolume
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoAverageDailyTradingVolume getCryptoPriceTechnicalsAdtv(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoAverageDailyTradingVolume> resp = getCryptoPriceTechnicalsAdtvWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Average Daily Trading Volume
     * Returns the Average Daily Trading Volume values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoAverageDailyTradingVolume&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoAverageDailyTradingVolume> getCryptoPriceTechnicalsAdtvWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdtvValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAverageDailyTradingVolume>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Average Daily Trading Volume (asynchronously)
     * Returns the Average Daily Trading Volume values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Daily Trading Volume. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAdtvAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoAverageDailyTradingVolume> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdtvValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAverageDailyTradingVolume>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsAdx
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Directional Index. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAdxCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/adx";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsAdxValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdxCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Average Directional Index
     * Returns the Average Directional Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Directional Index. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoAverageDirectionalIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoAverageDirectionalIndex getCryptoPriceTechnicalsAdx(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoAverageDirectionalIndex> resp = getCryptoPriceTechnicalsAdxWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Average Directional Index
     * Returns the Average Directional Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Directional Index. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoAverageDirectionalIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoAverageDirectionalIndex> getCryptoPriceTechnicalsAdxWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdxValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAverageDirectionalIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Average Directional Index (asynchronously)
     * Returns the Average Directional Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average Directional Index. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAdxAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoAverageDirectionalIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAdxValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAverageDirectionalIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsAo
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator. (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator. (optional, default to 34)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAoCall(String pair, String exchange, String currency, Integer shortPeriod, Integer longPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/ao";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (shortPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("short_period", shortPeriod));
        if (longPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("long_period", longPeriod));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsAoValidateBeforeCall(String pair, String exchange, String currency, Integer shortPeriod, Integer longPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAoCall(pair, exchange, currency, shortPeriod, longPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Awesome Oscillator
     * Returns the Awesome Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator. (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator. (optional, default to 34)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoAwesomeOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoAwesomeOscillator getCryptoPriceTechnicalsAo(String pair, String exchange, String currency, Integer shortPeriod, Integer longPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoAwesomeOscillator> resp = getCryptoPriceTechnicalsAoWithHttpInfo(pair, exchange, currency, shortPeriod, longPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Awesome Oscillator
     * Returns the Awesome Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator. (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator. (optional, default to 34)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoAwesomeOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoAwesomeOscillator> getCryptoPriceTechnicalsAoWithHttpInfo(String pair, String exchange, String currency, Integer shortPeriod, Integer longPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAoValidateBeforeCall(pair, exchange, currency, shortPeriod, longPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAwesomeOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Awesome Oscillator (asynchronously)
     * Returns the Awesome Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator. (optional, default to 5)
     * @param longPeriod The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator. (optional, default to 34)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAoAsync(String pair, String exchange, String currency, Integer shortPeriod, Integer longPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoAwesomeOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAoValidateBeforeCall(pair, exchange, currency, shortPeriod, longPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAwesomeOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsAtr
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average True Range. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAtrCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/atr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsAtrValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAtrCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Average True Range
     * Returns the Average True Range values of Crypto Currency Prices for Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average True Range. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoAverageTrueRange
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoAverageTrueRange getCryptoPriceTechnicalsAtr(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoAverageTrueRange> resp = getCryptoPriceTechnicalsAtrWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Average True Range
     * Returns the Average True Range values of Crypto Currency Prices for Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average True Range. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoAverageTrueRange&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoAverageTrueRange> getCryptoPriceTechnicalsAtrWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAtrValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAverageTrueRange>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Average True Range (asynchronously)
     * Returns the Average True Range values of Crypto Currency Prices for Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Average True Range. (optional, default to 22)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsAtrAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoAverageTrueRange> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsAtrValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoAverageTrueRange>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsBb
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Bollinger Bands. (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands. (optional, default to 2.0)
     * @param priceKey The Crypto Currency Price field to use when calculating Bollinger Bands. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsBbCall(String pair, String exchange, String currency, Integer period, Float standardDeviations, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/bb";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (standardDeviations != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("standard_deviations", standardDeviations));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsBbValidateBeforeCall(String pair, String exchange, String currency, Integer period, Float standardDeviations, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsBbCall(pair, exchange, currency, period, standardDeviations, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Bollinger Bands
     * Returns the Bollinger Bands values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Bollinger Bands. (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands. (optional, default to 2.0)
     * @param priceKey The Crypto Currency Price field to use when calculating Bollinger Bands. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoBollingerBands
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoBollingerBands getCryptoPriceTechnicalsBb(String pair, String exchange, String currency, Integer period, Float standardDeviations, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoBollingerBands> resp = getCryptoPriceTechnicalsBbWithHttpInfo(pair, exchange, currency, period, standardDeviations, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Bollinger Bands
     * Returns the Bollinger Bands values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Bollinger Bands. (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands. (optional, default to 2.0)
     * @param priceKey The Crypto Currency Price field to use when calculating Bollinger Bands. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoBollingerBands&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoBollingerBands> getCryptoPriceTechnicalsBbWithHttpInfo(String pair, String exchange, String currency, Integer period, Float standardDeviations, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsBbValidateBeforeCall(pair, exchange, currency, period, standardDeviations, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBollingerBands>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Bollinger Bands (asynchronously)
     * Returns the Bollinger Bands values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Bollinger Bands. (optional, default to 20)
     * @param standardDeviations The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands. (optional, default to 2.0)
     * @param priceKey The Crypto Currency Price field to use when calculating Bollinger Bands. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsBbAsync(String pair, String exchange, String currency, Integer period, Float standardDeviations, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoBollingerBands> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsBbValidateBeforeCall(pair, exchange, currency, period, standardDeviations, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoBollingerBands>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsCci
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 0.015)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsCciCall(String pair, String exchange, String currency, Integer period, Float constant, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/cci";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (constant != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("constant", constant));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsCciValidateBeforeCall(String pair, String exchange, String currency, Integer period, Float constant, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsCciCall(pair, exchange, currency, period, constant, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Commodity Channel Index
     * Returns the Commodity Channel Index values of Crypto Currency Prices for Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 0.015)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoCommodityChannelIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoCommodityChannelIndex getCryptoPriceTechnicalsCci(String pair, String exchange, String currency, Integer period, Float constant, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoCommodityChannelIndex> resp = getCryptoPriceTechnicalsCciWithHttpInfo(pair, exchange, currency, period, constant, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Commodity Channel Index
     * Returns the Commodity Channel Index values of Crypto Currency Prices for Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 0.015)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoCommodityChannelIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoCommodityChannelIndex> getCryptoPriceTechnicalsCciWithHttpInfo(String pair, String exchange, String currency, Integer period, Float constant, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsCciValidateBeforeCall(pair, exchange, currency, period, constant, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoCommodityChannelIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Commodity Channel Index (asynchronously)
     * Returns the Commodity Channel Index values of Crypto Currency Prices for Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 20)
     * @param constant The number of observations, per period, to calculate Commodity Channel Index. (optional, default to 0.015)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsCciAsync(String pair, String exchange, String currency, Integer period, Float constant, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoCommodityChannelIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsCciValidateBeforeCall(pair, exchange, currency, period, constant, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoCommodityChannelIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsCmf
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsCmfCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/cmf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsCmfValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsCmfCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Chaikin Money Flow
     * Returns the Chaikin Money Flow values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoChaikinMoneyFlow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoChaikinMoneyFlow getCryptoPriceTechnicalsCmf(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoChaikinMoneyFlow> resp = getCryptoPriceTechnicalsCmfWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Chaikin Money Flow
     * Returns the Chaikin Money Flow values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoChaikinMoneyFlow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoChaikinMoneyFlow> getCryptoPriceTechnicalsCmfWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsCmfValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoChaikinMoneyFlow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Chaikin Money Flow (asynchronously)
     * Returns the Chaikin Money Flow values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Chaikin Money Flow. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsCmfAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoChaikinMoneyFlow> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsCmfValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoChaikinMoneyFlow>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsDc
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Donchian Channel. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Donchian Channel. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsDcCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/dc";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsDcValidateBeforeCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsDcCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Donchian Channel
     * Returns the Donchian Channel values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Donchian Channel. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Donchian Channel. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoDonchianChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoDonchianChannel getCryptoPriceTechnicalsDc(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoDonchianChannel> resp = getCryptoPriceTechnicalsDcWithHttpInfo(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Donchian Channel
     * Returns the Donchian Channel values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Donchian Channel. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Donchian Channel. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoDonchianChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoDonchianChannel> getCryptoPriceTechnicalsDcWithHttpInfo(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsDcValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoDonchianChannel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Donchian Channel (asynchronously)
     * Returns the Donchian Channel values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Donchian Channel. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Donchian Channel. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsDcAsync(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoDonchianChannel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsDcValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoDonchianChannel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsDpo
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Detrended Price Oscillator. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsDpoCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/dpo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsDpoValidateBeforeCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsDpoCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Detrended Price Oscillator
     * Returns the Detrended Price Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Detrended Price Oscillator. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoDetrendedPriceOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoDetrendedPriceOscillator getCryptoPriceTechnicalsDpo(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoDetrendedPriceOscillator> resp = getCryptoPriceTechnicalsDpoWithHttpInfo(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Detrended Price Oscillator
     * Returns the Detrended Price Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Detrended Price Oscillator. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoDetrendedPriceOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoDetrendedPriceOscillator> getCryptoPriceTechnicalsDpoWithHttpInfo(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsDpoValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoDetrendedPriceOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Detrended Price Oscillator (asynchronously)
     * Returns the Detrended Price Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Detrended Price Oscillator. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Detrended Price Oscillator. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsDpoAsync(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoDetrendedPriceOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsDpoValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoDetrendedPriceOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsEom
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Ease of Movement. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsEomCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/eom";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsEomValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsEomCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Ease of Movement
     * Returns the Ease of Movement values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Ease of Movement. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoEaseOfMovement
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoEaseOfMovement getCryptoPriceTechnicalsEom(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoEaseOfMovement> resp = getCryptoPriceTechnicalsEomWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Ease of Movement
     * Returns the Ease of Movement values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Ease of Movement. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoEaseOfMovement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoEaseOfMovement> getCryptoPriceTechnicalsEomWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsEomValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoEaseOfMovement>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ease of Movement (asynchronously)
     * Returns the Ease of Movement values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Ease of Movement. (optional, default to 20)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsEomAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoEaseOfMovement> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsEomValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoEaseOfMovement>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsFi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsFiCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/fi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsFiValidateBeforeCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsFiCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Force Index
     * Returns the Force Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoForceIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoForceIndex getCryptoPriceTechnicalsFi(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoForceIndex> resp = getCryptoPriceTechnicalsFiWithHttpInfo(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Force Index
     * Returns the Force Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoForceIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoForceIndex> getCryptoPriceTechnicalsFiWithHttpInfo(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsFiValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoForceIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Force Index (asynchronously)
     * Returns the Force Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsFiAsync(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoForceIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsFiValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoForceIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsIchimoku
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo. (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo. (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo. (optional, default to 52)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsIchimokuCall(String pair, String exchange, String currency, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/ichimoku";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (lowPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("low_period", lowPeriod));
        if (mediumPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("medium_period", mediumPeriod));
        if (highPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("high_period", highPeriod));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsIchimokuValidateBeforeCall(String pair, String exchange, String currency, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsIchimokuCall(pair, exchange, currency, lowPeriod, mediumPeriod, highPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Ichimoku Kinko Hyo
     * Returns the Ichimoku Kinko Hyo values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo. (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo. (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo. (optional, default to 52)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoIchimokuKinkoHyo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoIchimokuKinkoHyo getCryptoPriceTechnicalsIchimoku(String pair, String exchange, String currency, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoIchimokuKinkoHyo> resp = getCryptoPriceTechnicalsIchimokuWithHttpInfo(pair, exchange, currency, lowPeriod, mediumPeriod, highPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Ichimoku Kinko Hyo
     * Returns the Ichimoku Kinko Hyo values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo. (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo. (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo. (optional, default to 52)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoIchimokuKinkoHyo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoIchimokuKinkoHyo> getCryptoPriceTechnicalsIchimokuWithHttpInfo(String pair, String exchange, String currency, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsIchimokuValidateBeforeCall(pair, exchange, currency, lowPeriod, mediumPeriod, highPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoIchimokuKinkoHyo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ichimoku Kinko Hyo (asynchronously)
     * Returns the Ichimoku Kinko Hyo values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo. (optional, default to 9)
     * @param mediumPeriod The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo. (optional, default to 26)
     * @param highPeriod The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo. (optional, default to 52)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsIchimokuAsync(String pair, String exchange, String currency, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoIchimokuKinkoHyo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsIchimokuValidateBeforeCall(pair, exchange, currency, lowPeriod, mediumPeriod, highPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoIchimokuKinkoHyo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsKc
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Kelter Channel. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsKcCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/kc";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsKcValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsKcCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Keltner Channel
     * Returns the Keltner Channel values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Kelter Channel. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoKeltnerChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoKeltnerChannel getCryptoPriceTechnicalsKc(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoKeltnerChannel> resp = getCryptoPriceTechnicalsKcWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Keltner Channel
     * Returns the Keltner Channel values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Kelter Channel. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoKeltnerChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoKeltnerChannel> getCryptoPriceTechnicalsKcWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsKcValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoKeltnerChannel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Keltner Channel (asynchronously)
     * Returns the Keltner Channel values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Kelter Channel. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsKcAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoKeltnerChannel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsKcValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoKeltnerChannel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsKst
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1. (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2. (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3. (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4. (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1. (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2. (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3. (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4. (optional, default to 15)
     * @param priceKey The Crypto Currency Price field to use when calculating Know Sure Thing. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsKstCall(String pair, String exchange, String currency, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/kst";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsKstValidateBeforeCall(String pair, String exchange, String currency, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsKstCall(pair, exchange, currency, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Know Sure Thing
     * Returns the Know Sure Thing values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1. (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2. (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3. (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4. (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1. (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2. (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3. (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4. (optional, default to 15)
     * @param priceKey The Crypto Currency Price field to use when calculating Know Sure Thing. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoKnowSureThing
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoKnowSureThing getCryptoPriceTechnicalsKst(String pair, String exchange, String currency, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoKnowSureThing> resp = getCryptoPriceTechnicalsKstWithHttpInfo(pair, exchange, currency, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Know Sure Thing
     * Returns the Know Sure Thing values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1. (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2. (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3. (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4. (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1. (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2. (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3. (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4. (optional, default to 15)
     * @param priceKey The Crypto Currency Price field to use when calculating Know Sure Thing. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoKnowSureThing&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoKnowSureThing> getCryptoPriceTechnicalsKstWithHttpInfo(String pair, String exchange, String currency, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsKstValidateBeforeCall(pair, exchange, currency, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoKnowSureThing>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Know Sure Thing (asynchronously)
     * Returns the Know Sure Thing values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param roc1 The number of observations, per period, to calculate the rate-of-change for RCMA1. (optional, default to 10)
     * @param roc2 The number of observations, per period, to calculate the rate-of-change for RCMA2. (optional, default to 15)
     * @param roc3 The number of observations, per period, to calculate the rate-of-change for RCMA3. (optional, default to 20)
     * @param roc4 The number of observations, per period, to calculate the rate-of-change for RCMA4. (optional, default to 30)
     * @param sma1 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1. (optional, default to 10)
     * @param sma2 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2. (optional, default to 10)
     * @param sma3 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3. (optional, default to 10)
     * @param sma4 The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4. (optional, default to 15)
     * @param priceKey The Crypto Currency Price field to use when calculating Know Sure Thing. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsKstAsync(String pair, String exchange, String currency, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoKnowSureThing> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsKstValidateBeforeCall(pair, exchange, currency, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoKnowSureThing>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsMacd
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence. (optional, default to 9)
     * @param priceKey The Crypto Currency Price field to use when calculating Moving Average Convergence Divergence. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsMacdCall(String pair, String exchange, String currency, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/macd";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (fastPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fast_period", fastPeriod));
        if (slowPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("slow_period", slowPeriod));
        if (signalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("signal_period", signalPeriod));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsMacdValidateBeforeCall(String pair, String exchange, String currency, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMacdCall(pair, exchange, currency, fastPeriod, slowPeriod, signalPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Moving Average Convergence Divergence
     * Returns the Moving Average Convergence Divergence values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence. (optional, default to 9)
     * @param priceKey The Crypto Currency Price field to use when calculating Moving Average Convergence Divergence. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoMovingAverageConvergenceDivergence
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoMovingAverageConvergenceDivergence getCryptoPriceTechnicalsMacd(String pair, String exchange, String currency, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoMovingAverageConvergenceDivergence> resp = getCryptoPriceTechnicalsMacdWithHttpInfo(pair, exchange, currency, fastPeriod, slowPeriod, signalPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Moving Average Convergence Divergence
     * Returns the Moving Average Convergence Divergence values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence. (optional, default to 9)
     * @param priceKey The Crypto Currency Price field to use when calculating Moving Average Convergence Divergence. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoMovingAverageConvergenceDivergence&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoMovingAverageConvergenceDivergence> getCryptoPriceTechnicalsMacdWithHttpInfo(String pair, String exchange, String currency, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMacdValidateBeforeCall(pair, exchange, currency, fastPeriod, slowPeriod, signalPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoMovingAverageConvergenceDivergence>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Moving Average Convergence Divergence (asynchronously)
     * Returns the Moving Average Convergence Divergence values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param fastPeriod The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 12)
     * @param slowPeriod The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence. (optional, default to 26)
     * @param signalPeriod The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence. (optional, default to 9)
     * @param priceKey The Crypto Currency Price field to use when calculating Moving Average Convergence Divergence. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsMacdAsync(String pair, String exchange, String currency, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoMovingAverageConvergenceDivergence> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMacdValidateBeforeCall(pair, exchange, currency, fastPeriod, slowPeriod, signalPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoMovingAverageConvergenceDivergence>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsMfi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Money Flow Index. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsMfiCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/mfi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsMfiValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMfiCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Money Flow Index
     * Returns the Money Flow Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Money Flow Index. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoMoneyFlowIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoMoneyFlowIndex getCryptoPriceTechnicalsMfi(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoMoneyFlowIndex> resp = getCryptoPriceTechnicalsMfiWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Money Flow Index
     * Returns the Money Flow Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Money Flow Index. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoMoneyFlowIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoMoneyFlowIndex> getCryptoPriceTechnicalsMfiWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMfiValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoMoneyFlowIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Money Flow Index (asynchronously)
     * Returns the Money Flow Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Money Flow Index. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsMfiAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoMoneyFlowIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMfiValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoMoneyFlowIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsMi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index. (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index. (optional, default to 25)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsMiCall(String pair, String exchange, String currency, Integer emaPeriod, Integer sumPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/mi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (emaPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ema_period", emaPeriod));
        if (sumPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sum_period", sumPeriod));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsMiValidateBeforeCall(String pair, String exchange, String currency, Integer emaPeriod, Integer sumPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMiCall(pair, exchange, currency, emaPeriod, sumPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Mass Index
     * Returns the Mass Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index. (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index. (optional, default to 25)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoMassIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoMassIndex getCryptoPriceTechnicalsMi(String pair, String exchange, String currency, Integer emaPeriod, Integer sumPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoMassIndex> resp = getCryptoPriceTechnicalsMiWithHttpInfo(pair, exchange, currency, emaPeriod, sumPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Mass Index
     * Returns the Mass Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index. (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index. (optional, default to 25)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoMassIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoMassIndex> getCryptoPriceTechnicalsMiWithHttpInfo(String pair, String exchange, String currency, Integer emaPeriod, Integer sumPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMiValidateBeforeCall(pair, exchange, currency, emaPeriod, sumPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoMassIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Mass Index (asynchronously)
     * Returns the Mass Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param emaPeriod The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index. (optional, default to 9)
     * @param sumPeriod The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index. (optional, default to 25)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsMiAsync(String pair, String exchange, String currency, Integer emaPeriod, Integer sumPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoMassIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsMiValidateBeforeCall(pair, exchange, currency, emaPeriod, sumPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoMassIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsNvi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsNviCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/nvi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsNviValidateBeforeCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsNviCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Negative Volume Index
     * Returns the Negative Volume Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoNegativeVolumeIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoNegativeVolumeIndex getCryptoPriceTechnicalsNvi(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoNegativeVolumeIndex> resp = getCryptoPriceTechnicalsNviWithHttpInfo(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Negative Volume Index
     * Returns the Negative Volume Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoNegativeVolumeIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoNegativeVolumeIndex> getCryptoPriceTechnicalsNviWithHttpInfo(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsNviValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoNegativeVolumeIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Negative Volume Index (asynchronously)
     * Returns the Negative Volume Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsNviAsync(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoNegativeVolumeIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsNviValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoNegativeVolumeIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsObv
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsObvCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/obv";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsObvValidateBeforeCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsObvCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * On-balance Volume
     * Returns the On-balance Volume values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoOnBalanceVolume
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoOnBalanceVolume getCryptoPriceTechnicalsObv(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoOnBalanceVolume> resp = getCryptoPriceTechnicalsObvWithHttpInfo(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * On-balance Volume
     * Returns the On-balance Volume values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoOnBalanceVolume&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoOnBalanceVolume> getCryptoPriceTechnicalsObvWithHttpInfo(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsObvValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoOnBalanceVolume>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * On-balance Volume (asynchronously)
     * Returns the On-balance Volume values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsObvAsync(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoOnBalanceVolume> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsObvValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoOnBalanceVolume>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsObvMean
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsObvMeanCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/obv_mean";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsObvMeanValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsObvMeanCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * On-balance Volume Mean
     * Returns the On-balance Volume Mean values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoOnBalanceVolumeMean
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoOnBalanceVolumeMean getCryptoPriceTechnicalsObvMean(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoOnBalanceVolumeMean> resp = getCryptoPriceTechnicalsObvMeanWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * On-balance Volume Mean
     * Returns the On-balance Volume Mean values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoOnBalanceVolumeMean&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoOnBalanceVolumeMean> getCryptoPriceTechnicalsObvMeanWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsObvMeanValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoOnBalanceVolumeMean>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * On-balance Volume Mean (asynchronously)
     * Returns the On-balance Volume Mean values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate On-balance Volume Mean. (optional, default to 10)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsObvMeanAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoOnBalanceVolumeMean> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsObvMeanValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoOnBalanceVolumeMean>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsRsi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Relative Strength Index. (optional, default to 14)
     * @param priceKey The Crypto Currency Price field to use when calculating Relative Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsRsiCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/rsi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsRsiValidateBeforeCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsRsiCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Relative Strength Index
     * Returns the Relative Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Relative Strength Index. (optional, default to 14)
     * @param priceKey The Crypto Currency Price field to use when calculating Relative Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoRelativeStrengthIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoRelativeStrengthIndex getCryptoPriceTechnicalsRsi(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoRelativeStrengthIndex> resp = getCryptoPriceTechnicalsRsiWithHttpInfo(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Relative Strength Index
     * Returns the Relative Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Relative Strength Index. (optional, default to 14)
     * @param priceKey The Crypto Currency Price field to use when calculating Relative Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoRelativeStrengthIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoRelativeStrengthIndex> getCryptoPriceTechnicalsRsiWithHttpInfo(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsRsiValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoRelativeStrengthIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Relative Strength Index (asynchronously)
     * Returns the Relative Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Relative Strength Index. (optional, default to 14)
     * @param priceKey The Crypto Currency Price field to use when calculating Relative Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsRsiAsync(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoRelativeStrengthIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsRsiValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoRelativeStrengthIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsSma
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Simple Moving Average. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Simple Moving Average. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsSmaCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/sma";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsSmaValidateBeforeCall(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsSmaCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Simple Moving Average
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Simple Moving Average. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Simple Moving Average. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoSimpleMovingAverage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoSimpleMovingAverage getCryptoPriceTechnicalsSma(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoSimpleMovingAverage> resp = getCryptoPriceTechnicalsSmaWithHttpInfo(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Simple Moving Average
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Simple Moving Average. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Simple Moving Average. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoSimpleMovingAverage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoSimpleMovingAverage> getCryptoPriceTechnicalsSmaWithHttpInfo(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsSmaValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoSimpleMovingAverage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Simple Moving Average (asynchronously)
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Simple Moving Average. (optional, default to 20)
     * @param priceKey The Crypto Currency Price field to use when calculating Simple Moving Average. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsSmaAsync(String pair, String exchange, String currency, Integer period, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoSimpleMovingAverage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsSmaValidateBeforeCall(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoSimpleMovingAverage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsSr
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator. (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator. (optional, default to 3)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsSrCall(String pair, String exchange, String currency, Integer period, Integer signalPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/sr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
        if (signalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("signal_period", signalPeriod));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsSrValidateBeforeCall(String pair, String exchange, String currency, Integer period, Integer signalPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsSrCall(pair, exchange, currency, period, signalPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Stochastic Oscillator
     * Returns the Stochastic Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator. (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator. (optional, default to 3)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoStochasticOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoStochasticOscillator getCryptoPriceTechnicalsSr(String pair, String exchange, String currency, Integer period, Integer signalPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoStochasticOscillator> resp = getCryptoPriceTechnicalsSrWithHttpInfo(pair, exchange, currency, period, signalPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Stochastic Oscillator
     * Returns the Stochastic Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator. (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator. (optional, default to 3)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoStochasticOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoStochasticOscillator> getCryptoPriceTechnicalsSrWithHttpInfo(String pair, String exchange, String currency, Integer period, Integer signalPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsSrValidateBeforeCall(pair, exchange, currency, period, signalPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoStochasticOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Stochastic Oscillator (asynchronously)
     * Returns the Stochastic Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate %K of Stochastic Oscillator. (optional, default to 14)
     * @param signalPeriod The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator. (optional, default to 3)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsSrAsync(String pair, String exchange, String currency, Integer period, Integer signalPeriod, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoStochasticOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsSrValidateBeforeCall(pair, exchange, currency, period, signalPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoStochasticOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsTrix
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average. (optional, default to 15)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsTrixCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/trix";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsTrixValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsTrixCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Triple Exponential Average
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average. (optional, default to 15)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoTripleExponentialAverage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoTripleExponentialAverage getCryptoPriceTechnicalsTrix(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoTripleExponentialAverage> resp = getCryptoPriceTechnicalsTrixWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Triple Exponential Average
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average. (optional, default to 15)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoTripleExponentialAverage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoTripleExponentialAverage> getCryptoPriceTechnicalsTrixWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsTrixValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoTripleExponentialAverage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Triple Exponential Average (asynchronously)
     * Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average. (optional, default to 15)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsTrixAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoTripleExponentialAverage> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsTrixValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoTripleExponentialAverage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsTsi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 25)
     * @param priceKey The Crypto Currency Price field to use when calculating True Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsTsiCall(String pair, String exchange, String currency, Integer lowPeriod, Integer highPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/tsi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (lowPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("low_period", lowPeriod));
        if (highPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("high_period", highPeriod));
        if (priceKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("price_key", priceKey));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsTsiValidateBeforeCall(String pair, String exchange, String currency, Integer lowPeriod, Integer highPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsTsiCall(pair, exchange, currency, lowPeriod, highPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * True Strength Index
     * Returns the True Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 25)
     * @param priceKey The Crypto Currency Price field to use when calculating True Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoTrueStrengthIndex
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoTrueStrengthIndex getCryptoPriceTechnicalsTsi(String pair, String exchange, String currency, Integer lowPeriod, Integer highPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoTrueStrengthIndex> resp = getCryptoPriceTechnicalsTsiWithHttpInfo(pair, exchange, currency, lowPeriod, highPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * True Strength Index
     * Returns the True Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 25)
     * @param priceKey The Crypto Currency Price field to use when calculating True Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoTrueStrengthIndex&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoTrueStrengthIndex> getCryptoPriceTechnicalsTsiWithHttpInfo(String pair, String exchange, String currency, Integer lowPeriod, Integer highPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsTsiValidateBeforeCall(pair, exchange, currency, lowPeriod, highPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoTrueStrengthIndex>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * True Strength Index (asynchronously)
     * Returns the True Strength Index values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param lowPeriod The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 13)
     * @param highPeriod The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index. (optional, default to 25)
     * @param priceKey The Crypto Currency Price field to use when calculating True Strength Index. (optional, default to close)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsTsiAsync(String pair, String exchange, String currency, Integer lowPeriod, Integer highPeriod, String priceKey, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoTrueStrengthIndex> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsTsiValidateBeforeCall(pair, exchange, currency, lowPeriod, highPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoTrueStrengthIndex>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsUo
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator. (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator. (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator. (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator. (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator. (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator. (optional, default to 1.0)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsUoCall(String pair, String exchange, String currency, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/uo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsUoValidateBeforeCall(String pair, String exchange, String currency, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsUoCall(pair, exchange, currency, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Ultimate Oscillator
     * Returns the Ultimate Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator. (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator. (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator. (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator. (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator. (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator. (optional, default to 1.0)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoUltimateOscillator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoUltimateOscillator getCryptoPriceTechnicalsUo(String pair, String exchange, String currency, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoUltimateOscillator> resp = getCryptoPriceTechnicalsUoWithHttpInfo(pair, exchange, currency, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Ultimate Oscillator
     * Returns the Ultimate Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator. (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator. (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator. (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator. (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator. (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator. (optional, default to 1.0)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoUltimateOscillator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoUltimateOscillator> getCryptoPriceTechnicalsUoWithHttpInfo(String pair, String exchange, String currency, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsUoValidateBeforeCall(pair, exchange, currency, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoUltimateOscillator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ultimate Oscillator (asynchronously)
     * Returns the Ultimate Oscillator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param shortPeriod The number of observations, per period, to calculate the short period for Ultimate Oscillator. (optional, default to 7)
     * @param mediumPeriod The number of observations, per period, to calculate the medium period for Ultimate Oscillator. (optional, default to 14)
     * @param longPeriod The number of observations, per period, to calculate the long period for Ultimate Oscillator. (optional, default to 28)
     * @param shortWeight The weight of short Buying Pressure average for Ultimate Oscillator. (optional, default to 4.0)
     * @param mediumWeight The weight of medium Buying Pressure average for Ultimate Oscillator. (optional, default to 2.0)
     * @param longWeight The weight of long Buying Pressure average for Ultimate Oscillator. (optional, default to 1.0)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsUoAsync(String pair, String exchange, String currency, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoUltimateOscillator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsUoValidateBeforeCall(pair, exchange, currency, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoUltimateOscillator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsVi
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Vortex Indicator. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsViCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/vi";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsViValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsViCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Vortex Indicator
     * Returns the Vortex Indicator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Vortex Indicator. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoVortexIndicator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoVortexIndicator getCryptoPriceTechnicalsVi(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoVortexIndicator> resp = getCryptoPriceTechnicalsViWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Vortex Indicator
     * Returns the Vortex Indicator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Vortex Indicator. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoVortexIndicator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoVortexIndicator> getCryptoPriceTechnicalsViWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsViValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoVortexIndicator>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Vortex Indicator (asynchronously)
     * Returns the Vortex Indicator values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to calculate Vortex Indicator. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsViAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoVortexIndicator> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsViValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoVortexIndicator>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsVpt
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsVptCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/vpt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsVptValidateBeforeCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsVptCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Volume-price Trend
     * Returns the Volume-price Trend values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoVolumePriceTrend
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoVolumePriceTrend getCryptoPriceTechnicalsVpt(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoVolumePriceTrend> resp = getCryptoPriceTechnicalsVptWithHttpInfo(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Volume-price Trend
     * Returns the Volume-price Trend values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoVolumePriceTrend&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoVolumePriceTrend> getCryptoPriceTechnicalsVptWithHttpInfo(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsVptValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoVolumePriceTrend>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Volume-price Trend (asynchronously)
     * Returns the Volume-price Trend values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsVptAsync(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoVolumePriceTrend> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsVptValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoVolumePriceTrend>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsVwap
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsVwapCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/vwap";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsVwapValidateBeforeCall(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsVwapCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Volume Weighted Average Price
     * Returns the Volume Weighted Average Price values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoVolumeWeightedAveragePrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoVolumeWeightedAveragePrice getCryptoPriceTechnicalsVwap(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoVolumeWeightedAveragePrice> resp = getCryptoPriceTechnicalsVwapWithHttpInfo(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Volume Weighted Average Price
     * Returns the Volume Weighted Average Price values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoVolumeWeightedAveragePrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoVolumeWeightedAveragePrice> getCryptoPriceTechnicalsVwapWithHttpInfo(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsVwapValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoVolumeWeightedAveragePrice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Volume Weighted Average Price (asynchronously)
     * Returns the Volume Weighted Average Price values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsVwapAsync(String pair, String exchange, String currency, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoVolumeWeightedAveragePrice> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsVwapValidateBeforeCall(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoVolumeWeightedAveragePrice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCryptoPriceTechnicalsWr
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to look-back when calculating Williams %R. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsWrCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/crypto/prices/technicals/wr";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pair != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pair", pair));
        if (exchange != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange", exchange));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));
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
    private com.squareup.okhttp.Call getCryptoPriceTechnicalsWrValidateBeforeCall(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsWrCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Williams %R
     * Returns the Williams %R values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to look-back when calculating Williams %R. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCryptoWilliamsR
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseCryptoWilliamsR getCryptoPriceTechnicalsWr(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseCryptoWilliamsR> resp = getCryptoPriceTechnicalsWrWithHttpInfo(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Williams %R
     * Returns the Williams %R values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to look-back when calculating Williams %R. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCryptoWilliamsR&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCryptoWilliamsR> getCryptoPriceTechnicalsWrWithHttpInfo(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsWrValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoWilliamsR>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Williams %R (asynchronously)
     * Returns the Williams %R values of Crypto Currency Prices for a Crypto Currency Pair
     * @param pair Return technicals for the given Crypto Currency Pair. (optional)
     * @param exchange Return technicals for a Crypto Currency on the given Crypto Exchange. (optional)
     * @param currency Return technicals for the given Crypto Currency. (optional)
     * @param period The number of observations, per period, to look-back when calculating Williams %R. (optional, default to 14)
     * @param timeframe The time interval for the prices when calculating technicals. (optional, default to d1)
     * @param timezone Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. (optional, default to UTC)
     * @param startDate Return technicals on or after this date. (optional)
     * @param startTime Return technicals at or after this time (24-hour). (optional)
     * @param endDate Return technicals on or before this date. (optional)
     * @param endTime Return technicals at or before this time (24-hour). (optional)
     * @param pageSize An integer greater than or equal to 1 for specifying the number of results on each page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCryptoPriceTechnicalsWrAsync(String pair, String exchange, String currency, Integer period, String timeframe, String timezone, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCryptoWilliamsR> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCryptoPriceTechnicalsWrValidateBeforeCall(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCryptoWilliamsR>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
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
     */
    public ApiResponseSecurityAccumulationDistributionIndex getSecurityPriceTechnicalsAdi(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityAccumulationDistributionIndex> resp = getSecurityPriceTechnicalsAdiWithHttpInfo(identifier, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityAverageDailyTradingVolume getSecurityPriceTechnicalsAdtv(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityAverageDailyTradingVolume> resp = getSecurityPriceTechnicalsAdtvWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityAverageDirectionalIndex getSecurityPriceTechnicalsAdx(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityAverageDirectionalIndex> resp = getSecurityPriceTechnicalsAdxWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityAwesomeOscillator getSecurityPriceTechnicalsAo(String identifier, Integer shortPeriod, Integer longPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityAwesomeOscillator> resp = getSecurityPriceTechnicalsAoWithHttpInfo(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityAverageTrueRange getSecurityPriceTechnicalsAtr(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityAverageTrueRange> resp = getSecurityPriceTechnicalsAtrWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityBollingerBands getSecurityPriceTechnicalsBb(String identifier, Integer period, Float standardDeviations, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityBollingerBands> resp = getSecurityPriceTechnicalsBbWithHttpInfo(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityCommodityChannelIndex getSecurityPriceTechnicalsCci(String identifier, Integer period, Float constant, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityCommodityChannelIndex> resp = getSecurityPriceTechnicalsCciWithHttpInfo(identifier, period, constant, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityChaikinMoneyFlow getSecurityPriceTechnicalsCmf(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityChaikinMoneyFlow> resp = getSecurityPriceTechnicalsCmfWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityDonchianChannel getSecurityPriceTechnicalsDc(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityDonchianChannel> resp = getSecurityPriceTechnicalsDcWithHttpInfo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityDetrendedPriceOscillator getSecurityPriceTechnicalsDpo(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityDetrendedPriceOscillator> resp = getSecurityPriceTechnicalsDpoWithHttpInfo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityEaseOfMovement getSecurityPriceTechnicalsEom(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityEaseOfMovement> resp = getSecurityPriceTechnicalsEomWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityForceIndex getSecurityPriceTechnicalsFi(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityForceIndex> resp = getSecurityPriceTechnicalsFiWithHttpInfo(identifier, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityIchimokuKinkoHyo getSecurityPriceTechnicalsIchimoku(String identifier, Integer lowPeriod, Integer mediumPeriod, Integer highPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityIchimokuKinkoHyo> resp = getSecurityPriceTechnicalsIchimokuWithHttpInfo(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityKeltnerChannel getSecurityPriceTechnicalsKc(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityKeltnerChannel> resp = getSecurityPriceTechnicalsKcWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityKnowSureThing getSecurityPriceTechnicalsKst(String identifier, Integer roc1, Integer roc2, Integer roc3, Integer roc4, Integer sma1, Integer sma2, Integer sma3, Integer sma4, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityKnowSureThing> resp = getSecurityPriceTechnicalsKstWithHttpInfo(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityMovingAverageConvergenceDivergence getSecurityPriceTechnicalsMacd(String identifier, Integer fastPeriod, Integer slowPeriod, Integer signalPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityMovingAverageConvergenceDivergence> resp = getSecurityPriceTechnicalsMacdWithHttpInfo(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityMoneyFlowIndex getSecurityPriceTechnicalsMfi(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityMoneyFlowIndex> resp = getSecurityPriceTechnicalsMfiWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityMassIndex getSecurityPriceTechnicalsMi(String identifier, Integer emaPeriod, Integer sumPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityMassIndex> resp = getSecurityPriceTechnicalsMiWithHttpInfo(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityNegativeVolumeIndex getSecurityPriceTechnicalsNvi(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityNegativeVolumeIndex> resp = getSecurityPriceTechnicalsNviWithHttpInfo(identifier, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityOnBalanceVolume getSecurityPriceTechnicalsObv(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityOnBalanceVolume> resp = getSecurityPriceTechnicalsObvWithHttpInfo(identifier, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityOnBalanceVolumeMean getSecurityPriceTechnicalsObvMean(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityOnBalanceVolumeMean> resp = getSecurityPriceTechnicalsObvMeanWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityRelativeStrengthIndex getSecurityPriceTechnicalsRsi(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityRelativeStrengthIndex> resp = getSecurityPriceTechnicalsRsiWithHttpInfo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecuritySimpleMovingAverage getSecurityPriceTechnicalsSma(String identifier, Integer period, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecuritySimpleMovingAverage> resp = getSecurityPriceTechnicalsSmaWithHttpInfo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityStochasticOscillator getSecurityPriceTechnicalsSr(String identifier, Integer period, Integer signalPeriod, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityStochasticOscillator> resp = getSecurityPriceTechnicalsSrWithHttpInfo(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityTripleExponentialAverage getSecurityPriceTechnicalsTrix(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityTripleExponentialAverage> resp = getSecurityPriceTechnicalsTrixWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityTrueStrengthIndex getSecurityPriceTechnicalsTsi(String identifier, Integer lowPeriod, Integer highPeriod, String priceKey, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityTrueStrengthIndex> resp = getSecurityPriceTechnicalsTsiWithHttpInfo(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityUltimateOscillator getSecurityPriceTechnicalsUo(String identifier, Integer shortPeriod, Integer mediumPeriod, Integer longPeriod, Float shortWeight, Float mediumWeight, Float longWeight, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityUltimateOscillator> resp = getSecurityPriceTechnicalsUoWithHttpInfo(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityVortexIndicator getSecurityPriceTechnicalsVi(String identifier, Integer period, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityVortexIndicator> resp = getSecurityPriceTechnicalsViWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityVolumePriceTrend getSecurityPriceTechnicalsVpt(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityVolumePriceTrend> resp = getSecurityPriceTechnicalsVptWithHttpInfo(identifier, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityVolumeWeightedAveragePrice getSecurityPriceTechnicalsVwap(String identifier, String startDate, String endDate, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityVolumeWeightedAveragePrice> resp = getSecurityPriceTechnicalsVwapWithHttpInfo(identifier, startDate, endDate, pageSize, nextPage);
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
     */
    public ApiResponseSecurityWilliamsR getSecurityPriceTechnicalsWr(String identifier, Integer period, String startDate, String endDate, BigDecimal pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseSecurityWilliamsR> resp = getSecurityPriceTechnicalsWrWithHttpInfo(identifier, period, startDate, endDate, pageSize, nextPage);
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
