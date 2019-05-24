# CryptoApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCryptoBookAsks**](CryptoApi.md#getCryptoBookAsks) | **GET** /crypto/book/asks | Crypto Book Asks
[**getCryptoBookBids**](CryptoApi.md#getCryptoBookBids) | **GET** /crypto/book/bids | Crypto Book Bids
[**getCryptoBookSummary**](CryptoApi.md#getCryptoBookSummary) | **GET** /crypto/book | Crypto Book Summary
[**getCryptoCurrencies**](CryptoApi.md#getCryptoCurrencies) | **GET** /crypto/currencies | Crypto Currencies
[**getCryptoExchanges**](CryptoApi.md#getCryptoExchanges) | **GET** /crypto/exchanges | Crypto Exchanges
[**getCryptoPairs**](CryptoApi.md#getCryptoPairs) | **GET** /crypto/pairs | Crypto Pairs
[**getCryptoPriceTechnicalsAdi**](CryptoApi.md#getCryptoPriceTechnicalsAdi) | **GET** /crypto/prices/technicals/adi | Accumulation/Distribution Index
[**getCryptoPriceTechnicalsAdtv**](CryptoApi.md#getCryptoPriceTechnicalsAdtv) | **GET** /crypto/prices/technicals/adtv | Average Daily Trading Volume
[**getCryptoPriceTechnicalsAdx**](CryptoApi.md#getCryptoPriceTechnicalsAdx) | **GET** /crypto/prices/technicals/adx | Average Directional Index
[**getCryptoPriceTechnicalsAo**](CryptoApi.md#getCryptoPriceTechnicalsAo) | **GET** /crypto/prices/technicals/ao | Awesome Oscillator
[**getCryptoPriceTechnicalsAtr**](CryptoApi.md#getCryptoPriceTechnicalsAtr) | **GET** /crypto/prices/technicals/atr | Average True Range
[**getCryptoPriceTechnicalsBb**](CryptoApi.md#getCryptoPriceTechnicalsBb) | **GET** /crypto/prices/technicals/bb | Bollinger Bands
[**getCryptoPriceTechnicalsCci**](CryptoApi.md#getCryptoPriceTechnicalsCci) | **GET** /crypto/prices/technicals/cci | Commodity Channel Index
[**getCryptoPriceTechnicalsCmf**](CryptoApi.md#getCryptoPriceTechnicalsCmf) | **GET** /crypto/prices/technicals/cmf | Chaikin Money Flow
[**getCryptoPriceTechnicalsDc**](CryptoApi.md#getCryptoPriceTechnicalsDc) | **GET** /crypto/prices/technicals/dc | Donchian Channel
[**getCryptoPriceTechnicalsDpo**](CryptoApi.md#getCryptoPriceTechnicalsDpo) | **GET** /crypto/prices/technicals/dpo | Detrended Price Oscillator
[**getCryptoPriceTechnicalsEom**](CryptoApi.md#getCryptoPriceTechnicalsEom) | **GET** /crypto/prices/technicals/eom | Ease of Movement
[**getCryptoPriceTechnicalsFi**](CryptoApi.md#getCryptoPriceTechnicalsFi) | **GET** /crypto/prices/technicals/fi | Force Index
[**getCryptoPriceTechnicalsIchimoku**](CryptoApi.md#getCryptoPriceTechnicalsIchimoku) | **GET** /crypto/prices/technicals/ichimoku | Ichimoku Kinko Hyo
[**getCryptoPriceTechnicalsKc**](CryptoApi.md#getCryptoPriceTechnicalsKc) | **GET** /crypto/prices/technicals/kc | Keltner Channel
[**getCryptoPriceTechnicalsKst**](CryptoApi.md#getCryptoPriceTechnicalsKst) | **GET** /crypto/prices/technicals/kst | Know Sure Thing
[**getCryptoPriceTechnicalsMacd**](CryptoApi.md#getCryptoPriceTechnicalsMacd) | **GET** /crypto/prices/technicals/macd | Moving Average Convergence Divergence
[**getCryptoPriceTechnicalsMfi**](CryptoApi.md#getCryptoPriceTechnicalsMfi) | **GET** /crypto/prices/technicals/mfi | Money Flow Index
[**getCryptoPriceTechnicalsMi**](CryptoApi.md#getCryptoPriceTechnicalsMi) | **GET** /crypto/prices/technicals/mi | Mass Index
[**getCryptoPriceTechnicalsNvi**](CryptoApi.md#getCryptoPriceTechnicalsNvi) | **GET** /crypto/prices/technicals/nvi | Negative Volume Index
[**getCryptoPriceTechnicalsObv**](CryptoApi.md#getCryptoPriceTechnicalsObv) | **GET** /crypto/prices/technicals/obv | On-balance Volume
[**getCryptoPriceTechnicalsObvMean**](CryptoApi.md#getCryptoPriceTechnicalsObvMean) | **GET** /crypto/prices/technicals/obv_mean | On-balance Volume Mean
[**getCryptoPriceTechnicalsRsi**](CryptoApi.md#getCryptoPriceTechnicalsRsi) | **GET** /crypto/prices/technicals/rsi | Relative Strength Index
[**getCryptoPriceTechnicalsSma**](CryptoApi.md#getCryptoPriceTechnicalsSma) | **GET** /crypto/prices/technicals/sma | Simple Moving Average
[**getCryptoPriceTechnicalsSr**](CryptoApi.md#getCryptoPriceTechnicalsSr) | **GET** /crypto/prices/technicals/sr | Stochastic Oscillator
[**getCryptoPriceTechnicalsTrix**](CryptoApi.md#getCryptoPriceTechnicalsTrix) | **GET** /crypto/prices/technicals/trix | Triple Exponential Average
[**getCryptoPriceTechnicalsTsi**](CryptoApi.md#getCryptoPriceTechnicalsTsi) | **GET** /crypto/prices/technicals/tsi | True Strength Index
[**getCryptoPriceTechnicalsUo**](CryptoApi.md#getCryptoPriceTechnicalsUo) | **GET** /crypto/prices/technicals/uo | Ultimate Oscillator
[**getCryptoPriceTechnicalsVi**](CryptoApi.md#getCryptoPriceTechnicalsVi) | **GET** /crypto/prices/technicals/vi | Vortex Indicator
[**getCryptoPriceTechnicalsVpt**](CryptoApi.md#getCryptoPriceTechnicalsVpt) | **GET** /crypto/prices/technicals/vpt | Volume-price Trend
[**getCryptoPriceTechnicalsVwap**](CryptoApi.md#getCryptoPriceTechnicalsVwap) | **GET** /crypto/prices/technicals/vwap | Volume Weighted Average Price
[**getCryptoPriceTechnicalsWr**](CryptoApi.md#getCryptoPriceTechnicalsWr) | **GET** /crypto/prices/technicals/wr | Williams %R
[**getCryptoPrices**](CryptoApi.md#getCryptoPrices) | **GET** /crypto/prices | Crypto Prices
[**getCryptoSnapshot**](CryptoApi.md#getCryptoSnapshot) | **GET** /crypto/snapshot | Crypto Snapshot
[**getCryptoStats**](CryptoApi.md#getCryptoStats) | **GET** /crypto/stats | Crypto Stats


<a name="getCryptoBookAsks"></a>
# **getCryptoBookAsks**
> ApiResponseCryptoBookAsks getCryptoBookAsks(pair, exchange, currency)

Crypto Book Asks

Returns the entire ask order book for a given Crypto Currency Pair and Crypto Exchange.

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return the order book asks for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return the order book asks for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return the order book asks for the given Crypto Currency.

    try {
        ApiResponseCryptoBookAsks result = cryptoApi.getCryptoBookAsks(pair, exchange, currency);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoBookAsks");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return the order book asks for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return the order book asks for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return the order book asks for the given Crypto Currency. | [optional]

### Return type

[**ApiResponseCryptoBookAsks**](ApiResponseCryptoBookAsks.md)

<a name="getCryptoBookBids"></a>
# **getCryptoBookBids**
> ApiResponseCryptoBookBids getCryptoBookBids(pair, exchange, currency)

Crypto Book Bids

Returns the entire bid order book for a given Crypto Currency Pair and Crypto Exchange.

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return the order book bids for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return the order book bids for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return the order book bids for the given Crypto Currency.

    try {
        ApiResponseCryptoBookBids result = cryptoApi.getCryptoBookBids(pair, exchange, currency);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoBookBids");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return the order book bids for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return the order book bids for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return the order book bids for the given Crypto Currency. | [optional]

### Return type

[**ApiResponseCryptoBookBids**](ApiResponseCryptoBookBids.md)

<a name="getCryptoBookSummary"></a>
# **getCryptoBookSummary**
> ApiResponseCryptoBook getCryptoBookSummary(levels, pair, exchange, currency)

Crypto Book Summary

Returns the order book summary (bid/ask prices and size) for a given Crypto Currency Pair and Crypto Exchange.

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

    CryptoApi cryptoApi = new CryptoApi();

    Integer levels = null; // Integer | The number of prices/levels to return on each side. For example, the max of 50 levels will return up to 50 bid prices and 50 ask prices.
    String pair = "btcusd"; // String | Return the order book summary for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return the order book summary for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return the order book summary for the given Crypto Currency.

    try {
        ApiResponseCryptoBook result = cryptoApi.getCryptoBookSummary(levels, pair, exchange, currency);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoBookSummary");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **levels** | **Integer**| The number of prices/levels to return on each side. For example, the max of 50 levels will return up to 50 bid prices and 50 ask prices. | [optional]
 **pair** | **String**| Return the order book summary for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return the order book summary for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return the order book summary for the given Crypto Currency. | [optional]

### Return type

[**ApiResponseCryptoBook**](ApiResponseCryptoBook.md)

<a name="getCryptoCurrencies"></a>
# **getCryptoCurrencies**
> ApiResponseCryptoCurrencies getCryptoCurrencies(exchange)

Crypto Currencies

Returns a list of Crypto Currencies for which prices are available.

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

    CryptoApi cryptoApi = new CryptoApi();

    String exchange = "binance"; // String | Returns Crypto Currencies traded on the given Crypto Exchange.

    try {
        ApiResponseCryptoCurrencies result = cryptoApi.getCryptoCurrencies(exchange);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoCurrencies");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | **String**| Returns Crypto Currencies traded on the given Crypto Exchange. | [optional]

### Return type

[**ApiResponseCryptoCurrencies**](ApiResponseCryptoCurrencies.md)

<a name="getCryptoExchanges"></a>
# **getCryptoExchanges**
> ApiResponseCryptoExchanges getCryptoExchanges(pair)

Crypto Exchanges

Returns a list of Crypto Exchanges for which prices are available.

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Filter exchanges based on whether or not prices are available on the exchange for the crypto currency pair.

    try {
        ApiResponseCryptoExchanges result = cryptoApi.getCryptoExchanges(pair);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoExchanges");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Filter exchanges based on whether or not prices are available on the exchange for the crypto currency pair. | [optional]

### Return type

[**ApiResponseCryptoExchanges**](ApiResponseCryptoExchanges.md)

<a name="getCryptoPairs"></a>
# **getCryptoPairs**
> ApiResponseCryptoPairs getCryptoPairs(exchange, currency, pageSize, nextPage)

Crypto Pairs

Returns a list of Crypto Currency Pairs for which data is available.

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

    CryptoApi cryptoApi = new CryptoApi();

    String exchange = "binance"; // String | Return pairs traded on the given Crypto Exchange.
    String currency = "BTC"; // String | Return pairs with one side being the given Crypto Currency.
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoPairs result = cryptoApi.getCryptoPairs(exchange, currency, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPairs");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | **String**| Return pairs traded on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return pairs with one side being the given Crypto Currency. | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoPairs**](ApiResponseCryptoPairs.md)

<a name="getCryptoPriceTechnicalsAdi"></a>
# **getCryptoPriceTechnicalsAdi**
> ApiResponseCryptoAccumulationDistributionIndex getCryptoPriceTechnicalsAdi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Accumulation/Distribution Index

Returns the Accumulation/Distribution Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoAccumulationDistributionIndex result = cryptoApi.getCryptoPriceTechnicalsAdi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsAdi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoAccumulationDistributionIndex**](ApiResponseCryptoAccumulationDistributionIndex.md)

<a name="getCryptoPriceTechnicalsAdtv"></a>
# **getCryptoPriceTechnicalsAdtv**
> ApiResponseCryptoAverageDailyTradingVolume getCryptoPriceTechnicalsAdtv(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Average Daily Trading Volume

Returns the Average Daily Trading Volume values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 22; // Integer | The number of observations, per period, to calculate Average Daily Trading Volume.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoAverageDailyTradingVolume result = cryptoApi.getCryptoPriceTechnicalsAdtv(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsAdtv");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Average Daily Trading Volume. | [optional] [default to 22]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoAverageDailyTradingVolume**](ApiResponseCryptoAverageDailyTradingVolume.md)

<a name="getCryptoPriceTechnicalsAdx"></a>
# **getCryptoPriceTechnicalsAdx**
> ApiResponseCryptoAverageDirectionalIndex getCryptoPriceTechnicalsAdx(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Average Directional Index

Returns the Average Directional Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 22; // Integer | The number of observations, per period, to calculate Average Directional Index.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoAverageDirectionalIndex result = cryptoApi.getCryptoPriceTechnicalsAdx(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsAdx");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Average Directional Index. | [optional] [default to 22]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoAverageDirectionalIndex**](ApiResponseCryptoAverageDirectionalIndex.md)

<a name="getCryptoPriceTechnicalsAo"></a>
# **getCryptoPriceTechnicalsAo**
> ApiResponseCryptoAwesomeOscillator getCryptoPriceTechnicalsAo(pair, exchange, currency, shortPeriod, longPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Awesome Oscillator

Returns the Awesome Oscillator values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer shortPeriod = 5; // Integer | The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator.
    Integer longPeriod = 34; // Integer | The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoAwesomeOscillator result = cryptoApi.getCryptoPriceTechnicalsAo(pair, exchange, currency, shortPeriod, longPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsAo");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **shortPeriod** | **Integer**| The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator. | [optional] [default to 5]
 **longPeriod** | **Integer**| The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator. | [optional] [default to 34]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoAwesomeOscillator**](ApiResponseCryptoAwesomeOscillator.md)

<a name="getCryptoPriceTechnicalsAtr"></a>
# **getCryptoPriceTechnicalsAtr**
> ApiResponseCryptoAverageTrueRange getCryptoPriceTechnicalsAtr(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Average True Range

Returns the Average True Range values of Crypto Currency Prices for Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 22; // Integer | The number of observations, per period, to calculate Average True Range.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoAverageTrueRange result = cryptoApi.getCryptoPriceTechnicalsAtr(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsAtr");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Average True Range. | [optional] [default to 22]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoAverageTrueRange**](ApiResponseCryptoAverageTrueRange.md)

<a name="getCryptoPriceTechnicalsBb"></a>
# **getCryptoPriceTechnicalsBb**
> ApiResponseCryptoBollingerBands getCryptoPriceTechnicalsBb(pair, exchange, currency, period, standardDeviations, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Bollinger Bands

Returns the Bollinger Bands values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 20; // Integer | The number of observations, per period, to calculate Bollinger Bands.
    Float standardDeviations = 2.0F; // Float | The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating Bollinger Bands.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoBollingerBands result = cryptoApi.getCryptoPriceTechnicalsBb(pair, exchange, currency, period, standardDeviations, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsBb");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Bollinger Bands. | [optional] [default to 20]
 **standardDeviations** | **Float**| The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands. | [optional] [default to 2.0]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating Bollinger Bands. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoBollingerBands**](ApiResponseCryptoBollingerBands.md)

<a name="getCryptoPriceTechnicalsCci"></a>
# **getCryptoPriceTechnicalsCci**
> ApiResponseCryptoCommodityChannelIndex getCryptoPriceTechnicalsCci(pair, exchange, currency, period, constant, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Commodity Channel Index

Returns the Commodity Channel Index values of Crypto Currency Prices for Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 20; // Integer | The number of observations, per period, to calculate Commodity Channel Index.
    Float constant = 0.015F; // Float | The number of observations, per period, to calculate Commodity Channel Index.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoCommodityChannelIndex result = cryptoApi.getCryptoPriceTechnicalsCci(pair, exchange, currency, period, constant, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsCci");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Commodity Channel Index. | [optional] [default to 20]
 **constant** | **Float**| The number of observations, per period, to calculate Commodity Channel Index. | [optional] [default to 0.015]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoCommodityChannelIndex**](ApiResponseCryptoCommodityChannelIndex.md)

<a name="getCryptoPriceTechnicalsCmf"></a>
# **getCryptoPriceTechnicalsCmf**
> ApiResponseCryptoChaikinMoneyFlow getCryptoPriceTechnicalsCmf(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Chaikin Money Flow

Returns the Chaikin Money Flow values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 20; // Integer | The number of observations, per period, to calculate Chaikin Money Flow.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoChaikinMoneyFlow result = cryptoApi.getCryptoPriceTechnicalsCmf(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsCmf");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Chaikin Money Flow. | [optional] [default to 20]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoChaikinMoneyFlow**](ApiResponseCryptoChaikinMoneyFlow.md)

<a name="getCryptoPriceTechnicalsDc"></a>
# **getCryptoPriceTechnicalsDc**
> ApiResponseCryptoDonchianChannel getCryptoPriceTechnicalsDc(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Donchian Channel

Returns the Donchian Channel values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 20; // Integer | The number of observations, per period, to calculate Donchian Channel.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating Donchian Channel.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoDonchianChannel result = cryptoApi.getCryptoPriceTechnicalsDc(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsDc");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Donchian Channel. | [optional] [default to 20]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating Donchian Channel. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoDonchianChannel**](ApiResponseCryptoDonchianChannel.md)

<a name="getCryptoPriceTechnicalsDpo"></a>
# **getCryptoPriceTechnicalsDpo**
> ApiResponseCryptoDetrendedPriceOscillator getCryptoPriceTechnicalsDpo(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Detrended Price Oscillator

Returns the Detrended Price Oscillator values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 20; // Integer | The number of observations, per period, to calculate Detrended Price Oscillator.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating Detrended Price Oscillator.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoDetrendedPriceOscillator result = cryptoApi.getCryptoPriceTechnicalsDpo(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsDpo");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Detrended Price Oscillator. | [optional] [default to 20]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating Detrended Price Oscillator. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoDetrendedPriceOscillator**](ApiResponseCryptoDetrendedPriceOscillator.md)

<a name="getCryptoPriceTechnicalsEom"></a>
# **getCryptoPriceTechnicalsEom**
> ApiResponseCryptoEaseOfMovement getCryptoPriceTechnicalsEom(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Ease of Movement

Returns the Ease of Movement values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 20; // Integer | The number of observations, per period, to calculate Ease of Movement.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoEaseOfMovement result = cryptoApi.getCryptoPriceTechnicalsEom(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsEom");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Ease of Movement. | [optional] [default to 20]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoEaseOfMovement**](ApiResponseCryptoEaseOfMovement.md)

<a name="getCryptoPriceTechnicalsFi"></a>
# **getCryptoPriceTechnicalsFi**
> ApiResponseCryptoForceIndex getCryptoPriceTechnicalsFi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Force Index

Returns the Force Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoForceIndex result = cryptoApi.getCryptoPriceTechnicalsFi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsFi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoForceIndex**](ApiResponseCryptoForceIndex.md)

<a name="getCryptoPriceTechnicalsIchimoku"></a>
# **getCryptoPriceTechnicalsIchimoku**
> ApiResponseCryptoIchimokuKinkoHyo getCryptoPriceTechnicalsIchimoku(pair, exchange, currency, lowPeriod, mediumPeriod, highPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Ichimoku Kinko Hyo

Returns the Ichimoku Kinko Hyo values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer lowPeriod = 9; // Integer | The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo.
    Integer mediumPeriod = 26; // Integer | The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo.
    Integer highPeriod = 52; // Integer | The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoIchimokuKinkoHyo result = cryptoApi.getCryptoPriceTechnicalsIchimoku(pair, exchange, currency, lowPeriod, mediumPeriod, highPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsIchimoku");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **lowPeriod** | **Integer**| The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo. | [optional] [default to 9]
 **mediumPeriod** | **Integer**| The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo. | [optional] [default to 26]
 **highPeriod** | **Integer**| The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo. | [optional] [default to 52]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoIchimokuKinkoHyo**](ApiResponseCryptoIchimokuKinkoHyo.md)

<a name="getCryptoPriceTechnicalsKc"></a>
# **getCryptoPriceTechnicalsKc**
> ApiResponseCryptoKeltnerChannel getCryptoPriceTechnicalsKc(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Keltner Channel

Returns the Keltner Channel values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 10; // Integer | The number of observations, per period, to calculate Kelter Channel.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoKeltnerChannel result = cryptoApi.getCryptoPriceTechnicalsKc(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsKc");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Kelter Channel. | [optional] [default to 10]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoKeltnerChannel**](ApiResponseCryptoKeltnerChannel.md)

<a name="getCryptoPriceTechnicalsKst"></a>
# **getCryptoPriceTechnicalsKst**
> ApiResponseCryptoKnowSureThing getCryptoPriceTechnicalsKst(pair, exchange, currency, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Know Sure Thing

Returns the Know Sure Thing values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer roc1 = 10; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA1.
    Integer roc2 = 15; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA2.
    Integer roc3 = 20; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA3.
    Integer roc4 = 30; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA4.
    Integer sma1 = 10; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1.
    Integer sma2 = 10; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2.
    Integer sma3 = 10; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3.
    Integer sma4 = 15; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating Know Sure Thing.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoKnowSureThing result = cryptoApi.getCryptoPriceTechnicalsKst(pair, exchange, currency, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsKst");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **roc1** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA1. | [optional] [default to 10]
 **roc2** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA2. | [optional] [default to 15]
 **roc3** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA3. | [optional] [default to 20]
 **roc4** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA4. | [optional] [default to 30]
 **sma1** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1. | [optional] [default to 10]
 **sma2** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2. | [optional] [default to 10]
 **sma3** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3. | [optional] [default to 10]
 **sma4** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4. | [optional] [default to 15]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating Know Sure Thing. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoKnowSureThing**](ApiResponseCryptoKnowSureThing.md)

<a name="getCryptoPriceTechnicalsMacd"></a>
# **getCryptoPriceTechnicalsMacd**
> ApiResponseCryptoMovingAverageConvergenceDivergence getCryptoPriceTechnicalsMacd(pair, exchange, currency, fastPeriod, slowPeriod, signalPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Moving Average Convergence Divergence

Returns the Moving Average Convergence Divergence values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer fastPeriod = 12; // Integer | The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence.
    Integer slowPeriod = 26; // Integer | The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence.
    Integer signalPeriod = 9; // Integer | The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating Moving Average Convergence Divergence.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoMovingAverageConvergenceDivergence result = cryptoApi.getCryptoPriceTechnicalsMacd(pair, exchange, currency, fastPeriod, slowPeriod, signalPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsMacd");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **fastPeriod** | **Integer**| The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence. | [optional] [default to 12]
 **slowPeriod** | **Integer**| The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence. | [optional] [default to 26]
 **signalPeriod** | **Integer**| The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence. | [optional] [default to 9]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating Moving Average Convergence Divergence. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoMovingAverageConvergenceDivergence**](ApiResponseCryptoMovingAverageConvergenceDivergence.md)

<a name="getCryptoPriceTechnicalsMfi"></a>
# **getCryptoPriceTechnicalsMfi**
> ApiResponseCryptoMoneyFlowIndex getCryptoPriceTechnicalsMfi(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Money Flow Index

Returns the Money Flow Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 14; // Integer | The number of observations, per period, to calculate Money Flow Index.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoMoneyFlowIndex result = cryptoApi.getCryptoPriceTechnicalsMfi(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsMfi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Money Flow Index. | [optional] [default to 14]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoMoneyFlowIndex**](ApiResponseCryptoMoneyFlowIndex.md)

<a name="getCryptoPriceTechnicalsMi"></a>
# **getCryptoPriceTechnicalsMi**
> ApiResponseCryptoMassIndex getCryptoPriceTechnicalsMi(pair, exchange, currency, emaPeriod, sumPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Mass Index

Returns the Mass Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer emaPeriod = 9; // Integer | The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index.
    Integer sumPeriod = 25; // Integer | The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoMassIndex result = cryptoApi.getCryptoPriceTechnicalsMi(pair, exchange, currency, emaPeriod, sumPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsMi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **emaPeriod** | **Integer**| The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index. | [optional] [default to 9]
 **sumPeriod** | **Integer**| The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index. | [optional] [default to 25]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoMassIndex**](ApiResponseCryptoMassIndex.md)

<a name="getCryptoPriceTechnicalsNvi"></a>
# **getCryptoPriceTechnicalsNvi**
> ApiResponseCryptoNegativeVolumeIndex getCryptoPriceTechnicalsNvi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Negative Volume Index

Returns the Negative Volume Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoNegativeVolumeIndex result = cryptoApi.getCryptoPriceTechnicalsNvi(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsNvi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoNegativeVolumeIndex**](ApiResponseCryptoNegativeVolumeIndex.md)

<a name="getCryptoPriceTechnicalsObv"></a>
# **getCryptoPriceTechnicalsObv**
> ApiResponseCryptoOnBalanceVolume getCryptoPriceTechnicalsObv(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

On-balance Volume

Returns the On-balance Volume values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoOnBalanceVolume result = cryptoApi.getCryptoPriceTechnicalsObv(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsObv");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoOnBalanceVolume**](ApiResponseCryptoOnBalanceVolume.md)

<a name="getCryptoPriceTechnicalsObvMean"></a>
# **getCryptoPriceTechnicalsObvMean**
> ApiResponseCryptoOnBalanceVolumeMean getCryptoPriceTechnicalsObvMean(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

On-balance Volume Mean

Returns the On-balance Volume Mean values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 10; // Integer | The number of observations, per period, to calculate On-balance Volume Mean.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoOnBalanceVolumeMean result = cryptoApi.getCryptoPriceTechnicalsObvMean(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsObvMean");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate On-balance Volume Mean. | [optional] [default to 10]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoOnBalanceVolumeMean**](ApiResponseCryptoOnBalanceVolumeMean.md)

<a name="getCryptoPriceTechnicalsRsi"></a>
# **getCryptoPriceTechnicalsRsi**
> ApiResponseCryptoRelativeStrengthIndex getCryptoPriceTechnicalsRsi(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Relative Strength Index

Returns the Relative Strength Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 14; // Integer | The number of observations, per period, to calculate Relative Strength Index.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating Relative Strength Index.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoRelativeStrengthIndex result = cryptoApi.getCryptoPriceTechnicalsRsi(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsRsi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Relative Strength Index. | [optional] [default to 14]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating Relative Strength Index. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoRelativeStrengthIndex**](ApiResponseCryptoRelativeStrengthIndex.md)

<a name="getCryptoPriceTechnicalsSma"></a>
# **getCryptoPriceTechnicalsSma**
> ApiResponseCryptoSimpleMovingAverage getCryptoPriceTechnicalsSma(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Simple Moving Average

Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 20; // Integer | The number of observations, per period, to calculate Simple Moving Average.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating Simple Moving Average.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoSimpleMovingAverage result = cryptoApi.getCryptoPriceTechnicalsSma(pair, exchange, currency, period, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsSma");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Simple Moving Average. | [optional] [default to 20]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating Simple Moving Average. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoSimpleMovingAverage**](ApiResponseCryptoSimpleMovingAverage.md)

<a name="getCryptoPriceTechnicalsSr"></a>
# **getCryptoPriceTechnicalsSr**
> ApiResponseCryptoStochasticOscillator getCryptoPriceTechnicalsSr(pair, exchange, currency, period, signalPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Stochastic Oscillator

Returns the Stochastic Oscillator values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 14; // Integer | The number of observations, per period, to calculate %K of Stochastic Oscillator.
    Integer signalPeriod = 3; // Integer | The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoStochasticOscillator result = cryptoApi.getCryptoPriceTechnicalsSr(pair, exchange, currency, period, signalPeriod, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsSr");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate %K of Stochastic Oscillator. | [optional] [default to 14]
 **signalPeriod** | **Integer**| The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator. | [optional] [default to 3]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoStochasticOscillator**](ApiResponseCryptoStochasticOscillator.md)

<a name="getCryptoPriceTechnicalsTrix"></a>
# **getCryptoPriceTechnicalsTrix**
> ApiResponseCryptoTripleExponentialAverage getCryptoPriceTechnicalsTrix(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Triple Exponential Average

Returns the Simple Moving Average values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 15; // Integer | The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoTripleExponentialAverage result = cryptoApi.getCryptoPriceTechnicalsTrix(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsTrix");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average. | [optional] [default to 15]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoTripleExponentialAverage**](ApiResponseCryptoTripleExponentialAverage.md)

<a name="getCryptoPriceTechnicalsTsi"></a>
# **getCryptoPriceTechnicalsTsi**
> ApiResponseCryptoTrueStrengthIndex getCryptoPriceTechnicalsTsi(pair, exchange, currency, lowPeriod, highPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

True Strength Index

Returns the True Strength Index values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer lowPeriod = 13; // Integer | The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index.
    Integer highPeriod = 25; // Integer | The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index.
    String priceKey = "close"; // String | The Crypto Currency Price field to use when calculating True Strength Index.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoTrueStrengthIndex result = cryptoApi.getCryptoPriceTechnicalsTsi(pair, exchange, currency, lowPeriod, highPeriod, priceKey, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsTsi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **lowPeriod** | **Integer**| The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index. | [optional] [default to 13]
 **highPeriod** | **Integer**| The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index. | [optional] [default to 25]
 **priceKey** | **String**| The Crypto Currency Price field to use when calculating True Strength Index. | [optional] [default to close] [enum: open, high, low, close, volume]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoTrueStrengthIndex**](ApiResponseCryptoTrueStrengthIndex.md)

<a name="getCryptoPriceTechnicalsUo"></a>
# **getCryptoPriceTechnicalsUo**
> ApiResponseCryptoUltimateOscillator getCryptoPriceTechnicalsUo(pair, exchange, currency, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Ultimate Oscillator

Returns the Ultimate Oscillator values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer shortPeriod = 7; // Integer | The number of observations, per period, to calculate the short period for Ultimate Oscillator.
    Integer mediumPeriod = 14; // Integer | The number of observations, per period, to calculate the medium period for Ultimate Oscillator.
    Integer longPeriod = 28; // Integer | The number of observations, per period, to calculate the long period for Ultimate Oscillator.
    Float shortWeight = 4.0F; // Float | The weight of short Buying Pressure average for Ultimate Oscillator.
    Float mediumWeight = 2.0F; // Float | The weight of medium Buying Pressure average for Ultimate Oscillator.
    Float longWeight = 1.0F; // Float | The weight of long Buying Pressure average for Ultimate Oscillator.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoUltimateOscillator result = cryptoApi.getCryptoPriceTechnicalsUo(pair, exchange, currency, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsUo");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **shortPeriod** | **Integer**| The number of observations, per period, to calculate the short period for Ultimate Oscillator. | [optional] [default to 7]
 **mediumPeriod** | **Integer**| The number of observations, per period, to calculate the medium period for Ultimate Oscillator. | [optional] [default to 14]
 **longPeriod** | **Integer**| The number of observations, per period, to calculate the long period for Ultimate Oscillator. | [optional] [default to 28]
 **shortWeight** | **Float**| The weight of short Buying Pressure average for Ultimate Oscillator. | [optional] [default to 4.0]
 **mediumWeight** | **Float**| The weight of medium Buying Pressure average for Ultimate Oscillator. | [optional] [default to 2.0]
 **longWeight** | **Float**| The weight of long Buying Pressure average for Ultimate Oscillator. | [optional] [default to 1.0]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoUltimateOscillator**](ApiResponseCryptoUltimateOscillator.md)

<a name="getCryptoPriceTechnicalsVi"></a>
# **getCryptoPriceTechnicalsVi**
> ApiResponseCryptoVortexIndicator getCryptoPriceTechnicalsVi(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Vortex Indicator

Returns the Vortex Indicator values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 14; // Integer | The number of observations, per period, to calculate Vortex Indicator.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoVortexIndicator result = cryptoApi.getCryptoPriceTechnicalsVi(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsVi");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to calculate Vortex Indicator. | [optional] [default to 14]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoVortexIndicator**](ApiResponseCryptoVortexIndicator.md)

<a name="getCryptoPriceTechnicalsVpt"></a>
# **getCryptoPriceTechnicalsVpt**
> ApiResponseCryptoVolumePriceTrend getCryptoPriceTechnicalsVpt(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Volume-price Trend

Returns the Volume-price Trend values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoVolumePriceTrend result = cryptoApi.getCryptoPriceTechnicalsVpt(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsVpt");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoVolumePriceTrend**](ApiResponseCryptoVolumePriceTrend.md)

<a name="getCryptoPriceTechnicalsVwap"></a>
# **getCryptoPriceTechnicalsVwap**
> ApiResponseCryptoVolumeWeightedAveragePrice getCryptoPriceTechnicalsVwap(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Volume Weighted Average Price

Returns the Volume Weighted Average Price values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoVolumeWeightedAveragePrice result = cryptoApi.getCryptoPriceTechnicalsVwap(pair, exchange, currency, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsVwap");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoVolumeWeightedAveragePrice**](ApiResponseCryptoVolumeWeightedAveragePrice.md)

<a name="getCryptoPriceTechnicalsWr"></a>
# **getCryptoPriceTechnicalsWr**
> ApiResponseCryptoWilliamsR getCryptoPriceTechnicalsWr(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Williams %R

Returns the Williams %R values of Crypto Currency Prices for a Crypto Currency Pair

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return technicals for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return technicals for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return technicals for the given Crypto Currency.
    Integer period = 14; // Integer | The number of observations, per period, to look-back when calculating Williams %R.
    String timeframe = "d1"; // String | The time interval for the prices when calculating technicals.
    String timezone = "UTC"; // String | Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return technicals on or after this date.
    String startTime = null; // String | Return technicals at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return technicals on or before this date.
    String endTime = null; // String | Return technicals at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoWilliamsR result = cryptoApi.getCryptoPriceTechnicalsWr(pair, exchange, currency, period, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPriceTechnicalsWr");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return technicals for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return technicals for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return technicals for the given Crypto Currency. | [optional]
 **period** | **Integer**| The number of observations, per period, to look-back when calculating Williams %R. | [optional] [default to 14]
 **timeframe** | **String**| The time interval for the prices when calculating technicals. | [optional] [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **timezone** | **String**| Return technical date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return technicals on or after this date. | [optional]
 **startTime** | **String**| Return technicals at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return technicals on or before this date. | [optional]
 **endTime** | **String**| Return technicals at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoWilliamsR**](ApiResponseCryptoWilliamsR.md)

<a name="getCryptoPrices"></a>
# **getCryptoPrices**
> ApiResponseCryptoPrices getCryptoPrices(timeframe, pair, exchange, currency, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Crypto Prices

Returns a list of available Crypto Currency Prices.

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

    CryptoApi cryptoApi = new CryptoApi();

    String timeframe = "d1"; // String | The time interval for the prices.
    String pair = "btcusd"; // String | Return prices for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return prices for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return prices for the given Crypto Currency.
    String timezone = "UTC"; // String | Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    LocalDate startDate = null; // LocalDate | Return Crypto Prices on or after this date.
    String startTime = null; // String | Return Crypto Prices at or after this time (24-hour).
    LocalDate endDate = null; // LocalDate | Return Crypto Prices on or before this date.
    String endTime = null; // String | Return Crypto Prices at or before this time (24-hour).
    Integer pageSize = 100; // Integer | An integer greater than or equal to 1 for specifying the number of results on each page.
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseCryptoPrices result = cryptoApi.getCryptoPrices(timeframe, pair, exchange, currency, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoPrices");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeframe** | **String**| The time interval for the prices. | [default to d1] [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **pair** | **String**| Return prices for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return prices for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return prices for the given Crypto Currency. | [optional]
 **timezone** | **String**| Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **LocalDate**| Return Crypto Prices on or after this date. | [optional]
 **startTime** | **String**| Return Crypto Prices at or after this time (24-hour). | [optional]
 **endDate** | **LocalDate**| Return Crypto Prices on or before this date. | [optional]
 **endTime** | **String**| Return Crypto Prices at or before this time (24-hour). | [optional]
 **pageSize** | **Integer**| An integer greater than or equal to 1 for specifying the number of results on each page. | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseCryptoPrices**](ApiResponseCryptoPrices.md)

<a name="getCryptoSnapshot"></a>
# **getCryptoSnapshot**
> ApiResponseCryptoSnapshot getCryptoSnapshot(pair, exchange, currency)

Crypto Snapshot

Returns a market snapshot over that last 24 hours for the given currency pair and exchange.

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

    CryptoApi cryptoApi = new CryptoApi();

    String pair = "btcusd"; // String | Return the snapshot for the given Crypto Currency Pair.
    String exchange = "binance"; // String | Return the snapshot for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return the snapshot for the given Crypto Currency.

    try {
        ApiResponseCryptoSnapshot result = cryptoApi.getCryptoSnapshot(pair, exchange, currency);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoSnapshot");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| Return the snapshot for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return the snapshot for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return the snapshot for the given Crypto Currency. | [optional]

### Return type

[**ApiResponseCryptoSnapshot**](ApiResponseCryptoSnapshot.md)

<a name="getCryptoStats"></a>
# **getCryptoStats**
> ApiResponseCryptoStats getCryptoStats(exchange, currency)

Crypto Stats

Returns available stats on Crypto Currencies.

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

    CryptoApi cryptoApi = new CryptoApi();

    String exchange = "binance"; // String | Returns stats for Crypto Currencies that trade on the specified Crypto Exchange.
    String currency = "BTC"; // String | Returns stats for the specified Crypto Currency.

    try {
        ApiResponseCryptoStats result = cryptoApi.getCryptoStats(exchange, currency);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling CryptoApi#getCryptoStats");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchange** | **String**| Returns stats for Crypto Currencies that trade on the specified Crypto Exchange. | [optional]
 **currency** | **String**| Returns stats for the specified Crypto Currency. | [optional]

### Return type

[**ApiResponseCryptoStats**](ApiResponseCryptoStats.md)

