
## StockPriceAdjustment

### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | The date on which the adjustment occurred. The adjustment should be applied to all stock prices before this date. |  [optional]
**factor** | [**BigDecimal**](BigDecimal.md) | The factor by which to multiply stock prices before this date, in order to calculate historically-adjusted stock prices. |  [optional]
**dividend** | [**BigDecimal**](BigDecimal.md) | The dividend amount, if a dividend was paid. |  [optional]
**dividendCurrency** | **String** | The currency of the dividend, if known. |  [optional]
**splitRatio** | [**BigDecimal**](BigDecimal.md) | The ratio of the stock split, if a stock split occurred. |  [optional]
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security of the stock price |  [optional]



