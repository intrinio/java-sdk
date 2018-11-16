# IndexApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllEconomicIndices**](IndexApi.md#getAllEconomicIndices) | **GET** /indices/economic | Get ALl Economic Indices
[**getAllSicIndices**](IndexApi.md#getAllSicIndices) | **GET** /indices/sic | Get All SIC Indices
[**getAllStockMarketIndices**](IndexApi.md#getAllStockMarketIndices) | **GET** /indices/stock_market | Get All Stock Market Indices
[**getEconomicIndexById**](IndexApi.md#getEconomicIndexById) | **GET** /indices/economic/{identifier} | Get an Economic Index by ID
[**getEconomicIndexDataPointNumber**](IndexApi.md#getEconomicIndexDataPointNumber) | **GET** /indices/economic/{identifier}/data_point/{item}/number | Get Economic Index Data Point (Number)
[**getEconomicIndexDataPointText**](IndexApi.md#getEconomicIndexDataPointText) | **GET** /indices/economic/{identifier}/data_point/{item}/text | Get Economic Index Data Point (Text)
[**getEconomicIndexHistoricalData**](IndexApi.md#getEconomicIndexHistoricalData) | **GET** /indices/economic/{identifier}/historical_data/{item} | Get Economic Index Historical Data
[**getSicIndexById**](IndexApi.md#getSicIndexById) | **GET** /indices/sic/{identifier} | Get an SIC Index by ID
[**getSicIndexDataPointNumber**](IndexApi.md#getSicIndexDataPointNumber) | **GET** /indices/sic/{identifier}/data_point/{item}/number | Get SIC Index Data Point (Number)
[**getSicIndexDataPointText**](IndexApi.md#getSicIndexDataPointText) | **GET** /indices/sic/{identifier}/data_point/{item}/text | Get SIC Index Data Point (Text)
[**getSicIndexHistoricalData**](IndexApi.md#getSicIndexHistoricalData) | **GET** /indices/sic/{identifier}/historical_data/{item} | Get SIC Index Historical Data
[**getStockMarketIndexById**](IndexApi.md#getStockMarketIndexById) | **GET** /indices/stock_market/{identifier} | Get a Stock Market Index by ID
[**getStockMarketIndexDataPointNumber**](IndexApi.md#getStockMarketIndexDataPointNumber) | **GET** /indices/stock_market/{identifier}/data_point/{item}/number | Get Stock Market Index Data Point (Number)
[**getStockMarketIndexDataPointText**](IndexApi.md#getStockMarketIndexDataPointText) | **GET** /indices/stock_market/{identifier}/data_point/{item}/text | Get Stock Market Index Data Point (Text)
[**getStockMarketIndexHistoricalData**](IndexApi.md#getStockMarketIndexHistoricalData) | **GET** /indices/stock_market/{identifier}/historical_data/{item} | Get Stock Market Index Historical Data
[**searchEconomicIndices**](IndexApi.md#searchEconomicIndices) | **GET** /indices/economic/search | Search Economic Indices
[**searchSicIndices**](IndexApi.md#searchSicIndices) | **GET** /indices/sic/search | Search SIC Indices
[**searchStockMarketsIndices**](IndexApi.md#searchStockMarketsIndices) | **GET** /indices/stock_market/search | Search Stock Market Indices


<a name="getAllEconomicIndices"></a>
# **getAllEconomicIndices**
> List&lt;EconomicIndexSummary&gt; getAllEconomicIndices(nextPage)

Get ALl Economic Indices

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<EconomicIndexSummary> result = indexApi.getAllEconomicIndices(nextPage);
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

[**List&lt;EconomicIndexSummary&gt;**](EconomicIndexSummary.md)

<a name="getAllSicIndices"></a>
# **getAllSicIndices**
> List&lt;SICIndex&gt; getAllSicIndices(nextPage)

Get All SIC Indices

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<SICIndex> result = indexApi.getAllSicIndices(nextPage);
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

[**List&lt;SICIndex&gt;**](SICIndex.md)

<a name="getAllStockMarketIndices"></a>
# **getAllStockMarketIndices**
> List&lt;StockMarketIndexSummary&gt; getAllStockMarketIndices(nextPage)

Get All Stock Market Indices

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StockMarketIndexSummary> result = indexApi.getAllStockMarketIndices(nextPage);
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

[**List&lt;StockMarketIndexSummary&gt;**](StockMarketIndexSummary.md)

<a name="getEconomicIndexById"></a>
# **getEconomicIndexById**
> EconomicIndex getEconomicIndexById(identifier)

Get an Economic Index by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)

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
> BigDecimal getEconomicIndexDataPointNumber(identifier, item)

Get Economic Index Data Point (Number)

Returns a numeric value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    BigDecimal result = indexApi.getEconomicIndexDataPointNumber(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getEconomicIndexDataPointText"></a>
# **getEconomicIndexDataPointText**
> String getEconomicIndexDataPointText(identifier, item)

Get Economic Index Data Point (Text)

Returns a text value for the given &#x60;item&#x60; for the Economic Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    String result = indexApi.getEconomicIndexDataPointText(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

**String**

<a name="getEconomicIndexHistoricalData"></a>
# **getEconomicIndexHistoricalData**
> List&lt;HistoricalData&gt; getEconomicIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize)

Get Economic Index Historical Data

Returns historical values for the given &#x60;item&#x60; and the Economic Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item
String type = "type_example"; // String | Filter by type, when applicable
LocalDate startDate = new LocalDate(); // LocalDate | Get historical data on or after this date
LocalDate endDate = new LocalDate(); // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
BigDecimal pageSize = new BigDecimal(); // BigDecimal | 

try {
    List<HistoricalData> result = indexApi.getEconomicIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize);
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
 **item** | **String**| An Intrinio data tag or other item |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **BigDecimal**|  | [optional] [default to 100]

### Return type

[**List&lt;HistoricalData&gt;**](HistoricalData.md)

<a name="getSicIndexById"></a>
# **getSicIndexById**
> SICIndex getSicIndexById(identifier)

Get an SIC Index by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)

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
> BigDecimal getSicIndexDataPointNumber(identifier, item)

Get SIC Index Data Point (Number)

Returns a numeric value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    BigDecimal result = indexApi.getSicIndexDataPointNumber(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getSicIndexDataPointText"></a>
# **getSicIndexDataPointText**
> String getSicIndexDataPointText(identifier, item)

Get SIC Index Data Point (Text)

Returns a text value for the given &#x60;item&#x60; for the SIC Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    String result = indexApi.getSicIndexDataPointText(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

**String**

<a name="getSicIndexHistoricalData"></a>
# **getSicIndexHistoricalData**
> List&lt;HistoricalData&gt; getSicIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize)

Get SIC Index Historical Data

Returns historical values for the given &#x60;item&#x60; and the SIC Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item
String type = "type_example"; // String | Filter by type, when applicable
LocalDate startDate = new LocalDate(); // LocalDate | Get historical data on or after this date
LocalDate endDate = new LocalDate(); // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
BigDecimal pageSize = new BigDecimal(); // BigDecimal | 

try {
    List<HistoricalData> result = indexApi.getSicIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize);
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
 **item** | **String**| An Intrinio data tag or other item |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **BigDecimal**|  | [optional] [default to 100]

### Return type

[**List&lt;HistoricalData&gt;**](HistoricalData.md)

<a name="getStockMarketIndexById"></a>
# **getStockMarketIndexById**
> StockMarketIndex getStockMarketIndexById(identifier)

Get a Stock Market Index by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)

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
> BigDecimal getStockMarketIndexDataPointNumber(identifier, item)

Get Stock Market Index Data Point (Number)

Returns a numeric value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    BigDecimal result = indexApi.getStockMarketIndexDataPointNumber(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getStockMarketIndexDataPointText"></a>
# **getStockMarketIndexDataPointText**
> String getStockMarketIndexDataPointText(identifier, item)

Get Stock Market Index Data Point (Text)

Returns a text value for the given &#x60;item&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    String result = indexApi.getStockMarketIndexDataPointText(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

**String**

<a name="getStockMarketIndexHistoricalData"></a>
# **getStockMarketIndexHistoricalData**
> List&lt;HistoricalData&gt; getStockMarketIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize)

Get Stock Market Index Historical Data

Returns historical values for the given &#x60;item&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.IndexApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String identifier = "identifier_example"; // String | An Index Identifier (symbol, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item
String type = "type_example"; // String | Filter by type, when applicable
LocalDate startDate = new LocalDate(); // LocalDate | Get historical data on or after this date
LocalDate endDate = new LocalDate(); // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
BigDecimal pageSize = new BigDecimal(); // BigDecimal | 

try {
    List<HistoricalData> result = indexApi.getStockMarketIndexHistoricalData(identifier, item, type, startDate, endDate, sortOrder, pageSize);
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
 **item** | **String**| An Intrinio data tag or other item |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **BigDecimal**|  | [optional] [default to 100]

### Return type

[**List&lt;HistoricalData&gt;**](HistoricalData.md)

<a name="searchEconomicIndices"></a>
# **searchEconomicIndices**
> List&lt;EconomicIndexSummary&gt; searchEconomicIndices(query, nextPage)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String query = "query_example"; // String | Search query
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<EconomicIndexSummary> result = indexApi.searchEconomicIndices(query, nextPage);
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
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;EconomicIndexSummary&gt;**](EconomicIndexSummary.md)

<a name="searchSicIndices"></a>
# **searchSicIndices**
> List&lt;SICIndex&gt; searchSicIndices(query, nextPage)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String query = "query_example"; // String | Search query
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<SICIndex> result = indexApi.searchSicIndices(query, nextPage);
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
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;SICIndex&gt;**](SICIndex.md)

<a name="searchStockMarketsIndices"></a>
# **searchStockMarketsIndices**
> List&lt;StockMarketIndexSummary&gt; searchStockMarketsIndices(query, nextPage)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

IndexApi indexApi = new IndexApi();

String query = "query_example"; // String | Search query
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StockMarketIndexSummary> result = indexApi.searchStockMarketsIndices(query, nextPage);
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
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;StockMarketIndexSummary&gt;**](StockMarketIndexSummary.md)

