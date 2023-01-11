
[//]: # (CLASS:OptionUnusualTrade)

[//]: # (KIND:object)

### OptionUnusualTrade

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**symbol** | String | The underlying option security symbol for the trade &nbsp;
**timestamp** | [**LocalDate**](LocalDate.md) | The UTC timestamp of order placement &nbsp;
**type** | String | The type of unusual trade &nbsp;
**totalValue** | [**BigDecimal**](BigDecimal.md) | The aggregated value of all option contract premiums included in the trade &nbsp;
**totalSize** | [**BigDecimal**](BigDecimal.md) | The total number of contracts involved in a single transaction &nbsp;
**averagePrice** | [**BigDecimal**](BigDecimal.md) | The average premium paid per option contract &nbsp;
**contract** | String | The option contract symbol &nbsp;
**askAtExecution** | [**BigDecimal**](BigDecimal.md) | Ask price at execution &nbsp;
**bidAtExecution** | [**BigDecimal**](BigDecimal.md) | Bid price at execution &nbsp;
**sentiment** | SentimentEnum | Bullish, Bearish, or Neutral Sentiment is estimated based on whether the trade was executed at the bid, ask, or mark price. &nbsp;
**underlyingPriceAtExecution** | [**BigDecimal**](BigDecimal.md) | Price of the underlying security at execution of trade &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)



<br/>

#### Enum: SentimentEnum

Name | Value
---- | -----
BULLISH | &quot;bullish&quot;
BEARISH | &quot;bearish&quot;
NEUTRAL | &quot;neutral&quot;



