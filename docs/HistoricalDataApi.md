# HistoricalDataApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricalData**](HistoricalDataApi.md#getHistoricalData) | **GET** /historical_data/{identifier}/{tag} | Historical Data


<a name="getHistoricalData"></a>
# **getHistoricalData**
> ApiResponseHistoricalData getHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage)

Historical Data

$$v2_historical_data_description$$

### Example
```java
import com.intrinio.api.*;
import com.intrinio.models.*;
import com.intrinio.invoker.*;
import com.intrinio.invoker.auth.*;
import org.threeten.bp.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR API KEY");

    HistoricalDataApi historicalDataApi = new HistoricalDataApi();

    String identifier = "$$v2_historical_data_identifier_default$$"; // String | $$v2_historical_data_identifier_description$$
    String tag = "$$v2_historical_data_item_default$$"; // String | $$v2_historical_data_item_description$$
    String frequency = "daily"; // String | Return historical data in the given frequency
    String type = null; // String | Filter by type, when applicable
    LocalDate startDate = null; // LocalDate | Get historical data on or after this date
    LocalDate endDate = null; // LocalDate | Get historical date on or before this date
    String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseHistoricalData result = historicalDataApi.getHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling HistoricalDataApi#getHistoricalData");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| $$v2_historical_data_identifier_description$$ |
 **tag** | **String**| $$v2_historical_data_item_description$$ |
 **frequency** | **String**| Return historical data in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly]
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical date on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseHistoricalData**](ApiResponseHistoricalData.md)

