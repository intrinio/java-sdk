
[//]: # (CLASS:IndexInterval)

[//]: # (KIND:object)

### IndexInterval

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**time** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the start of the interval span. &nbsp;
**open** | [**BigDecimal**](BigDecimal.md) | The first traded price during the period &nbsp;
**close** | [**BigDecimal**](BigDecimal.md) | The last traded price during the period &nbsp;
**high** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period &nbsp;
**low** | [**BigDecimal**](BigDecimal.md) | The lowest price over the span of the period &nbsp;
**closeTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the end of the interval span. &nbsp;
**interval** | IntervalEnum | The size of the interval. &nbsp;
**average** | [**BigDecimal**](BigDecimal.md) | The average trade price of an individual stock during the interval. &nbsp;
**change** | [**BigDecimal**](BigDecimal.md) | The change ratio from open to close.  ((Close - Open)/Open). &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)



<br/>

#### Enum: IntervalEnum

Name | Value
---- | -----
SIXTYMINUTE | &quot;SixtyMinute&quot;
THIRTYMINUTE | &quot;ThirtyMinute&quot;
FIFTEENMINUTE | &quot;FifteenMinute&quot;
TENMINUTE | &quot;TenMinute&quot;
FIVEMINUTE | &quot;FiveMinute&quot;
ONEMINUTE | &quot;OneMinute&quot;



