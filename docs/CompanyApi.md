# CompanyApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterCompanies**](CompanyApi.md#filterCompanies) | **GET** /companies/filter | Filter Companies
[**filterCompanyFundamentals**](CompanyApi.md#filterCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals/filter | Filter Fundamentals for a Company
[**getAllCompanies**](CompanyApi.md#getAllCompanies) | **GET** /companies | Get All Companies
[**getAllCompanyFilings**](CompanyApi.md#getAllCompanyFilings) | **GET** /companies/{identifier}/filings | Filings
[**getAllCompanyFundamentals**](CompanyApi.md#getAllCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals | Get All Fundamentals for a Company
[**getCompany**](CompanyApi.md#getCompany) | **GET** /companies/{identifier} | Get a Company by ID
[**getCompanyDataPointNumber**](CompanyApi.md#getCompanyDataPointNumber) | **GET** /companies/{identifier}/data_point/{item}/number | Get Company Data Point (Number)
[**getCompanyDataPointText**](CompanyApi.md#getCompanyDataPointText) | **GET** /companies/{identifier}/data_point/{item}/text | Get Company Data Point (Text)
[**getCompanyHistoricalData**](CompanyApi.md#getCompanyHistoricalData) | **GET** /companies/{identifier}/historical_data/{item} | Get Company Historical Data
[**getNews**](CompanyApi.md#getNews) | **GET** /companies/{identifier}/news | News
[**lookupCompanyFundamental**](CompanyApi.md#lookupCompanyFundamental) | **GET** /companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup a Fundamental for a Company
[**searchCompanies**](CompanyApi.md#searchCompanies) | **GET** /companies/search | Search Companies


<a name="filterCompanies"></a>
# **filterCompanies**
> List&lt;CompanySummary&gt; filterCompanies(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage)

Filter Companies

Returns Companies matching the specified filters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

LocalDate lastFilingDate = new LocalDate(); // LocalDate | Last filing date
String sic = "sic_example"; // String | Standard Industrial Classification code
String template = "template_example"; // String | Template
String sector = "sector_example"; // String | Industry sector
String industryCategory = "industryCategory_example"; // String | Industry category
String industryGroup = "industryGroup_example"; // String | Industry group
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<CompanySummary> result = companyApi.filterCompanies(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#filterCompanies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastFilingDate** | **LocalDate**| Last filing date | [optional]
 **sic** | **String**| Standard Industrial Classification code | [optional]
 **template** | **String**| Template | [optional] [enum: industrial, financial]
 **sector** | **String**| Industry sector | [optional]
 **industryCategory** | **String**| Industry category | [optional]
 **industryGroup** | **String**| Industry group | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;CompanySummary&gt;**](CompanySummary.md)

<a name="filterCompanyFundamentals"></a>
# **filterCompanyFundamentals**
> List&lt;Fundamental&gt; filterCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage)

Filter Fundamentals for a Company

Returns Fundamentals for the Company with the given &#x60;identifier&#x60; and matching the specified filters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
LocalDate filedAfter = new LocalDate(); // LocalDate | Filed on or after this date
LocalDate filedBefore = new LocalDate(); // LocalDate | Filed on or before this date
Boolean reportedOnly = true; // Boolean | Only as-reported fundamentals
Integer fiscalYear = 56; // Integer | Only for the given fiscal year
String statementCode = "statementCode_example"; // String | Only of the given statement code
String type = "type_example"; // String | Only of the given type
LocalDate startDate = new LocalDate(); // LocalDate | Only on or after the given date
LocalDate endDate = new LocalDate(); // LocalDate | Only on or after the given date
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<Fundamental> result = companyApi.filterCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#filterCompanyFundamentals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **filedAfter** | **LocalDate**| Filed on or after this date | [optional]
 **filedBefore** | **LocalDate**| Filed on or before this date | [optional]
 **reportedOnly** | **Boolean**| Only as-reported fundamentals | [optional]
 **fiscalYear** | **Integer**| Only for the given fiscal year | [optional]
 **statementCode** | **String**| Only of the given statement code | [optional] [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations]
 **type** | **String**| Only of the given type | [optional] [enum: QTR, YTD, FY, TTM]
 **startDate** | **LocalDate**| Only on or after the given date | [optional]
 **endDate** | **LocalDate**| Only on or after the given date | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;Fundamental&gt;**](Fundamental.md)

<a name="getAllCompanies"></a>
# **getAllCompanies**
> List&lt;CompanySummary&gt; getAllCompanies(nextPage)

Get All Companies

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<CompanySummary> result = companyApi.getAllCompanies(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getAllCompanies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;CompanySummary&gt;**](CompanySummary.md)

<a name="getAllCompanyFilings"></a>
# **getAllCompanyFilings**
> List&lt;FilingSummary&gt; getAllCompanyFilings(identifier, nextPage)

Filings

Returns a complete list of SEC filings for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<FilingSummary> result = companyApi.getAllCompanyFilings(identifier, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getAllCompanyFilings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;FilingSummary&gt;**](FilingSummary.md)

<a name="getAllCompanyFundamentals"></a>
# **getAllCompanyFundamentals**
> List&lt;Fundamental&gt; getAllCompanyFundamentals(identifier, nextPage)

Get All Fundamentals for a Company

Returns all Fundamentals for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<Fundamental> result = companyApi.getAllCompanyFundamentals(identifier, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getAllCompanyFundamentals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;Fundamental&gt;**](Fundamental.md)

<a name="getCompany"></a>
# **getCompany**
> Company getCompany(identifier)

Get a Company by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)

try {
    Company result = companyApi.getCompany(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |

### Return type

[**Company**](Company.md)

<a name="getCompanyDataPointNumber"></a>
# **getCompanyDataPointNumber**
> BigDecimal getCompanyDataPointNumber(identifier, item)

Get Company Data Point (Number)

Returns a numeric value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag

try {
    BigDecimal result = companyApi.getCompanyDataPointNumber(identifier, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompanyDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **item** | **String**| An Intrinio data tag |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getCompanyDataPointText"></a>
# **getCompanyDataPointText**
> String getCompanyDataPointText(identifier, item)

Get Company Data Point (Text)

Returns a text value for the given &#x60;item&#x60; for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String item = "item_example"; // String | An Intrinio data tag

try {
    String result = companyApi.getCompanyDataPointText(identifier, item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompanyDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **item** | **String**| An Intrinio data tag |

### Return type

**String**

<a name="getCompanyHistoricalData"></a>
# **getCompanyHistoricalData**
> List&lt;HistoricalData&gt; getCompanyHistoricalData(identifier, item, type, startDate, endDate, sortOrder, nextPage)

Get Company Historical Data

Returns historical values for the given &#x60;item&#x60; and the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String item = "item_example"; // String | Item
String type = "type_example"; // String | Filter by type, when applicable
LocalDate startDate = new LocalDate(); // LocalDate | Get historical data on or after this date
LocalDate endDate = new LocalDate(); // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<HistoricalData> result = companyApi.getCompanyHistoricalData(identifier, item, type, startDate, endDate, sortOrder, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompanyHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **item** | **String**| Item |
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;HistoricalData&gt;**](HistoricalData.md)

<a name="getNews"></a>
# **getNews**
> List&lt;CompanyNews&gt; getNews(identifier, nextPage)

News

Returns news for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<CompanyNews> result = companyApi.getNews(identifier, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getNews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;CompanyNews&gt;**](CompanyNews.md)

<a name="lookupCompanyFundamental"></a>
# **lookupCompanyFundamental**
> List&lt;Fundamental&gt; lookupCompanyFundamental(identifier, statementCode, fiscalPeriod, fiscalYear)

Lookup a Fundamental for a Company

Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String statementCode = "statementCode_example"; // String | The statement code
String fiscalPeriod = "fiscalPeriod_example"; // String | The fiscal period
Integer fiscalYear = 56; // Integer | The fiscal year

try {
    List<Fundamental> result = companyApi.lookupCompanyFundamental(identifier, statementCode, fiscalPeriod, fiscalYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#lookupCompanyFundamental");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **statementCode** | **String**| The statement code | [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations]
 **fiscalPeriod** | **String**| The fiscal period | [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD]
 **fiscalYear** | **Integer**| The fiscal year |

### Return type

[**List&lt;Fundamental&gt;**](Fundamental.md)

<a name="searchCompanies"></a>
# **searchCompanies**
> List&lt;CompanySummary&gt; searchCompanies(query, nextPage)

Search Companies

Searches for Companies matching the text &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String query = "query_example"; // String | Search parameters
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<CompanySummary> result = companyApi.searchCompanies(query, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#searchCompanies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search parameters |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;CompanySummary&gt;**](CompanySummary.md)

