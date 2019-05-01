# MunicipalityApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMunicipalities**](MunicipalityApi.md#getAllMunicipalities) | **GET** /municipalities | All Municipalities
[**getMunicipalityById**](MunicipalityApi.md#getMunicipalityById) | **GET** /municipalities/{id} | Municipality by ID
[**getMunicipalityFinancials**](MunicipalityApi.md#getMunicipalityFinancials) | **GET** /municipalities/{id}/financials | Financials for a Municipality



[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/municipalities)

[//]: # (DOC_LINK:MunicipalityApi.md#getAllMunicipalities)

<a name="getAllMunicipalities"></a>
# **getAllMunicipalities**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getAllMunicipalities_v2)

> ApiResponseMunicipalities getAllMunicipalities(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage)

All Municipalities

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

    MunicipalityApi municipalityApi = new MunicipalityApi();

    Boolean hasFinancials = true; // Boolean | Return municipalities with financials
    String governmentName = "governmentName_example"; // String | Return municipalities with a government name matching the given query
    String governmentType = "governmentType_example"; // String | Return municipalities with the given government type
    String areaName = "areaName_example"; // String | Return municipalities with an area name matching the given query
    String areaType = "areaType_example"; // String | Return municipalities with the given area type
    String city = "city_example"; // String | Return municipalities in the given city
    String state = "state_example"; // String | Return municipalities in the given state
    BigDecimal zipcode = null; // BigDecimal | Return municipalities in the given zipcode
    BigDecimal populationGreaterThan = null; // BigDecimal | Return municipalities with a population greater than the given number
    BigDecimal populationLessThan = null; // BigDecimal | Return municipalities with a population less than the given number
    BigDecimal enrollmentGreaterThan = null; // BigDecimal | Return municipalities with an enrollment greater than the given number
    BigDecimal enrollmentLessThan = null; // BigDecimal | Return municipalities with an enrollment less than the given number
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseMunicipalities result = municipalityApi.getAllMunicipalities(hasFinancials, governmentName, governmentType, areaName, areaType, city, state, zipcode, populationGreaterThan, populationLessThan, enrollmentGreaterThan, enrollmentLessThan, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling MunicipalityApi#getAllMunicipalities");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

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

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/municipalities/{id})

[//]: # (DOC_LINK:MunicipalityApi.md#getMunicipalityById)

<a name="getMunicipalityById"></a>
# **getMunicipalityById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getMunicipalityById_v2)

> Municipality getMunicipalityById(id)

Municipality by ID

Returns the Municipality with the given ID

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

    MunicipalityApi municipalityApi = new MunicipalityApi();

    String id = "mun_Xn7x4z"; // String | An Intrinio ID of a Municipality

    try {
        Municipality result = municipalityApi.getMunicipalityById(id);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling MunicipalityApi#getMunicipalityById");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| An Intrinio ID of a Municipality |

### Return type

[**Municipality**](Municipality.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERTATION)

[//]: # (ENDPOINT:/municipalities/{id}/financials)

[//]: # (DOC_LINK:MunicipalityApi.md#getMunicipalityFinancials)

<a name="getMunicipalityFinancials"></a>
# **getMunicipalityFinancials**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/api_v2/getMunicipalityFinancials_v2)

> ApiResponseMunicipalitiyFinancials getMunicipalityFinancials(id, fiscalYear)

Financials for a Municipality

Returns financial statement data for the Municipality with the given ID

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

    MunicipalityApi municipalityApi = new MunicipalityApi();

    String id = "mun_Xn7x4z"; // String | An Intrinio ID of a Municipality
    BigDecimal fiscalYear = null; // BigDecimal | Return financials for the given fiscal year

    try {
        ApiResponseMunicipalitiyFinancials result = municipalityApi.getMunicipalityFinancials(id, fiscalYear);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling MunicipalityApi#getMunicipalityFinancials");
        e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| An Intrinio ID of a Municipality |
 **fiscalYear** | **BigDecimal**| Return financials for the given fiscal year | [optional]

### Return type

[**ApiResponseMunicipalitiyFinancials**](ApiResponseMunicipalitiyFinancials.md)

[//]: # (END_OPERATION)

