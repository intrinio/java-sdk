
[//]: # (CLASS:ApiResponseSecurityIntervalPrices)

[//]: # (KIND:object)

### ApiResponseSecurityIntervalPrices

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**intervals** | [**List&lt;StockPriceInterval&gt;**](StockPriceInterval.md) | Open, close, high, low, volume, average price, and change ratio for a particular interval &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security resolved from the given identifier &nbsp;
**source** | SourceEnum | The source of the data &nbsp;
**nextPage** | String | The token required to request the next page of the data. If null, no further results are available. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:StockPriceInterval)


[//]: # (CONTAINED_CLASS:SecuritySummary)



<br/>

#### Enum: SourceEnum

Name | Value
---- | -----
REALTIME | &quot;realtime&quot;
DELAYED | &quot;delayed&quot;
NASDAQ_BASIC | &quot;nasdaq_basic&quot;
NASDAQ_BASIC_FILTERED | &quot;nasdaq_basic_filtered&quot;
NASDAQ_BASIC_LAST_SALE | &quot;nasdaq_basic_last_sale&quot;
CBOE_ONE | &quot;cboe_one&quot;
EQUITIES_EDGE | &quot;equities_edge&quot;



