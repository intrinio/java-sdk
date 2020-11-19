
[//]: # (CLASS:OptionRealtime)

[//]: # (KIND:object)

### OptionRealtime

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**code** | String | The Intrinio Code for the Option. &nbsp;
**ticker** | String | The ticker symbol of the Security for the Option. &nbsp;
**expiration** | [**LocalDate**](LocalDate.md) | The date on which the Option expires. The Option becomes invalid after this date and cannot be exercised. &nbsp;
**strike** | [**BigDecimal**](BigDecimal.md) | The strike price is the fixed price at which a derivative can be exercised, and refers to the price of the derivative’s underlying asset.  In a call option, the strike price is the price at which the option holder can purchase the underlying security.  For a put option, the strike price is the price at which the option holder can sell the underlying security. &nbsp;
**type** | TypeEnum | The type of Option (put or call). &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)



<br/>

#### Enum: TypeEnum

Name | Value
---- | -----
PUT | &quot;put&quot;
CALL | &quot;call&quot;



