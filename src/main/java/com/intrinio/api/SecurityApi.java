

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


import com.intrinio.models.ApiResponseSecurities;
import com.intrinio.models.ApiResponseSecuritiesSearch;
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
import com.intrinio.models.ApiResponseSecurityHistoricalData;
import com.intrinio.models.ApiResponseSecurityIchimokuKinkoHyo;
import com.intrinio.models.ApiResponseSecurityInstitutionalOwnership;
import com.intrinio.models.ApiResponseSecurityIntervalPrices;
import com.intrinio.models.ApiResponseSecurityIntradayPrices;
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
import com.intrinio.models.ApiResponseSecurityStockPriceAdjustments;
import com.intrinio.models.ApiResponseSecurityStockPrices;
import com.intrinio.models.ApiResponseSecurityTripleExponentialAverage;
import com.intrinio.models.ApiResponseSecurityTrueStrengthIndex;
import com.intrinio.models.ApiResponseSecurityUltimateOscillator;
import com.intrinio.models.ApiResponseSecurityVolumePriceTrend;
import com.intrinio.models.ApiResponseSecurityVolumeWeightedAveragePrice;
import com.intrinio.models.ApiResponseSecurityVortexIndicator;
import com.intrinio.models.ApiResponseSecurityWilliamsR;
import com.intrinio.models.ApiResponseSecurityZacksAnalystRatings;
import com.intrinio.models.ApiResponseSecurityZacksAnalystRatingsSnapshot;
import com.intrinio.models.ApiResponseSecurityZacksEPSSurprises;
import com.intrinio.models.ApiResponseSecurityZacksSalesSurprises;
import java.math.BigDecimal;
import com.intrinio.models.DividendRecord;
import com.intrinio.models.EarningsRecord;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import com.intrinio.models.RealtimeStockPrice;
import com.intrinio.models.Security;
import com.intrinio.models.SecurityHistoryListResult;
import com.intrinio.models.SecurityIntervalsMoversResult;
import com.intrinio.models.SecurityReplayFileResult;
import com.intrinio.models.SecurityScreenGroup;
import com.intrinio.models.SecurityScreenResult;
import com.intrinio.models.SecuritySnapshotsResult;
import com.intrinio.models.SecurityTradesResult;

