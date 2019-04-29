# DataPointApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataPointNumber**](DataPointApi.md#getDataPointNumber) | **GET** /data_point/{identifier}/{tag}/number | Data Point (Number)
[**getDataPointText**](DataPointApi.md#getDataPointText) | **GET** /data_point/{identifier}/{tag}/text | Data Point (Text)


<a name="getDataPointNumber"></a>
# **getDataPointNumber**
> BigDecimal getDataPointNumber(identifier, tag)

Data Point (Number)

$$v2_data_point_number_description$$

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

    DataPointApi dataPointApi = new DataPointApi();

    String identifier = "$$v2_data_point_identifier_default$$"; // String | $$v2_data_point_identifier_description$$
    String tag = "$$v2_data_point_item_number_default$$"; // String | $$v2_data_point_item_description$$

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| $$v2_data_point_identifier_description$$ |
 **tag** | **String**| $$v2_data_point_item_description$$ |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getDataPointText"></a>
# **getDataPointText**
> String getDataPointText(identifier, tag)

Data Point (Text)

$$v2_data_point_text_description$$

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

    DataPointApi dataPointApi = new DataPointApi();

    String identifier = "$$v2_data_point_identifier_default$$"; // String | $$v2_data_point_identifier_description$$
    String tag = "$$v2_data_point_item_text_default$$"; // String | $$v2_data_point_item_description$$

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| $$v2_data_point_identifier_description$$ |
 **tag** | **String**| $$v2_data_point_item_description$$ |

### Return type

**String**

