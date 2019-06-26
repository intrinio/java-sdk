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
[**getSecurityZacksAnalystRatings**](SecurityApi.md#getSecurityZacksAnalystRatings) | **GET** /securities/{identifier}/zacks/analyst_ratings | Zacks Analyst Ratings
[**getSecurityZacksAnalystRatingsSnapshot**](SecurityApi.md#getSecurityZacksAnalystRatingsSnapshot) | **GET** /securities/{identifier}/zacks/analyst_ratings/snapshot | Zacks Analyst Ratings Snapshot
[**getSecurityZacksEpsSurprises**](SecurityApi.md#getSecurityZacksEpsSurprises) | **GET** /securities/{identifier}/zacks/eps_surprises | Zacks EPS Surprises for Security
[**getSecurityZacksSalesSurprises**](SecurityApi.md#getSecurityZacksSalesSurprises) | **GET** /securities/{identifier}/zacks/sales_surprises | Zacks Sales Surprises for Security
[**screenSecurities**](SecurityApi.md#screenSecurities) | **POST** /securities/screen | Screen Securities
[**searchSecurities**](SecurityApi.md#searchSecurities) | **GET** /securities/search | Search Securities



[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getAllSecurities)

[//]: # (RETURN_TYPE:ApiResponseSecurities)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurities.md)

[//]: # (OPERATION:getAllSecurities_v2)

[//]: # (ENDPOINT:/securities)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getAllSecurities)

<a name="getAllSecurities"></a>
## **getAllSecurities**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getAllSecurities_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurities getAllSecurities(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, nextPage)

#### All Securities


Returns all Securities to which you have access. When parameters are specified, returns matching Securities.

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    Boolean active = true; // Boolean | When true, return securities that are active. When false, return securities that are not active. A security is considered active if it has traded or has had a corporate action in the past 30 days, and has not been merged into another security (such as due to ticker changes or corporate restructurings).
    Boolean delisted = false; // Boolean | When true, return securities that have been delisted from their exchange. Note that there may be a newer security for the same company that has been relisted on a differente exchange. When false, return securities that have not been delisted.
    String code = null; // String | Return securities classified with the given code (<a href=\"/documentation/security_codes\" target=\"_blank\">reference</a>).
    String currency = null; // String | Return securities traded in the given 3-digit ISO 4217 currency code (<a href=\"https://en.wikipedia.org/wiki/ISO_4217\" target=\"_blank\">reference</a>).
    String ticker = null; // String | Return securities traded with the given ticker. Note that securities across the world (and through time) may trade with the same ticker but represent different companies. Use this in conjuction with other parameters for more specificity.
    String name = null; // String | Return securities with the given text in their name (not case sensitive).
    String compositeMic = null; // String | Return securities classified under the composite exchange with the given Market Identification Code (MIC). A composite exchange may or may not be a real exchange.  For example, the USCOMP exchange (our only composite exchange to date) is a combination of exchanges with the following MICs: ARCX, XASE, XPOR, FINR, XCIS, XNAS, XNYS, BATS.  This composite grouping is done for user convenience.  At this time, all US securities are classified under the composite exchange with MIC USCOMP.  To query for specific US exchanges, use the exchange_mic parameter below. 
    String exchangeMic = null; // String | The MIC code of the exchange where the security is actually traded.
    LocalDate stockPricesAfter = null; // LocalDate | Return securities with end-of-day stock prices on or after this date.
    LocalDate stockPricesBefore = null; // LocalDate | Return securities with end-of-day stock prices on or before this date.
    String cik = null; // String | Return securities belonging to the company with the given Central Index Key (CIK).
    String figi = null; // String | Return securities with the given Exchange Level FIGI (<a href=\"https://www.openfigi.com/about\" target=\"_blank\">reference</a>).
    String compositeFigi = null; // String | Return securities with the given Country Composite FIGI (<a href=\"https://www.openfigi.com/about\" target=\"_blank\">reference</a>).
    String shareClassFigi = null; // String | Return securities with the given Global Share Class FIGI (<a href=\"https://www.openfigi.com/about\" target=\"_blank\">reference</a>).
    String figiUniqueId = null; // String | Return securities with the given FIGI Unique ID (<a href=\"https://www.openfigi.com/about\" target=\"_blank\">reference</a>).
    Boolean includeNonFigi = false; // Boolean | When true, include securities that do not have a FIGI. By default, this is false. If this parameter is not specified, only securities with a FIGI are returned.
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseSecurities result = securityApi.getAllSecurities(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getAllSecurities");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | Boolean| When true, return securities that are active. When false, return securities that are not active. A security is considered active if it has traded or has had a corporate action in the past 30 days, and has not been merged into another security (such as due to ticker changes or corporate restructurings). | [optional] &nbsp;
 **delisted** | Boolean| When true, return securities that have been delisted from their exchange. Note that there may be a newer security for the same company that has been relisted on a differente exchange. When false, return securities that have not been delisted. | [optional] &nbsp;
 **code** | String| Return securities classified with the given code (&lt;a href&#x3D;\&quot;/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). | [optional] &nbsp;
 **currency** | String| Return securities traded in the given 3-digit ISO 4217 currency code (&lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). | [optional] &nbsp;
 **ticker** | String| Return securities traded with the given ticker. Note that securities across the world (and through time) may trade with the same ticker but represent different companies. Use this in conjuction with other parameters for more specificity. | [optional] &nbsp;
 **name** | String| Return securities with the given text in their name (not case sensitive). | [optional] &nbsp;
 **compositeMic** | String| Return securities classified under the composite exchange with the given Market Identification Code (MIC). A composite exchange may or may not be a real exchange.  For example, the USCOMP exchange (our only composite exchange to date) is a combination of exchanges with the following MICs: ARCX, XASE, XPOR, FINR, XCIS, XNAS, XNYS, BATS.  This composite grouping is done for user convenience.  At this time, all US securities are classified under the composite exchange with MIC USCOMP.  To query for specific US exchanges, use the exchange_mic parameter below.  | [optional] &nbsp;
 **exchangeMic** | String| The MIC code of the exchange where the security is actually traded. | [optional] &nbsp;
 **stockPricesAfter** | LocalDate| Return securities with end-of-day stock prices on or after this date. | [optional] &nbsp;
 **stockPricesBefore** | LocalDate| Return securities with end-of-day stock prices on or before this date. | [optional] &nbsp;
 **cik** | String| Return securities belonging to the company with the given Central Index Key (CIK). | [optional] &nbsp;
 **figi** | String| Return securities with the given Exchange Level FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). | [optional] &nbsp;
 **compositeFigi** | String| Return securities with the given Country Composite FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). | [optional] &nbsp;
 **shareClassFigi** | String| Return securities with the given Global Share Class FIGI (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). | [optional] &nbsp;
 **figiUniqueId** | String| Return securities with the given FIGI Unique ID (&lt;a href&#x3D;\&quot;https://www.openfigi.com/about\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). | [optional] &nbsp;
 **includeNonFigi** | Boolean| When true, include securities that do not have a FIGI. By default, this is false. If this parameter is not specified, only securities with a FIGI are returned. | [optional] [default to false] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurities**](ApiResponseSecurities.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityById)

[//]: # (RETURN_TYPE:Security)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:Security.md)

[//]: # (OPERATION:getSecurityById_v2)

[//]: # (ENDPOINT:/securities/{identifier})

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityById)

<a name="getSecurityById"></a>
## **getSecurityById**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityById_v2)

[//]: # (START_OVERVIEW)

> Security getSecurityById(identifier)

#### Lookup Security


Returns the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

    try {
      Security result = securityApi.getSecurityById(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityById");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**Security**](Security.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityDataPointNumber)

[//]: # (RETURN_TYPE:BigDecimal)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:BigDecimal.md)

[//]: # (OPERATION:getSecurityDataPointNumber_v2)

[//]: # (ENDPOINT:/securities/{identifier}/data_point/{tag}/number)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityDataPointNumber)

<a name="getSecurityDataPointNumber"></a>
## **getSecurityDataPointNumber**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityDataPointNumber_v2)

[//]: # (START_OVERVIEW)

> BigDecimal getSecurityDataPointNumber(identifier, tag)

#### Data Point (Number) for Security


Returns a numeric value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**BigDecimal**](BigDecimal.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityDataPointText)

[//]: # (RETURN_TYPE:String)

[//]: # (RETURN_TYPE_KIND:primitive)

[//]: # (RETURN_TYPE_DOC:)

[//]: # (OPERATION:getSecurityDataPointText_v2)

[//]: # (ENDPOINT:/securities/{identifier}/data_point/{tag}/text)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityDataPointText)

<a name="getSecurityDataPointText"></a>
## **getSecurityDataPointText**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityDataPointText_v2)

[//]: # (START_OVERVIEW)

> String getSecurityDataPointText(identifier, tag)

#### Data Point (Text) for Security


Returns a text value for the given &#x60;tag&#x60; for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code-name | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

**String**

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityHistoricalData)

[//]: # (RETURN_TYPE:ApiResponseSecurityHistoricalData)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityHistoricalData.md)

[//]: # (OPERATION:getSecurityHistoricalData_v2)

[//]: # (ENDPOINT:/securities/{identifier}/historical_data/{tag})

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityHistoricalData)

<a name="getSecurityHistoricalData"></a>
## **getSecurityHistoricalData**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityHistoricalData_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityHistoricalData getSecurityHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage)

#### Historical Data for Security


Returns historical values for the given &#x60;tag&#x60; and the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    String tag = "adj_close_price"; // String | An Intrinio data tag ID or code (<a href='https://data.intrinio.com/data-tags'>reference</a>)
    String frequency = "daily"; // String | Return historical data in the given frequency
    String type = null; // String | Filter by type, when applicable
    LocalDate startDate = null; // LocalDate | Get historical data on or after this date
    LocalDate endDate = null; // LocalDate | Get historical date on or before this date
    String sortOrder = "desc"; // String | Sort by date `asc` or `desc`
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseSecurityHistoricalData result = securityApi.getSecurityHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityHistoricalData");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **tag** | String| An Intrinio data tag ID or code (&lt;a href&#x3D;&#39;https://data.intrinio.com/data-tags&#39;&gt;reference&lt;/a&gt;) | &nbsp;
 **frequency** | String| Return historical data in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly] &nbsp;
 **type** | String| Filter by type, when applicable | [optional] &nbsp;
 **startDate** | LocalDate| Get historical data on or after this date | [optional] &nbsp;
 **endDate** | LocalDate| Get historical date on or before this date | [optional] &nbsp;
 **sortOrder** | String| Sort by date &#x60;asc&#x60; or &#x60;desc&#x60; | [optional] [default to desc] [enum: asc, desc] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityHistoricalData**](ApiResponseSecurityHistoricalData.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityIntradayPrices)

[//]: # (RETURN_TYPE:ApiResponseSecurityIntradayPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityIntradayPrices.md)

[//]: # (OPERATION:getSecurityIntradayPrices_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/intraday)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityIntradayPrices)

<a name="getSecurityIntradayPrices"></a>
## **getSecurityIntradayPrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityIntradayPrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityIntradayPrices getSecurityIntradayPrices(identifier, source, startDate, startTime, endDate, endTime)

#### Intraday Stock Prices for Security


Return intraday stock prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **source** | String| Return intraday prices from the specified data source | [optional] [enum: iex, bats] &nbsp;
 **startDate** | LocalDate| Return intraday prices starting at the specified date | [optional] &nbsp;
 **startTime** | String| Return intraday prices starting at the specified time on the &#x60;start_date&#x60; (timezone is UTC) | [optional] &nbsp;
 **endDate** | LocalDate| Return intraday prices stopping at the specified date | [optional] &nbsp;
 **endTime** | String| Return intraday prices stopping at the specified time on the &#x60;end_date&#x60; (timezone is UTC) | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityIntradayPrices**](ApiResponseSecurityIntradayPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityLatestDividendRecord)

[//]: # (RETURN_TYPE:DividendRecord)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:DividendRecord.md)

[//]: # (OPERATION:getSecurityLatestDividendRecord_v2)

[//]: # (ENDPOINT:/securities/{identifier}/dividends/latest)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityLatestDividendRecord)

<a name="getSecurityLatestDividendRecord"></a>
## **getSecurityLatestDividendRecord**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityLatestDividendRecord_v2)

[//]: # (START_OVERVIEW)

> DividendRecord getSecurityLatestDividendRecord(identifier)

#### Lastest Dividend Record for Security


Returns the latest available dividend information for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

    try {
      DividendRecord result = securityApi.getSecurityLatestDividendRecord(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityLatestDividendRecord");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**DividendRecord**](DividendRecord.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityLatestEarningsRecord)

[//]: # (RETURN_TYPE:EarningsRecord)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:EarningsRecord.md)

[//]: # (OPERATION:getSecurityLatestEarningsRecord_v2)

[//]: # (ENDPOINT:/securities/{identifier}/earnings/latest)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityLatestEarningsRecord)

<a name="getSecurityLatestEarningsRecord"></a>
## **getSecurityLatestEarningsRecord**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityLatestEarningsRecord_v2)

[//]: # (START_OVERVIEW)

> EarningsRecord getSecurityLatestEarningsRecord(identifier)

#### Lastest Earnings Record for Security


Returns latest available earnings information for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)

    try {
      EarningsRecord result = securityApi.getSecurityLatestEarningsRecord(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityLatestEarningsRecord");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**EarningsRecord**](EarningsRecord.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsAdi)

[//]: # (RETURN_TYPE:ApiResponseSecurityAccumulationDistributionIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityAccumulationDistributionIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsAdi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/adi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsAdi)

<a name="getSecurityPriceTechnicalsAdi"></a>
## **getSecurityPriceTechnicalsAdi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsAdi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityAccumulationDistributionIndex getSecurityPriceTechnicalsAdi(identifier, startDate, endDate, pageSize, nextPage)

#### Accumulation/Distribution Index


Returns the Accumulation/Distribution Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityAccumulationDistributionIndex**](ApiResponseSecurityAccumulationDistributionIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsAdtv)

[//]: # (RETURN_TYPE:ApiResponseSecurityAverageDailyTradingVolume)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityAverageDailyTradingVolume.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsAdtv_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/adtv)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsAdtv)

<a name="getSecurityPriceTechnicalsAdtv"></a>
## **getSecurityPriceTechnicalsAdtv**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsAdtv_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityAverageDailyTradingVolume getSecurityPriceTechnicalsAdtv(identifier, period, startDate, endDate, pageSize, nextPage)

#### Average Daily Trading Volume


Returns the Average Daily Trading Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Average Daily Trading Volume | [optional] [default to 22] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityAverageDailyTradingVolume**](ApiResponseSecurityAverageDailyTradingVolume.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsAdx)

[//]: # (RETURN_TYPE:ApiResponseSecurityAverageDirectionalIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityAverageDirectionalIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsAdx_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/adx)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsAdx)

<a name="getSecurityPriceTechnicalsAdx"></a>
## **getSecurityPriceTechnicalsAdx**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsAdx_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityAverageDirectionalIndex getSecurityPriceTechnicalsAdx(identifier, period, startDate, endDate, pageSize, nextPage)

#### Average Directional Index


Returns the Average Directional Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Average Directional Index | [optional] [default to 14] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityAverageDirectionalIndex**](ApiResponseSecurityAverageDirectionalIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsAo)

[//]: # (RETURN_TYPE:ApiResponseSecurityAwesomeOscillator)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityAwesomeOscillator.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsAo_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/ao)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsAo)

<a name="getSecurityPriceTechnicalsAo"></a>
## **getSecurityPriceTechnicalsAo**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsAo_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityAwesomeOscillator getSecurityPriceTechnicalsAo(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage)

#### Awesome Oscillator


Returns the Awesome Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **shortPeriod** | Integer| The number of observations, per period, to calculate short period Simple Moving Average of the Awesome Oscillator | [optional] [default to 5] &nbsp;
 **longPeriod** | Integer| The number of observations, per period, to calculate long period Simple Moving Average of the Awesome Oscillator | [optional] [default to 34] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityAwesomeOscillator**](ApiResponseSecurityAwesomeOscillator.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsAtr)

[//]: # (RETURN_TYPE:ApiResponseSecurityAverageTrueRange)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityAverageTrueRange.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsAtr_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/atr)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsAtr)

<a name="getSecurityPriceTechnicalsAtr"></a>
## **getSecurityPriceTechnicalsAtr**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsAtr_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityAverageTrueRange getSecurityPriceTechnicalsAtr(identifier, period, startDate, endDate, pageSize, nextPage)

#### Average True Range


Returns the Average True Range values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Average True Range | [optional] [default to 14] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityAverageTrueRange**](ApiResponseSecurityAverageTrueRange.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsBb)

[//]: # (RETURN_TYPE:ApiResponseSecurityBollingerBands)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityBollingerBands.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsBb_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/bb)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsBb)

<a name="getSecurityPriceTechnicalsBb"></a>
## **getSecurityPriceTechnicalsBb**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsBb_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityBollingerBands getSecurityPriceTechnicalsBb(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage)

#### Bollinger Bands


Returns the Bollinger Bands values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Bollinger Bands | [optional] [default to 20] &nbsp;
 **standardDeviations** | Float| The number of standard deviations to calculate the upper and lower bands of the Bollinger Bands | [optional] [default to 2.0] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating Bollinger Bands | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityBollingerBands**](ApiResponseSecurityBollingerBands.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsCci)

[//]: # (RETURN_TYPE:ApiResponseSecurityCommodityChannelIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityCommodityChannelIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsCci_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/cci)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsCci)

<a name="getSecurityPriceTechnicalsCci"></a>
## **getSecurityPriceTechnicalsCci**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsCci_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityCommodityChannelIndex getSecurityPriceTechnicalsCci(identifier, period, constant, startDate, endDate, pageSize, nextPage)

#### Commodity Channel Index


Returns the Commodity Channel Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Commodity Channel Index | [optional] [default to 20] &nbsp;
 **constant** | Float| The number of observations, per period, to calculate Commodity Channel Index | [optional] [default to 0.015] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityCommodityChannelIndex**](ApiResponseSecurityCommodityChannelIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsCmf)

[//]: # (RETURN_TYPE:ApiResponseSecurityChaikinMoneyFlow)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityChaikinMoneyFlow.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsCmf_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/cmf)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsCmf)

<a name="getSecurityPriceTechnicalsCmf"></a>
## **getSecurityPriceTechnicalsCmf**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsCmf_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityChaikinMoneyFlow getSecurityPriceTechnicalsCmf(identifier, period, startDate, endDate, pageSize, nextPage)

#### Chaikin Money Flow


Returns the Chaikin Money Flow values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Chaikin Money Flow | [optional] [default to 20] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityChaikinMoneyFlow**](ApiResponseSecurityChaikinMoneyFlow.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsDc)

[//]: # (RETURN_TYPE:ApiResponseSecurityDonchianChannel)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityDonchianChannel.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsDc_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/dc)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsDc)

<a name="getSecurityPriceTechnicalsDc"></a>
## **getSecurityPriceTechnicalsDc**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsDc_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityDonchianChannel getSecurityPriceTechnicalsDc(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

#### Donchian Channel


Returns the Donchian Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Donchian Channel | [optional] [default to 20] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating Donchian Channel | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityDonchianChannel**](ApiResponseSecurityDonchianChannel.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsDpo)

[//]: # (RETURN_TYPE:ApiResponseSecurityDetrendedPriceOscillator)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityDetrendedPriceOscillator.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsDpo_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/dpo)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsDpo)

<a name="getSecurityPriceTechnicalsDpo"></a>
## **getSecurityPriceTechnicalsDpo**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsDpo_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityDetrendedPriceOscillator getSecurityPriceTechnicalsDpo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

#### Detrended Price Oscillator


Returns the Detrended Price Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Detrended Price Oscillator | [optional] [default to 20] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating Detrended Price Oscillator | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityDetrendedPriceOscillator**](ApiResponseSecurityDetrendedPriceOscillator.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsEom)

[//]: # (RETURN_TYPE:ApiResponseSecurityEaseOfMovement)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityEaseOfMovement.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsEom_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/eom)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsEom)

<a name="getSecurityPriceTechnicalsEom"></a>
## **getSecurityPriceTechnicalsEom**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsEom_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityEaseOfMovement getSecurityPriceTechnicalsEom(identifier, period, startDate, endDate, pageSize, nextPage)

#### Ease of Movement


Returns the Ease of Movement values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Ease of Movement | [optional] [default to 20] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityEaseOfMovement**](ApiResponseSecurityEaseOfMovement.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsFi)

[//]: # (RETURN_TYPE:ApiResponseSecurityForceIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityForceIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsFi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/fi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsFi)

<a name="getSecurityPriceTechnicalsFi"></a>
## **getSecurityPriceTechnicalsFi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsFi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityForceIndex getSecurityPriceTechnicalsFi(identifier, startDate, endDate, pageSize, nextPage)

#### Force Index


Returns the Force Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityForceIndex**](ApiResponseSecurityForceIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsIchimoku)

[//]: # (RETURN_TYPE:ApiResponseSecurityIchimokuKinkoHyo)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityIchimokuKinkoHyo.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsIchimoku_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/ichimoku)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsIchimoku)

<a name="getSecurityPriceTechnicalsIchimoku"></a>
## **getSecurityPriceTechnicalsIchimoku**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsIchimoku_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityIchimokuKinkoHyo getSecurityPriceTechnicalsIchimoku(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage)

#### Ichimoku Kinko Hyo


Returns the Ichimoku Kinko Hyo values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **lowPeriod** | Integer| The number of observations, per period, to calculate Tenkan Sen (Conversion Line) of Ichimoku Kinko Hyo | [optional] [default to 9] &nbsp;
 **mediumPeriod** | Integer| The number of observations, per period, to calculate Kijun Sen (Base Line), Senkou Span A (Leading Span A), and Chikou Span (Lagging Span) of Ichimoku Kinko Hyo | [optional] [default to 26] &nbsp;
 **highPeriod** | Integer| The number of observations, per period, to calculate Senkou Span B (Leading Span B) of Ichimoku Kinko Hyo | [optional] [default to 52] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityIchimokuKinkoHyo**](ApiResponseSecurityIchimokuKinkoHyo.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsKc)

[//]: # (RETURN_TYPE:ApiResponseSecurityKeltnerChannel)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityKeltnerChannel.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsKc_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/kc)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsKc)

<a name="getSecurityPriceTechnicalsKc"></a>
## **getSecurityPriceTechnicalsKc**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsKc_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityKeltnerChannel getSecurityPriceTechnicalsKc(identifier, period, startDate, endDate, pageSize, nextPage)

#### Keltner Channel


Returns the Keltner Channel values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Kelter Channel | [optional] [default to 10] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityKeltnerChannel**](ApiResponseSecurityKeltnerChannel.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsKst)

[//]: # (RETURN_TYPE:ApiResponseSecurityKnowSureThing)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityKnowSureThing.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsKst_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/kst)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsKst)

<a name="getSecurityPriceTechnicalsKst"></a>
## **getSecurityPriceTechnicalsKst**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsKst_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityKnowSureThing getSecurityPriceTechnicalsKst(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage)

#### Know Sure Thing


Returns the Know Sure Thing values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **roc1** | Integer| The number of observations, per period, to calculate the rate-of-change for RCMA1 | [optional] [default to 10] &nbsp;
 **roc2** | Integer| The number of observations, per period, to calculate the rate-of-change for RCMA2 | [optional] [default to 15] &nbsp;
 **roc3** | Integer| The number of observations, per period, to calculate the rate-of-change for RCMA3 | [optional] [default to 20] &nbsp;
 **roc4** | Integer| The number of observations, per period, to calculate the rate-of-change for RCMA4 | [optional] [default to 30] &nbsp;
 **sma1** | Integer| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA1 | [optional] [default to 10] &nbsp;
 **sma2** | Integer| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA2 | [optional] [default to 10] &nbsp;
 **sma3** | Integer| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA3 | [optional] [default to 10] &nbsp;
 **sma4** | Integer| The number of observations, per period, to calculate the Simple Moving Average of the rate-of-change for RCMA4 | [optional] [default to 15] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating Know Sure Thing | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityKnowSureThing**](ApiResponseSecurityKnowSureThing.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsMacd)

[//]: # (RETURN_TYPE:ApiResponseSecurityMovingAverageConvergenceDivergence)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityMovingAverageConvergenceDivergence.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsMacd_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/macd)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsMacd)

<a name="getSecurityPriceTechnicalsMacd"></a>
## **getSecurityPriceTechnicalsMacd**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsMacd_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityMovingAverageConvergenceDivergence getSecurityPriceTechnicalsMacd(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage)

#### Moving Average Convergence Divergence


Returns the Moving Average Convergence Divergence values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **fastPeriod** | Integer| The number of observations, per period, to calculate the fast moving Exponential Moving Average for Moving Average Convergence Divergence | [optional] [default to 12] &nbsp;
 **slowPeriod** | Integer| The number of observations, per period, to calculate the slow moving Exponential Moving Average for Moving Average Convergence Divergence | [optional] [default to 26] &nbsp;
 **signalPeriod** | Integer| The number of observations, per period, to calculate the signal line for Moving Average Convergence Divergence | [optional] [default to 9] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating Moving Average Convergence Divergence | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityMovingAverageConvergenceDivergence**](ApiResponseSecurityMovingAverageConvergenceDivergence.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsMfi)

[//]: # (RETURN_TYPE:ApiResponseSecurityMoneyFlowIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityMoneyFlowIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsMfi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/mfi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsMfi)

<a name="getSecurityPriceTechnicalsMfi"></a>
## **getSecurityPriceTechnicalsMfi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsMfi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityMoneyFlowIndex getSecurityPriceTechnicalsMfi(identifier, period, startDate, endDate, pageSize, nextPage)

#### Money Flow Index


Returns the Money Flow Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Money Flow Index | [optional] [default to 14] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityMoneyFlowIndex**](ApiResponseSecurityMoneyFlowIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsMi)

[//]: # (RETURN_TYPE:ApiResponseSecurityMassIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityMassIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsMi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/mi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsMi)

<a name="getSecurityPriceTechnicalsMi"></a>
## **getSecurityPriceTechnicalsMi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsMi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityMassIndex getSecurityPriceTechnicalsMi(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage)

#### Mass Index


Returns the Mass Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **emaPeriod** | Integer| The number of observations, per period, to calculate the single Exponential Moving Average and the Double Exponential Moving Average for Mass Index | [optional] [default to 9] &nbsp;
 **sumPeriod** | Integer| The number of observations, per period, to calculate the sum of the Exponetinal Moving Average Ratios for Mass Index | [optional] [default to 25] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityMassIndex**](ApiResponseSecurityMassIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsNvi)

[//]: # (RETURN_TYPE:ApiResponseSecurityNegativeVolumeIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityNegativeVolumeIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsNvi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/nvi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsNvi)

<a name="getSecurityPriceTechnicalsNvi"></a>
## **getSecurityPriceTechnicalsNvi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsNvi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityNegativeVolumeIndex getSecurityPriceTechnicalsNvi(identifier, startDate, endDate, pageSize, nextPage)

#### Negative Volume Index


Returns the Negative Volume Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityNegativeVolumeIndex**](ApiResponseSecurityNegativeVolumeIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsObv)

[//]: # (RETURN_TYPE:ApiResponseSecurityOnBalanceVolume)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityOnBalanceVolume.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsObv_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/obv)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsObv)

<a name="getSecurityPriceTechnicalsObv"></a>
## **getSecurityPriceTechnicalsObv**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsObv_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityOnBalanceVolume getSecurityPriceTechnicalsObv(identifier, startDate, endDate, pageSize, nextPage)

#### On-balance Volume


Returns the On-balance Volume values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityOnBalanceVolume**](ApiResponseSecurityOnBalanceVolume.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsObvMean)

[//]: # (RETURN_TYPE:ApiResponseSecurityOnBalanceVolumeMean)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityOnBalanceVolumeMean.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsObvMean_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/obv_mean)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsObvMean)

<a name="getSecurityPriceTechnicalsObvMean"></a>
## **getSecurityPriceTechnicalsObvMean**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsObvMean_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityOnBalanceVolumeMean getSecurityPriceTechnicalsObvMean(identifier, period, startDate, endDate, pageSize, nextPage)

#### On-balance Volume Mean


Returns the On-balance Volume Mean values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate On-balance Volume Mean | [optional] [default to 10] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityOnBalanceVolumeMean**](ApiResponseSecurityOnBalanceVolumeMean.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsRsi)

[//]: # (RETURN_TYPE:ApiResponseSecurityRelativeStrengthIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityRelativeStrengthIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsRsi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/rsi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsRsi)

<a name="getSecurityPriceTechnicalsRsi"></a>
## **getSecurityPriceTechnicalsRsi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsRsi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityRelativeStrengthIndex getSecurityPriceTechnicalsRsi(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

#### Relative Strength Index


Returns the Relative Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Relative Strength Index | [optional] [default to 14] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating Relative Strength Index | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityRelativeStrengthIndex**](ApiResponseSecurityRelativeStrengthIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsSma)

[//]: # (RETURN_TYPE:ApiResponseSecuritySimpleMovingAverage)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecuritySimpleMovingAverage.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsSma_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/sma)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsSma)

<a name="getSecurityPriceTechnicalsSma"></a>
## **getSecurityPriceTechnicalsSma**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsSma_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecuritySimpleMovingAverage getSecurityPriceTechnicalsSma(identifier, period, priceKey, startDate, endDate, pageSize, nextPage)

#### Simple Moving Average


Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Simple Moving Average | [optional] [default to 20] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating Simple Moving Average | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecuritySimpleMovingAverage**](ApiResponseSecuritySimpleMovingAverage.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsSr)

[//]: # (RETURN_TYPE:ApiResponseSecurityStochasticOscillator)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityStochasticOscillator.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsSr_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/sr)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsSr)

<a name="getSecurityPriceTechnicalsSr"></a>
## **getSecurityPriceTechnicalsSr**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsSr_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityStochasticOscillator getSecurityPriceTechnicalsSr(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage)

#### Stochastic Oscillator


Returns the Stochastic Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate %K of Stochastic Oscillator | [optional] [default to 14] &nbsp;
 **signalPeriod** | Integer| The number of observations, per period, to calculate the %D (the Simple Moving Average of %K) as a signal line for Stochastic Oscillator | [optional] [default to 3] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityStochasticOscillator**](ApiResponseSecurityStochasticOscillator.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsTrix)

[//]: # (RETURN_TYPE:ApiResponseSecurityTripleExponentialAverage)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityTripleExponentialAverage.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsTrix_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/trix)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsTrix)

<a name="getSecurityPriceTechnicalsTrix"></a>
## **getSecurityPriceTechnicalsTrix**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsTrix_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityTripleExponentialAverage getSecurityPriceTechnicalsTrix(identifier, period, startDate, endDate, pageSize, nextPage)

#### Triple Exponential Average


Returns the Simple Moving Average values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Exponential Moving Average for Triple Exponential Average | [optional] [default to 15] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityTripleExponentialAverage**](ApiResponseSecurityTripleExponentialAverage.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsTsi)

[//]: # (RETURN_TYPE:ApiResponseSecurityTrueStrengthIndex)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityTrueStrengthIndex.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsTsi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/tsi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsTsi)

<a name="getSecurityPriceTechnicalsTsi"></a>
## **getSecurityPriceTechnicalsTsi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsTsi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityTrueStrengthIndex getSecurityPriceTechnicalsTsi(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage)

#### True Strength Index


Returns the True Strength Index values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **lowPeriod** | Integer| The number of observations, per period, to calculate low period Exponential Moving Average for smoothing in True Strength Index | [optional] [default to 13] &nbsp;
 **highPeriod** | Integer| The number of observations, per period, to calculate high period Exponential Moving Average for smoothing in True Strength Index | [optional] [default to 25] &nbsp;
 **priceKey** | String| The Stock Price field to use when calculating True Strength Index | [optional] [default to close] [enum: open, high, low, close, volume] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityTrueStrengthIndex**](ApiResponseSecurityTrueStrengthIndex.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsUo)

[//]: # (RETURN_TYPE:ApiResponseSecurityUltimateOscillator)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityUltimateOscillator.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsUo_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/uo)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsUo)

<a name="getSecurityPriceTechnicalsUo"></a>
## **getSecurityPriceTechnicalsUo**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsUo_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityUltimateOscillator getSecurityPriceTechnicalsUo(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage)

#### Ultimate Oscillator


Returns the Ultimate Oscillator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **shortPeriod** | Integer| The number of observations, per period, to calculate the short period for Ultimate Oscillator | [optional] [default to 7] &nbsp;
 **mediumPeriod** | Integer| The number of observations, per period, to calculate the medium period for Ultimate Oscillator | [optional] [default to 14] &nbsp;
 **longPeriod** | Integer| The number of observations, per period, to calculate the long period for Ultimate Oscillator | [optional] [default to 28] &nbsp;
 **shortWeight** | Float| The weight of short Buying Pressure average for Ultimate Oscillator | [optional] [default to 4.0] &nbsp;
 **mediumWeight** | Float| The weight of medium Buying Pressure average for Ultimate Oscillator | [optional] [default to 2.0] &nbsp;
 **longWeight** | Float| The weight of long Buying Pressure average for Ultimate Oscillator | [optional] [default to 1.0] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityUltimateOscillator**](ApiResponseSecurityUltimateOscillator.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsVi)

[//]: # (RETURN_TYPE:ApiResponseSecurityVortexIndicator)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityVortexIndicator.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsVi_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/vi)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsVi)

<a name="getSecurityPriceTechnicalsVi"></a>
## **getSecurityPriceTechnicalsVi**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsVi_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityVortexIndicator getSecurityPriceTechnicalsVi(identifier, period, startDate, endDate, pageSize, nextPage)

#### Vortex Indicator


Returns the Vortex Indicator values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to calculate Vortex Indicator | [optional] [default to 14] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityVortexIndicator**](ApiResponseSecurityVortexIndicator.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsVpt)

[//]: # (RETURN_TYPE:ApiResponseSecurityVolumePriceTrend)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityVolumePriceTrend.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsVpt_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/vpt)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsVpt)

<a name="getSecurityPriceTechnicalsVpt"></a>
## **getSecurityPriceTechnicalsVpt**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsVpt_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityVolumePriceTrend getSecurityPriceTechnicalsVpt(identifier, startDate, endDate, pageSize, nextPage)

#### Volume-price Trend


Returns the Volume-price Trend values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityVolumePriceTrend**](ApiResponseSecurityVolumePriceTrend.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsVwap)

[//]: # (RETURN_TYPE:ApiResponseSecurityVolumeWeightedAveragePrice)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityVolumeWeightedAveragePrice.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsVwap_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/vwap)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsVwap)

<a name="getSecurityPriceTechnicalsVwap"></a>
## **getSecurityPriceTechnicalsVwap**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsVwap_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityVolumeWeightedAveragePrice getSecurityPriceTechnicalsVwap(identifier, startDate, endDate, pageSize, nextPage)

#### Volume Weighted Average Price


Returns the Volume Weighted Average Price values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

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
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityVolumeWeightedAveragePrice**](ApiResponseSecurityVolumeWeightedAveragePrice.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityPriceTechnicalsWr)

[//]: # (RETURN_TYPE:ApiResponseSecurityWilliamsR)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityWilliamsR.md)

[//]: # (OPERATION:getSecurityPriceTechnicalsWr_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/technicals/wr)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityPriceTechnicalsWr)

<a name="getSecurityPriceTechnicalsWr"></a>
## **getSecurityPriceTechnicalsWr**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityPriceTechnicalsWr_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityWilliamsR getSecurityPriceTechnicalsWr(identifier, period, startDate, endDate, pageSize, nextPage)

#### Williams %R


Returns the Williams %R values of Stock Prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    Integer period = 14; // Integer | The number of observations, per period, to look-back when calculating Williams %R
    String startDate = "2018-01-01"; // String | Return technical indicator values on or after the date
    String endDate = "2019-01-01"; // String | Return technical indicator values on or before the date
    BigDecimal pageSize = null; // BigDecimal | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseSecurityWilliamsR result = securityApi.getSecurityPriceTechnicalsWr(identifier, period, startDate, endDate, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityPriceTechnicalsWr");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **period** | Integer| The number of observations, per period, to look-back when calculating Williams %R | [optional] [default to 14] &nbsp;
 **startDate** | String| Return technical indicator values on or after the date | [optional] &nbsp;
 **endDate** | String| Return technical indicator values on or before the date | [optional] &nbsp;
 **pageSize** | BigDecimal| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityWilliamsR**](ApiResponseSecurityWilliamsR.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityRealtimePrice)

[//]: # (RETURN_TYPE:RealtimeStockPrice)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:RealtimeStockPrice.md)

[//]: # (OPERATION:getSecurityRealtimePrice_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/realtime)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityRealtimePrice)

<a name="getSecurityRealtimePrice"></a>
## **getSecurityRealtimePrice**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityRealtimePrice_v2)

[//]: # (START_OVERVIEW)

> RealtimeStockPrice getSecurityRealtimePrice(identifier, source)

#### Realtime Stock Price for Security


Return the realtime stock price for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    String source = null; // String | Return the realtime price from the specified data source. If no source is specified, the best source available is used.

    try {
      RealtimeStockPrice result = securityApi.getSecurityRealtimePrice(identifier, source);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityRealtimePrice");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **source** | String| Return the realtime price from the specified data source. If no source is specified, the best source available is used. | [optional] [enum: iex, bats, bats_delayed, utp_delayed, cta_a_delayed, cta_b_delayed] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**RealtimeStockPrice**](RealtimeStockPrice.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityStockPriceAdjustments)

[//]: # (RETURN_TYPE:ApiResponseSecurityStockPriceAdjustments)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityStockPriceAdjustments.md)

[//]: # (OPERATION:getSecurityStockPriceAdjustments_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/adjustments)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityStockPriceAdjustments)

<a name="getSecurityStockPriceAdjustments"></a>
## **getSecurityStockPriceAdjustments**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityStockPriceAdjustments_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityStockPriceAdjustments getSecurityStockPriceAdjustments(identifier, startDate, endDate, pageSize, nextPage)

#### Stock Price Adjustments by Security


Returns stock price adjustments for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    LocalDate startDate = null; // LocalDate | Return price adjustments on or after the date
    LocalDate endDate = null; // LocalDate | Return price adjustments on or before the date
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseSecurityStockPriceAdjustments result = securityApi.getSecurityStockPriceAdjustments(identifier, startDate, endDate, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityStockPriceAdjustments");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | LocalDate| Return price adjustments on or after the date | [optional] &nbsp;
 **endDate** | LocalDate| Return price adjustments on or before the date | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityStockPriceAdjustments**](ApiResponseSecurityStockPriceAdjustments.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityStockPrices)

[//]: # (RETURN_TYPE:ApiResponseSecurityStockPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityStockPrices.md)

[//]: # (OPERATION:getSecurityStockPrices_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityStockPrices)

<a name="getSecurityStockPrices"></a>
## **getSecurityStockPrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityStockPrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityStockPrices getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage)

#### Stock Prices by Security


Return end-of-day stock prices for the Security with the given &#x60;identifier&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    LocalDate startDate = null; // LocalDate | Return prices on or after the date
    LocalDate endDate = null; // LocalDate | Return prices on or before the date
    String frequency = "daily"; // String | Return stock prices in the given frequency
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseSecurityStockPrices result = securityApi.getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityStockPrices");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | LocalDate| Return prices on or after the date | [optional] &nbsp;
 **endDate** | LocalDate| Return prices on or before the date | [optional] &nbsp;
 **frequency** | String| Return stock prices in the given frequency | [optional] [default to daily] [enum: daily, weekly, monthly, quarterly, yearly] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityStockPrices**](ApiResponseSecurityStockPrices.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityZacksAnalystRatings)

[//]: # (RETURN_TYPE:ApiResponseSecurityZacksAnalystRatings)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityZacksAnalystRatings.md)

[//]: # (OPERATION:getSecurityZacksAnalystRatings_v2)

[//]: # (ENDPOINT:/securities/{identifier}/zacks/analyst_ratings)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityZacksAnalystRatings)

<a name="getSecurityZacksAnalystRatings"></a>
## **getSecurityZacksAnalystRatings**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityZacksAnalystRatings_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityZacksAnalystRatings getSecurityZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize)

#### Zacks Analyst Ratings


Returns buy, sell, and hold recommendations from analysts at brokerages for the Security with the given &#x60;identifier&#x60;. Zack’s storied research team aggregates and validates the ratings from professional analysts.

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    String startDate = null; // String | Limit ratings to those on or after this date
    String endDate = null; // String | Limit ratings to those on or before this date
    BigDecimal meanGreater = null; // BigDecimal | Return only records with a mean (average) higher than this value
    BigDecimal meanLess = null; // BigDecimal | Return only records with a mean (average) lower than this value
    Integer strongBuysGreater = null; // Integer | Return only records with more than this many Strong Buy recommendations
    Integer strongBuysLess = null; // Integer | Return only records with fewer than this many Strong Buy recommendations
    Integer buysGreater = null; // Integer | Return only records with more than this many Buy recommendations
    Integer buysLess = null; // Integer | Return only records with fewer than this many Buy recommendations
    Integer holdsGreater = null; // Integer | Return only records with more than this many Hold recommendations
    Integer holdsLess = null; // Integer | Return only records with fewer than this many Hold recommendations
    Integer sellsGreater = null; // Integer | Return only records with more than this many Sell recommendations
    Integer sellsLess = null; // Integer | Return only records with fewer than this many Sell recommendations
    Integer strongSellsGreater = null; // Integer | Return only records with more than this many Strong Sell recommendations
    Integer strongSellsLess = null; // Integer | Return only records with fewer than this many Strong Sell recommendations
    Integer totalGreater = null; // Integer | Return only records with more than this many recommendations, regardless of type
    Integer totalLess = null; // Integer | Return only records with fewer than this many recommendations, regardless of type
    Integer pageSize = 100; // Integer | The number of results to return

    try {
      ApiResponseSecurityZacksAnalystRatings result = securityApi.getSecurityZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityZacksAnalystRatings");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **startDate** | String| Limit ratings to those on or after this date | [optional] &nbsp;
 **endDate** | String| Limit ratings to those on or before this date | [optional] &nbsp;
 **meanGreater** | BigDecimal| Return only records with a mean (average) higher than this value | [optional] &nbsp;
 **meanLess** | BigDecimal| Return only records with a mean (average) lower than this value | [optional] &nbsp;
 **strongBuysGreater** | Integer| Return only records with more than this many Strong Buy recommendations | [optional] &nbsp;
 **strongBuysLess** | Integer| Return only records with fewer than this many Strong Buy recommendations | [optional] &nbsp;
 **buysGreater** | Integer| Return only records with more than this many Buy recommendations | [optional] &nbsp;
 **buysLess** | Integer| Return only records with fewer than this many Buy recommendations | [optional] &nbsp;
 **holdsGreater** | Integer| Return only records with more than this many Hold recommendations | [optional] &nbsp;
 **holdsLess** | Integer| Return only records with fewer than this many Hold recommendations | [optional] &nbsp;
 **sellsGreater** | Integer| Return only records with more than this many Sell recommendations | [optional] &nbsp;
 **sellsLess** | Integer| Return only records with fewer than this many Sell recommendations | [optional] &nbsp;
 **strongSellsGreater** | Integer| Return only records with more than this many Strong Sell recommendations | [optional] &nbsp;
 **strongSellsLess** | Integer| Return only records with fewer than this many Strong Sell recommendations | [optional] &nbsp;
 **totalGreater** | Integer| Return only records with more than this many recommendations, regardless of type | [optional] &nbsp;
 **totalLess** | Integer| Return only records with fewer than this many recommendations, regardless of type | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityZacksAnalystRatings**](ApiResponseSecurityZacksAnalystRatings.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityZacksAnalystRatingsSnapshot)

[//]: # (RETURN_TYPE:ApiResponseSecurityZacksAnalystRatingsSnapshot)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityZacksAnalystRatingsSnapshot.md)

[//]: # (OPERATION:getSecurityZacksAnalystRatingsSnapshot_v2)

[//]: # (ENDPOINT:/securities/{identifier}/zacks/analyst_ratings/snapshot)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityZacksAnalystRatingsSnapshot)

<a name="getSecurityZacksAnalystRatingsSnapshot"></a>
## **getSecurityZacksAnalystRatingsSnapshot**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityZacksAnalystRatingsSnapshot_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityZacksAnalystRatingsSnapshot getSecurityZacksAnalystRatingsSnapshot(identifier, date)

#### Zacks Analyst Ratings Snapshot


Returns a snapshot of ratings data compared with previous timeframes for the Security with the given &#x60;identifier&#x60;. Also returns mean percentiles for comparing one security to the universe of securities covered by Zacks analyst ratings, at a specific point in time.

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    String date = null; // String | Lookup a historical snapshot on the given date

    try {
      ApiResponseSecurityZacksAnalystRatingsSnapshot result = securityApi.getSecurityZacksAnalystRatingsSnapshot(identifier, date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityZacksAnalystRatingsSnapshot");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **date** | String| Lookup a historical snapshot on the given date | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityZacksAnalystRatingsSnapshot**](ApiResponseSecurityZacksAnalystRatingsSnapshot.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityZacksEpsSurprises)

[//]: # (RETURN_TYPE:ApiResponseSecurityZacksEPSSurprises)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityZacksEPSSurprises.md)

[//]: # (OPERATION:getSecurityZacksEpsSurprises_v2)

[//]: # (ENDPOINT:/securities/{identifier}/zacks/eps_surprises)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityZacksEpsSurprises)

<a name="getSecurityZacksEpsSurprises"></a>
## **getSecurityZacksEpsSurprises**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityZacksEpsSurprises_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityZacksEPSSurprises getSecurityZacksEpsSurprises(identifier, pageSize, nextPage)

#### Zacks EPS Surprises for Security


Return Zacks EPS surprises for the Security with the given &#x60;identifier&#x60;.

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseSecurityZacksEPSSurprises result = securityApi.getSecurityZacksEpsSurprises(identifier, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityZacksEpsSurprises");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityZacksEPSSurprises**](ApiResponseSecurityZacksEPSSurprises.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityZacksSalesSurprises)

[//]: # (RETURN_TYPE:ApiResponseSecurityZacksSalesSurprises)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityZacksSalesSurprises.md)

[//]: # (OPERATION:getSecurityZacksSalesSurprises_v2)

[//]: # (ENDPOINT:/securities/{identifier}/zacks/sales_surprises)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityZacksSalesSurprises)

<a name="getSecurityZacksSalesSurprises"></a>
## **getSecurityZacksSalesSurprises**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityZacksSalesSurprises_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityZacksSalesSurprises getSecurityZacksSalesSurprises(identifier, pageSize, nextPage)

#### Zacks Sales Surprises for Security


Return Zacks sales surprises for the Security with the given &#x60;identifier&#x60;.

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String identifier = "AAPL"; // String | A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID)
    Integer pageSize = 100; // Integer | The number of results to return
    String nextPage = null; // String | Gets the next page of data from a previous API call

    try {
      ApiResponseSecurityZacksSalesSurprises result = securityApi.getSecurityZacksSalesSurprises(identifier, pageSize, nextPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getSecurityZacksSalesSurprises");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityZacksSalesSurprises**](ApiResponseSecurityZacksSalesSurprises.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:screenSecurities)

[//]: # (RETURN_TYPE:List<SecurityScreenResult>)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityScreenResult.md)

[//]: # (OPERATION:screenSecurities_v2)

[//]: # (ENDPOINT:/securities/screen)

[//]: # (DOCUMENT_LINK:SecurityApi.md#screenSecurities)

<a name="screenSecurities"></a>
## **screenSecurities**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/screenSecurities_v2)

[//]: # (START_OVERVIEW)

> List&lt;SecurityScreenResult&gt; screenSecurities(logic, orderColumn, orderDirection, primaryOnly, pageSize)

#### Screen Securities


Screen Securities using complex logic

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    SecurityScreenGroup logic = new SecurityScreenGroup(); // SecurityScreenGroup | The logic to screen with, consisting of operators, clauses, and nested groups.<br/> See <a href=\"/documentation/screener_v2\" target=\"_blank\">screener documentation</a> for details on how to construct conditions.
    String orderColumn = "orderColumn_example"; // String | Results returned sorted by this column
    String orderDirection = "asc"; // String | Sort order to use with the order_column
    Boolean primaryOnly = false; // Boolean | Return only primary securities
    Integer pageSize = 100; // Integer | The number of results to return

    try {
      List<SecurityScreenResult> result = securityApi.screenSecurities(logic, orderColumn, orderDirection, primaryOnly, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#screenSecurities");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logic** | [**SecurityScreenGroup**](SecurityScreenGroup.md)| The logic to screen with, consisting of operators, clauses, and nested groups.&lt;br/&gt; See &lt;a href&#x3D;\&quot;/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. | [optional] &nbsp;
 **orderColumn** | String| Results returned sorted by this column | [optional] &nbsp;
 **orderDirection** | String| Sort order to use with the order_column | [optional] [default to asc] [enum: asc, desc] &nbsp;
 **primaryOnly** | Boolean| Return only primary securities | [optional] [default to false] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**List&lt;SecurityScreenResult&gt;**](SecurityScreenResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:searchSecurities)

[//]: # (RETURN_TYPE:ApiResponseSecuritiesSearch)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecuritiesSearch.md)

[//]: # (OPERATION:searchSecurities_v2)

[//]: # (ENDPOINT:/securities/search)

[//]: # (DOCUMENT_LINK:SecurityApi.md#searchSecurities)

<a name="searchSecurities"></a>
## **searchSecurities**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/searchSecurities_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecuritiesSearch searchSecurities(query, pageSize)

#### Search Securities


Searches for Securities matching the text &#x60;query&#x60;

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

public class Main {
  public static void main(String[] args) {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");

    SecurityApi securityApi = new SecurityApi();

    String query = "Apple"; // String | 
    Integer pageSize = 100; // Integer | The number of results to return

    try {
      ApiResponseSecuritiesSearch result = securityApi.searchSecurities(query, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#searchSecurities");
      e.printStackTrace();
    }
  
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | String|  | &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecuritiesSearch**](ApiResponseSecuritiesSearch.md)

[//]: # (END_OPERATION)

