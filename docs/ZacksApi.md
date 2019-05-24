# ZacksApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZacksAnalystRatings**](ZacksApi.md#getZacksAnalystRatings) | **GET** /zacks/analyst_ratings | Zacks Analyst Ratings
[**getZacksEpsSurprises**](ZacksApi.md#getZacksEpsSurprises) | **GET** /zacks/eps_surprises | Zacks EPS Surprises
[**getZacksSalesSurprises**](ZacksApi.md#getZacksSalesSurprises) | **GET** /zacks/sales_surprises | Zacks Sales Surprises


<a name="getZacksAnalystRatings"></a>
# **getZacksAnalystRatings**
> ApiResponseZacksAnalystRatings getZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage)

Zacks Analyst Ratings

Returns buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. Zack’s storied research team aggregates and validates the ratings from professional analysts.

### Example
```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR API KEY");

    ZacksApi zacksApi = new ZacksApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    String startDate = null; // String | Limit ratings to those on or after this date
    String endDate = null; // String | Limit ratings to those on or before this date
    BigDecimal meanGreater = null; // BigDecimal | Return only records with a mean (average) higher than this value
    BigDecimal meanLess = null; // BigDecimal | Return only records with a mean (average) lower than this value
    Integer strongBuysGreater = null; // Integer | Return only records with more than this many Strong Buy recommendations
    Integer strongBuysLess = null; // Integer | Return only records with fewer than this many Strong Buy recommendations
    Integer buysGreater = null; // Integer | Return only records with more than this many Buy recommendations
    Integer buysLess = null; // Integer | Return only records with fewer than this many Buy recommendations
    Integer holdsGreater = null; // Integer | Return only records with more than this many Hold recommendations
    Integer holdsLess = null; // Integer | Return only records with fewer than this many Hold recommendations
    Integer sellsGreater = null; // Integer | Return only records with more than this many Sell recommendations
    Integer sellsLess = null; // Integer | Return only records with fewer than this many Sell recommendations
    Integer strongSellsGreater = null; // Integer | Return only records with more than this many Strong Sell recommendations
    Integer strongSellsLess = null; // Integer | Return only records with fewer than this many Strong Sell recommendations
    Integer totalGreater = null; // Integer | Return only records with more than this many recommendations, regardless of type
    Integer totalLess = null; // Integer | Return only records with fewer than this many recommendations, regardless of type
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseZacksAnalystRatings result = zacksApi.getZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ZacksApi#getZacksAnalystRatings");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | [optional]
 **startDate** | **String**| Limit ratings to those on or after this date | [optional]
 **endDate** | **String**| Limit ratings to those on or before this date | [optional]
 **meanGreater** | **BigDecimal**| Return only records with a mean (average) higher than this value | [optional]
 **meanLess** | **BigDecimal**| Return only records with a mean (average) lower than this value | [optional]
 **strongBuysGreater** | **Integer**| Return only records with more than this many Strong Buy recommendations | [optional]
 **strongBuysLess** | **Integer**| Return only records with fewer than this many Strong Buy recommendations | [optional]
 **buysGreater** | **Integer**| Return only records with more than this many Buy recommendations | [optional]
 **buysLess** | **Integer**| Return only records with fewer than this many Buy recommendations | [optional]
 **holdsGreater** | **Integer**| Return only records with more than this many Hold recommendations | [optional]
 **holdsLess** | **Integer**| Return only records with fewer than this many Hold recommendations | [optional]
 **sellsGreater** | **Integer**| Return only records with more than this many Sell recommendations | [optional]
 **sellsLess** | **Integer**| Return only records with fewer than this many Sell recommendations | [optional]
 **strongSellsGreater** | **Integer**| Return only records with more than this many Strong Sell recommendations | [optional]
 **strongSellsLess** | **Integer**| Return only records with fewer than this many Strong Sell recommendations | [optional]
 **totalGreater** | **Integer**| Return only records with more than this many recommendations, regardless of type | [optional]
 **totalLess** | **Integer**| Return only records with fewer than this many recommendations, regardless of type | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseZacksAnalystRatings**](ApiResponseZacksAnalystRatings.md)

<a name="getZacksEpsSurprises"></a>
# **getZacksEpsSurprises**
> ApiResponseZacksEPSSurprises getZacksEpsSurprises(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage)

Zacks EPS Surprises

Returns Zacks eps surprise data for all Securities.

### Example
```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR API KEY");

    ZacksApi zacksApi = new ZacksApi();

    String startDate = null; // String | Limit EPS surprises to those on or after this date
    String endDate = null; // String | Limit EPS surprises to those on or before this date
    BigDecimal epsActualGreater = null; // BigDecimal | Return only records with an actual EPS higher than this value
    BigDecimal epsActualLess = null; // BigDecimal | Return only records with an actual EPS lower than this value
    BigDecimal epsMeanEstimateGreater = null; // BigDecimal | Return only records with an EPS mean estimate greater than this value
    BigDecimal epsMeanEstimateLess = null; // BigDecimal | Return only records with an EPS mean estimate lower than this value
    BigDecimal epsAmountDiffGreater = null; // BigDecimal | Return only records with an EPS amount difference greater than this value
    BigDecimal epsAmountDiffLess = null; // BigDecimal | Return only records with an EPS amount difference less than this value
    BigDecimal epsPercentDiffGreater = null; // BigDecimal | Return only records with an EPS percent difference greater than this value
    BigDecimal epsPercentDiffLess = null; // BigDecimal | Return only records with an EPS percent difference less than this value
    BigDecimal epsCountEstimateGreater = null; // BigDecimal | Return only records with an EPS count estimate greater than this value
    BigDecimal epsCountEstimateLess = null; // BigDecimal | Return only records with an EPS count estimate less than this value
    BigDecimal epsStdDevEstimateGreater = null; // BigDecimal | Return only records with an EPS standard deviation greater than this value
    BigDecimal epsStdDevEstimateLess = null; // BigDecimal | Return only records with an EPS standard deviation less than this value
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseZacksEPSSurprises result = zacksApi.getZacksEpsSurprises(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ZacksApi#getZacksEpsSurprises");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Limit EPS surprises to those on or after this date | [optional]
 **endDate** | **String**| Limit EPS surprises to those on or before this date | [optional]
 **epsActualGreater** | **BigDecimal**| Return only records with an actual EPS higher than this value | [optional]
 **epsActualLess** | **BigDecimal**| Return only records with an actual EPS lower than this value | [optional]
 **epsMeanEstimateGreater** | **BigDecimal**| Return only records with an EPS mean estimate greater than this value | [optional]
 **epsMeanEstimateLess** | **BigDecimal**| Return only records with an EPS mean estimate lower than this value | [optional]
 **epsAmountDiffGreater** | **BigDecimal**| Return only records with an EPS amount difference greater than this value | [optional]
 **epsAmountDiffLess** | **BigDecimal**| Return only records with an EPS amount difference less than this value | [optional]
 **epsPercentDiffGreater** | **BigDecimal**| Return only records with an EPS percent difference greater than this value | [optional]
 **epsPercentDiffLess** | **BigDecimal**| Return only records with an EPS percent difference less than this value | [optional]
 **epsCountEstimateGreater** | **BigDecimal**| Return only records with an EPS count estimate greater than this value | [optional]
 **epsCountEstimateLess** | **BigDecimal**| Return only records with an EPS count estimate less than this value | [optional]
 **epsStdDevEstimateGreater** | **BigDecimal**| Return only records with an EPS standard deviation greater than this value | [optional]
 **epsStdDevEstimateLess** | **BigDecimal**| Return only records with an EPS standard deviation less than this value | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseZacksEPSSurprises**](ApiResponseZacksEPSSurprises.md)

<a name="getZacksSalesSurprises"></a>
# **getZacksSalesSurprises**
> ApiResponseZacksSalesSurprises getZacksSalesSurprises(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage)

Zacks Sales Surprises

Returns Zacks sales surprise data for all Securities.

### Example
```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR API KEY");

    ZacksApi zacksApi = new ZacksApi();

    String startDate = null; // String | Limit sales surprises to those on or after this date
    String endDate = null; // String | Limit sales surprises to those on or before this date
    BigDecimal salesActualGreater = null; // BigDecimal | Return only records with an actual sales higher than this value
    BigDecimal salesActualLess = null; // BigDecimal | Return only records with an actual sales lower than this value
    BigDecimal salesMeanEstimateGreater = null; // BigDecimal | Return only records with a sales mean estimate greater than this value
    BigDecimal salesMeanEstimateLess = null; // BigDecimal | Return only records with a sales mean estimate lower than this value
    BigDecimal salesAmountDiffGreater = null; // BigDecimal | Return only records with a sales amount difference greater than this value
    BigDecimal salesAmountDiffLess = null; // BigDecimal | Return only records with a sales amount difference less than this value
    BigDecimal salesPercentDiffGreater = null; // BigDecimal | Return only records with a sales percent difference greater than this value
    BigDecimal salesPercentDiffLess = null; // BigDecimal | Return only records with a sales percent difference less than this value
    BigDecimal salesCountEstimateGreater = null; // BigDecimal | Return only records with a sales count estimate greater than this value
    BigDecimal salesCountEstimateLess = null; // BigDecimal | Return only records with a sales count estimate less than this value
    BigDecimal salesStdDevEstimateGreater = null; // BigDecimal | Return only records with a sales standard deviation greater than this value
    BigDecimal salesStdDevEstimateLess = null; // BigDecimal | Return only records with a sales standard deviation less than this value
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseZacksSalesSurprises result = zacksApi.getZacksSalesSurprises(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ZacksApi#getZacksSalesSurprises");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Limit sales surprises to those on or after this date | [optional]
 **endDate** | **String**| Limit sales surprises to those on or before this date | [optional]
 **salesActualGreater** | **BigDecimal**| Return only records with an actual sales higher than this value | [optional]
 **salesActualLess** | **BigDecimal**| Return only records with an actual sales lower than this value | [optional]
 **salesMeanEstimateGreater** | **BigDecimal**| Return only records with a sales mean estimate greater than this value | [optional]
 **salesMeanEstimateLess** | **BigDecimal**| Return only records with a sales mean estimate lower than this value | [optional]
 **salesAmountDiffGreater** | **BigDecimal**| Return only records with a sales amount difference greater than this value | [optional]
 **salesAmountDiffLess** | **BigDecimal**| Return only records with a sales amount difference less than this value | [optional]
 **salesPercentDiffGreater** | **BigDecimal**| Return only records with a sales percent difference greater than this value | [optional]
 **salesPercentDiffLess** | **BigDecimal**| Return only records with a sales percent difference less than this value | [optional]
 **salesCountEstimateGreater** | **BigDecimal**| Return only records with a sales count estimate greater than this value | [optional]
 **salesCountEstimateLess** | **BigDecimal**| Return only records with a sales count estimate less than this value | [optional]
 **salesStdDevEstimateGreater** | **BigDecimal**| Return only records with a sales standard deviation greater than this value | [optional]
 **salesStdDevEstimateLess** | **BigDecimal**| Return only records with a sales standard deviation less than this value | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseZacksSalesSurprises**](ApiResponseZacksSalesSurprises.md)

