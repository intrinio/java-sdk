# FundamentalsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundamentalById**](FundamentalsApi.md#getFundamentalById) | **GET** /fundamentals/{id} | Get a Fundamental by ID
[**getFundamentalReportedFinancials**](FundamentalsApi.md#getFundamentalReportedFinancials) | **GET** /fundamentals/{id}/reported_financials | Get Reported Financials for a Fundamental
[**getFundamentalStandardizedFinancials**](FundamentalsApi.md#getFundamentalStandardizedFinancials) | **GET** /fundamentals/{id}/standardized_financials | Get Standardized Financials for a Fundamental
[**lookupFundamental**](FundamentalsApi.md#lookupFundamental) | **GET** /fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup a Fundamental


<a name="getFundamentalById"></a>
# **getFundamentalById**
> Fundamental getFundamentalById(id)

Get a Fundamental by ID

Retrieves detailed fundamental data for the given &#x60;fundamental_id&#x60;.

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FundamentalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FundamentalsApi fundamentalsApi = new FundamentalsApi();

String id = "id_example"; // String | The Intrinio ID for the Fundamental

try {
    Fundamental result = fundamentalsApi.getFundamentalById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundamentalsApi#getFundamentalById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID for the Fundamental |

### Return type

[**Fundamental**](Fundamental.md)

<a name="getFundamentalReportedFinancials"></a>
# **getFundamentalReportedFinancials**
> ApiResponseReportedFinancials getFundamentalReportedFinancials(id)

Get Reported Financials for a Fundamental

Returns the As-Reported Financials directly from the financial statements of the XBRL filings from the company

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FundamentalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FundamentalsApi fundamentalsApi = new FundamentalsApi();

String id = "id_example"; // String | The Intrinio ID for the Fundamental

try {
    ApiResponseReportedFinancials result = fundamentalsApi.getFundamentalReportedFinancials(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundamentalsApi#getFundamentalReportedFinancials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID for the Fundamental |

### Return type

[**ApiResponseReportedFinancials**](ApiResponseReportedFinancials.md)

<a name="getFundamentalStandardizedFinancials"></a>
# **getFundamentalStandardizedFinancials**
> ApiResponseStandardizedFinancials getFundamentalStandardizedFinancials(id)

Get Standardized Financials for a Fundamental

Returns professional-grade historical financial data. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as reported financial statements because of the inherent complexity of reporting standards.

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FundamentalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FundamentalsApi fundamentalsApi = new FundamentalsApi();

String id = "id_example"; // String | The Intrinio ID for the Fundamental

try {
    ApiResponseStandardizedFinancials result = fundamentalsApi.getFundamentalStandardizedFinancials(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundamentalsApi#getFundamentalStandardizedFinancials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID for the Fundamental |

### Return type

[**ApiResponseStandardizedFinancials**](ApiResponseStandardizedFinancials.md)

<a name="lookupFundamental"></a>
# **lookupFundamental**
> List&lt;Fundamental&gt; lookupFundamental(identifier, statementCode, fiscalPeriod, fiscalYear)

Lookup a Fundamental

Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FundamentalsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FundamentalsApi fundamentalsApi = new FundamentalsApi();

String identifier = "identifier_example"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
String statementCode = "statementCode_example"; // String | The statement code
String fiscalPeriod = "fiscalPeriod_example"; // String | The fiscal period
Integer fiscalYear = 56; // Integer | The fiscal year

try {
    List<Fundamental> result = fundamentalsApi.lookupFundamental(identifier, statementCode, fiscalPeriod, fiscalYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FundamentalsApi#lookupFundamental");
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

