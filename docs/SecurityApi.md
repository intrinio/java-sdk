# SecurityApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSecurities**](SecurityApi.md#getAllSecurities) | **GET** /securities | Get All Securiites
[**getSecurityById**](SecurityApi.md#getSecurityById) | **GET** /securities/{identifier} | Get a Security by ID
[**getSecurityDataPointNumber**](SecurityApi.md#getSecurityDataPointNumber) | **GET** /securities/{identifier}/data_point/{tag}/number | Get Security Data Point (Number)
[**getSecurityDataPointText**](SecurityApi.md#getSecurityDataPointText) | **GET** /securities/{identifier}/data_point/{tag}/text | Get Security Data Point (Text)
[**getSecurityHistoricalData**](SecurityApi.md#getSecurityHistoricalData) | **GET** /securities/{identifier}/historical_data/{tag} | Get Security Historical Data
[**getSecurityStockPriceAdjustments**](SecurityApi.md#getSecurityStockPriceAdjustments) | **GET** /securities/{identifier}/prices/adjustments | Get Stock Price Adjustments for Security
[**getSecurityStockPrices**](SecurityApi.md#getSecurityStockPrices) | **GET** /securities/{identifier}/prices | Get Stock Prices for Security
[**screenSecurities**](SecurityApi.md#screenSecurities) | **POST** /securities/screen | Screen Securities
[**searchSecurities**](SecurityApi.md#searchSecurities) | **GET** /securities/search | Search Securities


<a name="getAllSecurities"></a>
# **getAllSecurities**
> ApiResponseSecurities getAllSecurities(nextPage)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurities result = securityApi.getAllSecurities(nextPage);
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

[**ApiResponseSecurities**](ApiResponseSecurities.md)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

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
> BigDecimal getSecurityDataPointNumber(identifier, tag)

Get Security Data Point (Number)

Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String tag = "52_week_high"; // String | An Intrinio data tag ID or code-name

try {
    BigDecimal result = securityApi.getSecurityDataPointNumber(identifier, tag);
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
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getSecurityDataPointText"></a>
# **getSecurityDataPointText**
> String getSecurityDataPointText(identifier, tag)

Get Security Data Point (Text)

Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String tag = "figi"; // String | An Intrinio data tag ID or code-name

try {
    String result = securityApi.getSecurityDataPointText(identifier, tag);
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
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

<a name="getSecurityHistoricalData"></a>
# **getSecurityHistoricalData**
> ApiResponseSecurityHistoricalData getSecurityHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage)

Get Security Historical Data

Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String tag = "volume"; // String | An Intrinio data tag ID or code-name
String type = null; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical date on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityHistoricalData result = securityApi.getSecurityHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
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
 **tag** | **String**| An Intrinio data tag ID or code-name |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical date on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityHistoricalData**](ApiResponseSecurityHistoricalData.md)

<a name="getSecurityStockPriceAdjustments"></a>
# **getSecurityStockPriceAdjustments**
> ApiResponseSecurityStockPriceAdjustments getSecurityStockPriceAdjustments(identifier, startDate, endDate, nextPage)

Get Stock Price Adjustments for Security

Return stock price adjustments for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
LocalDate startDate = null; // LocalDate | Return price adjustments on or after the date
LocalDate endDate = null; // LocalDate | Return price adjustments on or before the date
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityStockPriceAdjustments result = securityApi.getSecurityStockPriceAdjustments(identifier, startDate, endDate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityStockPriceAdjustments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **LocalDate**| Return price adjustments on or after the date | [optional]
 **endDate** | **LocalDate**| Return price adjustments on or before the date | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityStockPriceAdjustments**](ApiResponseSecurityStockPriceAdjustments.md)

<a name="getSecurityStockPrices"></a>
# **getSecurityStockPrices**
> ApiResponseSecurityStockPrices getSecurityStockPrices(identifier, startDate, endDate, frequency, nextPage)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
LocalDate startDate = null; // LocalDate | Return prices on or after the date
LocalDate endDate = null; // LocalDate | Return prices on or before the date
String frequency = "daily"; // String | Return stock prices in the given frequency
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityStockPrices result = securityApi.getSecurityStockPrices(identifier, startDate, endDate, frequency, nextPage);
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

[**ApiResponseSecurityStockPrices**](ApiResponseSecurityStockPrices.md)

<a name="screenSecurities"></a>
# **screenSecurities**
> List&lt;SecurityScreenResult&gt; screenSecurities(logic, orderColumn, orderDirection, primaryOnly)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

SecurityScreenGroup logic = new SecurityScreenGroup(); // SecurityScreenGroup | The logic to screen with, consisting of operators, clauses, and nested groups.<br/> See <a href=\"/documentation/screener_v2\" target=\"_blank\">screener documentation</a> for details on how to construct conditions.
String orderColumn = "orderColumn_example"; // String | Results returned sorted by this column
String orderDirection = "asc"; // String | Sort order to use with the order_column
Boolean primaryOnly = false; // Boolean | Return only primary securities

try {
    List<SecurityScreenResult> result = securityApi.screenSecurities(logic, orderColumn, orderDirection, primaryOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#screenSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logic** | [**SecurityScreenGroup**](SecurityScreenGroup.md)| The logic to screen with, consisting of operators, clauses, and nested groups.&lt;br/&gt; See &lt;a href&#x3D;\&quot;/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. | [optional]
 **orderColumn** | **String**| Results returned sorted by this column | [optional]
 **orderDirection** | **String**| Sort order to use with the order_column | [optional] [default to asc] [enum: asc, desc]
 **primaryOnly** | **Boolean**| Return only primary securities | [optional] [default to false]

### Return type

[**List&lt;SecurityScreenResult&gt;**](SecurityScreenResult.md)

<a name="searchSecurities"></a>
# **searchSecurities**
> ApiResponseSecurities searchSecurities(query)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String query = "Apple"; // String | 

try {
    ApiResponseSecurities result = securityApi.searchSecurities(query);
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

### Return type

[**ApiResponseSecurities**](ApiResponseSecurities.md)

