# DataPointApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataPointNumber**](DataPointApi.md#getDataPointNumber) | **GET** /data_point/{identifier}/{tag}/number | Data Point (Number)
[**getDataPointText**](DataPointApi.md#getDataPointText) | **GET** /data_point/{identifier}/{tag}/text | Data Point (Text)



[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/data_point/{identifier}/{tag}/number)

[//]: # (DOC_LINK:DataPointApi.md#getDataPointNumber)

<a name="getDataPointNumber"></a>
# **getDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getDataPointNumber_v2)

> BigDecimal getDataPointNumber(identifier, tag)

Data Point (Number)

Returns a numeric value for the given &#x60;tag&#x60; and the entity with the given &#x60;identifier&#x60;

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
    auth.setApiKey("YOUR API KEY");

    DataPointApi dataPointApi = new DataPointApi();

    String identifier = "AAPL"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
    String tag = "marketcap"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)

    try {
        BigDecimal result = dataPointApi.getDataPointNumber(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling DataPointApi#getDataPointNumber");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) |

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/data_point/{identifier}/{tag}/text)

[//]: # (DOC_LINK:DataPointApi.md#getDataPointText)

<a name="getDataPointText"></a>
# **getDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getDataPointText_v2)

> String getDataPointText(identifier, tag)

Data Point (Text)

Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

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
    auth.setApiKey("YOUR API KEY");

    DataPointApi dataPointApi = new DataPointApi();

    String identifier = "AAPL"; // String | An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID)
    String tag = "ceo"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)

    try {
        String result = dataPointApi.getDataPointText(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling DataPointApi#getDataPointText");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) |

### Return type

**String**

[//]: # (END_OPERATION)

