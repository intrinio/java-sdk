# SecurityApi

All URIs are relative to *https://api-v2.intrinio.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSecurities**](SecurityApi.md#getAllSecurities) | **GET** /securities | All Securities
[**getSecurityById**](SecurityApi.md#getSecurityById) | **GET** /securities/{identifier} | Lookup Security
[**getSecurityDataPointNumber**](SecurityApi.md#getSecurityDataPointNumber) | **GET** /securities/{identifier}/data_point/{tag}/number | Data Point (Number) for Security
[**getSecurityDataPointText**](SecurityApi.md#getSecurityDataPointText) | **GET** /securities/{identifier}/data_point/{tag}/text | Data Point (Text) for Security
[**getSecurityHistoricalData**](SecurityApi.md#getSecurityHistoricalData) | **GET** /securities/{identifier}/historical_data/{tag} | Historical Data for Security
[**getSecurityHistoryByIdentifier**](SecurityApi.md#getSecurityHistoryByIdentifier) | **GET** /securities/history-by-identifier/{identifier} | Security History By Identifier
[**getSecurityHistoryByTicker**](SecurityApi.md#getSecurityHistoryByTicker) | **GET** /securities/history-by-ticker/{ticker} | Security History By Ticker
[**getSecurityInsiderOwnership**](SecurityApi.md#getSecurityInsiderOwnership) | **GET** /securities/{identifier}/institutional_ownership | Institutional Ownership by Security
[**getSecurityIntervalMovers**](SecurityApi.md#getSecurityIntervalMovers) | **GET** /securities/market_movers | Security Intervals Movers
[**getSecurityIntervalMoversChange**](SecurityApi.md#getSecurityIntervalMoversChange) | **GET** /securities/market_movers/change | Security Intervals Movers By Change
[**getSecurityIntervalMoversVolume**](SecurityApi.md#getSecurityIntervalMoversVolume) | **GET** /securities/market_movers/volume | Security Intervals Movers By Volume
[**getSecurityIntervalPrices**](SecurityApi.md#getSecurityIntervalPrices) | **GET** /securities/{identifier}/prices/intervals | Interval Stock Prices for Security
[**getSecurityIntradayPrices**](SecurityApi.md#getSecurityIntradayPrices) | **GET** /securities/{identifier}/prices/intraday | Intraday Stock Prices for Security
[**getSecurityLatestDividendRecord**](SecurityApi.md#getSecurityLatestDividendRecord) | **GET** /securities/{identifier}/dividends/latest | Latest Dividend Record for Security
[**getSecurityLatestEarningsRecord**](SecurityApi.md#getSecurityLatestEarningsRecord) | **GET** /securities/{identifier}/earnings/latest | Latest Earnings Record for Security
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
[**getSecurityReplayFile**](SecurityApi.md#getSecurityReplayFile) | **GET** /securities/replay | Security Replay File
[**getSecuritySnapshots**](SecurityApi.md#getSecuritySnapshots) | **GET** /securities/snapshots | Realtime Stock Prices Snapshot
[**getSecurityStockPriceAdjustments**](SecurityApi.md#getSecurityStockPriceAdjustments) | **GET** /securities/{identifier}/prices/adjustments | Stock Price Adjustments by Security
[**getSecurityStockPrices**](SecurityApi.md#getSecurityStockPrices) | **GET** /securities/{identifier}/prices | Stock Prices by Security
[**getSecurityTrades**](SecurityApi.md#getSecurityTrades) | **GET** /securities/trades | Security Trades
[**getSecurityTradesBySymbol**](SecurityApi.md#getSecurityTradesBySymbol) | **GET** /securities/{identifier}/trades | Security Trades By Symbol
[**getSecurityZacksAnalystRatings**](SecurityApi.md#getSecurityZacksAnalystRatings) | **GET** /securities/{identifier}/zacks/analyst_ratings | Zacks Analyst Ratings for Security
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

> ApiResponseSecurities getAllSecurities(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, primaryListing, nextPage)

#### All Securities


Returns a list of all securities available. Delisted securities included.

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

    SecurityApi securityApi = new SecurityApi();
    Boolean active = true;
    Boolean delisted = false;
    String code = null;
    String currency = null;
    String ticker = null;
    String name = null;
    String compositeMic = null;
    String exchangeMic = null;
    LocalDate stockPricesAfter = null;
    LocalDate stockPricesBefore = null;
    String cik = null;
    String figi = null;
    String compositeFigi = null;
    String shareClassFigi = null;
    String figiUniqueId = null;
    Boolean includeNonFigi = false;
    Integer pageSize = 100;
    Boolean primaryListing = null;
    String nextPage = null;
    ApiResponseSecurities result = securityApi.getAllSecurities(active, delisted, code, currency, ticker, name, compositeMic, exchangeMic, stockPricesAfter, stockPricesBefore, cik, figi, compositeFigi, shareClassFigi, figiUniqueId, includeNonFigi, pageSize, primaryListing, nextPage);
    System.out.println(result);
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
 **code** | String| Return securities classified with the given code (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/security_codes\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;). | [optional] &nbsp;
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
 **primaryListing** | Boolean| If true, the Security is the primary issue for the company, otherwise it is a secondary issue on a secondary stock exchange.  Returns both if omitted. | [optional] &nbsp;
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


Returns security reference data such as ticker, FIGI, primary exchange, CIK, and a unique security identifier.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Security result = securityApi.getSecurityById(identifier);
    System.out.println(result);
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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String tag = "close_price";
    BigDecimal result = securityApi.getSecurityDataPointNumber(identifier, tag);
    System.out.println(result);
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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String tag = "figi";
    String result = securityApi.getSecurityDataPointText(identifier, tag);
    System.out.println(result);
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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String tag = "adj_close_price";
    String frequency = "daily";
    String type = null;
    LocalDate startDate = LocalDate.of(2018,1,01);
    LocalDate endDate = null;
    String sortOrder = "desc";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityHistoricalData result = securityApi.getSecurityHistoricalData(identifier, tag, frequency, type, startDate, endDate, sortOrder, pageSize, nextPage);
    System.out.println(result);
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

[//]: # (METHOD:getSecurityHistoryByIdentifier)

[//]: # (RETURN_TYPE:SecurityHistoryListResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityHistoryListResult.md)

[//]: # (OPERATION:getSecurityHistoryByIdentifier_v2)

[//]: # (ENDPOINT:/securities/history-by-identifier/{identifier})

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityHistoryByIdentifier)

<a name="getSecurityHistoryByIdentifier"></a>
## **getSecurityHistoryByIdentifier**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityHistoryByIdentifier_v2)

[//]: # (START_OVERVIEW)

> SecurityHistoryListResult getSecurityHistoryByIdentifier(identifier)

#### Security History By Identifier


Lists the tickers a company has used over time.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "037833100";
    SecurityHistoryListResult result = securityApi.getSecurityHistoryByIdentifier(identifier);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (FIGI, COMPOSITE FIGI, SHARE CLASS FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityHistoryListResult**](SecurityHistoryListResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityHistoryByTicker)

[//]: # (RETURN_TYPE:SecurityHistoryListResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityHistoryListResult.md)

[//]: # (OPERATION:getSecurityHistoryByTicker_v2)

[//]: # (ENDPOINT:/securities/history-by-ticker/{ticker})

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityHistoryByTicker)

<a name="getSecurityHistoryByTicker"></a>
## **getSecurityHistoryByTicker**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityHistoryByTicker_v2)

[//]: # (START_OVERVIEW)

> SecurityHistoryListResult getSecurityHistoryByTicker(ticker)

#### Security History By Ticker


Lists the tickers a company has used over time.

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

    SecurityApi securityApi = new SecurityApi();
    String ticker = "AAPL";
    SecurityHistoryListResult result = securityApi.getSecurityHistoryByTicker(ticker);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | String| A Security ticker symbol | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityHistoryListResult**](SecurityHistoryListResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityInsiderOwnership)

[//]: # (RETURN_TYPE:ApiResponseSecurityInstitutionalOwnership)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityInstitutionalOwnership.md)

[//]: # (OPERATION:getSecurityInsiderOwnership_v2)

[//]: # (ENDPOINT:/securities/{identifier}/institutional_ownership)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityInsiderOwnership)

<a name="getSecurityInsiderOwnership"></a>
## **getSecurityInsiderOwnership**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityInsiderOwnership_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityInstitutionalOwnership getSecurityInsiderOwnership(identifier, nextPage)

#### Institutional Ownership by Security


Returns a list of all institutional owners of a given security.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String nextPage = null;
    ApiResponseSecurityInstitutionalOwnership result = securityApi.getSecurityInsiderOwnership(identifier, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityInstitutionalOwnership**](ApiResponseSecurityInstitutionalOwnership.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityIntervalMovers)

[//]: # (RETURN_TYPE:SecurityIntervalsMoversResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityIntervalsMoversResult.md)

[//]: # (OPERATION:getSecurityIntervalMovers_v2)

[//]: # (ENDPOINT:/securities/market_movers)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityIntervalMovers)

<a name="getSecurityIntervalMovers"></a>
## **getSecurityIntervalMovers**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityIntervalMovers_v2)

[//]: # (START_OVERVIEW)

> SecurityIntervalsMoversResult getSecurityIntervalMovers(source, openTime)

#### Security Intervals Movers


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

    SecurityApi securityApi = new SecurityApi();
    String source = null;
    OffsetDateTime openTime = OffsetDateTime.now();
    SecurityIntervalsMoversResult result = securityApi.getSecurityIntervalMovers(source, openTime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed, nasdaq_basic, nasdaq_basic_filtered] &nbsp;
 **openTime** | OffsetDateTime| The inclusive UTC date and time the interval opens at. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityIntervalsMoversResult**](SecurityIntervalsMoversResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityIntervalMoversChange)

[//]: # (RETURN_TYPE:SecurityIntervalsMoversResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityIntervalsMoversResult.md)

[//]: # (OPERATION:getSecurityIntervalMoversChange_v2)

[//]: # (ENDPOINT:/securities/market_movers/change)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityIntervalMoversChange)

<a name="getSecurityIntervalMoversChange"></a>
## **getSecurityIntervalMoversChange**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityIntervalMoversChange_v2)

[//]: # (START_OVERVIEW)

> SecurityIntervalsMoversResult getSecurityIntervalMoversChange(source, openTime)

#### Security Intervals Movers By Change


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

    SecurityApi securityApi = new SecurityApi();
    String source = null;
    OffsetDateTime openTime = OffsetDateTime.now();
    SecurityIntervalsMoversResult result = securityApi.getSecurityIntervalMoversChange(source, openTime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed, nasdaq_basic, nasdaq_basic_filtered] &nbsp;
 **openTime** | OffsetDateTime| The inclusive UTC date and time the interval opens at. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityIntervalsMoversResult**](SecurityIntervalsMoversResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityIntervalMoversVolume)

[//]: # (RETURN_TYPE:SecurityIntervalsMoversResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityIntervalsMoversResult.md)

[//]: # (OPERATION:getSecurityIntervalMoversVolume_v2)

[//]: # (ENDPOINT:/securities/market_movers/volume)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityIntervalMoversVolume)

<a name="getSecurityIntervalMoversVolume"></a>
## **getSecurityIntervalMoversVolume**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityIntervalMoversVolume_v2)

[//]: # (START_OVERVIEW)

> SecurityIntervalsMoversResult getSecurityIntervalMoversVolume(source, openTime)

#### Security Intervals Movers By Volume


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

    SecurityApi securityApi = new SecurityApi();
    String source = null;
    OffsetDateTime openTime = OffsetDateTime.now();
    SecurityIntervalsMoversResult result = securityApi.getSecurityIntervalMoversVolume(source, openTime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| Realtime or 15-minute delayed contracts. | [optional] [enum: realtime, delayed, nasdaq_basic, nasdaq_basic_filtered] &nbsp;
 **openTime** | OffsetDateTime| The inclusive UTC date and time the interval opens at. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityIntervalsMoversResult**](SecurityIntervalsMoversResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityIntervalPrices)

[//]: # (RETURN_TYPE:ApiResponseSecurityIntervalPrices)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:ApiResponseSecurityIntervalPrices.md)

[//]: # (OPERATION:getSecurityIntervalPrices_v2)

[//]: # (ENDPOINT:/securities/{identifier}/prices/intervals)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityIntervalPrices)

<a name="getSecurityIntervalPrices"></a>
## **getSecurityIntervalPrices**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityIntervalPrices_v2)

[//]: # (START_OVERVIEW)

> ApiResponseSecurityIntervalPrices getSecurityIntervalPrices(identifier, intervalSize, source, startDate, startTime, endDate, endTime, timezone, pageSize, splitAdjusted, nextPage)

#### Interval Stock Prices for Security


Return open, close, high, low, volume, average price, and change ratio for a particular interval for the Security with the given &#x60;identifier&#x60;

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String intervalSize = "15m";
    String source = null;
    LocalDate startDate = LocalDate.of(2023,1,01);
    String startTime = null;
    LocalDate endDate = LocalDate.of(2023,2,01);
    String endTime = null;
    String timezone = "UTC";
    Integer pageSize = 100;
    Boolean splitAdjusted = false;
    String nextPage = null;
    ApiResponseSecurityIntervalPrices result = securityApi.getSecurityIntervalPrices(identifier, intervalSize, source, startDate, startTime, endDate, endTime, timezone, pageSize, splitAdjusted, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **intervalSize** | String| The interval for which to return stock prices | [default to 15m] [enum: 1m, 5m, 10m, 15m, 30m, 60m, 1h] &nbsp;
 **source** | String| Return intervals from the specified data source | [optional] [enum: realtime, delayed, nasdaq_basic, nasdaq_basic_filtered] &nbsp;
 **startDate** | LocalDate| Return intervals starting at the specified date | [optional] &nbsp;
 **startTime** | String| Return intervals starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) | [optional] &nbsp;
 **endDate** | LocalDate| Return intervals stopping at the specified date | [optional] &nbsp;
 **endTime** | String| Return intervals stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm:ss&#39; format) | [optional] &nbsp;
 **timezone** | String| Returns trading times in this timezone | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **splitAdjusted** | Boolean| Whether to return the values adjusted for splits or not. Default is false. | [optional] [default to false] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**ApiResponseSecurityIntervalPrices**](ApiResponseSecurityIntervalPrices.md)

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

> ApiResponseSecurityIntradayPrices getSecurityIntradayPrices(identifier, source, startDate, startTime, endDate, endTime, pageSize, nextPage)

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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String source = null;
    LocalDate startDate = LocalDate.of(2018,1,01);
    String startTime = null;
    LocalDate endDate = LocalDate.of(2019,1,01);
    String endTime = null;
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityIntradayPrices result = securityApi.getSecurityIntradayPrices(identifier, source, startDate, startTime, endDate, endTime, pageSize, nextPage);
    System.out.println(result);
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
 **startTime** | String| Return intraday prices starting at the specified time on the &#x60;start_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) | [optional] &nbsp;
 **endDate** | LocalDate| Return intraday prices stopping at the specified date | [optional] &nbsp;
 **endTime** | String| Return intraday prices stopping at the specified time on the &#x60;end_date&#x60; (24-hour in &#39;hh:mm&#39; format, UTC timezone) | [optional] &nbsp;
 **pageSize** | Integer| The number of results to return | [optional] [default to 100] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
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

#### Latest Dividend Record for Security


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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    DividendRecord result = securityApi.getSecurityLatestDividendRecord(identifier);
    System.out.println(result);
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

#### Latest Earnings Record for Security


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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    EarningsRecord result = securityApi.getSecurityLatestEarningsRecord(identifier);
    System.out.println(result);
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


The Accumulation / Distribution Indicator is a volume-based technical indicator which uses the relationship between the stock&#x60;s price and volume flow to determine the underlying trend of a stock, up, down, or sideways trend of a stock.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityAccumulationDistributionIndex result = securityApi.getSecurityPriceTechnicalsAdi(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


Average Daily Trading Volume is the average number of shares traded over a given period, usually between 20 to 30 trading days.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 22;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityAverageDailyTradingVolume result = securityApi.getSecurityPriceTechnicalsAdtv(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Average Directional Index indicator is often used to identify decreasing or increasing price momentum for an underlying security, it is composed of a total of three indicators, the current trendline (adx), a positive directional indicator (di_pos), and a negative directional indicator (di_neg).

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 14;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityAverageDirectionalIndex result = securityApi.getSecurityPriceTechnicalsAdx(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Awesome Oscillator (ao) is a momentum indicator and is calculated by taking the difference between the latest 5 period simple moving average and the 34 period simple moving average. Rather than using the closing price like other indicators, the Awesome Oscillator uses the latest period&#x60;s midpoint value (period_high - period_low / 2). The Awesome Oscillator is useful in identifying and trading, zero-line crossovers, twin-peaks trading, and bullish/bearish saucers - Awesome Oscillator is often aggregated with additional technical indicators.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer shortPeriod = 5;
    Integer longPeriod = 34;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityAwesomeOscillator result = securityApi.getSecurityPriceTechnicalsAo(identifier, shortPeriod, longPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Average True Range (ATR) is a non-directional market volatility indicator often used to generate stop-out or entry indications. An increasing or expanding ATR typically indicates higher volatility, and a decreasing ATR indicates sideways price action and lower volatility.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 14;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityAverageTrueRange result = securityApi.getSecurityPriceTechnicalsAtr(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


Bollinger Bands can be a useful technical analysis tool for generating oversold or overbought indicators. Bollinger Bands are composed of three lines, a simple moving average (middle band) and an upper and lower band – the upper and lower bands are typically 2 standard deviations +/- from a 20-day simple moving average, but can be modified. Traders typically consider an underlying security to be overbought as the underlying&#x60;s price moves towards the upper band and oversold as the underlying price moves towards the lower band.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 20;
    Float standardDeviations = 2.0F;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityBollingerBands result = securityApi.getSecurityPriceTechnicalsBb(identifier, period, standardDeviations, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Commodity Channel Index (CCI) is a technical indicator used to generate buy and sell signals by indicating periods of strength and weakness in the market. CCI signals that fall below -100 are often perceived as weakness in the underlying price movement and CCI signals that rise above 100 indicate strength behind the underlying price movement.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 20;
    Float constant = 0.015F;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityCommodityChannelIndex result = securityApi.getSecurityPriceTechnicalsCci(identifier, period, constant, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Chaikin Money Flow (CMF) utilizes exponential moving averages as an indicator to monitor the flow of money and momentum. The CMF indicator oscillates around a midrange 0-line and ranges between 100 and -100.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 20;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityChaikinMoneyFlow result = securityApi.getSecurityPriceTechnicalsCmf(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Donchian Channel consists of an Upper Bound (upper_bound) and Lower Bound (lower_bound) that track the recent highs and lows and is often used to signal entry and exit points for a position. As the price of the underlying symbol increases the Upper Bound raises, if the price becomes range bound the Upper Bound will remain flat and if the price begins to decrease, the Upper Bound will fall (and vice-versa for the Lower Bound).

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 20;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityDonchianChannel result = securityApi.getSecurityPriceTechnicalsDc(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Detrended Price Oscillator (DPO) signals the peaks and troughs of the underlying symbol’s price for a set period of time and is often used by traders to estimate future peaks and troughs using this as guidance to enter or exit a position.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 20;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityDetrendedPriceOscillator result = securityApi.getSecurityPriceTechnicalsDpo(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Ease of Movement (EOM) is a volume based oscillator that fluctuates around a midrange 0-line into positive and negative values. Positive values indicate that the underlying symbol&#x60;s price is rising with relative ease and negative value indicates the underlying symbol&#x60;s price is failing with relative ease.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 20;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityEaseOfMovement result = securityApi.getSecurityPriceTechnicalsEom(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Force Index (FI) is an oscillator that takes into account the intensity of an underlying symbol&#x60;s price movement and its corresponding volume. It is used to confirm price breakouts and signal underlying trends.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityForceIndex result = securityApi.getSecurityPriceTechnicalsFi(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Ichimoku Kinko Hyo was designed to be an all-in-one trading indicator that could help traders determine momentum, support, and resistance.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer lowPeriod = 9;
    Integer mediumPeriod = 26;
    Integer highPeriod = 52;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityIchimokuKinkoHyo result = securityApi.getSecurityPriceTechnicalsIchimoku(identifier, lowPeriod, mediumPeriod, highPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Keltner Channel is a volatility based signal, with upper, middle, and lower bands. It is often used at market open, when the largest moves tend to occur. In general, traders tend to buy if the price breaks up above the upper band or sell short if the price drops below the lower band.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 10;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityKeltnerChannel result = securityApi.getSecurityPriceTechnicalsKc(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Know Sure Thing indicator (KST) is a momentum based oscillator that is calculated by measuring the momentum of four separate price cycles. KST fluctuates above and below a zero line and is used to identify overbought and oversold conditions, and is often used with additional indicators to boost signal strength.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer roc1 = 10;
    Integer roc2 = 15;
    Integer roc3 = 20;
    Integer roc4 = 30;
    Integer sma1 = 10;
    Integer sma2 = 10;
    Integer sma3 = 10;
    Integer sma4 = 15;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityKnowSureThing result = securityApi.getSecurityPriceTechnicalsKst(identifier, roc1, roc2, roc3, roc4, sma1, sma2, sma3, sma4, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


Moving average convergence divergence (MACD) is a trend-following momentum oscillator that consists of three indicators: (1) a 12 period short-term exponential moving average (EMA) a 26 period long-term EMA and a 9 period EMA signal line. Traders using MACD often look for signal line crossovers, centerline crossovers, and EMA divergences to indicate the momentum and underlying trend of a security&#x60;s price.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer fastPeriod = 12;
    Integer slowPeriod = 26;
    Integer signalPeriod = 9;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityMovingAverageConvergenceDivergence result = securityApi.getSecurityPriceTechnicalsMacd(identifier, fastPeriod, slowPeriod, signalPeriod, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Money Flow Index (MFI) is a technical oscillator that incorporates both price and volume, moving between 0 and 100. Traders often consider a MFI above 80 as overbought conditions and below 20 as oversold conditions.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 14;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityMoneyFlowIndex result = securityApi.getSecurityPriceTechnicalsMfi(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The mass index (MI) is a technical indicator used by traders to predict trend reversals. A trend reversal signal is said to occur when the 25-day MI reaches 27.0 and then falls below 26.0.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer emaPeriod = 9;
    Integer sumPeriod = 25;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityMassIndex result = securityApi.getSecurityPriceTechnicalsMi(identifier, emaPeriod, sumPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The negative volume index (NVI) is often referred to as the &#x60;smart money indicator.&#x60; It works by the assumption that smart money (institutional money) is at work when volume decreases and vice versa when volume increases. NVI starts at 1000 and increases in regard to the percentage price change when volume decreases over a 255-day EMA period. Traders often use this technical indicator when researching broder markets and indices.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityNegativeVolumeIndex result = securityApi.getSecurityPriceTechnicalsNvi(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


On-balance volume (OBV) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. When both OBV and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityOnBalanceVolume result = securityApi.getSecurityPriceTechnicalsObv(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


On-balance volume mean (OBVM) is a leading momentum indicator that uses the increase/decrease flow in volume to predict upcoming stock price changes. The difference between OBV and OBVM is that OBVM takes the mean average of a provided period.  When both OBVM and a security&#x60;s price are making higher highs, it is presumed the upward trend is likely to continue and vice versa.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 10;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityOnBalanceVolumeMean result = securityApi.getSecurityPriceTechnicalsObvMean(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


Relative strength index (RSI) is a momentum oscillator that ranges between 0 and 100. Traders believe that an RSI value over 70 indicates that a security is overbought and an RSI under 30 indicates that a security is oversold.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 14;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityRelativeStrengthIndex result = securityApi.getSecurityPriceTechnicalsRsi(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


A simple moving average (SMA) adds recent prices for a specified period and divides the total by that same number of periods. SMA is typically used to indicate whether a security is in an uptrend or downtrend and can also be combined with a long-term moving average to improve the signal&#x60;s abilities.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 20;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecuritySimpleMovingAverage result = securityApi.getSecurityPriceTechnicalsSma(identifier, period, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Stochastic Oscillator (SO) is a range-bound momentum indicator that ranges from 0 to 100 and follows the velocity of the momentum itself, not the underlying price or volume. When SO is above 80 it indicates that a security is trading at the high end of its period&#x60;s high-low range and vice versa if the reading is below 20.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 14;
    Integer signalPeriod = 3;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityStochasticOscillator result = securityApi.getSecurityPriceTechnicalsSr(identifier, period, signalPeriod, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Triple Exponential Average (TEA) is a momentum indicator used to identify when a security is oversold and overbought. By exponentially smoothing out the underlying security&#x60;s moving average, the TEA  filters out insignificant price movements. A positive TEA is often believed to indicate momentum is increasing and a negative TEA indicates that momentum is decreasing.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 15;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityTripleExponentialAverage result = securityApi.getSecurityPriceTechnicalsTrix(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The True Strength Index (TSI) is a momentum oscillator used to identify building trends and trend reversals, typically by signalling overbought and oversold conditions. TSI fluctuates between positive and negative values, and traders typically combine its signal with other momentum oscillators to increase its strength. When TSI crosses the signal line into positive territory it is presumed to be an entrance opportunity and vice versa when the TSI crosses into negative territory.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer lowPeriod = 13;
    Integer highPeriod = 25;
    String priceKey = "close";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityTrueStrengthIndex result = securityApi.getSecurityPriceTechnicalsTsi(identifier, lowPeriod, highPeriod, priceKey, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Ultimate Oscillator (UO) is a range bound technical indicator that moves between 0 and 100 and is calculated with 3 timeframes, typically 7, 14, and 28 day periods. When UO&#x60;s value is above 70 a security is categorized as overbought and when UO&#x60;s value is below 30 a security is categorized as oversold.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer shortPeriod = 7;
    Integer mediumPeriod = 14;
    Integer longPeriod = 28;
    Float shortWeight = 4.0F;
    Float mediumWeight = 2.0F;
    Float longWeight = 1.0F;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityUltimateOscillator result = securityApi.getSecurityPriceTechnicalsUo(identifier, shortPeriod, mediumPeriod, longPeriod, shortWeight, mediumWeight, longWeight, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The Vortex Indicator (VI) is composed of an uptrend line (VI+) and a downtrend line (VI-). When VI+ crosses VI- from below it typically indicates an entry into a given security. When VI- crosses VI+ from below it typically triggers an exit and that the current trend is reversing course.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 14;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityVortexIndicator result = securityApi.getSecurityPriceTechnicalsVi(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


The volume price trend (VPT) is a technical indicator that uses price &amp; volume to determine whether a trend is established. Typically, when a security is trending upwards, there is more volume on positive days than negative ones, and as a result VPT should be increasing on these days as well. However, if VPT fails to increase past its previous high during an outbreak, this is suggested to indicate the rally is losing strength.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityVolumePriceTrend result = securityApi.getSecurityPriceTechnicalsVpt(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


Volume Weighted Average Price (VWAP) is a lagging technical indicator that is used in combination with a security&#x60;s price. When the underlying price rises above its VWAP, it is often interpreted as a bullish signal, and vice versa in the opposite direction.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityVolumeWeightedAveragePrice result = securityApi.getSecurityPriceTechnicalsVwap(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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


Williams %R is a momentum indicator used to determine overbought and oversold environments for a security and fluctuates between 0 and -100. When Williams %R is above -20 the security is considered to be overbought and when Williams %R is under -80 the security is considered to be oversold.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer period = 14;
    String startDate = "2018-01-01";
    String endDate = "2019-01-01";
    BigDecimal pageSize = null;
    String nextPage = null;
    ApiResponseSecurityWilliamsR result = securityApi.getSecurityPriceTechnicalsWr(identifier, period, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    List<String> source = Arrays.asList("iex");
    RealtimeStockPrice result = securityApi.getSecurityRealtimePrice(identifier, source);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| A Security identifier (Ticker, FIGI, ISIN, CUSIP, Intrinio ID) | &nbsp;
 **source** | [**List&lt;String&gt;**](String.md)| Return the realtime price from the specified data source. If no source is specified, the best source available is used. | [optional] [enum: iex, bats_delayed, utp_delayed, cta_a_delayed, cta_b_delayed, otc_delayed, delayed_sip, nasdaq_basic, intrinio_mx, intrinio_mx_plus] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**RealtimeStockPrice**](RealtimeStockPrice.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityReplayFile)

[//]: # (RETURN_TYPE:SecurityReplayFileResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityReplayFileResult.md)

[//]: # (OPERATION:getSecurityReplayFile_v2)

[//]: # (ENDPOINT:/securities/replay)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityReplayFile)

<a name="getSecurityReplayFile"></a>
## **getSecurityReplayFile**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityReplayFile_v2)

[//]: # (START_OVERVIEW)

> SecurityReplayFileResult getSecurityReplayFile(subsource, date)

#### Security Replay File


Returns a url where the requested replay file may be downloaded from.

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

    SecurityApi securityApi = new SecurityApi();
    String subsource = null;
    LocalDate date = null;
    SecurityReplayFileResult result = securityApi.getSecurityReplayFile(subsource, date);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subsource** | String| The specific source of the data being requested. | [enum: iex, utp_delayed, cta_a_delayed, cta_b_delayed, otc_delayed, nasdaq_basic] &nbsp;
 **date** | LocalDate| The date for the data being requested. | &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityReplayFileResult**](SecurityReplayFileResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecuritySnapshots)

[//]: # (RETURN_TYPE:SecuritySnapshotsResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecuritySnapshotsResult.md)

[//]: # (OPERATION:getSecuritySnapshots_v2)

[//]: # (ENDPOINT:/securities/snapshots)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecuritySnapshots)

<a name="getSecuritySnapshots"></a>
## **getSecuritySnapshots**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecuritySnapshots_v2)

[//]: # (START_OVERVIEW)

> SecuritySnapshotsResult getSecuritySnapshots(atDatetime)

#### Realtime Stock Prices Snapshot


Returns all security snapshots for the queried interval with links to download.

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

    SecurityApi securityApi = new SecurityApi();
    OffsetDateTime atDatetime = OffsetDateTime.now();
    SecuritySnapshotsResult result = securityApi.getSecuritySnapshots(atDatetime);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **atDatetime** | OffsetDateTime| The UTC date and time (with url-encoded spaces) the snapshot will cover. | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecuritySnapshotsResult**](SecuritySnapshotsResult.md)

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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    LocalDate startDate = LocalDate.of(2018,1,01);
    LocalDate endDate = LocalDate.of(2019,1,01);
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityStockPriceAdjustments result = securityApi.getSecurityStockPriceAdjustments(identifier, startDate, endDate, pageSize, nextPage);
    System.out.println(result);
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
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    auth.setApiKey("YOUR_API_KEY");
    defaultClient.setAllowRetries(true);

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    LocalDate startDate = LocalDate.of(2018,1,01);
    LocalDate endDate = LocalDate.of(2019,1,01);
    String frequency = "daily";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityStockPrices result = securityApi.getSecurityStockPrices(identifier, startDate, endDate, frequency, pageSize, nextPage);
    System.out.println(result);
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

[//]: # (METHOD:getSecurityTrades)

[//]: # (RETURN_TYPE:SecurityTradesResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityTradesResult.md)

[//]: # (OPERATION:getSecurityTrades_v2)

[//]: # (ENDPOINT:/securities/trades)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityTrades)

<a name="getSecurityTrades"></a>
## **getSecurityTrades**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityTrades_v2)

[//]: # (START_OVERVIEW)

> SecurityTradesResult getSecurityTrades(source, startDate, startTime, endDate, endTime, timezone, pageSize, darkpoolOnly, minSize, nextPage)

#### Security Trades


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

    SecurityApi securityApi = new SecurityApi();
    String source = null;
    LocalDate startDate = null;
    String startTime = null;
    LocalDate endDate = null;
    String endTime = null;
    String timezone = "UTC";
    Integer pageSize = 100;
    Boolean darkpoolOnly = false;
    Integer minSize = 100;
    String nextPage = null;
    SecurityTradesResult result = securityApi.getSecurityTrades(source, startDate, startTime, endDate, endTime, timezone, pageSize, darkpoolOnly, minSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | String| The specific source of the data being requested. | [enum: nasdaq_basic, iex, cta_a_delayed, cta_b_delayed, utp_delayed, otc_delayed] &nbsp;
 **startDate** | LocalDate| The start date for the data being requested. | [optional] &nbsp;
 **startTime** | String| The start time for the data being requested. | [optional] &nbsp;
 **endDate** | LocalDate| The end date for the data being requested. | [optional] &nbsp;
 **endTime** | String| The end time for the data being requested. | [optional] &nbsp;
 **timezone** | String| The timezone the start and end date/times use. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu] &nbsp;
 **pageSize** | Integer| The maximum number of results to return per page. | [optional] [default to 100] &nbsp;
 **darkpoolOnly** | Boolean| Set to true to show only darkpool trades | [optional] [default to false] &nbsp;
 **minSize** | Integer| Trades must be larger or equal to this size. | [optional] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityTradesResult**](SecurityTradesResult.md)

[//]: # (END_OPERATION)


[//]: # (START_OPERATION)

[//]: # (CLASS:SecurityApi)

[//]: # (METHOD:getSecurityTradesBySymbol)

[//]: # (RETURN_TYPE:SecurityTradesResult)

[//]: # (RETURN_TYPE_KIND:object)

[//]: # (RETURN_TYPE_DOC:SecurityTradesResult.md)

[//]: # (OPERATION:getSecurityTradesBySymbol_v2)

[//]: # (ENDPOINT:/securities/{identifier}/trades)

[//]: # (DOCUMENT_LINK:SecurityApi.md#getSecurityTradesBySymbol)

<a name="getSecurityTradesBySymbol"></a>
## **getSecurityTradesBySymbol**

[**View Intrinio API Documentation**](https://docs.intrinio.com/documentation/java/getSecurityTradesBySymbol_v2)

[//]: # (START_OVERVIEW)

> SecurityTradesResult getSecurityTradesBySymbol(identifier, source, startDate, startTime, endDate, endTime, timezone, darkpoolOnly, pageSize, minSize, nextPage)

#### Security Trades By Symbol


Returns all trades for a symbol between start time and end time, up to seven days ago for the specified source.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String source = null;
    LocalDate startDate = null;
    String startTime = null;
    LocalDate endDate = null;
    String endTime = null;
    String timezone = "UTC";
    Boolean darkpoolOnly = false;
    Integer pageSize = 100;
    Integer minSize = 100;
    String nextPage = null;
    SecurityTradesResult result = securityApi.getSecurityTradesBySymbol(identifier, source, startDate, startTime, endDate, endTime, timezone, darkpoolOnly, pageSize, minSize, nextPage);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | String| The ticker symbol for which trades are being requested. | &nbsp;
 **source** | String| The specific source of the data being requested.  Specifying delayed sip will result in the system automatically determining which delayed sip source (cta_delayed, cta_b_delayed, utp_delayed, otc_delayed) to use. | [enum: nasdaq_basic, delayed_sip, iex, cta_a_delayed, cta_b_delayed, utp_delayed, otc_delayed] &nbsp;
 **startDate** | LocalDate| The start date for the data being requested. | [optional] &nbsp;
 **startTime** | String| The start time for the data being requested. | [optional] &nbsp;
 **endDate** | LocalDate| The end date for the data being requested. | [optional] &nbsp;
 **endTime** | String| The end time for the data being requested. | [optional] &nbsp;
 **timezone** | String| The timezone the start and end date/times use. | [optional] [default to UTC] [enum: Africa/Algiers, Africa/Cairo, Africa/Casablanca, Africa/Harare, Africa/Johannesburg, Africa/Monrovia, Africa/Nairobi, America/Argentina/Buenos_Aires, America/Bogota, America/Caracas, America/Chicago, America/Chihuahua, America/Denver, America/Godthab, America/Guatemala, America/Guyana, America/Halifax, America/Indiana/Indianapolis, America/Juneau, America/La_Paz, America/Lima, America/Lima, America/Los_Angeles, America/Mazatlan, America/Mexico_City, America/Mexico_City, America/Monterrey, America/Montevideo, America/New_York, America/Phoenix, America/Regina, America/Santiago, America/Sao_Paulo, America/St_Johns, America/Tijuana, Asia/Almaty, Asia/Baghdad, Asia/Baku, Asia/Bangkok, Asia/Bangkok, Asia/Chongqing, Asia/Colombo, Asia/Dhaka, Asia/Dhaka, Asia/Hong_Kong, Asia/Irkutsk, Asia/Jakarta, Asia/Jerusalem, Asia/Kabul, Asia/Kamchatka, Asia/Karachi, Asia/Karachi, Asia/Kathmandu, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Kolkata, Asia/Krasnoyarsk, Asia/Kuala_Lumpur, Asia/Kuwait, Asia/Magadan, Asia/Muscat, Asia/Muscat, Asia/Novosibirsk, Asia/Rangoon, Asia/Riyadh, Asia/Seoul, Asia/Shanghai, Asia/Singapore, Asia/Srednekolymsk, Asia/Taipei, Asia/Tashkent, Asia/Tbilisi, Asia/Tehran, Asia/Tokyo, Asia/Tokyo, Asia/Tokyo, Asia/Ulaanbaatar, Asia/Urumqi, Asia/Vladivostok, Asia/Yakutsk, Asia/Yekaterinburg, Asia/Yerevan, Atlantic/Azores, Atlantic/Cape_Verde, Atlantic/South_Georgia, Australia/Adelaide, Australia/Brisbane, Australia/Darwin, Australia/Hobart, Australia/Melbourne, Australia/Melbourne, Australia/Perth, Australia/Sydney, Etc/UTC, UTC, Europe/Amsterdam, Europe/Athens, Europe/Belgrade, Europe/Berlin, Europe/Berlin, Europe/Bratislava, Europe/Brussels, Europe/Bucharest, Europe/Budapest, Europe/Copenhagen, Europe/Dublin, Europe/Helsinki, Europe/Istanbul, Europe/Kaliningrad, Europe/Kiev, Europe/Lisbon, Europe/Ljubljana, Europe/London, Europe/London, Europe/Madrid, Europe/Minsk, Europe/Moscow, Europe/Moscow, Europe/Paris, Europe/Prague, Europe/Riga, Europe/Rome, Europe/Samara, Europe/Sarajevo, Europe/Skopje, Europe/Sofia, Europe/Stockholm, Europe/Tallinn, Europe/Vienna, Europe/Vilnius, Europe/Volgograd, Europe/Warsaw, Europe/Zagreb, Pacific/Apia, Pacific/Auckland, Pacific/Auckland, Pacific/Chatham, Pacific/Fakaofo, Pacific/Fiji, Pacific/Guadalcanal, Pacific/Guam, Pacific/Honolulu, Pacific/Majuro, Pacific/Midway, Pacific/Midway, Pacific/Noumea, Pacific/Pago_Pago, Pacific/Port_Moresby, Pacific/Tongatapu] &nbsp;
 **darkpoolOnly** | Boolean| Set to true to show only darkpool trades | [optional] [default to false] &nbsp;
 **pageSize** | Integer| The maximum number of results to return per page. | [optional] [default to 100] &nbsp;
 **minSize** | Integer| Trades must be larger or equal to this size. | [optional] &nbsp;
 **nextPage** | String| Gets the next page of data from a previous API call | [optional] &nbsp;
<br/>

[//]: # (END_PARAMETERS)

### Return type

[**SecurityTradesResult**](SecurityTradesResult.md)

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

#### Zacks Analyst Ratings for Security


This database offers consensus analyst recommendations for over 5,000 US and Canadian listed companies.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String startDate = null;
    String endDate = null;
    BigDecimal meanGreater = null;
    BigDecimal meanLess = null;
    Integer strongBuysGreater = null;
    Integer strongBuysLess = null;
    Integer buysGreater = null;
    Integer buysLess = null;
    Integer holdsGreater = null;
    Integer holdsLess = null;
    Integer sellsGreater = null;
    Integer sellsLess = null;
    Integer strongSellsGreater = null;
    Integer strongSellsLess = null;
    Integer totalGreater = null;
    Integer totalLess = null;
    Integer pageSize = 100;
    ApiResponseSecurityZacksAnalystRatings result = securityApi.getSecurityZacksAnalystRatings(identifier, startDate, endDate, meanGreater, meanLess, strongBuysGreater, strongBuysLess, buysGreater, buysLess, holdsGreater, holdsLess, sellsGreater, sellsLess, strongSellsGreater, strongSellsLess, totalGreater, totalLess, pageSize);
    System.out.println(result);
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


This database offers current and historical consensus analyst recommendation snapshots for over 5,000 US and Canadian listed companies.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    String date = null;
    ApiResponseSecurityZacksAnalystRatingsSnapshot result = securityApi.getSecurityZacksAnalystRatingsSnapshot(identifier, date);
    System.out.println(result);
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


Returns historical estimated and actual earnings, guidance, and announcement dates for a specified symbol.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityZacksEPSSurprises result = securityApi.getSecurityZacksEpsSurprises(identifier, pageSize, nextPage);
    System.out.println(result);
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


This database returns historical estimated and actual sales, guidance, and announcement dates for a specified US or Canadian company.

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

    SecurityApi securityApi = new SecurityApi();
    String identifier = "AAPL";
    Integer pageSize = 100;
    String nextPage = null;
    ApiResponseSecurityZacksSalesSurprises result = securityApi.getSecurityZacksSalesSurprises(identifier, pageSize, nextPage);
    System.out.println(result);
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


Screen Securities using complex logic. Use POST only. See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions.

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

    SecurityApi securityApi = new SecurityApi();
    SecurityScreenGroup logic = new SecurityScreenGroup();
    String orderColumn = "marketcap";
    String orderDirection = "asc";
    Boolean primaryOnly = false;
    Integer pageSize = 100;
    logic.setOperator("AND");

    SecurityScreenClause clauseOne = new SecurityScreenClause();
    SecurityScreenClause clauseTwo = new SecurityScreenClause();

    clauseOne.setField("marketcap");
    clauseOne.setOperator(SecurityScreenClause.OperatorEnum.GT);
    clauseOne.setValue("100000000");

    clauseTwo.setField("beta");
    clauseTwo.setOperator(SecurityScreenClause.OperatorEnum.LT);
    clauseTwo.setValue("5");

    List<SecurityScreenClause> clauses = new ArrayList<>();

    clauses.add(clauseOne);
    clauses.add(clauseTwo);
    logic.setClauses(clauses);
    List<SecurityScreenResult> result = securityApi.screenSecurities(logic, orderColumn, orderDirection, primaryOnly, pageSize);
    System.out.println(result);
  }
}
```

[//]: # (END_CODE_EXAMPLE)

### Parameters

[//]: # (START_PARAMETERS)


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logic** | [**SecurityScreenGroup**](SecurityScreenGroup.md)| The logic to screen with, consisting of operators, clauses, and nested groups. &lt;/br&gt; See &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/screener_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;screener documentation&lt;/a&gt; for details on how to construct conditions. | [optional] &nbsp;
 **orderColumn** | String| Results returned sorted by this column | [optional] &nbsp;
 **orderDirection** | String| Sort order to use with the order_column | [optional] [default to asc] [enum: asc, desc] &nbsp;
 **primaryOnly** | Boolean| Return only primary securities | [optional] [default to false] &nbsp;
 **pageSize** | Integer| The number of results to return. Maximum for this endpoint is 50000. | [optional] [default to 100] &nbsp;
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


Search the securities database and return a list of securities matching the text query parameter passed through. Query parameter searches across the security ticker and name.

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

    SecurityApi securityApi = new SecurityApi();
    String query = "Apple";
    Integer pageSize = 100;
    ApiResponseSecuritiesSearch result = securityApi.searchSecurities(query, pageSize);
    System.out.println(result);
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

