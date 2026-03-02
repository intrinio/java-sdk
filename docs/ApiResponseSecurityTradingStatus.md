
[//]: # (CLASS:ApiResponseSecurityTradingStatus)

[//]: # (KIND:object)

### ApiResponseSecurityTradingStatus

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**tradingStatus** | TradingStatusEnum | The trading status of the security. &nbsp;
**tradingStatusReason** | String | The exchange supplied reason for its current status. &nbsp;
**tradingStatusUpdatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The time the exchange reported that it changed its trading status. &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security resolved from the given identifier &nbsp;
**marketStatus** | MarketStatusEnum | The status of the market. &nbsp;
**messages** | List&lt;String&gt; | A list of messages related to the request, such as warnings or errors. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:SecuritySummary)



<br/>

#### Enum: TradingStatusEnum

Name | Value
---- | -----
TRADING | &quot;trading&quot;
QUOTES_ONLY | &quot;quotes_only&quot;
STOPPED | &quot;stopped&quot;

<br/>

#### Enum: MarketStatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
PREMARKET | &quot;premarket&quot;
POSTMARKET | &quot;postmarket&quot;
CLOSED_EARLY | &quot;closed_early&quot;



