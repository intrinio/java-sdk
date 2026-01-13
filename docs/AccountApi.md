# AccountApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountCurrentUsage**](AccountApi.md#getAccountCurrentUsage) | **GET** /account | Account Current Usage



[//]: # (START_OPERATION)

[//]: # (CLASS:AccountApi)

[//]: # (METHOD:getAccountCurrentUsage)

[//]: # (RETURN_TYPE:ApiResponseAccountUsages)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseAccountUsages.md)

[//]: # (OPERATION:getAccountCurrentUsage_v2)

[//]: # (ENDPOINT:/account)

[//]: # (DOCUMENT_LINK:AccountApi.md#getAccountCurrentUsage)

<a name="getAccountCurrentUsage"></a>
## **getAccountCurrentUsage**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAccountCurrentUsage_v2)

[//]: # (START_OVERVIEW)

> ApiResponseAccountUsages getAccountCurrentUsage()

#### Account Current Usage


Returns a list of all access codes available with their current usage.

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

    AccountApi accountApi = new AccountApi();
    ApiResponseAccountUsages result = accountApi.getAccountCurrentUsage();
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

[**ApiResponseAccountUsages**](ApiResponseAccountUsages.md)

[//]: # (END_OPERATION)

