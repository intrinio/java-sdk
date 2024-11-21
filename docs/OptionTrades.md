
[//]: # (CLASS:OptionTrades)

[//]: # (KIND:object)

### OptionTrades

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**contract** | String | The option contract &nbsp;
**underlyingSymbol** | String | The ticker symbol &nbsp;
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The UTC timestamp at the time of the trade. &nbsp;
**price** | [**BigDecimal**](BigDecimal.md) | The price of the trade. &nbsp;
**size** | [**BigDecimal**](BigDecimal.md) | The size of the trade. &nbsp;
**totalVolume** | [**BigDecimal**](BigDecimal.md) | The total volume of the symbol for the day up to the timestamp point in time. &nbsp;
**askPriceAtExecution** | [**BigDecimal**](BigDecimal.md) | The price of ask quote at the time of the trade. &nbsp;
**bidPriceAtExecution** | [**BigDecimal**](BigDecimal.md) | The price of bid quote at the time of the trade. &nbsp;
**exchange** | String | The exchange for the trade. &nbsp;
**conditions** | String | The condition of the trade. &nbsp;
**sequenceId** | [**BigDecimal**](BigDecimal.md) | The sequential ID for the trade, ordered as temporally received from the exchange. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)





