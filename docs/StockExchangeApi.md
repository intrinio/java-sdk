# StockExchangeApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllStockExchanges**](StockExchangeApi.md#getAllStockExchanges) | **GET** /stock_exchanges | All Stock Exchanges
[**getStockExchangeById**](StockExchangeApi.md#getStockExchangeById) | **GET** /stock_exchanges/{identifier} | Lookup Stock Exchange
[**getStockExchangePriceAdjustments**](StockExchangeApi.md#getStockExchangePriceAdjustments) | **GET** /stock_exchanges/{identifier}/prices/adjustments | Stock Price Adjustments by Exchange
[**getStockExchangePrices**](StockExchangeApi.md#getStockExchangePrices) | **GET** /stock_exchanges/{identifier}/prices | Stock Prices by Exchange
[**getStockExchangeRealtimePrices**](StockExchangeApi.md#getStockExchangeRealtimePrices) | **GET** /stock_exchanges/{identifier}/prices/realtime | Realtime Stock Prices by Exchange
[**getStockExchangeSecurities**](StockExchangeApi.md#getStockExchangeSecurities) | **GET** /stock_exchanges/{identifier}/securities | Securities by Exchange



[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/stock_exchanges)

[//]: # (DOC_LINK:StockExchangeApi.md#getAllStockExchanges)

<a name="getAllStockExchanges"></a>
# **getAllStockExchanges**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getAllStockExchanges_v2)

> ApiResponseStockExchanges getAllStockExchanges(city, country, countryCode, pageSize)

All Stock Exchanges

Returns all Stock Exchanges matching the specified parameters

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
    auth.setApiKey("YOUR API KEY");

    StockExchangeApi stockExchangeApi = new StockExchangeApi();

    String city = "city_example"; // String | Filter by city
    String country = "CHINA"; // String | Filter by country
    String countryCode = "countryCode_example"; // String | Filter by ISO country code
    Integer pageSize = 100; // Integer | The number of results to return

    try {
        ApiResponseStockExchanges result = stockExchangeApi.getAllStockExchanges(city, country, countryCode, pageSize);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling StockExchangeApi#getAllStockExchanges");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **String**| Filter by city | [optional]
 **country** | **String**| Filter by country | [optional]
 **countryCode** | **String**| Filter by ISO country code | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseStockExchanges**](ApiResponseStockExchanges.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/stock_exchanges/{identifier})

[//]: # (DOC_LINK:StockExchangeApi.md#getStockExchangeById)

<a name="getStockExchangeById"></a>
# **getStockExchangeById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangeById_v2)

> StockExchange getStockExchangeById(identifier)

Lookup Stock Exchange

Returns the Stock Exchange with the given &#x60;identifier&#x60;

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
    auth.setApiKey("YOUR API KEY");

    StockExchangeApi stockExchangeApi = new StockExchangeApi();

    String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)

    try {
        StockExchange result = stockExchangeApi.getStockExchangeById(identifier);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling StockExchangeApi#getStockExchangeById");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |

### Return type

[**StockExchange**](StockExchange.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/prices/adjustments)

[//]: # (DOC_LINK:StockExchangeApi.md#getStockExchangePriceAdjustments)

<a name="getStockExchangePriceAdjustments"></a>
# **getStockExchangePriceAdjustments**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangePriceAdjustments_v2)

> ApiResponseStockExchangeStockPriceAdjustments getStockExchangePriceAdjustments(identifier, date, pageSize, nextPage)

Stock Price Adjustments by Exchange

Returns stock price adjustments for the Stock Exchange with the given &#x60;identifier&#x60;

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
    auth.setApiKey("YOUR API KEY");

    StockExchangeApi stockExchangeApi = new StockExchangeApi();

    String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
    LocalDate date = null; // LocalDate | The date for which to return price adjustments
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseStockExchangeStockPriceAdjustments result = stockExchangeApi.getStockExchangePriceAdjustments(identifier, date, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling StockExchangeApi#getStockExchangePriceAdjustments");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |
 **date** | **LocalDate**| The date for which to return price adjustments | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockExchangeStockPriceAdjustments**](ApiResponseStockExchangeStockPriceAdjustments.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/prices)

[//]: # (DOC_LINK:StockExchangeApi.md#getStockExchangePrices)

<a name="getStockExchangePrices"></a>
# **getStockExchangePrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangePrices_v2)

> ApiResponseStockExchangeStockPrices getStockExchangePrices(identifier, date, pageSize, nextPage)

Stock Prices by Exchange

Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)

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
    auth.setApiKey("YOUR API KEY");

    StockExchangeApi stockExchangeApi = new StockExchangeApi();

    String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
    LocalDate date = null; // LocalDate | The date for which to return prices
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseStockExchangeStockPrices result = stockExchangeApi.getStockExchangePrices(identifier, date, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling StockExchangeApi#getStockExchangePrices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |
 **date** | **LocalDate**| The date for which to return prices | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockExchangeStockPrices**](ApiResponseStockExchangeStockPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/prices/realtime)

[//]: # (DOC_LINK:StockExchangeApi.md#getStockExchangeRealtimePrices)

<a name="getStockExchangeRealtimePrices"></a>
# **getStockExchangeRealtimePrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangeRealtimePrices_v2)

> ApiResponseStockExchangeRealtimeStockPrices getStockExchangeRealtimePrices(identifier, source, pageSize, nextPage)

Realtime Stock Prices by Exchange

Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;

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
    auth.setApiKey("YOUR API KEY");

    StockExchangeApi stockExchangeApi = new StockExchangeApi();

    String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
    String source = null; // String | Return realtime prices from the specified data source
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseStockExchangeRealtimeStockPrices result = stockExchangeApi.getStockExchangeRealtimePrices(identifier, source, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling StockExchangeApi#getStockExchangeRealtimePrices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |
 **source** | **String**| Return realtime prices from the specified data source | [optional] [enum: iex, bats, bats_delayed]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockExchangeRealtimeStockPrices**](ApiResponseStockExchangeRealtimeStockPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/securities)

[//]: # (DOC_LINK:StockExchangeApi.md#getStockExchangeSecurities)

<a name="getStockExchangeSecurities"></a>
# **getStockExchangeSecurities**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangeSecurities_v2)

> ApiResponseStockExchangeSecurities getStockExchangeSecurities(identifier, pageSize, nextPage)

Securities by Exchange

Returns Securities traded on the Stock Exchange with &#x60;identifier&#x60;

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
    auth.setApiKey("YOUR API KEY");

    StockExchangeApi stockExchangeApi = new StockExchangeApi();

    String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseStockExchangeSecurities result = stockExchangeApi.getStockExchangeSecurities(identifier, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling StockExchangeApi#getStockExchangeSecurities");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockExchangeSecurities**](ApiResponseStockExchangeSecurities.md)

[//]: # (END_OPERATION)

