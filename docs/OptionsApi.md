# OptionsApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllOptionsTickers**](OptionsApi.md#getAllOptionsTickers) | **GET** /options/tickers | Options Tickers
[**getOptionAggregates**](OptionsApi.md#getOptionAggregates) | **GET** /options/aggregates | Total open interest and volume aggregated by ticker
[**getOptionExpirationsRealtime**](OptionsApi.md#getOptionExpirationsRealtime) | **GET** /options/expirations/{symbol}/realtime | Options Expirations
[**getOptionStrikesRealtime**](OptionsApi.md#getOptionStrikesRealtime) | **GET** /options/strikes/{symbol}/{strike}/realtime | Option Strikes Realtime
[**getOptionTrades**](OptionsApi.md#getOptionTrades) | **GET** /options/trades | Option Trades
[**getOptionTradesByContract**](OptionsApi.md#getOptionTradesByContract) | **GET** /options/{identifier}/trades | Option Trades By Contract
[**getOptions**](OptionsApi.md#getOptions) | **GET** /options/{symbol} | Options
[**getOptionsBySymbolRealtime**](OptionsApi.md#getOptionsBySymbolRealtime) | **GET** /options/{symbol}/realtime | Options by Symbol Realtime
[**getOptionsChain**](OptionsApi.md#getOptionsChain) | **GET** /options/chain/{symbol}/{expiration} | Options Chain
[**getOptionsChainEod**](OptionsApi.md#getOptionsChainEod) | **GET** /options/chain/{symbol}/{expiration}/eod | Options Chain EOD
[**getOptionsChainRealtime**](OptionsApi.md#getOptionsChainRealtime) | **GET** /options/chain/{symbol}/{expiration}/realtime | Options Chain Realtime
[**getOptionsExpirations**](OptionsApi.md#getOptionsExpirations) | **GET** /options/expirations/{symbol} | Options Expirations
[**getOptionsExpirationsEod**](OptionsApi.md#getOptionsExpirationsEod) | **GET** /options/expirations/{symbol}/eod | Options Expirations
[**getOptionsIntervalByContract**](OptionsApi.md#getOptionsIntervalByContract) | **GET** /options/interval/{identifier} | Options Intervals By Contract
[**getOptionsIntervalMovers**](OptionsApi.md#getOptionsIntervalMovers) | **GET** /options/interval/movers | Options Intervals Movers
[**getOptionsIntervalMoversChange**](OptionsApi.md#getOptionsIntervalMoversChange) | **GET** /options/interval/movers/change | Options Intervals Movers By Change
[**getOptionsIntervalMoversVolume**](OptionsApi.md#getOptionsIntervalMoversVolume) | **GET** /options/interval/movers/volume | Options Intervals Movers By Volume
[**getOptionsPrices**](OptionsApi.md#getOptionsPrices) | **GET** /options/prices/{identifier} | Option Prices
[**getOptionsPricesBatchRealtime**](OptionsApi.md#getOptionsPricesBatchRealtime) | **POST** /options/prices/realtime/batch | Option Prices Batch Realtime
[**getOptionsPricesEod**](OptionsApi.md#getOptionsPricesEod) | **GET** /options/prices/{identifier}/eod | Option Prices EOD
[**getOptionsPricesEodByTicker**](OptionsApi.md#getOptionsPricesEodByTicker) | **GET** /options/prices/by_ticker/{symbol}/eod | Option Prices End of Day By Ticker
[**getOptionsPricesRealtime**](OptionsApi.md#getOptionsPricesRealtime) | **GET** /options/prices/{identifier}/realtime | Option Prices Realtime
[**getOptionsPricesRealtimeByTicker**](OptionsApi.md#getOptionsPricesRealtimeByTicker) | **GET** /options/prices/by_ticker/{symbol}/realtime | Option Prices Realtime By Ticker
[**getOptionsSnapshots**](OptionsApi.md#getOptionsSnapshots) | **GET** /options/snapshots | Option Prices Realtime Snapshot
[**getOptionsStatsRealtime**](OptionsApi.md#getOptionsStatsRealtime) | **GET** /options/prices/{identifier}/realtime/stats | Option Stats Realtime
[**getUnusualActivity**](OptionsApi.md#getUnusualActivity) | **GET** /options/unusual_activity/{symbol} | Options Unusual Activity
[**getUnusualActivityIntraday**](OptionsApi.md#getUnusualActivityIntraday) | **GET** /options/unusual_activity/{symbol}/intraday | Options Unusual Activity Intraday
[**getUnusualActivityUniversal**](OptionsApi.md#getUnusualActivityUniversal) | **GET** /options/unusual_activity | Options Unusual Activity Universal
[**getUnusualActivityUniversalIntraday**](OptionsApi.md#getUnusualActivityUniversalIntraday) | **GET** /options/unusual_activity/intraday | Options Unusual Activity Universal Intraday



[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getAllOptionsTickers)

[//]: # (RETURN_TYPE:ApiResponseOptionsTickers)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsTickers.md)

[//]: # (OPERATION:getAllOptionsTickers_v2)

[//]: # (ENDPOINT:/options/tickers)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getAllOptionsTickers)

<a name="getAllOptionsTickers"></a>
## **getAllOptionsTickers**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllOptionsTickers_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsTickers getAllOptionsTickers()

#### Options Tickers


Returns all tickers that have existing options contracts.

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
    ApiResponseOptionsTickers result = optionsApi.getAllOptionsTickers();
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)

This endpoint does not need any parameter.
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsTickers**](ApiResponseOptionsTickers.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionAggregates)

[//]: # (RETURN_TYPE:ApiResponseOptionsAggregates)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsAggregates.md)

[//]: # (OPERATION:getOptionAggregates_v2)

[//]: # (ENDPOINT:/options/aggregates)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionAggregates)

<a name="getOptionAggregates"></a>
## **getOptionAggregates**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionAggregates_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsAggregates getOptionAggregates(date, pageSize, nextPage)

#### Total open interest and volume aggregated by ticker


Returns total open interest and volume by ticker

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
    Object date = "2024-04-24";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseOptionsAggregates result = optionsApi.getOptionAggregates(date, pageSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | [**Object**](.md)| Return aggregated data for this date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsAggregates**](ApiResponseOptionsAggregates.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionExpirationsRealtime)

[//]: # (RETURN_TYPE:ApiResponseOptionsExpirations)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsExpirations.md)

[//]: # (OPERATION:getOptionExpirationsRealtime_v2)

[//]: # (ENDPOINT:/options/expirations/{symbol}/realtime)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionExpirationsRealtime)

<a name="getOptionExpirationsRealtime"></a>
## **getOptionExpirationsRealtime**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionExpirationsRealtime_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsExpirations getOptionExpirationsRealtime(symbol, after, before, source, includeRelatedSymbols)

#### Options Expirations


Returns a list of all current and upcoming option contract expiration dates for a particular symbol.

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
    String after = "2022-01-01";
    String before = "2023-04-01";
    String source = null;
    Boolean includeRelatedSymbols = false;
    ApiResponseOptionsExpirations result = optionsApi.getOptionExpirationsRealtime(symbol, after, before, source, includeRelatedSymbols);
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
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **includeRelatedSymbols** | Boolean| Include related symbols that end in a 1 or 2 because of a corporate action. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsExpirations**](ApiResponseOptionsExpirations.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionStrikesRealtime)

[//]: # (RETURN_TYPE:ApiResponseOptionsChainRealtime)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsChainRealtime.md)

[//]: # (OPERATION:getOptionStrikesRealtime_v2)

[//]: # (ENDPOINT:/options/strikes/{symbol}/{strike}/realtime)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionStrikesRealtime)

<a name="getOptionStrikesRealtime"></a>
## **getOptionStrikesRealtime**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionStrikesRealtime_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsChainRealtime getOptionStrikesRealtime(symbol, strike, source, stockPriceSource, model, showExtendedPrice, includeRelatedSymbols)

#### Option Strikes Realtime


Returns a list of the latest top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all call/put contracts that match the strike and symbol specified.

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
    BigDecimal strike = null;
    String source = null;
    String stockPriceSource = null;
    String model = null;
    Boolean showExtendedPrice = null;
    Boolean includeRelatedSymbols = false;
    ApiResponseOptionsChainRealtime result = optionsApi.getOptionStrikesRealtime(symbol, strike, source, stockPriceSource, model, showExtendedPrice, includeRelatedSymbols);
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
 **strike** | BigDecimal| The strike price of the option contract. This will return options contracts with strike price equal to this price. | &nbsp;
 **source** | String| Realtime or delayed. | [optional] [enum: realtime, delayed] &nbsp;
 **stockPriceSource** | String| Source for underlying price for calculating Greeks. | [optional] [enum: iex, bats_delayed, intrinio_mx, intrinio_mx_plus, delayed_sip, utp_delayed, otc_delayed, cta_a_delayed, cta_b_delayed, nasdaq_basic] &nbsp;
 **model** | String| Model for calculating Greek values. Default is black_scholes. | [optional] [enum: black_scholes, bjerk] &nbsp;
 **showExtendedPrice** | Boolean| Whether to include open close high low type fields. | [optional] &nbsp;
 **includeRelatedSymbols** | Boolean| Include related symbols that end in a 1 or 2 because of a corporate action. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsChainRealtime**](ApiResponseOptionsChainRealtime.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionTrades)

[//]: # (RETURN_TYPE:OptionTradesResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:OptionTradesResult.md)

[//]: # (OPERATION:getOptionTrades_v2)

[//]: # (ENDPOINT:/options/trades)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionTrades)

<a name="getOptionTrades"></a>
## **getOptionTrades**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionTrades_v2)

[//]: # (START_OVERVIEW)

> OptionTradesResult getOptionTrades(source, startDate, startTime, endDate, endTime, timezone, pageSize, minSize, security, nextPage)

#### Option Trades


Returns all trades between start time and end time, up to seven days ago for the specified source.

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
    String source = null;
    LocalDate startDate = null;
    String startTime = null;
    LocalDate endDate = null;
    String endTime = null;
    String timezone = "UTC";
    Integer pageSize = 100;
    Integer minSize = 100;
    String security = "AAPL";
    String nextPage = null;
    OptionTradesResult result = optionsApi.getOptionTrades(source, startDate, startTime, endDate, endTime, timezone, pageSize, minSize, security, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| The specific source of the data being requested. | [optional] [enum: realtime, delayed] &nbsp;
 **startDate** | LocalDate| The start date for the data being requested. | [optional] &nbsp;
 **startTime** | String| The start time for the data being requested. | [optional] &nbsp;
 **endDate** | LocalDate| The end date for the data being requested. | [optional] &nbsp;
 **endTime** | String| The end time for the data being requested. | [optional] &nbsp;
 **timezone** | String| The timezone the start and end date/times use. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu] &nbsp;
 **pageSize** | Integer| The maximum number of results to return per page. | [optional] [default to 100] &nbsp;
 **minSize** | Integer| Trades must be larger or equal to this size. | [optional] &nbsp;
 **security** | String| The ticker symbol for which trades are being requested. | [optional] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**OptionTradesResult**](OptionTradesResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionTradesByContract)

[//]: # (RETURN_TYPE:OptionTradesResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:OptionTradesResult.md)

[//]: # (OPERATION:getOptionTradesByContract_v2)

[//]: # (ENDPOINT:/options/{identifier}/trades)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionTradesByContract)

<a name="getOptionTradesByContract"></a>
## **getOptionTradesByContract**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionTradesByContract_v2)

[//]: # (START_OVERVIEW)

> OptionTradesResult getOptionTradesByContract(identifier, source, startDate, startTime, endDate, endTime, timezone, pageSize, minSize, nextPage)

#### Option Trades By Contract


Returns all trades for a contract between start time and end time, up to seven days ago for the specified source.

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
    String identifier = "AAPL__261218C00230000";
    String source = null;
    LocalDate startDate = null;
    String startTime = null;
    LocalDate endDate = null;
    String endTime = null;
    String timezone = "UTC";
    Integer pageSize = 100;
    Integer minSize = 100;
    String nextPage = null;
    OptionTradesResult result = optionsApi.getOptionTradesByContract(identifier, source, startDate, startTime, endDate, endTime, timezone, pageSize, minSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The option contract for which trades are being requested. | &nbsp;
 **source** | String| The specific source of the data being requested. | [optional] [enum: realtime, delayed] &nbsp;
 **startDate** | LocalDate| The start date for the data being requested. | [optional] &nbsp;
 **startTime** | String| The start time for the data being requested. | [optional] &nbsp;
 **endDate** | LocalDate| The end date for the data being requested. | [optional] &nbsp;
 **endTime** | String| The end time for the data being requested. | [optional] &nbsp;
 **timezone** | String| The timezone the start and end date/times use. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu] &nbsp;
 **pageSize** | Integer| The maximum number of results to return per page. | [optional] [default to 100] &nbsp;
 **minSize** | Integer| Trades must be larger or equal to this size. | [optional] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**OptionTradesResult**](OptionTradesResult.md)

[//]: # (END_OPERATION)


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


Returns a list of all securities that have options listed and are tradable on a US market exchange. Useful to retrieve the entire universe.  Available via a 3rd party, contact sales for a trial.

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

[//]: # (METHOD:getOptionsBySymbolRealtime)

[//]: # (RETURN_TYPE:ApiResponseOptionsRealtime)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsRealtime.md)

[//]: # (OPERATION:getOptionsBySymbolRealtime_v2)

[//]: # (ENDPOINT:/options/{symbol}/realtime)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsBySymbolRealtime)

<a name="getOptionsBySymbolRealtime"></a>
## **getOptionsBySymbolRealtime**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsBySymbolRealtime_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsRealtime getOptionsBySymbolRealtime(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source, includeRelatedSymbols)

#### Options by Symbol Realtime


Returns a list of all securities that have options listed and are tradable on a US market exchange. Useful to retrieve the entire universe.

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
    String expiration = "2022-04-16";
    String expirationAfter = "2022-01-01";
    String expirationBefore = "2023-12-31";
    String source = null;
    Boolean includeRelatedSymbols = false;
    ApiResponseOptionsRealtime result = optionsApi.getOptionsBySymbolRealtime(symbol, type, strike, strikeGreaterThan, strikeLessThan, expiration, expirationAfter, expirationBefore, source, includeRelatedSymbols);
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
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **includeRelatedSymbols** | Boolean| Include related symbols that end in a 1 or 2 because of a corporate action. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsRealtime**](ApiResponseOptionsRealtime.md)

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


Returns a list of the historical end-of-day top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all option contracts currently associated with the option chain.  Available via a 3rd party, contact sales for a trial.

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

[//]: # (METHOD:getOptionsChainEod)

[//]: # (RETURN_TYPE:ApiResponseOptionsChainEod)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsChainEod.md)

[//]: # (OPERATION:getOptionsChainEod_v2)

[//]: # (ENDPOINT:/options/chain/{symbol}/{expiration}/eod)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsChainEod)

<a name="getOptionsChainEod"></a>
## **getOptionsChainEod**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsChainEod_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsChainEod getOptionsChainEod(symbol, expiration, type, strike, strikeGreaterThan, strikeLessThan, date, includeRelatedSymbols)

#### Options Chain EOD


Returns all EOD options contracts and their prices for the given symbol and expiration date.

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
    String expiration = "2023-01-20";
    String type = null;
    BigDecimal strike = null;
    BigDecimal strikeGreaterThan = null;
    BigDecimal strikeLessThan = null;
    LocalDate date = null;
    Boolean includeRelatedSymbols = false;
    ApiResponseOptionsChainEod result = optionsApi.getOptionsChainEod(symbol, expiration, type, strike, strikeGreaterThan, strikeLessThan, date, includeRelatedSymbols);
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
 **type** | String| The option contract type. | [optional] [enum: call, put] &nbsp;
 **strike** | BigDecimal| The strike price of the option contract. This will return options contracts with strike price equal to this price. | [optional] &nbsp;
 **strikeGreaterThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices greater than this price. | [optional] &nbsp;
 **strikeLessThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices less than this price. | [optional] &nbsp;
 **date** | LocalDate| The date to retrieve prices for | [optional] &nbsp;
 **includeRelatedSymbols** | Boolean| Include related symbols that end in a 1 or 2 because of a corporate action. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsChainEod**](ApiResponseOptionsChainEod.md)

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

> ApiResponseOptionsChainRealtime getOptionsChainRealtime(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness, stockPriceSource, model, showExtendedPrice, includeRelatedSymbols)

#### Options Chain Realtime


Returns a list of the latest National Best Bid &amp; Offer (NBBO) top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all option contracts currently associated with the option chain.

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
    String stockPriceSource = null;
    String model = null;
    Boolean showExtendedPrice = null;
    Boolean includeRelatedSymbols = false;
    ApiResponseOptionsChainRealtime result = optionsApi.getOptionsChainRealtime(symbol, expiration, source, type, strike, strikeGreaterThan, strikeLessThan, volumeGreaterThan, volumeLessThan, openInterestGreaterThan, openInterestLessThan, moneyness, stockPriceSource, model, showExtendedPrice, includeRelatedSymbols);
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
 **stockPriceSource** | String| Source for underlying price for calculating Greeks. | [optional] [enum: iex, bats_delayed, intrinio_mx, intrinio_mx_plus, delayed_sip, utp_delayed, otc_delayed, cta_a_delayed, cta_b_delayed, nasdaq_basic] &nbsp;
 **model** | String| Model for calculating Greek values. Default is black_scholes. | [optional] [enum: black_scholes, bjerk] &nbsp;
 **showExtendedPrice** | Boolean| Whether to include open close high low type fields. | [optional] &nbsp;
 **includeRelatedSymbols** | Boolean| Include related symbols that end in a 1 or 2 because of a corporate action. | [optional] &nbsp;
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


Returns a list of all current and upcoming option contract expiration dates for a particular symbol.  Available via a 3rd party, contact sales for a trial.

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

[//]: # (METHOD:getOptionsExpirationsEod)

[//]: # (RETURN_TYPE:ApiResponseOptionsExpirations)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsExpirations.md)

[//]: # (OPERATION:getOptionsExpirationsEod_v2)

[//]: # (ENDPOINT:/options/expirations/{symbol}/eod)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsExpirationsEod)

<a name="getOptionsExpirationsEod"></a>
## **getOptionsExpirationsEod**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsExpirationsEod_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsExpirations getOptionsExpirationsEod(symbol, after, before, includeRelatedSymbols)

#### Options Expirations


Returns a list of all current and upcoming option contract expiration dates for a particular symbol.

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
    Boolean includeRelatedSymbols = false;
    ApiResponseOptionsExpirations result = optionsApi.getOptionsExpirationsEod(symbol, after, before, includeRelatedSymbols);
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
 **includeRelatedSymbols** | Boolean| Include related symbols that end in a 1 or 2 because of a corporate action. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsExpirations**](ApiResponseOptionsExpirations.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsIntervalByContract)

[//]: # (RETURN_TYPE:OptionIntervalsResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:OptionIntervalsResult.md)

[//]: # (OPERATION:getOptionsIntervalByContract_v2)

[//]: # (ENDPOINT:/options/interval/{identifier})

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsIntervalByContract)

<a name="getOptionsIntervalByContract"></a>
## **getOptionsIntervalByContract**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsIntervalByContract_v2)

[//]: # (START_OVERVIEW)

> OptionIntervalsResult getOptionsIntervalByContract(identifier, intervalSize, source, pageSize, endTime)

#### Options Intervals By Contract


Returns a list of interval data points for a contract.

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
    String identifier = "SPY___230103P00380000";
    String intervalSize = "5m";
    String source = null;
    Integer pageSize = 100;
    OffsetDateTime endTime = OffsetDateTime.now();
    OptionIntervalsResult result = optionsApi.getOptionsIntervalByContract(identifier, intervalSize, source, pageSize, endTime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The Intrinio ID or code of the options contract to request intervals for. | &nbsp;
 **intervalSize** | String| The time length of the interval. | [enum: SixtyMinute, 60m, 1h, ThirtyMinute, 30m, FifteenMinute, 15m, TenMinute, 10m, FiveMinute, 5m, OneMinute, 1m] &nbsp;
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **endTime** | OffsetDateTime| The inclusive UTC date and time the intervals end at. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**OptionIntervalsResult**](OptionIntervalsResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsIntervalMovers)

[//]: # (RETURN_TYPE:OptionIntervalsMoversResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:OptionIntervalsMoversResult.md)

[//]: # (OPERATION:getOptionsIntervalMovers_v2)

[//]: # (ENDPOINT:/options/interval/movers)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsIntervalMovers)

<a name="getOptionsIntervalMovers"></a>
## **getOptionsIntervalMovers**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsIntervalMovers_v2)

[//]: # (START_OVERVIEW)

> OptionIntervalsMoversResult getOptionsIntervalMovers(source, openTime)

#### Options Intervals Movers


Returns a list of intervals for the biggest movers over the last hour interval.

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
    String source = null;
    OffsetDateTime openTime = OffsetDateTime.now();
    OptionIntervalsMoversResult result = optionsApi.getOptionsIntervalMovers(source, openTime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **openTime** | OffsetDateTime| The inclusive UTC date and time the interval opens at. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**OptionIntervalsMoversResult**](OptionIntervalsMoversResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsIntervalMoversChange)

[//]: # (RETURN_TYPE:OptionIntervalsMoversResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:OptionIntervalsMoversResult.md)

[//]: # (OPERATION:getOptionsIntervalMoversChange_v2)

[//]: # (ENDPOINT:/options/interval/movers/change)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsIntervalMoversChange)

<a name="getOptionsIntervalMoversChange"></a>
## **getOptionsIntervalMoversChange**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsIntervalMoversChange_v2)

[//]: # (START_OVERVIEW)

> OptionIntervalsMoversResult getOptionsIntervalMoversChange(source, openTime)

#### Options Intervals Movers By Change


Returns a list of intervals for the biggest movers by change over the last hour interval.

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
    String source = null;
    OffsetDateTime openTime = OffsetDateTime.now();
    OptionIntervalsMoversResult result = optionsApi.getOptionsIntervalMoversChange(source, openTime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **openTime** | OffsetDateTime| The inclusive UTC date and time the interval opens at. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**OptionIntervalsMoversResult**](OptionIntervalsMoversResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsIntervalMoversVolume)

[//]: # (RETURN_TYPE:OptionIntervalsMoversResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:OptionIntervalsMoversResult.md)

[//]: # (OPERATION:getOptionsIntervalMoversVolume_v2)

[//]: # (ENDPOINT:/options/interval/movers/volume)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsIntervalMoversVolume)

<a name="getOptionsIntervalMoversVolume"></a>
## **getOptionsIntervalMoversVolume**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsIntervalMoversVolume_v2)

[//]: # (START_OVERVIEW)

> OptionIntervalsMoversResult getOptionsIntervalMoversVolume(source, openTime)

#### Options Intervals Movers By Volume


Returns a list of intervals for the biggest movers by volume over the last hour interval.

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
    String source = null;
    OffsetDateTime openTime = OffsetDateTime.now();
    OptionIntervalsMoversResult result = optionsApi.getOptionsIntervalMoversVolume(source, openTime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **openTime** | OffsetDateTime| The inclusive UTC date and time the interval opens at. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**OptionIntervalsMoversResult**](OptionIntervalsMoversResult.md)

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


Returns all price data from inception to expiration for a particular contract.

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

[//]: # (METHOD:getOptionsPricesBatchRealtime)

[//]: # (RETURN_TYPE:ApiResponseOptionsPricesBatchRealtime)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsPricesBatchRealtime.md)

[//]: # (OPERATION:getOptionsPricesBatchRealtime_v2)

[//]: # (ENDPOINT:/options/prices/realtime/batch)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsPricesBatchRealtime)

<a name="getOptionsPricesBatchRealtime"></a>
## **getOptionsPricesBatchRealtime**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsPricesBatchRealtime_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsPricesBatchRealtime getOptionsPricesBatchRealtime(body, source, showStats, stockPriceSource, model, showExtendedPrice)

#### Option Prices Batch Realtime


Returns a list of latest price data for up to 250 option contracts per request.

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
    String source = null;
    Boolean showStats = null;
    String stockPriceSource = null;
    String model = null;
    Boolean showExtendedPrice = null;
    OptionContractsList body = new OptionContractsList();
    List<String> contracts = new ArrayList<>();

    contracts.add("A220121P00055000");
    contracts.add("A220121P00057500");
    contracts.add("A220121P00060000");
    body.setContracts(contracts);
    ApiResponseOptionsPricesBatchRealtime result = optionsApi.getOptionsPricesBatchRealtime(body, source, showStats, stockPriceSource, model, showExtendedPrice);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OptionContractsList**](OptionContractsList.md)| The contract symbols for which to return options prices for. | &nbsp;
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **showStats** | Boolean| Whether to include Greek calculations or not. | [optional] &nbsp;
 **stockPriceSource** | String| Source for underlying price for calculating Greeks. | [optional] [enum: iex, bats_delayed, intrinio_mx, intrinio_mx_plus, delayed_sip, utp_delayed, otc_delayed, cta_a_delayed, cta_b_delayed, nasdaq_basic] &nbsp;
 **model** | String| Model for calculating Greek values. Default is black_scholes. | [optional] [enum: black_scholes, bjerk] &nbsp;
 **showExtendedPrice** | Boolean| Whether to include open close high low type fields. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsPricesBatchRealtime**](ApiResponseOptionsPricesBatchRealtime.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsPricesEod)

[//]: # (RETURN_TYPE:ApiResponseOptionsPricesEod)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsPricesEod.md)

[//]: # (OPERATION:getOptionsPricesEod_v2)

[//]: # (ENDPOINT:/options/prices/{identifier}/eod)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsPricesEod)

<a name="getOptionsPricesEod"></a>
## **getOptionsPricesEod**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsPricesEod_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsPricesEod getOptionsPricesEod(identifier, nextPage, startDate, endDate)

#### Option Prices EOD


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
    String identifier = "AAPL230616P00190000";
    String nextPage = null;
    LocalDate startDate = null;
    LocalDate endDate = null;
    ApiResponseOptionsPricesEod result = optionsApi.getOptionsPricesEod(identifier, nextPage, startDate, endDate);
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
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
 **startDate** | LocalDate| The start date to retrieve prices for | [optional] &nbsp;
 **endDate** | LocalDate| The end date to retrieve prices for | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsPricesEod**](ApiResponseOptionsPricesEod.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsPricesEodByTicker)

[//]: # (RETURN_TYPE:ApiResponseOptionsPricesByTickerEod)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsPricesByTickerEod.md)

[//]: # (OPERATION:getOptionsPricesEodByTicker_v2)

[//]: # (ENDPOINT:/options/prices/by_ticker/{symbol}/eod)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsPricesEodByTicker)

<a name="getOptionsPricesEodByTicker"></a>
## **getOptionsPricesEodByTicker**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsPricesEodByTicker_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsPricesByTickerEod getOptionsPricesEodByTicker(symbol, pageSize, date, type, strike, strikeGreaterThan, strikeLessThan, includeRelatedSymbols, nextPage)

#### Option Prices End of Day By Ticker


Returns a list of end of day pricing information for all option contracts currently associated with the ticker.

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
    Integer pageSize = 250;
    Object date = "2024-01-01";
    String type = null;
    BigDecimal strike = null;
    BigDecimal strikeGreaterThan = null;
    BigDecimal strikeLessThan = null;
    Boolean includeRelatedSymbols = false;
    String nextPage = null;
    ApiResponseOptionsPricesByTickerEod result = optionsApi.getOptionsPricesEodByTicker(symbol, pageSize, date, type, strike, strikeGreaterThan, strikeLessThan, includeRelatedSymbols, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | String| The equities ticker symbol, corresponding to the underlying security. | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 250] &nbsp;
 **date** | [**Object**](.md)| The date to get pricing data for. Defaults to today in Eastern time zone. | [optional] &nbsp;
 **type** | String| The option contract type. | [optional] [enum: call, put] &nbsp;
 **strike** | BigDecimal| The strike price of the option contract. This will return options contracts with strike price equal to this price. | [optional] &nbsp;
 **strikeGreaterThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices greater than this price. | [optional] &nbsp;
 **strikeLessThan** | BigDecimal| The strike price of the option contract. This will return options contracts with strike prices less than this price. | [optional] &nbsp;
 **includeRelatedSymbols** | Boolean| Include related symbols that end in a 1 or 2 because of a corporate action. | [optional] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsPricesByTickerEod**](ApiResponseOptionsPricesByTickerEod.md)

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

> ApiResponseOptionsPriceRealtime getOptionsPricesRealtime(identifier, source, stockPriceSource, model, showExtendedPrice)

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
    String identifier = "AAPL__261218C00230000";
    String source = null;
    String stockPriceSource = null;
    String model = null;
    Boolean showExtendedPrice = null;
    ApiResponseOptionsPriceRealtime result = optionsApi.getOptionsPricesRealtime(identifier, source, stockPriceSource, model, showExtendedPrice);
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
 **stockPriceSource** | String| Source for underlying price for calculating Greeks. | [optional] [enum: iex, bats_delayed, intrinio_mx, intrinio_mx_plus, delayed_sip, utp_delayed, otc_delayed, cta_a_delayed, cta_b_delayed, nasdaq_basic] &nbsp;
 **model** | String| Model for calculating Greek values. Default is black_scholes. | [optional] [enum: black_scholes, bjerk] &nbsp;
 **showExtendedPrice** | Boolean| Whether to include open close high low type fields. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsPriceRealtime**](ApiResponseOptionsPriceRealtime.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsPricesRealtimeByTicker)

[//]: # (RETURN_TYPE:ApiResponseOptionsPricesByTickerRealtime)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsPricesByTickerRealtime.md)

[//]: # (OPERATION:getOptionsPricesRealtimeByTicker_v2)

[//]: # (ENDPOINT:/options/prices/by_ticker/{symbol}/realtime)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsPricesRealtimeByTicker)

<a name="getOptionsPricesRealtimeByTicker"></a>
## **getOptionsPricesRealtimeByTicker**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsPricesRealtimeByTicker_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsPricesByTickerRealtime getOptionsPricesRealtimeByTicker(symbol, source, ivMode, nextPage, pageSize, stockPriceSource, model, showExtendedPrice, expirationStartDate, expirationEndDate)

#### Option Prices Realtime By Ticker


Returns a list of the latest National Best Bid &amp; Offer (NBBO) top of the order book size and premium (bid / ask), the latest trade size and premium as well as the greeks and implied volatility for all option contracts currently associated with the ticker.

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
    String source = null;
    String ivMode = null;
    String nextPage = null;
    Integer pageSize = 250;
    String stockPriceSource = null;
    String model = null;
    Boolean showExtendedPrice = null;
    Object expirationStartDate = "2024-01-01";
    Object expirationEndDate = "2024-02-02";
    ApiResponseOptionsPricesByTickerRealtime result = optionsApi.getOptionsPricesRealtimeByTicker(symbol, source, ivMode, nextPage, pageSize, stockPriceSource, model, showExtendedPrice, expirationStartDate, expirationEndDate);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | String| The equities ticker symbol, corresponding to the underlying security. | &nbsp;
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **ivMode** | String| Change the mode for the implied volatility calculation to out of the money. | [optional] [enum: out_of_the_money] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 250] &nbsp;
 **stockPriceSource** | String| Source for underlying price for calculating Greeks. | [optional] [enum: iex, bats_delayed, intrinio_mx, intrinio_mx_plus, delayed_sip, utp_delayed, otc_delayed, cta_a_delayed, cta_b_delayed, nasdaq_basic] &nbsp;
 **model** | String| Model for calculating Greek values. Default is black_scholes. | [optional] [enum: black_scholes, bjerk] &nbsp;
 **showExtendedPrice** | Boolean| Whether to include open close high low type fields. | [optional] &nbsp;
 **expirationStartDate** | [**Object**](.md)| Filter out contracts that expire before this date. | [optional] &nbsp;
 **expirationEndDate** | [**Object**](.md)| Filter out contracts that expire after this date. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsPricesByTickerRealtime**](ApiResponseOptionsPricesByTickerRealtime.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getOptionsSnapshots)

[//]: # (RETURN_TYPE:OptionSnapshotsResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:OptionSnapshotsResult.md)

[//]: # (OPERATION:getOptionsSnapshots_v2)

[//]: # (ENDPOINT:/options/snapshots)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getOptionsSnapshots)

<a name="getOptionsSnapshots"></a>
## **getOptionsSnapshots**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getOptionsSnapshots_v2)

[//]: # (START_OVERVIEW)

> OptionSnapshotsResult getOptionsSnapshots(source, atDatetime)

#### Option Prices Realtime Snapshot


Returns all options snapshots for the queried interval with links to download.

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
    String source = null;
    OffsetDateTime atDatetime = OffsetDateTime.now();
    OptionSnapshotsResult result = optionsApi.getOptionsSnapshots(source, atDatetime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
 **atDatetime** | OffsetDateTime| The UTC date and time (with url-encoded spaces) the snapshot will cover. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**OptionSnapshotsResult**](OptionSnapshotsResult.md)

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

> ApiResponseOptionsStatsRealtime getOptionsStatsRealtime(identifier, source, showExtendedPrice)

#### Option Stats Realtime


Returns all option stats (greeks and implied volatility) as well as the underlying factors used to calculate them, for a particular option contract.

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
    Boolean showExtendedPrice = null;
    ApiResponseOptionsStatsRealtime result = optionsApi.getOptionsStatsRealtime(identifier, source, showExtendedPrice);
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
 **showExtendedPrice** | Boolean| Whether to include open close high low type fields. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsStatsRealtime**](ApiResponseOptionsStatsRealtime.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getUnusualActivity)

[//]: # (RETURN_TYPE:ApiResponseOptionsUnusualActivity)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsUnusualActivity.md)

[//]: # (OPERATION:getUnusualActivity_v2)

[//]: # (ENDPOINT:/options/unusual_activity/{symbol})

[//]: # (DOCUMENT_LINK:OptionsApi.md#getUnusualActivity)

<a name="getUnusualActivity"></a>
## **getUnusualActivity**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getUnusualActivity_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsUnusualActivity getUnusualActivity(symbol, source)

#### Options Unusual Activity


Returns unusual options activity for a particular company across all option chains. Unusual options activity includes large trades, sweeps, and block trades.

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
    String source = null;
    ApiResponseOptionsUnusualActivity result = optionsApi.getUnusualActivity(symbol, source);
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
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsUnusualActivity**](ApiResponseOptionsUnusualActivity.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getUnusualActivityIntraday)

[//]: # (RETURN_TYPE:ApiResponseOptionsUnusualActivity)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsUnusualActivity.md)

[//]: # (OPERATION:getUnusualActivityIntraday_v2)

[//]: # (ENDPOINT:/options/unusual_activity/{symbol}/intraday)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getUnusualActivityIntraday)

<a name="getUnusualActivityIntraday"></a>
## **getUnusualActivityIntraday**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getUnusualActivityIntraday_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsUnusualActivity getUnusualActivityIntraday(symbol, nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue)

#### Options Unusual Activity Intraday


Returns unusual trades for a given identifier within the query parameters.

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
    String nextPage = null;
    Integer pageSize = 1000;
    String activityType = null;
    String sentiment = null;
    LocalDate startDate = LocalDate.of(2022,2,01);
    LocalDate endDate = LocalDate.of(2022,2,03);
    Object minimumTotalValue = 100000.0;
    Object maximumTotalValue = 200000.0;
    ApiResponseOptionsUnusualActivity result = optionsApi.getUnusualActivityIntraday(symbol, nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue);
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
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 1000] &nbsp;
 **activityType** | String| The unusual activity type to query for. | [optional] [enum: block, sweep, large] &nbsp;
 **sentiment** | String| The sentiment type to query for. | [optional] [enum: bullish, bearish, neutral] &nbsp;
 **startDate** | LocalDate| Return unusual activity on or after this date. | [optional] &nbsp;
 **endDate** | LocalDate| Return unusual activity on or before this date. | [optional] &nbsp;
 **minimumTotalValue** | [**Object**](.md)| The inclusive minimum total value for the unusual activity. | [optional] &nbsp;
 **maximumTotalValue** | [**Object**](.md)| The inclusive maximum total value for the unusual activity. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsUnusualActivity**](ApiResponseOptionsUnusualActivity.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getUnusualActivityUniversal)

[//]: # (RETURN_TYPE:ApiResponseOptionsUnusualActivity)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsUnusualActivity.md)

[//]: # (OPERATION:getUnusualActivityUniversal_v2)

[//]: # (ENDPOINT:/options/unusual_activity)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getUnusualActivityUniversal)

<a name="getUnusualActivityUniversal"></a>
## **getUnusualActivityUniversal**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getUnusualActivityUniversal_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsUnusualActivity getUnusualActivityUniversal(source)

#### Options Unusual Activity Universal


Returns the latest unusual options activity across all US companies with across all option chains. Unusual options activity includes large trades, sweeps, and block trades.

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
    String source = null;
    ApiResponseOptionsUnusualActivity result = optionsApi.getUnusualActivityUniversal(source);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsUnusualActivity**](ApiResponseOptionsUnusualActivity.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:OptionsApi)

[//]: # (METHOD:getUnusualActivityUniversalIntraday)

[//]: # (RETURN_TYPE:ApiResponseOptionsUnusualActivity)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseOptionsUnusualActivity.md)

[//]: # (OPERATION:getUnusualActivityUniversalIntraday_v2)

[//]: # (ENDPOINT:/options/unusual_activity/intraday)

[//]: # (DOCUMENT_LINK:OptionsApi.md#getUnusualActivityUniversalIntraday)

<a name="getUnusualActivityUniversalIntraday"></a>
## **getUnusualActivityUniversalIntraday**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getUnusualActivityUniversalIntraday_v2)

[//]: # (START_OVERVIEW)

> ApiResponseOptionsUnusualActivity getUnusualActivityUniversalIntraday(nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue)

#### Options Unusual Activity Universal Intraday


Returns unusual trades for all underlying security symbols within the query parameters.

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
    String nextPage = null;
    Integer pageSize = 1000;
    String activityType = null;
    String sentiment = null;
    LocalDate startDate = LocalDate.of(2022,2,01);
    LocalDate endDate = LocalDate.of(2022,2,03);
    Object minimumTotalValue = 100000.0;
    Object maximumTotalValue = 200000.0;
    ApiResponseOptionsUnusualActivity result = optionsApi.getUnusualActivityUniversalIntraday(nextPage, pageSize, activityType, sentiment, startDate, endDate, minimumTotalValue, maximumTotalValue);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 1000] &nbsp;
 **activityType** | String| The unusual activity type to query for. | [optional] [enum: block, sweep, large] &nbsp;
 **sentiment** | String| The sentiment type to query for. | [optional] [enum: bullish, bearish, neutral] &nbsp;
 **startDate** | LocalDate| Return unusual activity on or after this date. | [optional] &nbsp;
 **endDate** | LocalDate| Return unusual activity on or before this date. | [optional] &nbsp;
 **minimumTotalValue** | [**Object**](.md)| The inclusive minimum total value for the unusual activity. | [optional] &nbsp;
 **maximumTotalValue** | [**Object**](.md)| The inclusive maximum total value for the unusual activity. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseOptionsUnusualActivity**](ApiResponseOptionsUnusualActivity.md)

[//]: # (END_OPERATION)

