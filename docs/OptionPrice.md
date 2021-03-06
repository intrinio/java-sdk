
[//]: # (CLASS:OptionPrice)

[//]: # (KIND:object)

### OptionPrice

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**date** | String | The date of the price, in the format YYYY-MM-DD &nbsp;
**close** | [**BigDecimal**](BigDecimal.md) | The closing price of the options contract. &nbsp;
**closeBid** | [**BigDecimal**](BigDecimal.md) | The closing bid price of the options contract. &nbsp;
**closeAsk** | [**BigDecimal**](BigDecimal.md) | The closing ask price of the options contract. &nbsp;
**volume** | Integer | The cumulative volume of this options contract that traded that day. &nbsp;
**volumeBid** | Integer | The cumulative volume of this options contract that traded on the bid price that day. &nbsp;
**volumeAsk** | Integer | The cumulative volume of this options contract that traded on the ask price that day. &nbsp;
**trades** | Integer | The number of trades executed that for this options contract on that day. &nbsp;
**openInterest** | Integer | The total number of this options contract that are still open. &nbsp;
**openInterestChange** | Integer | The change in the total number of this options contract that are still open from the previous day. &nbsp;
**nextDayOpenInterest** | Integer | The total number of this options contract that are still open at the start of the next day. &nbsp;
**impliedVolatility** | [**BigDecimal**](BigDecimal.md) | The estimated volatility of the Security&#39;s price. Volatility is a statistical measure of dispersion of returns for the Security. Standard deviation of a Security&#39;s returns and a market index is an example of a measurement of volatility. Implied volatility approximates the future value of an option, and the option&#39;s current value takes this into consideration. &nbsp;
**impliedVolatilityChange** | [**BigDecimal**](BigDecimal.md) | The change in implied volatility for that day. &nbsp;
**delta** | [**BigDecimal**](BigDecimal.md) | Delta measures the degree to which an options contract is exposed to shifts in the price of the underlying Security. Values of delta range from 0.0 to 1.0 for call options and -1.0 to 0.0 for put options. For example, if a put option has a delta of -0.50, if the price of the underlying Security increases by $1, the price of the put option will decrease by $0.50. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)





