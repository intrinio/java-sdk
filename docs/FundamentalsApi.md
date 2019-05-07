# FundamentalsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundamentalById**](FundamentalsApi.md#getFundamentalById) | **GET** /fundamentals/{id} | Fundamental by ID
[**getFundamentalReportedFinancials**](FundamentalsApi.md#getFundamentalReportedFinancials) | **GET** /fundamentals/{id}/reported_financials | Reported Financials
[**getFundamentalStandardizedFinancials**](FundamentalsApi.md#getFundamentalStandardizedFinancials) | **GET** /fundamentals/{id}/standardized_financials | Standardized Financials
[**lookupFundamental**](FundamentalsApi.md#lookupFundamental) | **GET** /fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup Fundamental



[//]: # (START_OPERATION)

[//]: # (OPERATION:getFundamentalById_v2)

[//]: # (ENDPOINT:/fundamentals/{id})

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#getFundamentalById)

<a name="getFundamentalById"></a>
## **getFundamentalById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getFundamentalById_v2)

> Fundamental getFundamentalById(id)

#### Fundamental by ID


Returns detailed fundamental data for the given &#x60;id&#x60;.

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();

    String id = "fun_ge9LlE"; // String | The Intrinio ID for the Fundamental

    try {
        Fundamental result = fundamentalsApi.getFundamentalById(id);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FundamentalsApi#getFundamentalById");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID for the Fundamental |
<br/>

### Return type

[**Fundamental**](Fundamental.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (OPERATION:getFundamentalReportedFinancials_v2)

[//]: # (ENDPOINT:/fundamentals/{id}/reported_financials)

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#getFundamentalReportedFinancials)

<a name="getFundamentalReportedFinancials"></a>
## **getFundamentalReportedFinancials**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getFundamentalReportedFinancials_v2)

> ApiResponseReportedFinancials getFundamentalReportedFinancials(id)

#### Reported Financials


Returns the As-Reported Financials directly from the financial statements of the XBRL filings from the company

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();

    String id = "AAPL-income_statement-2018-Q1"; // String | The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental

    try {
        ApiResponseReportedFinancials result = fundamentalsApi.getFundamentalReportedFinancials(id);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FundamentalsApi#getFundamentalReportedFinancials");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental |
<br/>

### Return type

[**ApiResponseReportedFinancials**](ApiResponseReportedFinancials.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (OPERATION:getFundamentalStandardizedFinancials_v2)

[//]: # (ENDPOINT:/fundamentals/{id}/standardized_financials)

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#getFundamentalStandardizedFinancials)

<a name="getFundamentalStandardizedFinancials"></a>
## **getFundamentalStandardizedFinancials**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getFundamentalStandardizedFinancials_v2)

> ApiResponseStandardizedFinancials getFundamentalStandardizedFinancials(id)

#### Standardized Financials


Returns professional-grade historical financial data. This data is standardized, cleansed and verified to ensure the highest quality data sourced directly from the XBRL financial statements. The primary purpose of standardized financials are to facilitate comparability across a single company’s fundamentals and across all companies fundamentals. For example, it is possible to compare total revenues between two companies as of a certain point in time, or within a single company across multiple time periods. This is not possible using the as reported financial statements because of the inherent complexity of reporting standards.

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();

    String id = "AAPL-income_statement-2018-Q1"; // String | The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental

    try {
        ApiResponseStandardizedFinancials result = fundamentalsApi.getFundamentalStandardizedFinancials(id);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FundamentalsApi#getFundamentalStandardizedFinancials");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental |
<br/>

### Return type

[**ApiResponseStandardizedFinancials**](ApiResponseStandardizedFinancials.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (OPERATION:lookupFundamental_v2)

[//]: # (ENDPOINT:/fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period})

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#lookupFundamental)

<a name="lookupFundamental"></a>
## **lookupFundamental**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/lookupFundamental_v2)

> Fundamental lookupFundamental(identifier, statementCode, fiscalYear, fiscalPeriod)

#### Lookup Fundamental


Returns the Fundamental for the Company with the given &#x60;identifier&#x60; and with the given parameters

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();

    String identifier = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String statementCode = "income_statement"; // String | The statement code
    Integer fiscalYear = 2017; // Integer | The fiscal year
    String fiscalPeriod = "FY"; // String | The fiscal period

    try {
        Fundamental result = fundamentalsApi.lookupFundamental(identifier, statementCode, fiscalYear, fiscalPeriod);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling FundamentalsApi#lookupFundamental");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) |
 **statementCode** | **String**| The statement code | [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations]
 **fiscalYear** | **Integer**| The fiscal year |
 **fiscalPeriod** | **String**| The fiscal period | [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD]
<br/>

### Return type

[**Fundamental**](Fundamental.md)

[//]: # (END_OPERATION)

