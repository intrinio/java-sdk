# HistoricalDataApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricalData**](HistoricalDataApi.md#getHistoricalData) | **GET** /historical_data/{identifier}/{tag} | Get Historical Data


<a name="getHistoricalData"></a>
# **getHistoricalData**
> ApiResponseHistoricalData getHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage)

Get Historical Data

Returns historical values for the given &#x60;tag&#x60; and the entity represented by the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.HistoricalDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

HistoricalDataApi historicalDataApi = new HistoricalDataApi();

String identifier = "identifier_example"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
String tag = "tag_example"; // String | An Intrinio data tag ID or code-name
String type = "type_example"; // String | Filter by type, when applicable
LocalDate startDate = new LocalDate(); // LocalDate | Get historical data on or after this date
LocalDate endDate = new LocalDate(); // LocalDate | Get historical date on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    ApiResponseHistoricalData result = historicalDataApi.getHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HistoricalDataApi#getHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical date on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseHistoricalData**](ApiResponseHistoricalData.md)

