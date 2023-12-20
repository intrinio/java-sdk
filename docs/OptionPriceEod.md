
[//]: # (CLASS:OptionPriceEod)

[//]: # (KIND:object)

### OptionPriceEod

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**date** | String | The date of the price, in the format YYYY-MM-DD &nbsp;
**close** | [**BigDecimal**](BigDecimal.md) | The closing price of the options contract. &nbsp;
**closeBid** | [**BigDecimal**](BigDecimal.md) | The closing bid price of the options contract. &nbsp;
**closeAsk** | [**BigDecimal**](BigDecimal.md) | The closing ask price of the options contract. &nbsp;
**volume** | Integer | The cumulative volume of this options contract that traded that day. &nbsp;
**open** | [**BigDecimal**](BigDecimal.md) | The price at the beginning of the period &nbsp;
**openAsk** | [**BigDecimal**](BigDecimal.md) | The ask at the beginning of the period &nbsp;
**openBid** | [**BigDecimal**](BigDecimal.md) | The bid at the beginning of the period &nbsp;
**openInterest** | Integer | The total number of this options contract that are still open. &nbsp;
**high** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period &nbsp;
**low** | [**BigDecimal**](BigDecimal.md) | The highest price over the span of the period &nbsp;
**mark** | [**BigDecimal**](BigDecimal.md) | The mid price between the latest bid and ask spread &nbsp;
**askHigh** | [**BigDecimal**](BigDecimal.md) | The highest ask over the span of the period &nbsp;
**askLow** | [**BigDecimal**](BigDecimal.md) | The lowest ask over the span of the period &nbsp;
**bidHigh** | [**BigDecimal**](BigDecimal.md) | The highest bid over the span of the period &nbsp;
**bidLow** | [**BigDecimal**](BigDecimal.md) | The lowest bid over the span of the period &nbsp;
**impliedVolatility** | [**BigDecimal**](BigDecimal.md) | The implied volatility of the contract calculated using the Black-Scholes Model. &nbsp;
**delta** | [**BigDecimal**](BigDecimal.md) | Delta represents the rate of change between the option&#39;s price and a $1 change in the underlying asset&#39;s price. &nbsp;
**gamma** | [**BigDecimal**](BigDecimal.md) | Gamma represents the rate of change between an option&#39;s delta and the underlying asset&#39;s price. &nbsp;
**theta** | [**BigDecimal**](BigDecimal.md) | Theta represents the rate of change between the option price and time, or time sensitivity - sometimes known as an option&#39;s time decay. &nbsp;
**vega** | [**BigDecimal**](BigDecimal.md) | Vega represents the rate of change between an option&#39;s value and the underlying asset&#39;s implied volatility. &nbsp;
**closeTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the last trade before close. &nbsp;
**closeSize** | Integer | The size of the last trade before close. &nbsp;
**closeBidTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the last bid before close. &nbsp;
**closeBidSize** | Integer | The size of the last bid before close. &nbsp;
**closeAskTime** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the last ask before close. &nbsp;
**closeAskSize** | Integer | The size of the last ask before close. &nbsp;
**exerciseStyle** | String | The exercise style. &nbsp;

[//]: # (END_DEFINITION)


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


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:OffsetDateTime)





