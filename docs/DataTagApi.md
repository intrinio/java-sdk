# DataTagApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataTags**](DataTagApi.md#getAllDataTags) | **GET** /data_tags | All Data Tags
[**getDataTagById**](DataTagApi.md#getDataTagById) | **GET** /data_tags/{identifier} | Lookup Data Tag
[**searchDataTags**](DataTagApi.md#searchDataTags) | **GET** /data_tags/search | Search Data Tags



[//]: # (START_OPERATION)

[//]: # (CLASS:DataTagApi)

[//]: # (METHOD:getAllDataTags)

[//]: # (RETURN_TYPE:ApiResponseDataTags)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseDataTags.md)

[//]: # (OPERATION:getAllDataTags_v2)

[//]: # (ENDPOINT:/data_tags)

[//]: # (DOCUMENT_LINK:DataTagApi.md#getAllDataTags)

<a name="getAllDataTags"></a>
## **getAllDataTags**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllDataTags_v2)

[//]: # (START_OVERVIEW)

> ApiResponseDataTags getAllDataTags(tag, type, parent, statementCode, fsTemplate, pageSize, nextPage)

#### All Data Tags


Returns all Data Tags. Returns Data Tags matching parameters when specified.

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

    DataTagApi dataTagApi = new DataTagApi();

    String tag = null; // String | Tag
    String type = null; // String | Type
    String parent = null; // String | ID of tag parent
    String statementCode = "income_statement"; // String | Statement Code
    String fsTemplate = "industrial"; // String | Template
    Integer pageSize = 100; // Integer | The number of results to return
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

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | String| Tag | [optional] &nbsp;
 **type** | String| Type | [optional] &nbsp;
 **parent** | String| ID of tag parent | [optional] &nbsp;
 **statementCode** | String| Statement Code | [optional] [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations] &nbsp;
 **fsTemplate** | String| Template | [optional] [default to industrial] [enum: industrial, financial] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseDataTags**](ApiResponseDataTags.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:DataTagApi)

[//]: # (METHOD:getDataTagById)

[//]: # (RETURN_TYPE:DataTag)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:DataTag.md)

[//]: # (OPERATION:getDataTagById_v2)

[//]: # (ENDPOINT:/data_tags/{identifier})

[//]: # (DOCUMENT_LINK:DataTagApi.md#getDataTagById)

<a name="getDataTagById"></a>
## **getDataTagById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getDataTagById_v2)

[//]: # (START_OVERVIEW)

> DataTag getDataTagById(identifier)

#### Lookup Data Tag


Returns the Data Tag with the given &#x60;identifier&#x60;

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

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The Intrinio ID or the code-name of the Data Tag | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**DataTag**](DataTag.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:DataTagApi)

[//]: # (METHOD:searchDataTags)

[//]: # (RETURN_TYPE:ApiResponseDataTagsSearch)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseDataTagsSearch.md)

[//]: # (OPERATION:searchDataTags_v2)

[//]: # (ENDPOINT:/data_tags/search)

[//]: # (DOCUMENT_LINK:DataTagApi.md#searchDataTags)

<a name="searchDataTags"></a>
## **searchDataTags**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchDataTags_v2)

[//]: # (START_OVERVIEW)

> ApiResponseDataTagsSearch searchDataTags(query, pageSize)

#### Search Data Tags


Searches for Data Tags matching the text &#x60;query&#x60;

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

    DataTagApi dataTagApi = new DataTagApi();

    String query = "revenue"; // String | 
    Integer pageSize = 100; // Integer | The number of results to return

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

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | String|  | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseDataTagsSearch**](ApiResponseDataTagsSearch.md)

[//]: # (END_OPERATION)

