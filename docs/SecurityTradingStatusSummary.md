
[//]: # (CLASS:SecurityTradingStatusSummary)

[//]: # (KIND:object)

### SecurityTradingStatusSummary

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security resolved from the given identifier &nbsp;
**tradingStatus** | TradingStatusEnum | The trading status of the security. &nbsp;
**tradingStatusReason** | String | The exchange supplied reason for its current status. &nbsp;
**tradingStatusUpdatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The time the exchange reported that it changed its trading status. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:SecuritySummary)


[//]: # (CONTAINED_CLASS:OffsetDateTime)



<br/>

#### Enum: TradingStatusEnum

Name | Value
---- | -----
TRADING | &quot;trading&quot;
QUOTES_ONLY | &quot;quotes_only&quot;
STOPPED | &quot;stopped&quot;



