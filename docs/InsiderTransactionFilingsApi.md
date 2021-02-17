# InsiderTransactionFilingsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllInsiderTransactionFilings**](InsiderTransactionFilingsApi.md#getAllInsiderTransactionFilings) | **GET** /insider_transaction_filings | All Insider Transactions Filings



[//]: # (START_OPERATION)

[//]: # (CLASS:InsiderTransactionFilingsApi)

[//]: # (METHOD:getAllInsiderTransactionFilings)

[//]: # (RETURN_TYPE:ApiResponseOwnerInsiderTransactionFilings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOwnerInsiderTransactionFilings.md)

[//]: # (OPERATION:getAllInsiderTransactionFilings_v2)

[//]: # (ENDPOINT:/insider_transaction_filings)

[//]: # (DOCUMENT_LINK:InsiderTransactionFilingsApi.md#getAllInsiderTransactionFilings)

<a name="getAllInsiderTransactionFilings"></a>
## **getAllInsiderTransactionFilings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllInsiderTransactionFilings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOwnerInsiderTransactionFilings getAllInsiderTransactionFilings(startDate, endDate, pageSize, nextPage)

#### All Insider Transactions Filings


Returns all insider transactions filings fitting the optional supplied start and end date.

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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    InsiderTransactionFilingsApi insiderTransactionFilingsApi = new InsiderTransactionFilingsApi();
    LocalDate startDate = LocalDate.of(2015,1,01);
    LocalDate endDate = null;
    Integer pageSize = 100;
    String nextPage = null;
    
    ApiResponseOwnerInsiderTransactionFilings result = insiderTransactionFilingsApi.getAllInsiderTransactionFilings(startDate, endDate, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | LocalDate| Filed on or after the given date | [optional] &nbsp;
 **endDate** | LocalDate| Filed before or after the given date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOwnerInsiderTransactionFilings**](ApiResponseOwnerInsiderTransactionFilings.md)

[//]: # (END_OPERATION)

