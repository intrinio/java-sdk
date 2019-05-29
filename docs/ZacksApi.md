# ZacksApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZacksAnalystRatings**](ZacksApi.md#getZacksAnalystRatings) | **GET** /zacks/analyst_ratings | Zacks Analyst Ratings
[**getZacksEpsSurprises**](ZacksApi.md#getZacksEpsSurprises) | **GET** /zacks/eps_surprises | Zacks EPS Surprises
[**getZacksSalesSurprises**](ZacksApi.md#getZacksSalesSurprises) | **GET** /zacks/sales_surprises | Zacks Sales Surprises



[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksAnalystRatings)

[//]: # (RETURN_TYPE:ApiResponseZacksAnalystRatings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksAnalystRatings.md)

[//]: # (OPERATION:getZacksAnalystRatings_v2)

[//]: # (ENDPOINT:/zacks/analyst_ratings)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksAnalystRatings)

<a name="getZacksAnalystRatings"></a>
## **getZacksAnalystRatings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getZacksAnalystRatings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksAnalystRatings getZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize, nextPage)

#### Zacks Analyst Ratings


Returns buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. Zack’s storied research team aggregates and validates the ratings from professional analysts.

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

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
    auth.setApiKey("YOUR_API_KEY");

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

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | [optional] &nbsp;
 **startDate** | String| Limit ratings to those on or after this date | [optional] &nbsp;
 **endDate** | String| Limit ratings to those on or before this date | [optional] &nbsp;
 **meanGreater** | BigDecimal| Return only records with a mean (average) higher than this value | [optional] &nbsp;
 **meanLess** | BigDecimal| Return only records with a mean (average) lower than this value | [optional] &nbsp;
 **strongBuysGreater** | Integer| Return only records with more than this many Strong Buy recommendations | [optional] &nbsp;
 **strongBuysLess** | Integer| Return only records with fewer than this many Strong Buy recommendations | [optional] &nbsp;
 **buysGreater** | Integer| Return only records with more than this many Buy recommendations | [optional] &nbsp;
 **buysLess** | Integer| Return only records with fewer than this many Buy recommendations | [optional] &nbsp;
 **holdsGreater** | Integer| Return only records with more than this many Hold recommendations | [optional] &nbsp;
 **holdsLess** | Integer| Return only records with fewer than this many Hold recommendations | [optional] &nbsp;
 **sellsGreater** | Integer| Return only records with more than this many Sell recommendations | [optional] &nbsp;
 **sellsLess** | Integer| Return only records with fewer than this many Sell recommendations | [optional] &nbsp;
 **strongSellsGreater** | Integer| Return only records with more than this many Strong Sell recommendations | [optional] &nbsp;
 **strongSellsLess** | Integer| Return only records with fewer than this many Strong Sell recommendations | [optional] &nbsp;
 **totalGreater** | Integer| Return only records with more than this many recommendations, regardless of type | [optional] &nbsp;
 **totalLess** | Integer| Return only records with fewer than this many recommendations, regardless of type | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksAnalystRatings**](ApiResponseZacksAnalystRatings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksEpsSurprises)

[//]: # (RETURN_TYPE:ApiResponseZacksEPSSurprises)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksEPSSurprises.md)

[//]: # (OPERATION:getZacksEpsSurprises_v2)

[//]: # (ENDPOINT:/zacks/eps_surprises)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksEpsSurprises)

<a name="getZacksEpsSurprises"></a>
## **getZacksEpsSurprises**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getZacksEpsSurprises_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksEPSSurprises getZacksEpsSurprises(startDate, endDate, epsActualGreater, epsActualLess, epsMeanEstimateGreater, epsMeanEstimateLess, epsAmountDiffGreater, epsAmountDiffLess, epsPercentDiffGreater, epsPercentDiffLess, epsCountEstimateGreater, epsCountEstimateLess, epsStdDevEstimateGreater, epsStdDevEstimateLess, pageSize, nextPage)

#### Zacks EPS Surprises


Returns Zacks eps surprise data for all Securities.

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

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
    auth.setApiKey("YOUR_API_KEY");

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

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | String| Limit EPS surprises to those on or after this date | [optional] &nbsp;
 **endDate** | String| Limit EPS surprises to those on or before this date | [optional] &nbsp;
 **epsActualGreater** | BigDecimal| Return only records with an actual EPS higher than this value | [optional] &nbsp;
 **epsActualLess** | BigDecimal| Return only records with an actual EPS lower than this value | [optional] &nbsp;
 **epsMeanEstimateGreater** | BigDecimal| Return only records with an EPS mean estimate greater than this value | [optional] &nbsp;
 **epsMeanEstimateLess** | BigDecimal| Return only records with an EPS mean estimate lower than this value | [optional] &nbsp;
 **epsAmountDiffGreater** | BigDecimal| Return only records with an EPS amount difference greater than this value | [optional] &nbsp;
 **epsAmountDiffLess** | BigDecimal| Return only records with an EPS amount difference less than this value | [optional] &nbsp;
 **epsPercentDiffGreater** | BigDecimal| Return only records with an EPS percent difference greater than this value | [optional] &nbsp;
 **epsPercentDiffLess** | BigDecimal| Return only records with an EPS percent difference less than this value | [optional] &nbsp;
 **epsCountEstimateGreater** | BigDecimal| Return only records with an EPS count estimate greater than this value | [optional] &nbsp;
 **epsCountEstimateLess** | BigDecimal| Return only records with an EPS count estimate less than this value | [optional] &nbsp;
 **epsStdDevEstimateGreater** | BigDecimal| Return only records with an EPS standard deviation greater than this value | [optional] &nbsp;
 **epsStdDevEstimateLess** | BigDecimal| Return only records with an EPS standard deviation less than this value | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksEPSSurprises**](ApiResponseZacksEPSSurprises.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:ZacksApi)

[//]: # (METHOD:getZacksSalesSurprises)

[//]: # (RETURN_TYPE:ApiResponseZacksSalesSurprises)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseZacksSalesSurprises.md)

[//]: # (OPERATION:getZacksSalesSurprises_v2)

[//]: # (ENDPOINT:/zacks/sales_surprises)

[//]: # (DOCUMENT_LINK:ZacksApi.md#getZacksSalesSurprises)

<a name="getZacksSalesSurprises"></a>
## **getZacksSalesSurprises**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getZacksSalesSurprises_v2)

[//]: # (START_OVERVIEW)

> ApiResponseZacksSalesSurprises getZacksSalesSurprises(startDate, endDate, salesActualGreater, salesActualLess, salesMeanEstimateGreater, salesMeanEstimateLess, salesAmountDiffGreater, salesAmountDiffLess, salesPercentDiffGreater, salesPercentDiffLess, salesCountEstimateGreater, salesCountEstimateLess, salesStdDevEstimateGreater, salesStdDevEstimateLess, pageSize, nextPage)

#### Zacks Sales Surprises


Returns Zacks sales surprise data for all Securities.

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

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
    auth.setApiKey("YOUR_API_KEY");

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

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | String| Limit sales surprises to those on or after this date | [optional] &nbsp;
 **endDate** | String| Limit sales surprises to those on or before this date | [optional] &nbsp;
 **salesActualGreater** | BigDecimal| Return only records with an actual sales higher than this value | [optional] &nbsp;
 **salesActualLess** | BigDecimal| Return only records with an actual sales lower than this value | [optional] &nbsp;
 **salesMeanEstimateGreater** | BigDecimal| Return only records with a sales mean estimate greater than this value | [optional] &nbsp;
 **salesMeanEstimateLess** | BigDecimal| Return only records with a sales mean estimate lower than this value | [optional] &nbsp;
 **salesAmountDiffGreater** | BigDecimal| Return only records with a sales amount difference greater than this value | [optional] &nbsp;
 **salesAmountDiffLess** | BigDecimal| Return only records with a sales amount difference less than this value | [optional] &nbsp;
 **salesPercentDiffGreater** | BigDecimal| Return only records with a sales percent difference greater than this value | [optional] &nbsp;
 **salesPercentDiffLess** | BigDecimal| Return only records with a sales percent difference less than this value | [optional] &nbsp;
 **salesCountEstimateGreater** | BigDecimal| Return only records with a sales count estimate greater than this value | [optional] &nbsp;
 **salesCountEstimateLess** | BigDecimal| Return only records with a sales count estimate less than this value | [optional] &nbsp;
 **salesStdDevEstimateGreater** | BigDecimal| Return only records with a sales standard deviation greater than this value | [optional] &nbsp;
 **salesStdDevEstimateLess** | BigDecimal| Return only records with a sales standard deviation less than this value | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseZacksSalesSurprises**](ApiResponseZacksSalesSurprises.md)

[//]: # (END_OPERATION)

