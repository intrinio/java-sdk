# DataPointApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataPointNumber**](DataPointApi.md#getDataPointNumber) | **GET** /data_point/{identifier}/{item}/number | Get a Data Point (Number)
[**getDataPointText**](DataPointApi.md#getDataPointText) | **GET** /data_point/{identifier}/{item}/text | Get a Data Point (Text)


<a name="getDataPointNumber"></a>
# **getDataPointNumber**
> BigDecimal getDataPointNumber(identifier, item)

Get a Data Point (Number)

Returns a numeric value for the given &#x60;item&#x60; and the entity with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

DataPointApi dataPointApi = new DataPointApi();

String identifier = "identifier_example"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    BigDecimal result = dataPointApi.getDataPointNumber(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getDataPointText"></a>
# **getDataPointText**
> String getDataPointText(identifier, item)

Get a Data Point (Text)

Returns a text value for the given &#x60;item&#x60; and the entity with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.DataPointApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

DataPointApi dataPointApi = new DataPointApi();

String identifier = "identifier_example"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag or other item

try {
    String result = dataPointApi.getDataPointText(identifier, item);
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
 **item** | **String**| An Intrinio data tag or other item |

### Return type

**String**

