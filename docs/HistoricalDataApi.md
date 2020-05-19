# HistoricalDataApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistoricalData**](HistoricalDataApi.md#getHistoricalData) | **GET** /historical_data/{identifier}/{tag} | Historical Data



[//]: # (START_OPERATION)

[//]: # (CLASS:HistoricalDataApi)

[//]: # (METHOD:getHistoricalData)

[//]: # (RETURN_TYPE:ApiResponseHistoricalData)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseHistoricalData.md)

[//]: # (OPERATION:getHistoricalData_v2)

[//]: # (ENDPOINT:/historical_data/{identifier}/{tag})

[//]: # (DOCUMENT_LINK:HistoricalDataApi.md#getHistoricalData)

<a name="getHistoricalData"></a>
## **getHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getHistoricalData_v2)

[//]: # (START_OVERVIEW)

> ApiResponseHistoricalData getHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage)

#### Historical Data


$$v2_historical_data_description$$

[//]: # (END_OVERVIEW)

### Example

[//]: # (START_CODE_EXAMPLE)

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
    auth.setApiKey("YOUR_API_KEY");

    HistoricalDataApi historicalDataApi = new HistoricalDataApi();

    String identifier = "$$v2_historical_data_identifier_default$$"; // String | $$v2_historical_data_identifier_description$$
    String tag = "$$v2_historical_data_item_default$$"; // String | $$v2_historical_data_item_description$$
    String frequency = "daily"; // String | Return historical data in the given frequency
    String type = null; // String | Filter by type, when applicable
    LocalDate startDate = LocalDate.now(); // LocalDate | Get historical data on or after this date
    LocalDate endDate = LocalDate.now(); // LocalDate | Get historical date on or before this date
    String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
    Integer pageSize = 100; // Integer | The number of results to return
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

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| $$v2_historical_data_identifier_description$$ | &nbsp;
 **tag** | String| $$v2_historical_data_item_description$$ | &nbsp;
 **frequency** | String| Return historical data in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly] &nbsp;
 **type** | String| Filter by type, when applicable | [optional] &nbsp;
 **startDate** | LocalDate| Get historical data on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Get historical date on or before this date | [optional] &nbsp;
 **sortOrder** | String| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseHistoricalData**](ApiResponseHistoricalData.md)

[//]: # (END_OPERATION)

