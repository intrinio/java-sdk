

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
import com.intrinio.models.ApiResponseZacksEPSEstimates;
import com.intrinio.models.ApiResponseZacksEPSGrowthRates;
import com.intrinio.models.ApiResponseZacksEPSSurprises;
import com.intrinio.models.ApiResponseZacksETFHoldings;
import com.intrinio.models.ApiResponseZacksInstitutionalHoldingCompanies;
import com.intrinio.models.ApiResponseZacksInstitutionalHoldingOwners;
import com.intrinio.models.ApiResponseZacksInstitutionalHoldings;
import com.intrinio.models.ApiResponseZacksLongTermGrowthRates;
import com.intrinio.models.ApiResponseZacksSalesEstimates;
import com.intrinio.models.ApiResponseZacksSalesSurprises;
import com.intrinio.models.ApiResponseZacksTargetPriceConsensuses;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
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
    public com.squareup.okhttp.Call getZacksAnalystRatingsCall(String identifier, LocalDate startDate, LocalDate endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call getZacksAnalystRatingsValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksAnalystRatingsCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Analyst Ratings
     * This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.
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
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksAnalystRatings getZacksAnalystRatings(String identifier, LocalDate startDate, LocalDate endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksAnalystRatingsWithHttpInfo", String.class, LocalDate.class, LocalDate.class, BigDecimal.class, BigDecimal.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage };
      ApiResponse<ApiResponseZacksAnalystRatings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Analyst Ratings
     * This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.
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
    public ApiResponse<ApiResponseZacksAnalystRatings> getZacksAnalystRatingsWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksAnalystRatingsValidateBeforeCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksAnalystRatings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Analyst Ratings (asynchronously)
     * This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.
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
    public com.squareup.okhttp.Call getZacksAnalystRatingsAsync(String identifier, LocalDate startDate, LocalDate endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksAnalystRatings> callback) throws ApiException {

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
     * Build call for getZacksEpsEstimates
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit EPS estimates to those on or after this date (optional)
     * @param endDate Limit EPS estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksEpsEstimatesCall(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/eps_estimates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifier", identifier));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (fiscalYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_year", fiscalYear));
        if (fiscalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_period", fiscalPeriod));
        if (calendarYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("calendar_year", calendarYear));
        if (calendarPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("calendar_period", calendarPeriod));
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
    private com.squareup.okhttp.Call getZacksEpsEstimatesValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksEpsEstimatesCall(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks EPS Estimates
     * This database offers consensus earnings estimates for over 5,000 US and Canadian listed companies.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit EPS estimates to those on or after this date (optional)
     * @param endDate Limit EPS estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksEPSEstimates
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksEPSEstimates getZacksEpsEstimates(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksEpsEstimatesWithHttpInfo", String.class, LocalDate.class, LocalDate.class, Integer.class, String.class, Integer.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, pageSize, nextPage };
      ApiResponse<ApiResponseZacksEPSEstimates> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks EPS Estimates
     * This database offers consensus earnings estimates for over 5,000 US and Canadian listed companies.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit EPS estimates to those on or after this date (optional)
     * @param endDate Limit EPS estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksEPSEstimates&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksEPSEstimates> getZacksEpsEstimatesWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksEpsEstimatesValidateBeforeCall(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksEPSEstimates>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks EPS Estimates (asynchronously)
     * This database offers consensus earnings estimates for over 5,000 US and Canadian listed companies.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit EPS estimates to those on or after this date (optional)
     * @param endDate Limit EPS estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksEpsEstimatesAsync(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksEPSEstimates> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksEpsEstimatesValidateBeforeCall(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksEPSEstimates>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksEpsGrowthRates
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupName Return only growth rates for companies in the given Zacks industry group name (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksEpsGrowthRatesCall(String company, String industryGroupName, String industryGroupNumber, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/eps_growth_rates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (company != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company", company));
        if (industryGroupName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_group_name", industryGroupName));
        if (industryGroupNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_group_number", industryGroupNumber));
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
    private com.squareup.okhttp.Call getZacksEpsGrowthRatesValidateBeforeCall(String company, String industryGroupName, String industryGroupNumber, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksEpsGrowthRatesCall(company, industryGroupName, industryGroupNumber, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks EPS Growth Rates
     * This database offers consensus EPS growth rate estimates, comparing company estimates to historical company estimates, industry estimates, and S&amp;P 500 index estimates.
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupName Return only growth rates for companies in the given Zacks industry group name (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksEPSGrowthRates
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksEPSGrowthRates getZacksEpsGrowthRates(String company, String industryGroupName, String industryGroupNumber, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksEpsGrowthRatesWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { company, industryGroupName, industryGroupNumber, pageSize, nextPage };
      ApiResponse<ApiResponseZacksEPSGrowthRates> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks EPS Growth Rates
     * This database offers consensus EPS growth rate estimates, comparing company estimates to historical company estimates, industry estimates, and S&amp;P 500 index estimates.
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupName Return only growth rates for companies in the given Zacks industry group name (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksEPSGrowthRates&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksEPSGrowthRates> getZacksEpsGrowthRatesWithHttpInfo(String company, String industryGroupName, String industryGroupNumber, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksEpsGrowthRatesValidateBeforeCall(company, industryGroupName, industryGroupNumber, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksEPSGrowthRates>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks EPS Growth Rates (asynchronously)
     * This database offers consensus EPS growth rate estimates, comparing company estimates to historical company estimates, industry estimates, and S&amp;P 500 index estimates.
     * @param company Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupName Return only growth rates for companies in the given Zacks industry group name (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksEpsGrowthRatesAsync(String company, String industryGroupName, String industryGroupNumber, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksEPSGrowthRates> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksEpsGrowthRatesValidateBeforeCall(company, industryGroupName, industryGroupNumber, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksEPSGrowthRates>(){}.getType();
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
    public com.squareup.okhttp.Call getZacksEpsSurprisesCall(LocalDate startDate, LocalDate endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call getZacksEpsSurprisesValidateBeforeCall(LocalDate startDate, LocalDate endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksEpsSurprisesCall(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks EPS Surprises
     * This database returns historical estimated and actual earnings, guidance, and announcement dates for 17,000+ US and Canadian listed companies.
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
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksEPSSurprises getZacksEpsSurprises(LocalDate startDate, LocalDate endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksEpsSurprisesWithHttpInfo", LocalDate.class, LocalDate.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage };
      ApiResponse<ApiResponseZacksEPSSurprises> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks EPS Surprises
     * This database returns historical estimated and actual earnings, guidance, and announcement dates for 17,000+ US and Canadian listed companies.
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
    public ApiResponse<ApiResponseZacksEPSSurprises> getZacksEpsSurprisesWithHttpInfo(LocalDate startDate, LocalDate endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksEpsSurprisesValidateBeforeCall(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksEPSSurprises>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks EPS Surprises (asynchronously)
     * This database returns historical estimated and actual earnings, guidance, and announcement dates for 17,000+ US and Canadian listed companies.
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
    public com.squareup.okhttp.Call getZacksEpsSurprisesAsync(LocalDate startDate, LocalDate endDate, BigDecimal epsActualGreater, BigDecimal epsActualLess, BigDecimal epsMeanEstimateGreater, BigDecimal epsMeanEstimateLess, BigDecimal epsAmountDiffGreater, BigDecimal epsAmountDiffLess, BigDecimal epsPercentDiffGreater, BigDecimal epsPercentDiffLess, BigDecimal epsCountEstimateGreater, BigDecimal epsCountEstimateLess, BigDecimal epsStdDevEstimateGreater, BigDecimal epsStdDevEstimateLess, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksEPSSurprises> callback) throws ApiException {

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
     * Build call for getZacksEtfHoldings
     * @param etfTicker Return holdings of the ETF with the given ticker (optional)
     * @param holdingSymbol Return holdings where the instrument being held has the given trading symbol (optional)
     * @param weightGreater Return on the holdings with a weight greater than (optional)
     * @param weightLess Return on the holdings with a weight less than (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksEtfHoldingsCall(String etfTicker, String holdingSymbol, BigDecimal weightGreater, BigDecimal weightLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/etf_holdings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (etfTicker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("etf_ticker", etfTicker));
        if (holdingSymbol != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("holding_symbol", holdingSymbol));
        if (weightGreater != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("weight_greater", weightGreater));
        if (weightLess != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("weight_less", weightLess));
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
    private com.squareup.okhttp.Call getZacksEtfHoldingsValidateBeforeCall(String etfTicker, String holdingSymbol, BigDecimal weightGreater, BigDecimal weightLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksEtfHoldingsCall(etfTicker, holdingSymbol, weightGreater, weightLess, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks ETF Holdings
     * Returns Zacks ETF holdings data
     * @param etfTicker Return holdings of the ETF with the given ticker (optional)
     * @param holdingSymbol Return holdings where the instrument being held has the given trading symbol (optional)
     * @param weightGreater Return on the holdings with a weight greater than (optional)
     * @param weightLess Return on the holdings with a weight less than (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksETFHoldings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksETFHoldings getZacksEtfHoldings(String etfTicker, String holdingSymbol, BigDecimal weightGreater, BigDecimal weightLess, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksEtfHoldingsWithHttpInfo", String.class, String.class, BigDecimal.class, BigDecimal.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { etfTicker, holdingSymbol, weightGreater, weightLess, pageSize, nextPage };
      ApiResponse<ApiResponseZacksETFHoldings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks ETF Holdings
     * Returns Zacks ETF holdings data
     * @param etfTicker Return holdings of the ETF with the given ticker (optional)
     * @param holdingSymbol Return holdings where the instrument being held has the given trading symbol (optional)
     * @param weightGreater Return on the holdings with a weight greater than (optional)
     * @param weightLess Return on the holdings with a weight less than (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksETFHoldings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksETFHoldings> getZacksEtfHoldingsWithHttpInfo(String etfTicker, String holdingSymbol, BigDecimal weightGreater, BigDecimal weightLess, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksEtfHoldingsValidateBeforeCall(etfTicker, holdingSymbol, weightGreater, weightLess, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksETFHoldings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks ETF Holdings (asynchronously)
     * Returns Zacks ETF holdings data
     * @param etfTicker Return holdings of the ETF with the given ticker (optional)
     * @param holdingSymbol Return holdings where the instrument being held has the given trading symbol (optional)
     * @param weightGreater Return on the holdings with a weight greater than (optional)
     * @param weightLess Return on the holdings with a weight less than (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksEtfHoldingsAsync(String etfTicker, String holdingSymbol, BigDecimal weightGreater, BigDecimal weightLess, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksETFHoldings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksEtfHoldingsValidateBeforeCall(etfTicker, holdingSymbol, weightGreater, weightLess, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksETFHoldings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksInstitutionalHoldingCompanies
     * @param ticker Return companies with the given ticker (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksInstitutionalHoldingCompaniesCall(String ticker, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/institutional_holdings/companies";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ticker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ticker", ticker));
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
    private com.squareup.okhttp.Call getZacksInstitutionalHoldingCompaniesValidateBeforeCall(String ticker, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingCompaniesCall(ticker, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Institutional Holding Companies
     * Returns Zacks institutional holding companies data
     * @param ticker Return companies with the given ticker (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksInstitutionalHoldingCompanies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksInstitutionalHoldingCompanies getZacksInstitutionalHoldingCompanies(String ticker, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksInstitutionalHoldingCompaniesWithHttpInfo", String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { ticker, pageSize, nextPage };
      ApiResponse<ApiResponseZacksInstitutionalHoldingCompanies> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Institutional Holding Companies
     * Returns Zacks institutional holding companies data
     * @param ticker Return companies with the given ticker (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksInstitutionalHoldingCompanies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksInstitutionalHoldingCompanies> getZacksInstitutionalHoldingCompaniesWithHttpInfo(String ticker, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingCompaniesValidateBeforeCall(ticker, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksInstitutionalHoldingCompanies>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Institutional Holding Companies (asynchronously)
     * Returns Zacks institutional holding companies data
     * @param ticker Return companies with the given ticker (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksInstitutionalHoldingCompaniesAsync(String ticker, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksInstitutionalHoldingCompanies> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingCompaniesValidateBeforeCall(ticker, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksInstitutionalHoldingCompanies>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksInstitutionalHoldingOwners
     * @param cik Return owners with the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksInstitutionalHoldingOwnersCall(String cik, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/institutional_holdings/owners";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (cik != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cik", cik));
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
    private com.squareup.okhttp.Call getZacksInstitutionalHoldingOwnersValidateBeforeCall(String cik, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingOwnersCall(cik, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Institutional Holding Owners
     * Returns Zacks institutional holding owners data
     * @param cik Return owners with the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksInstitutionalHoldingOwners
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksInstitutionalHoldingOwners getZacksInstitutionalHoldingOwners(String cik, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksInstitutionalHoldingOwnersWithHttpInfo", String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { cik, pageSize, nextPage };
      ApiResponse<ApiResponseZacksInstitutionalHoldingOwners> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Institutional Holding Owners
     * Returns Zacks institutional holding owners data
     * @param cik Return owners with the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksInstitutionalHoldingOwners&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksInstitutionalHoldingOwners> getZacksInstitutionalHoldingOwnersWithHttpInfo(String cik, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingOwnersValidateBeforeCall(cik, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksInstitutionalHoldingOwners>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Institutional Holding Owners (asynchronously)
     * Returns Zacks institutional holding owners data
     * @param cik Return owners with the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksInstitutionalHoldingOwnersAsync(String cik, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksInstitutionalHoldingOwners> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingOwnersValidateBeforeCall(cik, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksInstitutionalHoldingOwners>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksInstitutionalHoldings
     * @param ticker Return holdings where the company being held has the given ticker (optional)
     * @param ownerCik Return holdings where the owner/holder has the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksInstitutionalHoldingsCall(String ticker, String ownerCik, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/institutional_holdings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ticker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ticker", ticker));
        if (ownerCik != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("owner_cik", ownerCik));
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
    private com.squareup.okhttp.Call getZacksInstitutionalHoldingsValidateBeforeCall(String ticker, String ownerCik, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingsCall(ticker, ownerCik, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Institutional Holdings
     * Returns Zacks institutional holdings data
     * @param ticker Return holdings where the company being held has the given ticker (optional)
     * @param ownerCik Return holdings where the owner/holder has the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksInstitutionalHoldings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksInstitutionalHoldings getZacksInstitutionalHoldings(String ticker, String ownerCik, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksInstitutionalHoldingsWithHttpInfo", String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { ticker, ownerCik, pageSize, nextPage };
      ApiResponse<ApiResponseZacksInstitutionalHoldings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Institutional Holdings
     * Returns Zacks institutional holdings data
     * @param ticker Return holdings where the company being held has the given ticker (optional)
     * @param ownerCik Return holdings where the owner/holder has the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksInstitutionalHoldings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksInstitutionalHoldings> getZacksInstitutionalHoldingsWithHttpInfo(String ticker, String ownerCik, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingsValidateBeforeCall(ticker, ownerCik, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksInstitutionalHoldings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Institutional Holdings (asynchronously)
     * Returns Zacks institutional holdings data
     * @param ticker Return holdings where the company being held has the given ticker (optional)
     * @param ownerCik Return holdings where the owner/holder has the given Central Index Key (CIK) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksInstitutionalHoldingsAsync(String ticker, String ownerCik, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksInstitutionalHoldings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksInstitutionalHoldingsValidateBeforeCall(ticker, ownerCik, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksInstitutionalHoldings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksLongTermGrowthRates
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksLongTermGrowthRatesCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/long_term_growth_rates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifier", identifier));
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
    private com.squareup.okhttp.Call getZacksLongTermGrowthRatesValidateBeforeCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksLongTermGrowthRatesCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Long Term Growth Rates
     * This database offers consensus long term growth rate estimates, including insight into changes in estimates and revisions over time.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksLongTermGrowthRates
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksLongTermGrowthRates getZacksLongTermGrowthRates(String identifier, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksLongTermGrowthRatesWithHttpInfo", String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, pageSize, nextPage };
      ApiResponse<ApiResponseZacksLongTermGrowthRates> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Long Term Growth Rates
     * This database offers consensus long term growth rate estimates, including insight into changes in estimates and revisions over time.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksLongTermGrowthRates&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksLongTermGrowthRates> getZacksLongTermGrowthRatesWithHttpInfo(String identifier, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksLongTermGrowthRatesValidateBeforeCall(identifier, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksLongTermGrowthRates>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Long Term Growth Rates (asynchronously)
     * This database offers consensus long term growth rate estimates, including insight into changes in estimates and revisions over time.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksLongTermGrowthRatesAsync(String identifier, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksLongTermGrowthRates> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksLongTermGrowthRatesValidateBeforeCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksLongTermGrowthRates>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getZacksSalesEstimates
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit Sales estimates to those on or after this date (optional)
     * @param endDate Limit Sales estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksSalesEstimatesCall(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, String nextPage, Integer pageSize, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/sales_estimates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifier", identifier));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (fiscalYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_year", fiscalYear));
        if (fiscalPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_period", fiscalPeriod));
        if (calendarYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("calendar_year", calendarYear));
        if (calendarPeriod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("calendar_period", calendarPeriod));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
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
    private com.squareup.okhttp.Call getZacksSalesEstimatesValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, String nextPage, Integer pageSize, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksSalesEstimatesCall(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, nextPage, pageSize, nextPage2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Sales Estimates
     * This database offers consensus sales estimates for over 5,000 US and Canadian listed companies.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit Sales estimates to those on or after this date (optional)
     * @param endDate Limit Sales estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksSalesEstimates
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksSalesEstimates getZacksSalesEstimates(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, String nextPage, Integer pageSize, String nextPage2) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksSalesEstimatesWithHttpInfo", String.class, LocalDate.class, LocalDate.class, Integer.class, String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, nextPage, pageSize, nextPage2 };
      ApiResponse<ApiResponseZacksSalesEstimates> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Sales Estimates
     * This database offers consensus sales estimates for over 5,000 US and Canadian listed companies.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit Sales estimates to those on or after this date (optional)
     * @param endDate Limit Sales estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksSalesEstimates&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksSalesEstimates> getZacksSalesEstimatesWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, String nextPage, Integer pageSize, String nextPage2) throws ApiException {
        com.squareup.okhttp.Call call = getZacksSalesEstimatesValidateBeforeCall(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, nextPage, pageSize, nextPage2, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksSalesEstimates>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Sales Estimates (asynchronously)
     * This database offers consensus sales estimates for over 5,000 US and Canadian listed companies.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (optional)
     * @param startDate Limit Sales estimates to those on or after this date (optional)
     * @param endDate Limit Sales estimates to those on or before this date (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param fiscalPeriod The fiscal period (optional)
     * @param calendarYear Only for the given calendar year (optional)
     * @param calendarPeriod The calendar period (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksSalesEstimatesAsync(String identifier, LocalDate startDate, LocalDate endDate, Integer fiscalYear, String fiscalPeriod, Integer calendarYear, String calendarPeriod, String nextPage, Integer pageSize, String nextPage2, final ApiCallback<ApiResponseZacksSalesEstimates> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksSalesEstimatesValidateBeforeCall(identifier, startDate, endDate, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, nextPage, pageSize, nextPage2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksSalesEstimates>(){}.getType();
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
    public com.squareup.okhttp.Call getZacksSalesSurprisesCall(LocalDate startDate, LocalDate endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
    private com.squareup.okhttp.Call getZacksSalesSurprisesValidateBeforeCall(LocalDate startDate, LocalDate endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksSalesSurprisesCall(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Sales Surprises
     * This database returns historical estimated and actual sales, guidance, and announcement dates for 17,000+ US and Canadian listed companies.
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
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksSalesSurprises getZacksSalesSurprises(LocalDate startDate, LocalDate endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksSalesSurprisesWithHttpInfo", LocalDate.class, LocalDate.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, BigDecimal.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage };
      ApiResponse<ApiResponseZacksSalesSurprises> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Sales Surprises
     * This database returns historical estimated and actual sales, guidance, and announcement dates for 17,000+ US and Canadian listed companies.
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
    public ApiResponse<ApiResponseZacksSalesSurprises> getZacksSalesSurprisesWithHttpInfo(LocalDate startDate, LocalDate endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksSalesSurprisesValidateBeforeCall(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksSalesSurprises>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Sales Surprises (asynchronously)
     * This database returns historical estimated and actual sales, guidance, and announcement dates for 17,000+ US and Canadian listed companies.
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
    public com.squareup.okhttp.Call getZacksSalesSurprisesAsync(LocalDate startDate, LocalDate endDate, BigDecimal salesActualGreater, BigDecimal salesActualLess, BigDecimal salesMeanEstimateGreater, BigDecimal salesMeanEstimateLess, BigDecimal salesAmountDiffGreater, BigDecimal salesAmountDiffLess, BigDecimal salesPercentDiffGreater, BigDecimal salesPercentDiffLess, BigDecimal salesCountEstimateGreater, BigDecimal salesCountEstimateLess, BigDecimal salesStdDevEstimateGreater, BigDecimal salesStdDevEstimateLess, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksSalesSurprises> callback) throws ApiException {

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
    /**
     * Build call for getZacksTargetPriceConsensuses
     * @param identifier Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getZacksTargetPriceConsensusesCall(String identifier, String industryGroupNumber, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/zacks/target_price_consensuses";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifier != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifier", identifier));
        if (industryGroupNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_group_number", industryGroupNumber));
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
    private com.squareup.okhttp.Call getZacksTargetPriceConsensusesValidateBeforeCall(String identifier, String industryGroupNumber, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getZacksTargetPriceConsensusesCall(identifier, industryGroupNumber, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Target Price Consensuses
     * Returns the latest Zacks target price consensus data
     * @param identifier Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseZacksTargetPriceConsensuses
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseZacksTargetPriceConsensuses getZacksTargetPriceConsensuses(String identifier, String industryGroupNumber, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = ZacksApi.class.getMethod("getZacksTargetPriceConsensusesWithHttpInfo", String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, industryGroupNumber, pageSize, nextPage };
      ApiResponse<ApiResponseZacksTargetPriceConsensuses> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Target Price Consensuses
     * Returns the latest Zacks target price consensus data
     * @param identifier Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseZacksTargetPriceConsensuses&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseZacksTargetPriceConsensuses> getZacksTargetPriceConsensusesWithHttpInfo(String identifier, String industryGroupNumber, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getZacksTargetPriceConsensusesValidateBeforeCall(identifier, industryGroupNumber, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseZacksTargetPriceConsensuses>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Target Price Consensuses (asynchronously)
     * Returns the latest Zacks target price consensus data
     * @param identifier Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param industryGroupNumber Return only growth rates for companies in the given Zacks industry group number (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getZacksTargetPriceConsensusesAsync(String identifier, String industryGroupNumber, Integer pageSize, String nextPage, final ApiCallback<ApiResponseZacksTargetPriceConsensuses> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getZacksTargetPriceConsensusesValidateBeforeCall(identifier, industryGroupNumber, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseZacksTargetPriceConsensuses>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
