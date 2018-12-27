# FilingApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filterFilings**](FilingApi.md#filterFilings) | **GET** /filings/filter | Filter Filings
[**filterNotes**](FilingApi.md#filterNotes) | **GET** /filings/notes/filter | Filter SEC filing notes
[**getAllFilings**](FilingApi.md#getAllFilings) | **GET** /filings | All Filings
[**getAllNotes**](FilingApi.md#getAllNotes) | **GET** /filings/notes | Get All SEC filing notes
[**getFilingById**](FilingApi.md#getFilingById) | **GET** /filings/{id} | Lookup Filing
[**getNote**](FilingApi.md#getNote) | **GET** /filings/notes/{identifier} | Get an SEC filing note by ID
[**getNoteHtml**](FilingApi.md#getNoteHtml) | **GET** /filings/notes/{identifier}/html | Returns the content of an SEC filing note as originally filed
[**getNoteText**](FilingApi.md#getNoteText) | **GET** /filings/notes/{identifier}/text | Returns the content of an SEC filing note stripped of HTML
[**searchNotes**](FilingApi.md#searchNotes) | **GET** /filings/notes/search | Search Filing Notes


<a name="filterFilings"></a>
# **filterFilings**
> ApiResponseFilings filterFilings(company, reportType, startDate, endDate, nextPage)

Filter Filings

Returns Filings that match the specified filters

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FilingApi filingApi = new FilingApi();

String company = "AAPL"; // String | Filings for the given `company` identifier (ticker, CIK, LEI, Intrinio ID)
String reportType = null; // String | Filter by report type
LocalDate startDate = null; // LocalDate | Filed on or after the given date
LocalDate endDate = null; // LocalDate | Filed before or after the given date
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseFilings result = filingApi.filterFilings(company, reportType, startDate, endDate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#filterFilings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | **String**| Filings for the given &#x60;company&#x60; identifier (ticker, CIK, LEI, Intrinio ID) |
 **reportType** | **String**| Filter by report type | [optional]
 **startDate** | **LocalDate**| Filed on or after the given date | [optional]
 **endDate** | **LocalDate**| Filed before or after the given date | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseFilings**](ApiResponseFilings.md)

<a name="filterNotes"></a>
# **filterNotes**
> ApiResponseFilingNotes filterNotes(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, nextPage)

Filter SEC filing notes

Returns SEC filing notes matching the supplied criteria

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

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
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseFilingNotes result = filingApi.filterNotes(company, reportType, filingStartDate, filingEndDate, periodEndedStartDate, periodEndedEndDate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#filterNotes");
    e.printStackTrace();
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
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseFilingNotes**](ApiResponseFilingNotes.md)

<a name="getAllFilings"></a>
# **getAllFilings**
> ApiResponseFilings getAllFilings(nextPage)

All Filings

Returns all Filings

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FilingApi filingApi = new FilingApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseFilings result = filingApi.getAllFilings(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#getAllFilings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseFilings**](ApiResponseFilings.md)

<a name="getAllNotes"></a>
# **getAllNotes**
> ApiResponseFilingNotes getAllNotes(nextPage)

Get All SEC filing notes

Return All notes from SEC Filings, most-recent first

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FilingApi filingApi = new FilingApi();

String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseFilingNotes result = filingApi.getAllNotes(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#getAllNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

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

Get an SEC filing note by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

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

Returns the content of an SEC filing note as originally filed

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

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

Returns the content of an SEC filing note stripped of HTML

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The Intrinio ID of the filing note |

### Return type

**String**

<a name="searchNotes"></a>
# **searchNotes**
> ApiResponseFilingNotesSearch searchNotes(query, filingStartDate, filingEndDate, pageSize)

Search Filing Notes

Searches SEC filing notes using the text in &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.FilingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

FilingApi filingApi = new FilingApi();

String query = "inflation"; // String | Search for notes that contain all or parts of this text
LocalDate filingStartDate = null; // LocalDate | Limit search to filings on or after this date
LocalDate filingEndDate = null; // LocalDate | Limit search to filings on or before this date
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return

try {
    ApiResponseFilingNotesSearch result = filingApi.searchNotes(query, filingStartDate, filingEndDate, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilingApi#searchNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search for notes that contain all or parts of this text |
 **filingStartDate** | **LocalDate**| Limit search to filings on or after this date | [optional]
 **filingEndDate** | **LocalDate**| Limit search to filings on or before this date | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseFilingNotesSearch**](ApiResponseFilingNotesSearch.md)

