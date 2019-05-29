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



[//]: # (START_OPERATION)

[//]: # (CLASS:StockExchangeApi)

[//]: # (METHOD:getAllStockExchanges)

[//]: # (RETURN_TYPE:ApiResponseStockExchanges)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockExchanges.md)

[//]: # (OPERATION:getAllStockExchanges_v2)

[//]: # (ENDPOINT:/stock_exchanges)

[//]: # (DOCUMENT_LINK:StockExchangeApi.md#getAllStockExchanges)

<a name="getAllStockExchanges"></a>
## **getAllStockExchanges**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getAllStockExchanges_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockExchanges getAllStockExchanges(city, country, countryCode, pageSize)

#### All Stock Exchanges


Returns all Stock Exchanges matching the specified parameters

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | String| Filter by city | [optional] &nbsp;
 **country** | String| Filter by country | [optional] &nbsp;
 **countryCode** | String| Filter by ISO country code | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockExchanges**](ApiResponseStockExchanges.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:StockExchangeApi)

[//]: # (METHOD:getStockExchangeById)

[//]: # (RETURN_TYPE:StockExchange)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:StockExchange.md)

[//]: # (OPERATION:getStockExchangeById_v2)

[//]: # (ENDPOINT:/stock_exchanges/{identifier})

[//]: # (DOCUMENT_LINK:StockExchangeApi.md#getStockExchangeById)

<a name="getStockExchangeById"></a>
## **getStockExchangeById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangeById_v2)

[//]: # (START_OVERVIEW)

> StockExchange getStockExchangeById(identifier)

#### Lookup Stock Exchange


Returns the Stock Exchange with the given &#x60;identifier&#x60;

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Stock Exchange identifier (MIC or Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**StockExchange**](StockExchange.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:StockExchangeApi)

[//]: # (METHOD:getStockExchangePriceAdjustments)

[//]: # (RETURN_TYPE:ApiResponseStockExchangeStockPriceAdjustments)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockExchangeStockPriceAdjustments.md)

[//]: # (OPERATION:getStockExchangePriceAdjustments_v2)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/prices/adjustments)

[//]: # (DOCUMENT_LINK:StockExchangeApi.md#getStockExchangePriceAdjustments)

<a name="getStockExchangePriceAdjustments"></a>
## **getStockExchangePriceAdjustments**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangePriceAdjustments_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockExchangeStockPriceAdjustments getStockExchangePriceAdjustments(identifier, date, pageSize, nextPage)

#### Stock Price Adjustments by Exchange


Returns stock price adjustments for the Stock Exchange with the given &#x60;identifier&#x60;

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Stock Exchange identifier (MIC or Intrinio ID) | &nbsp;
 **date** | LocalDate| The date for which to return price adjustments | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockExchangeStockPriceAdjustments**](ApiResponseStockExchangeStockPriceAdjustments.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:StockExchangeApi)

[//]: # (METHOD:getStockExchangePrices)

[//]: # (RETURN_TYPE:ApiResponseStockExchangeStockPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockExchangeStockPrices.md)

[//]: # (OPERATION:getStockExchangePrices_v2)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/prices)

[//]: # (DOCUMENT_LINK:StockExchangeApi.md#getStockExchangePrices)

<a name="getStockExchangePrices"></a>
## **getStockExchangePrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangePrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockExchangeStockPrices getStockExchangePrices(identifier, date, pageSize, nextPage)

#### Stock Prices by Exchange


Returns end-of-day stock prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Stock Exchange identifier (MIC or Intrinio ID) | &nbsp;
 **date** | LocalDate| The date for which to return prices | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockExchangeStockPrices**](ApiResponseStockExchangeStockPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:StockExchangeApi)

[//]: # (METHOD:getStockExchangeRealtimePrices)

[//]: # (RETURN_TYPE:ApiResponseStockExchangeRealtimeStockPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockExchangeRealtimeStockPrices.md)

[//]: # (OPERATION:getStockExchangeRealtimePrices_v2)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/prices/realtime)

[//]: # (DOCUMENT_LINK:StockExchangeApi.md#getStockExchangeRealtimePrices)

<a name="getStockExchangeRealtimePrices"></a>
## **getStockExchangeRealtimePrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangeRealtimePrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockExchangeRealtimeStockPrices getStockExchangeRealtimePrices(identifier, source, pageSize, nextPage)

#### Realtime Stock Prices by Exchange


Returns realtime stock prices for the Stock Exchange with the given &#x60;identifier&#x60;

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Stock Exchange identifier (MIC or Intrinio ID) | &nbsp;
 **source** | String| Return realtime prices from the specified data source | [optional] [enum: iex, bats, bats_delayed] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockExchangeRealtimeStockPrices**](ApiResponseStockExchangeRealtimeStockPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:StockExchangeApi)

[//]: # (METHOD:getStockExchangeSecurities)

[//]: # (RETURN_TYPE:ApiResponseStockExchangeSecurities)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockExchangeSecurities.md)

[//]: # (OPERATION:getStockExchangeSecurities_v2)

[//]: # (ENDPOINT:/stock_exchanges/{identifier}/securities)

[//]: # (DOCUMENT_LINK:StockExchangeApi.md#getStockExchangeSecurities)

<a name="getStockExchangeSecurities"></a>
## **getStockExchangeSecurities**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockExchangeSecurities_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockExchangeSecurities getStockExchangeSecurities(identifier, pageSize, nextPage)

#### Securities by Exchange


Returns Securities traded on the Stock Exchange with &#x60;identifier&#x60;

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Stock Exchange identifier (MIC or Intrinio ID) | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockExchangeSecurities**](ApiResponseStockExchangeSecurities.md)

[//]: # (END_OPERATION)

