# MarketApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketStatus**](MarketApi.md#getMarketStatus) | **GET** /market/status | Market Status



[//]: # (START_OPERATION)

[//]: # (CLASS:MarketApi)

[//]: # (METHOD:getMarketStatus)

[//]: # (RETURN_TYPE:MarketStatusResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:MarketStatusResult.md)

[//]: # (OPERATION:getMarketStatus_v2)

[//]: # (ENDPOINT:/market/status)

[//]: # (DOCUMENT_LINK:MarketApi.md#getMarketStatus)

<a name="getMarketStatus"></a>
## **getMarketStatus**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getMarketStatus_v2)

[//]: # (START_OVERVIEW)

> MarketStatusResult getMarketStatus()

#### Market Status


Returns the market status.

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

    MarketApi marketApi = new MarketApi();
    MarketStatusResult result = marketApi.getMarketStatus();
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)

This endpoint does not need any parameter.
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**MarketStatusResult**](MarketStatusResult.md)

[//]: # (END_OPERATION)

