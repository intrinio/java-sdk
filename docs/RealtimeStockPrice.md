
### RealtimeStockPrice

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastPrice** | [**BigDecimal**](BigDecimal.md) | The price of the last trade. |  [optional]
**lastTime** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the last trade occurred. |  [optional]
**bidPrice** | [**BigDecimal**](BigDecimal.md) | The price of the top bid order. |  [optional]
**bidSize** | [**BigDecimal**](BigDecimal.md) | The size of the top bid order. |  [optional]
**askPrice** | [**BigDecimal**](BigDecimal.md) | The price of the top ask order. |  [optional]
**askSize** | [**BigDecimal**](BigDecimal.md) | The size of the top ask order. |  [optional]
**openPrice** | [**BigDecimal**](BigDecimal.md) | The price at the open of the trading day. |  [optional]
**highPrice** | [**BigDecimal**](BigDecimal.md) | The high price for the trading day. |  [optional]
**lowPrice** | [**BigDecimal**](BigDecimal.md) | The low price for the trading day. |  [optional]
**exchangeVolume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the trading day on the exchange. |  [optional]
**marketVolume** | [**BigDecimal**](BigDecimal.md) | The number of shares exchanged during the trading day for the whole market. |  [optional]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the data was last updated. |  [optional]
**source** | **String** | The source of the data. |  [optional]
**security** | [**RealtimeStockPriceSecurity**](RealtimeStockPriceSecurity.md) |  |  [optional]



