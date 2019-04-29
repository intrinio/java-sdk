# DataTagApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataTags**](DataTagApi.md#getAllDataTags) | **GET** /data_tags | All Data Tags
[**getDataTagById**](DataTagApi.md#getDataTagById) | **GET** /data_tags/{identifier} | Lookup Data Tag
[**searchDataTags**](DataTagApi.md#searchDataTags) | **GET** /data_tags/search | Search Data Tags


<a name="getAllDataTags"></a>
# **getAllDataTags**
> ApiResponseDataTags getAllDataTags(tag, type, parent, statementCode, fsTemplate, pageSize, nextPage)

All Data Tags

Returns all Data Tags. Returns Data Tags matching parameters when specified.

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

    DataTagApi dataTagApi = new DataTagApi();

    String tag = null; // String | Tag
    String type = null; // String | Type
    String parent = null; // String | ID of tag parent
    String statementCode = "income_statement"; // String | Statement Code
    String fsTemplate = "industrial"; // String | Template
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseDataTags result = dataTagApi.getAllDataTags(tag, type, parent, statementCode, fsTemplate, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling DataTagApi#getAllDataTags");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| Tag | [optional]
 **type** | **String**| Type | [optional]
 **parent** | **String**| ID of tag parent | [optional]
 **statementCode** | **String**| Statement Code | [optional] [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations]
 **fsTemplate** | **String**| Template | [optional] [default to industrial] [enum: industrial, financial]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseDataTags**](ApiResponseDataTags.md)

<a name="getDataTagById"></a>
# **getDataTagById**
> DataTag getDataTagById(identifier)

Lookup Data Tag

Returns the Data Tag with the given &#x60;identifier&#x60;

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

    DataTagApi dataTagApi = new DataTagApi();

    String identifier = "marketcap"; // String | The Intrinio ID or the code-name of the Data Tag

    try {
        DataTag result = dataTagApi.getDataTagById(identifier);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling DataTagApi#getDataTagById");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The Intrinio ID or the code-name of the Data Tag |

### Return type

[**DataTag**](DataTag.md)

<a name="searchDataTags"></a>
# **searchDataTags**
> ApiResponseDataTagsSearch searchDataTags(query, pageSize)

Search Data Tags

Searches for Data Tags matching the text &#x60;query&#x60;

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

    DataTagApi dataTagApi = new DataTagApi();

    String query = "revenue"; // String | 
    BigDecimal pageSize = null; // BigDecimal | The number of results to return

    try {
        ApiResponseDataTagsSearch result = dataTagApi.searchDataTags(query, pageSize);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling DataTagApi#searchDataTags");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseDataTagsSearch**](ApiResponseDataTagsSearch.md)

