
## StockPrice

### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**LocalDate**](LocalDate.md) | The calendar date that the stock price represents. For non-daily stock prices, this represents the last day in the period (end of the week, month, quarter, year, etc) |  [optional]
**intraperiod** | **Boolean** | If true, the stock price represents an unfinished period (be it day, week, quarter, month, or year), meaning that the close price is the latest price available, not the official close price for the period |  [optional]
**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The type of period that the stock price represents |  [optional]
**open** | [**BigDecimal**](BigDecimal.md) | The price at the beginning of the period |  [optional]
**high** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period |  [optional]
**low** | [**BigDecimal**](BigDecimal.md) | The lowest price over the span of the period |  [optional]
**close** | [**BigDecimal**](BigDecimal.md) | The price at the end of the period |  [optional]
**volume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the period |  [optional]
**adjOpen** | [**BigDecimal**](BigDecimal.md) | The price at the beginning of the period, adjusted for splits and dividends |  [optional]
**adjHigh** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period, adjusted for splits and dividends |  [optional]
**adjLow** | [**BigDecimal**](BigDecimal.md) | The lowest price over the span of the period, adjusted for splits and dividends |  [optional]
**adjClose** | [**BigDecimal**](BigDecimal.md) | The price at the end of the period, adjusted for splits and dividends |  [optional]
**adjVolume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the period, adjusted for splits and dividends |  [optional]
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security of the stock price |  [optional]


<a name="FrequencyEnum"></a>
### Enum: FrequencyEnum
Name | Value
---- | -----
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
MONTHLY | &quot;monthly&quot;
QUARTERLY | &quot;quarterly&quot;
YEARLY | &quot;yearly&quot;



