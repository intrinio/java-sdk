# StockExchangeApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterStockExchanges**](StockExchangeApi.md#filterStockExchanges) | **GET** /stock_exchanges/filter | Filter Stock Exchanges
[**getAllStockExchanges**](StockExchangeApi.md#getAllStockExchanges) | **GET** /stock_exchanges | Get All Stock Exchanges
[**getStockExchangeById**](StockExchangeApi.md#getStockExchangeById) | **GET** /stock_exchanges/{identifier} | Get Stock Exchange by ID
[**getStockExchangePrices**](StockExchangeApi.md#getStockExchangePrices) | **GET** /stock_exchanges/{identifier}/prices | Get Stock Prices by Exchange
[**getStockExchangeSecurities**](StockExchangeApi.md#getStockExchangeSecurities) | **GET** /stock_exchanges/{identifier}/securities | Get Securities by Exchange


<a name="filterStockExchanges"></a>
# **filterStockExchanges**
> List&lt;StockExchange&gt; filterStockExchanges(city, country, countryCode, nextPage)

Filter Stock Exchanges

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String city = "city_example"; // String | Filter by city
String country = "country_example"; // String | Filter by country
String countryCode = "countryCode_example"; // String | Filter by ISO country code
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StockExchange> result = stockExchangeApi.filterStockExchanges(city, country, countryCode, nextPage);
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
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;StockExchange&gt;**](StockExchange.md)

<a name="getAllStockExchanges"></a>
# **getAllStockExchanges**
> List&lt;StockExchange&gt; getAllStockExchanges(nextPage)

Get All Stock Exchanges

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StockExchange> result = stockExchangeApi.getAllStockExchanges(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StockExchangeApi#getAllStockExchanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;StockExchange&gt;**](StockExchange.md)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String identifier = "identifier_example"; // String | A Stock Exchange identifier (MIC or Intrinio ID)

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

<a name="getStockExchangePrices"></a>
# **getStockExchangePrices**
> List&lt;StockPrice&gt; getStockExchangePrices(identifier, date, nextPage)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String identifier = "identifier_example"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
LocalDate date = new LocalDate(); // LocalDate | The date for which to return prices
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StockPrice> result = stockExchangeApi.getStockExchangePrices(identifier, date, nextPage);
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

[**List&lt;StockPrice&gt;**](StockPrice.md)

<a name="getStockExchangeSecurities"></a>
# **getStockExchangeSecurities**
> List&lt;Security&gt; getStockExchangeSecurities(identifier, nextPage)

Get Securities by Exchange

Return Securities on the Stock Exchange with &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StockExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StockExchangeApi stockExchangeApi = new StockExchangeApi();

String identifier = "identifier_example"; // String | A Stock Exchange identifier (MIC or Intrinio ID)
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<Security> result = stockExchangeApi.getStockExchangeSecurities(identifier, nextPage);
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

[**List&lt;Security&gt;**](Security.md)