import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityApi {
    private ApiClient apiClient;

    public SecurityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllSecurities
     * @param active When true, return securities that are active. When false, return securities that are not active. A security is considered active if it has traded or has had a corporate action in the past 30 days, and has not been merged into another security (such as due to ticker changes or corporate restructurings). (optional)
     * @param delisted When true, return securities that have been delisted from their exchange. Note that there may be a newer security for the same company that has been relisted on a differente exchange. When false, return securities that have not been delisted. (optional)
     * @param code Return securities classified with the given code (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param currency Return securities traded in the given 3-digit ISO 4217 currency code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param ticker Return securities traded with the given ticker. Note that securities across the world (and through time) may trade with the same ticker but represent different companies. Use this in conjuction with other parameters for more specificity. (optional)
     * @param name Return securities with the given text in their name (not case sensitive). (optional)
     * @param compositeMic Return securities classified under the composite exchange with the given Market Identification Code (MIC). A composite exchange may or may not be a real exchange.  For example, the USCOMP exchange (our only composite exchange to date) is a combination of exchanges with the following MICs: ARCX, XASE, XPOR, FINR, XCIS, XNAS, XNYS, BATS.  This composite grouping is done for user convenience.  At this time, all US securities are classified under the composite exchange with MIC USCOMP.  To query for specific US exchanges, use the exchange_mic parameter below.  (optional)
     * @param exchangeMic The MIC code of the exchange where the security is actually traded. (optional)
     * @param stockPricesAfter Return securities with end-of-day stock prices on or after this date. (optional)
     * @param stockPricesBefore Return securities with end-of-day stock prices on or before this date. (optional)
     * @param cik Return securities belonging to the company with the given Central Index Key (CIK). (optional)
     * @param figi Return securities with the given Exchange Level FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param compositeFigi Return securities with the given Country Composite FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param shareClassFigi Return securities with the given Global Share Class FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param figiUniqueId Return securities with the given FIGI Unique ID (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param includeNonFigi When true, include securities that do not have a FIGI. By default, this is false. If this parameter is not specified, only securities with a FIGI are returned. (optional, default to false)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param primaryListing If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange.  Returns both if omitted. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllSecuritiesCall(Boolean active, Boolean delisted, String code, String currency, String ticker, String name, String compositeMic, String exchangeMic, LocalDate stockPricesAfter, LocalDate stockPricesBefore, String cik, String figi, String compositeFigi, String shareClassFigi, String figiUniqueId, Boolean includeNonFigi, Integer pageSize, Boolean primaryListing, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (active != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("active", active));
        if (delisted != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("delisted", delisted));
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("code", code));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (ticker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ticker", ticker));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("name", name));
        if (compositeMic != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("composite_mic", compositeMic));
        if (exchangeMic != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("exchange_mic", exchangeMic));
        if (stockPricesAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stock_prices_after", stockPricesAfter));
        if (stockPricesBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stock_prices_before", stockPricesBefore));
        if (cik != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cik", cik));
        if (figi != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("figi", figi));
        if (compositeFigi != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("composite_figi", compositeFigi));
        if (shareClassFigi != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("share_class_figi", shareClassFigi));
        if (figiUniqueId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("figi_unique_id", figiUniqueId));
        if (includeNonFigi != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("include_non_figi", includeNonFigi));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        if (primaryListing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("primary_listing", primaryListing));
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
    private com.squareup.okhttp.Call getAllSecuritiesValidateBeforeCall(Boolean active, Boolean delisted, String code, String currency, String ticker, String name, String compositeMic, String exchangeMic, LocalDate stockPricesAfter, LocalDate stockPricesBefore, String cik, String figi, String compositeFigi, String shareClassFigi, String figiUniqueId, Boolean includeNonFigi, Integer pageSize, Boolean primaryListing, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllSecuritiesCall(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, primaryListing, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * All Securities
     * Returns a list of all securities available. Delisted securities included.
     * @param active When true, return securities that are active. When false, return securities that are not active. A security is considered active if it has traded or has had a corporate action in the past 30 days, and has not been merged into another security (such as due to ticker changes or corporate restructurings). (optional)
     * @param delisted When true, return securities that have been delisted from their exchange. Note that there may be a newer security for the same company that has been relisted on a differente exchange. When false, return securities that have not been delisted. (optional)
     * @param code Return securities classified with the given code (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param currency Return securities traded in the given 3-digit ISO 4217 currency code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param ticker Return securities traded with the given ticker. Note that securities across the world (and through time) may trade with the same ticker but represent different companies. Use this in conjuction with other parameters for more specificity. (optional)
     * @param name Return securities with the given text in their name (not case sensitive). (optional)
     * @param compositeMic Return securities classified under the composite exchange with the given Market Identification Code (MIC). A composite exchange may or may not be a real exchange.  For example, the USCOMP exchange (our only composite exchange to date) is a combination of exchanges with the following MICs: ARCX, XASE, XPOR, FINR, XCIS, XNAS, XNYS, BATS.  This composite grouping is done for user convenience.  At this time, all US securities are classified under the composite exchange with MIC USCOMP.  To query for specific US exchanges, use the exchange_mic parameter below.  (optional)
     * @param exchangeMic The MIC code of the exchange where the security is actually traded. (optional)
     * @param stockPricesAfter Return securities with end-of-day stock prices on or after this date. (optional)
     * @param stockPricesBefore Return securities with end-of-day stock prices on or before this date. (optional)
     * @param cik Return securities belonging to the company with the given Central Index Key (CIK). (optional)
     * @param figi Return securities with the given Exchange Level FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param compositeFigi Return securities with the given Country Composite FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param shareClassFigi Return securities with the given Global Share Class FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param figiUniqueId Return securities with the given FIGI Unique ID (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param includeNonFigi When true, include securities that do not have a FIGI. By default, this is false. If this parameter is not specified, only securities with a FIGI are returned. (optional, default to false)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param primaryListing If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange.  Returns both if omitted. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurities
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurities getAllSecurities(Boolean active, Boolean delisted, String code, String currency, String ticker, String name, String compositeMic, String exchangeMic, LocalDate stockPricesAfter, LocalDate stockPricesBefore, String cik, String figi, String compositeFigi, String shareClassFigi, String figiUniqueId, Boolean includeNonFigi, Integer pageSize, Boolean primaryListing, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getAllSecuritiesWithHttpInfo", Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, String.class, LocalDate.class, LocalDate.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Integer.class, Boolean.class, String.class);
      
      Object[] apiCallArguments = { active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, primaryListing, nextPage };
      ApiResponse<ApiResponseSecurities> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * All Securities
     * Returns a list of all securities available. Delisted securities included.
     * @param active When true, return securities that are active. When false, return securities that are not active. A security is considered active if it has traded or has had a corporate action in the past 30 days, and has not been merged into another security (such as due to ticker changes or corporate restructurings). (optional)
     * @param delisted When true, return securities that have been delisted from their exchange. Note that there may be a newer security for the same company that has been relisted on a differente exchange. When false, return securities that have not been delisted. (optional)
     * @param code Return securities classified with the given code (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param currency Return securities traded in the given 3-digit ISO 4217 currency code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param ticker Return securities traded with the given ticker. Note that securities across the world (and through time) may trade with the same ticker but represent different companies. Use this in conjuction with other parameters for more specificity. (optional)
     * @param name Return securities with the given text in their name (not case sensitive). (optional)
     * @param compositeMic Return securities classified under the composite exchange with the given Market Identification Code (MIC). A composite exchange may or may not be a real exchange.  For example, the USCOMP exchange (our only composite exchange to date) is a combination of exchanges with the following MICs: ARCX, XASE, XPOR, FINR, XCIS, XNAS, XNYS, BATS.  This composite grouping is done for user convenience.  At this time, all US securities are classified under the composite exchange with MIC USCOMP.  To query for specific US exchanges, use the exchange_mic parameter below.  (optional)
     * @param exchangeMic The MIC code of the exchange where the security is actually traded. (optional)
     * @param stockPricesAfter Return securities with end-of-day stock prices on or after this date. (optional)
     * @param stockPricesBefore Return securities with end-of-day stock prices on or before this date. (optional)
     * @param cik Return securities belonging to the company with the given Central Index Key (CIK). (optional)
     * @param figi Return securities with the given Exchange Level FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param compositeFigi Return securities with the given Country Composite FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param shareClassFigi Return securities with the given Global Share Class FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param figiUniqueId Return securities with the given FIGI Unique ID (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param includeNonFigi When true, include securities that do not have a FIGI. By default, this is false. If this parameter is not specified, only securities with a FIGI are returned. (optional, default to false)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param primaryListing If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange.  Returns both if omitted. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurities&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurities> getAllSecuritiesWithHttpInfo(Boolean active, Boolean delisted, String code, String currency, String ticker, String name, String compositeMic, String exchangeMic, LocalDate stockPricesAfter, LocalDate stockPricesBefore, String cik, String figi, String compositeFigi, String shareClassFigi, String figiUniqueId, Boolean includeNonFigi, Integer pageSize, Boolean primaryListing, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getAllSecuritiesValidateBeforeCall(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, primaryListing, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurities>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Securities (asynchronously)
     * Returns a list of all securities available. Delisted securities included.
     * @param active When true, return securities that are active. When false, return securities that are not active. A security is considered active if it has traded or has had a corporate action in the past 30 days, and has not been merged into another security (such as due to ticker changes or corporate restructurings). (optional)
     * @param delisted When true, return securities that have been delisted from their exchange. Note that there may be a newer security for the same company that has been relisted on a differente exchange. When false, return securities that have not been delisted. (optional)
     * @param code Return securities classified with the given code (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param currency Return securities traded in the given 3-digit ISO 4217 currency code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param ticker Return securities traded with the given ticker. Note that securities across the world (and through time) may trade with the same ticker but represent different companies. Use this in conjuction with other parameters for more specificity. (optional)
     * @param name Return securities with the given text in their name (not case sensitive). (optional)
     * @param compositeMic Return securities classified under the composite exchange with the given Market Identification Code (MIC). A composite exchange may or may not be a real exchange.  For example, the USCOMP exchange (our only composite exchange to date) is a combination of exchanges with the following MICs: ARCX, XASE, XPOR, FINR, XCIS, XNAS, XNYS, BATS.  This composite grouping is done for user convenience.  At this time, all US securities are classified under the composite exchange with MIC USCOMP.  To query for specific US exchanges, use the exchange_mic parameter below.  (optional)
     * @param exchangeMic The MIC code of the exchange where the security is actually traded. (optional)
     * @param stockPricesAfter Return securities with end-of-day stock prices on or after this date. (optional)
     * @param stockPricesBefore Return securities with end-of-day stock prices on or before this date. (optional)
     * @param cik Return securities belonging to the company with the given Central Index Key (CIK). (optional)
     * @param figi Return securities with the given Exchange Level FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param compositeFigi Return securities with the given Country Composite FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param shareClassFigi Return securities with the given Global Share Class FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param figiUniqueId Return securities with the given FIGI Unique ID (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). (optional)
     * @param includeNonFigi When true, include securities that do not have a FIGI. By default, this is false. If this parameter is not specified, only securities with a FIGI are returned. (optional, default to false)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param primaryListing If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange.  Returns both if omitted. (optional)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllSecuritiesAsync(Boolean active, Boolean delisted, String code, String currency, String ticker, String name, String compositeMic, String exchangeMic, LocalDate stockPricesAfter, LocalDate stockPricesBefore, String cik, String figi, String compositeFigi, String shareClassFigi, String figiUniqueId, Boolean includeNonFigi, Integer pageSize, Boolean primaryListing, String nextPage, final ApiCallback<ApiResponseSecurities> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllSecuritiesValidateBeforeCall(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, primaryListing, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurities>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityById
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityByIdCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}"
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
    private com.squareup.okhttp.Call getSecurityByIdValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityById(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityByIdCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lookup Security
     * Returns security reference data such as ticker, FIGI, primary exchange, CIK, and a unique security identifier.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return Security
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public Security getSecurityById(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityByIdWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<Security> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Lookup Security
     * Returns security reference data such as ticker, FIGI, primary exchange, CIK, and a unique security identifier.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return ApiResponse&lt;Security&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Security> getSecurityByIdWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityByIdValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<Security>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lookup Security (asynchronously)
     * Returns security reference data such as ticker, FIGI, primary exchange, CIK, and a unique security identifier.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityByIdAsync(String identifier, final ApiCallback<Security> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityByIdValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Security>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityDataPointNumber
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointNumberCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/data_point/{tag}/number"
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
    private com.squareup.okhttp.Call getSecurityDataPointNumberValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityDataPointNumber(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSecurityDataPointNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityDataPointNumberCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Data Point (Number) for Security
     * Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return BigDecimal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public BigDecimal getSecurityDataPointNumber(String identifier, String tag) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityDataPointNumberWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, tag };
      ApiResponse<BigDecimal> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Data Point (Number) for Security
     * Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @return ApiResponse&lt;BigDecimal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BigDecimal> getSecurityDataPointNumberWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityDataPointNumberValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Data Point (Number) for Security (asynchronously)
     * Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointNumberAsync(String identifier, String tag, final ApiCallback<BigDecimal> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityDataPointNumberValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BigDecimal>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityDataPointText
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointTextCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/data_point/{tag}/text"
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
    private com.squareup.okhttp.Call getSecurityDataPointTextValidateBeforeCall(String identifier, String tag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityDataPointText(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSecurityDataPointText(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityDataPointTextCall(identifier, tag, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Data Point (Text) for Security
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public String getSecurityDataPointText(String identifier, String tag) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityDataPointTextWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, tag };
      ApiResponse<String> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Data Point (Text) for Security
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getSecurityDataPointTextWithHttpInfo(String identifier, String tag) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityDataPointTextValidateBeforeCall(identifier, tag, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Data Point (Text) for Security (asynchronously)
     * Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code-name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityDataPointTextAsync(String identifier, String tag, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityDataPointTextValidateBeforeCall(identifier, tag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityHistoricalData
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoricalDataCall(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/historical_data/{tag}"
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
    private com.squareup.okhttp.Call getSecurityHistoricalDataValidateBeforeCall(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityHistoricalData(Async)");
        }
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new ApiException("Missing the required parameter 'tag' when calling getSecurityHistoricalData(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityHistoricalDataCall(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Historical Data for Security
     * Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityHistoricalData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityHistoricalData getSecurityHistoricalData(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityHistoricalDataWithHttpInfo", String.class, String.class, String.class, String.class, LocalDate.class, LocalDate.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityHistoricalData> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Historical Data for Security
     * Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityHistoricalData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityHistoricalData> getSecurityHistoricalDataWithHttpInfo(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityHistoricalDataValidateBeforeCall(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityHistoricalData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Historical Data for Security (asynchronously)
     * Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param tag An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) (required)
     * @param frequency Return historical data in the given frequency (optional, default to daily)
     * @param type Filter by type, when applicable (optional)
     * @param startDate Get historical data on or after this date (optional)
     * @param endDate Get historical date on or before this date (optional)
     * @param sortOrder Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; (optional, default to desc)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoricalDataAsync(String identifier, String tag, String frequency, String type, LocalDate startDate, LocalDate endDate, String sortOrder, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityHistoricalData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityHistoricalDataValidateBeforeCall(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityHistoricalData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityHistoryByIdentifier
     * @param identifier A Security identifier (FIGI, COMPOSITE FIGI, SHARE CLASS FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoryByIdentifierCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/history-by-identifier/{identifier}"
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
    private com.squareup.okhttp.Call getSecurityHistoryByIdentifierValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityHistoryByIdentifier(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityHistoryByIdentifierCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security History By Identifier
     * Lists the tickers a company has used over time.
     * @param identifier A Security identifier (FIGI, COMPOSITE FIGI, SHARE CLASS FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return SecurityHistoryListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityHistoryListResult getSecurityHistoryByIdentifier(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityHistoryByIdentifierWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<SecurityHistoryListResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security History By Identifier
     * Lists the tickers a company has used over time.
     * @param identifier A Security identifier (FIGI, COMPOSITE FIGI, SHARE CLASS FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return ApiResponse&lt;SecurityHistoryListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityHistoryListResult> getSecurityHistoryByIdentifierWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityHistoryByIdentifierValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<SecurityHistoryListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security History By Identifier (asynchronously)
     * Lists the tickers a company has used over time.
     * @param identifier A Security identifier (FIGI, COMPOSITE FIGI, SHARE CLASS FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoryByIdentifierAsync(String identifier, final ApiCallback<SecurityHistoryListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityHistoryByIdentifierValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityHistoryListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityHistoryByTicker
     * @param ticker A Security ticker symbol (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoryByTickerCall(String ticker, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/history-by-ticker/{ticker}"
            .replaceAll("\\{" + "ticker" + "\\}", apiClient.escapeString(ticker.toString()));

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
    private com.squareup.okhttp.Call getSecurityHistoryByTickerValidateBeforeCall(String ticker, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'ticker' is set
        if (ticker == null) {
            throw new ApiException("Missing the required parameter 'ticker' when calling getSecurityHistoryByTicker(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityHistoryByTickerCall(ticker, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security History By Ticker
     * Lists the tickers a company has used over time.
     * @param ticker A Security ticker symbol (required)
     * @return SecurityHistoryListResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityHistoryListResult getSecurityHistoryByTicker(String ticker) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityHistoryByTickerWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { ticker };
      ApiResponse<SecurityHistoryListResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security History By Ticker
     * Lists the tickers a company has used over time.
     * @param ticker A Security ticker symbol (required)
     * @return ApiResponse&lt;SecurityHistoryListResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityHistoryListResult> getSecurityHistoryByTickerWithHttpInfo(String ticker) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityHistoryByTickerValidateBeforeCall(ticker, null, null);
        Type localVarReturnType = new TypeToken<SecurityHistoryListResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security History By Ticker (asynchronously)
     * Lists the tickers a company has used over time.
     * @param ticker A Security ticker symbol (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityHistoryByTickerAsync(String ticker, final ApiCallback<SecurityHistoryListResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityHistoryByTickerValidateBeforeCall(ticker, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityHistoryListResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityInsiderOwnership
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityInsiderOwnershipCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/institutional_ownership"
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
    private com.squareup.okhttp.Call getSecurityInsiderOwnershipValidateBeforeCall(String identifier, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityInsiderOwnership(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityInsiderOwnershipCall(identifier, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Institutional Ownership by Security
     * Returns a list of all institutional owners of a given security.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityInstitutionalOwnership
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityInstitutionalOwnership getSecurityInsiderOwnership(String identifier, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityInsiderOwnershipWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, nextPage };
      ApiResponse<ApiResponseSecurityInstitutionalOwnership> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Institutional Ownership by Security
     * Returns a list of all institutional owners of a given security.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityInstitutionalOwnership&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityInstitutionalOwnership> getSecurityInsiderOwnershipWithHttpInfo(String identifier, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityInsiderOwnershipValidateBeforeCall(identifier, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityInstitutionalOwnership>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Institutional Ownership by Security (asynchronously)
     * Returns a list of all institutional owners of a given security.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityInsiderOwnershipAsync(String identifier, String nextPage, final ApiCallback<ApiResponseSecurityInstitutionalOwnership> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityInsiderOwnershipValidateBeforeCall(identifier, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityInstitutionalOwnership>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityIntervalMovers
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalMoversCall(String source, OffsetDateTime openTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/market_movers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (openTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_time", openTime));

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
    private com.squareup.okhttp.Call getSecurityIntervalMoversValidateBeforeCall(String source, OffsetDateTime openTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSecurityIntervalMoversCall(source, openTime, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security Intervals Movers
     * Returns a list of intervals for the biggest movers over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @return SecurityIntervalsMoversResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityIntervalsMoversResult getSecurityIntervalMovers(String source, OffsetDateTime openTime) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityIntervalMoversWithHttpInfo", String.class, OffsetDateTime.class);
      
      Object[] apiCallArguments = { source, openTime };
      ApiResponse<SecurityIntervalsMoversResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security Intervals Movers
     * Returns a list of intervals for the biggest movers over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @return ApiResponse&lt;SecurityIntervalsMoversResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityIntervalsMoversResult> getSecurityIntervalMoversWithHttpInfo(String source, OffsetDateTime openTime) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityIntervalMoversValidateBeforeCall(source, openTime, null, null);
        Type localVarReturnType = new TypeToken<SecurityIntervalsMoversResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security Intervals Movers (asynchronously)
     * Returns a list of intervals for the biggest movers over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalMoversAsync(String source, OffsetDateTime openTime, final ApiCallback<SecurityIntervalsMoversResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityIntervalMoversValidateBeforeCall(source, openTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityIntervalsMoversResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityIntervalMoversChange
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalMoversChangeCall(String source, OffsetDateTime openTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/market_movers/change";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (openTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_time", openTime));

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
    private com.squareup.okhttp.Call getSecurityIntervalMoversChangeValidateBeforeCall(String source, OffsetDateTime openTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSecurityIntervalMoversChangeCall(source, openTime, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security Intervals Movers By Change
     * Returns a list of intervals for the biggest movers by change over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @return SecurityIntervalsMoversResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityIntervalsMoversResult getSecurityIntervalMoversChange(String source, OffsetDateTime openTime) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityIntervalMoversChangeWithHttpInfo", String.class, OffsetDateTime.class);
      
      Object[] apiCallArguments = { source, openTime };
      ApiResponse<SecurityIntervalsMoversResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security Intervals Movers By Change
     * Returns a list of intervals for the biggest movers by change over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @return ApiResponse&lt;SecurityIntervalsMoversResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityIntervalsMoversResult> getSecurityIntervalMoversChangeWithHttpInfo(String source, OffsetDateTime openTime) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityIntervalMoversChangeValidateBeforeCall(source, openTime, null, null);
        Type localVarReturnType = new TypeToken<SecurityIntervalsMoversResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security Intervals Movers By Change (asynchronously)
     * Returns a list of intervals for the biggest movers by change over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalMoversChangeAsync(String source, OffsetDateTime openTime, final ApiCallback<SecurityIntervalsMoversResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityIntervalMoversChangeValidateBeforeCall(source, openTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityIntervalsMoversResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityIntervalMoversVolume
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalMoversVolumeCall(String source, OffsetDateTime openTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/market_movers/volume";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (openTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("open_time", openTime));

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
    private com.squareup.okhttp.Call getSecurityIntervalMoversVolumeValidateBeforeCall(String source, OffsetDateTime openTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSecurityIntervalMoversVolumeCall(source, openTime, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security Intervals Movers By Volume
     * Returns a list of intervals for the biggest movers by volume over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @return SecurityIntervalsMoversResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityIntervalsMoversResult getSecurityIntervalMoversVolume(String source, OffsetDateTime openTime) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityIntervalMoversVolumeWithHttpInfo", String.class, OffsetDateTime.class);
      
      Object[] apiCallArguments = { source, openTime };
      ApiResponse<SecurityIntervalsMoversResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security Intervals Movers By Volume
     * Returns a list of intervals for the biggest movers by volume over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @return ApiResponse&lt;SecurityIntervalsMoversResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityIntervalsMoversResult> getSecurityIntervalMoversVolumeWithHttpInfo(String source, OffsetDateTime openTime) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityIntervalMoversVolumeValidateBeforeCall(source, openTime, null, null);
        Type localVarReturnType = new TypeToken<SecurityIntervalsMoversResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security Intervals Movers By Volume (asynchronously)
     * Returns a list of intervals for the biggest movers by volume over the last hour interval.
     * @param source Realtime or 15-minute delayed contracts. (optional)
     * @param openTime The inclusive UTC date and time the interval opens at. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalMoversVolumeAsync(String source, OffsetDateTime openTime, final ApiCallback<SecurityIntervalsMoversResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityIntervalMoversVolumeValidateBeforeCall(source, openTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityIntervalsMoversResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityIntervalPrices
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param intervalSize The interval for which to return stock prices (required)
     * @param source Return intervals from the specified data source (optional)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalPricesCall(String identifier, String intervalSize, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/intervals"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (timezone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timezone", timezone));
        if (intervalSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("interval_size", intervalSize));
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
    private com.squareup.okhttp.Call getSecurityIntervalPricesValidateBeforeCall(String identifier, String intervalSize, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityIntervalPrices(Async)");
        }
        
        // verify the required parameter 'intervalSize' is set
        if (intervalSize == null) {
            throw new ApiException("Missing the required parameter 'intervalSize' when calling getSecurityIntervalPrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityIntervalPricesCall(identifier, intervalSize, source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Interval Stock Prices for Security
     * Return open, close, high, low, volume, average price, and change ratio for a particular interval for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param intervalSize The interval for which to return stock prices (required)
     * @param source Return intervals from the specified data source (optional)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityIntervalPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityIntervalPrices getSecurityIntervalPrices(String identifier, String intervalSize, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityIntervalPricesWithHttpInfo", String.class, String.class, String.class, LocalDate.class, String.class, LocalDate.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, intervalSize, source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityIntervalPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Interval Stock Prices for Security
     * Return open, close, high, low, volume, average price, and change ratio for a particular interval for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param intervalSize The interval for which to return stock prices (required)
     * @param source Return intervals from the specified data source (optional)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityIntervalPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityIntervalPrices> getSecurityIntervalPricesWithHttpInfo(String identifier, String intervalSize, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityIntervalPricesValidateBeforeCall(identifier, intervalSize, source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityIntervalPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Interval Stock Prices for Security (asynchronously)
     * Return open, close, high, low, volume, average price, and change ratio for a particular interval for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param intervalSize The interval for which to return stock prices (required)
     * @param source Return intervals from the specified data source (optional)
     * @param startDate Return intervals starting at the specified date (optional)
     * @param startTime Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param endDate Return intervals stopping at the specified date (optional)
     * @param endTime Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) (optional)
     * @param timezone Returns trading times in this timezone (optional, default to UTC)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntervalPricesAsync(String identifier, String intervalSize, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityIntervalPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityIntervalPricesValidateBeforeCall(identifier, intervalSize, source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityIntervalPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityIntradayPrices
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return intraday prices from the specified data source (optional)
     * @param startDate Return intraday prices starting at the specified date (optional)
     * @param startTime Return intraday prices starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param endDate Return intraday prices stopping at the specified date (optional)
     * @param endTime Return intraday prices stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntradayPricesCall(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/intraday"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
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
    private com.squareup.okhttp.Call getSecurityIntradayPricesValidateBeforeCall(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityIntradayPrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityIntradayPricesCall(identifier, source, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Intraday Stock Prices for Security
     * Return intraday stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return intraday prices from the specified data source (optional)
     * @param startDate Return intraday prices starting at the specified date (optional)
     * @param startTime Return intraday prices starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param endDate Return intraday prices stopping at the specified date (optional)
     * @param endTime Return intraday prices stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityIntradayPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityIntradayPrices getSecurityIntradayPrices(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityIntradayPricesWithHttpInfo", String.class, String.class, LocalDate.class, String.class, LocalDate.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, source, startDate, startTime, endDate, endTime, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityIntradayPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Intraday Stock Prices for Security
     * Return intraday stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return intraday prices from the specified data source (optional)
     * @param startDate Return intraday prices starting at the specified date (optional)
     * @param startTime Return intraday prices starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param endDate Return intraday prices stopping at the specified date (optional)
     * @param endTime Return intraday prices stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityIntradayPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityIntradayPrices> getSecurityIntradayPricesWithHttpInfo(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityIntradayPricesValidateBeforeCall(identifier, source, startDate, startTime, endDate, endTime, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityIntradayPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Intraday Stock Prices for Security (asynchronously)
     * Return intraday stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return intraday prices from the specified data source (optional)
     * @param startDate Return intraday prices starting at the specified date (optional)
     * @param startTime Return intraday prices starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param endDate Return intraday prices stopping at the specified date (optional)
     * @param endTime Return intraday prices stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityIntradayPricesAsync(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityIntradayPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityIntradayPricesValidateBeforeCall(identifier, source, startDate, startTime, endDate, endTime, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityIntradayPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityLatestDividendRecord
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityLatestDividendRecordCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/dividends/latest"
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
    private com.squareup.okhttp.Call getSecurityLatestDividendRecordValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityLatestDividendRecord(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityLatestDividendRecordCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Latest Dividend Record for Security
     * Returns the latest available dividend information for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return DividendRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public DividendRecord getSecurityLatestDividendRecord(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityLatestDividendRecordWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<DividendRecord> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Latest Dividend Record for Security
     * Returns the latest available dividend information for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return ApiResponse&lt;DividendRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DividendRecord> getSecurityLatestDividendRecordWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityLatestDividendRecordValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<DividendRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Latest Dividend Record for Security (asynchronously)
     * Returns the latest available dividend information for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityLatestDividendRecordAsync(String identifier, final ApiCallback<DividendRecord> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityLatestDividendRecordValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DividendRecord>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityLatestEarningsRecord
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityLatestEarningsRecordCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/earnings/latest"
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
    private com.squareup.okhttp.Call getSecurityLatestEarningsRecordValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityLatestEarningsRecord(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityLatestEarningsRecordCall(identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Latest Earnings Record for Security
     * Returns latest available earnings information for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return EarningsRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public EarningsRecord getSecurityLatestEarningsRecord(String identifier) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityLatestEarningsRecordWithHttpInfo", String.class);
      
      Object[] apiCallArguments = { identifier };
      ApiResponse<EarningsRecord> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Latest Earnings Record for Security
     * Returns latest available earnings information for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @return ApiResponse&lt;EarningsRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EarningsRecord> getSecurityLatestEarningsRecordWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityLatestEarningsRecordValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<EarningsRecord>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Latest Earnings Record for Security (asynchronously)
     * Returns latest available earnings information for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityLatestEarningsRecordAsync(String identifier, final ApiCallback<EarningsRecord> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityLatestEarningsRecordValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EarningsRecord>(){}.getType();
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
     * The Accumulation / Distribution Indicator is a volume-based technical indicator which uses the relationship between the stock&#x60;s price and volume flow to determine the underlying trend of a stock, up, down, or sideways trend of a stock.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsAdiWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAccumulationDistributionIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Accumulation/Distribution Index
     * The Accumulation / Distribution Indicator is a volume-based technical indicator which uses the relationship between the stock&#x60;s price and volume flow to determine the underlying trend of a stock, up, down, or sideways trend of a stock.
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
     * The Accumulation / Distribution Indicator is a volume-based technical indicator which uses the relationship between the stock&#x60;s price and volume flow to determine the underlying trend of a stock, up, down, or sideways trend of a stock.
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
     * Average Daily Trading Volume is the average number of shares traded over a given period, usually between 20 to 30 trading days.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsAdtvWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAverageDailyTradingVolume> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Average Daily Trading Volume
     * Average Daily Trading Volume is the average number of shares traded over a given period, usually between 20 to 30 trading days.
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
     * Average Daily Trading Volume is the average number of shares traded over a given period, usually between 20 to 30 trading days.
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
     * The Average Directional Index indicator is often used to identify decreasing or increasing price momentum for an underlying security, it is composed of a total of three indicators, the current trendline (adx), a positive directional indicator (di_pos), and a negative directional indicator (di_neg).
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsAdxWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAverageDirectionalIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Average Directional Index
     * The Average Directional Index indicator is often used to identify decreasing or increasing price momentum for an underlying security, it is composed of a total of three indicators, the current trendline (adx), a positive directional indicator (di_pos), and a negative directional indicator (di_neg).
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
     * The Average Directional Index indicator is often used to identify decreasing or increasing price momentum for an underlying security, it is composed of a total of three indicators, the current trendline (adx), a positive directional indicator (di_pos), and a negative directional indicator (di_neg).
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
     * The Awesome Oscillator (ao) is a momentum indicator and is calculated by taking the difference between the latest 5 period simple moving average and the 34 period simple moving average. Rather than using the closing price like other indicators, the Awesome Oscillator uses the latest period&#x60;s midpoint value (period_high - period_low / 2). The Awesome Oscillator is useful in identifying and trading, zero-line crossovers, twin-peaks trading, and bullish/bearish saucers - Awesome Oscillator is often aggregated with additional technical indicators.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsAoWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAwesomeOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Awesome Oscillator
     * The Awesome Oscillator (ao) is a momentum indicator and is calculated by taking the difference between the latest 5 period simple moving average and the 34 period simple moving average. Rather than using the closing price like other indicators, the Awesome Oscillator uses the latest period&#x60;s midpoint value (period_high - period_low / 2). The Awesome Oscillator is useful in identifying and trading, zero-line crossovers, twin-peaks trading, and bullish/bearish saucers - Awesome Oscillator is often aggregated with additional technical indicators.
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
     * The Awesome Oscillator (ao) is a momentum indicator and is calculated by taking the difference between the latest 5 period simple moving average and the 34 period simple moving average. Rather than using the closing price like other indicators, the Awesome Oscillator uses the latest period&#x60;s midpoint value (period_high - period_low / 2). The Awesome Oscillator is useful in identifying and trading, zero-line crossovers, twin-peaks trading, and bullish/bearish saucers - Awesome Oscillator is often aggregated with additional technical indicators.
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
     * The Average True Range (ATR) is a non-directional market volatility indicator often used to generate stop-out or entry indications. An increasing or expanding ATR typically indicates higher volatility, and a decreasing ATR indicates sideways price action and lower volatility.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsAtrWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityAverageTrueRange> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Average True Range
     * The Average True Range (ATR) is a non-directional market volatility indicator often used to generate stop-out or entry indications. An increasing or expanding ATR typically indicates higher volatility, and a decreasing ATR indicates sideways price action and lower volatility.
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
     * The Average True Range (ATR) is a non-directional market volatility indicator often used to generate stop-out or entry indications. An increasing or expanding ATR typically indicates higher volatility, and a decreasing ATR indicates sideways price action and lower volatility.
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
     * Bollinger Bands can be a useful technical analysis tool for generating oversold or overbought indicators. Bollinger Bands are composed of three lines, a simple moving average (middle band) and an upper and lower band – the upper and lower bands are typically 2 standard deviations +/- from a 20-day simple moving average, but can be modified. Traders typically consider an underlying security to be overbought as the underlying&#x60;s price moves towards the upper band and oversold as the underlying price moves towards the lower band.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsBbWithHttpInfo", String.class, Integer.class, Float.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityBollingerBands> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Bollinger Bands
     * Bollinger Bands can be a useful technical analysis tool for generating oversold or overbought indicators. Bollinger Bands are composed of three lines, a simple moving average (middle band) and an upper and lower band – the upper and lower bands are typically 2 standard deviations +/- from a 20-day simple moving average, but can be modified. Traders typically consider an underlying security to be overbought as the underlying&#x60;s price moves towards the upper band and oversold as the underlying price moves towards the lower band.
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
     * Bollinger Bands can be a useful technical analysis tool for generating oversold or overbought indicators. Bollinger Bands are composed of three lines, a simple moving average (middle band) and an upper and lower band – the upper and lower bands are typically 2 standard deviations +/- from a 20-day simple moving average, but can be modified. Traders typically consider an underlying security to be overbought as the underlying&#x60;s price moves towards the upper band and oversold as the underlying price moves towards the lower band.
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
     * The Commodity Channel Index (CCI) is a technical indicator used to generate buy and sell signals by indicating periods of strength and weakness in the market. CCI signals that fall below -100 are often perceived as weakness in the underlying price movement and CCI signals that rise above 100 indicate strength behind the underlying price movement.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsCciWithHttpInfo", String.class, Integer.class, Float.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, constant, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityCommodityChannelIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Commodity Channel Index
     * The Commodity Channel Index (CCI) is a technical indicator used to generate buy and sell signals by indicating periods of strength and weakness in the market. CCI signals that fall below -100 are often perceived as weakness in the underlying price movement and CCI signals that rise above 100 indicate strength behind the underlying price movement.
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
     * The Commodity Channel Index (CCI) is a technical indicator used to generate buy and sell signals by indicating periods of strength and weakness in the market. CCI signals that fall below -100 are often perceived as weakness in the underlying price movement and CCI signals that rise above 100 indicate strength behind the underlying price movement.
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
     * The Chaikin Money Flow (CMF) utilizes exponential moving averages as an indicator to monitor the flow of money and momentum. The CMF indicator oscillates around a midrange 0-line and ranges between 100 and -100.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsCmfWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityChaikinMoneyFlow> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Chaikin Money Flow
     * The Chaikin Money Flow (CMF) utilizes exponential moving averages as an indicator to monitor the flow of money and momentum. The CMF indicator oscillates around a midrange 0-line and ranges between 100 and -100.
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
     * The Chaikin Money Flow (CMF) utilizes exponential moving averages as an indicator to monitor the flow of money and momentum. The CMF indicator oscillates around a midrange 0-line and ranges between 100 and -100.
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
     * The Donchian Channel consists of an Upper Bound (upper_bound) and Lower Bound (lower_bound) that track the recent highs and lows and is often used to signal entry and exit points for a position. As the price of the underlying symbol increases the Upper Bound raises, if the price becomes range bound the Upper Bound will remain flat and if the price begins to decrease, the Upper Bound will fall (and vice-versa for the Lower Bound).
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsDcWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityDonchianChannel> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Donchian Channel
     * The Donchian Channel consists of an Upper Bound (upper_bound) and Lower Bound (lower_bound) that track the recent highs and lows and is often used to signal entry and exit points for a position. As the price of the underlying symbol increases the Upper Bound raises, if the price becomes range bound the Upper Bound will remain flat and if the price begins to decrease, the Upper Bound will fall (and vice-versa for the Lower Bound).
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
     * The Donchian Channel consists of an Upper Bound (upper_bound) and Lower Bound (lower_bound) that track the recent highs and lows and is often used to signal entry and exit points for a position. As the price of the underlying symbol increases the Upper Bound raises, if the price becomes range bound the Upper Bound will remain flat and if the price begins to decrease, the Upper Bound will fall (and vice-versa for the Lower Bound).
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
     * The Detrended Price Oscillator (DPO) signals the peaks and troughs of the underlying symbol’s price for a set period of time and is often used by traders to estimate future peaks and troughs using this as guidance to enter or exit a position.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsDpoWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityDetrendedPriceOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Detrended Price Oscillator
     * The Detrended Price Oscillator (DPO) signals the peaks and troughs of the underlying symbol’s price for a set period of time and is often used by traders to estimate future peaks and troughs using this as guidance to enter or exit a position.
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
     * The Detrended Price Oscillator (DPO) signals the peaks and troughs of the underlying symbol’s price for a set period of time and is often used by traders to estimate future peaks and troughs using this as guidance to enter or exit a position.
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
     * The Ease of Movement (EOM) is a volume based oscillator that fluctuates around a midrange 0-line into positive and negative values. Positive values indicate that the underlying symbol&#x60;s price is rising with relative ease and negative value indicates the underlying symbol&#x60;s price is failing with relative ease.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsEomWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityEaseOfMovement> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Ease of Movement
     * The Ease of Movement (EOM) is a volume based oscillator that fluctuates around a midrange 0-line into positive and negative values. Positive values indicate that the underlying symbol&#x60;s price is rising with relative ease and negative value indicates the underlying symbol&#x60;s price is failing with relative ease.
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
     * The Ease of Movement (EOM) is a volume based oscillator that fluctuates around a midrange 0-line into positive and negative values. Positive values indicate that the underlying symbol&#x60;s price is rising with relative ease and negative value indicates the underlying symbol&#x60;s price is failing with relative ease.
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
     * The Force Index (FI) is an oscillator that takes into account the intensity of an underlying symbol&#x60;s price movement and its corresponding volume. It is used to confirm price breakouts and signal underlying trends.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsFiWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityForceIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Force Index
     * The Force Index (FI) is an oscillator that takes into account the intensity of an underlying symbol&#x60;s price movement and its corresponding volume. It is used to confirm price breakouts and signal underlying trends.
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
     * The Force Index (FI) is an oscillator that takes into account the intensity of an underlying symbol&#x60;s price movement and its corresponding volume. It is used to confirm price breakouts and signal underlying trends.
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
     * The Ichimoku Kinko Hyo was designed to be an all-in-one trading indicator that could help traders determine momentum, support, and resistance.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsIchimokuWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityIchimokuKinkoHyo> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Ichimoku Kinko Hyo
     * The Ichimoku Kinko Hyo was designed to be an all-in-one trading indicator that could help traders determine momentum, support, and resistance.
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
     * The Ichimoku Kinko Hyo was designed to be an all-in-one trading indicator that could help traders determine momentum, support, and resistance.
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
     * The Keltner Channel is a volatility based signal, with upper, middle, and lower bands. It is often used at market open, when the largest moves tend to occur. In general, traders tend to buy if the price breaks up above the upper band or sell short if the price drops below the lower band.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsKcWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityKeltnerChannel> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Keltner Channel
     * The Keltner Channel is a volatility based signal, with upper, middle, and lower bands. It is often used at market open, when the largest moves tend to occur. In general, traders tend to buy if the price breaks up above the upper band or sell short if the price drops below the lower band.
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
     * The Keltner Channel is a volatility based signal, with upper, middle, and lower bands. It is often used at market open, when the largest moves tend to occur. In general, traders tend to buy if the price breaks up above the upper band or sell short if the price drops below the lower band.
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
     * The Know Sure Thing indicator (KST) is a momentum based oscillator that is calculated by measuring the momentum of four separate price cycles. KST fluctuates above and below a zero line and is used to identify overbought and oversold conditions, and is often used with additional indicators to boost signal strength.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsKstWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityKnowSureThing> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Know Sure Thing
     * The Know Sure Thing indicator (KST) is a momentum based oscillator that is calculated by measuring the momentum of four separate price cycles. KST fluctuates above and below a zero line and is used to identify overbought and oversold conditions, and is often used with additional indicators to boost signal strength.
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
     * The Know Sure Thing indicator (KST) is a momentum based oscillator that is calculated by measuring the momentum of four separate price cycles. KST fluctuates above and below a zero line and is used to identify overbought and oversold conditions, and is often used with additional indicators to boost signal strength.
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
     * Moving average convergence divergence (MACD) is a trend-following momentum oscillator that consists of three indicators: (1) a 12 period short-term exponential moving average (EMA) a 26 period long-term EMA and a 9 period EMA signal line. Traders using MACD often look for signal line crossovers, centerline crossovers, and EMA divergences to indicate the momentum and underlying trend of a security&#x60;s price.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsMacdWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityMovingAverageConvergenceDivergence> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Moving Average Convergence Divergence
     * Moving average convergence divergence (MACD) is a trend-following momentum oscillator that consists of three indicators: (1) a 12 period short-term exponential moving average (EMA) a 26 period long-term EMA and a 9 period EMA signal line. Traders using MACD often look for signal line crossovers, centerline crossovers, and EMA divergences to indicate the momentum and underlying trend of a security&#x60;s price.
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
     * Moving average convergence divergence (MACD) is a trend-following momentum oscillator that consists of three indicators: (1) a 12 period short-term exponential moving average (EMA) a 26 period long-term EMA and a 9 period EMA signal line. Traders using MACD often look for signal line crossovers, centerline crossovers, and EMA divergences to indicate the momentum and underlying trend of a security&#x60;s price.
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
     * The Money Flow Index (MFI) is a technical oscillator that incorporates both price and volume, moving between 0 and 100. Traders often consider a MFI above 80 as overbought conditions and below 20 as oversold conditions.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsMfiWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityMoneyFlowIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Money Flow Index
     * The Money Flow Index (MFI) is a technical oscillator that incorporates both price and volume, moving between 0 and 100. Traders often consider a MFI above 80 as overbought conditions and below 20 as oversold conditions.
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
     * The Money Flow Index (MFI) is a technical oscillator that incorporates both price and volume, moving between 0 and 100. Traders often consider a MFI above 80 as overbought conditions and below 20 as oversold conditions.
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
     * The mass index (MI) is a technical indicator used by traders to predict trend reversals. A trend reversal signal is said to occur when the 25-day MI reaches 27.0 and then falls below 26.0.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsMiWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityMassIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Mass Index
     * The mass index (MI) is a technical indicator used by traders to predict trend reversals. A trend reversal signal is said to occur when the 25-day MI reaches 27.0 and then falls below 26.0.
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
     * The mass index (MI) is a technical indicator used by traders to predict trend reversals. A trend reversal signal is said to occur when the 25-day MI reaches 27.0 and then falls below 26.0.
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
     * The negative volume index (NVI) is often referred to as the &#x60;smart money indicator.&#x60; It works by the assumption that smart money (institutional money) is at work when volume decreases and vice versa when volume increases. NVI starts at 1000 and increases in regard to the percentage price change when volume decreases over a 255-day EMA period. Traders often use this technical indicator when researching broder markets and indices.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsNviWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityNegativeVolumeIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Negative Volume Index
     * The negative volume index (NVI) is often referred to as the &#x60;smart money indicator.&#x60; It works by the assumption that smart money (institutional money) is at work when volume decreases and vice versa when volume increases. NVI starts at 1000 and increases in regard to the percentage price change when volume decreases over a 255-day EMA period. Traders often use this technical indicator when researching broder markets and indices.
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
     * The negative volume index (NVI) is often referred to as the &#x60;smart money indicator.&#x60; It works by the assumption that smart money (institutional money) is at work when volume decreases and vice versa when volume increases. NVI starts at 1000 and increases in regard to the percentage price change when volume decreases over a 255-day EMA period. Traders often use this technical indicator when researching broder markets and indices.
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
     * On-balance volume (OBV) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. When both OBV and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsObvWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityOnBalanceVolume> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * On-balance Volume
     * On-balance volume (OBV) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. When both OBV and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
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
     * On-balance volume (OBV) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. When both OBV and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
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
     * On-balance volume mean (OBVM) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. The difference between OBV and OBVM is that OBVM takes the mean average of a provided period.  When both OBVM and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsObvMeanWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityOnBalanceVolumeMean> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * On-balance Volume Mean
     * On-balance volume mean (OBVM) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. The difference between OBV and OBVM is that OBVM takes the mean average of a provided period.  When both OBVM and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
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
     * On-balance volume mean (OBVM) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. The difference between OBV and OBVM is that OBVM takes the mean average of a provided period.  When both OBVM and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.
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
     * Relative strength index (RSI) is a momentum oscillator that ranges between 0 and 100. Traders believe that an RSI value over 70 indicates that a security is overbought and an RSI under 30 indicates that a security is oversold.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsRsiWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityRelativeStrengthIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Relative Strength Index
     * Relative strength index (RSI) is a momentum oscillator that ranges between 0 and 100. Traders believe that an RSI value over 70 indicates that a security is overbought and an RSI under 30 indicates that a security is oversold.
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
     * Relative strength index (RSI) is a momentum oscillator that ranges between 0 and 100. Traders believe that an RSI value over 70 indicates that a security is overbought and an RSI under 30 indicates that a security is oversold.
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
     * A simple moving average (SMA) adds recent prices for a specified period and divides the total by that same number of periods. SMA is typically used to indicate whether a security is in an uptrend or downtrend and can also be combined with a long-term moving average to improve the signal&#x60;s abilities.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsSmaWithHttpInfo", String.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecuritySimpleMovingAverage> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Simple Moving Average
     * A simple moving average (SMA) adds recent prices for a specified period and divides the total by that same number of periods. SMA is typically used to indicate whether a security is in an uptrend or downtrend and can also be combined with a long-term moving average to improve the signal&#x60;s abilities.
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
     * A simple moving average (SMA) adds recent prices for a specified period and divides the total by that same number of periods. SMA is typically used to indicate whether a security is in an uptrend or downtrend and can also be combined with a long-term moving average to improve the signal&#x60;s abilities.
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
     * The Stochastic Oscillator (SO) is a range-bound momentum indicator that ranges from 0 to 100 and follows the velocity of the momentum itself, not the underlying price or volume. When SO is above 80 it indicates that a security is trading at the high end of its period&#x60;s high-low range and vice versa if the reading is below 20.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsSrWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityStochasticOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Stochastic Oscillator
     * The Stochastic Oscillator (SO) is a range-bound momentum indicator that ranges from 0 to 100 and follows the velocity of the momentum itself, not the underlying price or volume. When SO is above 80 it indicates that a security is trading at the high end of its period&#x60;s high-low range and vice versa if the reading is below 20.
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
     * The Stochastic Oscillator (SO) is a range-bound momentum indicator that ranges from 0 to 100 and follows the velocity of the momentum itself, not the underlying price or volume. When SO is above 80 it indicates that a security is trading at the high end of its period&#x60;s high-low range and vice versa if the reading is below 20.
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
     * The Triple Exponential Average (TEA) is a momentum indicator used to identify when a security is oversold and overbought. By exponentially smoothing out the underlying security&#x60;s moving average, the TEA  filters out insignificant price movements. A positive TEA is often believed to indicate momentum is increasing and a negative TEA indicates that momentum is decreasing.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsTrixWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityTripleExponentialAverage> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Triple Exponential Average
     * The Triple Exponential Average (TEA) is a momentum indicator used to identify when a security is oversold and overbought. By exponentially smoothing out the underlying security&#x60;s moving average, the TEA  filters out insignificant price movements. A positive TEA is often believed to indicate momentum is increasing and a negative TEA indicates that momentum is decreasing.
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
     * The Triple Exponential Average (TEA) is a momentum indicator used to identify when a security is oversold and overbought. By exponentially smoothing out the underlying security&#x60;s moving average, the TEA  filters out insignificant price movements. A positive TEA is often believed to indicate momentum is increasing and a negative TEA indicates that momentum is decreasing.
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
     * The True Strength Index (TSI) is a momentum oscillator used to identify building trends and trend reversals, typically by signalling overbought and oversold conditions. TSI fluctuates between positive and negative values, and traders typically combine its signal with other momentum oscillators to increase its strength. When TSI crosses the signal line into positive territory it is presumed to be an entrance opportunity and vice versa when the TSI crosses into negative territory.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsTsiWithHttpInfo", String.class, Integer.class, Integer.class, String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityTrueStrengthIndex> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * True Strength Index
     * The True Strength Index (TSI) is a momentum oscillator used to identify building trends and trend reversals, typically by signalling overbought and oversold conditions. TSI fluctuates between positive and negative values, and traders typically combine its signal with other momentum oscillators to increase its strength. When TSI crosses the signal line into positive territory it is presumed to be an entrance opportunity and vice versa when the TSI crosses into negative territory.
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
     * The True Strength Index (TSI) is a momentum oscillator used to identify building trends and trend reversals, typically by signalling overbought and oversold conditions. TSI fluctuates between positive and negative values, and traders typically combine its signal with other momentum oscillators to increase its strength. When TSI crosses the signal line into positive territory it is presumed to be an entrance opportunity and vice versa when the TSI crosses into negative territory.
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
     * The Ultimate Oscillator (UO) is a range bound technical indicator that moves between 0 and 100 and is calculated with 3 timeframes, typically 7, 14, and 28 day periods. When UO&#x60;s value is above 70 a security is categorized as overbought and when UO&#x60;s value is below 30 a security is categorized as oversold.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsUoWithHttpInfo", String.class, Integer.class, Integer.class, Integer.class, Float.class, Float.class, Float.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityUltimateOscillator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Ultimate Oscillator
     * The Ultimate Oscillator (UO) is a range bound technical indicator that moves between 0 and 100 and is calculated with 3 timeframes, typically 7, 14, and 28 day periods. When UO&#x60;s value is above 70 a security is categorized as overbought and when UO&#x60;s value is below 30 a security is categorized as oversold.
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
     * The Ultimate Oscillator (UO) is a range bound technical indicator that moves between 0 and 100 and is calculated with 3 timeframes, typically 7, 14, and 28 day periods. When UO&#x60;s value is above 70 a security is categorized as overbought and when UO&#x60;s value is below 30 a security is categorized as oversold.
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
     * The Vortex Indicator (VI) is composed of an uptrend line (VI+) and a downtrend line (VI-). When VI+ crosses VI- from below it typically indicates an entry into a given security. When VI- crosses VI+ from below it typically triggers an exit and that the current trend is reversing course.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsViWithHttpInfo", String.class, Integer.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityVortexIndicator> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Vortex Indicator
     * The Vortex Indicator (VI) is composed of an uptrend line (VI+) and a downtrend line (VI-). When VI+ crosses VI- from below it typically indicates an entry into a given security. When VI- crosses VI+ from below it typically triggers an exit and that the current trend is reversing course.
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
     * The Vortex Indicator (VI) is composed of an uptrend line (VI+) and a downtrend line (VI-). When VI+ crosses VI- from below it typically indicates an entry into a given security. When VI- crosses VI+ from below it typically triggers an exit and that the current trend is reversing course.
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
     * The volume price trend (VPT) is a technical indicator that uses price &amp; volume to determine whether a trend is established. Typically, when a security is trending upwards, there is more volume on positive days than negative ones, and as a result VPT should be increasing on these days as well. However, if VPT fails to increase past its previous high during an outbreak, this is suggested to indicate the rally is losing strength.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsVptWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityVolumePriceTrend> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Volume-price Trend
     * The volume price trend (VPT) is a technical indicator that uses price &amp; volume to determine whether a trend is established. Typically, when a security is trending upwards, there is more volume on positive days than negative ones, and as a result VPT should be increasing on these days as well. However, if VPT fails to increase past its previous high during an outbreak, this is suggested to indicate the rally is losing strength.
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
     * The volume price trend (VPT) is a technical indicator that uses price &amp; volume to determine whether a trend is established. Typically, when a security is trending upwards, there is more volume on positive days than negative ones, and as a result VPT should be increasing on these days as well. However, if VPT fails to increase past its previous high during an outbreak, this is suggested to indicate the rally is losing strength.
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
     * Volume Weighted Average Price (VWAP) is a lagging technical indicator that is used in combination with a security&#x60;s price. When the underlying price rises above its VWAP, it is often interpreted as a bullish signal, and vice versa in the opposite direction.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsVwapWithHttpInfo", String.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityVolumeWeightedAveragePrice> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Volume Weighted Average Price
     * Volume Weighted Average Price (VWAP) is a lagging technical indicator that is used in combination with a security&#x60;s price. When the underlying price rises above its VWAP, it is often interpreted as a bullish signal, and vice versa in the opposite direction.
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
     * Volume Weighted Average Price (VWAP) is a lagging technical indicator that is used in combination with a security&#x60;s price. When the underlying price rises above its VWAP, it is often interpreted as a bullish signal, and vice versa in the opposite direction.
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
     * Williams %R is a momentum indicator used to determine overbought and oversold environments for a security and fluctuates between 0 and -100. When Williams %R is above -20 the security is considered to be overbought and when Williams %R is under -80 the security is considered to be oversold.
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
      Method targetMethod = SecurityApi.class.getMethod("getSecurityPriceTechnicalsWrWithHttpInfo", String.class, Integer.class, String.class, String.class, BigDecimal.class, String.class);
      
      Object[] apiCallArguments = { identifier, period, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityWilliamsR> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Williams %R
     * Williams %R is a momentum indicator used to determine overbought and oversold environments for a security and fluctuates between 0 and -100. When Williams %R is above -20 the security is considered to be overbought and when Williams %R is under -80 the security is considered to be oversold.
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
     * Williams %R is a momentum indicator used to determine overbought and oversold environments for a security and fluctuates between 0 and -100. When Williams %R is above -20 the security is considered to be overbought and when Williams %R is under -80 the security is considered to be oversold.
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
    /**
     * Build call for getSecurityRealtimePrice
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return the realtime price from the specified data source. If no source is specified, the best source available is used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityRealtimePriceCall(String identifier, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/realtime"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getSecurityRealtimePriceValidateBeforeCall(String identifier, String source, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityRealtimePrice(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityRealtimePriceCall(identifier, source, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Realtime Stock Price for Security
     * Return the realtime stock price for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return the realtime price from the specified data source. If no source is specified, the best source available is used. (optional)
     * @return RealtimeStockPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public RealtimeStockPrice getSecurityRealtimePrice(String identifier, String source) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityRealtimePriceWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, source };
      ApiResponse<RealtimeStockPrice> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Realtime Stock Price for Security
     * Return the realtime stock price for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return the realtime price from the specified data source. If no source is specified, the best source available is used. (optional)
     * @return ApiResponse&lt;RealtimeStockPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RealtimeStockPrice> getSecurityRealtimePriceWithHttpInfo(String identifier, String source) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityRealtimePriceValidateBeforeCall(identifier, source, null, null);
        Type localVarReturnType = new TypeToken<RealtimeStockPrice>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Realtime Stock Price for Security (asynchronously)
     * Return the realtime stock price for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param source Return the realtime price from the specified data source. If no source is specified, the best source available is used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityRealtimePriceAsync(String identifier, String source, final ApiCallback<RealtimeStockPrice> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityRealtimePriceValidateBeforeCall(identifier, source, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RealtimeStockPrice>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityReplayFile
     * @param subsource The specific source of the data being requested. (required)
     * @param date The date for the data being requested. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityReplayFileCall(String subsource, LocalDate date, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/replay";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (subsource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("subsource", subsource));
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));

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
    private com.squareup.okhttp.Call getSecurityReplayFileValidateBeforeCall(String subsource, LocalDate date, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'subsource' is set
        if (subsource == null) {
            throw new ApiException("Missing the required parameter 'subsource' when calling getSecurityReplayFile(Async)");
        }
        
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling getSecurityReplayFile(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityReplayFileCall(subsource, date, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security Replay File
     * Returns a url where the requested replay file may be downloaded from.
     * @param subsource The specific source of the data being requested. (required)
     * @param date The date for the data being requested. (required)
     * @return SecurityReplayFileResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityReplayFileResult getSecurityReplayFile(String subsource, LocalDate date) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityReplayFileWithHttpInfo", String.class, LocalDate.class);
      
      Object[] apiCallArguments = { subsource, date };
      ApiResponse<SecurityReplayFileResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security Replay File
     * Returns a url where the requested replay file may be downloaded from.
     * @param subsource The specific source of the data being requested. (required)
     * @param date The date for the data being requested. (required)
     * @return ApiResponse&lt;SecurityReplayFileResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityReplayFileResult> getSecurityReplayFileWithHttpInfo(String subsource, LocalDate date) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityReplayFileValidateBeforeCall(subsource, date, null, null);
        Type localVarReturnType = new TypeToken<SecurityReplayFileResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security Replay File (asynchronously)
     * Returns a url where the requested replay file may be downloaded from.
     * @param subsource The specific source of the data being requested. (required)
     * @param date The date for the data being requested. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityReplayFileAsync(String subsource, LocalDate date, final ApiCallback<SecurityReplayFileResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityReplayFileValidateBeforeCall(subsource, date, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityReplayFileResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecuritySnapshots
     * @param atDatetime The UTC date and time (with url-encoded spaces) the snapshot will cover. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecuritySnapshotsCall(OffsetDateTime atDatetime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/snapshots";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (atDatetime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("at_datetime", atDatetime));

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
    private com.squareup.okhttp.Call getSecuritySnapshotsValidateBeforeCall(OffsetDateTime atDatetime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSecuritySnapshotsCall(atDatetime, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Realtime Stock Prices Snapshot
     * Returns all security snapshots for the queried interval with links to download.
     * @param atDatetime The UTC date and time (with url-encoded spaces) the snapshot will cover. (optional)
     * @return SecuritySnapshotsResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecuritySnapshotsResult getSecuritySnapshots(OffsetDateTime atDatetime) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecuritySnapshotsWithHttpInfo", OffsetDateTime.class);
      
      Object[] apiCallArguments = { atDatetime };
      ApiResponse<SecuritySnapshotsResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Realtime Stock Prices Snapshot
     * Returns all security snapshots for the queried interval with links to download.
     * @param atDatetime The UTC date and time (with url-encoded spaces) the snapshot will cover. (optional)
     * @return ApiResponse&lt;SecuritySnapshotsResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecuritySnapshotsResult> getSecuritySnapshotsWithHttpInfo(OffsetDateTime atDatetime) throws ApiException {
        com.squareup.okhttp.Call call = getSecuritySnapshotsValidateBeforeCall(atDatetime, null, null);
        Type localVarReturnType = new TypeToken<SecuritySnapshotsResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Realtime Stock Prices Snapshot (asynchronously)
     * Returns all security snapshots for the queried interval with links to download.
     * @param atDatetime The UTC date and time (with url-encoded spaces) the snapshot will cover. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecuritySnapshotsAsync(OffsetDateTime atDatetime, final ApiCallback<SecuritySnapshotsResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecuritySnapshotsValidateBeforeCall(atDatetime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecuritySnapshotsResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityStockPriceAdjustments
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPriceAdjustmentsCall(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices/adjustments"
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
    private com.squareup.okhttp.Call getSecurityStockPriceAdjustmentsValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityStockPriceAdjustments(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityStockPriceAdjustmentsCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Stock Price Adjustments by Security
     * Returns stock price adjustments for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityStockPriceAdjustments
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityStockPriceAdjustments getSecurityStockPriceAdjustments(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityStockPriceAdjustmentsWithHttpInfo", String.class, LocalDate.class, LocalDate.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityStockPriceAdjustments> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Stock Price Adjustments by Security
     * Returns stock price adjustments for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityStockPriceAdjustments&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityStockPriceAdjustments> getSecurityStockPriceAdjustmentsWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityStockPriceAdjustmentsValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPriceAdjustments>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Stock Price Adjustments by Security (asynchronously)
     * Returns stock price adjustments for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return price adjustments on or after the date (optional)
     * @param endDate Return price adjustments on or before the date (optional)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPriceAdjustmentsAsync(String identifier, LocalDate startDate, LocalDate endDate, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityStockPriceAdjustments> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityStockPriceAdjustmentsValidateBeforeCall(identifier, startDate, endDate, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPriceAdjustments>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityStockPrices
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPricesCall(String identifier, LocalDate startDate, LocalDate endDate, String frequency, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/prices"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (frequency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("frequency", frequency));
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
    private com.squareup.okhttp.Call getSecurityStockPricesValidateBeforeCall(String identifier, LocalDate startDate, LocalDate endDate, String frequency, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityStockPrices(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityStockPricesCall(identifier, startDate, endDate, frequency, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Stock Prices by Security
     * Return end-of-day stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityStockPrices
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityStockPrices getSecurityStockPrices(String identifier, LocalDate startDate, LocalDate endDate, String frequency, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityStockPricesWithHttpInfo", String.class, LocalDate.class, LocalDate.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, frequency, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityStockPrices> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Stock Prices by Security
     * Return end-of-day stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityStockPrices&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityStockPrices> getSecurityStockPricesWithHttpInfo(String identifier, LocalDate startDate, LocalDate endDate, String frequency, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityStockPricesValidateBeforeCall(identifier, startDate, endDate, frequency, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPrices>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Stock Prices by Security (asynchronously)
     * Return end-of-day stock prices for the Security with the given &#x60;identifier&#x60;
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param startDate Return prices on or after the date (optional)
     * @param endDate Return prices on or before the date (optional)
     * @param frequency Return stock prices in the given frequency (optional, default to daily)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityStockPricesAsync(String identifier, LocalDate startDate, LocalDate endDate, String frequency, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityStockPrices> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityStockPricesValidateBeforeCall(identifier, startDate, endDate, frequency, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityStockPrices>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityTrades
     * @param source The specific source of the data being requested. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityTradesCall(String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/trades";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (timezone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timezone", timezone));
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
    private com.squareup.okhttp.Call getSecurityTradesValidateBeforeCall(String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling getSecurityTrades(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityTradesCall(source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security Trades
     * Returns all trades between start time and end time, up to seven days ago for the specified source.
     * @param source The specific source of the data being requested. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return SecurityTradesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityTradesResult getSecurityTrades(String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityTradesWithHttpInfo", String.class, LocalDate.class, String.class, LocalDate.class, String.class, String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage };
      ApiResponse<SecurityTradesResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security Trades
     * Returns all trades between start time and end time, up to seven days ago for the specified source.
     * @param source The specific source of the data being requested. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;SecurityTradesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityTradesResult> getSecurityTradesWithHttpInfo(String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityTradesValidateBeforeCall(source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<SecurityTradesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security Trades (asynchronously)
     * Returns all trades between start time and end time, up to seven days ago for the specified source.
     * @param source The specific source of the data being requested. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityTradesAsync(String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Integer pageSize, String nextPage, final ApiCallback<SecurityTradesResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityTradesValidateBeforeCall(source, startDate, startTime, endDate, endTime, timezone, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityTradesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityTradesBySymbol
     * @param identifier The ticker symbol for which trades are being requested. (required)
     * @param source The specific source of the data being requested.  Specifying delayed sip will result in the system automatically determining which delayed sip source (cta_delayed, cta_b_delayed, utp_delayed) to use. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param darkpoolOnly Set to true to show only darkpool trades (optional, default to false)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityTradesBySymbolCall(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Boolean darkpoolOnly, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/trades"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("source", source));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_date", startDate));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start_time", startTime));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_date", endDate));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end_time", endTime));
        if (timezone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timezone", timezone));
        if (darkpoolOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("darkpool_only", darkpoolOnly));
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
    private com.squareup.okhttp.Call getSecurityTradesBySymbolValidateBeforeCall(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Boolean darkpoolOnly, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityTradesBySymbol(Async)");
        }
        
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling getSecurityTradesBySymbol(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityTradesBySymbolCall(identifier, source, startDate, startTime, endDate, endTime, timezone, darkpoolOnly, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Security Trades By Symbol
     * Returns all trades for a symbol between start time and end time, up to seven days ago for the specified source.
     * @param identifier The ticker symbol for which trades are being requested. (required)
     * @param source The specific source of the data being requested.  Specifying delayed sip will result in the system automatically determining which delayed sip source (cta_delayed, cta_b_delayed, utp_delayed) to use. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param darkpoolOnly Set to true to show only darkpool trades (optional, default to false)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return SecurityTradesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public SecurityTradesResult getSecurityTradesBySymbol(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Boolean darkpoolOnly, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityTradesBySymbolWithHttpInfo", String.class, String.class, LocalDate.class, String.class, LocalDate.class, String.class, String.class, Boolean.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, source, startDate, startTime, endDate, endTime, timezone, darkpoolOnly, pageSize, nextPage };
      ApiResponse<SecurityTradesResult> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Security Trades By Symbol
     * Returns all trades for a symbol between start time and end time, up to seven days ago for the specified source.
     * @param identifier The ticker symbol for which trades are being requested. (required)
     * @param source The specific source of the data being requested.  Specifying delayed sip will result in the system automatically determining which delayed sip source (cta_delayed, cta_b_delayed, utp_delayed) to use. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param darkpoolOnly Set to true to show only darkpool trades (optional, default to false)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;SecurityTradesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SecurityTradesResult> getSecurityTradesBySymbolWithHttpInfo(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Boolean darkpoolOnly, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityTradesBySymbolValidateBeforeCall(identifier, source, startDate, startTime, endDate, endTime, timezone, darkpoolOnly, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<SecurityTradesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Security Trades By Symbol (asynchronously)
     * Returns all trades for a symbol between start time and end time, up to seven days ago for the specified source.
     * @param identifier The ticker symbol for which trades are being requested. (required)
     * @param source The specific source of the data being requested.  Specifying delayed sip will result in the system automatically determining which delayed sip source (cta_delayed, cta_b_delayed, utp_delayed) to use. (required)
     * @param startDate The start date for the data being requested. (optional)
     * @param startTime The start time for the data being requested. (optional)
     * @param endDate The end date for the data being requested. (optional)
     * @param endTime The end time for the data being requested. (optional)
     * @param timezone The timezone the start and end date/times use. (optional, default to UTC)
     * @param darkpoolOnly Set to true to show only darkpool trades (optional, default to false)
     * @param pageSize The maximum number of results to return per page. (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityTradesBySymbolAsync(String identifier, String source, LocalDate startDate, String startTime, LocalDate endDate, String endTime, String timezone, Boolean darkpoolOnly, Integer pageSize, String nextPage, final ApiCallback<SecurityTradesResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityTradesBySymbolValidateBeforeCall(identifier, source, startDate, startTime, endDate, endTime, timezone, darkpoolOnly, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SecurityTradesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityZacksAnalystRatings
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
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
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksAnalystRatingsCall(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/zacks/analyst_ratings"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getSecurityZacksAnalystRatingsValidateBeforeCall(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityZacksAnalystRatings(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityZacksAnalystRatingsCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Analyst Ratings for Security
     * This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
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
     * @return ApiResponseSecurityZacksAnalystRatings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityZacksAnalystRatings getSecurityZacksAnalystRatings(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityZacksAnalystRatingsWithHttpInfo", String.class, String.class, String.class, BigDecimal.class, BigDecimal.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class);
      
      Object[] apiCallArguments = { identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize };
      ApiResponse<ApiResponseSecurityZacksAnalystRatings> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Analyst Ratings for Security
     * This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
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
     * @return ApiResponse&lt;ApiResponseSecurityZacksAnalystRatings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityZacksAnalystRatings> getSecurityZacksAnalystRatingsWithHttpInfo(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityZacksAnalystRatingsValidateBeforeCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksAnalystRatings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Analyst Ratings for Security (asynchronously)
     * This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
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
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksAnalystRatingsAsync(String identifier, String startDate, String endDate, BigDecimal meanGreater, BigDecimal meanLess, Integer strongBuysGreater, Integer strongBuysLess, Integer buysGreater, Integer buysLess, Integer holdsGreater, Integer holdsLess, Integer sellsGreater, Integer sellsLess, Integer strongSellsGreater, Integer strongSellsLess, Integer totalGreater, Integer totalLess, Integer pageSize, final ApiCallback<ApiResponseSecurityZacksAnalystRatings> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityZacksAnalystRatingsValidateBeforeCall(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksAnalystRatings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityZacksAnalystRatingsSnapshot
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param date Lookup a historical snapshot on the given date (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksAnalystRatingsSnapshotCall(String identifier, String date, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/zacks/analyst_ratings/snapshot"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (date != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("date", date));

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
    private com.squareup.okhttp.Call getSecurityZacksAnalystRatingsSnapshotValidateBeforeCall(String identifier, String date, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityZacksAnalystRatingsSnapshot(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityZacksAnalystRatingsSnapshotCall(identifier, date, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Analyst Ratings Snapshot
     * This database offers current and historical consensus analyst recommendation snapshots for over 5,000 US and Canadian listed companies.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param date Lookup a historical snapshot on the given date (optional)
     * @return ApiResponseSecurityZacksAnalystRatingsSnapshot
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityZacksAnalystRatingsSnapshot getSecurityZacksAnalystRatingsSnapshot(String identifier, String date) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityZacksAnalystRatingsSnapshotWithHttpInfo", String.class, String.class);
      
      Object[] apiCallArguments = { identifier, date };
      ApiResponse<ApiResponseSecurityZacksAnalystRatingsSnapshot> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Analyst Ratings Snapshot
     * This database offers current and historical consensus analyst recommendation snapshots for over 5,000 US and Canadian listed companies.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param date Lookup a historical snapshot on the given date (optional)
     * @return ApiResponse&lt;ApiResponseSecurityZacksAnalystRatingsSnapshot&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityZacksAnalystRatingsSnapshot> getSecurityZacksAnalystRatingsSnapshotWithHttpInfo(String identifier, String date) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityZacksAnalystRatingsSnapshotValidateBeforeCall(identifier, date, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksAnalystRatingsSnapshot>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Analyst Ratings Snapshot (asynchronously)
     * This database offers current and historical consensus analyst recommendation snapshots for over 5,000 US and Canadian listed companies.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param date Lookup a historical snapshot on the given date (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksAnalystRatingsSnapshotAsync(String identifier, String date, final ApiCallback<ApiResponseSecurityZacksAnalystRatingsSnapshot> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityZacksAnalystRatingsSnapshotValidateBeforeCall(identifier, date, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksAnalystRatingsSnapshot>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityZacksEpsSurprises
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksEpsSurprisesCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/zacks/eps_surprises"
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
    private com.squareup.okhttp.Call getSecurityZacksEpsSurprisesValidateBeforeCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityZacksEpsSurprises(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityZacksEpsSurprisesCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks EPS Surprises for Security
     * Returns historical estimated and actual earnings, guidance, and announcement dates for a specified symbol.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityZacksEPSSurprises
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityZacksEPSSurprises getSecurityZacksEpsSurprises(String identifier, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityZacksEpsSurprisesWithHttpInfo", String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityZacksEPSSurprises> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks EPS Surprises for Security
     * Returns historical estimated and actual earnings, guidance, and announcement dates for a specified symbol.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityZacksEPSSurprises&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityZacksEPSSurprises> getSecurityZacksEpsSurprisesWithHttpInfo(String identifier, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityZacksEpsSurprisesValidateBeforeCall(identifier, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksEPSSurprises>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks EPS Surprises for Security (asynchronously)
     * Returns historical estimated and actual earnings, guidance, and announcement dates for a specified symbol.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksEpsSurprisesAsync(String identifier, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityZacksEPSSurprises> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityZacksEpsSurprisesValidateBeforeCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksEPSSurprises>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSecurityZacksSalesSurprises
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksSalesSurprisesCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/{identifier}/zacks/sales_surprises"
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
    private com.squareup.okhttp.Call getSecurityZacksSalesSurprisesValidateBeforeCall(String identifier, Integer pageSize, String nextPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getSecurityZacksSalesSurprises(Async)");
        }
        

        com.squareup.okhttp.Call call = getSecurityZacksSalesSurprisesCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Zacks Sales Surprises for Security
     * This database returns historical estimated and actual sales, guidance, and announcement dates for a specified US or Canadian company.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponseSecurityZacksSalesSurprises
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecurityZacksSalesSurprises getSecurityZacksSalesSurprises(String identifier, Integer pageSize, String nextPage) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("getSecurityZacksSalesSurprisesWithHttpInfo", String.class, Integer.class, String.class);
      
      Object[] apiCallArguments = { identifier, pageSize, nextPage };
      ApiResponse<ApiResponseSecurityZacksSalesSurprises> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Zacks Sales Surprises for Security
     * This database returns historical estimated and actual sales, guidance, and announcement dates for a specified US or Canadian company.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @return ApiResponse&lt;ApiResponseSecurityZacksSalesSurprises&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecurityZacksSalesSurprises> getSecurityZacksSalesSurprisesWithHttpInfo(String identifier, Integer pageSize, String nextPage) throws ApiException {
        com.squareup.okhttp.Call call = getSecurityZacksSalesSurprisesValidateBeforeCall(identifier, pageSize, nextPage, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksSalesSurprises>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Zacks Sales Surprises for Security (asynchronously)
     * This database returns historical estimated and actual sales, guidance, and announcement dates for a specified US or Canadian company.
     * @param identifier A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param nextPage Gets the next page of data from a previous API call (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSecurityZacksSalesSurprisesAsync(String identifier, Integer pageSize, String nextPage, final ApiCallback<ApiResponseSecurityZacksSalesSurprises> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSecurityZacksSalesSurprisesValidateBeforeCall(identifier, pageSize, nextPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecurityZacksSalesSurprises>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for screenSecurities
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups. &lt;/br&gt; See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @param pageSize The number of results to return. Maximum for this endpoint is 50000. (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call screenSecuritiesCall(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = logic;

        // create path and map variables
        String localVarPath = "/securities/screen";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (orderColumn != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_column", orderColumn));
        if (orderDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_direction", orderDirection));
        if (primaryOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("primary_only", primaryOnly));
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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call screenSecuritiesValidateBeforeCall(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = screenSecuritiesCall(logic, orderColumn, orderDirection, primaryOnly, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Screen Securities
     * Screen Securities using complex logic. Use POST only. See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions.
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups. &lt;/br&gt; See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @param pageSize The number of results to return. Maximum for this endpoint is 50000. (optional, default to 100)
     * @return List&lt;SecurityScreenResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public List<SecurityScreenResult> screenSecurities(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("screenSecuritiesWithHttpInfo", SecurityScreenGroup.class, String.class, String.class, Boolean.class, Integer.class);
      
      Object[] apiCallArguments = { logic, orderColumn, orderDirection, primaryOnly, pageSize };
      ApiResponse<List<SecurityScreenResult>> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Screen Securities
     * Screen Securities using complex logic. Use POST only. See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions.
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups. &lt;/br&gt; See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @param pageSize The number of results to return. Maximum for this endpoint is 50000. (optional, default to 100)
     * @return ApiResponse&lt;List&lt;SecurityScreenResult&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SecurityScreenResult>> screenSecuritiesWithHttpInfo(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = screenSecuritiesValidateBeforeCall(logic, orderColumn, orderDirection, primaryOnly, pageSize, null, null);
        Type localVarReturnType = new TypeToken<List<SecurityScreenResult>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Screen Securities (asynchronously)
     * Screen Securities using complex logic. Use POST only. See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions.
     * @param logic The logic to screen with, consisting of operators, clauses, and nested groups. &lt;/br&gt; See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. (optional)
     * @param orderColumn Results returned sorted by this column (optional)
     * @param orderDirection Sort order to use with the order_column (optional, default to asc)
     * @param primaryOnly Return only primary securities (optional, default to false)
     * @param pageSize The number of results to return. Maximum for this endpoint is 50000. (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call screenSecuritiesAsync(SecurityScreenGroup logic, String orderColumn, String orderDirection, Boolean primaryOnly, Integer pageSize, final ApiCallback<List<SecurityScreenResult>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = screenSecuritiesValidateBeforeCall(logic, orderColumn, orderDirection, primaryOnly, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SecurityScreenResult>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchSecurities
     * @param query  (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchSecuritiesCall(String query, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/securities/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
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
    private com.squareup.okhttp.Call searchSecuritiesValidateBeforeCall(String query, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling searchSecurities(Async)");
        }
        

        com.squareup.okhttp.Call call = searchSecuritiesCall(query, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Securities
     * Search the securities database and return a list of securities matching the text query parameter passed through. Query parameter searches across the security ticker and name.
     * @param query  (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponseSecuritiesSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws NoSuchMethodException If fail to get specified method off of the main class
     */
    public ApiResponseSecuritiesSearch searchSecurities(String query, Integer pageSize) throws ApiException, NoSuchMethodException {
      Method targetMethod = SecurityApi.class.getMethod("searchSecuritiesWithHttpInfo", String.class, Integer.class);
      
      Object[] apiCallArguments = { query, pageSize };
      ApiResponse<ApiResponseSecuritiesSearch> resp = apiClient.attemptApiCall(targetMethod, apiCallArguments);
      return resp.getData();
    }

    /**
     * Search Securities
     * Search the securities database and return a list of securities matching the text query parameter passed through. Query parameter searches across the security ticker and name.
     * @param query  (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @return ApiResponse&lt;ApiResponseSecuritiesSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSecuritiesSearch> searchSecuritiesWithHttpInfo(String query, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = searchSecuritiesValidateBeforeCall(query, pageSize, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSecuritiesSearch>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Securities (asynchronously)
     * Search the securities database and return a list of securities matching the text query parameter passed through. Query parameter searches across the security ticker and name.
     * @param query  (required)
     * @param pageSize The number of results to return (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchSecuritiesAsync(String query, Integer pageSize, final ApiCallback<ApiResponseSecuritiesSearch> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchSecuritiesValidateBeforeCall(query, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSecuritiesSearch>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
