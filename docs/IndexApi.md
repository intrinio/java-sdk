# IndexApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllEconomicIndices**](IndexApi.md#getAllEconomicIndices) | **GET** /indices/economic | All Economic Indices
[**getAllSicIndices**](IndexApi.md#getAllSicIndices) | **GET** /indices/sic | All SIC Indices
[**getAllStockMarketIndices**](IndexApi.md#getAllStockMarketIndices) | **GET** /indices/stock_market | All Stock Market Indices
[**getEconomicIndexById**](IndexApi.md#getEconomicIndexById) | **GET** /indices/economic/{identifier} | Lookup Economic Index
[**getEconomicIndexDataPointNumber**](IndexApi.md#getEconomicIndexDataPointNumber) | **GET** /indices/economic/{identifier}/data_point/{tag}/number | Data Point (Number) for an Economic Index
[**getEconomicIndexDataPointText**](IndexApi.md#getEconomicIndexDataPointText) | **GET** /indices/economic/{identifier}/data_point/{tag}/text | Data Point (Text) for an Economic Index
[**getEconomicIndexHistoricalData**](IndexApi.md#getEconomicIndexHistoricalData) | **GET** /indices/economic/{identifier}/historical_data/{tag} | Historical Data for an Economic Index
[**getSicIndexById**](IndexApi.md#getSicIndexById) | **GET** /indices/sic/{identifier} | Lookup SIC Index
[**getSicIndexDataPointNumber**](IndexApi.md#getSicIndexDataPointNumber) | **GET** /indices/sic/{identifier}/data_point/{tag}/number | Data Point (Number) for an SIC Index
[**getSicIndexDataPointText**](IndexApi.md#getSicIndexDataPointText) | **GET** /indices/sic/{identifier}/data_point/{tag}/text | Data Point (Text) for an SIC Index
[**getSicIndexHistoricalData**](IndexApi.md#getSicIndexHistoricalData) | **GET** /indices/sic/{identifier}/historical_data/{tag} | Historical Data for an SIC Index
[**getStockMarketIndexById**](IndexApi.md#getStockMarketIndexById) | **GET** /indices/stock_market/{identifier} | Lookup Stock Market Index
[**getStockMarketIndexDataPointNumber**](IndexApi.md#getStockMarketIndexDataPointNumber) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/number | Data Point (Number) for Stock Market Index
[**getStockMarketIndexDataPointText**](IndexApi.md#getStockMarketIndexDataPointText) | **GET** /indices/stock_market/{identifier}/data_point/{tag}/text | Data Point (Text) for Stock Market Index
[**getStockMarketIndexHistoricalData**](IndexApi.md#getStockMarketIndexHistoricalData) | **GET** /indices/stock_market/{identifier}/historical_data/{tag} | Historical Data for Stock Market Index
[**searchEconomicIndices**](IndexApi.md#searchEconomicIndices) | **GET** /indices/economic/search | Search Economic Indices
[**searchSicIndices**](IndexApi.md#searchSicIndices) | **GET** /indices/sic/search | Search SIC Indices
[**searchStockMarketsIndices**](IndexApi.md#searchStockMarketsIndices) | **GET** /indices/stock_market/search | Search Stock Market Indices



[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/economic)

[//]: # (DOC_LINK:IndexApi.md#getAllEconomicIndices)

<a name="getAllEconomicIndices"></a>
# **getAllEconomicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getAllEconomicIndices_v2)

> ApiResponseEconomicIndices getAllEconomicIndices(pageSize, nextPage)

All Economic Indices

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

    IndexApi indexApi = new IndexApi();

    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseEconomicIndices result = indexApi.getAllEconomicIndices(pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getAllEconomicIndices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseEconomicIndices**](ApiResponseEconomicIndices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/sic)

[//]: # (DOC_LINK:IndexApi.md#getAllSicIndices)

<a name="getAllSicIndices"></a>
# **getAllSicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getAllSicIndices_v2)

> ApiResponseSICIndices getAllSicIndices(pageSize, nextPage)

All SIC Indices

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

    IndexApi indexApi = new IndexApi();

    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseSICIndices result = indexApi.getAllSicIndices(pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getAllSicIndices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSICIndices**](ApiResponseSICIndices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/stock_market)

[//]: # (DOC_LINK:IndexApi.md#getAllStockMarketIndices)

<a name="getAllStockMarketIndices"></a>
# **getAllStockMarketIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getAllStockMarketIndices_v2)

> ApiResponseStockMarketIndices getAllStockMarketIndices(pageSize, nextPage)

All Stock Market Indices

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

    IndexApi indexApi = new IndexApi();

    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseStockMarketIndices result = indexApi.getAllStockMarketIndices(pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getAllStockMarketIndices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockMarketIndices**](ApiResponseStockMarketIndices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/economic/{identifier})

[//]: # (DOC_LINK:IndexApi.md#getEconomicIndexById)

<a name="getEconomicIndexById"></a>
# **getEconomicIndexById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getEconomicIndexById_v2)

> EconomicIndex getEconomicIndexById(identifier)

Lookup Economic Index

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)

    try {
        EconomicIndex result = indexApi.getEconomicIndexById(identifier);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getEconomicIndexById");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |

### Return type

[**EconomicIndex**](EconomicIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/economic/{identifier}/data_point/{tag}/number)

[//]: # (DOC_LINK:IndexApi.md#getEconomicIndexDataPointNumber)

<a name="getEconomicIndexDataPointNumber"></a>
# **getEconomicIndexDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getEconomicIndexDataPointNumber_v2)

> BigDecimal getEconomicIndexDataPointNumber(identifier, tag)

Data Point (Number) for an Economic Index

Returns a numeric value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag <a href='https://data.intrinio.com/data-tags/economic'>reference</a>

    try {
        BigDecimal result = indexApi.getEconomicIndexDataPointNumber(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getEconomicIndexDataPointNumber");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag &lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags/economic&#39;&gt;reference&lt;/a&gt; |

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/economic/{identifier}/data_point/{tag}/text)

[//]: # (DOC_LINK:IndexApi.md#getEconomicIndexDataPointText)

<a name="getEconomicIndexDataPointText"></a>
# **getEconomicIndexDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getEconomicIndexDataPointText_v2)

> String getEconomicIndexDataPointText(identifier, tag)

Data Point (Text) for an Economic Index

Returns a text value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag ID or code-name

    try {
        String result = indexApi.getEconomicIndexDataPointText(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getEconomicIndexDataPointText");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/economic/{identifier}/historical_data/{tag})

[//]: # (DOC_LINK:IndexApi.md#getEconomicIndexHistoricalData)

<a name="getEconomicIndexHistoricalData"></a>
# **getEconomicIndexHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getEconomicIndexHistoricalData_v2)

> ApiResponseEconomicIndexHistoricalData getEconomicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage)

Historical Data for an Economic Index

Returns historical values for the given &#x60;tag&#x60; and the Economic Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$GDP"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag <a href='https://data.intrinio.com/data-tags/economic'>reference</a>
    String type = null; // String | Filter by type, when applicable
    LocalDate startDate = null; // LocalDate | Get historical data on or after this date
    LocalDate endDate = null; // LocalDate | Get historical data on or before this date
    String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseEconomicIndexHistoricalData result = indexApi.getEconomicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getEconomicIndexHistoricalData");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag &lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags/economic&#39;&gt;reference&lt;/a&gt; |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseEconomicIndexHistoricalData**](ApiResponseEconomicIndexHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/sic/{identifier})

[//]: # (DOC_LINK:IndexApi.md#getSicIndexById)

<a name="getSicIndexById"></a>
# **getSicIndexById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getSicIndexById_v2)

> SICIndex getSicIndexById(identifier)

Lookup SIC Index

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)

    try {
        SICIndex result = indexApi.getSicIndexById(identifier);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getSicIndexById");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |

### Return type

[**SICIndex**](SICIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/sic/{identifier}/data_point/{tag}/number)

[//]: # (DOC_LINK:IndexApi.md#getSicIndexDataPointNumber)

<a name="getSicIndexDataPointNumber"></a>
# **getSicIndexDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getSicIndexDataPointNumber_v2)

> BigDecimal getSicIndexDataPointNumber(identifier, tag)

Data Point (Number) for an SIC Index

Returns a numeric value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag ID or code-name

    try {
        BigDecimal result = indexApi.getSicIndexDataPointNumber(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getSicIndexDataPointNumber");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/sic/{identifier}/data_point/{tag}/text)

[//]: # (DOC_LINK:IndexApi.md#getSicIndexDataPointText)

<a name="getSicIndexDataPointText"></a>
# **getSicIndexDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getSicIndexDataPointText_v2)

> String getSicIndexDataPointText(identifier, tag)

Data Point (Text) for an SIC Index

Returns a text value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag ID or code-name

    try {
        String result = indexApi.getSicIndexDataPointText(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getSicIndexDataPointText");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/sic/{identifier}/historical_data/{tag})

[//]: # (DOC_LINK:IndexApi.md#getSicIndexHistoricalData)

<a name="getSicIndexHistoricalData"></a>
# **getSicIndexHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getSicIndexHistoricalData_v2)

> ApiResponseSICIndexHistoricalData getSicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage)

Historical Data for an SIC Index

Returns historical values for the given &#x60;tag&#x60; and the SIC Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$SIC.1"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "marketcap"; // String | An Intrinio data tag ID or code-name
    String type = null; // String | Filter by type, when applicable
    LocalDate startDate = null; // LocalDate | Get historical data on or after this date
    LocalDate endDate = null; // LocalDate | Get historical data on or before this date
    String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseSICIndexHistoricalData result = indexApi.getSicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getSicIndexHistoricalData");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSICIndexHistoricalData**](ApiResponseSICIndexHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/stock_market/{identifier})

[//]: # (DOC_LINK:IndexApi.md#getStockMarketIndexById)

<a name="getStockMarketIndexById"></a>
# **getStockMarketIndexById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockMarketIndexById_v2)

> StockMarketIndex getStockMarketIndexById(identifier)

Lookup Stock Market Index

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)

    try {
        StockMarketIndex result = indexApi.getStockMarketIndexById(identifier);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getStockMarketIndexById");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |

### Return type

[**StockMarketIndex**](StockMarketIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/stock_market/{identifier}/data_point/{tag}/number)

[//]: # (DOC_LINK:IndexApi.md#getStockMarketIndexDataPointNumber)

<a name="getStockMarketIndexDataPointNumber"></a>
# **getStockMarketIndexDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockMarketIndexDataPointNumber_v2)

> BigDecimal getStockMarketIndexDataPointNumber(identifier, tag)

Data Point (Number) for Stock Market Index

Returns a numeric value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag ID or code-name

    try {
        BigDecimal result = indexApi.getStockMarketIndexDataPointNumber(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getStockMarketIndexDataPointNumber");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/stock_market/{identifier}/data_point/{tag}/text)

[//]: # (DOC_LINK:IndexApi.md#getStockMarketIndexDataPointText)

<a name="getStockMarketIndexDataPointText"></a>
# **getStockMarketIndexDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockMarketIndexDataPointText_v2)

> String getStockMarketIndexDataPointText(identifier, tag)

Data Point (Text) for Stock Market Index

Returns a text value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag ID or code-name

    try {
        String result = indexApi.getStockMarketIndexDataPointText(identifier, tag);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getStockMarketIndexDataPointText");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/stock_market/{identifier}/historical_data/{tag})

[//]: # (DOC_LINK:IndexApi.md#getStockMarketIndexHistoricalData)

<a name="getStockMarketIndexHistoricalData"></a>
# **getStockMarketIndexHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getStockMarketIndexHistoricalData_v2)

> ApiResponseStockMarketIndexHistoricalData getStockMarketIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage)

Historical Data for Stock Market Index

Returns historical values for the given &#x60;tag&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();

    String identifier = "$DJI"; // String | An Index Identifier (symbol, Intrinio ID)
    String tag = "level"; // String | An Intrinio data tag ID or code-name
    String type = null; // String | Filter by type, when applicable
    LocalDate startDate = null; // LocalDate | Get historical data on or after this date
    LocalDate endDate = null; // LocalDate | Get historical data on or before this date
    String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseStockMarketIndexHistoricalData result = indexApi.getStockMarketIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#getStockMarketIndexHistoricalData");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| An Index Identifier (symbol, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseStockMarketIndexHistoricalData**](ApiResponseStockMarketIndexHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/economic/search)

[//]: # (DOC_LINK:IndexApi.md#searchEconomicIndices)

<a name="searchEconomicIndices"></a>
# **searchEconomicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/searchEconomicIndices_v2)

> ApiResponseEconomicIndicesSearch searchEconomicIndices(query, pageSize)

Search Economic Indices

Searches for indices using the text in &#x60;query&#x60;

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

    IndexApi indexApi = new IndexApi();

    String query = "GDP"; // String | Search query
    Integer pageSize = 100; // Integer | The number of results to return

    try {
        ApiResponseEconomicIndicesSearch result = indexApi.searchEconomicIndices(query, pageSize);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#searchEconomicIndices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query |
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseEconomicIndicesSearch**](ApiResponseEconomicIndicesSearch.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/sic/search)

[//]: # (DOC_LINK:IndexApi.md#searchSicIndices)

<a name="searchSicIndices"></a>
# **searchSicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/searchSicIndices_v2)

> ApiResponseSICIndicesSearch searchSicIndices(query, pageSize)

Search SIC Indices

Searches for indices using the text in &#x60;query&#x60;

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

    IndexApi indexApi = new IndexApi();

    String query = "agriculture"; // String | Search query
    Integer pageSize = 100; // Integer | The number of results to return

    try {
        ApiResponseSICIndicesSearch result = indexApi.searchSicIndices(query, pageSize);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#searchSicIndices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query |
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseSICIndicesSearch**](ApiResponseSICIndicesSearch.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/indices/stock_market/search)

[//]: # (DOC_LINK:IndexApi.md#searchStockMarketsIndices)

<a name="searchStockMarketsIndices"></a>
# **searchStockMarketsIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/searchStockMarketsIndices_v2)

> ApiResponseStockMarketIndicesSearch searchStockMarketsIndices(query, pageSize)

Search Stock Market Indices

Searches for indices using the text in &#x60;query&#x60;

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

    IndexApi indexApi = new IndexApi();

    String query = "dow"; // String | Search query
    Integer pageSize = 100; // Integer | The number of results to return

    try {
        ApiResponseStockMarketIndicesSearch result = indexApi.searchStockMarketsIndices(query, pageSize);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling IndexApi#searchStockMarketsIndices");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search query |
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseStockMarketIndicesSearch**](ApiResponseStockMarketIndicesSearch.md)

[//]: # (END_OPERATION)

