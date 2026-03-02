
[//]: # (CLASS:ApiResponseSecurityTradingStatuses)

[//]: # (KIND:object)

### ApiResponseSecurityTradingStatuses

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**statuses** | [**List&lt;SecurityTradingStatusSummary&gt;**](SecurityTradingStatusSummary.md) | The trading statuses of each returned security. &nbsp;
**marketStatus** | MarketStatusEnum | The status of the market. &nbsp;
**messages** | List&lt;String&gt; | A list of messages related to the request, such as warnings or errors. &nbsp;
**nextPage** | String | The token required to request the next page of the data. If null, no further results are available. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:SecurityTradingStatusSummary)



<br/>

#### Enum: MarketStatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
PREMARKET | &quot;premarket&quot;
POSTMARKET | &quot;postmarket&quot;
CLOSED_EARLY | &quot;closed_early&quot;



