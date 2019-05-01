

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


import com.intrinio.models.ApiResponseZacksAnalystRatings;
import com.intrinio.models.ApiResponseZacksEPSSurprises;
import com.intrinio.models.ApiResponseZacksSalesSurprises;
import java.math.BigDecimal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZacksApi {
    private ApiClient apiClient;

    public ZacksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZacksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getZacksAnalystRatings
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param startDate Limit ratings to those on or after this date (optional)
     * @param endDate Limit ratings to those on or before this date (optional)
     * @param meanGreater Return only records with a mean (average) higher than this value (optional)
     * @param meanLess Return only records with a mean (average) lower than this value (optional)
     * @param strongBuysGreater Return only records with more than this many Strong Buy recommendations (optional)
     * @param strongBuysLess Return only records with fewer than this many Strong Buy recommendations (optional)
     * @param buysGreater Return only records with more than this many Buy recommendations (optional)
     * @param buysLess Return only records with fewer than this many Buy recommendations (optional)
     * @param holdsGreater Return only records with more than this many Hold recommendations (optional)
     * @param holdsLess Return only records with fewer than this many Hold recommendations (optional)
     * @param sellsGreater Return only records with more than this many Sell recommendations (optional)
     * @param sellsLess Return only records with fewer than this many Sell recommendations (optional)
     * @param strongSellsGreater Return only records with more than this many Strong Sell recommendations (optional)
     * @param strongSellsLess Return only records with fewer than this many Strong Sell recommendations (optional)
     * @param totalGreater Return only records with more than this many recommendations, regardless of type (optional)
     * @param totalLess Return only records with fewer than this many recommendations, regardless of type (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksAnalystRatingsCall(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/analyst_ratings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifier", identifier));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (meanGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mean_greater", meanGreater));
        if (meanLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mean_less", meanLess));
        if (strongBuysGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strong_buys_greater", strongBuysGreater));
        if (strongBuysLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strong_buys_less", strongBuysLess));
        if (buysGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("buys_greater", buysGreater));
        if (buysLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("buys_less", buysLess));
        if (holdsGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("holds_greater", holdsGreater));
        if (holdsLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("holds_less", holdsLess));
        if (sellsGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sells_greater", sellsGreater));
        if (sellsLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sells_less", sellsLess));
        if (strongSellsGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strong_sells_greater", strongSellsGreater));
        if (strongSellsLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strong_sells_less", strongSellsLess));
        if (totalGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("total_greater", totalGreater));
        if (totalLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("total_less", totalLess));
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
    private com.squareup.okhttp.Call getZacksAnalystRatingsValidateBeforeCall(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksAnalystRatingsCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Analyst Ratings
     * Returns buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. Zack’s storied research team aggregates and validates the ratings from professional analysts.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param startDate Limit ratings to those on or after this date (optional)
     * @param endDate Limit ratings to those on or before this date (optional)
     * @param meanGreater Return only records with a mean (average) higher than this value (optional)
     * @param meanLess Return only records with a mean (average) lower than this value (optional)
     * @param strongBuysGreater Return only records with more than this many Strong Buy recommendations (optional)
     * @param strongBuysLess Return only records with fewer than this many Strong Buy recommendations (optional)
     * @param buysGreater Return only records with more than this many Buy recommendations (optional)
     * @param buysLess Return only records with fewer than this many Buy recommendations (optional)
     * @param holdsGreater Return only records with more than this many Hold recommendations (optional)
     * @param holdsLess Return only records with fewer than this many Hold recommendations (optional)
     * @param sellsGreater Return only records with more than this many Sell recommendations (optional)
     * @param sellsLess Return only records with fewer than this many Sell recommendations (optional)
     * @param strongSellsGreater Return only records with more than this many Strong Sell recommendations (optional)
     * @param strongSellsLess Return only records with fewer than this many Strong Sell recommendations (optional)
     * @param totalGreater Return only records with more than this many recommendations, regardless of type (optional)
     * @param totalLess Return only records with fewer than this many recommendations, regardless of type (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksAnalystRatings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseZacksAnalystRatings getZacksAnalystRatings(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseZacksAnalystRatings> resp = getZacksAnalystRatingsWithHttpInfo(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Zacks Analyst Ratings
     * Returns buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. Zack’s storied research team aggregates and validates the ratings from professional analysts.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param startDate Limit ratings to those on or after this date (optional)
     * @param endDate Limit ratings to those on or before this date (optional)
     * @param meanGreater Return only records with a mean (average) higher than this value (optional)
     * @param meanLess Return only records with a mean (average) lower than this value (optional)
     * @param strongBuysGreater Return only records with more than this many Strong Buy recommendations (optional)
     * @param strongBuysLess Return only records with fewer than this many Strong Buy recommendations (optional)
     * @param buysGreater Return only records with more than this many Buy recommendations (optional)
     * @param buysLess Return only records with fewer than this many Buy recommendations (optional)
     * @param holdsGreater Return only records with more than this many Hold recommendations (optional)
     * @param holdsLess Return only records with fewer than this many Hold recommendations (optional)
     * @param sellsGreater Return only records with more than this many Sell recommendations (optional)
     * @param sellsLess Return only records with fewer than this many Sell recommendations (optional)
     * @param strongSellsGreater Return only records with more than this many Strong Sell recommendations (optional)
     * @param strongSellsLess Return only records with fewer than this many Strong Sell recommendations (optional)
     * @param totalGreater Return only records with more than this many recommendations, regardless of type (optional)
     * @param totalLess Return only records with fewer than this many recommendations, regardless of type (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksAnalystRatings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksAnalystRatings> getZacksAnalystRatingsWithHttpInfo(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksAnalystRatingsValidateBeforeCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksAnalystRatings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Analyst Ratings (asynchronously)
     * Returns buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. Zack’s storied research team aggregates and validates the ratings from professional analysts.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param startDate Limit ratings to those on or after this date (optional)
     * @param endDate Limit ratings to those on or before this date (optional)
     * @param meanGreater Return only records with a mean (average) higher than this value (optional)
     * @param meanLess Return only records with a mean (average) lower than this value (optional)
     * @param strongBuysGreater Return only records with more than this many Strong Buy recommendations (optional)
     * @param strongBuysLess Return only records with fewer than this many Strong Buy recommendations (optional)
     * @param buysGreater Return only records with more than this many Buy recommendations (optional)
     * @param buysLess Return only records with fewer than this many Buy recommendations (optional)
     * @param holdsGreater Return only records with more than this many Hold recommendations (optional)
     * @param holdsLess Return only records with fewer than this many Hold recommendations (optional)
     * @param sellsGreater Return only records with more than this many Sell recommendations (optional)
     * @param sellsLess Return only records with fewer than this many Sell recommendations (optional)
     * @param strongSellsGreater Return only records with more than this many Strong Sell recommendations (optional)
     * @param strongSellsLess Return only records with fewer than this many Strong Sell recommendations (optional)
     * @param totalGreater Return only records with more than this many recommendations, regardless of type (optional)
     * @param totalLess Return only records with fewer than this many recommendations, regardless of type (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksAnalystRatingsAsync(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksAnalystRatings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksAnalystRatingsValidateBeforeCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksAnalystRatings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksEpsSurprises
     * @param startDate Limit EPS surprises to those on or after this date (optional)
     * @param endDate Limit EPS surprises to those on or before this date (optional)
     * @param epsActualGreater Return only records with an actual EPS higher than this value (optional)
     * @param epsActualLess Return only records with an actual EPS lower than this value (optional)
     * @param epsMeanEstimateGreater Return only records with an EPS mean estimate greater than this value (optional)
     * @param epsMeanEstimateLess Return only records with an EPS mean estimate lower than this value (optional)
     * @param epsAmountDiffGreater Return only records with an EPS amount difference greater than this value (optional)
     * @param epsAmountDiffLess Return only records with an EPS amount difference less than this value (optional)
     * @param epsPercentDiffGreater Return only records with an EPS percent difference greater than this value (optional)
     * @param epsPercentDiffLess Return only records with an EPS percent difference less than this value (optional)
     * @param epsCountEstimateGreater Return only records with an EPS count estimate greater than this value (optional)
     * @param epsCountEstimateLess Return only records with an EPS count estimate less than this value (optional)
     * @param epsStdDevEstimateGreater Return only records with an EPS standard deviation greater than this value (optional)
     * @param epsStdDevEstimateLess Return only records with an EPS standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksEpsSurprisesCall(String startDate, String endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/eps_surprises";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (epsActualGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_actual_greater", epsActualGreater));
        if (epsActualLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_actual_less", epsActualLess));
        if (epsMeanEstimateGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_mean_estimate_greater", epsMeanEstimateGreater));
        if (epsMeanEstimateLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_mean_estimate_less", epsMeanEstimateLess));
        if (epsAmountDiffGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_amount_diff_greater", epsAmountDiffGreater));
        if (epsAmountDiffLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_amount_diff_less", epsAmountDiffLess));
        if (epsPercentDiffGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_percent_diff_greater", epsPercentDiffGreater));
        if (epsPercentDiffLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_percent_diff_less", epsPercentDiffLess));
        if (epsCountEstimateGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_count_estimate_greater", epsCountEstimateGreater));
        if (epsCountEstimateLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_count_estimate_less", epsCountEstimateLess));
        if (epsStdDevEstimateGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_std_dev_estimate_greater", epsStdDevEstimateGreater));
        if (epsStdDevEstimateLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("eps_std_dev_estimate_less", epsStdDevEstimateLess));
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
    private com.squareup.okhttp.Call getZacksEpsSurprisesValidateBeforeCall(String startDate, String endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksEpsSurprisesCall(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks EPS Surprises
     * Returns Zacks eps surprise data for all Securities.
     * @param startDate Limit EPS surprises to those on or after this date (optional)
     * @param endDate Limit EPS surprises to those on or before this date (optional)
     * @param epsActualGreater Return only records with an actual EPS higher than this value (optional)
     * @param epsActualLess Return only records with an actual EPS lower than this value (optional)
     * @param epsMeanEstimateGreater Return only records with an EPS mean estimate greater than this value (optional)
     * @param epsMeanEstimateLess Return only records with an EPS mean estimate lower than this value (optional)
     * @param epsAmountDiffGreater Return only records with an EPS amount difference greater than this value (optional)
     * @param epsAmountDiffLess Return only records with an EPS amount difference less than this value (optional)
     * @param epsPercentDiffGreater Return only records with an EPS percent difference greater than this value (optional)
     * @param epsPercentDiffLess Return only records with an EPS percent difference less than this value (optional)
     * @param epsCountEstimateGreater Return only records with an EPS count estimate greater than this value (optional)
     * @param epsCountEstimateLess Return only records with an EPS count estimate less than this value (optional)
     * @param epsStdDevEstimateGreater Return only records with an EPS standard deviation greater than this value (optional)
     * @param epsStdDevEstimateLess Return only records with an EPS standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksEPSSurprises
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseZacksEPSSurprises getZacksEpsSurprises(String startDate, String endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseZacksEPSSurprises> resp = getZacksEpsSurprisesWithHttpInfo(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Zacks EPS Surprises
     * Returns Zacks eps surprise data for all Securities.
     * @param startDate Limit EPS surprises to those on or after this date (optional)
     * @param endDate Limit EPS surprises to those on or before this date (optional)
     * @param epsActualGreater Return only records with an actual EPS higher than this value (optional)
     * @param epsActualLess Return only records with an actual EPS lower than this value (optional)
     * @param epsMeanEstimateGreater Return only records with an EPS mean estimate greater than this value (optional)
     * @param epsMeanEstimateLess Return only records with an EPS mean estimate lower than this value (optional)
     * @param epsAmountDiffGreater Return only records with an EPS amount difference greater than this value (optional)
     * @param epsAmountDiffLess Return only records with an EPS amount difference less than this value (optional)
     * @param epsPercentDiffGreater Return only records with an EPS percent difference greater than this value (optional)
     * @param epsPercentDiffLess Return only records with an EPS percent difference less than this value (optional)
     * @param epsCountEstimateGreater Return only records with an EPS count estimate greater than this value (optional)
     * @param epsCountEstimateLess Return only records with an EPS count estimate less than this value (optional)
     * @param epsStdDevEstimateGreater Return only records with an EPS standard deviation greater than this value (optional)
     * @param epsStdDevEstimateLess Return only records with an EPS standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksEPSSurprises&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksEPSSurprises> getZacksEpsSurprisesWithHttpInfo(String startDate, String endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksEpsSurprisesValidateBeforeCall(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksEPSSurprises>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks EPS Surprises (asynchronously)
     * Returns Zacks eps surprise data for all Securities.
     * @param startDate Limit EPS surprises to those on or after this date (optional)
     * @param endDate Limit EPS surprises to those on or before this date (optional)
     * @param epsActualGreater Return only records with an actual EPS higher than this value (optional)
     * @param epsActualLess Return only records with an actual EPS lower than this value (optional)
     * @param epsMeanEstimateGreater Return only records with an EPS mean estimate greater than this value (optional)
     * @param epsMeanEstimateLess Return only records with an EPS mean estimate lower than this value (optional)
     * @param epsAmountDiffGreater Return only records with an EPS amount difference greater than this value (optional)
     * @param epsAmountDiffLess Return only records with an EPS amount difference less than this value (optional)
     * @param epsPercentDiffGreater Return only records with an EPS percent difference greater than this value (optional)
     * @param epsPercentDiffLess Return only records with an EPS percent difference less than this value (optional)
     * @param epsCountEstimateGreater Return only records with an EPS count estimate greater than this value (optional)
     * @param epsCountEstimateLess Return only records with an EPS count estimate less than this value (optional)
     * @param epsStdDevEstimateGreater Return only records with an EPS standard deviation greater than this value (optional)
     * @param epsStdDevEstimateLess Return only records with an EPS standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksEpsSurprisesAsync(String startDate, String endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksEPSSurprises> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksEpsSurprisesValidateBeforeCall(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksEPSSurprises>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksSalesSurprises
     * @param startDate Limit sales surprises to those on or after this date (optional)
     * @param endDate Limit sales surprises to those on or before this date (optional)
     * @param salesActualGreater Return only records with an actual sales higher than this value (optional)
     * @param salesActualLess Return only records with an actual sales lower than this value (optional)
     * @param salesMeanEstimateGreater Return only records with a sales mean estimate greater than this value (optional)
     * @param salesMeanEstimateLess Return only records with a sales mean estimate lower than this value (optional)
     * @param salesAmountDiffGreater Return only records with a sales amount difference greater than this value (optional)
     * @param salesAmountDiffLess Return only records with a sales amount difference less than this value (optional)
     * @param salesPercentDiffGreater Return only records with a sales percent difference greater than this value (optional)
     * @param salesPercentDiffLess Return only records with a sales percent difference less than this value (optional)
     * @param salesCountEstimateGreater Return only records with a sales count estimate greater than this value (optional)
     * @param salesCountEstimateLess Return only records with a sales count estimate less than this value (optional)
     * @param salesStdDevEstimateGreater Return only records with a sales standard deviation greater than this value (optional)
     * @param salesStdDevEstimateLess Return only records with a sales standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksSalesSurprisesCall(String startDate, String endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/sales_surprises";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (salesActualGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_actual_greater", salesActualGreater));
        if (salesActualLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_actual_less", salesActualLess));
        if (salesMeanEstimateGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_mean_estimate_greater", salesMeanEstimateGreater));
        if (salesMeanEstimateLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_mean_estimate_less", salesMeanEstimateLess));
        if (salesAmountDiffGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_amount_diff_greater", salesAmountDiffGreater));
        if (salesAmountDiffLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_amount_diff_less", salesAmountDiffLess));
        if (salesPercentDiffGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_percent_diff_greater", salesPercentDiffGreater));
        if (salesPercentDiffLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_percent_diff_less", salesPercentDiffLess));
        if (salesCountEstimateGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_count_estimate_greater", salesCountEstimateGreater));
        if (salesCountEstimateLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_count_estimate_less", salesCountEstimateLess));
        if (salesStdDevEstimateGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_std_dev_estimate_greater", salesStdDevEstimateGreater));
        if (salesStdDevEstimateLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sales_std_dev_estimate_less", salesStdDevEstimateLess));
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
    private com.squareup.okhttp.Call getZacksSalesSurprisesValidateBeforeCall(String startDate, String endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksSalesSurprisesCall(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Sales Surprises
     * Returns Zacks sales surprise data for all Securities.
     * @param startDate Limit sales surprises to those on or after this date (optional)
     * @param endDate Limit sales surprises to those on or before this date (optional)
     * @param salesActualGreater Return only records with an actual sales higher than this value (optional)
     * @param salesActualLess Return only records with an actual sales lower than this value (optional)
     * @param salesMeanEstimateGreater Return only records with a sales mean estimate greater than this value (optional)
     * @param salesMeanEstimateLess Return only records with a sales mean estimate lower than this value (optional)
     * @param salesAmountDiffGreater Return only records with a sales amount difference greater than this value (optional)
     * @param salesAmountDiffLess Return only records with a sales amount difference less than this value (optional)
     * @param salesPercentDiffGreater Return only records with a sales percent difference greater than this value (optional)
     * @param salesPercentDiffLess Return only records with a sales percent difference less than this value (optional)
     * @param salesCountEstimateGreater Return only records with a sales count estimate greater than this value (optional)
     * @param salesCountEstimateLess Return only records with a sales count estimate less than this value (optional)
     * @param salesStdDevEstimateGreater Return only records with a sales standard deviation greater than this value (optional)
     * @param salesStdDevEstimateLess Return only records with a sales standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksSalesSurprises
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseZacksSalesSurprises getZacksSalesSurprises(String startDate, String endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException {
        ApiResponse<ApiResponseZacksSalesSurprises> resp = getZacksSalesSurprisesWithHttpInfo(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage);
        return resp.getData();
    }

    /**
     * Zacks Sales Surprises
     * Returns Zacks sales surprise data for all Securities.
     * @param startDate Limit sales surprises to those on or after this date (optional)
     * @param endDate Limit sales surprises to those on or before this date (optional)
     * @param salesActualGreater Return only records with an actual sales higher than this value (optional)
     * @param salesActualLess Return only records with an actual sales lower than this value (optional)
     * @param salesMeanEstimateGreater Return only records with a sales mean estimate greater than this value (optional)
     * @param salesMeanEstimateLess Return only records with a sales mean estimate lower than this value (optional)
     * @param salesAmountDiffGreater Return only records with a sales amount difference greater than this value (optional)
     * @param salesAmountDiffLess Return only records with a sales amount difference less than this value (optional)
     * @param salesPercentDiffGreater Return only records with a sales percent difference greater than this value (optional)
     * @param salesPercentDiffLess Return only records with a sales percent difference less than this value (optional)
     * @param salesCountEstimateGreater Return only records with a sales count estimate greater than this value (optional)
     * @param salesCountEstimateLess Return only records with a sales count estimate less than this value (optional)
     * @param salesStdDevEstimateGreater Return only records with a sales standard deviation greater than this value (optional)
     * @param salesStdDevEstimateLess Return only records with a sales standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksSalesSurprises&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksSalesSurprises> getZacksSalesSurprisesWithHttpInfo(String startDate, String endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksSalesSurprisesValidateBeforeCall(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksSalesSurprises>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Sales Surprises (asynchronously)
     * Returns Zacks sales surprise data for all Securities.
     * @param startDate Limit sales surprises to those on or after this date (optional)
     * @param endDate Limit sales surprises to those on or before this date (optional)
     * @param salesActualGreater Return only records with an actual sales higher than this value (optional)
     * @param salesActualLess Return only records with an actual sales lower than this value (optional)
     * @param salesMeanEstimateGreater Return only records with a sales mean estimate greater than this value (optional)
     * @param salesMeanEstimateLess Return only records with a sales mean estimate lower than this value (optional)
     * @param salesAmountDiffGreater Return only records with a sales amount difference greater than this value (optional)
     * @param salesAmountDiffLess Return only records with a sales amount difference less than this value (optional)
     * @param salesPercentDiffGreater Return only records with a sales percent difference greater than this value (optional)
     * @param salesPercentDiffLess Return only records with a sales percent difference less than this value (optional)
     * @param salesCountEstimateGreater Return only records with a sales count estimate greater than this value (optional)
     * @param salesCountEstimateLess Return only records with a sales count estimate less than this value (optional)
     * @param salesStdDevEstimateGreater Return only records with a sales standard deviation greater than this value (optional)
     * @param salesStdDevEstimateLess Return only records with a sales standard deviation less than this value (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksSalesSurprisesAsync(String startDate, String endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksSalesSurprises> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksSalesSurprisesValidateBeforeCall(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksSalesSurprises>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
