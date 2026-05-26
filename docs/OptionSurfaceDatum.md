
[//]: # (CLASS:OptionSurfaceDatum)

[//]: # (KIND:object)

### OptionSurfaceDatum

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**strikePrice** | [**BigDecimal**](BigDecimal.md) | The actual strike price.  Present when the requesting surface type is raw. &nbsp;
**unixTimestamp** | [**BigDecimal**](BigDecimal.md) | The expiration DateTime.  Present when the requesting surface type is raw. &nbsp;
**forwardNaturalLogMoneyness** | [**BigDecimal**](BigDecimal.md) | The natural logarithm of forward moneyness, calculated as ln(F / K), where F is the forward underlying price adjusted for risk-free rate and dividend yield over time to expiration, and K is the option strike. Present when the requesting surface type is something other than raw. &nbsp;
**squareRootTau** | [**BigDecimal**](BigDecimal.md) | The square root of tau, where tau is the option’s time to expiration in years using a 365.25-day year basis. Present when the requesting surface type is something other than raw. &nbsp;
**impliedVolatility** | [**BigDecimal**](BigDecimal.md) | The implied volatility of the contract calculated using the Black-Scholes Model, and smoothed if the requesting surface type was logarithmic_smoothed. Always present. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)





