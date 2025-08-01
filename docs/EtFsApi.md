# EtFsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllEtfs**](EtFsApi.md#getAllEtfs) | **GET** /etfs | All ETFs
[**getEtf**](EtFsApi.md#getEtf) | **GET** /etfs/{identifier} | Lookup ETF
[**getEtfAnalytics**](EtFsApi.md#getEtfAnalytics) | **GET** /etfs/{identifier}/analytics | ETF Analytics
[**getEtfHistoricalStats**](EtFsApi.md#getEtfHistoricalStats) | **GET** /etfs/{identifier}/historical_stats | Exchange Traded Fund (ETF) stats
[**getEtfHoldings**](EtFsApi.md#getEtfHoldings) | **GET** /etfs/{identifier}/holdings | ETF Holdings
[**getEtfStats**](EtFsApi.md#getEtfStats) | **GET** /etfs/{identifier}/stats | Exchange Traded Fund (ETF) stats
[**searchEtfs**](EtFsApi.md#searchEtfs) | **GET** /etfs/search | Search ETFs



[//]: # (START_OPERATION)

[//]: # (CLASS:EtFsApi)

[//]: # (METHOD:getAllEtfs)

[//]: # (RETURN_TYPE:ApiResponseETFs)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseETFs.md)

[//]: # (OPERATION:getAllEtfs_v2)

[//]: # (ENDPOINT:/etfs)

[//]: # (DOCUMENT_LINK:EtFsApi.md#getAllEtfs)

<a name="getAllEtfs"></a>
## **getAllEtfs**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllEtfs_v2)

[//]: # (START_OVERVIEW)

> ApiResponseETFs getAllEtfs(exchange, pageSize, nextPage)

#### All ETFs


Returns a list of all currently listed ETFs, with relevant identification information including the ETF Name, Ticker, FIGI Ticker, and Exchange MIC for further usage with our ETF Metadata, Holdings, Stats, and Analytics offerings.

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

    EtFsApi etFsApi = new EtFsApi();
    String exchange = "XNAS";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseETFs result = etFsApi.getAllEtfs(exchange, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | String|  | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseETFs**](ApiResponseETFs.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EtFsApi)

[//]: # (METHOD:getEtf)

[//]: # (RETURN_TYPE:ETF)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ETF.md)

[//]: # (OPERATION:getEtf_v2)

[//]: # (ENDPOINT:/etfs/{identifier})

[//]: # (DOCUMENT_LINK:EtFsApi.md#getEtf)

<a name="getEtf"></a>
## **getEtf**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEtf_v2)

[//]: # (START_OVERVIEW)

> ETF getEtf(identifier)

#### Lookup ETF


Returns classifications and reference data which consists of ~90 columns that give detailed information about an ETF. These granular details include asset class, expense ratio, index name, index weighting scheme, smart beta type and specific investment objectives.

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

    EtFsApi etFsApi = new EtFsApi();
    String identifier = "SPY";
    ETF result = etFsApi.getEtf(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ETF**](ETF.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EtFsApi)

[//]: # (METHOD:getEtfAnalytics)

[//]: # (RETURN_TYPE:ETFAnalytics)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ETFAnalytics.md)

[//]: # (OPERATION:getEtfAnalytics_v2)

[//]: # (ENDPOINT:/etfs/{identifier}/analytics)

[//]: # (DOCUMENT_LINK:EtFsApi.md#getEtfAnalytics)

<a name="getEtfAnalytics"></a>
## **getEtfAnalytics**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEtfAnalytics_v2)

[//]: # (START_OVERVIEW)

> ETFAnalytics getEtfAnalytics(identifier)

#### ETF Analytics


Returns latest market analytics for a specified US ETF, including volume, trailing volume, market cap, 52 week high, and 52 week low.

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

    EtFsApi etFsApi = new EtFsApi();
    String identifier = "SPY";
    ETFAnalytics result = etFsApi.getEtfAnalytics(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ETFAnalytics**](ETFAnalytics.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EtFsApi)

[//]: # (METHOD:getEtfHistoricalStats)

[//]: # (RETURN_TYPE:ETFHistoricalStats)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ETFHistoricalStats.md)

[//]: # (OPERATION:getEtfHistoricalStats_v2)

[//]: # (ENDPOINT:/etfs/{identifier}/historical_stats)

[//]: # (DOCUMENT_LINK:EtFsApi.md#getEtfHistoricalStats)

<a name="getEtfHistoricalStats"></a>
## **getEtfHistoricalStats**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEtfHistoricalStats_v2)

[//]: # (START_OVERVIEW)

> ETFHistoricalStats getEtfHistoricalStats(identifier, startDate, endDate, pageSize)

#### Exchange Traded Fund (ETF) stats


Returns comprehensive key US ETF historical performance statistics, including prices, NAVs, flows, returns, and much more for both trailing and calendar year periods.

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

    EtFsApi etFsApi = new EtFsApi();
    String identifier = "SPY";
    LocalDate startDate = LocalDate.of(2020,1,01);
    LocalDate endDate = LocalDate.of(2020,12,31);
    Integer pageSize = 100;
    ETFHistoricalStats result = etFsApi.getEtfHistoricalStats(identifier, startDate, endDate, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) | &nbsp;
 **startDate** | LocalDate| The start date for the historical stats data in YYYY-MM-DD format. | [optional] &nbsp;
 **endDate** | LocalDate| The end date for the historical stats data in YYYY-MM-DD format. | [optional] &nbsp;
 **pageSize** | Integer| The maximum number of results to return per page. | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ETFHistoricalStats**](ETFHistoricalStats.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EtFsApi)

[//]: # (METHOD:getEtfHoldings)

[//]: # (RETURN_TYPE:ApiResponseETFHoldings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseETFHoldings.md)

[//]: # (OPERATION:getEtfHoldings_v2)

[//]: # (ENDPOINT:/etfs/{identifier}/holdings)

[//]: # (DOCUMENT_LINK:EtFsApi.md#getEtfHoldings)

<a name="getEtfHoldings"></a>
## **getEtfHoldings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEtfHoldings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseETFHoldings getEtfHoldings(identifier, pageSize, nextPage)

#### ETF Holdings


Returns holdings data that details all the constituent securities in each ETF with names, identifiers, and the weights for each security providing granular level transparency.

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

    EtFsApi etFsApi = new EtFsApi();
    String identifier = "SPY";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseETFHoldings result = etFsApi.getEtfHoldings(identifier, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseETFHoldings**](ApiResponseETFHoldings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EtFsApi)

[//]: # (METHOD:getEtfStats)

[//]: # (RETURN_TYPE:ETFStats)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ETFStats.md)

[//]: # (OPERATION:getEtfStats_v2)

[//]: # (ENDPOINT:/etfs/{identifier}/stats)

[//]: # (DOCUMENT_LINK:EtFsApi.md#getEtfStats)

<a name="getEtfStats"></a>
## **getEtfStats**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEtfStats_v2)

[//]: # (START_OVERVIEW)

> ETFStats getEtfStats(identifier)

#### Exchange Traded Fund (ETF) stats


Returns comprehensive key US ETF performance statistics, including prices, NAVs, flows, returns, and much more for both trailing and calendar year periods.

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

    EtFsApi etFsApi = new EtFsApi();
    String identifier = "SPY";
    ETFStats result = etFsApi.getEtfStats(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| An ETF identifier (Ticker, Figi Ticker, ISIN, RIC, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ETFStats**](ETFStats.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EtFsApi)

[//]: # (METHOD:searchEtfs)

[//]: # (RETURN_TYPE:ApiResponseETFs)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseETFs.md)

[//]: # (OPERATION:searchEtfs_v2)

[//]: # (ENDPOINT:/etfs/search)

[//]: # (DOCUMENT_LINK:EtFsApi.md#searchEtfs)

<a name="searchEtfs"></a>
## **searchEtfs**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchEtfs_v2)

[//]: # (START_OVERVIEW)

> ApiResponseETFs searchEtfs(query, mode)

#### Search ETFs


Accepts a string of keyword combinations, and searches across the ETF name and ticker and returns a list of ETFs with related keywords.

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

    EtFsApi etFsApi = new EtFsApi();
    String query = "iShares";
    String mode = null;
    ApiResponseETFs result = etFsApi.searchEtfs(query, mode);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | String|  | &nbsp;
 **mode** | String| When set, changes search mode to the specified mode. Paging is not available in rank_order. | [optional] [enum: rank_order, starts_with] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseETFs**](ApiResponseETFs.md)

[//]: # (END_OPERATION)

