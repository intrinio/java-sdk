# OptionsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptions**](OptionsApi.md#getOptions) | **GET** /options/{symbol} | Options
[**getOptionsChain**](OptionsApi.md#getOptionsChain) | **GET** /options/chain/{symbol}/{expiration} | Options Chain
[**getOptionsExpirations**](OptionsApi.md#getOptionsExpirations) | **GET** /options/expirations/{symbol} | Options Expirations
[**getOptionsPrices**](OptionsApi.md#getOptionsPrices) | **GET** /options/prices/{identifier} | Option Prices


<a name="getOptions"></a>
# **getOptions**
> ApiResponseOptions getOptions(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage)

Options

Returns the master list of option contracts for a given symbol.

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

    OptionsApi optionsApi = new OptionsApi();

    String symbol = "MSFT"; // String | The option symbol, corresponding to the underlying security.
    String type = "put"; // String | The option contract type.
    BigDecimal strike = null; // BigDecimal | The strike price of the option contract. This will return options contracts with strike price equal to this price.
    BigDecimal strikeGreaterThan = null; // BigDecimal | The strike price of the option contract. This will return options contracts with strike prices greater than this price.
    BigDecimal strikeLessThan = null; // BigDecimal | The strike price of the option contract. This will return options contracts with strike prices less than this price.
    String expiration = "2019-03-01"; // String | The expiration date of the option contract. This will return options contracts with expiration dates on this date.
    String expirationAfter = "2019-01-01"; // String | The expiration date of the option contract. This will return options contracts with expiration dates after this date.
    String expirationBefore = "2019-12-31"; // String | The expiration date of the option contract. This will return options contracts with expiration dates before this date.
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseOptions result = optionsApi.getOptions(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling OptionsApi#getOptions");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The option symbol, corresponding to the underlying security. |
 **type** | **String**| The option contract type. | [optional] [enum: call, put]
 **strike** | **BigDecimal**| The strike price of the option contract. This will return options contracts with strike price equal to this price. | [optional]
 **strikeGreaterThan** | **BigDecimal**| The strike price of the option contract. This will return options contracts with strike prices greater than this price. | [optional]
 **strikeLessThan** | **BigDecimal**| The strike price of the option contract. This will return options contracts with strike prices less than this price. | [optional]
 **expiration** | **String**| The expiration date of the option contract. This will return options contracts with expiration dates on this date. | [optional]
 **expirationAfter** | **String**| The expiration date of the option contract. This will return options contracts with expiration dates after this date. | [optional]
 **expirationBefore** | **String**| The expiration date of the option contract. This will return options contracts with expiration dates before this date. | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseOptions**](ApiResponseOptions.md)

<a name="getOptionsChain"></a>
# **getOptionsChain**
> ApiResponseOptionsChain getOptionsChain(symbol, expiration, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize)

Options Chain

Returns all options contracts and their prices for the given symbol and expiration date.

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

    OptionsApi optionsApi = new OptionsApi();

    String symbol = "MSFT"; // String | The option symbol, corresponding to the underlying security.
    String expiration = "2019-03-06"; // String | The expiration date of the options contract
    String type = "put"; // String | The option contract type.
    BigDecimal strike = null; // BigDecimal | The strike price of the option contract. This will return options contracts with strike price equal to this price.
    BigDecimal strikeGreaterThan = null; // BigDecimal | The strike price of the option contract. This will return options contracts with strike prices greater than this price.
    BigDecimal strikeLessThan = null; // BigDecimal | The strike price of the option contract. This will return options contracts with strike prices less than this price.
    String moneyness = "in_the_money"; // String | The moneyness of the options contracts to return. 'all' will return all options contracts. 'in_the_money' will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). 'out_of_they_money' will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). 'near_the_money' will return options contracts that are $0.50 or less away from being in the money.
    BigDecimal pageSize = null; // BigDecimal | The number of results to return

    try {
        ApiResponseOptionsChain result = optionsApi.getOptionsChain(symbol, expiration, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling OptionsApi#getOptionsChain");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The option symbol, corresponding to the underlying security. |
 **expiration** | **String**| The expiration date of the options contract |
 **type** | **String**| The option contract type. | [optional] [enum: call, put]
 **strike** | **BigDecimal**| The strike price of the option contract. This will return options contracts with strike price equal to this price. | [optional]
 **strikeGreaterThan** | **BigDecimal**| The strike price of the option contract. This will return options contracts with strike prices greater than this price. | [optional]
 **strikeLessThan** | **BigDecimal**| The strike price of the option contract. This will return options contracts with strike prices less than this price. | [optional]
 **moneyness** | **String**| The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money. | [optional] [enum: all, in_the_money, out_of_the_money, near_the_money]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseOptionsChain**](ApiResponseOptionsChain.md)

<a name="getOptionsExpirations"></a>
# **getOptionsExpirations**
> ApiResponseOptionsExpirations getOptionsExpirations(symbol, after, before)

Options Expirations

Returns all option contract expiration dates for a given symbol.

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

    OptionsApi optionsApi = new OptionsApi();

    String symbol = "MSFT"; // String | The option symbol, corresponding to the underlying security.
    String after = "2019-01-01"; // String | Return option contract expiration dates after this date.
    String before = "2019-12-31"; // String | Return option contract expiration dates before this date.

    try {
        ApiResponseOptionsExpirations result = optionsApi.getOptionsExpirations(symbol, after, before);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling OptionsApi#getOptionsExpirations");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The option symbol, corresponding to the underlying security. |
 **after** | **String**| Return option contract expiration dates after this date. | [optional]
 **before** | **String**| Return option contract expiration dates before this date. | [optional]

### Return type

[**ApiResponseOptionsExpirations**](ApiResponseOptionsExpirations.md)

<a name="getOptionsPrices"></a>
# **getOptionsPrices**
> ApiResponseOptionPrices getOptionsPrices(identifier, startDate, endDate, pageSize, nextPage)

Option Prices

Returns all option prices for a given option contract identifier.

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

    OptionsApi optionsApi = new OptionsApi();

    String identifier = "null"; // String | The Intrinio ID or code of the options contract to request prices for.
    String startDate = "2019-01-01"; // String | Return option contract prices on or after this date.
    String endDate = "2019-12-31"; // String | Return option contract prices on or before this date.
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseOptionPrices result = optionsApi.getOptionsPrices(identifier, startDate, endDate, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling OptionsApi#getOptionsPrices");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The Intrinio ID or code of the options contract to request prices for. |
 **startDate** | **String**| Return option contract prices on or after this date. | [optional]
 **endDate** | **String**| Return option contract prices on or before this date. | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseOptionPrices**](ApiResponseOptionPrices.md)
