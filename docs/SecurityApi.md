# SecurityApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSecurities**](SecurityApi.md#getAllSecurities) | **GET** /securities | All Securities
[**getSecurityById**](SecurityApi.md#getSecurityById) | **GET** /securities/{identifier} | Lookup Security
[**getSecurityDataPointNumber**](SecurityApi.md#getSecurityDataPointNumber) | **GET** /securities/{identifier}/data_point/{tag}/number | Data Point (Number) for Security
[**getSecurityDataPointText**](SecurityApi.md#getSecurityDataPointText) | **GET** /securities/{identifier}/data_point/{tag}/text | Data Point (Text) for Security
[**getSecurityHistoricalData**](SecurityApi.md#getSecurityHistoricalData) | **GET** /securities/{identifier}/historical_data/{tag} | Historical Data for Security
[**getSecurityIntradayPrices**](SecurityApi.md#getSecurityIntradayPrices) | **GET** /securities/{identifier}/prices/intraday | Intraday Stock Prices for Security
[**getSecurityLatestDividendRecord**](SecurityApi.md#getSecurityLatestDividendRecord) | **GET** /securities/{identifier}/dividends/latest | Lastest Dividend Record for Security
[**getSecurityLatestEarningsRecord**](SecurityApi.md#getSecurityLatestEarningsRecord) | **GET** /securities/{identifier}/earnings/latest | Lastest Earnings Record for Security
[**getSecurityPriceTechnicalsAdi**](SecurityApi.md#getSecurityPriceTechnicalsAdi) | **GET** /securities/{identifier}/prices/technicals/adi | Accumulation/Distribution Index
[**getSecurityPriceTechnicalsAdtv**](SecurityApi.md#getSecurityPriceTechnicalsAdtv) | **GET** /securities/{identifier}/prices/technicals/adtv | Average Daily Trading Volume
[**getSecurityPriceTechnicalsAdx**](SecurityApi.md#getSecurityPriceTechnicalsAdx) | **GET** /securities/{identifier}/prices/technicals/adx | Average Directional Index
[**getSecurityPriceTechnicalsAo**](SecurityApi.md#getSecurityPriceTechnicalsAo) | **GET** /securities/{identifier}/prices/technicals/ao | Awesome Oscillator
[**getSecurityPriceTechnicalsAtr**](SecurityApi.md#getSecurityPriceTechnicalsAtr) | **GET** /securities/{identifier}/prices/technicals/atr | Average True Range
[**getSecurityPriceTechnicalsBb**](SecurityApi.md#getSecurityPriceTechnicalsBb) | **GET** /securities/{identifier}/prices/technicals/bb | Bollinger Bands
[**getSecurityPriceTechnicalsCci**](SecurityApi.md#getSecurityPriceTechnicalsCci) | **GET** /securities/{identifier}/prices/technicals/cci | Commodity Channel Index
[**getSecurityPriceTechnicalsCmf**](SecurityApi.md#getSecurityPriceTechnicalsCmf) | **GET** /securities/{identifier}/prices/technicals/cmf | Chaikin Money Flow
[**getSecurityPriceTechnicalsDc**](SecurityApi.md#getSecurityPriceTechnicalsDc) | **GET** /securities/{identifier}/prices/technicals/dc | Donchian Channel
[**getSecurityPriceTechnicalsDpo**](SecurityApi.md#getSecurityPriceTechnicalsDpo) | **GET** /securities/{identifier}/prices/technicals/dpo | Detrended Price Oscillator
[**getSecurityPriceTechnicalsEom**](SecurityApi.md#getSecurityPriceTechnicalsEom) | **GET** /securities/{identifier}/prices/technicals/eom | Ease of Movement
[**getSecurityPriceTechnicalsFi**](SecurityApi.md#getSecurityPriceTechnicalsFi) | **GET** /securities/{identifier}/prices/technicals/fi | Force Index
[**getSecurityPriceTechnicalsIchimoku**](SecurityApi.md#getSecurityPriceTechnicalsIchimoku) | **GET** /securities/{identifier}/prices/technicals/ichimoku | Ichimoku Kinko Hyo
[**getSecurityPriceTechnicalsKc**](SecurityApi.md#getSecurityPriceTechnicalsKc) | **GET** /securities/{identifier}/prices/technicals/kc | Keltner Channel
[**getSecurityPriceTechnicalsKst**](SecurityApi.md#getSecurityPriceTechnicalsKst) | **GET** /securities/{identifier}/prices/technicals/kst | Know Sure Thing
[**getSecurityPriceTechnicalsMacd**](SecurityApi.md#getSecurityPriceTechnicalsMacd) | **GET** /securities/{identifier}/prices/technicals/macd | Moving Average Convergence Divergence
[**getSecurityPriceTechnicalsMfi**](SecurityApi.md#getSecurityPriceTechnicalsMfi) | **GET** /securities/{identifier}/prices/technicals/mfi | Money Flow Index
[**getSecurityPriceTechnicalsMi**](SecurityApi.md#getSecurityPriceTechnicalsMi) | **GET** /securities/{identifier}/prices/technicals/mi | Mass Index
[**getSecurityPriceTechnicalsNvi**](SecurityApi.md#getSecurityPriceTechnicalsNvi) | **GET** /securities/{identifier}/prices/technicals/nvi | Negative Volume Index
[**getSecurityPriceTechnicalsObv**](SecurityApi.md#getSecurityPriceTechnicalsObv) | **GET** /securities/{identifier}/prices/technicals/obv | On-balance Volume
[**getSecurityPriceTechnicalsObvMean**](SecurityApi.md#getSecurityPriceTechnicalsObvMean) | **GET** /securities/{identifier}/prices/technicals/obv_mean | On-balance Volume Mean
[**getSecurityPriceTechnicalsRsi**](SecurityApi.md#getSecurityPriceTechnicalsRsi) | **GET** /securities/{identifier}/prices/technicals/rsi | Relative Strength Index
[**getSecurityPriceTechnicalsSma**](SecurityApi.md#getSecurityPriceTechnicalsSma) | **GET** /securities/{identifier}/prices/technicals/sma | Simple Moving Average
[**getSecurityPriceTechnicalsSr**](SecurityApi.md#getSecurityPriceTechnicalsSr) | **GET** /securities/{identifier}/prices/technicals/sr | Stochastic Oscillator
[**getSecurityPriceTechnicalsTrix**](SecurityApi.md#getSecurityPriceTechnicalsTrix) | **GET** /securities/{identifier}/prices/technicals/trix | Triple Exponential Average
[**getSecurityPriceTechnicalsTsi**](SecurityApi.md#getSecurityPriceTechnicalsTsi) | **GET** /securities/{identifier}/prices/technicals/tsi | True Strength Index
[**getSecurityPriceTechnicalsUo**](SecurityApi.md#getSecurityPriceTechnicalsUo) | **GET** /securities/{identifier}/prices/technicals/uo | Ultimate Oscillator
[**getSecurityPriceTechnicalsVi**](SecurityApi.md#getSecurityPriceTechnicalsVi) | **GET** /securities/{identifier}/prices/technicals/vi | Vortex Indicator
[**getSecurityPriceTechnicalsVpt**](SecurityApi.md#getSecurityPriceTechnicalsVpt) | **GET** /securities/{identifier}/prices/technicals/vpt | Volume-price Trend
[**getSecurityPriceTechnicalsVwap**](SecurityApi.md#getSecurityPriceTechnicalsVwap) | **GET** /securities/{identifier}/prices/technicals/vwap | Volume Weighted Average Price
[**getSecurityPriceTechnicalsWr**](SecurityApi.md#getSecurityPriceTechnicalsWr) | **GET** /securities/{identifier}/prices/technicals/wr | Williams %R
[**getSecurityRealtimePrice**](SecurityApi.md#getSecurityRealtimePrice) | **GET** /securities/{identifier}/prices/realtime | Realtime Stock Price for Security
[**getSecurityStockPriceAdjustments**](SecurityApi.md#getSecurityStockPriceAdjustments) | **GET** /securities/{identifier}/prices/adjustments | Stock Price Adjustments by Security
[**getSecurityStockPrices**](SecurityApi.md#getSecurityStockPrices) | **GET** /securities/{identifier}/prices | Stock Prices by Security
[**screenSecurities**](SecurityApi.md#screenSecurities) | **POST** /securities/screen | Screen Securities
[**searchSecurities**](SecurityApi.md#searchSecurities) | **GET** /securities/search | Search Securities


<a name="getAllSecurities"></a>
# **getAllSecurities**
> ApiResponseSecurities getAllSecurities(pageSize, nextPage)

All Securities

Returns all Securities to which you have access.

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurities result = securityApi.getAllSecurities(pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getAllSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurities**](ApiResponseSecurities.md)

<a name="getSecurityById"></a>
# **getSecurityById**
> Security getSecurityById(identifier)

Lookup Security

Returns the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

try {
    Security result = securityApi.getSecurityById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |

### Return type

[**Security**](Security.md)

<a name="getSecurityDataPointNumber"></a>
# **getSecurityDataPointNumber**
> BigDecimal getSecurityDataPointNumber(identifier, tag)

Data Point (Number) for Security

Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String tag = "close_price"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)

try {
    BigDecimal result = securityApi.getSecurityDataPointNumber(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityDataPointNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) |

### Return type

[**BigDecimal**](BigDecimal.md)

<a name="getSecurityDataPointText"></a>
# **getSecurityDataPointText**
> String getSecurityDataPointText(identifier, tag)

Data Point (Text) for Security

Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String tag = "figi"; // String | An Intrinio data tag ID or code-name

try {
    String result = securityApi.getSecurityDataPointText(identifier, tag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityDataPointText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code-name |

### Return type

**String**

<a name="getSecurityHistoricalData"></a>
# **getSecurityHistoricalData**
> ApiResponseSecurityHistoricalData getSecurityHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage)

Historical Data for Security

Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String tag = "adj_close_price"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)
String frequency = "daily"; // String | Return historical data in the given frequency
String type = null; // String | Filter by type, when applicable
LocalDate startDate = null; // LocalDate | Get historical data on or after this date
LocalDate endDate = null; // LocalDate | Get historical date on or before this date
String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityHistoricalData result = securityApi.getSecurityHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityHistoricalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **tag** | **String**| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) |
 **frequency** | **String**| Return historical data in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly]
 **type** | **String**| Filter by type, when applicable | [optional]
 **startDate** | **LocalDate**| Get historical data on or after this date | [optional]
 **endDate** | **LocalDate**| Get historical date on or before this date | [optional]
 **sortOrder** | **String**| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityHistoricalData**](ApiResponseSecurityHistoricalData.md)

<a name="getSecurityIntradayPrices"></a>
# **getSecurityIntradayPrices**
> ApiResponseSecurityIntradayPrices getSecurityIntradayPrices(identifier, source, startDate, startTime, endDate, endTime)

Intraday Stock Prices for Security

Return intraday stock prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String source = null; // String | Return intraday prices from the specified data source
LocalDate startDate = null; // LocalDate | Return intraday prices starting at the specified date
String startTime = "4200"; // String | Return intraday prices starting at the specified time on the `start_date` (timezone is UTC)
LocalDate endDate = null; // LocalDate | Return intraday prices stopping at the specified date
String endTime = "4200"; // String | Return intraday prices stopping at the specified time on the `end_date` (timezone is UTC)

try {
    ApiResponseSecurityIntradayPrices result = securityApi.getSecurityIntradayPrices(identifier, source, startDate, startTime, endDate, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityIntradayPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **source** | **String**| Return intraday prices from the specified data source | [optional] [enum: iex, bats]
 **startDate** | **LocalDate**| Return intraday prices starting at the specified date | [optional]
 **startTime** | **String**| Return intraday prices starting at the specified time on the &#x60;start_date&#x60; (timezone is UTC) | [optional]
 **endDate** | **LocalDate**| Return intraday prices stopping at the specified date | [optional]
 **endTime** | **String**| Return intraday prices stopping at the specified time on the &#x60;end_date&#x60; (timezone is UTC) | [optional]

### Return type

[**ApiResponseSecurityIntradayPrices**](ApiResponseSecurityIntradayPrices.md)

<a name="getSecurityLatestDividendRecord"></a>
# **getSecurityLatestDividendRecord**
> DividendRecord getSecurityLatestDividendRecord(identifier)

Lastest Dividend Record for Security

Returns the latest available dividend information for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

try {
    DividendRecord result = securityApi.getSecurityLatestDividendRecord(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityLatestDividendRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |

### Return type

[**DividendRecord**](DividendRecord.md)

<a name="getSecurityLatestEarningsRecord"></a>
# **getSecurityLatestEarningsRecord**
> EarningsRecord getSecurityLatestEarningsRecord(identifier)

Lastest Earnings Record for Security

Returns latest available earnings information for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

try {
    EarningsRecord result = securityApi.getSecurityLatestEarningsRecord(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityLatestEarningsRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |

### Return type

[**EarningsRecord**](EarningsRecord.md)

<a name="getSecurityPriceTechnicalsAdi"></a>
# **getSecurityPriceTechnicalsAdi**
> ApiResponseSecurityAccumulationDistributionIndex getSecurityPriceTechnicalsAdi(identifier, startDate, endDate, pageSize, nextPage)

Accumulation/Distribution Index

Returns the Accumulation/Distribution Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityAccumulationDistributionIndex result = securityApi.getSecurityPriceTechnicalsAdi(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsAdi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityAccumulationDistributionIndex**](ApiResponseSecurityAccumulationDistributionIndex.md)

<a name="getSecurityPriceTechnicalsAdtv"></a>
# **getSecurityPriceTechnicalsAdtv**
> ApiResponseSecurityAverageDailyTradingVolume getSecurityPriceTechnicalsAdtv(identifier, period, startDate, endDate, pageSize, nextPage)

Average Daily Trading Volume

Returns the Average Daily Trading Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 22; // Integer | The number of observations, per period, to calculate Average Daily Trading Volume
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityAverageDailyTradingVolume result = securityApi.getSecurityPriceTechnicalsAdtv(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsAdtv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Average Daily Trading Volume | [optional] [default to 22]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityAverageDailyTradingVolume**](ApiResponseSecurityAverageDailyTradingVolume.md)

<a name="getSecurityPriceTechnicalsAdx"></a>
# **getSecurityPriceTechnicalsAdx**
> ApiResponseSecurityAverageDirectionalIndex getSecurityPriceTechnicalsAdx(identifier, period, startDate, endDate, pageSize, nextPage)

Average Directional Index

Returns the Average Directional Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 14; // Integer | The number of observations, per period, to calculate Average Directional Index
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityAverageDirectionalIndex result = securityApi.getSecurityPriceTechnicalsAdx(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsAdx");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Average Directional Index | [optional] [default to 14]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityAverageDirectionalIndex**](ApiResponseSecurityAverageDirectionalIndex.md)

<a name="getSecurityPriceTechnicalsAo"></a>
# **getSecurityPriceTechnicalsAo**
> ApiResponseSecurityAwesomeOscillator getSecurityPriceTechnicalsAo(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage)

Awesome Oscillator

Returns the Awesome Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer shortPeriod = 5; // Integer | The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator
Integer longPeriod = 34; // Integer | The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityAwesomeOscillator result = securityApi.getSecurityPriceTechnicalsAo(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsAo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **shortPeriod** | **Integer**| The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator | [optional] [default to 5]
 **longPeriod** | **Integer**| The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator | [optional] [default to 34]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityAwesomeOscillator**](ApiResponseSecurityAwesomeOscillator.md)

<a name="getSecurityPriceTechnicalsAtr"></a>
# **getSecurityPriceTechnicalsAtr**
> ApiResponseSecurityAverageTrueRange getSecurityPriceTechnicalsAtr(identifier, period, startDate, endDate, pageSize, nextPage)

Average True Range

Returns the Average True Range values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 14; // Integer | The number of observations, per period, to calculate Average True Range
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityAverageTrueRange result = securityApi.getSecurityPriceTechnicalsAtr(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsAtr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Average True Range | [optional] [default to 14]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityAverageTrueRange**](ApiResponseSecurityAverageTrueRange.md)

<a name="getSecurityPriceTechnicalsBb"></a>
# **getSecurityPriceTechnicalsBb**
> ApiResponseSecurityBollingerBands getSecurityPriceTechnicalsBb(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage)

Bollinger Bands

Returns the Bollinger Bands values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 20; // Integer | The number of observations, per period, to calculate Bollinger Bands
Float standardDeviations = 2.0F; // Float | The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands
String priceKey = "close"; // String | The Stock Price field to use when calculating Bollinger Bands
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityBollingerBands result = securityApi.getSecurityPriceTechnicalsBb(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsBb");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Bollinger Bands | [optional] [default to 20]
 **standardDeviations** | **Float**| The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands | [optional] [default to 2.0]
 **priceKey** | **String**| The Stock Price field to use when calculating Bollinger Bands | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityBollingerBands**](ApiResponseSecurityBollingerBands.md)

<a name="getSecurityPriceTechnicalsCci"></a>
# **getSecurityPriceTechnicalsCci**
> ApiResponseSecurityCommodityChannelIndex getSecurityPriceTechnicalsCci(identifier, period, constant, startDate, endDate, pageSize, nextPage)

Commodity Channel Index

Returns the Commodity Channel Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 20; // Integer | The number of observations, per period, to calculate Commodity Channel Index
Float constant = 0.015F; // Float | The number of observations, per period, to calculate Commodity Channel Index
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityCommodityChannelIndex result = securityApi.getSecurityPriceTechnicalsCci(identifier, period, constant, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsCci");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Commodity Channel Index | [optional] [default to 20]
 **constant** | **Float**| The number of observations, per period, to calculate Commodity Channel Index | [optional] [default to 0.015]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityCommodityChannelIndex**](ApiResponseSecurityCommodityChannelIndex.md)

<a name="getSecurityPriceTechnicalsCmf"></a>
# **getSecurityPriceTechnicalsCmf**
> ApiResponseSecurityChaikinMoneyFlow getSecurityPriceTechnicalsCmf(identifier, period, startDate, endDate, pageSize, nextPage)

Chaikin Money Flow

Returns the Chaikin Money Flow values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 20; // Integer | The number of observations, per period, to calculate Chaikin Money Flow
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityChaikinMoneyFlow result = securityApi.getSecurityPriceTechnicalsCmf(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsCmf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Chaikin Money Flow | [optional] [default to 20]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityChaikinMoneyFlow**](ApiResponseSecurityChaikinMoneyFlow.md)

<a name="getSecurityPriceTechnicalsDc"></a>
# **getSecurityPriceTechnicalsDc**
> ApiResponseSecurityDonchianChannel getSecurityPriceTechnicalsDc(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

Donchian Channel

Returns the Donchian Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 20; // Integer | The number of observations, per period, to calculate Donchian Channel
String priceKey = "close"; // String | The Stock Price field to use when calculating Donchian Channel
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityDonchianChannel result = securityApi.getSecurityPriceTechnicalsDc(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsDc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Donchian Channel | [optional] [default to 20]
 **priceKey** | **String**| The Stock Price field to use when calculating Donchian Channel | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityDonchianChannel**](ApiResponseSecurityDonchianChannel.md)

<a name="getSecurityPriceTechnicalsDpo"></a>
# **getSecurityPriceTechnicalsDpo**
> ApiResponseSecurityDetrendedPriceOscillator getSecurityPriceTechnicalsDpo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

Detrended Price Oscillator

Returns the Detrended Price Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 20; // Integer | The number of observations, per period, to calculate Detrended Price Oscillator
String priceKey = "close"; // String | The Stock Price field to use when calculating Detrended Price Oscillator
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityDetrendedPriceOscillator result = securityApi.getSecurityPriceTechnicalsDpo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsDpo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Detrended Price Oscillator | [optional] [default to 20]
 **priceKey** | **String**| The Stock Price field to use when calculating Detrended Price Oscillator | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityDetrendedPriceOscillator**](ApiResponseSecurityDetrendedPriceOscillator.md)

<a name="getSecurityPriceTechnicalsEom"></a>
# **getSecurityPriceTechnicalsEom**
> ApiResponseSecurityEaseOfMovement getSecurityPriceTechnicalsEom(identifier, period, startDate, endDate, pageSize, nextPage)

Ease of Movement

Returns the Ease of Movement values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 20; // Integer | The number of observations, per period, to calculate Ease of Movement
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityEaseOfMovement result = securityApi.getSecurityPriceTechnicalsEom(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsEom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Ease of Movement | [optional] [default to 20]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityEaseOfMovement**](ApiResponseSecurityEaseOfMovement.md)

<a name="getSecurityPriceTechnicalsFi"></a>
# **getSecurityPriceTechnicalsFi**
> ApiResponseSecurityForceIndex getSecurityPriceTechnicalsFi(identifier, startDate, endDate, pageSize, nextPage)

Force Index

Returns the Force Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityForceIndex result = securityApi.getSecurityPriceTechnicalsFi(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsFi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityForceIndex**](ApiResponseSecurityForceIndex.md)

<a name="getSecurityPriceTechnicalsIchimoku"></a>
# **getSecurityPriceTechnicalsIchimoku**
> ApiResponseSecurityIchimokuKinkoHyo getSecurityPriceTechnicalsIchimoku(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage)

Ichimoku Kinko Hyo

Returns the Ichimoku Kinko Hyo values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer lowPeriod = 9; // Integer | The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo
Integer mediumPeriod = 26; // Integer | The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo
Integer highPeriod = 52; // Integer | The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityIchimokuKinkoHyo result = securityApi.getSecurityPriceTechnicalsIchimoku(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsIchimoku");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **lowPeriod** | **Integer**| The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo | [optional] [default to 9]
 **mediumPeriod** | **Integer**| The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo | [optional] [default to 26]
 **highPeriod** | **Integer**| The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo | [optional] [default to 52]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityIchimokuKinkoHyo**](ApiResponseSecurityIchimokuKinkoHyo.md)

<a name="getSecurityPriceTechnicalsKc"></a>
# **getSecurityPriceTechnicalsKc**
> ApiResponseSecurityKeltnerChannel getSecurityPriceTechnicalsKc(identifier, period, startDate, endDate, pageSize, nextPage)

Keltner Channel

Returns the Keltner Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 10; // Integer | The number of observations, per period, to calculate Kelter Channel
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityKeltnerChannel result = securityApi.getSecurityPriceTechnicalsKc(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsKc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Kelter Channel | [optional] [default to 10]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityKeltnerChannel**](ApiResponseSecurityKeltnerChannel.md)

<a name="getSecurityPriceTechnicalsKst"></a>
# **getSecurityPriceTechnicalsKst**
> ApiResponseSecurityKnowSureThing getSecurityPriceTechnicalsKst(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage)

Know Sure Thing

Returns the Know Sure Thing values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer roc1 = 10; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA1
Integer roc2 = 15; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA2
Integer roc3 = 20; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA3
Integer roc4 = 30; // Integer | The number of observations, per period, to calculate the rate-of-change for RCMA4
Integer sma1 = 10; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1
Integer sma2 = 10; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2
Integer sma3 = 10; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3
Integer sma4 = 15; // Integer | The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4
String priceKey = "close"; // String | The Stock Price field to use when calculating Know Sure Thing
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityKnowSureThing result = securityApi.getSecurityPriceTechnicalsKst(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsKst");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **roc1** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA1 | [optional] [default to 10]
 **roc2** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA2 | [optional] [default to 15]
 **roc3** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA3 | [optional] [default to 20]
 **roc4** | **Integer**| The number of observations, per period, to calculate the rate-of-change for RCMA4 | [optional] [default to 30]
 **sma1** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1 | [optional] [default to 10]
 **sma2** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2 | [optional] [default to 10]
 **sma3** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3 | [optional] [default to 10]
 **sma4** | **Integer**| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4 | [optional] [default to 15]
 **priceKey** | **String**| The Stock Price field to use when calculating Know Sure Thing | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityKnowSureThing**](ApiResponseSecurityKnowSureThing.md)

<a name="getSecurityPriceTechnicalsMacd"></a>
# **getSecurityPriceTechnicalsMacd**
> ApiResponseSecurityMovingAverageConvergenceDivergence getSecurityPriceTechnicalsMacd(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage)

Moving Average Convergence Divergence

Returns the Moving Average Convergence Divergence values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer fastPeriod = 12; // Integer | The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence
Integer slowPeriod = 26; // Integer | The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence
Integer signalPeriod = 9; // Integer | The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence
String priceKey = "close"; // String | The Stock Price field to use when calculating Moving Average Convergence Divergence
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityMovingAverageConvergenceDivergence result = securityApi.getSecurityPriceTechnicalsMacd(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsMacd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **fastPeriod** | **Integer**| The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence | [optional] [default to 12]
 **slowPeriod** | **Integer**| The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence | [optional] [default to 26]
 **signalPeriod** | **Integer**| The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence | [optional] [default to 9]
 **priceKey** | **String**| The Stock Price field to use when calculating Moving Average Convergence Divergence | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityMovingAverageConvergenceDivergence**](ApiResponseSecurityMovingAverageConvergenceDivergence.md)

<a name="getSecurityPriceTechnicalsMfi"></a>
# **getSecurityPriceTechnicalsMfi**
> ApiResponseSecurityMoneyFlowIndex getSecurityPriceTechnicalsMfi(identifier, period, startDate, endDate, pageSize, nextPage)

Money Flow Index

Returns the Money Flow Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 14; // Integer | The number of observations, per period, to calculate Money Flow Index
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityMoneyFlowIndex result = securityApi.getSecurityPriceTechnicalsMfi(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsMfi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Money Flow Index | [optional] [default to 14]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityMoneyFlowIndex**](ApiResponseSecurityMoneyFlowIndex.md)

<a name="getSecurityPriceTechnicalsMi"></a>
# **getSecurityPriceTechnicalsMi**
> ApiResponseSecurityMassIndex getSecurityPriceTechnicalsMi(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage)

Mass Index

Returns the Mass Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer emaPeriod = 9; // Integer | The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index
Integer sumPeriod = 25; // Integer | The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityMassIndex result = securityApi.getSecurityPriceTechnicalsMi(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsMi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **emaPeriod** | **Integer**| The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index | [optional] [default to 9]
 **sumPeriod** | **Integer**| The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index | [optional] [default to 25]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityMassIndex**](ApiResponseSecurityMassIndex.md)

<a name="getSecurityPriceTechnicalsNvi"></a>
# **getSecurityPriceTechnicalsNvi**
> ApiResponseSecurityNegativeVolumeIndex getSecurityPriceTechnicalsNvi(identifier, startDate, endDate, pageSize, nextPage)

Negative Volume Index

Returns the Negative Volume Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityNegativeVolumeIndex result = securityApi.getSecurityPriceTechnicalsNvi(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsNvi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityNegativeVolumeIndex**](ApiResponseSecurityNegativeVolumeIndex.md)

<a name="getSecurityPriceTechnicalsObv"></a>
# **getSecurityPriceTechnicalsObv**
> ApiResponseSecurityOnBalanceVolume getSecurityPriceTechnicalsObv(identifier, startDate, endDate, pageSize, nextPage)

On-balance Volume

Returns the On-balance Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityOnBalanceVolume result = securityApi.getSecurityPriceTechnicalsObv(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsObv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityOnBalanceVolume**](ApiResponseSecurityOnBalanceVolume.md)

<a name="getSecurityPriceTechnicalsObvMean"></a>
# **getSecurityPriceTechnicalsObvMean**
> ApiResponseSecurityOnBalanceVolumeMean getSecurityPriceTechnicalsObvMean(identifier, period, startDate, endDate, pageSize, nextPage)

On-balance Volume Mean

Returns the On-balance Volume Mean values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 10; // Integer | The number of observations, per period, to calculate On-balance Volume Mean
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityOnBalanceVolumeMean result = securityApi.getSecurityPriceTechnicalsObvMean(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsObvMean");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate On-balance Volume Mean | [optional] [default to 10]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityOnBalanceVolumeMean**](ApiResponseSecurityOnBalanceVolumeMean.md)

<a name="getSecurityPriceTechnicalsRsi"></a>
# **getSecurityPriceTechnicalsRsi**
> ApiResponseSecurityRelativeStrengthIndex getSecurityPriceTechnicalsRsi(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

Relative Strength Index

Returns the Relative Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 14; // Integer | The number of observations, per period, to calculate Relative Strength Index
String priceKey = "close"; // String | The Stock Price field to use when calculating Relative Strength Index
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityRelativeStrengthIndex result = securityApi.getSecurityPriceTechnicalsRsi(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsRsi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Relative Strength Index | [optional] [default to 14]
 **priceKey** | **String**| The Stock Price field to use when calculating Relative Strength Index | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityRelativeStrengthIndex**](ApiResponseSecurityRelativeStrengthIndex.md)

<a name="getSecurityPriceTechnicalsSma"></a>
# **getSecurityPriceTechnicalsSma**
> ApiResponseSecuritySimpleMovingAverage getSecurityPriceTechnicalsSma(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

Simple Moving Average

Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 20; // Integer | The number of observations, per period, to calculate Simple Moving Average
String priceKey = "close"; // String | The Stock Price field to use when calculating Simple Moving Average
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecuritySimpleMovingAverage result = securityApi.getSecurityPriceTechnicalsSma(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsSma");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Simple Moving Average | [optional] [default to 20]
 **priceKey** | **String**| The Stock Price field to use when calculating Simple Moving Average | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecuritySimpleMovingAverage**](ApiResponseSecuritySimpleMovingAverage.md)

<a name="getSecurityPriceTechnicalsSr"></a>
# **getSecurityPriceTechnicalsSr**
> ApiResponseSecurityStochasticOscillator getSecurityPriceTechnicalsSr(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage)

Stochastic Oscillator

Returns the Stochastic Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 14; // Integer | The number of observations, per period, to calculate %K of Stochastic Oscillator
Integer signalPeriod = 3; // Integer | The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityStochasticOscillator result = securityApi.getSecurityPriceTechnicalsSr(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsSr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate %K of Stochastic Oscillator | [optional] [default to 14]
 **signalPeriod** | **Integer**| The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator | [optional] [default to 3]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityStochasticOscillator**](ApiResponseSecurityStochasticOscillator.md)

<a name="getSecurityPriceTechnicalsTrix"></a>
# **getSecurityPriceTechnicalsTrix**
> ApiResponseSecurityTripleExponentialAverage getSecurityPriceTechnicalsTrix(identifier, period, startDate, endDate, pageSize, nextPage)

Triple Exponential Average

Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 15; // Integer | The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityTripleExponentialAverage result = securityApi.getSecurityPriceTechnicalsTrix(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsTrix");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average | [optional] [default to 15]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityTripleExponentialAverage**](ApiResponseSecurityTripleExponentialAverage.md)

<a name="getSecurityPriceTechnicalsTsi"></a>
# **getSecurityPriceTechnicalsTsi**
> ApiResponseSecurityTrueStrengthIndex getSecurityPriceTechnicalsTsi(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage)

True Strength Index

Returns the True Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer lowPeriod = 13; // Integer | The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index
Integer highPeriod = 25; // Integer | The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index
String priceKey = "close"; // String | The Stock Price field to use when calculating True Strength Index
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityTrueStrengthIndex result = securityApi.getSecurityPriceTechnicalsTsi(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsTsi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **lowPeriod** | **Integer**| The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index | [optional] [default to 13]
 **highPeriod** | **Integer**| The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index | [optional] [default to 25]
 **priceKey** | **String**| The Stock Price field to use when calculating True Strength Index | [optional] [default to close] [enum: open, high, low, close, volume]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityTrueStrengthIndex**](ApiResponseSecurityTrueStrengthIndex.md)

<a name="getSecurityPriceTechnicalsUo"></a>
# **getSecurityPriceTechnicalsUo**
> ApiResponseSecurityUltimateOscillator getSecurityPriceTechnicalsUo(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage)

Ultimate Oscillator

Returns the Ultimate Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer shortPeriod = 7; // Integer | The number of observations, per period, to calculate the short period for Ultimate Oscillator
Integer mediumPeriod = 14; // Integer | The number of observations, per period, to calculate the medium period for Ultimate Oscillator
Integer longPeriod = 28; // Integer | The number of observations, per period, to calculate the long period for Ultimate Oscillator
Float shortWeight = 4.0F; // Float | The weight of short Buying Pressure average for Ultimate Oscillator
Float mediumWeight = 2.0F; // Float | The weight of medium Buying Pressure average for Ultimate Oscillator
Float longWeight = 1.0F; // Float | The weight of long Buying Pressure average for Ultimate Oscillator
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityUltimateOscillator result = securityApi.getSecurityPriceTechnicalsUo(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsUo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **shortPeriod** | **Integer**| The number of observations, per period, to calculate the short period for Ultimate Oscillator | [optional] [default to 7]
 **mediumPeriod** | **Integer**| The number of observations, per period, to calculate the medium period for Ultimate Oscillator | [optional] [default to 14]
 **longPeriod** | **Integer**| The number of observations, per period, to calculate the long period for Ultimate Oscillator | [optional] [default to 28]
 **shortWeight** | **Float**| The weight of short Buying Pressure average for Ultimate Oscillator | [optional] [default to 4.0]
 **mediumWeight** | **Float**| The weight of medium Buying Pressure average for Ultimate Oscillator | [optional] [default to 2.0]
 **longWeight** | **Float**| The weight of long Buying Pressure average for Ultimate Oscillator | [optional] [default to 1.0]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityUltimateOscillator**](ApiResponseSecurityUltimateOscillator.md)

<a name="getSecurityPriceTechnicalsVi"></a>
# **getSecurityPriceTechnicalsVi**
> ApiResponseSecurityVortexIndicator getSecurityPriceTechnicalsVi(identifier, period, startDate, endDate, pageSize, nextPage)

Vortex Indicator

Returns the Vortex Indicator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 14; // Integer | The number of observations, per period, to calculate Vortex Indicator
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityVortexIndicator result = securityApi.getSecurityPriceTechnicalsVi(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsVi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to calculate Vortex Indicator | [optional] [default to 14]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityVortexIndicator**](ApiResponseSecurityVortexIndicator.md)

<a name="getSecurityPriceTechnicalsVpt"></a>
# **getSecurityPriceTechnicalsVpt**
> ApiResponseSecurityVolumePriceTrend getSecurityPriceTechnicalsVpt(identifier, startDate, endDate, pageSize, nextPage)

Volume-price Trend

Returns the Volume-price Trend values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityVolumePriceTrend result = securityApi.getSecurityPriceTechnicalsVpt(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsVpt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityVolumePriceTrend**](ApiResponseSecurityVolumePriceTrend.md)

<a name="getSecurityPriceTechnicalsVwap"></a>
# **getSecurityPriceTechnicalsVwap**
> ApiResponseSecurityVolumeWeightedAveragePrice getSecurityPriceTechnicalsVwap(identifier, startDate, endDate, pageSize, nextPage)

Volume Weighted Average Price

Returns the Volume Weighted Average Price values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
Integer pageSize = 100; // Integer | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityVolumeWeightedAveragePrice result = securityApi.getSecurityPriceTechnicalsVwap(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsVwap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **Integer**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityVolumeWeightedAveragePrice**](ApiResponseSecurityVolumeWeightedAveragePrice.md)

<a name="getSecurityPriceTechnicalsWr"></a>
# **getSecurityPriceTechnicalsWr**
> ApiResponseSecurityWilliamsR getSecurityPriceTechnicalsWr(identifier, period, startDate, endDate, pageSize, nextPage)

Williams %R

Returns the Williams %R values of Stock Prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
Integer period = 14; // Integer | The number of observations, per period, to look-back when calculating Williams %R
String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityWilliamsR result = securityApi.getSecurityPriceTechnicalsWr(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsWr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **period** | **Integer**| The number of observations, per period, to look-back when calculating Williams %R | [optional] [default to 14]
 **startDate** | **String**| Return technical indicator values on or after the date | [optional]
 **endDate** | **String**| Return technical indicator values on or before the date | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityWilliamsR**](ApiResponseSecurityWilliamsR.md)

<a name="getSecurityRealtimePrice"></a>
# **getSecurityRealtimePrice**
> RealtimeStockPrice getSecurityRealtimePrice(identifier, source)

Realtime Stock Price for Security

Return the realtime stock price for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
String source = null; // String | Return the realtime price from the specified data source

try {
    RealtimeStockPrice result = securityApi.getSecurityRealtimePrice(identifier, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityRealtimePrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **source** | **String**| Return the realtime price from the specified data source | [optional] [enum: iex, bats, bats_delayed]

### Return type

[**RealtimeStockPrice**](RealtimeStockPrice.md)

<a name="getSecurityStockPriceAdjustments"></a>
# **getSecurityStockPriceAdjustments**
> ApiResponseSecurityStockPriceAdjustments getSecurityStockPriceAdjustments(identifier, startDate, endDate, pageSize, nextPage)

Stock Price Adjustments by Security

Returns stock price adjustments for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
LocalDate startDate = null; // LocalDate | Return price adjustments on or after the date
LocalDate endDate = null; // LocalDate | Return price adjustments on or before the date
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityStockPriceAdjustments result = securityApi.getSecurityStockPriceAdjustments(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityStockPriceAdjustments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **LocalDate**| Return price adjustments on or after the date | [optional]
 **endDate** | **LocalDate**| Return price adjustments on or before the date | [optional]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityStockPriceAdjustments**](ApiResponseSecurityStockPriceAdjustments.md)

<a name="getSecurityStockPrices"></a>
# **getSecurityStockPrices**
> ApiResponseSecurityStockPrices getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage)

Stock Prices by Security

Return end-of-day stock prices for the Security with the given &#x60;identifier&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
LocalDate startDate = null; // LocalDate | Return prices on or after the date
LocalDate endDate = null; // LocalDate | Return prices on or before the date
String frequency = "daily"; // String | Return stock prices in the given frequency
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return
String nextPage = null; // String | Gets the next page of data from a previous API call

try {
    ApiResponseSecurityStockPrices result = securityApi.getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#getSecurityStockPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) |
 **startDate** | **LocalDate**| Return prices on or after the date | [optional]
 **endDate** | **LocalDate**| Return prices on or before the date | [optional]
 **frequency** | **String**| Return stock prices in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]
 **nextPage** | **String**| Gets the next page of data from a previous API call | [optional]

### Return type

[**ApiResponseSecurityStockPrices**](ApiResponseSecurityStockPrices.md)

<a name="screenSecurities"></a>
# **screenSecurities**
> List&lt;SecurityScreenResult&gt; screenSecurities(logic, orderColumn, orderDirection, primaryOnly, pageSize)

Screen Securities

Screen Securities using complex logic

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

SecurityScreenGroup logic = new SecurityScreenGroup(); // SecurityScreenGroup | The logic to screen with, consisting of operators, clauses, and nested groups.<br/> See <a href=\"/documentation/screener_v2\" target=\"_blank\">screener documentation</a> for details on how to construct conditions.
String orderColumn = "orderColumn_example"; // String | Results returned sorted by this column
String orderDirection = "asc"; // String | Sort order to use with the order_column
Boolean primaryOnly = false; // Boolean | Return only primary securities
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return

try {
    List<SecurityScreenResult> result = securityApi.screenSecurities(logic, orderColumn, orderDirection, primaryOnly, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#screenSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logic** | [**SecurityScreenGroup**](SecurityScreenGroup.md)| The logic to screen with, consisting of operators, clauses, and nested groups.&lt;br/&gt; See &lt;a href&#x3D;\&quot;/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. | [optional]
 **orderColumn** | **String**| Results returned sorted by this column | [optional]
 **orderDirection** | **String**| Sort order to use with the order_column | [optional] [default to asc] [enum: asc, desc]
 **primaryOnly** | **Boolean**| Return only primary securities | [optional] [default to false]
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]

### Return type

[**List&lt;SecurityScreenResult&gt;**](SecurityScreenResult.md)

<a name="searchSecurities"></a>
# **searchSecurities**
> ApiResponseSecuritiesSearch searchSecurities(query, pageSize)

Search Securities

Searches for Securities matching the text &#x60;query&#x60;

### Example
```java
// Import classes:
//import com.intrinio.invoker.ApiClient;
//import com.intrinio.invoker.ApiException;
//import com.intrinio.invoker.Configuration;
//import com.intrinio.invoker.auth.*;
//import com.intrinio.api.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
auth.setApiKey("YOUR API KEY");

SecurityApi securityApi = new SecurityApi();

String query = "Apple"; // String | 
BigDecimal pageSize = new BigDecimal(); // BigDecimal | The number of results to return

try {
    ApiResponseSecuritiesSearch result = securityApi.searchSecurities(query, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#searchSecurities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**|  |
 **pageSize** | **BigDecimal**| The number of results to return | [optional] [default to 100]

### Return type

[**ApiResponseSecuritiesSearch**](ApiResponseSecuritiesSearch.md)

