# SecurityApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSecurities**](SecurityApi.md#getAllSecurities) | **GET** /securities | Get All Securiites
[**getSecurityById**](SecurityApi.md#getSecurityById) | **GET** /securities/{identifier} | Get a Security by ID
[**getSecurityDataPointNumber**](SecurityApi.md#getSecurityDataPointNumber) | **GET** /securities/{identifier}/data_point/{item}/number | Get Security Data Point (Number)
[**getSecurityDataPointText**](SecurityApi.md#getSecurityDataPointText) | **GET** /securities/{identifier}/data_point/{item}/text | Get Security Data Point (Text)
[**getSecurityHistoricalData**](SecurityApi.md#getSecurityHistoricalData) | **GET** /securities/{identifier}/historical_data/{item} | Get Security Historical Data
[**getSecurityStockPrices**](SecurityApi.md#getSecurityStockPrices) | **GET** /securities/{identifier}/prices | Get Stock Prices for Security
[**screenSecurities**](SecurityApi.md#screenSecurities) | **POST** /securities/screen | Screen Securities
[**searchSecurities**](SecurityApi.md#searchSecurities) | **GET** /securities/search | Search Securities


<a name="getAllSecurities"></a>
# **getAllSecurities**
> List&lt;SecuritySummary&gt; getAllSecurities(nextPage)

Get All Securiites

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<SecuritySummary> result = securityApi.getAllSecurities(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getAllSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;SecuritySummary&gt;**](SecuritySummary.md)

<a name="getSecurityById"></a>
# **getSecurityById**
> Security getSecurityById(identifier)

Get a Security by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "identifier_example"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

try {
    Security result = securityApi.getSecurityById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |

### Return type

[**Security**](Security.md)

<a name="getSecurityDataPointNumber"></a>
# **getSecurityDataPointNumber**
> BigDecimal getSecurityDataPointNumber(identifier, item)

Get Security Data Point (Number)

Returns a numeric value for the given &#x60;item&#x60; for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "identifier_example"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    BigDecimal result = securityApi.getSecurityDataPointNumber(identifier, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **item** | **String**| An Intrinio data tag or other item |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getSecurityDataPointText"></a>
# **getSecurityDataPointText**
> String getSecurityDataPointText(identifier, item)

Get Security Data Point (Text)

Returns a text value for the given &#x60;item&#x60; for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "identifier_example"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    String result = securityApi.getSecurityDataPointText(identifier, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **item** | **String**| An Intrinio data tag or other item |

### Return type

**String**

<a name="getSecurityHistoricalData"></a>
# **getSecurityHistoricalData**
> List&lt;HistoricalData&gt; getSecurityHistoricalData(identifier, item, type, startDate, endDate, sortOrder, nextPage)

Get Security Historical Data

Returns historical values for the given &#x60;item&#x60; and the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "identifier_example"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item
String type = "type_example"; // String | Filter by type, when applicable
LocalDate startDate = new LocalDate(); // LocalDate | Get historical data on or after this date
LocalDate endDate = new LocalDate(); // LocalDate | Get historical date on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<HistoricalData> result = securityApi.getSecurityHistoricalData(identifier, item, type, startDate, endDate, sortOrder, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **item** | **String**| An Intrinio data tag or other item |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical date on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;HistoricalData&gt;**](HistoricalData.md)

<a name="getSecurityStockPrices"></a>
# **getSecurityStockPrices**
> List&lt;StockPriceSummary&gt; getSecurityStockPrices(identifier, startDate, endDate, frequency, nextPage)

Get Stock Prices for Security

Return stock prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "identifier_example"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
LocalDate startDate = new LocalDate(); // LocalDate | Return prices on or after the date
LocalDate endDate = new LocalDate(); // LocalDate | Return prices on or before the date
String frequency = "daily"; // String | Return stock prices in the given frequency
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StockPriceSummary> result = securityApi.getSecurityStockPrices(identifier, startDate, endDate, frequency, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityStockPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **LocalDate**| Return prices on or after the date | [optional]
 **endDate** | **LocalDate**| Return prices on or before the date | [optional]
 **frequency** | **String**| Return stock prices in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;StockPriceSummary&gt;**](StockPriceSummary.md)

<a name="screenSecurities"></a>
# **screenSecurities**
> List&lt;SecurityScreenResult&gt; screenSecurities(logic, orderColumn, orderDirection, primaryOnly, nextPage)

Screen Securities

Screen securities using complex logic

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

SecurityScreenGroup logic = new SecurityScreenGroup(); // SecurityScreenGroup | The logic to screen with, consisting of operators, clauses, and nested groups
String orderColumn = "orderColumn_example"; // String | Results returned sorted by this column
String orderDirection = "asc"; // String | Sort order to use with the order_column
Boolean primaryOnly = false; // Boolean | Return only primary securities
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<SecurityScreenResult> result = securityApi.screenSecurities(logic, orderColumn, orderDirection, primaryOnly, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#screenSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logic** | [**SecurityScreenGroup**](SecurityScreenGroup.md)| The logic to screen with, consisting of operators, clauses, and nested groups | [optional]
 **orderColumn** | **String**| Results returned sorted by this column | [optional]
 **orderDirection** | **String**| Sort order to use with the order_column | [optional] [default to asc] [enum: asc, desc]
 **primaryOnly** | **Boolean**| Return only primary securities | [optional] [default to false]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;SecurityScreenResult&gt;**](SecurityScreenResult.md)

<a name="searchSecurities"></a>
# **searchSecurities**
> List&lt;SecuritySummary&gt; searchSecurities(query, nextPage)

Search Securities

Searches for Securities matching the text &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String query = "query_example"; // String | 
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<SecuritySummary> result = securityApi.searchSecurities(query, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#searchSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;SecuritySummary&gt;**](SecuritySummary.md)

