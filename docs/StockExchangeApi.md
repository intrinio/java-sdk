# StockExchangeApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterStockExchanges**](StockExchangeApi.md#filterStockExchanges) | **GET** /stock_exchanges/filter | Filter Stock Exchanges
[**getAllStockExchanges**](StockExchangeApi.md#getAllStockExchanges) | **GET** /stock_exchanges | Get All Stock Exchanges
[**getStockExchangeById**](StockExchangeApi.md#getStockExchangeById) | **GET** /stock_exchanges/{identifier} | Get Stock Exchange by ID
[**getStockExchangePriceAdjustments**](StockExchangeApi.md#getStockExchangePriceAdjustments) | **GET** /stock_exchanges/{identifier}/prices/adjustments | Get Stock Price Adjustments by Exchange
[**getStockExchangePrices**](StockExchangeApi.md#getStockExchangePrices) | **GET** /stock_exchanges/{identifier}/prices | Get Stock Prices by Exchange
[**getStockExchangeSecurities**](StockExchangeApi.md#getStockExchangeSecurities) | **GET** /stock_exchanges/{identifier}/securities | Get Securities by Exchange


<a name="filterStockExchanges"></a>
# **filterStockExchanges**
> ApiResponseStockExchanges filterStockExchanges(city, country, countryCode)

Filter Stock Exchanges

Return Stock Exchanges matching the given filters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String city = "city_example"; // String | Filter by city
String country = "CHINA"; // String | Filter by country
String countryCode = "countryCode_example"; // String | Filter by ISO country code

try {
    ApiResponseStockExchanges result = stockExchangeApi.filterStockExchanges(city, country, countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockExchangeApi#filterStockExchanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **city** | **String**| Filter by city | [optional]
 **country** | **String**| Filter by country | [optional]
 **countryCode** | **String**| Filter by ISO country code | [optional]

### Return type

[**ApiResponseStockExchanges**](ApiResponseStockExchanges.md)

<a name="getAllStockExchanges"></a>
# **getAllStockExchanges**
> ApiResponseStockExchanges getAllStockExchanges()

Get All Stock Exchanges

Return All Stock Exchanges

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();


try {
    ApiResponseStockExchanges result = stockExchangeApi.getAllStockExchanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockExchangeApi#getAllStockExchanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseStockExchanges**](ApiResponseStockExchanges.md)

<a name="getStockExchangeById"></a>
# **getStockExchangeById**
> StockExchange getStockExchangeById(identifier)

Get Stock Exchange by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String identifier = "XSHG"; // String | A Stock Exchange identifier (MIC or Intrinio ID)

try {
    StockExchange result = stockExchangeApi.getStockExchangeById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockExchangeApi#getStockExchangeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |

### Return type

[**StockExchange**](StockExchange.md)

<a name="getStockExchangePriceAdjustments"></a>
# **getStockExchangePriceAdjustments**
> ApiResponseStockExchangeStockPriceAdjustments getStockExchangePriceAdjustments(identifier, date, nextPage)

Get Stock Price Adjustments by Exchange

Return stock price adjustments for the Stock Exchange with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
LocalDate date = new LocalDate(); // LocalDate | The date for which to return price adjustments
String nextPage = ""; // String | Gets the next page of data from a previous API call

try {
    ApiResponseStockExchangeStockPriceAdjustments result = stockExchangeApi.getStockExchangePriceAdjustments(identifier, date, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockExchangeApi#getStockExchangePriceAdjustments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |
 **date** | **LocalDate**| The date for which to return price adjustments | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockExchangeStockPriceAdjustments**](ApiResponseStockExchangeStockPriceAdjustments.md)

<a name="getStockExchangePrices"></a>
# **getStockExchangePrices**
> ApiResponseStockExchangeStockPrices getStockExchangePrices(identifier, date, nextPage)

Get Stock Prices by Exchange

Return daily Stock Prices for Securities on the Stock Exchange with &#x60;identifier&#x60; and on the &#x60;price_date&#x60; (or the latest date that prices are available)

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
LocalDate date = new LocalDate(); // LocalDate | The date for which to return prices
String nextPage = ""; // String | Gets the next page of data from a previous API call

try {
    ApiResponseStockExchangeStockPrices result = stockExchangeApi.getStockExchangePrices(identifier, date, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockExchangeApi#getStockExchangePrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |
 **date** | **LocalDate**| The date for which to return prices | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockExchangeStockPrices**](ApiResponseStockExchangeStockPrices.md)

<a name="getStockExchangeSecurities"></a>
# **getStockExchangeSecurities**
> ApiResponseStockExchangeSecurities getStockExchangeSecurities(identifier, nextPage)

Get Securities by Exchange

Return Securities traded on the Stock Exchange with &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String identifier = "USCOMP"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
String nextPage = ""; // String | Gets the next page of data from a previous API call

try {
    ApiResponseStockExchangeSecurities result = stockExchangeApi.getStockExchangeSecurities(identifier, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockExchangeApi#getStockExchangeSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Stock Exchange identifier (MIC or Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockExchangeSecurities**](ApiResponseStockExchangeSecurities.md)

