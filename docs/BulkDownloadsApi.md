# BulkDownloadsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBulkDownloadLinks**](BulkDownloadsApi.md#getBulkDownloadLinks) | **GET** /bulk_downloads/links | All Links



[//]: # (START_OPERATION)

[//]: # (CLASS:BulkDownloadsApi)

[//]: # (METHOD:getBulkDownloadLinks)

[//]: # (RETURN_TYPE:ApiResponseBulkDownloadLinks)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseBulkDownloadLinks.md)

[//]: # (OPERATION:getBulkDownloadLinks_v2)

[//]: # (ENDPOINT:/bulk_downloads/links)

[//]: # (DOCUMENT_LINK:BulkDownloadsApi.md#getBulkDownloadLinks)

<a name="getBulkDownloadLinks"></a>
## **getBulkDownloadLinks**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getBulkDownloadLinks_v2)

[//]: # (START_OVERVIEW)

> ApiResponseBulkDownloadLinks getBulkDownloadLinks()

#### All Links


Returns all active bulk downloads for your account with links to download.

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

    BulkDownloadsApi bulkDownloadsApi = new BulkDownloadsApi();
    ApiResponseBulkDownloadLinks result = bulkDownloadsApi.getBulkDownloadLinks();
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

[**ApiResponseBulkDownloadLinks**](ApiResponseBulkDownloadLinks.md)

[//]: # (END_OPERATION)

