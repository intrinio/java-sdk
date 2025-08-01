

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


import com.intrinio.models.ApiResponseCompanies;
import com.intrinio.models.ApiResponseCompaniesSearch;
import com.intrinio.models.ApiResponseCompanyAnswers;
import com.intrinio.models.ApiResponseCompanyDailyMetrics;
import com.intrinio.models.ApiResponseCompanyFilings;
import com.intrinio.models.ApiResponseCompanyFundamentals;
import com.intrinio.models.ApiResponseCompanyHistoricalData;
import com.intrinio.models.ApiResponseCompanyNews;
import com.intrinio.models.ApiResponseCompanyNewsBody;
import com.intrinio.models.ApiResponseCompanyPublicFloatResult;
import com.intrinio.models.ApiResponseCompanyRecognize;
import com.intrinio.models.ApiResponseCompanySecurities;
import com.intrinio.models.ApiResponseCompanySharesOutstanding;
import com.intrinio.models.ApiResponseInitialPublicOfferings;
import com.intrinio.models.ApiResponseInsiderTransactionFilings;
import com.intrinio.models.ApiResponseNews;
import java.math.BigDecimal;
import com.intrinio.models.Company;
import com.intrinio.models.Fundamental;
import com.intrinio.models.InsiderTransactionFiling;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyApi {
    private ApiClient apiClient;

    public CompanyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllCompanies
     * @param latestFilingDate Return companies whose latest 10-Q or 10-K was filed on or after this date (optional)
     * @param sic Return companies with the given Standard Industrial Classification code (optional)
     * @param template Return companies with the given financial statement template (optional)
     * @param sector Return companies in the given industry sector (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param hasFundamentals Return only companies that have fundamentals when true (optional)
     * @param hasStockPrices Return only companies that have stock prices when true (optional)
     * @param theaEnabled Return companies whose have been read by our Thea NLP and are ready for our company answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCompaniesCall(LocalDate latestFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, Boolean hasFundamentals, Boolean hasStockPrices, Boolean theaEnabled, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (latestFilingDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("latest_filing_date", latestFilingDate));
        if (sic != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sic", sic));
        if (template != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("template", template));
        if (sector != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sector", sector));
        if (industryCategory != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_category", industryCategory));
        if (industryGroup != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("industry_group", industryGroup));
        if (hasFundamentals != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("has_fundamentals", hasFundamentals));
        if (hasStockPrices != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("has_stock_prices", hasStockPrices));
        if (theaEnabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("thea_enabled", theaEnabled));
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
    private com.squareup.okhttp.Call getAllCompaniesValidateBeforeCall(LocalDate latestFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, Boolean hasFundamentals, Boolean hasStockPrices, Boolean theaEnabled, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllCompaniesCall(latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, theaEnabled, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Companies
     * Returns all Companies. When parameters are specified, returns matching companies.
     * @param latestFilingDate Return companies whose latest 10-Q or 10-K was filed on or after this date (optional)
     * @param sic Return companies with the given Standard Industrial Classification code (optional)
     * @param template Return companies with the given financial statement template (optional)
     * @param sector Return companies in the given industry sector (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param hasFundamentals Return only companies that have fundamentals when true (optional)
     * @param hasStockPrices Return only companies that have stock prices when true (optional)
     * @param theaEnabled Return companies whose have been read by our Thea NLP and are ready for our company answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanies
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanies getAllCompanies(LocalDate latestFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, Boolean hasFundamentals, Boolean hasStockPrices, Boolean theaEnabled, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getAllCompaniesWithHttpInfo", LocalDate.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Boolean.class, Boolean.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, theaEnabled, pageSize, nextPage };
      ApiResponse<ApiResponseCompanies> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Companies
     * Returns all Companies. When parameters are specified, returns matching companies.
     * @param latestFilingDate Return companies whose latest 10-Q or 10-K was filed on or after this date (optional)
     * @param sic Return companies with the given Standard Industrial Classification code (optional)
     * @param template Return companies with the given financial statement template (optional)
     * @param sector Return companies in the given industry sector (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param hasFundamentals Return only companies that have fundamentals when true (optional)
     * @param hasStockPrices Return only companies that have stock prices when true (optional)
     * @param theaEnabled Return companies whose have been read by our Thea NLP and are ready for our company answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanies&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanies> getAllCompaniesWithHttpInfo(LocalDate latestFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, Boolean hasFundamentals, Boolean hasStockPrices, Boolean theaEnabled, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompaniesValidateBeforeCall(latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, theaEnabled, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Companies (asynchronously)
     * Returns all Companies. When parameters are specified, returns matching companies.
     * @param latestFilingDate Return companies whose latest 10-Q or 10-K was filed on or after this date (optional)
     * @param sic Return companies with the given Standard Industrial Classification code (optional)
     * @param template Return companies with the given financial statement template (optional)
     * @param sector Return companies in the given industry sector (optional)
     * @param industryCategory Return companies in the given industry category (optional)
     * @param industryGroup Return companies in the given industry group (optional)
     * @param hasFundamentals Return only companies that have fundamentals when true (optional)
     * @param hasStockPrices Return only companies that have stock prices when true (optional)
     * @param theaEnabled Return companies whose have been read by our Thea NLP and are ready for our company answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCompaniesAsync(LocalDate latestFilingDate, String sic, String template, String sector, String industryCategory, String industryGroup, Boolean hasFundamentals, Boolean hasStockPrices, Boolean theaEnabled, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCompanies> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCompaniesValidateBeforeCall(latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, theaEnabled, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanies>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllCompaniesDailyMetrics
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCompaniesDailyMetricsCall(LocalDate onDate, Integer pageSize, String nextPage, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/daily_metrics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (onDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("on_date", onDate));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));
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
    private com.squareup.okhttp.Call getAllCompaniesDailyMetricsValidateBeforeCall(LocalDate onDate, Integer pageSize, String nextPage, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllCompaniesDailyMetricsCall(onDate, pageSize, nextPage, nextPage2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Companies daily metrics
     * Returns the company metrics for a date.
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyDailyMetrics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyDailyMetrics getAllCompaniesDailyMetrics(LocalDate onDate, Integer pageSize, String nextPage, String nextPage2) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getAllCompaniesDailyMetricsWithHttpInfo", LocalDate.class, Integer.class, String.class, String.class);
      
      Object[] apiCallArguments = { onDate, pageSize, nextPage, nextPage2 };
      ApiResponse<ApiResponseCompanyDailyMetrics> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Companies daily metrics
     * Returns the company metrics for a date.
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyDailyMetrics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyDailyMetrics> getAllCompaniesDailyMetricsWithHttpInfo(LocalDate onDate, Integer pageSize, String nextPage, String nextPage2) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompaniesDailyMetricsValidateBeforeCall(onDate, pageSize, nextPage, nextPage2, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyDailyMetrics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Companies daily metrics (asynchronously)
     * Returns the company metrics for a date.
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCompaniesDailyMetricsAsync(LocalDate onDate, Integer pageSize, String nextPage, String nextPage2, final ApiCallback<ApiResponseCompanyDailyMetrics> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCompaniesDailyMetricsValidateBeforeCall(onDate, pageSize, nextPage, nextPage2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyDailyMetrics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllCompanyNews
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return. (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param company Filter by &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date. (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyNewsCall(String specificSource, Integer pageSize, String sentiment, String topic, String company, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/news";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (specificSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specific_source", specificSource));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (sentiment != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sentiment", sentiment));
        if (topic != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("topic", topic));
        if (company != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("company", company));
        if (security != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("security", security));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
        if (wordCountGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("word_count_greater_than", wordCountGreaterThan));
        if (wordCountLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("word_count_less_than", wordCountLessThan));
        if (isSpam != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("is_spam", isSpam));
        if (businessRelevanceGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("business_relevance_greater_than", businessRelevanceGreaterThan));
        if (businessRelevanceLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("business_relevance_less_than", businessRelevanceLessThan));
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
    private com.squareup.okhttp.Call getAllCompanyNewsValidateBeforeCall(String specificSource, Integer pageSize, String sentiment, String topic, String company, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllCompanyNewsCall(specificSource, pageSize, sentiment, topic, company, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All News
     * Returns the latest news article links, headlines and summaries for all US traded companies allowing you to keep a pulse on companies and their business operations.
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return. (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param company Filter by &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date. (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseNews
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseNews getAllCompanyNews(String specificSource, Integer pageSize, String sentiment, String topic, String company, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getAllCompanyNewsWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, String.class, LocalDate.class, LocalDate.class, String.class, Integer.class, Integer.class, Boolean.class, BigDecimal.class, BigDecimal.class, String.class);
      
      Object[] apiCallArguments = { specificSource, pageSize, sentiment, topic, company, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage };
      ApiResponse<ApiResponseNews> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All News
     * Returns the latest news article links, headlines and summaries for all US traded companies allowing you to keep a pulse on companies and their business operations.
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return. (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param company Filter by &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date. (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseNews&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseNews> getAllCompanyNewsWithHttpInfo(String specificSource, Integer pageSize, String sentiment, String topic, String company, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllCompanyNewsValidateBeforeCall(specificSource, pageSize, sentiment, topic, company, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseNews>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All News (asynchronously)
     * Returns the latest news article links, headlines and summaries for all US traded companies allowing you to keep a pulse on companies and their business operations.
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return. (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param company Filter by &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date. (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCompanyNewsAsync(String specificSource, Integer pageSize, String sentiment, String topic, String company, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage, final ApiCallback<ApiResponseNews> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCompanyNewsValidateBeforeCall(specificSource, pageSize, sentiment, topic, company, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseNews>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompany
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}"
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
    private com.squareup.okhttp.Call getCompanyValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompany(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lookup Company
     * Returns company reference and metadata such as tickers, CIK, and a unique company identifier, as well as company metadata such as business description, employee count, and company URL.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @return Company
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Company getCompany(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<Company> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Lookup Company
     * Returns company reference and metadata such as tickers, CIK, and a unique company identifier, as well as company metadata such as business description, employee count, and company URL.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @return ApiResponse&lt;Company&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Company> getCompanyWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<Company>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lookup Company (asynchronously)
     * Returns company reference and metadata such as tickers, CIK, and a unique company identifier, as well as company metadata such as business description, employee count, and company URL.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyAsync(String identifier, final ApiCallback<Company> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Company>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyAnswers
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param query The query to ask the Thea API (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyAnswersCall(String identifier, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/answers"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));

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
    private com.squareup.okhttp.Call getCompanyAnswersValidateBeforeCall(String identifier, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyAnswers(Async)");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling getCompanyAnswers(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyAnswersCall(identifier, query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Company Answers
     * Returns answers for a question about the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param query The query to ask the Thea API (required)
     * @return ApiResponseCompanyAnswers
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyAnswers getCompanyAnswers(String identifier, String query) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyAnswersWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, query };
      ApiResponse<ApiResponseCompanyAnswers> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Company Answers
     * Returns answers for a question about the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param query The query to ask the Thea API (required)
     * @return ApiResponse&lt;ApiResponseCompanyAnswers&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyAnswers> getCompanyAnswersWithHttpInfo(String identifier, String query) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyAnswersValidateBeforeCall(identifier, query, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyAnswers>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Company Answers (asynchronously)
     * Returns answers for a question about the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param query The query to ask the Thea API (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyAnswersAsync(String identifier, String query, final ApiCallback<ApiResponseCompanyAnswers> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyAnswersValidateBeforeCall(identifier, query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyAnswers>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyDailyMetrics
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyDailyMetricsCall(String identifier, LocalDate onDate, Integer pageSize, String nextPage, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/daily_metrics"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (onDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("on_date", onDate));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));
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
    private com.squareup.okhttp.Call getCompanyDailyMetricsValidateBeforeCall(String identifier, LocalDate onDate, Integer pageSize, String nextPage, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyDailyMetrics(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyDailyMetricsCall(identifier, onDate, pageSize, nextPage, nextPage2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Company metrics by Company
     * Returns the latest company metrics.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyDailyMetrics
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyDailyMetrics getCompanyDailyMetrics(String identifier, LocalDate onDate, Integer pageSize, String nextPage, String nextPage2) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyDailyMetricsWithHttpInfo", String.class, LocalDate.class, Integer.class, String.class, String.class);
      
      Object[] apiCallArguments = { identifier, onDate, pageSize, nextPage, nextPage2 };
      ApiResponse<ApiResponseCompanyDailyMetrics> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Company metrics by Company
     * Returns the latest company metrics.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyDailyMetrics&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyDailyMetrics> getCompanyDailyMetricsWithHttpInfo(String identifier, LocalDate onDate, Integer pageSize, String nextPage, String nextPage2) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyDailyMetricsValidateBeforeCall(identifier, onDate, pageSize, nextPage, nextPage2, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyDailyMetrics>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Company metrics by Company (asynchronously)
     * Returns the latest company metrics.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param onDate Date of the metric (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyDailyMetricsAsync(String identifier, LocalDate onDate, Integer pageSize, String nextPage, String nextPage2, final ApiCallback<ApiResponseCompanyDailyMetrics> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyDailyMetricsValidateBeforeCall(identifier, onDate, pageSize, nextPage, nextPage2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyDailyMetrics>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyDataPointNumber
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointNumberCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/data_point/{tag}/number"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getCompanyDataPointNumberValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyDataPointNumber(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getCompanyDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyDataPointNumberCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Data Point (Number) for Company
     * Returns latest value for calculations, metrics, and financial data points for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public BigDecimal getCompanyDataPointNumber(String identifier, String tag) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyDataPointNumberWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, tag };
      ApiResponse<BigDecimal> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Data Point (Number) for Company
     * Returns latest value for calculations, metrics, and financial data points for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getCompanyDataPointNumberWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyDataPointNumberValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Data Point (Number) for Company (asynchronously)
     * Returns latest value for calculations, metrics, and financial data points for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointNumberAsync(String identifier, String tag, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyDataPointNumberValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyDataPointText
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointTextCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/data_point/{tag}/text"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain; charset=utf-8"
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
    private com.squareup.okhttp.Call getCompanyDataPointTextValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyDataPointText(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getCompanyDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyDataPointTextCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Data Point (Text) for Company
     * Returns latest value for metadata items for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public String getCompanyDataPointText(String identifier, String tag) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyDataPointTextWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, tag };
      ApiResponse<String> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Data Point (Text) for Company
     * Returns latest value for metadata items for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getCompanyDataPointTextWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyDataPointTextValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Data Point (Text) for Company (asynchronously)
     * Returns latest value for metadata items for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyDataPointTextAsync(String identifier, String tag, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyDataPointTextValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyFilings
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt;. Separate values with commas to return multiple report types. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyFilingsCall(String identifier, String reportType, LocalDate startDate, LocalDate endDate, Boolean theaEnabled, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/filings"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (reportType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("report_type", reportType));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (theaEnabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("thea_enabled", theaEnabled));
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
    private com.squareup.okhttp.Call getCompanyFilingsValidateBeforeCall(String identifier, String reportType, LocalDate startDate, LocalDate endDate, Boolean theaEnabled, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyFilings(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyFilingsCall(identifier, reportType, startDate, endDate, theaEnabled, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Filings by Company
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt;. Separate values with commas to return multiple report types. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyFilings getCompanyFilings(String identifier, String reportType, LocalDate startDate, LocalDate endDate, Boolean theaEnabled, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyFilingsWithHttpInfo", String.class, String.class, LocalDate.class, LocalDate.class, Boolean.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, reportType, startDate, endDate, theaEnabled, pageSize, nextPage };
      ApiResponse<ApiResponseCompanyFilings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Filings by Company
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt;. Separate values with commas to return multiple report types. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyFilings> getCompanyFilingsWithHttpInfo(String identifier, String reportType, LocalDate startDate, LocalDate endDate, Boolean theaEnabled, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyFilingsValidateBeforeCall(identifier, reportType, startDate, endDate, theaEnabled, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Filings by Company (asynchronously)
     * Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param reportType Filter by &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt;. Separate values with commas to return multiple report types. (optional)
     * @param startDate Filed on or after the given date (optional)
     * @param endDate Filed before or after the given date (optional)
     * @param theaEnabled Return filings that have been read by our Thea NLP and are ready for our answers endpoint (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyFilingsAsync(String identifier, String reportType, LocalDate startDate, LocalDate endDate, Boolean theaEnabled, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCompanyFilings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyFilingsValidateBeforeCall(identifier, reportType, startDate, endDate, theaEnabled, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyFundamentals
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fundamentalType Only of the given fundamental type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or before the given date (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param latestOnly Only the most-recently reported fundamental for the period (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyFundamentalsCall(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fundamentalType, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, Boolean latestOnly, LocalDate updatedBefore, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/fundamentals"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filedAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filed_after", filedAfter));
        if (filedBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filed_before", filedBefore));
        if (reportedOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reported_only", reportedOnly));
        if (fiscalYear != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fiscal_year", fiscalYear));
        if (statementCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("statement_code", statementCode));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (fundamentalType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fundamental_type", fundamentalType));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (updatedAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updated_after", updatedAfter));
        if (latestOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("latest_only", latestOnly));
        if (updatedBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("updated_before", updatedBefore));
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
    private com.squareup.okhttp.Call getCompanyFundamentalsValidateBeforeCall(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fundamentalType, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, Boolean latestOnly, LocalDate updatedBefore, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyFundamentals(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyFundamentalsCall(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fundamentalType, startDate, endDate, updatedAfter, latestOnly, updatedBefore, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Fundamentals by Company
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular company. Useful to obtain all historical and/or latest fundamental IDs for a given company to then use to loop through and pull all fundamental data available.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fundamentalType Only of the given fundamental type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or before the given date (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param latestOnly Only the most-recently reported fundamental for the period (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyFundamentals
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyFundamentals getCompanyFundamentals(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fundamentalType, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, Boolean latestOnly, LocalDate updatedBefore, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyFundamentalsWithHttpInfo", String.class, LocalDate.class, LocalDate.class, Boolean.class, Integer.class, String.class, String.class, String.class, LocalDate.class, LocalDate.class, LocalDate.class, Boolean.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fundamentalType, startDate, endDate, updatedAfter, latestOnly, updatedBefore, pageSize, nextPage };
      ApiResponse<ApiResponseCompanyFundamentals> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Fundamentals by Company
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular company. Useful to obtain all historical and/or latest fundamental IDs for a given company to then use to loop through and pull all fundamental data available.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fundamentalType Only of the given fundamental type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or before the given date (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param latestOnly Only the most-recently reported fundamental for the period (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyFundamentals&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyFundamentals> getCompanyFundamentalsWithHttpInfo(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fundamentalType, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, Boolean latestOnly, LocalDate updatedBefore, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyFundamentalsValidateBeforeCall(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fundamentalType, startDate, endDate, updatedAfter, latestOnly, updatedBefore, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFundamentals>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Fundamentals by Company (asynchronously)
     * Returns a list of fundamentals with unique fundamental IDs associated with a particular company. Useful to obtain all historical and/or latest fundamental IDs for a given company to then use to loop through and pull all fundamental data available.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param filedAfter Filed on or after this date (optional)
     * @param filedBefore Filed on or before this date (optional)
     * @param reportedOnly Only as-reported fundamentals (optional)
     * @param fiscalYear Only for the given fiscal year (optional)
     * @param statementCode Only of the given statement code (optional)
     * @param type Only of the given type (optional)
     * @param fundamentalType Only of the given fundamental type (optional)
     * @param startDate Only on or after the given date (optional)
     * @param endDate Only on or before the given date (optional)
     * @param updatedAfter Only include fundamentals where it was updated after this date. (optional)
     * @param latestOnly Only the most-recently reported fundamental for the period (optional)
     * @param updatedBefore Only include fundamentals where it was updated before this date. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyFundamentalsAsync(String identifier, LocalDate filedAfter, LocalDate filedBefore, Boolean reportedOnly, Integer fiscalYear, String statementCode, String type, String fundamentalType, LocalDate startDate, LocalDate endDate, LocalDate updatedAfter, Boolean latestOnly, LocalDate updatedBefore, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCompanyFundamentals> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyFundamentalsValidateBeforeCall(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fundamentalType, startDate, endDate, updatedAfter, latestOnly, updatedBefore, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyFundamentals>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyHistoricalData
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Return historical data for given fiscal period type (optional)
     * @param startDate Return historical data on or after this date (optional)
     * @param endDate Return historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyHistoricalDataCall(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/historical_data/{tag}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "tag" + "\\}", apiClient.escapeString(tag.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (frequency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("frequency", frequency));
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_order", sortOrder));
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
    private com.squareup.okhttp.Call getCompanyHistoricalDataValidateBeforeCall(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyHistoricalData(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getCompanyHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyHistoricalDataCall(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Historical Data for Company
     * Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Return historical data for given fiscal period type (optional)
     * @param startDate Return historical data on or after this date (optional)
     * @param endDate Return historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyHistoricalData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyHistoricalData getCompanyHistoricalData(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyHistoricalDataWithHttpInfo", String.class, String.class, String.class, String.class, LocalDate.class, LocalDate.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage };
      ApiResponse<ApiResponseCompanyHistoricalData> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Historical Data for Company
     * Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Return historical data for given fiscal period type (optional)
     * @param startDate Return historical data on or after this date (optional)
     * @param endDate Return historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyHistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyHistoricalData> getCompanyHistoricalDataWithHttpInfo(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyHistoricalDataValidateBeforeCall(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyHistoricalData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Historical Data for Company (asynchronously)
     * Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Return historical data for given fiscal period type (optional)
     * @param startDate Return historical data on or after this date (optional)
     * @param endDate Return historical data on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyHistoricalDataAsync(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage, final ApiCallback<ApiResponseCompanyHistoricalData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyHistoricalDataValidateBeforeCall(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyHistoricalData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyIpos
     * @param ticker Return IPOs with the given ticker (typically the IPO for the company) (optional)
     * @param status Return IPOs with the given status. Upcoming IPOs are scheduled to occur in the future. Priced IPOs have occurred and the company should be trading publicly. Withdrawn IPOs were planned to occurr but were withdrawn beforehand (optional)
     * @param startDate Return IPOs on or after the given date (optional)
     * @param endDate Return IPOs on or before the given date (optional)
     * @param offerAmountGreaterThan Return IPOs with an offer dollar amount greater than the given amount (optional)
     * @param offerAmountLessThan Return IPOs with an offer dollar amount less than the given amount (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyIposCall(String ticker, String status, LocalDate startDate, LocalDate endDate, Integer offerAmountGreaterThan, Integer offerAmountLessThan, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/ipos";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ticker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ticker", ticker));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (offerAmountGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offer_amount_greater_than", offerAmountGreaterThan));
        if (offerAmountLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offer_amount_less_than", offerAmountLessThan));
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
    private com.squareup.okhttp.Call getCompanyIposValidateBeforeCall(String ticker, String status, LocalDate startDate, LocalDate endDate, Integer offerAmountGreaterThan, Integer offerAmountLessThan, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getCompanyIposCall(ticker, status, startDate, endDate, offerAmountGreaterThan, offerAmountLessThan, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * IPOs
     * Returns a list of historical, current, and upcoming initial public offerings (IPOs) across the major US Exchanges. Includes relevant information such as the IPO status, the offer amount, the total share count and target share price.
     * @param ticker Return IPOs with the given ticker (typically the IPO for the company) (optional)
     * @param status Return IPOs with the given status. Upcoming IPOs are scheduled to occur in the future. Priced IPOs have occurred and the company should be trading publicly. Withdrawn IPOs were planned to occurr but were withdrawn beforehand (optional)
     * @param startDate Return IPOs on or after the given date (optional)
     * @param endDate Return IPOs on or before the given date (optional)
     * @param offerAmountGreaterThan Return IPOs with an offer dollar amount greater than the given amount (optional)
     * @param offerAmountLessThan Return IPOs with an offer dollar amount less than the given amount (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseInitialPublicOfferings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseInitialPublicOfferings getCompanyIpos(String ticker, String status, LocalDate startDate, LocalDate endDate, Integer offerAmountGreaterThan, Integer offerAmountLessThan, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyIposWithHttpInfo", String.class, String.class, LocalDate.class, LocalDate.class, Integer.class, Integer.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { ticker, status, startDate, endDate, offerAmountGreaterThan, offerAmountLessThan, pageSize, nextPage };
      ApiResponse<ApiResponseInitialPublicOfferings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * IPOs
     * Returns a list of historical, current, and upcoming initial public offerings (IPOs) across the major US Exchanges. Includes relevant information such as the IPO status, the offer amount, the total share count and target share price.
     * @param ticker Return IPOs with the given ticker (typically the IPO for the company) (optional)
     * @param status Return IPOs with the given status. Upcoming IPOs are scheduled to occur in the future. Priced IPOs have occurred and the company should be trading publicly. Withdrawn IPOs were planned to occurr but were withdrawn beforehand (optional)
     * @param startDate Return IPOs on or after the given date (optional)
     * @param endDate Return IPOs on or before the given date (optional)
     * @param offerAmountGreaterThan Return IPOs with an offer dollar amount greater than the given amount (optional)
     * @param offerAmountLessThan Return IPOs with an offer dollar amount less than the given amount (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseInitialPublicOfferings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseInitialPublicOfferings> getCompanyIposWithHttpInfo(String ticker, String status, LocalDate startDate, LocalDate endDate, Integer offerAmountGreaterThan, Integer offerAmountLessThan, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyIposValidateBeforeCall(ticker, status, startDate, endDate, offerAmountGreaterThan, offerAmountLessThan, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseInitialPublicOfferings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * IPOs (asynchronously)
     * Returns a list of historical, current, and upcoming initial public offerings (IPOs) across the major US Exchanges. Includes relevant information such as the IPO status, the offer amount, the total share count and target share price.
     * @param ticker Return IPOs with the given ticker (typically the IPO for the company) (optional)
     * @param status Return IPOs with the given status. Upcoming IPOs are scheduled to occur in the future. Priced IPOs have occurred and the company should be trading publicly. Withdrawn IPOs were planned to occurr but were withdrawn beforehand (optional)
     * @param startDate Return IPOs on or after the given date (optional)
     * @param endDate Return IPOs on or before the given date (optional)
     * @param offerAmountGreaterThan Return IPOs with an offer dollar amount greater than the given amount (optional)
     * @param offerAmountLessThan Return IPOs with an offer dollar amount less than the given amount (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyIposAsync(String ticker, String status, LocalDate startDate, LocalDate endDate, Integer offerAmountGreaterThan, Integer offerAmountLessThan, Integer pageSize, String nextPage, final ApiCallback<ApiResponseInitialPublicOfferings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyIposValidateBeforeCall(ticker, status, startDate, endDate, offerAmountGreaterThan, offerAmountLessThan, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseInitialPublicOfferings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyNews
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyNewsCall(String identifier, String specificSource, Integer pageSize, String sentiment, String topic, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/news"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (specificSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specific_source", specificSource));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (sentiment != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sentiment", sentiment));
        if (topic != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("topic", topic));
        if (security != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("security", security));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
        if (wordCountGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("word_count_greater_than", wordCountGreaterThan));
        if (wordCountLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("word_count_less_than", wordCountLessThan));
        if (isSpam != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("is_spam", isSpam));
        if (businessRelevanceGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("business_relevance_greater_than", businessRelevanceGreaterThan));
        if (businessRelevanceLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("business_relevance_less_than", businessRelevanceLessThan));
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
    private com.squareup.okhttp.Call getCompanyNewsValidateBeforeCall(String identifier, String specificSource, Integer pageSize, String sentiment, String topic, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyNews(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyNewsCall(identifier, specificSource, pageSize, sentiment, topic, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All News by Company
     * Returns the latest and historical news article links, headlines and summaries for a specified US traded company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyNews
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyNews getCompanyNews(String identifier, String specificSource, Integer pageSize, String sentiment, String topic, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyNewsWithHttpInfo", String.class, String.class, Integer.class, String.class, String.class, String.class, LocalDate.class, LocalDate.class, String.class, Integer.class, Integer.class, Boolean.class, BigDecimal.class, BigDecimal.class, String.class);
      
      Object[] apiCallArguments = { identifier, specificSource, pageSize, sentiment, topic, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage };
      ApiResponse<ApiResponseCompanyNews> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All News by Company
     * Returns the latest and historical news article links, headlines and summaries for a specified US traded company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyNews&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyNews> getCompanyNewsWithHttpInfo(String identifier, String specificSource, Integer pageSize, String sentiment, String topic, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyNewsValidateBeforeCall(identifier, specificSource, pageSize, sentiment, topic, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyNews>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All News by Company (asynchronously)
     * Returns the latest and historical news article links, headlines and summaries for a specified US traded company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param pageSize The maximum number of results to return (optional, default to 100)
     * @param sentiment Filter by sentiment.  Unsupported for yahoo source. (optional)
     * @param topic Filter by topic.  Unsupported for yahoo source. (optional)
     * @param security Filter by &#x60;security&#x60; identifier (ticker, figi, isin, cusip, Intrinio ID).  Unsupported for yahoo source. (optional)
     * @param startDate Limit news stories to those on or after this date. Defaults to yesterday if unspecified. (optional)
     * @param endDate Limit news stories to those on or before this date (optional)
     * @param language Filter by language.  Unsupported for yahoo source. (optional)
     * @param wordCountGreaterThan News stories will have a word count greater than this value.  Unsupported for yahoo source. (optional)
     * @param wordCountLessThan News stories will have a word count less than this value.  Unsupported for yahoo source. (optional)
     * @param isSpam Filter whether it is marked as spam or not.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceGreaterThan News stories will have a business relevance score more than this value.  Unsupported for yahoo source. (optional)
     * @param businessRelevanceLessThan News stories will have a business relevance score less than this value.  Unsupported for yahoo source. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyNewsAsync(String identifier, String specificSource, Integer pageSize, String sentiment, String topic, String security, LocalDate startDate, LocalDate endDate, String language, Integer wordCountGreaterThan, Integer wordCountLessThan, Boolean isSpam, BigDecimal businessRelevanceGreaterThan, BigDecimal businessRelevanceLessThan, String nextPage, final ApiCallback<ApiResponseCompanyNews> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyNewsValidateBeforeCall(identifier, specificSource, pageSize, sentiment, topic, security, startDate, endDate, language, wordCountGreaterThan, wordCountLessThan, isSpam, businessRelevanceGreaterThan, businessRelevanceLessThan, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyNews>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyNewsBody
     * @param newsStoryId The identifier of the news story. (required)
     * @param publicationDate The DateTime of the story. (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyNewsBodyCall(String newsStoryId, OffsetDateTime publicationDate, String specificSource, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/news/body";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (specificSource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("specific_source", specificSource));
        if (newsStoryId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("news_story_id", newsStoryId));
        if (publicationDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("publication_date", publicationDate));
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
    private com.squareup.okhttp.Call getCompanyNewsBodyValidateBeforeCall(String newsStoryId, OffsetDateTime publicationDate, String specificSource, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'newsStoryId' is set
        if (newsStoryId == null) {
            throw new ApiException("Missing the required parameter 'newsStoryId' when calling getCompanyNewsBody(Async)");
        }
        
        // verify the required parameter 'publicationDate' is set
        if (publicationDate == null) {
            throw new ApiException("Missing the required parameter 'publicationDate' when calling getCompanyNewsBody(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyNewsBodyCall(newsStoryId, publicationDate, specificSource, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * News Article Body
     * Returns the body of a news article for moody sources.  This endpoint requires additional authorization beyond basic news access and is for your internal use only - no display. Please see a representative for details.
     * @param newsStoryId The identifier of the news story. (required)
     * @param publicationDate The DateTime of the story. (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyNewsBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyNewsBody getCompanyNewsBody(String newsStoryId, OffsetDateTime publicationDate, String specificSource, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyNewsBodyWithHttpInfo", String.class, OffsetDateTime.class, String.class, String.class);
      
      Object[] apiCallArguments = { newsStoryId, publicationDate, specificSource, nextPage };
      ApiResponse<ApiResponseCompanyNewsBody> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * News Article Body
     * Returns the body of a news article for moody sources.  This endpoint requires additional authorization beyond basic news access and is for your internal use only - no display. Please see a representative for details.
     * @param newsStoryId The identifier of the news story. (required)
     * @param publicationDate The DateTime of the story. (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyNewsBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyNewsBody> getCompanyNewsBodyWithHttpInfo(String newsStoryId, OffsetDateTime publicationDate, String specificSource, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyNewsBodyValidateBeforeCall(newsStoryId, publicationDate, specificSource, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyNewsBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * News Article Body (asynchronously)
     * Returns the body of a news article for moody sources.  This endpoint requires additional authorization beyond basic news access and is for your internal use only - no display. Please see a representative for details.
     * @param newsStoryId The identifier of the news story. (required)
     * @param publicationDate The DateTime of the story. (required)
     * @param specificSource Only news from this source. Defaults to highest available if not present. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyNewsBodyAsync(String newsStoryId, OffsetDateTime publicationDate, String specificSource, String nextPage, final ApiCallback<ApiResponseCompanyNewsBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyNewsBodyValidateBeforeCall(newsStoryId, publicationDate, specificSource, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyNewsBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanyPublicFloat
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param floatDateGreaterThan The lower-bound date for the data being requested. (optional)
     * @param floatDateLessThan The upper-bound date for the data being requested. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanyPublicFloatCall(String identifier, LocalDate floatDateGreaterThan, LocalDate floatDateLessThan, String nextPage, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/public_float"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (floatDateGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("float_date_greater_than", floatDateGreaterThan));
        if (floatDateLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("float_date_less_than", floatDateLessThan));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));
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
    private com.squareup.okhttp.Call getCompanyPublicFloatValidateBeforeCall(String identifier, LocalDate floatDateGreaterThan, LocalDate floatDateLessThan, String nextPage, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanyPublicFloat(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanyPublicFloatCall(identifier, floatDateGreaterThan, floatDateLessThan, nextPage, nextPage2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Company&#39;s public float
     * Returns a list of public float data tied to a given company identifier.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param floatDateGreaterThan The lower-bound date for the data being requested. (optional)
     * @param floatDateLessThan The upper-bound date for the data being requested. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanyPublicFloatResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyPublicFloatResult getCompanyPublicFloat(String identifier, LocalDate floatDateGreaterThan, LocalDate floatDateLessThan, String nextPage, String nextPage2) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanyPublicFloatWithHttpInfo", String.class, LocalDate.class, LocalDate.class, String.class, String.class);
      
      Object[] apiCallArguments = { identifier, floatDateGreaterThan, floatDateLessThan, nextPage, nextPage2 };
      ApiResponse<ApiResponseCompanyPublicFloatResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Get Company&#39;s public float
     * Returns a list of public float data tied to a given company identifier.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param floatDateGreaterThan The lower-bound date for the data being requested. (optional)
     * @param floatDateLessThan The upper-bound date for the data being requested. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanyPublicFloatResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyPublicFloatResult> getCompanyPublicFloatWithHttpInfo(String identifier, LocalDate floatDateGreaterThan, LocalDate floatDateLessThan, String nextPage, String nextPage2) throws ApiException {
        com.squareup.okhttp.Call call = getCompanyPublicFloatValidateBeforeCall(identifier, floatDateGreaterThan, floatDateLessThan, nextPage, nextPage2, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyPublicFloatResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Company&#39;s public float (asynchronously)
     * Returns a list of public float data tied to a given company identifier.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param floatDateGreaterThan The lower-bound date for the data being requested. (optional)
     * @param floatDateLessThan The upper-bound date for the data being requested. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanyPublicFloatAsync(String identifier, LocalDate floatDateGreaterThan, LocalDate floatDateLessThan, String nextPage, String nextPage2, final ApiCallback<ApiResponseCompanyPublicFloatResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanyPublicFloatValidateBeforeCall(identifier, floatDateGreaterThan, floatDateLessThan, nextPage, nextPage2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyPublicFloatResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCompanySecurities
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCompanySecuritiesCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/securities"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getCompanySecuritiesValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getCompanySecurities(Async)");
        }
        

        com.squareup.okhttp.Call call = getCompanySecuritiesCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Securities by Company
     * Returns a list of underlying securities with associated reference data tied to a given company identifier.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseCompanySecurities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanySecurities getCompanySecurities(String identifier, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("getCompanySecuritiesWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, nextPage };
      ApiResponse<ApiResponseCompanySecurities> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Securities by Company
     * Returns a list of underlying securities with associated reference data tied to a given company identifier.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseCompanySecurities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanySecurities> getCompanySecuritiesWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getCompanySecuritiesValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanySecurities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Securities by Company (asynchronously)
     * Returns a list of underlying securities with associated reference data tied to a given company identifier.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCompanySecuritiesAsync(String identifier, String nextPage, final ApiCallback<ApiResponseCompanySecurities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCompanySecuritiesValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanySecurities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for insiderTransactionFilingsByCompany
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param startDate Return Company&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Company&#39;s insider transaction filings on or before this date (optional)
     * @param ownershipType The type of ownership to return transaction filings for. &#39;D&#39; is for direct transactions. &#39;I&#39; is for indirect transactions. Omit for both types. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 1000)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call insiderTransactionFilingsByCompanyCall(String identifier, LocalDate startDate, LocalDate endDate, String ownershipType, String nextPage, Integer pageSize, String sortBy, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/insider_transaction_filings"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (ownershipType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ownership_type", ownershipType));
        if (nextPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("next_page", nextPage));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_by", sortBy));
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
    private com.squareup.okhttp.Call insiderTransactionFilingsByCompanyValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, String ownershipType, String nextPage, Integer pageSize, String sortBy, String nextPage2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling insiderTransactionFilingsByCompany(Async)");
        }
        

        com.squareup.okhttp.Call call = insiderTransactionFilingsByCompanyCall(identifier, startDate, endDate, ownershipType, nextPage, pageSize, sortBy, nextPage2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Insider Transaction Filings by Company
     * Returns a list of all insider transaction filings in a company. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param startDate Return Company&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Company&#39;s insider transaction filings on or before this date (optional)
     * @param ownershipType The type of ownership to return transaction filings for. &#39;D&#39; is for direct transactions. &#39;I&#39; is for indirect transactions. Omit for both types. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 1000)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponseInsiderTransactionFilings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseInsiderTransactionFilings insiderTransactionFilingsByCompany(String identifier, LocalDate startDate, LocalDate endDate, String ownershipType, String nextPage, Integer pageSize, String sortBy, String nextPage2) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("insiderTransactionFilingsByCompanyWithHttpInfo", String.class, LocalDate.class, LocalDate.class, String.class, String.class, Integer.class, String.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, ownershipType, nextPage, pageSize, sortBy, nextPage2 };
      ApiResponse<ApiResponseInsiderTransactionFilings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Insider Transaction Filings by Company
     * Returns a list of all insider transaction filings in a company. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param startDate Return Company&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Company&#39;s insider transaction filings on or before this date (optional)
     * @param ownershipType The type of ownership to return transaction filings for. &#39;D&#39; is for direct transactions. &#39;I&#39; is for indirect transactions. Omit for both types. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 1000)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseInsiderTransactionFilings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseInsiderTransactionFilings> insiderTransactionFilingsByCompanyWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, String ownershipType, String nextPage, Integer pageSize, String sortBy, String nextPage2) throws ApiException {
        com.squareup.okhttp.Call call = insiderTransactionFilingsByCompanyValidateBeforeCall(identifier, startDate, endDate, ownershipType, nextPage, pageSize, sortBy, nextPage2, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseInsiderTransactionFilings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Insider Transaction Filings by Company (asynchronously)
     * Returns a list of all insider transaction filings in a company. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param startDate Return Company&#39;s insider transaction filings on or after this date (optional)
     * @param endDate Return Company&#39;s insider transaction filings on or before this date (optional)
     * @param ownershipType The type of ownership to return transaction filings for. &#39;D&#39; is for direct transactions. &#39;I&#39; is for indirect transactions. Omit for both types. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param pageSize The number of results to return (optional, default to 1000)
     * @param sortBy The field to sort by.  Default is &#39;filing_date&#39;. (optional)
     * @param nextPage2 Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call insiderTransactionFilingsByCompanyAsync(String identifier, LocalDate startDate, LocalDate endDate, String ownershipType, String nextPage, Integer pageSize, String sortBy, String nextPage2, final ApiCallback<ApiResponseInsiderTransactionFilings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = insiderTransactionFilingsByCompanyValidateBeforeCall(identifier, startDate, endDate, ownershipType, nextPage, pageSize, sortBy, nextPage2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseInsiderTransactionFilings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for latestInsiderTransactionFilingByCompany
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call latestInsiderTransactionFilingByCompanyCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/insider_transaction_filings/latest"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call latestInsiderTransactionFilingByCompanyValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling latestInsiderTransactionFilingByCompany(Async)");
        }
        

        com.squareup.okhttp.Call call = latestInsiderTransactionFilingByCompanyCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Latest Insider Transaction Filing by Company
     * Returns the latest insider transaction filing for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return InsiderTransactionFiling
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public InsiderTransactionFiling latestInsiderTransactionFilingByCompany(String identifier, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("latestInsiderTransactionFilingByCompanyWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, nextPage };
      ApiResponse<InsiderTransactionFiling> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Latest Insider Transaction Filing by Company
     * Returns the latest insider transaction filing for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;InsiderTransactionFiling&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InsiderTransactionFiling> latestInsiderTransactionFilingByCompanyWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = latestInsiderTransactionFilingByCompanyValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<InsiderTransactionFiling>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Latest Insider Transaction Filing by Company (asynchronously)
     * Returns the latest insider transaction filing for a company.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call latestInsiderTransactionFilingByCompanyAsync(String identifier, String nextPage, final ApiCallback<InsiderTransactionFiling> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = latestInsiderTransactionFilingByCompanyValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InsiderTransactionFiling>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for lookupCompanyFundamental
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call lookupCompanyFundamentalCall(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "statement_code" + "\\}", apiClient.escapeString(statementCode.toString()))
            .replaceAll("\\{" + "fiscal_period" + "\\}", apiClient.escapeString(fiscalPeriod.toString()))
            .replaceAll("\\{" + "fiscal_year" + "\\}", apiClient.escapeString(fiscalYear.toString()));

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
    private com.squareup.okhttp.Call lookupCompanyFundamentalValidateBeforeCall(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling lookupCompanyFundamental(Async)");
        }
        
        // verify the required parameter 'statementCode' is set
        if (statementCode == null) {
            throw new ApiException("Missing the required parameter 'statementCode' when calling lookupCompanyFundamental(Async)");
        }
        
        // verify the required parameter 'fiscalPeriod' is set
        if (fiscalPeriod == null) {
            throw new ApiException("Missing the required parameter 'fiscalPeriod' when calling lookupCompanyFundamental(Async)");
        }
        
        // verify the required parameter 'fiscalYear' is set
        if (fiscalYear == null) {
            throw new ApiException("Missing the required parameter 'fiscalYear' when calling lookupCompanyFundamental(Async)");
        }
        

        com.squareup.okhttp.Call call = lookupCompanyFundamentalCall(identifier, statementCode, fiscalPeriod, fiscalYear, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lookup Fundamental by Company
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @return Fundamental
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Fundamental lookupCompanyFundamental(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("lookupCompanyFundamentalWithHttpInfo", String.class, String.class, String.class, Integer.class);
      
      Object[] apiCallArguments = { identifier, statementCode, fiscalPeriod, fiscalYear };
      ApiResponse<Fundamental> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Lookup Fundamental by Company
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @return ApiResponse&lt;Fundamental&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fundamental> lookupCompanyFundamentalWithHttpInfo(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear) throws ApiException {
        com.squareup.okhttp.Call call = lookupCompanyFundamentalValidateBeforeCall(identifier, statementCode, fiscalPeriod, fiscalYear, null, null);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lookup Fundamental by Company (asynchronously)
     * Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param statementCode The statement code (required)
     * @param fiscalPeriod The fiscal period (required)
     * @param fiscalYear The fiscal year (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call lookupCompanyFundamentalAsync(String identifier, String statementCode, String fiscalPeriod, Integer fiscalYear, final ApiCallback<Fundamental> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = lookupCompanyFundamentalValidateBeforeCall(identifier, statementCode, fiscalPeriod, fiscalYear, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fundamental>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for recognizeCompany
     * @param text The text sent to the Thea API to analyze (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call recognizeCompanyCall(String text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/recognize";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (text != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("text", text));

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
    private com.squareup.okhttp.Call recognizeCompanyValidateBeforeCall(String text, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException("Missing the required parameter 'text' when calling recognizeCompany(Async)");
        }
        

        com.squareup.okhttp.Call call = recognizeCompanyCall(text, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Recognize Company
     * Returns a list of companies recognized by the Thea API in the given &#x60;text&#x60; query string parameter.
     * @param text The text sent to the Thea API to analyze (required)
     * @return ApiResponseCompanyRecognize
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanyRecognize recognizeCompany(String text) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("recognizeCompanyWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { text };
      ApiResponse<ApiResponseCompanyRecognize> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Recognize Company
     * Returns a list of companies recognized by the Thea API in the given &#x60;text&#x60; query string parameter.
     * @param text The text sent to the Thea API to analyze (required)
     * @return ApiResponse&lt;ApiResponseCompanyRecognize&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanyRecognize> recognizeCompanyWithHttpInfo(String text) throws ApiException {
        com.squareup.okhttp.Call call = recognizeCompanyValidateBeforeCall(text, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyRecognize>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Recognize Company (asynchronously)
     * Returns a list of companies recognized by the Thea API in the given &#x60;text&#x60; query string parameter.
     * @param text The text sent to the Thea API to analyze (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call recognizeCompanyAsync(String text, final ApiCallback<ApiResponseCompanyRecognize> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = recognizeCompanyValidateBeforeCall(text, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanyRecognize>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchCompanies
     * @param query Search parameters (required)
     * @param active When true, return companies that are actively traded (having stock prices within the past 14 days). When false, return companies that are not actively traded or never have been traded. Not setting this value returns all. Not used when mode is set. (optional)
     * @param mode When set, changes search mode to the specified mode. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchCompaniesCall(String query, Boolean active, String mode, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
        if (active != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("active", active));
        if (mode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mode", mode));
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
    private com.squareup.okhttp.Call searchCompaniesValidateBeforeCall(String query, Boolean active, String mode, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchCompanies(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCompaniesCall(query, active, mode, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Companies
     * Search the companies database and return a list of companies matching the text query parameter passed through. Query parameter searches across the company ticker and name.
     * @param query Search parameters (required)
     * @param active When true, return companies that are actively traded (having stock prices within the past 14 days). When false, return companies that are not actively traded or never have been traded. Not setting this value returns all. Not used when mode is set. (optional)
     * @param mode When set, changes search mode to the specified mode. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponseCompaniesSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompaniesSearch searchCompanies(String query, Boolean active, String mode, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("searchCompaniesWithHttpInfo", String.class, Boolean.class, String.class, Integer.class);
      
      Object[] apiCallArguments = { query, active, mode, pageSize };
      ApiResponse<ApiResponseCompaniesSearch> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Search Companies
     * Search the companies database and return a list of companies matching the text query parameter passed through. Query parameter searches across the company ticker and name.
     * @param query Search parameters (required)
     * @param active When true, return companies that are actively traded (having stock prices within the past 14 days). When false, return companies that are not actively traded or never have been traded. Not setting this value returns all. Not used when mode is set. (optional)
     * @param mode When set, changes search mode to the specified mode. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponse&lt;ApiResponseCompaniesSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompaniesSearch> searchCompaniesWithHttpInfo(String query, Boolean active, String mode, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = searchCompaniesValidateBeforeCall(query, active, mode, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompaniesSearch>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Companies (asynchronously)
     * Search the companies database and return a list of companies matching the text query parameter passed through. Query parameter searches across the company ticker and name.
     * @param query Search parameters (required)
     * @param active When true, return companies that are actively traded (having stock prices within the past 14 days). When false, return companies that are not actively traded or never have been traded. Not setting this value returns all. Not used when mode is set. (optional)
     * @param mode When set, changes search mode to the specified mode. (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchCompaniesAsync(String query, Boolean active, String mode, Integer pageSize, final ApiCallback<ApiResponseCompaniesSearch> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchCompaniesValidateBeforeCall(query, active, mode, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompaniesSearch>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sharesOutstandingByCompany
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param endDateGreaterThan Returns shares outstanding after this date. (optional)
     * @param endDateLessThan Returns shares outstanding before this date. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sharesOutstandingByCompanyCall(String identifier, LocalDate endDateGreaterThan, LocalDate endDateLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies/{identifier}/shares_outstanding"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (endDateGreaterThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date_greater_than", endDateGreaterThan));
        if (endDateLessThan != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date_less_than", endDateLessThan));

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
    private com.squareup.okhttp.Call sharesOutstandingByCompanyValidateBeforeCall(String identifier, LocalDate endDateGreaterThan, LocalDate endDateLessThan, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling sharesOutstandingByCompany(Async)");
        }
        

        com.squareup.okhttp.Call call = sharesOutstandingByCompanyCall(identifier, endDateGreaterThan, endDateLessThan, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Shares Outstanding by Company
     * Returns the shares outstanding reported on the front cover of the SEC 10-K and 10-Q filings.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param endDateGreaterThan Returns shares outstanding after this date. (optional)
     * @param endDateLessThan Returns shares outstanding before this date. (optional)
     * @return ApiResponseCompanySharesOutstanding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseCompanySharesOutstanding sharesOutstandingByCompany(String identifier, LocalDate endDateGreaterThan, LocalDate endDateLessThan) throws ApiException, NoSuchMethodException {
      Method targetMethod = CompanyApi.class.getMethod("sharesOutstandingByCompanyWithHttpInfo", String.class, LocalDate.class, LocalDate.class);
      
      Object[] apiCallArguments = { identifier, endDateGreaterThan, endDateLessThan };
      ApiResponse<ApiResponseCompanySharesOutstanding> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Shares Outstanding by Company
     * Returns the shares outstanding reported on the front cover of the SEC 10-K and 10-Q filings.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param endDateGreaterThan Returns shares outstanding after this date. (optional)
     * @param endDateLessThan Returns shares outstanding before this date. (optional)
     * @return ApiResponse&lt;ApiResponseCompanySharesOutstanding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseCompanySharesOutstanding> sharesOutstandingByCompanyWithHttpInfo(String identifier, LocalDate endDateGreaterThan, LocalDate endDateLessThan) throws ApiException {
        com.squareup.okhttp.Call call = sharesOutstandingByCompanyValidateBeforeCall(identifier, endDateGreaterThan, endDateLessThan, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseCompanySharesOutstanding>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Shares Outstanding by Company (asynchronously)
     * Returns the shares outstanding reported on the front cover of the SEC 10-K and 10-Q filings.
     * @param identifier A Company identifier (Ticker, CIK, LEI, Intrinio ID) (required)
     * @param endDateGreaterThan Returns shares outstanding after this date. (optional)
     * @param endDateLessThan Returns shares outstanding before this date. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sharesOutstandingByCompanyAsync(String identifier, LocalDate endDateGreaterThan, LocalDate endDateLessThan, final ApiCallback<ApiResponseCompanySharesOutstanding> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sharesOutstandingByCompanyValidateBeforeCall(identifier, endDateGreaterThan, endDateLessThan, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseCompanySharesOutstanding>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
