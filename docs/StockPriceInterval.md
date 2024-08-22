
[//]: # (CLASS:StockPriceInterval)

[//]: # (KIND:object)

### StockPriceInterval

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**time** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the start of the interval span. &nbsp;
**open** | [**BigDecimal**](BigDecimal.md) | The first traded price during the period &nbsp;
**close** | [**BigDecimal**](BigDecimal.md) | The last traded price during the period &nbsp;
**high** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period &nbsp;
**low** | [**BigDecimal**](BigDecimal.md) | The lowest price over the span of the period &nbsp;
**volume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the period &nbsp;
**closeTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the end of the interval span. &nbsp;
**interval** | IntervalEnum | The size of the interval. &nbsp;
**average** | [**BigDecimal**](BigDecimal.md) | The average trade price of an individual stock during the interval. &nbsp;
**change** | [**BigDecimal**](BigDecimal.md) | The change ratio from open to close.  ((Close - Open)/Open). &nbsp;
**bidHigh** | [**BigDecimal**](BigDecimal.md) | The highest bid price from the interval. &nbsp;
**bidLow** | [**BigDecimal**](BigDecimal.md) | The lowest bid price from the interval. &nbsp;
**bidClose** | [**BigDecimal**](BigDecimal.md) | The last bid price from the interval. &nbsp;
**bidOpen** | [**BigDecimal**](BigDecimal.md) | The first bid price from the interval. &nbsp;
**bidFirstTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the first bid time from the interval span. &nbsp;
**bidLastTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the last bid time from the interval span. &nbsp;
**bidChangePercent** | [**BigDecimal**](BigDecimal.md) | The ratio of the close to open bid difference, in percent. &nbsp;
**askHigh** | [**BigDecimal**](BigDecimal.md) | The highest ask price from the interval. &nbsp;
**askLow** | [**BigDecimal**](BigDecimal.md) | The lowest ask price from the interval. &nbsp;
**askClose** | [**BigDecimal**](BigDecimal.md) | The last ask price from the interval. &nbsp;
**askOpen** | [**BigDecimal**](BigDecimal.md) | The first ask price from the interval. &nbsp;
**askFirstTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the first ask time from the interval span. &nbsp;
**askLastTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp that represents the last ask time from the interval span. &nbsp;
**askChangePercent** | [**BigDecimal**](BigDecimal.md) | The ratio of the close to open ask difference, in percent. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


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



