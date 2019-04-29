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
    String exchange = "gemini"; // String | Return the order book asks for a Crypto Currency on the given Crypto Exchange.
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
    String exchange = "gemini"; // String | Return the order book bids for a Crypto Currency on the given Crypto Exchange.
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

    Integer levels = 50; // Integer | The number of prices/levels to return on each side. For example, the max of 50 levels will return up to 50 bid prices and 50 ask prices.
    String pair = "btcusd"; // String | Return the order book summary for the given Crypto Currency Pair.
    String exchange = "gemini"; // String | Return the order book summary for a Crypto Currency on the given Crypto Exchange.
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

    String exchange = "gemini"; // String | Returns Crypto Currencies traded on the given Crypto Exchange.

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

    String pair = "btcusd"; // String | Returns Crypto Currencies traded on the given Crypto Exchange.

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
 **pair** | **String**| Returns Crypto Currencies traded on the given Crypto Exchange. | [optional]

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

    String exchange = "gemini"; // String | Return pairs traded on the given Crypto Exchange.
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

    String timeframe = "h1"; // String | The time interval for the prices.
    String pair = "btcusd"; // String | Return prices for the given Crypto Currency Pair.
    String exchange = "gemini"; // String | Return prices for a Crypto Currency on the given Crypto Exchange.
    String currency = "BTC"; // String | Return prices for the given Crypto Currency.
    String timezone = "UTC"; // String | Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone.
    String startDate = "2018-01-01"; // String | Return Crypto Prices on or after this date.
    String startTime = "14:20:00"; // String | Return Crypto Prices at or after this time (24-hour).
    String endDate = "2019-01-01"; // String | Return Crypto Prices on or before this date.
    String endTime = "21:01:21"; // String | Return Crypto Prices at or before this time (24-hour).
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
 **timeframe** | **String**| The time interval for the prices. | [enum: d1, h8, h6, h4, h3, h2, h1, m30, m15, m5, m1]
 **pair** | **String**| Return prices for the given Crypto Currency Pair. | [optional]
 **exchange** | **String**| Return prices for a Crypto Currency on the given Crypto Exchange. | [optional]
 **currency** | **String**| Return prices for the given Crypto Currency. | [optional]
 **timezone** | **String**| Return price date/times in this timezone, also interpret start/end date/time parameters in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **String**| Return Crypto Prices on or after this date. | [optional]
 **startTime** | **String**| Return Crypto Prices at or after this time (24-hour). | [optional]
 **endDate** | **String**| Return Crypto Prices on or before this date. | [optional]
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
    String exchange = "gemini"; // String | Return the snapshot for a Crypto Currency on the given Crypto Exchange.
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

    String exchange = "gemini"; // String | Returns stats for Crypto Currencies that trade on the specified Crypto Exchange.
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

