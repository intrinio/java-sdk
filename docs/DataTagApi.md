# DataTagApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterDataTags**](DataTagApi.md#filterDataTags) | **GET** /data_tags/filter | Filter Data Tags
[**getAllDataTags**](DataTagApi.md#getAllDataTags) | **GET** /data_tags | Get All Data Tags
[**getDataTagById**](DataTagApi.md#getDataTagById) | **GET** /data_tags/{identifier} | Get a Data Tag by ID
[**searchDataTags**](DataTagApi.md#searchDataTags) | **GET** /data_tags/search | Search Data Tags


<a name="filterDataTags"></a>
# **filterDataTags**
> ApiResponseDataTags filterDataTags(tag, type, parent, statementCode, fsTemplate, nextPage)

Filter Data Tags

Returns Data Tags that match the given filters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

DataTagApi dataTagApi = new DataTagApi();

String tag = ""; // String | Tag
String type = ""; // String | Type
String parent = ""; // String | ID of tag parent
String statementCode = "income_statement"; // String | Statement Code
String fsTemplate = "industrial"; // String | Template
String nextPage = ""; // String | Gets the next page of data from a previous API call

try {
    ApiResponseDataTags result = dataTagApi.filterDataTags(tag, type, parent, statementCode, fsTemplate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTagApi#filterDataTags");
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

[**ApiResponseDataTags**](ApiResponseDataTags.md)

<a name="getAllDataTags"></a>
# **getAllDataTags**
> ApiResponseDataTags getAllDataTags(nextPage)

Get All Data Tags

Returns All Data Tags

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

DataTagApi dataTagApi = new DataTagApi();

String nextPage = ""; // String | Gets the next page of data from a previous API call

try {
    ApiResponseDataTags result = dataTagApi.getAllDataTags(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTagApi#getAllDataTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseDataTags**](ApiResponseDataTags.md)

<a name="getDataTagById"></a>
# **getDataTagById**
> DataTag getDataTagById(identifier)

Get a Data Tag by ID

Returns a Data Tag with the specified &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

DataTagApi dataTagApi = new DataTagApi();

String identifier = "marketcap"; // String | The Intrinio ID or the code-name of the Data Tag

try {
    DataTag result = dataTagApi.getDataTagById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTagApi#getDataTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The Intrinio ID or the code-name of the Data Tag |

### Return type

[**DataTag**](DataTag.md)

<a name="searchDataTags"></a>
# **searchDataTags**
> ApiResponseDataTags searchDataTags(query)

Search Data Tags

Searches for Data Tags matching the text &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataTagApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

DataTagApi dataTagApi = new DataTagApi();

String query = "revenue"; // String | 

try {
    ApiResponseDataTags result = dataTagApi.searchDataTags(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTagApi#searchDataTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |

### Return type

[**ApiResponseDataTags**](ApiResponseDataTags.md)

