
[//]: # (CLASS:OptionTradesResult)

[//]: # (KIND:object)

### OptionTradesResult

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**nextPage** | String | The token required to request the next page of the data. If null, no further results are available. &nbsp;
**source** | SourceEnum | The source of the trades. &nbsp;
**trades** | [**List&lt;OptionTrades&gt;**](OptionTrades.md) | Array of all the trades in this page of the result. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OptionTrades)



<br/>

#### Enum: SourceEnum

Name | Value
---- | -----
REALTIME | &quot;realtime&quot;
DELAYED | &quot;delayed&quot;



