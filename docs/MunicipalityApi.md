# MunicipalityApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMunicipalities**](MunicipalityApi.md#getAllMunicipalities) | **GET** /municipalities | All Municipalities
[**getMunicipalityById**](MunicipalityApi.md#getMunicipalityById) | **GET** /municipalities/{id} | Municipality by ID
[**getMunicipalityFinancials**](MunicipalityApi.md#getMunicipalityFinancials) | **GET** /municipalities/{id}/financials | Financials for a Municipality


<a name="getAllMunicipalities"></a>
# **getAllMunicipalities**
> ApiResponseMunicipalities getAllMunicipalities(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage)

All Municipalities

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.MunicipalityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

MunicipalityApi municipalityApi = new MunicipalityApi();

Boolean hasFinancials = true; // Boolean | Return municipalities with financials
String governmentName = "governmentName_example"; // String | Return municipalities with a government name matching the given query
String governmentType = "governmentType_example"; // String | Return municipalities with the given government type
String areaName = "areaName_example"; // String | Return municipalities with an area name matching the given query
String areaType = "areaType_example"; // String | Return municipalities with the given area type
String city = "city_example"; // String | Return municipalities in the given city
String state = "state_example"; // String | Return municipalities in the given state
BigDecimal zipcode = new BigDecimal(); // BigDecimal | Return municipalities in the given zipcode
BigDecimal populationGreaterThan = new BigDecimal(); // BigDecimal | Return municipalities with a population greater than the given number
BigDecimal populationLessThan = new BigDecimal(); // BigDecimal | Return municipalities with a population less than the given number
BigDecimal enrollmentGreaterThan = new BigDecimal(); // BigDecimal | Return municipalities with an enrollment greater than the given number
BigDecimal enrollmentLessThan = new BigDecimal(); // BigDecimal | Return municipalities with an enrollment less than the given number
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseMunicipalities result = municipalityApi.getAllMunicipalities(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MunicipalityApi#getAllMunicipalities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hasFinancials** | **Boolean**| Return municipalities with financials | [optional]
 **governmentName** | **String**| Return municipalities with a government name matching the given query | [optional]
 **governmentType** | **String**| Return municipalities with the given government type | [optional]
 **areaName** | **String**| Return municipalities with an area name matching the given query | [optional]
 **areaType** | **String**| Return municipalities with the given area type | [optional] [enum: Borough, Census Borough, Census County, Census Division, Census Parish, City, City And County, County, Municipality, Parish]
 **city** | **String**| Return municipalities in the given city | [optional]
 **state** | **String**| Return municipalities in the given state | [optional]
 **zipcode** | **BigDecimal**| Return municipalities in the given zipcode | [optional]
 **populationGreaterThan** | **BigDecimal**| Return municipalities with a population greater than the given number | [optional]
 **populationLessThan** | **BigDecimal**| Return municipalities with a population less than the given number | [optional]
 **enrollmentGreaterThan** | **BigDecimal**| Return municipalities with an enrollment greater than the given number | [optional]
 **enrollmentLessThan** | **BigDecimal**| Return municipalities with an enrollment less than the given number | [optional]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseMunicipalities**](ApiResponseMunicipalities.md)

<a name="getMunicipalityById"></a>
# **getMunicipalityById**
> Municipality getMunicipalityById(id)

Municipality by ID

Returns the Municipality with the given ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.MunicipalityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

MunicipalityApi municipalityApi = new MunicipalityApi();

String id = "mun_Xn7x4z"; // String | An Intrinio ID of a Municipality

try {
    Municipality result = municipalityApi.getMunicipalityById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MunicipalityApi#getMunicipalityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| An Intrinio ID of a Municipality |

### Return type

[**Municipality**](Municipality.md)

<a name="getMunicipalityFinancials"></a>
# **getMunicipalityFinancials**
> ApiResponseMunicipalitiyFinancials getMunicipalityFinancials(id, fiscalYear)

Financials for a Municipality

Returns financial statement data for the Municipality with the given ID

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.MunicipalityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

MunicipalityApi municipalityApi = new MunicipalityApi();

String id = "mun_Xn7x4z"; // String | An Intrinio ID of a Municipality
BigDecimal fiscalYear = new BigDecimal(); // BigDecimal | Return financials for the given fiscal year

try {
    ApiResponseMunicipalitiyFinancials result = municipalityApi.getMunicipalityFinancials(id, fiscalYear);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MunicipalityApi#getMunicipalityFinancials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| An Intrinio ID of a Municipality |
 **fiscalYear** | **BigDecimal**| Return financials for the given fiscal year | [optional]

### Return type

[**ApiResponseMunicipalitiyFinancials**](ApiResponseMunicipalitiyFinancials.md)

