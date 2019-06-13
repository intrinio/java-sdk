# FilingApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllFilings**](FilingApi.md#getAllFilings) | **GET** /filings | All Filings
[**getAllNotes**](FilingApi.md#getAllNotes) | **GET** /filings/notes | All Filing Notes
[**getFilingById**](FilingApi.md#getFilingById) | **GET** /filings/{id} | Lookup Filing
[**getFilingFundamentals**](FilingApi.md#getFilingFundamentals) | **GET** /filings/{identifier}/fundamentals | All Fundamentals by Filing
[**getNote**](FilingApi.md#getNote) | **GET** /filings/notes/{identifier} | Filing Note by ID
[**getNoteHtml**](FilingApi.md#getNoteHtml) | **GET** /filings/notes/{identifier}/html | Filing Note HTML
[**getNoteText**](FilingApi.md#getNoteText) | **GET** /filings/notes/{identifier}/text | Filing Note Text
[**searchNotes**](FilingApi.md#searchNotes) | **GET** /filings/notes/search | Search Filing Notes



[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:getAllFilings)

[//]: # (RETURN_TYPE:ApiResponseFilings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseFilings.md)

[//]: # (OPERATION:getAllFilings_v2)

[//]: # (ENDPOINT:/filings)

[//]: # (DOCUMENT_LINK:FilingApi.md#getAllFilings)

<a name="getAllFilings"></a>
## **getAllFilings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllFilings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseFilings getAllFilings(company, reportType, startDate, endDate, pageSize, nextPage)

#### All Filings


Returns all Filings. Returns Filings matching parameters when supplied.

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

    FilingApi filingApi = new FilingApi();

    String company = "AAPL"; // String | Filings for the given `company` identifier (ticker, CIK, LEI, Intrinio ID)
    String reportType = null; // String | Filter by report type. Separate values with commas to return multiple The filing <a href=\"/documentation/sec_filing_report_types\" target=\"_blank\">report types</a>.
    LocalDate startDate = null; // LocalDate | Filed on or after the given date
    LocalDate endDate = null; // LocalDate | Filed before or after the given date
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseFilings result = filingApi.getAllFilings(company, reportType, startDate, endDate, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#getAllFilings");
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
 **company** | String| Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) | &nbsp;
 **reportType** | String| Filter by report type. Separate values with commas to return multiple The filing &lt;a href&#x3D;\&quot;/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report types&lt;/a&gt;. | [optional] &nbsp;
 **startDate** | LocalDate| Filed on or after the given date | [optional] &nbsp;
 **endDate** | LocalDate| Filed before or after the given date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseFilings**](ApiResponseFilings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:getAllNotes)

[//]: # (RETURN_TYPE:ApiResponseFilingNotes)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseFilingNotes.md)

[//]: # (OPERATION:getAllNotes_v2)

[//]: # (ENDPOINT:/filings/notes)

[//]: # (DOCUMENT_LINK:FilingApi.md#getAllNotes)

<a name="getAllNotes"></a>
## **getAllNotes**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllNotes_v2)

[//]: # (START_OVERVIEW)

> ApiResponseFilingNotes getAllNotes(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage)

#### All Filing Notes


Return all Notes from all Filings, most-recent first. Returns notes matching parameters when supplied.

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

    FilingApi filingApi = new FilingApi();

    String company = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String reportType = "10-Q"; // String | Notes contained in filings that match the given <a href=\"/documentation/sec_filing_report_types\" target=\"_blank\">report type</a>
    LocalDate filingStartDate = null; // LocalDate | Limit search to filings on or after this date
    LocalDate filingEndDate = null; // LocalDate | Limit search to filings on or before this date
    LocalDate periodEndedStartDate = null; // LocalDate | Limit search to filings with a period end date on or after this date
    LocalDate periodEndedEndDate = null; // LocalDate | Limit search to filings with a period end date on or before this date
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseFilingNotes result = filingApi.getAllNotes(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#getAllNotes");
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
 **company** | String| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | [optional] &nbsp;
 **reportType** | String| Notes contained in filings that match the given &lt;a href&#x3D;\&quot;/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt; | [optional] [enum: 10-Q, 10-K] &nbsp;
 **filingStartDate** | LocalDate| Limit search to filings on or after this date | [optional] &nbsp;
 **filingEndDate** | LocalDate| Limit search to filings on or before this date | [optional] &nbsp;
 **periodEndedStartDate** | LocalDate| Limit search to filings with a period end date on or after this date | [optional] &nbsp;
 **periodEndedEndDate** | LocalDate| Limit search to filings with a period end date on or before this date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseFilingNotes**](ApiResponseFilingNotes.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:getFilingById)

[//]: # (RETURN_TYPE:Filing)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:Filing.md)

[//]: # (OPERATION:getFilingById_v2)

[//]: # (ENDPOINT:/filings/{id})

[//]: # (DOCUMENT_LINK:FilingApi.md#getFilingById)

<a name="getFilingById"></a>
## **getFilingById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getFilingById_v2)

[//]: # (START_OVERVIEW)

> Filing getFilingById(id)

#### Lookup Filing


Returns the Filing with the given &#x60;identifier&#x60;

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

    FilingApi filingApi = new FilingApi();

    String id = "fil_7Kn2P6"; // String | The Intrinio ID of the Filing

    try {
      Filing result = filingApi.getFilingById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#getFilingById");
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
 **id** | String| The Intrinio ID of the Filing | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**Filing**](Filing.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:getFilingFundamentals)

[//]: # (RETURN_TYPE:ApiResponseFilingFundamentals)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseFilingFundamentals.md)

[//]: # (OPERATION:getFilingFundamentals_v2)

[//]: # (ENDPOINT:/filings/{identifier}/fundamentals)

[//]: # (DOCUMENT_LINK:FilingApi.md#getFilingFundamentals)

<a name="getFilingFundamentals"></a>
## **getFilingFundamentals**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getFilingFundamentals_v2)

[//]: # (START_OVERVIEW)

> ApiResponseFilingFundamentals getFilingFundamentals(identifier, statementCode, type, fiscalYear, fiscalPeriod, startDate, endDate, nextPage)

#### All Fundamentals by Filing


Returns all Fundamentals for the SEC Filing with the given &#x60;identifier&#x60;. Returns Fundamentals matching parameters when supplied.

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

    FilingApi filingApi = new FilingApi();

    String identifier = "fil_B73xBG"; // String | A Filing identifier
    String statementCode = null; // String | Filters fundamentals by statement code
    String type = null; // String | Filters fundamentals by type
    Integer fiscalYear = null; // Integer | Filters fundamentals by fiscal year
    String fiscalPeriod = null; // String | Filters fundamentals by fiscal period
    LocalDate startDate = null; // LocalDate | Returns fundamentals on or after the given date
    LocalDate endDate = null; // LocalDate | Returns fundamentals on or before the given date
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseFilingFundamentals result = filingApi.getFilingFundamentals(identifier, statementCode, type, fiscalYear, fiscalPeriod, startDate, endDate, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#getFilingFundamentals");
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
 **identifier** | String| A Filing identifier | &nbsp;
 **statementCode** | String| Filters fundamentals by statement code | [optional] [enum: income_statement, balance_sheet_statement, cash_flow_statement, calculations] &nbsp;
 **type** | String| Filters fundamentals by type | [optional] [enum: QTR, YTD, FY, TTM] &nbsp;
 **fiscalYear** | Integer| Filters fundamentals by fiscal year | [optional] &nbsp;
 **fiscalPeriod** | String| Filters fundamentals by fiscal period | [optional] [enum: FY, Q1, Q2, Q3, Q4, Q2YTD, Q3YTD, Q1TTM, Q2TTM, Q3TTM] &nbsp;
 **startDate** | LocalDate| Returns fundamentals on or after the given date | [optional] &nbsp;
 **endDate** | LocalDate| Returns fundamentals on or before the given date | [optional] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseFilingFundamentals**](ApiResponseFilingFundamentals.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:getNote)

[//]: # (RETURN_TYPE:FilingNote)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:FilingNote.md)

[//]: # (OPERATION:getNote_v2)

[//]: # (ENDPOINT:/filings/notes/{identifier})

[//]: # (DOCUMENT_LINK:FilingApi.md#getNote)

<a name="getNote"></a>
## **getNote**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getNote_v2)

[//]: # (START_OVERVIEW)

> FilingNote getNote(identifier, contentFormat)

#### Filing Note by ID



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

    FilingApi filingApi = new FilingApi();

    String identifier = "xbn_3fghz"; // String | The Intrinio ID of the filing note
    String contentFormat = "text"; // String | Returns content in html (as filed) or plain text

    try {
      FilingNote result = filingApi.getNote(identifier, contentFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#getNote");
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
 **identifier** | String| The Intrinio ID of the filing note | &nbsp;
 **contentFormat** | String| Returns content in html (as filed) or plain text | [optional] [default to text] [enum: text, html] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**FilingNote**](FilingNote.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:getNoteHtml)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getNoteHtml_v2)

[//]: # (ENDPOINT:/filings/notes/{identifier}/html)

[//]: # (DOCUMENT_LINK:FilingApi.md#getNoteHtml)

<a name="getNoteHtml"></a>
## **getNoteHtml**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getNoteHtml_v2)

[//]: # (START_OVERVIEW)

> String getNoteHtml(identifier)

#### Filing Note HTML



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

    FilingApi filingApi = new FilingApi();

    String identifier = "xbn_3fghz"; // String | The Intrinio ID of the filing note

    try {
      String result = filingApi.getNoteHtml(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#getNoteHtml");
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
 **identifier** | String| The Intrinio ID of the filing note | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:getNoteText)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getNoteText_v2)

[//]: # (ENDPOINT:/filings/notes/{identifier}/text)

[//]: # (DOCUMENT_LINK:FilingApi.md#getNoteText)

<a name="getNoteText"></a>
## **getNoteText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getNoteText_v2)

[//]: # (START_OVERVIEW)

> String getNoteText(identifier)

#### Filing Note Text



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

    FilingApi filingApi = new FilingApi();

    String identifier = "xbn_3fghz"; // String | The Intrinio ID of the filing note

    try {
      String result = filingApi.getNoteText(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#getNoteText");
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
 **identifier** | String| The Intrinio ID of the filing note | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:FilingApi)

[//]: # (METHOD:searchNotes)

[//]: # (RETURN_TYPE:ApiResponseFilingNotesSearch)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseFilingNotesSearch.md)

[//]: # (OPERATION:searchNotes_v2)

[//]: # (ENDPOINT:/filings/notes/search)

[//]: # (DOCUMENT_LINK:FilingApi.md#searchNotes)

<a name="searchNotes"></a>
## **searchNotes**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchNotes_v2)

[//]: # (START_OVERVIEW)

> ApiResponseFilingNotesSearch searchNotes(query, filingStartDate, filingEndDate, pageSize, pageSize2)

#### Search Filing Notes


Searches for Filing Notes using the &#x60;query&#x60;

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

    FilingApi filingApi = new FilingApi();

    String query = "inflation"; // String | Search for notes that contain all or parts of this text
    LocalDate filingStartDate = null; // LocalDate | Limit search to filings on or after this date
    LocalDate filingEndDate = null; // LocalDate | Limit search to filings on or before this date
    Integer pageSize = 100; // Integer | The number of results to return
    Integer pageSize2 = 100; // Integer | The number of results to return

    try {
      ApiResponseFilingNotesSearch result = filingApi.searchNotes(query, filingStartDate, filingEndDate, pageSize, pageSize2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilingApi#searchNotes");
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
 **query** | String| Search for notes that contain all or parts of this text | &nbsp;
 **filingStartDate** | LocalDate| Limit search to filings on or after this date | [optional] &nbsp;
 **filingEndDate** | LocalDate| Limit search to filings on or before this date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **pageSize2** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseFilingNotesSearch**](ApiResponseFilingNotesSearch.md)

[//]: # (END_OPERATION)

