# EsgApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEsgCompanies**](EsgApi.md#getEsgCompanies) | **GET** /esg/companies | ESG Companies
[**getEsgCompanyComprehensiveRatings**](EsgApi.md#getEsgCompanyComprehensiveRatings) | **GET** /esg/{identifier}/comprehensive | ESG Company Comprehensive Ratings History
[**getEsgCompanyRatings**](EsgApi.md#getEsgCompanyRatings) | **GET** /esg/{identifier} | ESG Company Ratings History
[**getEsgLatest**](EsgApi.md#getEsgLatest) | **GET** /esg | ESG Latest
[**getEsgLatestComprehensive**](EsgApi.md#getEsgLatestComprehensive) | **GET** /esg/comprehensive | ESG Latest Comprehensive



[//]: # (START_OPERATION)

[//]: # (CLASS:EsgApi)

[//]: # (METHOD:getEsgCompanies)

[//]: # (RETURN_TYPE:ApiResponseESGCompanies)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseESGCompanies.md)

[//]: # (OPERATION:getEsgCompanies_v2)

[//]: # (ENDPOINT:/esg/companies)

[//]: # (DOCUMENT_LINK:EsgApi.md#getEsgCompanies)

<a name="getEsgCompanies"></a>
## **getEsgCompanies**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEsgCompanies_v2)

[//]: # (START_OVERVIEW)

> ApiResponseESGCompanies getEsgCompanies(country, industry, ticker, pageSize, nextPage)

#### ESG Companies



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

    EsgApi esgApi = new EsgApi();
    String country = "Canada";
    String industry = "Retail";
    String ticker = "SHOP";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseESGCompanies result = esgApi.getEsgCompanies(country, industry, ticker, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | String|  | [optional] &nbsp;
 **industry** | String|  | [optional] &nbsp;
 **ticker** | String|  | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseESGCompanies**](ApiResponseESGCompanies.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EsgApi)

[//]: # (METHOD:getEsgCompanyComprehensiveRatings)

[//]: # (RETURN_TYPE:ApiResponseESGCompanyComprehensiveRatingHistory)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseESGCompanyComprehensiveRatingHistory.md)

[//]: # (OPERATION:getEsgCompanyComprehensiveRatings_v2)

[//]: # (ENDPOINT:/esg/{identifier}/comprehensive)

[//]: # (DOCUMENT_LINK:EsgApi.md#getEsgCompanyComprehensiveRatings)

<a name="getEsgCompanyComprehensiveRatings"></a>
## **getEsgCompanyComprehensiveRatings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEsgCompanyComprehensiveRatings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseESGCompanyComprehensiveRatingHistory getEsgCompanyComprehensiveRatings(identifier, pageSize, nextPage)

#### ESG Company Comprehensive Ratings History



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

    EsgApi esgApi = new EsgApi();
    String identifier = "AAPL";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseESGCompanyComprehensiveRatingHistory result = esgApi.getEsgCompanyComprehensiveRatings(identifier, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| ISIN, Intrinio ID, or Ticker | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseESGCompanyComprehensiveRatingHistory**](ApiResponseESGCompanyComprehensiveRatingHistory.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EsgApi)

[//]: # (METHOD:getEsgCompanyRatings)

[//]: # (RETURN_TYPE:ApiResponseESGCompanyRatingHistory)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseESGCompanyRatingHistory.md)

[//]: # (OPERATION:getEsgCompanyRatings_v2)

[//]: # (ENDPOINT:/esg/{identifier})

[//]: # (DOCUMENT_LINK:EsgApi.md#getEsgCompanyRatings)

<a name="getEsgCompanyRatings"></a>
## **getEsgCompanyRatings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEsgCompanyRatings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseESGCompanyRatingHistory getEsgCompanyRatings(identifier, pageSize, nextPage)

#### ESG Company Ratings History



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

    EsgApi esgApi = new EsgApi();
    String identifier = "AAPL";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseESGCompanyRatingHistory result = esgApi.getEsgCompanyRatings(identifier, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| ISIN, Intrinio ID, or Ticker | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseESGCompanyRatingHistory**](ApiResponseESGCompanyRatingHistory.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EsgApi)

[//]: # (METHOD:getEsgLatest)

[//]: # (RETURN_TYPE:ApiResponseESGLatest)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseESGLatest.md)

[//]: # (OPERATION:getEsgLatest_v2)

[//]: # (ENDPOINT:/esg)

[//]: # (DOCUMENT_LINK:EsgApi.md#getEsgLatest)

<a name="getEsgLatest"></a>
## **getEsgLatest**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEsgLatest_v2)

[//]: # (START_OVERVIEW)

> ApiResponseESGLatest getEsgLatest(country, pageSize, nextPage)

#### ESG Latest



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

    EsgApi esgApi = new EsgApi();
    String country = "USA";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseESGLatest result = esgApi.getEsgLatest(country, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | String|  | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseESGLatest**](ApiResponseESGLatest.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:EsgApi)

[//]: # (METHOD:getEsgLatestComprehensive)

[//]: # (RETURN_TYPE:ApiResponseESGLatestComprehensive)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseESGLatestComprehensive.md)

[//]: # (OPERATION:getEsgLatestComprehensive_v2)

[//]: # (ENDPOINT:/esg/comprehensive)

[//]: # (DOCUMENT_LINK:EsgApi.md#getEsgLatestComprehensive)

<a name="getEsgLatestComprehensive"></a>
## **getEsgLatestComprehensive**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getEsgLatestComprehensive_v2)

[//]: # (START_OVERVIEW)

> ApiResponseESGLatestComprehensive getEsgLatestComprehensive(country, pageSize, nextPage)

#### ESG Latest Comprehensive



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

    EsgApi esgApi = new EsgApi();
    String country = "USA";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseESGLatestComprehensive result = esgApi.getEsgLatestComprehensive(country, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | String|  | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseESGLatestComprehensive**](ApiResponseESGLatestComprehensive.md)

[//]: # (END_OPERATION)

