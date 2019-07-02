# CompanyApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllCompanies**](CompanyApi.md#getAllCompanies) | **GET** /companies | All Companies
[**getAllCompanyNews**](CompanyApi.md#getAllCompanyNews) | **GET** /companies/news | All News
[**getCompany**](CompanyApi.md#getCompany) | **GET** /companies/{identifier} | Lookup Company
[**getCompanyDataPointNumber**](CompanyApi.md#getCompanyDataPointNumber) | **GET** /companies/{identifier}/data_point/{tag}/number | Data Point (Number) for Company
[**getCompanyDataPointText**](CompanyApi.md#getCompanyDataPointText) | **GET** /companies/{identifier}/data_point/{tag}/text | Data Point (Text) for Company
[**getCompanyFilings**](CompanyApi.md#getCompanyFilings) | **GET** /companies/{identifier}/filings | All Filings by Company
[**getCompanyFundamentals**](CompanyApi.md#getCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals | All Fundamentals by Company
[**getCompanyHistoricalData**](CompanyApi.md#getCompanyHistoricalData) | **GET** /companies/{identifier}/historical_data/{tag} | Historical Data for Company
[**getCompanyIpos**](CompanyApi.md#getCompanyIpos) | **GET** /companies/ipos | IPOs
[**getCompanyNews**](CompanyApi.md#getCompanyNews) | **GET** /companies/{identifier}/news | All News by Company
[**getCompanySecurities**](CompanyApi.md#getCompanySecurities) | **GET** /companies/{identifier}/securities | All Securities by Company
[**lookupCompanyFundamental**](CompanyApi.md#lookupCompanyFundamental) | **GET** /companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup Fundamental by Company
[**searchCompanies**](CompanyApi.md#searchCompanies) | **GET** /companies/search | Search Companies



[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getAllCompanies)

[//]: # (RETURN_TYPE:ApiResponseCompanies)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseCompanies.md)

[//]: # (OPERATION:getAllCompanies_v2)

[//]: # (ENDPOINT:/companies)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getAllCompanies)

<a name="getAllCompanies"></a>
## **getAllCompanies**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllCompanies_v2)

[//]: # (START_OVERVIEW)

> ApiResponseCompanies getAllCompanies(latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, pageSize, nextPage)

#### All Companies


Returns all Companies. When parameters are specified, returns matching companies.

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

    CompanyApi companyApi = new CompanyApi();

    LocalDate latestFilingDate = null; // LocalDate | Last filing date
    String sic = null; // String | Return companies with the given Standard Industrial Classification code
    String template = null; // String | Return companies with the given financial statement template
    String sector = null; // String | Return companies in the given industry sector
    String industryCategory = null; // String | Return companies in the given industry category
    String industryGroup = null; // String | Return companies in the given industry group
    Boolean hasFundamentals = true; // Boolean | Return only companies that have fundamentals when true
    Boolean hasStockPrices = true; // Boolean | Return only companies that have stock prices when true
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseCompanies result = companyApi.getAllCompanies(latestFilingDate, sic, template, sector, industryCategory, industryGroup, hasFundamentals, hasStockPrices, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getAllCompanies");
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
 **latestFilingDate** | LocalDate| Last filing date | [optional] &nbsp;
 **sic** | String| Return companies with the given Standard Industrial Classification code | [optional] &nbsp;
 **template** | String| Return companies with the given financial statement template | [optional] [enum: industrial, financial] &nbsp;
 **sector** | String| Return companies in the given industry sector | [optional] &nbsp;
 **industryCategory** | String| Return companies in the given industry category | [optional] &nbsp;
 **industryGroup** | String| Return companies in the given industry group | [optional] &nbsp;
 **hasFundamentals** | Boolean| Return only companies that have fundamentals when true | [optional] &nbsp;
 **hasStockPrices** | Boolean| Return only companies that have stock prices when true | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseCompanies**](ApiResponseCompanies.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getAllCompanyNews)

[//]: # (RETURN_TYPE:ApiResponseNews)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseNews.md)

[//]: # (OPERATION:getAllCompanyNews_v2)

[//]: # (ENDPOINT:/companies/news)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getAllCompanyNews)

<a name="getAllCompanyNews"></a>
## **getAllCompanyNews**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllCompanyNews_v2)

[//]: # (START_OVERVIEW)

> ApiResponseNews getAllCompanyNews(pageSize, nextPage)

#### All News


Returns all News for all Companies

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

    CompanyApi companyApi = new CompanyApi();

    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseNews result = companyApi.getAllCompanyNews(pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getAllCompanyNews");
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
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseNews**](ApiResponseNews.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompany)

[//]: # (RETURN_TYPE:Company)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:Company.md)

[//]: # (OPERATION:getCompany_v2)

[//]: # (ENDPOINT:/companies/{identifier})

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompany)

<a name="getCompany"></a>
## **getCompany**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompany_v2)

[//]: # (START_OVERVIEW)

> Company getCompany(identifier)

#### Lookup Company


Returns the Company with the given &#x60;identifier&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)

    try {
      Company result = companyApi.getCompany(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompany");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**Company**](Company.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanyDataPointNumber)

[//]: # (RETURN_TYPE:BigDecimal)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:BigDecimal.md)

[//]: # (OPERATION:getCompanyDataPointNumber_v2)

[//]: # (ENDPOINT:/companies/{identifier}/data_point/{tag}/number)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanyDataPointNumber)

<a name="getCompanyDataPointNumber"></a>
## **getCompanyDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanyDataPointNumber_v2)

[//]: # (START_OVERVIEW)

> BigDecimal getCompanyDataPointNumber(identifier, tag)

#### Data Point (Number) for Company


Returns a numeric value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String tag = "marketcap"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)

    try {
      BigDecimal result = companyApi.getCompanyDataPointNumber(identifier, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanyDataPointNumber");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanyDataPointText)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getCompanyDataPointText_v2)

[//]: # (ENDPOINT:/companies/{identifier}/data_point/{tag}/text)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanyDataPointText)

<a name="getCompanyDataPointText"></a>
## **getCompanyDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanyDataPointText_v2)

[//]: # (START_OVERVIEW)

> String getCompanyDataPointText(identifier, tag)

#### Data Point (Text) for Company


Returns a text value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String tag = "ceo"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)

    try {
      String result = companyApi.getCompanyDataPointText(identifier, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanyDataPointText");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanyFilings)

[//]: # (RETURN_TYPE:ApiResponseCompanyFilings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseCompanyFilings.md)

[//]: # (OPERATION:getCompanyFilings_v2)

[//]: # (ENDPOINT:/companies/{identifier}/filings)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanyFilings)

<a name="getCompanyFilings"></a>
## **getCompanyFilings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanyFilings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseCompanyFilings getCompanyFilings(identifier, reportType, startDate, endDate, pageSize, nextPage)

#### All Filings by Company


Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String reportType = null; // String | Filter by <a href=\"/documentation/sec_filing_report_types\" target=\"_blank\">report type</a>. Separate values with commas to return multiple report types.
    LocalDate startDate = null; // LocalDate | Filed on or after the given date
    LocalDate endDate = null; // LocalDate | Filed before or after the given date
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseCompanyFilings result = companyApi.getCompanyFilings(identifier, reportType, startDate, endDate, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanyFilings");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **reportType** | String| Filter by &lt;a href&#x3D;\&quot;/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt;. Separate values with commas to return multiple report types. | [optional] &nbsp;
 **startDate** | LocalDate| Filed on or after the given date | [optional] &nbsp;
 **endDate** | LocalDate| Filed before or after the given date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseCompanyFilings**](ApiResponseCompanyFilings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanyFundamentals)

[//]: # (RETURN_TYPE:ApiResponseCompanyFundamentals)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseCompanyFundamentals.md)

[//]: # (OPERATION:getCompanyFundamentals_v2)

[//]: # (ENDPOINT:/companies/{identifier}/fundamentals)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanyFundamentals)

<a name="getCompanyFundamentals"></a>
## **getCompanyFundamentals**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanyFundamentals_v2)

[//]: # (START_OVERVIEW)

> ApiResponseCompanyFundamentals getCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, pageSize, nextPage)

#### All Fundamentals by Company


Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;. Returns Fundamentals matching parameters when supplied.

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    LocalDate filedAfter = null; // LocalDate | Filed on or after this date
    LocalDate filedBefore = null; // LocalDate | Filed on or before this date
    Boolean reportedOnly = false; // Boolean | Only as-reported fundamentals
    Integer fiscalYear = null; // Integer | Only for the given fiscal year
    String statementCode = null; // String | Only of the given statement code
    String type = null; // String | Only of the given type
    LocalDate startDate = null; // LocalDate | Only on or after the given date
    LocalDate endDate = null; // LocalDate | Only on or before the given date
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseCompanyFundamentals result = companyApi.getCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanyFundamentals");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **filedAfter** | LocalDate| Filed on or after this date | [optional] &nbsp;
 **filedBefore** | LocalDate| Filed on or before this date | [optional] &nbsp;
 **reportedOnly** | Boolean| Only as-reported fundamentals | [optional] &nbsp;
 **fiscalYear** | Integer| Only for the given fiscal year | [optional] &nbsp;
 **statementCode** | String| Only of the given statement code | [optional] [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations] &nbsp;
 **type** | String| Only of the given type | [optional] [enum: QTR, YTD, FY, TTM] &nbsp;
 **startDate** | LocalDate| Only on or after the given date | [optional] &nbsp;
 **endDate** | LocalDate| Only on or before the given date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseCompanyFundamentals**](ApiResponseCompanyFundamentals.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanyHistoricalData)

[//]: # (RETURN_TYPE:ApiResponseCompanyHistoricalData)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseCompanyHistoricalData.md)

[//]: # (OPERATION:getCompanyHistoricalData_v2)

[//]: # (ENDPOINT:/companies/{identifier}/historical_data/{tag})

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanyHistoricalData)

<a name="getCompanyHistoricalData"></a>
## **getCompanyHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanyHistoricalData_v2)

[//]: # (START_OVERVIEW)

> ApiResponseCompanyHistoricalData getCompanyHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage)

#### Historical Data for Company


Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String tag = "marketcap"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)
    String frequency = "daily"; // String | Return historical data in the given frequency
    String type = null; // String | Return historical data for given fiscal period type
    LocalDate startDate = null; // LocalDate | Return historical data on or after this date
    LocalDate endDate = null; // LocalDate | Return historical data on or before this date
    String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseCompanyHistoricalData result = companyApi.getCompanyHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanyHistoricalData");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
 **frequency** | String| Return historical data in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly] &nbsp;
 **type** | String| Return historical data for given fiscal period type | [optional] [enum: FY, QTR, TTM] &nbsp;
 **startDate** | LocalDate| Return historical data on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Return historical data on or before this date | [optional] &nbsp;
 **sortOrder** | String| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseCompanyHistoricalData**](ApiResponseCompanyHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanyIpos)

[//]: # (RETURN_TYPE:ApiResponseInitialPublicOfferings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseInitialPublicOfferings.md)

[//]: # (OPERATION:getCompanyIpos_v2)

[//]: # (ENDPOINT:/companies/ipos)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanyIpos)

<a name="getCompanyIpos"></a>
## **getCompanyIpos**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanyIpos_v2)

[//]: # (START_OVERVIEW)

> ApiResponseInitialPublicOfferings getCompanyIpos(ticker, status, startDate, endDate, offerAmountGreaterThan, offerAmountLessThan, pageSize, nextPage)

#### IPOs


Returns initial public offerings (IPOs). An IPO is a public offering of private company stock. The act of \&quot;going public\&quot; is initiated by an IPO, at which point the company&#39;s stock trades on a major stock exchange (such as NYSE or NASDAQ). Intrinio covers all upcoming and recent IPOs for US exchanges.

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

    CompanyApi companyApi = new CompanyApi();

    String ticker = null; // String | Return IPOs with the given ticker (typically the IPO for the company)
    String status = null; // String | Return IPOs with the given status. Upcoming IPOs are scheduled to occur in the future. Priced IPOs have occured and the company should be trading publicly. Withdrawn IPOs were planned to occurr but were withdrawn beforehand
    LocalDate startDate = null; // LocalDate | Return IPOs on or after the given date
    LocalDate endDate = null; // LocalDate | Return IPOs on or before the given date
    Integer offerAmountGreaterThan = null; // Integer | Return IPOs with an offer dollar amount greater than the given amount
    Integer offerAmountLessThan = null; // Integer | Return IPOs with an offer dollar amount less than the given amount
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseInitialPublicOfferings result = companyApi.getCompanyIpos(ticker, status, startDate, endDate, offerAmountGreaterThan, offerAmountLessThan, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanyIpos");
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
 **ticker** | String| Return IPOs with the given ticker (typically the IPO for the company) | [optional] &nbsp;
 **status** | String| Return IPOs with the given status. Upcoming IPOs are scheduled to occur in the future. Priced IPOs have occured and the company should be trading publicly. Withdrawn IPOs were planned to occurr but were withdrawn beforehand | [optional] [enum: upcoming, priced, withdrawn] &nbsp;
 **startDate** | LocalDate| Return IPOs on or after the given date | [optional] &nbsp;
 **endDate** | LocalDate| Return IPOs on or before the given date | [optional] &nbsp;
 **offerAmountGreaterThan** | Integer| Return IPOs with an offer dollar amount greater than the given amount | [optional] &nbsp;
 **offerAmountLessThan** | Integer| Return IPOs with an offer dollar amount less than the given amount | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseInitialPublicOfferings**](ApiResponseInitialPublicOfferings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanyNews)

[//]: # (RETURN_TYPE:ApiResponseCompanyNews)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseCompanyNews.md)

[//]: # (OPERATION:getCompanyNews_v2)

[//]: # (ENDPOINT:/companies/{identifier}/news)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanyNews)

<a name="getCompanyNews"></a>
## **getCompanyNews**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanyNews_v2)

[//]: # (START_OVERVIEW)

> ApiResponseCompanyNews getCompanyNews(identifier, pageSize, nextPage)

#### All News by Company


Returns news for the Company with the given &#x60;identifier&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseCompanyNews result = companyApi.getCompanyNews(identifier, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanyNews");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseCompanyNews**](ApiResponseCompanyNews.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:getCompanySecurities)

[//]: # (RETURN_TYPE:ApiResponseCompanySecurities)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseCompanySecurities.md)

[//]: # (OPERATION:getCompanySecurities_v2)

[//]: # (ENDPOINT:/companies/{identifier}/securities)

[//]: # (DOCUMENT_LINK:CompanyApi.md#getCompanySecurities)

<a name="getCompanySecurities"></a>
## **getCompanySecurities**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getCompanySecurities_v2)

[//]: # (START_OVERVIEW)

> ApiResponseCompanySecurities getCompanySecurities(identifier, nextPage)

#### All Securities by Company


Returns Securities for the Company with the given &#x60;identifier&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseCompanySecurities result = companyApi.getCompanySecurities(identifier, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#getCompanySecurities");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseCompanySecurities**](ApiResponseCompanySecurities.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:lookupCompanyFundamental)

[//]: # (RETURN_TYPE:Fundamental)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:Fundamental.md)

[//]: # (OPERATION:lookupCompanyFundamental_v2)

[//]: # (ENDPOINT:/companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period})

[//]: # (DOCUMENT_LINK:CompanyApi.md#lookupCompanyFundamental)

<a name="lookupCompanyFundamental"></a>
## **lookupCompanyFundamental**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/lookupCompanyFundamental_v2)

[//]: # (START_OVERVIEW)

> Fundamental lookupCompanyFundamental(identifier, statementCode, fiscalPeriod, fiscalYear)

#### Lookup Fundamental by Company


Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters

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

    CompanyApi companyApi = new CompanyApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String statementCode = "income_statement"; // String | The statement code
    String fiscalPeriod = "FY"; // String | The fiscal period
    Integer fiscalYear = 2017; // Integer | The fiscal year

    try {
      Fundamental result = companyApi.lookupCompanyFundamental(identifier, statementCode, fiscalPeriod, fiscalYear);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#lookupCompanyFundamental");
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
 **identifier** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **statementCode** | String| The statement code | [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations] &nbsp;
 **fiscalPeriod** | String| The fiscal period | [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD] &nbsp;
 **fiscalYear** | Integer| The fiscal year | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**Fundamental**](Fundamental.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:CompanyApi)

[//]: # (METHOD:searchCompanies)

[//]: # (RETURN_TYPE:ApiResponseCompaniesSearch)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseCompaniesSearch.md)

[//]: # (OPERATION:searchCompanies_v2)

[//]: # (ENDPOINT:/companies/search)

[//]: # (DOCUMENT_LINK:CompanyApi.md#searchCompanies)

<a name="searchCompanies"></a>
## **searchCompanies**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchCompanies_v2)

[//]: # (START_OVERVIEW)

> ApiResponseCompaniesSearch searchCompanies(query, pageSize)

#### Search Companies


Searches for Companies matching the text &#x60;query&#x60;

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

    CompanyApi companyApi = new CompanyApi();

    String query = "Apple"; // String | Search parameters
    Integer pageSize = 100; // Integer | The number of results to return

    try {
      ApiResponseCompaniesSearch result = companyApi.searchCompanies(query, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyApi#searchCompanies");
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
 **query** | String| Search parameters | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseCompaniesSearch**](ApiResponseCompaniesSearch.md)

[//]: # (END_OPERATION)

