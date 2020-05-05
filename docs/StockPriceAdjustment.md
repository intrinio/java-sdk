
[//]: # (CLASS:StockPriceAdjustment)

[//]: # (KIND:object)

### StockPriceAdjustment

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | The date on which the adjustment occurred. The adjustment should be applied to all stock prices before this date. &nbsp;
**factor** | [**BigDecimal**](BigDecimal.md) | The factor by which to multiply stock prices before this date, in order to calculate historically-adjusted stock prices. &nbsp;
**dividend** | [**BigDecimal**](BigDecimal.md) | The dividend amount, if a dividend was paid. &nbsp;
**dividendCurrency** | String | The currency of the dividend, if known. &nbsp;
**splitRatio** | [**BigDecimal**](BigDecimal.md) | The ratio of the stock split, if a stock split occurred. &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security of the stock price &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:SecuritySummary)





