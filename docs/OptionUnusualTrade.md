
[//]: # (CLASS:OptionUnusualTrade)

[//]: # (KIND:object)

### OptionUnusualTrade

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**symbol** | String | The underlying option security symbol for the trade &nbsp;
**timestamp** | [**LocalDate**](LocalDate.md) | The UTC timestamp of order placement &nbsp;
**type** | String | The type of unusual trade &nbsp;
**totalValue** | [**BigDecimal**](BigDecimal.md) | The aggregated value of all option contract premiums included in the trade &nbsp;
**contractType** | ContractTypeEnum | The type of Option (put or call) &nbsp;
**contractExpiration** | [**LocalDate**](LocalDate.md) | The expiration date for the options contract &nbsp;
**contractStrike** | [**BigDecimal**](BigDecimal.md) | The strike price of the option contract &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)



<br/>

#### Enum: ContractTypeEnum

Name | Value
---- | -----
PUT | &quot;put&quot;
CALL | &quot;call&quot;



