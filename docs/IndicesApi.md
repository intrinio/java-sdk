# IndicesApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndexIntervals**](IndicesApi.md#getIndexIntervals) | **GET** /indices/{identifier}/intervals | Index Intervals



[//]: # (START_OPERATION)

[//]: # (CLASS:IndicesApi)

[//]: # (METHOD:getIndexIntervals)

[//]: # (RETURN_TYPE:ApiResponseIndexIntervals)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseIndexIntervals.md)

[//]: # (OPERATION:getIndexIntervals_v2)

[//]: # (ENDPOINT:/indices/{identifier}/intervals)

[//]: # (DOCUMENT_LINK:IndicesApi.md#getIndexIntervals)

<a name="getIndexIntervals"></a>
## **getIndexIntervals**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getIndexIntervals_v2)

[//]: # (START_OVERVIEW)

> ApiResponseIndexIntervals getIndexIntervals(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize)

#### Index Intervals


Returns a list of interval data points for a specified index, including open, close, high, low, volume, and average price. Intervals are available in 60-minute, 30-minute, 15-minute, 10-minute, 5-minute, and 1-minute increments.

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

    IndicesApi indicesApi = new IndicesApi();
    String identifier = "SPX";
    String intervalSize = "5m";
    LocalDate startDate = LocalDate.of(2023,1,01);
    String startTime = "33300";
    LocalDate endDate = LocalDate.of(2023,2,01);
    String endTime = "33300";
    String timezone = "UTC";
    Integer pageSize = 100;
    ApiResponseIndexIntervals result = indicesApi.getIndexIntervals(identifier, intervalSize, startDate, startTime, endDate, endTime, timezone, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The index identifier | &nbsp;
 **intervalSize** | String| The interval size to return in minutes (m) or hour (h). | [default to 5m] [enum: 1m, 5m, 10m, 15m, 30m, 60m, 1h] &nbsp;
 **startDate** | LocalDate| Return intervals starting at the specified date | [optional] &nbsp;
 **startTime** | String| Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) | [optional] &nbsp;
 **endDate** | LocalDate| Return intervals stopping at the specified date | [optional] &nbsp;
 **endTime** | String| Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) | [optional] &nbsp;
 **timezone** | String| Interprets the input times in this time zone, as well as returns times in this timezone. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu] &nbsp;
 **pageSize** | Integer| The number of results to return per page. | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseIndexIntervals**](ApiResponseIndexIntervals.md)

[//]: # (END_OPERATION)

