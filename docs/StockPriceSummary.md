
[//]: # (CLASS:StockPriceSummary)

[//]: # (KIND:object)

### StockPriceSummary

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | The calendar date that the stock price represents. For non-daily stock prices, this represents the last day in the period (end of the week, month, quarter, year, etc) &nbsp;
**intraperiod** | Boolean | If true, the stock price represents an unfinished period (be it day, week, quarter, month, or year), meaning that the close price is the latest price available, not the official close price for the period &nbsp;
**frequency** | FrequencyEnum | The type of period that the stock price represents &nbsp;
**open** | [**BigDecimal**](BigDecimal.md) | The price at the beginning of the period &nbsp;
**high** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period &nbsp;
**low** | [**BigDecimal**](BigDecimal.md) | The lowest price over the span of the period &nbsp;
**close** | [**BigDecimal**](BigDecimal.md) | The price at the end of the period &nbsp;
**volume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the period &nbsp;
**adjOpen** | [**BigDecimal**](BigDecimal.md) | The price at the beginning of the period, adjusted for splits and dividends &nbsp;
**adjHigh** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period, adjusted for splits and dividends &nbsp;
**adjLow** | [**BigDecimal**](BigDecimal.md) | The lowest price over the span of the period, adjusted for splits and dividends &nbsp;
**adjClose** | [**BigDecimal**](BigDecimal.md) | The price at the end of the period, adjusted for splits and dividends &nbsp;
**adjVolume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the period, adjusted for splits and dividends &nbsp;
**factor** | [**BigDecimal**](BigDecimal.md) | The factor by which to multiply stock prices before this date, in order to calculate historically-adjusted stock prices. &nbsp;
**splitRatio** | [**BigDecimal**](BigDecimal.md) | The ratio of the stock split, if a stock split occurred. &nbsp;
**dividend** | [**BigDecimal**](BigDecimal.md) | The dividend amount, if a dividend was paid. &nbsp;
**change** | [**BigDecimal**](BigDecimal.md) | The difference in price from the last price for this frequency &nbsp;
**percentChange** | [**BigDecimal**](BigDecimal.md) | The percent difference in price from the last price for this frequency &nbsp;
**fiftyTwoWeekHigh** | [**BigDecimal**](BigDecimal.md) | The 52 week high price (daily only) &nbsp;
**fiftyTwoWeekLow** | [**BigDecimal**](BigDecimal.md) | The 52 week low price (daily only) &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)



<br/>

#### Enum: FrequencyEnum

Name | Value
---- | -----
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
MONTHLY | &quot;monthly&quot;
QUARTERLY | &quot;quarterly&quot;
YEARLY | &quot;yearly&quot;



