
[//]: # (CLASS:OptionIntervalsMoversResult)

[//]: # (KIND:object)

### OptionIntervalsMoversResult

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**openTime** | [**OffsetDateTime**](OffsetDateTime.md) | The UTC timestamp for the time this interval opened. &nbsp;
**closeTime** | [**OffsetDateTime**](OffsetDateTime.md) | The UTC timestamp for the time this interval closed. &nbsp;
**size** | SizeEnum | The size of the time span for the interval. &nbsp;
**intervals** | [**List&lt;OptionIntervalMover&gt;**](OptionIntervalMover.md) | Array of all the intervals in the result. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:OptionIntervalMover)



<br/>

#### Enum: SizeEnum

Name | Value
---- | -----
SIXTYMINUTE | &quot;SixtyMinute&quot;
THIRTYMINUTE | &quot;ThirtyMinute&quot;
FIFTEENMINUTE | &quot;FifteenMinute&quot;
TENMINUTE | &quot;TenMinute&quot;
FIVEMINUTE | &quot;FiveMinute&quot;
ONEMINUTE | &quot;OneMinute&quot;



