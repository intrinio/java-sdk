# HistoricalDataApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricalData**](HistoricalDataApi.md#getHistoricalData) | **GET** /historical_data/{identifier}/{tag} | Historical Data


<a name="getHistoricalData"></a>
# **getHistoricalData**
> ApiResponseHistoricalData getHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage)

Historical Data

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

String identifier = "AAPL"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
String tag = "marketcap"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)
String frequency = "daily"; // String | Return historical data in the given frequency
String type = null; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical date on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseHistoricalData result = historicalDataApi.getHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);
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
 **tag** | **String**| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) |
 **frequency** | **String**| Return historical data in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly]
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical date on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseHistoricalData**](ApiResponseHistoricalData.md)

