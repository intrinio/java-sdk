
[//]: # (CLASS:OptionPriceRealtime)

[//]: # (KIND:object)

### OptionPriceRealtime

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**last** | [**BigDecimal**](BigDecimal.md) | The price of the last trade &nbsp;
**lastSize** | Integer | The size of the last trade &nbsp;
**lastTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the last trade &nbsp;
**volume** | Integer | The cumulative volume of this options contract that traded that day. &nbsp;
**ask** | [**BigDecimal**](BigDecimal.md) | The price of the top ask order &nbsp;
**askSize** | Integer | The size of the top ask order &nbsp;
**askTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the top ask order &nbsp;
**bid** | [**BigDecimal**](BigDecimal.md) | The price of the top bid order &nbsp;
**bidSize** | Integer | The size of the top bid order &nbsp;
**bidTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The time of the top bid order &nbsp;
**openInterest** | Integer | The total number of this options contract that are still open. &nbsp;
**exerciseStyle** | ExerciseStyleEnum | The exercise style of the option.  (\&quot;A\&quot; &#x3D; \&quot;American\&quot;, \&quot;E\&quot; &#x3D; \&quot;European\&quot;) &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:OffsetDateTime)



<br/>

#### Enum: ExerciseStyleEnum

Name | Value
---- | -----
A | &quot;A&quot;
E | &quot;E&quot;



