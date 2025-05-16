
[//]: # (CLASS:ApiResponseOptionsImpliedMove)

[//]: # (KIND:object)

### ApiResponseOptionsImpliedMove

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**impliedMove** | [**OptionImpliedMoveData**](OptionImpliedMoveData.md) | The data pertaining to the implied move. &nbsp;
**messages** | List&lt;String&gt; | Any messages or warnings about the data &nbsp;
**underlyingPrice** | [**BigDecimal**](BigDecimal.md) | The price of the underlying instrument. &nbsp;
**expiration** | String | The date on which the Option expires. The Option becomes invalid after this date and cannot be exercised. &nbsp;
**atmStrike** | [**BigDecimal**](BigDecimal.md) | The at-the-money strike price for the implied move calculation. &nbsp;
**straddlePrice** | [**BigDecimal**](BigDecimal.md) | The straddle price for the implied move calculation. &nbsp;
**symbol** | String | The symbol for the underlying instrument. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OptionImpliedMoveData)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)





