
## ApiResponseSecurityIntradayPrices

### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**intradayPrices** | [**List&lt;IntradayStockPrice&gt;**](IntradayStockPrice.md) | The intraday stock prices for the Security |  [optional]
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security resolved from the given identifier |  [optional]
**source** | [**SourceEnum**](#SourceEnum) | The source of the data |  [optional]
**nextPage** | **String** | The token required to request the next page of the data |  [optional]


<a name="SourceEnum"></a>
### Enum: SourceEnum
Name | Value
---- | -----
IEX | &quot;iex&quot;
BATS | &quot;bats&quot;



