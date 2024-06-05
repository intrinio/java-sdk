# FundamentalsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterFundamental**](FundamentalsApi.md#filterFundamental) | **GET** /fundamentals | Filter Fundamental
[**getFundamentalById**](FundamentalsApi.md#getFundamentalById) | **GET** /fundamentals/{id} | Fundamental by ID
[**getFundamentalReportedFinancials**](FundamentalsApi.md#getFundamentalReportedFinancials) | **GET** /fundamentals/{id}/reported_financials | Reported Financials
[**getFundamentalStandardizedFinancials**](FundamentalsApi.md#getFundamentalStandardizedFinancials) | **GET** /fundamentals/{id}/standardized_financials | Standardized Financials
[**getFundamentalStandardizedFinancialsDimensions**](FundamentalsApi.md#getFundamentalStandardizedFinancialsDimensions) | **GET** /fundamentals/{id}/standardized_financials/dimensions/{tag} | Standardized Financials Dimensions
[**lookupFundamental**](FundamentalsApi.md#lookupFundamental) | **GET** /fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period} | Lookup Fundamental



[//]: # (START_OPERATION)

[//]: # (CLASS:FundamentalsApi)

[//]: # (METHOD:filterFundamental)

[//]: # (RETURN_TYPE:Fundamental)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:Fundamental.md)

[//]: # (OPERATION:filterFundamental_v2)

[//]: # (ENDPOINT:/fundamentals)

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#filterFundamental)

<a name="filterFundamental"></a>
## **filterFundamental**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/filterFundamental_v2)

[//]: # (START_OVERVIEW)

> Fundamental filterFundamental(filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fiscalPeriod, startDate, endDate, updatedAfter, updatedBefore, template, nextPage)

#### Filter Fundamental


Returns fundamentals that meet the set of filters specified in parameters.

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();
    LocalDate filedAfter = LocalDate.of(2022,1,01);
    LocalDate filedBefore = LocalDate.of(2022,12,01);
    Boolean reportedOnly = false;
    Integer fiscalYear = 2017;
    String statementCode = null;
    String type = "false";
    String fiscalPeriod = "FY";
    LocalDate startDate = LocalDate.of(2022,1,01);
    LocalDate endDate = LocalDate.of(2022,12,01);
    LocalDate updatedAfter = LocalDate.of(2022,12,01);
    LocalDate updatedBefore = LocalDate.of(2022,12,01);
    String template = "indu";
    String nextPage = null;
    Fundamental result = fundamentalsApi.filterFundamental(filedAfter, filedBefore, reportedOnly, fiscalYear, statementCode, type, fiscalPeriod, startDate, endDate, updatedAfter, updatedBefore, template, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filedAfter** | LocalDate| Only include fundamentals that were filed on or after this date. | [optional] &nbsp;
 **filedBefore** | LocalDate| Only include fundamentals that were filed on or before this date. | [optional] &nbsp;
 **reportedOnly** | Boolean| Only as-reported fundamentals | [optional] &nbsp;
 **fiscalYear** | Integer| Only for the given fiscal year | [optional] &nbsp;
 **statementCode** | String| Only of the given statement code | [optional] [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations] &nbsp;
 **type** | String| Only of the given type | [optional] [enum: QTR, YTD, FY, TTM] &nbsp;
 **fiscalPeriod** | String| The fiscal period | [optional] [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD] &nbsp;
 **startDate** | LocalDate| Only include fundamentals where covered period is on or after this date. | [optional] &nbsp;
 **endDate** | LocalDate| Only include fundamentals where covered period is on or before this date. | [optional] &nbsp;
 **updatedAfter** | LocalDate| Only include fundamentals where it was updated after this date. | [optional] &nbsp;
 **updatedBefore** | LocalDate| Only include fundamentals where it was updated before this date. | [optional] &nbsp;
 **template** | String| The financial statement template used by Intrinio to standardize the as reported data | [optional] [enum: fin, indu] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**Fundamental**](Fundamental.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FundamentalsApi)

[//]: # (METHOD:getFundamentalById)

[//]: # (RETURN_TYPE:Fundamental)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:Fundamental.md)

[//]: # (OPERATION:getFundamentalById_v2)

[//]: # (ENDPOINT:/fundamentals/{id})

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#getFundamentalById)

<a name="getFundamentalById"></a>
## **getFundamentalById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getFundamentalById_v2)

[//]: # (START_OVERVIEW)

> Fundamental getFundamentalById(id)

#### Fundamental by ID


Returns a specific fundamental associated with a particular unique fundamental ID. Useful for pulling reference data for a specific fundamental.

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();
    String id = "fun_ge9LlE";
    Fundamental result = fundamentalsApi.getFundamentalById(id);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | String| The Intrinio ID for the Fundamental | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**Fundamental**](Fundamental.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FundamentalsApi)

[//]: # (METHOD:getFundamentalReportedFinancials)

[//]: # (RETURN_TYPE:ApiResponseReportedFinancials)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseReportedFinancials.md)

[//]: # (OPERATION:getFundamentalReportedFinancials_v2)

[//]: # (ENDPOINT:/fundamentals/{id}/reported_financials)

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#getFundamentalReportedFinancials)

<a name="getFundamentalReportedFinancials"></a>
## **getFundamentalReportedFinancials**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getFundamentalReportedFinancials_v2)

[//]: # (START_OVERVIEW)

> ApiResponseReportedFinancials getFundamentalReportedFinancials(id)

#### Reported Financials


Returns as-reported financial statement data for income statement, balance sheet, and cash flow statement. Data for income statement and cash flow statement is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();
    String id = "AAPL-income_statement-2018-Q1";
    ApiResponseReportedFinancials result = fundamentalsApi.getFundamentalReportedFinancials(id);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | String| The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseReportedFinancials**](ApiResponseReportedFinancials.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FundamentalsApi)

[//]: # (METHOD:getFundamentalStandardizedFinancials)

[//]: # (RETURN_TYPE:ApiResponseStandardizedFinancials)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStandardizedFinancials.md)

[//]: # (OPERATION:getFundamentalStandardizedFinancials_v2)

[//]: # (ENDPOINT:/fundamentals/{id}/standardized_financials)

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#getFundamentalStandardizedFinancials)

<a name="getFundamentalStandardizedFinancials"></a>
## **getFundamentalStandardizedFinancials**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getFundamentalStandardizedFinancials_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStandardizedFinancials getFundamentalStandardizedFinancials(id)

#### Standardized Financials


Returns standardized financial statement data for income statement, balance sheet, cash flow statement and over 100 associated calculations for a given company. Data for income statement, cash flow statement, and calculations is available on a FY, QTR (Q1, Q2, Q3, Q4), TTM (Q1TTM, Q2TTM, Q3TTM), and YTD (Q2YTD, Q3YTD) basis. Data for the balance sheet is available on a FY or QTR (Q1, Q2, Q3, Q4) basis only due its point-in-time nature.

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();
    String id = "AAPL-income_statement-2018-Q1";
    ApiResponseStandardizedFinancials result = fundamentalsApi.getFundamentalStandardizedFinancials(id);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | String| The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStandardizedFinancials**](ApiResponseStandardizedFinancials.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FundamentalsApi)

[//]: # (METHOD:getFundamentalStandardizedFinancialsDimensions)

[//]: # (RETURN_TYPE:ApiResponseStandardizedFinancialsDimensions)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseStandardizedFinancialsDimensions.md)

[//]: # (OPERATION:getFundamentalStandardizedFinancialsDimensions_v2)

[//]: # (ENDPOINT:/fundamentals/{id}/standardized_financials/dimensions/{tag})

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#getFundamentalStandardizedFinancialsDimensions)

<a name="getFundamentalStandardizedFinancialsDimensions"></a>
## **getFundamentalStandardizedFinancialsDimensions**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getFundamentalStandardizedFinancialsDimensions_v2)

[//]: # (START_OVERVIEW)

> ApiResponseStandardizedFinancialsDimensions getFundamentalStandardizedFinancialsDimensions(id, tag)

#### Standardized Financials Dimensions


Returns as reported dimensionality of a data tag

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();
    String id = "AAPL-income_statement-2020-FY";
    String tag = "ceo";
    ApiResponseStandardizedFinancialsDimensions result = fundamentalsApi.getFundamentalStandardizedFinancialsDimensions(id, tag);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | String| The Intrinio ID or lookup code (ticker-statement-year-period) for the Fundamental | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseStandardizedFinancialsDimensions**](ApiResponseStandardizedFinancialsDimensions.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FundamentalsApi)

[//]: # (METHOD:lookupFundamental)

[//]: # (RETURN_TYPE:Fundamental)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:Fundamental.md)

[//]: # (OPERATION:lookupFundamental_v2)

[//]: # (ENDPOINT:/fundamentals/lookup/{identifier}/{statement_code}/{fiscal_year}/{fiscal_period})

[//]: # (DOCUMENT_LINK:FundamentalsApi.md#lookupFundamental)

<a name="lookupFundamental"></a>
## **lookupFundamental**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/lookupFundamental_v2)

[//]: # (START_OVERVIEW)

> Fundamental lookupFundamental(identifier, statementCode, fiscalYear, fiscalPeriod)

#### Lookup Fundamental


Returns a specific fundamental with unique fundamental ID associated with a particular company, year, period and statement. Useful for pulling the unique fundamental ID and reference data for a specific fundamental.

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

    FundamentalsApi fundamentalsApi = new FundamentalsApi();
    String identifier = "AAPL";
    String statementCode = "income_statement";
    Integer fiscalYear = 2017;
    String fiscalPeriod = "FY";
    Fundamental result = fundamentalsApi.lookupFundamental(identifier, statementCode, fiscalYear, fiscalPeriod);
    System.out.println(result);
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
 **fiscalYear** | Integer| The fiscal year | &nbsp;
 **fiscalPeriod** | String| The fiscal period | [enum: Q1TTM, Q2TTM, Q3TTM, FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**Fundamental**](Fundamental.md)

[//]: # (END_OPERATION)

