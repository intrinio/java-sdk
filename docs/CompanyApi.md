# CompanyApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterCompanies**](CompanyApi.md#filterCompanies) | **GET** /companies/filter | Filter Companies
[**filterCompanyFundamentals**](CompanyApi.md#filterCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals/filter | Filter Fundamentals by Company
[**getAllCompanies**](CompanyApi.md#getAllCompanies) | **GET** /companies | All Companies
[**getAllCompanyNews**](CompanyApi.md#getAllCompanyNews) | **GET** /companies/news | All News
[**getCompany**](CompanyApi.md#getCompany) | **GET** /companies/{identifier} | Lookup Company
[**getCompanyDataPointNumber**](CompanyApi.md#getCompanyDataPointNumber) | **GET** /companies/{identifier}/data_point/{tag}/number | Data Point (Number) for Company
[**getCompanyDataPointText**](CompanyApi.md#getCompanyDataPointText) | **GET** /companies/{identifier}/data_point/{tag}/text | Data Point (Text) for Company
[**getCompanyFilings**](CompanyApi.md#getCompanyFilings) | **GET** /companies/{identifier}/filings | All Filings by Company
[**getCompanyFundamentals**](CompanyApi.md#getCompanyFundamentals) | **GET** /companies/{identifier}/fundamentals | All Fundamentals by Company
[**getCompanyHistoricalData**](CompanyApi.md#getCompanyHistoricalData) | **GET** /companies/{identifier}/historical_data/{tag} | Historical Data for Company
[**getCompanyNews**](CompanyApi.md#getCompanyNews) | **GET** /companies/{identifier}/news | All News by Company
[**getCompanySecurities**](CompanyApi.md#getCompanySecurities) | **GET** /companies/{identifier}/securities | All Securities by Company
[**lookupCompanyFundamental**](CompanyApi.md#lookupCompanyFundamental) | **GET** /companies/{identifier}/fundamentals/lookup/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup Fundamental by Company
[**searchCompanies**](CompanyApi.md#searchCompanies) | **GET** /companies/search | Search Companies


<a name="filterCompanies"></a>
# **filterCompanies**
> ApiResponseCompanies filterCompanies(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

LocalDate lastFilingDate = null; // LocalDate | Last filing date
String sic = "3350"; // String | Standard Industrial Classification code
String template = "industrial"; // String | Template
String sector = "Basic Materials"; // String | Industry sector
String industryCategory = "Metals & Mining"; // String | Industry category
String industryGroup = "Aluminum"; // String | Industry group
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseCompanies result = companyApi.filterCompanies(lastFilingDate, sic, template, sector, industryCategory, industryGroup, nextPage);
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

[**ApiResponseCompanies**](ApiResponseCompanies.md)

<a name="filterCompanyFundamentals"></a>
# **filterCompanyFundamentals**
> ApiResponseCompanyFundamentals filterCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage)

Filter Fundamentals by Company

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
LocalDate filedAfter = null; // LocalDate | Filed on or after this date
LocalDate filedBefore = null; // LocalDate | Filed on or before this date
Boolean reportedOnly = false; // Boolean | Only as-reported fundamentals
Integer fiscalYear = 2017; // Integer | Only for the given fiscal year
String statementCode = null; // String | Only of the given statement code
String type = null; // String | Only of the given type
LocalDate startDate = null; // LocalDate | Only on or after the given date
LocalDate endDate = null; // LocalDate | Only on or before the given date
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseCompanyFundamentals result = companyApi.filterCompanyFundamentals(identifier, filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, startDate, endDate, nextPage);
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
 **endDate** | **LocalDate**| Only on or before the given date | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCompanyFundamentals**](ApiResponseCompanyFundamentals.md)

<a name="getAllCompanies"></a>
# **getAllCompanies**
> ApiResponseCompanies getAllCompanies(nextPage)

All Companies

Returns all Companies

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseCompanies result = companyApi.getAllCompanies(nextPage);
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

[**ApiResponseCompanies**](ApiResponseCompanies.md)

<a name="getAllCompanyNews"></a>
# **getAllCompanyNews**
> ApiResponseNews getAllCompanyNews(nextPage)

All News

Returns all News for all Companies

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseNews result = companyApi.getAllCompanyNews(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getAllCompanyNews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseNews**](ApiResponseNews.md)

<a name="getCompany"></a>
# **getCompany**
> Company getCompany(identifier)

Lookup Company

Returns the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)

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
> BigDecimal getCompanyDataPointNumber(identifier, tag)

Data Point (Number) for Company

Returns a numeric value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String tag = "marketcap"; // String | An Intrinio data tag

try {
    BigDecimal result = companyApi.getCompanyDataPointNumber(identifier, tag);
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
 **tag** | **String**| An Intrinio data tag |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getCompanyDataPointText"></a>
# **getCompanyDataPointText**
> String getCompanyDataPointText(identifier, tag)

Data Point (Text) for Company

Returns a text value for the given &#x60;tag&#x60; for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String tag = "marketcap"; // String | An Intrinio data tag

try {
    String result = companyApi.getCompanyDataPointText(identifier, tag);
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
 **tag** | **String**| An Intrinio data tag |

### Return type

**String**

<a name="getCompanyFilings"></a>
# **getCompanyFilings**
> ApiResponseCompanyFilings getCompanyFilings(identifier, nextPage)

All Filings by Company

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseCompanyFilings result = companyApi.getCompanyFilings(identifier, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompanyFilings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCompanyFilings**](ApiResponseCompanyFilings.md)

<a name="getCompanyFundamentals"></a>
# **getCompanyFundamentals**
> ApiResponseCompanyFundamentals getCompanyFundamentals(identifier, nextPage)

All Fundamentals by Company

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseCompanyFundamentals result = companyApi.getCompanyFundamentals(identifier, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompanyFundamentals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCompanyFundamentals**](ApiResponseCompanyFundamentals.md)

<a name="getCompanyHistoricalData"></a>
# **getCompanyHistoricalData**
> ApiResponseCompanyHistoricalData getCompanyHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, nextPage)

Historical Data for Company

Returns historical values for the given &#x60;tag&#x60; and the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String tag = "marketcap"; // String | An Intrinio data-tag
String frequency = "daily"; // String | Return historical data in the given frequency
String type = null; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical data on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseCompanyHistoricalData result = companyApi.getCompanyHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, nextPage);
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
 **tag** | **String**| An Intrinio data-tag |
 **frequency** | **String**| Return historical data in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly]
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical data on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCompanyHistoricalData**](ApiResponseCompanyHistoricalData.md)

<a name="getCompanyNews"></a>
# **getCompanyNews**
> ApiResponseCompanyNews getCompanyNews(identifier, nextPage)

All News by Company

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseCompanyNews result = companyApi.getCompanyNews(identifier, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getCompanyNews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCompanyNews**](ApiResponseCompanyNews.md)

<a name="getCompanySecurities"></a>
# **getCompanySecurities**
> ApiResponseCompanySecurities getCompanySecurities(identifier, nextPage)

All Securities by Company

Returns Securities for the Company with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.CompanyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCompanySecurities**](ApiResponseCompanySecurities.md)

<a name="lookupCompanyFundamental"></a>
# **lookupCompanyFundamental**
> Fundamental lookupCompanyFundamental(identifier, statementCode, fiscalPeriod, fiscalYear)

Lookup Fundamental by Company

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **statementCode** | **String**| The statement code | [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations]
 **fiscalPeriod** | **String**| The fiscal period | [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD]
 **fiscalYear** | **Integer**| The fiscal year |

### Return type

[**Fundamental**](Fundamental.md)

<a name="searchCompanies"></a>
# **searchCompanies**
> ApiResponseCompanies searchCompanies(query)

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
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

CompanyApi companyApi = new CompanyApi();

String query = "Apple"; // String | Search parameters

try {
    ApiResponseCompanies result = companyApi.searchCompanies(query);
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

### Return type

[**ApiResponseCompanies**](ApiResponseCompanies.md)

