# OptionsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptions**](OptionsApi.md#getOptions) | **GET** /options/{symbol} | Options
[**getOptionsChain**](OptionsApi.md#getOptionsChain) | **GET** /options/chain/{symbol}/{expiration} | Options Chain
[**getOptionsChainRealtime**](OptionsApi.md#getOptionsChainRealtime) | **GET** /options/chain/{symbol}/{expiration}/realtime | Options Chain Realtime
[**getOptionsExpirations**](OptionsApi.md#getOptionsExpirations) | **GET** /options/expirations/{symbol} | Options Expirations
[**getOptionsPrices**](OptionsApi.md#getOptionsPrices) | **GET** /options/prices/{identifier} | Option Prices
[**getOptionsPricesRealtime**](OptionsApi.md#getOptionsPricesRealtime) | **GET** /options/prices/{identifier}/realtime | Option Prices Realtime
[**getOptionsStatsRealtime**](OptionsApi.md#getOptionsStatsRealtime) | **GET** /options/prices/{identifier}/realtime/stats | Option Stats Realtime



[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptions)

[//]: # (RETURN_TYPE:ApiResponseOptions)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptions.md)

[//]: # (OPERATION:getOptions_v2)

[//]: # (ENDPOINT:/options/{symbol})

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptions)

<a name="getOptions"></a>
## **getOptions**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptions_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptions getOptions(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage)

#### Options


Returns the master list of option contracts for a given symbol.

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

    OptionsApi optionsApi = new OptionsApi();
    String symbol = "AAPL";
    String type = "put";
    BigDecimal strike = null;
    BigDecimal strikeGreaterThan = null;
    BigDecimal strikeLessThan = null;
    String expiration = "2019-03-01";
    String expirationAfter = "2019-01-01";
    String expirationBefore = "2019-12-31";
    Integer pageSize = 100;
    String nextPage = null;
    
    ApiResponseOptions result = optionsApi.getOptions(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | String| The option symbol, corresponding to the underlying security. | &nbsp;
 **type** | String| The option contract type. | [optional] [enum: call, put] &nbsp;
 **strike** | BigDecimal| The strike price of the option contract. This will return options contracts with strike price equal to this price. | [optional] &nbsp;
 **strikeGreaterThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices greater than this price. | [optional] &nbsp;
 **strikeLessThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices less than this price. | [optional] &nbsp;
 **expiration** | String| The expiration date of the option contract. This will return options contracts with expiration dates on this date. | [optional] &nbsp;
 **expirationAfter** | String| The expiration date of the option contract. This will return options contracts with expiration dates after this date. | [optional] &nbsp;
 **expirationBefore** | String| The expiration date of the option contract. This will return options contracts with expiration dates before this date. | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptions**](ApiResponseOptions.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsChain)

[//]: # (RETURN_TYPE:ApiResponseOptionsChain)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsChain.md)

[//]: # (OPERATION:getOptionsChain_v2)

[//]: # (ENDPOINT:/options/chain/{symbol}/{expiration})

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsChain)

<a name="getOptionsChain"></a>
## **getOptionsChain**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsChain_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsChain getOptionsChain(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize)

#### Options Chain


Returns all options contracts and their prices for the given symbol and expiration date.

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

    OptionsApi optionsApi = new OptionsApi();
    String symbol = "MSFT";
    String expiration = "2019-04-05";
    LocalDate date = null;
    String type = null;
    BigDecimal strike = null;
    BigDecimal strikeGreaterThan = null;
    BigDecimal strikeLessThan = null;
    String moneyness = null;
    Integer pageSize = 100;
    
    ApiResponseOptionsChain result = optionsApi.getOptionsChain(symbol, expiration, date, type, strike, strikeGreaterThan, strikeLessThan, moneyness, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | String| The option symbol, corresponding to the underlying security. | &nbsp;
 **expiration** | String| The expiration date of the options contract | &nbsp;
 **date** | LocalDate| The date of the option price. Returns option prices on this date. | [optional] &nbsp;
 **type** | String| The option contract type. | [optional] [enum: call, put] &nbsp;
 **strike** | BigDecimal| The strike price of the option contract. This will return options contracts with strike price equal to this price. | [optional] &nbsp;
 **strikeGreaterThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices greater than this price. | [optional] &nbsp;
 **strikeLessThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices less than this price. | [optional] &nbsp;
 **moneyness** | String| The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money. | [optional] [enum: all, in_the_money, out_of_the_money, near_the_money] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsChain**](ApiResponseOptionsChain.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsChainRealtime)

[//]: # (RETURN_TYPE:ApiResponseOptionsChainRealtime)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsChainRealtime.md)

[//]: # (OPERATION:getOptionsChainRealtime_v2)

[//]: # (ENDPOINT:/options/chain/{symbol}/{expiration}/realtime)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsChainRealtime)

<a name="getOptionsChainRealtime"></a>
## **getOptionsChainRealtime**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsChainRealtime_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsChainRealtime getOptionsChainRealtime(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness)

#### Options Chain Realtime


Returns all realtime options contracts and their prices for the given symbol and expiration date.

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

    OptionsApi optionsApi = new OptionsApi();
    String symbol = "MSFT";
    String expiration = "2023-01-20";
    String source = null;
    String type = null;
    BigDecimal strike = null;
    BigDecimal strikeGreaterThan = null;
    BigDecimal strikeLessThan = null;
    BigDecimal volumeGreaterThan = null;
    BigDecimal volumeLessThan = null;
    BigDecimal openInterestGreaterThan = null;
    BigDecimal openInterestLessThan = null;
    String moneyness = null;
    
    ApiResponseOptionsChainRealtime result = optionsApi.getOptionsChainRealtime(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | String| The option symbol, corresponding to the underlying security. | &nbsp;
 **expiration** | String| The expiration date of the options contract | &nbsp;
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **type** | String| The option contract type. | [optional] [enum: call, put] &nbsp;
 **strike** | BigDecimal| The strike price of the option contract. This will return options contracts with strike price equal to this price. | [optional] &nbsp;
 **strikeGreaterThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices greater than this price. | [optional] &nbsp;
 **strikeLessThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices less than this price. | [optional] &nbsp;
 **volumeGreaterThan** | BigDecimal| The volume of the option contract. This will return options contracts with volumes greater than this amount. | [optional] &nbsp;
 **volumeLessThan** | BigDecimal| The volume of the option contract. This will return options contracts with volumes less than this amout. | [optional] &nbsp;
 **openInterestGreaterThan** | BigDecimal| The open interest of the option contract. This will return options contracts with open interest greater than this amount. | [optional] &nbsp;
 **openInterestLessThan** | BigDecimal| The open interest of the option contract. This will return options contracts with open interest less than this amount. | [optional] &nbsp;
 **moneyness** | String| The moneyness of the options contracts to return. &#39;all&#39; will return all options contracts. &#39;in_the_money&#39; will return options contracts that are in the money (call options with strike prices below the current price, put options with strike prices above the current price). &#39;out_of_they_money&#39; will return options contracts that are out of the money (call options with strike prices above the current price, put options with strike prices below the current price). &#39;near_the_money&#39; will return options contracts that are $0.50 or less away from being in the money.  Requires subscription to realtime stock price data. | [optional] [enum: all, in_the_money, out_of_the_money, near_the_money] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsChainRealtime**](ApiResponseOptionsChainRealtime.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsExpirations)

[//]: # (RETURN_TYPE:ApiResponseOptionsExpirations)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsExpirations.md)

[//]: # (OPERATION:getOptionsExpirations_v2)

[//]: # (ENDPOINT:/options/expirations/{symbol})

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsExpirations)

<a name="getOptionsExpirations"></a>
## **getOptionsExpirations**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsExpirations_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsExpirations getOptionsExpirations(symbol, after, before)

#### Options Expirations


Returns all option contract expiration dates for a given symbol.

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

    OptionsApi optionsApi = new OptionsApi();
    String symbol = "MSFT";
    String after = "2019-01-01";
    String before = "2019-12-31";
    
    ApiResponseOptionsExpirations result = optionsApi.getOptionsExpirations(symbol, after, before);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | String| The option symbol, corresponding to the underlying security. | &nbsp;
 **after** | String| Return option contract expiration dates after this date. | [optional] &nbsp;
 **before** | String| Return option contract expiration dates before this date. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsExpirations**](ApiResponseOptionsExpirations.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsPrices)

[//]: # (RETURN_TYPE:ApiResponseOptionPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionPrices.md)

[//]: # (OPERATION:getOptionsPrices_v2)

[//]: # (ENDPOINT:/options/prices/{identifier})

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsPrices)

<a name="getOptionsPrices"></a>
## **getOptionsPrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsPrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionPrices getOptionsPrices(identifier, startDate, endDate, pageSize, nextPage)

#### Option Prices


Returns all option prices for a given option contract identifier.

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

    OptionsApi optionsApi = new OptionsApi();
    String identifier = "MSFT190405C00118000";
    String startDate = "2019-01-01";
    String endDate = "2019-12-31";
    Integer pageSize = 100;
    String nextPage = null;
    
    ApiResponseOptionPrices result = optionsApi.getOptionsPrices(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The Intrinio ID or code of the options contract to request prices for. | &nbsp;
 **startDate** | String| Return option contract prices on or after this date. | [optional] &nbsp;
 **endDate** | String| Return option contract prices on or before this date. | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionPrices**](ApiResponseOptionPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsPricesRealtime)

[//]: # (RETURN_TYPE:ApiResponseOptionsPriceRealtime)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsPriceRealtime.md)

[//]: # (OPERATION:getOptionsPricesRealtime_v2)

[//]: # (ENDPOINT:/options/prices/{identifier}/realtime)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsPricesRealtime)

<a name="getOptionsPricesRealtime"></a>
## **getOptionsPricesRealtime**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsPricesRealtime_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsPriceRealtime getOptionsPricesRealtime(identifier, source)

#### Option Prices Realtime


Returns all option prices for a given option contract identifier.

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

    OptionsApi optionsApi = new OptionsApi();
    String identifier = "AAPL230120C00090000";
    String source = null;
    
    ApiResponseOptionsPriceRealtime result = optionsApi.getOptionsPricesRealtime(identifier, source);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The Intrinio ID or code of the options contract to request prices for. | &nbsp;
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsPriceRealtime**](ApiResponseOptionsPriceRealtime.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsStatsRealtime)

[//]: # (RETURN_TYPE:ApiResponseOptionsStatsRealtime)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsStatsRealtime.md)

[//]: # (OPERATION:getOptionsStatsRealtime_v2)

[//]: # (ENDPOINT:/options/prices/{identifier}/realtime/stats)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsStatsRealtime)

<a name="getOptionsStatsRealtime"></a>
## **getOptionsStatsRealtime**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsStatsRealtime_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsStatsRealtime getOptionsStatsRealtime(identifier, source)

#### Option Stats Realtime


Returns all option stats (greeks and implied volatility) and factors used to calculate them, for a given option contract identifier.

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

    OptionsApi optionsApi = new OptionsApi();
    String identifier = "AAPL230120C00090000";
    String source = null;
    
    ApiResponseOptionsStatsRealtime result = optionsApi.getOptionsStatsRealtime(identifier, source);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The Intrinio ID or code of the options contract to request prices for. | &nbsp;
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsStatsRealtime**](ApiResponseOptionsStatsRealtime.md)

[//]: # (END_OPERATION)

