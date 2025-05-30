# IndexApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllEconomicIndices**](IndexApi.md#getAllEconomicIndices) | **GET** /indices/economic | All Economic Indices
[**getAllEodIndexPrices**](IndexApi.md#getAllEodIndexPrices) | **GET** /indices/prices/eod | All End of Day Index Prices
[**getAllIndexSummaries**](IndexApi.md#getAllIndexSummaries) | **GET** /indices | All Index Summaries
[**getAllRealtimeIndexPrices**](IndexApi.md#getAllRealtimeIndexPrices) | **GET** /indices/prices/realtime | All Realtime Index Prices
[**getAllSicIndices**](IndexApi.md#getAllSicIndices) | **GET** /indices/sic | All SIC Indices
[**getAllStockMarketIndices**](IndexApi.md#getAllStockMarketIndices) | **GET** /indices/stock_market | All Stock Market Indices
[**getEconomicIndexById**](IndexApi.md#getEconomicIndexById) | **GET** /indices/economic/{identifier} | Lookup Economic Index
[**getEconomicIndexDataPointNumber**](IndexApi.md#getEconomicIndexDataPointNumber) | **GET** /indices/economic/{identifier}/data_point/{tag}/number | Data Point (Number) for an Economic Index
[**getEconomicIndexDataPointText**](IndexApi.md#getEconomicIndexDataPointText) | **GET** /indices/economic/{identifier}/data_point/{tag}/text | Data Point (Text) for an Economic Index
[**getEconomicIndexHistoricalData**](IndexApi.md#getEconomicIndexHistoricalData) | **GET** /indices/economic/{identifier}/historical_data/{tag} | Historical Data for an Economic Index
[**getEodIndexPriceById**](IndexApi.md#getEodIndexPriceById) | **GET** /indices/{identifier}/eod | End of Day Index Prices By Identifier
[**getIndexConstituentsById**](IndexApi.md#getIndexConstituentsById) | **GET** /indices/{identifier}/constituents | Index Constituents By Index Identifier
[**getIndexIntervals**](IndexApi.md#getIndexIntervals) | **GET** /indices/{identifier}/intervals | Index Intervals
[**getIndexSummaryById**](IndexApi.md#getIndexSummaryById) | **GET** /indices/{identifier} | Index Summary By Identifier
[**getRealtimeIndexPriceById**](IndexApi.md#getRealtimeIndexPriceById) | **GET** /indices/{identifier}/realtime | Realtime Index Price By Identifier
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


Returns a list of reference data on more than 200,000 economic indices from the Federal Reserve Economic Data (FRED) database.

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

[//]: # (METHOD:getAllEodIndexPrices)

[//]: # (RETURN_TYPE:ApiResponseEodIndexPricesAll)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseEodIndexPricesAll.md)

[//]: # (OPERATION:getAllEodIndexPrices_v2)

[//]: # (ENDPOINT:/indices/prices/eod)

[//]: # (DOCUMENT_LINK:IndexApi.md#getAllEodIndexPrices)

<a name="getAllEodIndexPrices"></a>
## **getAllEodIndexPrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllEodIndexPrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseEodIndexPricesAll getAllEodIndexPrices(pageSize, startDate, endDate)

#### All End of Day Index Prices



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
    LocalDate startDate = null;
    LocalDate endDate = null;
    ApiResponseEodIndexPricesAll result = indexApi.getAllEodIndexPrices(pageSize, startDate, endDate);
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
 **startDate** | LocalDate| Limit prices to those on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Limit prices to those on or before this date | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseEodIndexPricesAll**](ApiResponseEodIndexPricesAll.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getAllIndexSummaries)

[//]: # (RETURN_TYPE:ApiResponseIndices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseIndices.md)

[//]: # (OPERATION:getAllIndexSummaries_v2)

[//]: # (ENDPOINT:/indices)

[//]: # (DOCUMENT_LINK:IndexApi.md#getAllIndexSummaries)

<a name="getAllIndexSummaries"></a>
## **getAllIndexSummaries**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllIndexSummaries_v2)

[//]: # (START_OVERVIEW)

> ApiResponseIndices getAllIndexSummaries(pageSize)

#### All Index Summaries



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
    ApiResponseIndices result = indexApi.getAllIndexSummaries(pageSize);
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
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseIndices**](ApiResponseIndices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getAllRealtimeIndexPrices)

[//]: # (RETURN_TYPE:ApiResponseRealtimeIndexPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseRealtimeIndexPrices.md)

[//]: # (OPERATION:getAllRealtimeIndexPrices_v2)

[//]: # (ENDPOINT:/indices/prices/realtime)

[//]: # (DOCUMENT_LINK:IndexApi.md#getAllRealtimeIndexPrices)

<a name="getAllRealtimeIndexPrices"></a>
## **getAllRealtimeIndexPrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllRealtimeIndexPrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseRealtimeIndexPrices getAllRealtimeIndexPrices(pageSize)

#### All Realtime Index Prices



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
    ApiResponseRealtimeIndexPrices result = indexApi.getAllRealtimeIndexPrices(pageSize);
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
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseRealtimeIndexPrices**](ApiResponseRealtimeIndexPrices.md)

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


Returns reference data for a specified Federal Reserve Economic Data (FRED) series ID.

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


Returns latest data for a specified Federal Reserve Economic Data (FRED) ID.

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


Returns historical data for a specified Federal Reserve Economic Data (FRED) ID over a period of time.

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

[//]: # (METHOD:getEodIndexPriceById)

[//]: # (RETURN_TYPE:ApiResponseEodIndexPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseEodIndexPrices.md)

[//]: # (OPERATION:getEodIndexPriceById_v2)

[//]: # (ENDPOINT:/indices/{identifier}/eod)

[//]: # (DOCUMENT_LINK:IndexApi.md#getEodIndexPriceById)

<a name="getEodIndexPriceById"></a>
## **getEodIndexPriceById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEodIndexPriceById_v2)

[//]: # (START_OVERVIEW)

> ApiResponseEodIndexPrices getEodIndexPriceById(identifier, pageSize, startDate, endDate)

#### End of Day Index Prices By Identifier



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
    String identifier = "SPX";
    Integer pageSize = 100;
    LocalDate startDate = null;
    LocalDate endDate = null;
    ApiResponseEodIndexPrices result = indexApi.getEodIndexPriceById(identifier, pageSize, startDate, endDate);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The index symbol | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **startDate** | LocalDate| Limit prices to those on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Limit prices to those on or before this date | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseEodIndexPrices**](ApiResponseEodIndexPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getIndexConstituentsById)

[//]: # (RETURN_TYPE:ApiResponseIndexConstituents)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseIndexConstituents.md)

[//]: # (OPERATION:getIndexConstituentsById_v2)

[//]: # (ENDPOINT:/indices/{identifier}/constituents)

[//]: # (DOCUMENT_LINK:IndexApi.md#getIndexConstituentsById)

<a name="getIndexConstituentsById"></a>
## **getIndexConstituentsById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getIndexConstituentsById_v2)

[//]: # (START_OVERVIEW)

> ApiResponseIndexConstituents getIndexConstituentsById(identifier)

#### Index Constituents By Index Identifier



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
    String identifier = "DJI";
    ApiResponseIndexConstituents result = indexApi.getIndexConstituentsById(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The index symbol | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseIndexConstituents**](ApiResponseIndexConstituents.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getIndexIntervals)

[//]: # (RETURN_TYPE:ApiResponseIndexIntervals)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseIndexIntervals.md)

[//]: # (OPERATION:getIndexIntervals_v2)

[//]: # (ENDPOINT:/indices/{identifier}/intervals)

[//]: # (DOCUMENT_LINK:IndexApi.md#getIndexIntervals)

<a name="getIndexIntervals"></a>
## **getIndexIntervals**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getIndexIntervals_v2)

[//]: # (START_OVERVIEW)

> ApiResponseIndexIntervals getIndexIntervals(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize)

#### Index Intervals


Returns a list of interval data points for a specified index, including open, close, high, low, volume, and average price. Intervals are available in 60-minute, 30-minute, 15-minute, 10-minute, 5-minute, and 1-minute increments.

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
    String identifier = "SPX";
    String intervalSize = "5m";
    LocalDate startDate = LocalDate.of(2023,1,01);
    String startTime = "33300";
    LocalDate endDate = LocalDate.of(2023,2,01);
    String endTime = "33300";
    String timezone = "UTC";
    Integer pageSize = 100;
    ApiResponseIndexIntervals result = indexApi.getIndexIntervals(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The index identifier | &nbsp;
 **intervalSize** | String| The interval size to return in minutes (m) or hour (h). | [default to 5m] [enum: 1m, 5m, 10m, 15m, 30m, 60m, 1h] &nbsp;
 **startDate** | LocalDate| Return intervals starting at the specified date | [optional] &nbsp;
 **startTime** | String| Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) | [optional] &nbsp;
 **endDate** | LocalDate| Return intervals stopping at the specified date | [optional] &nbsp;
 **endTime** | String| Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) | [optional] &nbsp;
 **timezone** | String| Interprets the input times in this time zone, as well as returns times in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu] &nbsp;
 **pageSize** | Integer| The number of results to return per page. | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseIndexIntervals**](ApiResponseIndexIntervals.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getIndexSummaryById)

[//]: # (RETURN_TYPE:ApiResponseIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseIndex.md)

[//]: # (OPERATION:getIndexSummaryById_v2)

[//]: # (ENDPOINT:/indices/{identifier})

[//]: # (DOCUMENT_LINK:IndexApi.md#getIndexSummaryById)

<a name="getIndexSummaryById"></a>
## **getIndexSummaryById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getIndexSummaryById_v2)

[//]: # (START_OVERVIEW)

> ApiResponseIndex getIndexSummaryById(identifier)

#### Index Summary By Identifier



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
    String identifier = "SPX";
    ApiResponseIndex result = indexApi.getIndexSummaryById(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The index symbol | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseIndex**](ApiResponseIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:IndexApi)

[//]: # (METHOD:getRealtimeIndexPriceById)

[//]: # (RETURN_TYPE:RealtimeIndexPrice)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:RealtimeIndexPrice.md)

[//]: # (OPERATION:getRealtimeIndexPriceById_v2)

[//]: # (ENDPOINT:/indices/{identifier}/realtime)

[//]: # (DOCUMENT_LINK:IndexApi.md#getRealtimeIndexPriceById)

<a name="getRealtimeIndexPriceById"></a>
## **getRealtimeIndexPriceById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getRealtimeIndexPriceById_v2)

[//]: # (START_OVERVIEW)

> RealtimeIndexPrice getRealtimeIndexPriceById(identifier)

#### Realtime Index Price By Identifier


Returns the realtime price for an index.

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
    String identifier = "SPX";
    RealtimeIndexPrice result = indexApi.getRealtimeIndexPriceById(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The index symbol | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**RealtimeIndexPrice**](RealtimeIndexPrice.md)

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


Search the Federal Reserve Economic Data (FRED) database and return a list of economic indices matching the text query parameter passed through.

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

