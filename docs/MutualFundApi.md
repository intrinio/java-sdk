# MutualFundApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMutualFunds**](MutualFundApi.md#getAllMutualFunds) | **GET** /mutual_funds | Get All Mutual Funds
[**getMutualFundById**](MutualFundApi.md#getMutualFundById) | **GET** /mutual_funds/{identifier} | Get a Mutual Fund by ID
[**getMutualFundStats**](MutualFundApi.md#getMutualFundStats) | **GET** /mutual_funds/{identifier}/stats | Get Stats for a Mutual Fund
[**searchMutualFunds**](MutualFundApi.md#searchMutualFunds) | **GET** /mutual_funds/search | Search Mutual Funds


<a name="getAllMutualFunds"></a>
# **getAllMutualFunds**
> List&lt;MutualFund&gt; getAllMutualFunds(nextPage)

Get All Mutual Funds

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.MutualFundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

MutualFundApi mutualFundApi = new MutualFundApi();

String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<MutualFund> result = mutualFundApi.getAllMutualFunds(nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutualFundApi#getAllMutualFunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;MutualFund&gt;**](MutualFund.md)

<a name="getMutualFundById"></a>
# **getMutualFundById**
> MutualFund getMutualFundById(identifier)

Get a Mutual Fund by ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.MutualFundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

MutualFundApi mutualFundApi = new MutualFundApi();

String identifier = "identifier_example"; // String | A Mutual Fund identifier (CUSIP, Intrinio ID)

try {
    MutualFund result = mutualFundApi.getMutualFundById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutualFundApi#getMutualFundById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Mutual Fund identifier (CUSIP, Intrinio ID) |

### Return type

[**MutualFund**](MutualFund.md)

<a name="getMutualFundStats"></a>
# **getMutualFundStats**
> List&lt;MutualFundStat&gt; getMutualFundStats(identifier, startDate, endDate, nextPage)

Get Stats for a Mutual Fund

Returns stats for the  Mutual Fund with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.MutualFundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

MutualFundApi mutualFundApi = new MutualFundApi();

String identifier = "identifier_example"; // String | A Mutual Fund identifier (CUSIP, Intrinio ID)
LocalDate startDate = new LocalDate(); // LocalDate | Return stats on or after the date
LocalDate endDate = new LocalDate(); // LocalDate | Return stats on or before the date
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<MutualFundStat> result = mutualFundApi.getMutualFundStats(identifier, startDate, endDate, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutualFundApi#getMutualFundStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Mutual Fund identifier (CUSIP, Intrinio ID) |
 **startDate** | **LocalDate**| Return stats on or after the date | [optional]
 **endDate** | **LocalDate**| Return stats on or before the date | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;MutualFundStat&gt;**](MutualFundStat.md)

<a name="searchMutualFunds"></a>
# **searchMutualFunds**
> List&lt;MutualFund&gt; searchMutualFunds(query, nextPage)

Search Mutual Funds

Searches for Mutual Funds matching the text &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.MutualFundApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("HttpHeaderApiKey");
auth.setApiKey("YOUR API KEY");

MutualFundApi mutualFundApi = new MutualFundApi();

String query = "query_example"; // String | 
String nextPage = "nextPage_example"; // String | Gets the next page of data from a previous API call

try {
    List<MutualFund> result = mutualFundApi.searchMutualFunds(query, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MutualFundApi#searchMutualFunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**List&lt;MutualFund&gt;**](MutualFund.md)

