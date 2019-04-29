# ForexApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getForexCurrencies**](ForexApi.md#getForexCurrencies) | **GET** /forex/currencies | Forex Currencies
[**getForexPairs**](ForexApi.md#getForexPairs) | **GET** /forex/pairs | Forex Currency Pairs
[**getForexPrices**](ForexApi.md#getForexPrices) | **GET** /forex/prices/{pair}/{timeframe} | Forex Currency Prices


<a name="getForexCurrencies"></a>
# **getForexCurrencies**
> ApiResponseForexCurrencies getForexCurrencies()

Forex Currencies

Returns a list of forex currencies for which prices are available.

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

    ForexApi forexApi = new ForexApi();


    try {
        ApiResponseForexCurrencies result = forexApi.getForexCurrencies();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ForexApi#getForexCurrencies");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseForexCurrencies**](ApiResponseForexCurrencies.md)

<a name="getForexPairs"></a>
# **getForexPairs**
> ApiResponseForexPairs getForexPairs()

Forex Currency Pairs

Returns a list of currency pairs used to request foreign exchange (forex) market price data. The currency that is used as the reference is called quote currency and the currency that is quoted in relation is called the base currency. For example, in the pair code “EURGBP” with a price of 0.88, one Euro (base currency) can be exchanged for 0.88 British Pounds (quote currency).

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

    ForexApi forexApi = new ForexApi();


    try {
        ApiResponseForexPairs result = forexApi.getForexPairs();
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ForexApi#getForexPairs");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiResponseForexPairs**](ApiResponseForexPairs.md)

<a name="getForexPrices"></a>
# **getForexPrices**
> ApiResponseForexPrices getForexPrices(pair, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage)

Forex Currency Prices

Provides a list of forex price quotes for a given forex currency pair and timeframe.

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

    ForexApi forexApi = new ForexApi();

    String pair = "EURUSD"; // String | The Forex Currency Pair code
    String timeframe = "D1"; // String | The time interval for the quotes
    String timezone = "UTC"; // String | Returns trading times in this timezone
    String startDate = "2018-01-01"; // String | Return Forex Prices on or after this date
    String startTime = "14:20:00"; // String | Return Forex Prices at or after this time (24-hour)
    String endDate = "2019-01-01"; // String | Return Forex Prices on or before this date
    String endTime = "21:01:21"; // String | Return Forex Prices at or before this time (24-hour)
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
        ApiResponseForexPrices result = forexApi.getForexPrices(pair, timeframe, timezone, startDate, startTime, endDate, endTime, pageSize, nextPage);
        System.out.println(result);
    } catch (ApiException e) {
        System.err.println("Exception when calling ForexApi#getForexPrices");
        e.printStackTrace();
    }
  
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pair** | **String**| The Forex Currency Pair code |
 **timeframe** | **String**| The time interval for the quotes | [enum: m1, m5, m15, m30, H1, H2, H3, H4, H6, H8, D1, W1, M1]
 **timezone** | **String**| Returns trading times in this timezone | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu]
 **startDate** | **String**| Return Forex Prices on or after this date | [optional]
 **startTime** | **String**| Return Forex Prices at or after this time (24-hour) | [optional]
 **endDate** | **String**| Return Forex Prices on or before this date | [optional]
 **endTime** | **String**| Return Forex Prices at or before this time (24-hour) | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseForexPrices**](ApiResponseForexPrices.md)

