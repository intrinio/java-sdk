# StandardizedTagApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterStandardizedTags**](StandardizedTagApi.md#filterStandardizedTags) | **GET** /standardized_tags/filter | Filter Standardized Tags
[**getAllStandardizedTags**](StandardizedTagApi.md#getAllStandardizedTags) | **GET** /standardized_tags | Get All Standardized Tags
[**getStandardizedTagById**](StandardizedTagApi.md#getStandardizedTagById) | **GET** /standardized_tags/{tag_id} | Get a Standardized Tag by ID
[**getStandardizedTagDataPointNumber**](StandardizedTagApi.md#getStandardizedTagDataPointNumber) | **GET** /standardized_tags/{id}/data_point/{identifier}/number | Get Data Point (Number) for The Standardized Tag
[**getStandardizedTagDataPointText**](StandardizedTagApi.md#getStandardizedTagDataPointText) | **GET** /standardized_tags/{id}/data_point/{identifier}/text | Get Data Point (Text) for the Standardized Tag
[**getStandardizedTagHistoricalData**](StandardizedTagApi.md#getStandardizedTagHistoricalData) | **GET** /standardized_tags/{id}/historical_data/{identifier} | Get Historical Data for the Standardized Tag
[**searchStandardizedTags**](StandardizedTagApi.md#searchStandardizedTags) | **GET** /standardized_tags/search | Search Standardized Tags


<a name="filterStandardizedTags"></a>
# **filterStandardizedTags**
> List&lt;StandardizedTag&gt; filterStandardizedTags(tag, type, parent, statementCode, fsTemplate, nextPage)

Filter Standardized Tags

Returns Standarized Tags that match the given filters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StandardizedTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StandardizedTagApi standardizedTagApi = new StandardizedTagApi();

String tag = "tag_example"; // String | Tag
String type = "type_example"; // String | Type
String parent = "parent_example"; // String | ID of tag parent
String statementCode = "statementCode_example"; // String | Statement Code
String fsTemplate = "industrial"; // String | Template
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StandardizedTag> result = standardizedTagApi.filterStandardizedTags(tag, type, parent, statementCode, fsTemplate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardizedTagApi#filterStandardizedTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| Tag | [optional]
 **type** | **String**| Type | [optional]
 **parent** | **String**| ID of tag parent | [optional]
 **statementCode** | **String**| Statement Code | [optional] [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations]
 **fsTemplate** | **String**| Template | [optional] [default to industrial] [enum: industrial, financial]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;StandardizedTag&gt;**](StandardizedTag.md)

<a name="getAllStandardizedTags"></a>
# **getAllStandardizedTags**
> List&lt;StandardizedTag&gt; getAllStandardizedTags(nextPage)

Get All Standardized Tags

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StandardizedTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StandardizedTagApi standardizedTagApi = new StandardizedTagApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StandardizedTag> result = standardizedTagApi.getAllStandardizedTags(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardizedTagApi#getAllStandardizedTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;StandardizedTag&gt;**](StandardizedTag.md)

<a name="getStandardizedTagById"></a>
# **getStandardizedTagById**
> StandardizedTag getStandardizedTagById(tagId)

Get a Standardized Tag by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StandardizedTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StandardizedTagApi standardizedTagApi = new StandardizedTagApi();

String tagId = "tagId_example"; // String | The Intrinio ID for the tag

try {
    StandardizedTag result = standardizedTagApi.getStandardizedTagById(tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardizedTagApi#getStandardizedTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| The Intrinio ID for the tag |

### Return type

[**StandardizedTag**](StandardizedTag.md)

<a name="getStandardizedTagDataPointNumber"></a>
# **getStandardizedTagDataPointNumber**
> BigDecimal getStandardizedTagDataPointNumber(id, identifier)

Get Data Point (Number) for The Standardized Tag

Returns a numeric data point for the Standardized Tag and entity &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StandardizedTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StandardizedTagApi standardizedTagApi = new StandardizedTagApi();

String id = "id_example"; // String | The Intrinio Standardized Tag ID or its tag
String identifier = "identifier_example"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)

try {
    BigDecimal result = standardizedTagApi.getStandardizedTagDataPointNumber(id, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardizedTagApi#getStandardizedTagDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio Standardized Tag ID or its tag |
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getStandardizedTagDataPointText"></a>
# **getStandardizedTagDataPointText**
> String getStandardizedTagDataPointText(id, identifier)

Get Data Point (Text) for the Standardized Tag

Returns a text data point for the Standardized Tag and entity &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StandardizedTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StandardizedTagApi standardizedTagApi = new StandardizedTagApi();

String id = "id_example"; // String | The Intrinio Standardized Tag ID or its tag
String identifier = "identifier_example"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)

try {
    String result = standardizedTagApi.getStandardizedTagDataPointText(id, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardizedTagApi#getStandardizedTagDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio Standardized Tag ID or its tag |
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |

### Return type

**String**

<a name="getStandardizedTagHistoricalData"></a>
# **getStandardizedTagHistoricalData**
> List&lt;HistoricalData&gt; getStandardizedTagHistoricalData(id, identifier, type, startDate, endDate, sortOrder, nextPage)

Get Historical Data for the Standardized Tag

Returns historical values for the Standardized Tag and the Entity represented by the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StandardizedTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StandardizedTagApi standardizedTagApi = new StandardizedTagApi();

String id = "id_example"; // String | The Intrinio Standardized Tag ID or its tag
String identifier = "identifier_example"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
String type = "type_example"; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical date on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<HistoricalData> result = standardizedTagApi.getStandardizedTagHistoricalData(id, identifier, type, startDate, endDate, sortOrder, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardizedTagApi#getStandardizedTagHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio Standardized Tag ID or its tag |
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical date on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;HistoricalData&gt;**](HistoricalData.md)

<a name="searchStandardizedTags"></a>
# **searchStandardizedTags**
> List&lt;StandardizedTag&gt; searchStandardizedTags(query, nextPage)

Search Standardized Tags

Searches for Standardized Tags matching the text &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.StandardizedTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

StandardizedTagApi standardizedTagApi = new StandardizedTagApi();

String query = "query_example"; // String | 
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<StandardizedTag> result = standardizedTagApi.searchStandardizedTags(query, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandardizedTagApi#searchStandardizedTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;StandardizedTag&gt;**](StandardizedTag.md)

