# DataPointApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataPointNumber**](DataPointApi.md#getDataPointNumber) | **GET** /data_point/{identifier}/{tag}/number | Get a Data Point (Number)
[**getDataPointText**](DataPointApi.md#getDataPointText) | **GET** /data_point/{identifier}/{tag}/text | Get a Data Point (Text)


<a name="getDataPointNumber"></a>
# **getDataPointNumber**
> BigDecimal getDataPointNumber(identifier, tag)

Get a Data Point (Number)

Returns a numeric value for the given &#x60;tag&#x60; and the entity with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

DataPointApi dataPointApi = new DataPointApi();

String identifier = "AAPL"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
String tag = "marketcap"; // String | An Intrinio data tag ID or code-name

try {
    BigDecimal result = dataPointApi.getDataPointNumber(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPointApi#getDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getDataPointText"></a>
# **getDataPointText**
> String getDataPointText(identifier, tag)

Get a Data Point (Text)

Returns a text value for the given &#x60;tag&#x60; and the entity with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

DataPointApi dataPointApi = new DataPointApi();

String identifier = "AAPL"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
String tag = "marketcap"; // String | An Intrinio data tag ID or code-name

try {
    String result = dataPointApi.getDataPointText(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPointApi#getDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

