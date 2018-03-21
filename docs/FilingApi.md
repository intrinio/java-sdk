# FilingApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterFilings**](FilingApi.md#filterFilings) | **GET** /filings/filter | Filter Filings
[**getAllFilings**](FilingApi.md#getAllFilings) | **GET** /filings | Get All Filings
[**getFilingById**](FilingApi.md#getFilingById) | **GET** /filings/{id} | Get a Filing by ID


<a name="filterFilings"></a>
# **filterFilings**
> List&lt;Filing&gt; filterFilings(company, reportType, startDate, endDate, nextPage)

Filter Filings

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

FilingApi filingApi = new FilingApi();

String company = "company_example"; // String | Filings for the given `company` identifier (ticker, CIK, LEI, Intrinio ID)
String reportType = "reportType_example"; // String | Filter by report type
LocalDate startDate = new LocalDate(); // LocalDate | Filed on or after the given date
LocalDate endDate = new LocalDate(); // LocalDate | Filed before or after the given date
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<Filing> result = filingApi.filterFilings(company, reportType, startDate, endDate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#filterFilings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | **String**| Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) |
 **reportType** | **String**| Filter by report type | [optional]
 **startDate** | **LocalDate**| Filed on or after the given date | [optional]
 **endDate** | **LocalDate**| Filed before or after the given date | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;Filing&gt;**](Filing.md)

<a name="getAllFilings"></a>
# **getAllFilings**
> List&lt;Filing&gt; getAllFilings(nextPage)

Get All Filings

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

FilingApi filingApi = new FilingApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<Filing> result = filingApi.getAllFilings(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#getAllFilings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;Filing&gt;**](Filing.md)

<a name="getFilingById"></a>
# **getFilingById**
> Filing getFilingById(id)

Get a Filing by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

FilingApi filingApi = new FilingApi();

String id = "id_example"; // String | The Intrinio ID of the Filing

try {
    Filing result = filingApi.getFilingById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#getFilingById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID of the Filing |

### Return type

[**Filing**](Filing.md)

