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



[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getAllEconomicIndices)

[//]: # (RETURN_TYPE:ApiResponseEconomicIndices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseEconomicIndices.md)

[//]: # (OPERATION:getAllEconomicIndices_v2)

[//]: # (ENDPOINT:/indices/economic)

[//]: # (DOCUMENT_LINK:IndexApi.md#getAllEconomicIndices)

<a name="getAllEconomicIndices"></a>
## **getAllEconomicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllEconomicIndices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseEconomicIndices getAllEconomicIndices(pageSize, nextPage)

#### All Economic Indices



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

    IndexApi indexApi = new IndexApi();
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseEconomicIndices result = indexApi.getAllEconomicIndices(pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseEconomicIndices**](ApiResponseEconomicIndices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getAllSicIndices)

[//]: # (RETURN_TYPE:ApiResponseSICIndices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSICIndices.md)

[//]: # (OPERATION:getAllSicIndices_v2)

[//]: # (ENDPOINT:/indices/sic)

[//]: # (DOCUMENT_LINK:IndexApi.md#getAllSicIndices)

<a name="getAllSicIndices"></a>
## **getAllSicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllSicIndices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSICIndices getAllSicIndices(pageSize, nextPage)

#### All SIC Indices



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

    IndexApi indexApi = new IndexApi();
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSICIndices result = indexApi.getAllSicIndices(pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSICIndices**](ApiResponseSICIndices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getAllStockMarketIndices)

[//]: # (RETURN_TYPE:ApiResponseStockMarketIndices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockMarketIndices.md)

[//]: # (OPERATION:getAllStockMarketIndices_v2)

[//]: # (ENDPOINT:/indices/stock_market)

[//]: # (DOCUMENT_LINK:IndexApi.md#getAllStockMarketIndices)

<a name="getAllStockMarketIndices"></a>
## **getAllStockMarketIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllStockMarketIndices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockMarketIndices getAllStockMarketIndices(pageSize, nextPage)

#### All Stock Market Indices



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

    IndexApi indexApi = new IndexApi();
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseStockMarketIndices result = indexApi.getAllStockMarketIndices(pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockMarketIndices**](ApiResponseStockMarketIndices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getEconomicIndexById)

[//]: # (RETURN_TYPE:EconomicIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:EconomicIndex.md)

[//]: # (OPERATION:getEconomicIndexById_v2)

[//]: # (ENDPOINT:/indices/economic/{identifier})

[//]: # (DOCUMENT_LINK:IndexApi.md#getEconomicIndexById)

<a name="getEconomicIndexById"></a>
## **getEconomicIndexById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEconomicIndexById_v2)

[//]: # (START_OVERVIEW)

> EconomicIndex getEconomicIndexById(identifier)

#### Lookup Economic Index



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

    IndexApi indexApi = new IndexApi();
    String identifier = "$GDP";
    EconomicIndex result = indexApi.getEconomicIndexById(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**EconomicIndex**](EconomicIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getEconomicIndexDataPointNumber)

[//]: # (RETURN_TYPE:BigDecimal)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:BigDecimal.md)

[//]: # (OPERATION:getEconomicIndexDataPointNumber_v2)

[//]: # (ENDPOINT:/indices/economic/{identifier}/data_point/{tag}/number)

[//]: # (DOCUMENT_LINK:IndexApi.md#getEconomicIndexDataPointNumber)

<a name="getEconomicIndexDataPointNumber"></a>
## **getEconomicIndexDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEconomicIndexDataPointNumber_v2)

[//]: # (START_OVERVIEW)

> BigDecimal getEconomicIndexDataPointNumber(identifier, tag)

#### Data Point (Number) for an Economic Index


Returns a numeric value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$GDP";
    String tag = "level";
    BigDecimal result = indexApi.getEconomicIndexDataPointNumber(identifier, tag);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag &lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags/economic&#39;&gt;reference&lt;/a&gt; | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getEconomicIndexDataPointText)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getEconomicIndexDataPointText_v2)

[//]: # (ENDPOINT:/indices/economic/{identifier}/data_point/{tag}/text)

[//]: # (DOCUMENT_LINK:IndexApi.md#getEconomicIndexDataPointText)

<a name="getEconomicIndexDataPointText"></a>
## **getEconomicIndexDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEconomicIndexDataPointText_v2)

[//]: # (START_OVERVIEW)

> String getEconomicIndexDataPointText(identifier, tag)

#### Data Point (Text) for an Economic Index


Returns a text value for the given &#x60;tag&#x60; for the Economic Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$GDP";
    String tag = "level";
    String result = indexApi.getEconomicIndexDataPointText(identifier, tag);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getEconomicIndexHistoricalData)

[//]: # (RETURN_TYPE:ApiResponseEconomicIndexHistoricalData)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseEconomicIndexHistoricalData.md)

[//]: # (OPERATION:getEconomicIndexHistoricalData_v2)

[//]: # (ENDPOINT:/indices/economic/{identifier}/historical_data/{tag})

[//]: # (DOCUMENT_LINK:IndexApi.md#getEconomicIndexHistoricalData)

<a name="getEconomicIndexHistoricalData"></a>
## **getEconomicIndexHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEconomicIndexHistoricalData_v2)

[//]: # (START_OVERVIEW)

> ApiResponseEconomicIndexHistoricalData getEconomicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage)

#### Historical Data for an Economic Index


Returns historical values for the given &#x60;tag&#x60; and the Economic Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$GDP";
    String tag = "level";
    String type = null;
    LocalDate startDate = LocalDate.of(2018,1,01);
    LocalDate endDate = null;
    String sortOrder = "desc";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseEconomicIndexHistoricalData result = indexApi.getEconomicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag &lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags/economic&#39;&gt;reference&lt;/a&gt; | &nbsp;
 **type** | String| Filter by type, when applicable | [optional] &nbsp;
 **startDate** | LocalDate| Get historical data on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Get historical data on or before this date | [optional] &nbsp;
 **sortOrder** | String| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseEconomicIndexHistoricalData**](ApiResponseEconomicIndexHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getSicIndexById)

[//]: # (RETURN_TYPE:SICIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SICIndex.md)

[//]: # (OPERATION:getSicIndexById_v2)

[//]: # (ENDPOINT:/indices/sic/{identifier})

[//]: # (DOCUMENT_LINK:IndexApi.md#getSicIndexById)

<a name="getSicIndexById"></a>
## **getSicIndexById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSicIndexById_v2)

[//]: # (START_OVERVIEW)

> SICIndex getSicIndexById(identifier)

#### Lookup SIC Index



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

    IndexApi indexApi = new IndexApi();
    String identifier = "$SIC.2911";
    SICIndex result = indexApi.getSicIndexById(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SICIndex**](SICIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getSicIndexDataPointNumber)

[//]: # (RETURN_TYPE:BigDecimal)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:BigDecimal.md)

[//]: # (OPERATION:getSicIndexDataPointNumber_v2)

[//]: # (ENDPOINT:/indices/sic/{identifier}/data_point/{tag}/number)

[//]: # (DOCUMENT_LINK:IndexApi.md#getSicIndexDataPointNumber)

<a name="getSicIndexDataPointNumber"></a>
## **getSicIndexDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSicIndexDataPointNumber_v2)

[//]: # (START_OVERVIEW)

> BigDecimal getSicIndexDataPointNumber(identifier, tag)

#### Data Point (Number) for an SIC Index


Returns a numeric value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$SIC.2911";
    String tag = "marketcap";
    BigDecimal result = indexApi.getSicIndexDataPointNumber(identifier, tag);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getSicIndexDataPointText)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getSicIndexDataPointText_v2)

[//]: # (ENDPOINT:/indices/sic/{identifier}/data_point/{tag}/text)

[//]: # (DOCUMENT_LINK:IndexApi.md#getSicIndexDataPointText)

<a name="getSicIndexDataPointText"></a>
## **getSicIndexDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSicIndexDataPointText_v2)

[//]: # (START_OVERVIEW)

> String getSicIndexDataPointText(identifier, tag)

#### Data Point (Text) for an SIC Index


Returns a text value for the given &#x60;tag&#x60; for the SIC Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$SIC.2911";
    String tag = "marketcap";
    String result = indexApi.getSicIndexDataPointText(identifier, tag);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getSicIndexHistoricalData)

[//]: # (RETURN_TYPE:ApiResponseSICIndexHistoricalData)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSICIndexHistoricalData.md)

[//]: # (OPERATION:getSicIndexHistoricalData_v2)

[//]: # (ENDPOINT:/indices/sic/{identifier}/historical_data/{tag})

[//]: # (DOCUMENT_LINK:IndexApi.md#getSicIndexHistoricalData)

<a name="getSicIndexHistoricalData"></a>
## **getSicIndexHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSicIndexHistoricalData_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSICIndexHistoricalData getSicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage)

#### Historical Data for an SIC Index


Returns historical values for the given &#x60;tag&#x60; and the SIC Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$SIC.1";
    String tag = "marketcap";
    String type = null;
    LocalDate startDate = LocalDate.of(2018,1,01);
    LocalDate endDate = null;
    String sortOrder = "desc";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSICIndexHistoricalData result = indexApi.getSicIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
 **type** | String| Filter by type, when applicable | [optional] &nbsp;
 **startDate** | LocalDate| Get historical data on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Get historical data on or before this date | [optional] &nbsp;
 **sortOrder** | String| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSICIndexHistoricalData**](ApiResponseSICIndexHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getStockMarketIndexById)

[//]: # (RETURN_TYPE:StockMarketIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:StockMarketIndex.md)

[//]: # (OPERATION:getStockMarketIndexById_v2)

[//]: # (ENDPOINT:/indices/stock_market/{identifier})

[//]: # (DOCUMENT_LINK:IndexApi.md#getStockMarketIndexById)

<a name="getStockMarketIndexById"></a>
## **getStockMarketIndexById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getStockMarketIndexById_v2)

[//]: # (START_OVERVIEW)

> StockMarketIndex getStockMarketIndexById(identifier)

#### Lookup Stock Market Index



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

    IndexApi indexApi = new IndexApi();
    String identifier = "$DJI";
    StockMarketIndex result = indexApi.getStockMarketIndexById(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**StockMarketIndex**](StockMarketIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getStockMarketIndexDataPointNumber)

[//]: # (RETURN_TYPE:BigDecimal)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:BigDecimal.md)

[//]: # (OPERATION:getStockMarketIndexDataPointNumber_v2)

[//]: # (ENDPOINT:/indices/stock_market/{identifier}/data_point/{tag}/number)

[//]: # (DOCUMENT_LINK:IndexApi.md#getStockMarketIndexDataPointNumber)

<a name="getStockMarketIndexDataPointNumber"></a>
## **getStockMarketIndexDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getStockMarketIndexDataPointNumber_v2)

[//]: # (START_OVERVIEW)

> BigDecimal getStockMarketIndexDataPointNumber(identifier, tag)

#### Data Point (Number) for Stock Market Index


Returns a numeric value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$DJI";
    String tag = "level";
    BigDecimal result = indexApi.getStockMarketIndexDataPointNumber(identifier, tag);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getStockMarketIndexDataPointText)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getStockMarketIndexDataPointText_v2)

[//]: # (ENDPOINT:/indices/stock_market/{identifier}/data_point/{tag}/text)

[//]: # (DOCUMENT_LINK:IndexApi.md#getStockMarketIndexDataPointText)

<a name="getStockMarketIndexDataPointText"></a>
## **getStockMarketIndexDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getStockMarketIndexDataPointText_v2)

[//]: # (START_OVERVIEW)

> String getStockMarketIndexDataPointText(identifier, tag)

#### Data Point (Text) for Stock Market Index


Returns a text value for the given &#x60;tag&#x60; for the Stock Market Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$DJI";
    String tag = "level";
    String result = indexApi.getStockMarketIndexDataPointText(identifier, tag);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getStockMarketIndexHistoricalData)

[//]: # (RETURN_TYPE:ApiResponseStockMarketIndexHistoricalData)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockMarketIndexHistoricalData.md)

[//]: # (OPERATION:getStockMarketIndexHistoricalData_v2)

[//]: # (ENDPOINT:/indices/stock_market/{identifier}/historical_data/{tag})

[//]: # (DOCUMENT_LINK:IndexApi.md#getStockMarketIndexHistoricalData)

<a name="getStockMarketIndexHistoricalData"></a>
## **getStockMarketIndexHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getStockMarketIndexHistoricalData_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockMarketIndexHistoricalData getStockMarketIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage)

#### Historical Data for Stock Market Index


Returns historical values for the given &#x60;tag&#x60; and the Stock Market Index with the given &#x60;identifier&#x60;

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

    IndexApi indexApi = new IndexApi();
    String identifier = "$DJI";
    String tag = "level";
    String type = null;
    LocalDate startDate = LocalDate.of(2018,1,01);
    LocalDate endDate = null;
    String sortOrder = "desc";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseStockMarketIndexHistoricalData result = indexApi.getStockMarketIndexHistoricalData(identifier, tag, type, startDate, endDate, sortOrder, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An Index Identifier (symbol, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
 **type** | String| Filter by type, when applicable | [optional] &nbsp;
 **startDate** | LocalDate| Get historical data on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Get historical data on or before this date | [optional] &nbsp;
 **sortOrder** | String| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockMarketIndexHistoricalData**](ApiResponseStockMarketIndexHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:searchEconomicIndices)

[//]: # (RETURN_TYPE:ApiResponseEconomicIndicesSearch)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseEconomicIndicesSearch.md)

[//]: # (OPERATION:searchEconomicIndices_v2)

[//]: # (ENDPOINT:/indices/economic/search)

[//]: # (DOCUMENT_LINK:IndexApi.md#searchEconomicIndices)

<a name="searchEconomicIndices"></a>
## **searchEconomicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchEconomicIndices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseEconomicIndicesSearch searchEconomicIndices(query, pageSize)

#### Search Economic Indices


Searches for indices using the text in &#x60;query&#x60;

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

    IndexApi indexApi = new IndexApi();
    String query = "GDP";
    Integer pageSize = 100;
    ApiResponseEconomicIndicesSearch result = indexApi.searchEconomicIndices(query, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | String| Search query | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseEconomicIndicesSearch**](ApiResponseEconomicIndicesSearch.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:searchSicIndices)

[//]: # (RETURN_TYPE:ApiResponseSICIndicesSearch)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSICIndicesSearch.md)

[//]: # (OPERATION:searchSicIndices_v2)

[//]: # (ENDPOINT:/indices/sic/search)

[//]: # (DOCUMENT_LINK:IndexApi.md#searchSicIndices)

<a name="searchSicIndices"></a>
## **searchSicIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchSicIndices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSICIndicesSearch searchSicIndices(query, pageSize)

#### Search SIC Indices


Searches for indices using the text in &#x60;query&#x60;

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

    IndexApi indexApi = new IndexApi();
    String query = "agriculture";
    Integer pageSize = 100;
    ApiResponseSICIndicesSearch result = indexApi.searchSicIndices(query, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | String| Search query | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSICIndicesSearch**](ApiResponseSICIndicesSearch.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:searchStockMarketsIndices)

[//]: # (RETURN_TYPE:ApiResponseStockMarketIndicesSearch)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStockMarketIndicesSearch.md)

[//]: # (OPERATION:searchStockMarketsIndices_v2)

[//]: # (ENDPOINT:/indices/stock_market/search)

[//]: # (DOCUMENT_LINK:IndexApi.md#searchStockMarketsIndices)

<a name="searchStockMarketsIndices"></a>
## **searchStockMarketsIndices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchStockMarketsIndices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStockMarketIndicesSearch searchStockMarketsIndices(query, pageSize)

#### Search Stock Market Indices


Searches for indices using the text in &#x60;query&#x60;

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

    IndexApi indexApi = new IndexApi();
    String query = "dow";
    Integer pageSize = 100;
    ApiResponseStockMarketIndicesSearch result = indexApi.searchStockMarketsIndices(query, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | String| Search query | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStockMarketIndicesSearch**](ApiResponseStockMarketIndicesSearch.md)

[//]: # (END_OPERATION)

