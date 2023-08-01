
[//]: # (CLASS:ApiResponseSecurityIntradayPrices)

[//]: # (KIND:object)

### ApiResponseSecurityIntradayPrices

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**intradayPrices** | [**List&lt;IntradayStockPrice&gt;**](IntradayStockPrice.md) | The intraday stock prices for the Security &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security resolved from the given identifier &nbsp;
**source** | SourceEnum | The source of the data &nbsp;
**nextPage** | String | The token required to request the next page of the data. If null, no further results are available. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:IntradayStockPrice)


[//]: # (CONTAINED_CLASS:SecuritySummary)



<br/>

#### Enum: SourceEnum

Name | Value
---- | -----
REALTIME | &quot;realtime&quot;
DELAYED | &quot;delayed&quot;
NASDAQ_BASIC | &quot;nasdaq_basic&quot;



