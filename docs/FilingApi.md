# FilingApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllFilings**](FilingApi.md#getAllFilings) | **GET** /filings | All Filings
[**getAllNotes**](FilingApi.md#getAllNotes) | **GET** /filings/notes | All Filing Notes
[**getFilingById**](FilingApi.md#getFilingById) | **GET** /filings/{id} | Lookup Filing
[**getNote**](FilingApi.md#getNote) | **GET** /filings/notes/{identifier} | Filing Note by ID
[**getNoteHtml**](FilingApi.md#getNoteHtml) | **GET** /filings/notes/{identifier}/html | Filing Note HTML
[**getNoteText**](FilingApi.md#getNoteText) | **GET** /filings/notes/{identifier}/text | Filing Note Text
[**searchNotes**](FilingApi.md#searchNotes) | **GET** /filings/notes/search | Search Filing Notes


<a name="getAllFilings"></a>
# **getAllFilings**
> ApiResponseFilings getAllFilings(company, reportType, startDate, endDate, pageSize, nextPage)

All Filings

Returns all Filings. Returns Filings matching parameters when supplied.

### Example
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

    FilingApi filingApi = new FilingApi();

    String company = "AAPL"; // String | Filings for the given `company` identifier (ticker, CIK, LEI, Intrinio ID)
    String reportType = null; // String | Filter by report type
    LocalDate startDate = null; // LocalDate | Filed on or after the given date
    LocalDate endDate = null; // LocalDate | Filed before or after the given date
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | **String**| Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) |
 **reportType** | **String**| Filter by report type | [optional]
 **startDate** | **LocalDate**| Filed on or after the given date | [optional]
 **endDate** | **LocalDate**| Filed before or after the given date | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseFilings**](ApiResponseFilings.md)

<a name="getAllNotes"></a>
# **getAllNotes**
> ApiResponseFilingNotes getAllNotes(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, pageSize, nextPage)

All Filing Notes

Return all Notes from all Filings, most-recent first. Returns notes matching parameters when supplied.

### Example
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

    FilingApi filingApi = new FilingApi();

    String company = "AAPL"; // String | A Company identifier (Ticker, CIK, LEI, Intrinio ID)
    String reportType = "10-Q"; // String | Notes contained in filings that match the given report type
    LocalDate filingStartDate = null; // LocalDate | Limit search to filings on or after this date
    LocalDate filingEndDate = null; // LocalDate | Limit search to filings on or before this date
    LocalDate periodEndedStartDate = null; // LocalDate | Limit search to filings with a period end date on or after this date
    LocalDate periodEndedEndDate = null; // LocalDate | Limit search to filings with a period end date on or before this date
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | **String**| A Company identifier (Ticker, CIK, LEI, Intrinio ID) | [optional]
 **reportType** | **String**| Notes contained in filings that match the given report type | [optional] [enum: 10-Q, 10-K]
 **filingStartDate** | **LocalDate**| Limit search to filings on or after this date | [optional]
 **filingEndDate** | **LocalDate**| Limit search to filings on or before this date | [optional]
 **periodEndedStartDate** | **LocalDate**| Limit search to filings with a period end date on or after this date | [optional]
 **periodEndedEndDate** | **LocalDate**| Limit search to filings with a period end date on or before this date | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseFilingNotes**](ApiResponseFilingNotes.md)

<a name="getFilingById"></a>
# **getFilingById**
> Filing getFilingById(id)

Lookup Filing

Returns the Filing with the given &#x60;identifier&#x60;

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Intrinio ID of the Filing |

### Return type

[**Filing**](Filing.md)

<a name="getNote"></a>
# **getNote**
> FilingNote getNote(identifier, contentFormat)

Filing Note by ID

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The Intrinio ID of the filing note |
 **contentFormat** | **String**| Returns content in html (as filed) or plain text | [optional] [default to text] [enum: text, html]

### Return type

[**FilingNote**](FilingNote.md)

<a name="getNoteHtml"></a>
# **getNoteHtml**
> String getNoteHtml(identifier)

Filing Note HTML

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The Intrinio ID of the filing note |

### Return type

**String**

<a name="getNoteText"></a>
# **getNoteText**
> String getNoteText(identifier)

Filing Note Text

### Example
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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The Intrinio ID of the filing note |

### Return type

**String**

<a name="searchNotes"></a>
# **searchNotes**
> ApiResponseFilingNotesSearch searchNotes(query, filingStartDate, filingEndDate, pageSize, pageSize2)

Search Filing Notes

Searches for Filing Notes using the &#x60;query&#x60;

### Example
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

    FilingApi filingApi = new FilingApi();

    String query = "inflation"; // String | Search for notes that contain all or parts of this text
    LocalDate filingStartDate = null; // LocalDate | Limit search to filings on or after this date
    LocalDate filingEndDate = null; // LocalDate | Limit search to filings on or before this date
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
    BigDecimal pageSize2 = null; // BigDecimal | The number of results to return

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

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search for notes that contain all or parts of this text |
 **filingStartDate** | **LocalDate**| Limit search to filings on or after this date | [optional]
 **filingEndDate** | **LocalDate**| Limit search to filings on or before this date | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **pageSize2** | **BigDecimal**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseFilingNotesSearch**](ApiResponseFilingNotesSearch.md)

