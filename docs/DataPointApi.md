# DataPointApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataPointNumber**](DataPointApi.md#getDataPointNumber) | **GET** /data_point/{identifier}/{tag}/number | Data Point (Number)
[**getDataPointText**](DataPointApi.md#getDataPointText) | **GET** /data_point/{identifier}/{tag}/text | Data Point (Text)



[//]: # (START_OPERATION)

[//]: # (CLASS:DataPointApi)

[//]: # (METHOD:getDataPointNumber)

[//]: # (RETURN_TYPE:BigDecimal)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:BigDecimal.md)

[//]: # (OPERATION:getDataPointNumber_v2)

[//]: # (ENDPOINT:/data_point/{identifier}/{tag}/number)

[//]: # (DOCUMENT_LINK:DataPointApi.md#getDataPointNumber)

<a name="getDataPointNumber"></a>
## **getDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getDataPointNumber_v2)

[//]: # (START_OVERVIEW)

> BigDecimal getDataPointNumber(identifier, tag)

#### Data Point (Number)


Returns a numeric value for the given &#x60;tag&#x60; and the entity with the given &#x60;identifier&#x60;

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:DataPointApi)

[//]: # (METHOD:getDataPointText)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getDataPointText_v2)

[//]: # (ENDPOINT:/data_point/{identifier}/{tag}/text)

[//]: # (DOCUMENT_LINK:DataPointApi.md#getDataPointText)

<a name="getDataPointText"></a>
## **getDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getDataPointText_v2)

[//]: # (START_OVERVIEW)

> String getDataPointText(identifier, tag)

#### Data Point (Text)


Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

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

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An identifier for an entity such as a Company, Security, Index, etc (Ticker, FIGI, ISIN, CUSIP, CIK, LEI, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)

