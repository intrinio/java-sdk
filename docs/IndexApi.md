# IndexApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllEconomicIndices**](IndexApi.md#getAllEconomicIndices) | **GET** /indices/economic | All Economic Indices
[**getAllSicIndices**](IndexApi.md#getAllSicIndices) | **GET** /indices/sic | All SIC Indices
[**getAllStockMarketIndices**](IndexApi.md#getAllStockMarketIndices) | **GET** /indices/stock_market | All Stock Market Indices
[**getEconomicIndexById**](IndexApi.md#getEconomicIndexById) | **GET** /indices/economic/{identifier} | Lookup Economic Index
[**getEconomicIndexDataPointNumber**](IndexApi.md#getEconomicIndexDataPointNumber) | **GET** /indices/economic/{identifier}/data_point/{tag}/number | Data Point (Number) for an Economic Index
[**getEconomicIndexDataPointText**](IndexApi.md#getEconomicIndexDataPointText) | **GET** /indices/economic/{identifier}/data_point/{tag}/text | Data Point (Text) for an Economic Index
[**getEconomicIndexHistoricalData**](IndexApi.md#getEconomicIndexHistoricalData) | **GET** /indices/economic/{identifier}/historical_data/{tag} | Historical Data for an Economic Index
[**getSicIndexById**](IndexApi.md#getSicIndexById) | **GET** /indices/sic/{identifier} | Lookup SIC Index
[**getSicIndexDataPointNumber**](IndexApi.md#getSicIndexDataPointNumber) | **GET** /indices/sic/{identifier}/data_point/{tag}/number | Data Point (Number) for an SIC Index
[**getSicIndexDataPointText**](IndexApi.md#getSicIndexDataPointText) | **GET** /indices/sic/{identifier}/data_point/{tag}/text | Data Point (Text) for an SIC Index
[**getSicIndexHistoricalData**](IndexApi.md#getSicIndexHistoricalData) | **GET** /indices/sic/{identifier}/historical_data/{tag} | Historical Data for an SIC Index
[**getStockMarketIndexById**](IndexApi.md#getStockMarketIndexById) | **GET** /indices/stock_market/{identifier} | Lookup Stock Market Index
[**getStockMarketIndexDataPointNumber**](IndexApi.md#getStockMarketIndexDataPointNumber) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/number | Data Point (Number) for Stock Market Index
[**getStockMarketIndexDataPointText**](IndexApi.md#getStockMarketIndexDataPointText) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/text | Data Point (Text) for Stock Market Index
[**getStockMarketIndexHistoricalData**](IndexApi.md#getStockMarketIndexHistoricalData) | **GET** /indices/stock_market/{identifier}/historical_data/{tag} | Historical Data for Stock Market Index
[**searchEconomicIndices**](IndexApi.md#searchEconomicIndices) | **GET** /indices/economic/search | Search Economic Indices
[**searchSicIndices**](IndexApi.md#searchSicIndices) | **GET** /indices/sic/search | Search SIC Indices
[**searchStockMarketsIndices**](IndexApi.md#searchStockMarketsIndices) | **GET** /indices/stock_market/search | Search Stock Market Indices


<a name="getAllEconomicIndices"></a>
# **getAllEconomicIndices**
> ApiResponseEconomicIndices getAllEconomicIndices(nextPage)

All Economic Indices

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseEconomicIndices result = indexApi.getAllEconomicIndices(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getAllEconomicIndices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseEconomicIndices**](ApiResponseEconomicIndices.md)

<a name="getAllSicIndices"></a>
# **getAllSicIndices**
> ApiResponseSICIndices getAllSicIndices(nextPage)

All SIC Indices

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSICIndices result = indexApi.getAllSicIndices(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getAllSicIndices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSICIndices**](ApiResponseSICIndices.md)

<a name="getAllStockMarketIndices"></a>
# **getAllStockMarketIndices**
> ApiResponseStockMarketIndices getAllStockMarketIndices(nextPage)

All Stock Market Indices

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseStockMarketIndices result = indexApi.getAllStockMarketIndices(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getAllStockMarketIndices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockMarketIndices**](ApiResponseStockMarketIndices.md)

<a name="getEconomicIndexById"></a>
# **getEconomicIndexById**
> EconomicIndex getEconomicIndexById(identifier)

Lookup Economic Index

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)

try {
    EconomicIndex result = indexApi.getEconomicIndexById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getEconomicIndexById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |

### Return type

[**EconomicIndex**](EconomicIndex.md)

<a name="getEconomicIndexDataPointNumber"></a>
# **getEconomicIndexDataPointNumber**
> BigDecimal getEconomicIndexDataPointNumber(identifier, tag)

Data Point (Number) for an Economic Index

Returns a numeric value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name

try {
    BigDecimal result = indexApi.getEconomicIndexDataPointNumber(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getEconomicIndexDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getEconomicIndexDataPointText"></a>
# **getEconomicIndexDataPointText**
> String getEconomicIndexDataPointText(identifier, tag)

Data Point (Text) for an Economic Index

Returns a text value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name

try {
    String result = indexApi.getEconomicIndexDataPointText(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getEconomicIndexDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

<a name="getEconomicIndexHistoricalData"></a>
# **getEconomicIndexHistoricalData**
> ApiResponseEconomicIndexHistoricalData getEconomicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage)

Historical Data for an Economic Index

Returns historical values for the given &#x60;tag&#x60; and the Economic Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name
String type = null; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseEconomicIndexHistoricalData result = indexApi.getEconomicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getEconomicIndexHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseEconomicIndexHistoricalData**](ApiResponseEconomicIndexHistoricalData.md)

<a name="getSicIndexById"></a>
# **getSicIndexById**
> SICIndex getSicIndexById(identifier)

Lookup SIC Index

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)

try {
    SICIndex result = indexApi.getSicIndexById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getSicIndexById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |

### Return type

[**SICIndex**](SICIndex.md)

<a name="getSicIndexDataPointNumber"></a>
# **getSicIndexDataPointNumber**
> BigDecimal getSicIndexDataPointNumber(identifier, tag)

Data Point (Number) for an SIC Index

Returns a numeric value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name

try {
    BigDecimal result = indexApi.getSicIndexDataPointNumber(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getSicIndexDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getSicIndexDataPointText"></a>
# **getSicIndexDataPointText**
> String getSicIndexDataPointText(identifier, tag)

Data Point (Text) for an SIC Index

Returns a text value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name

try {
    String result = indexApi.getSicIndexDataPointText(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getSicIndexDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

<a name="getSicIndexHistoricalData"></a>
# **getSicIndexHistoricalData**
> ApiResponseSICIndexHistoricalData getSicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage)

Historical Data for an SIC Index

Returns historical values for the given &#x60;tag&#x60; and the SIC Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "marketcap"; // String | An Intrinio data tag ID or code-name
String type = null; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSICIndexHistoricalData result = indexApi.getSicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getSicIndexHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSICIndexHistoricalData**](ApiResponseSICIndexHistoricalData.md)

<a name="getStockMarketIndexById"></a>
# **getStockMarketIndexById**
> StockMarketIndex getStockMarketIndexById(identifier)

Lookup Stock Market Index

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)

try {
    StockMarketIndex result = indexApi.getStockMarketIndexById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getStockMarketIndexById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |

### Return type

[**StockMarketIndex**](StockMarketIndex.md)

<a name="getStockMarketIndexDataPointNumber"></a>
# **getStockMarketIndexDataPointNumber**
> BigDecimal getStockMarketIndexDataPointNumber(identifier, tag)

Data Point (Number) for Stock Market Index

Returns a numeric value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name

try {
    BigDecimal result = indexApi.getStockMarketIndexDataPointNumber(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getStockMarketIndexDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getStockMarketIndexDataPointText"></a>
# **getStockMarketIndexDataPointText**
> String getStockMarketIndexDataPointText(identifier, tag)

Data Point (Text) for Stock Market Index

Returns a text value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name

try {
    String result = indexApi.getStockMarketIndexDataPointText(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getStockMarketIndexDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

<a name="getStockMarketIndexHistoricalData"></a>
# **getStockMarketIndexHistoricalData**
> ApiResponseStockMarketIndexHistoricalData getStockMarketIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage)

Historical Data for Stock Market Index

Returns historical values for the given &#x60;tag&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)
String tag = "level"; // String | An Intrinio data tag ID or code-name
String type = null; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseStockMarketIndexHistoricalData result = indexApi.getStockMarketIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#getStockMarketIndexHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockMarketIndexHistoricalData**](ApiResponseStockMarketIndexHistoricalData.md)

<a name="searchEconomicIndices"></a>
# **searchEconomicIndices**
> ApiResponseEconomicIndices searchEconomicIndices(query)

Search Economic Indices

Searches for indices using the text in &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String query = "GDP"; // String | Search query

try {
    ApiResponseEconomicIndices result = indexApi.searchEconomicIndices(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#searchEconomicIndices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query |

### Return type

[**ApiResponseEconomicIndices**](ApiResponseEconomicIndices.md)

<a name="searchSicIndices"></a>
# **searchSicIndices**
> ApiResponseSICIndices searchSicIndices(query)

Search SIC Indices

Searches for indices using the text in &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String query = "agriculture"; // String | Search query

try {
    ApiResponseSICIndices result = indexApi.searchSicIndices(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#searchSicIndices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query |

### Return type

[**ApiResponseSICIndices**](ApiResponseSICIndices.md)

<a name="searchStockMarketsIndices"></a>
# **searchStockMarketsIndices**
> ApiResponseStockMarketIndices searchStockMarketsIndices(query)

Search Stock Market Indices

Searches for indices using the text in &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String query = "dow"; // String | Search query

try {
    ApiResponseStockMarketIndices result = indexApi.searchStockMarketsIndices(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexApi#searchStockMarketsIndices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query |

### Return type

[**ApiResponseStockMarketIndices**](ApiResponseStockMarketIndices.md)

