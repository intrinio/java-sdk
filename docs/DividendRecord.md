
[//]: # (CLASS:DividendRecord)

[//]: # (KIND:object)

### DividendRecord

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**exDividend** | [**BigDecimal**](BigDecimal.md) | Amount of dividend in US dollars &nbsp;
**currency** | String | The 3-digit currency code the dividend amount was reported in &nbsp;
**announcementDate** | [**LocalDate**](LocalDate.md) | Date dividend was announced &nbsp;
**recordDate** | [**LocalDate**](LocalDate.md) | Date before which holders-of-record will receive the dividend &nbsp;
**payDate** | [**LocalDate**](LocalDate.md) | Date the divdiend was paid &nbsp;
**frequency** | String | Identifies payment frequency of announced dividend &nbsp;
**status** | StatusEnum | Status of the dividend &nbsp;
**forwardYield** | [**BigDecimal**](BigDecimal.md) | The forward dividend yield &nbsp;
**forwardRate** | [**BigDecimal**](BigDecimal.md) | The forward dividend rate &nbsp;
**lastExDividendDate** | [**LocalDate**](LocalDate.md) | The last reported day the stock starts trading without the value of its next dividend payment &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) |  &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:SecuritySummary)



<br/>

#### Enum: StatusEnum

Name | Value
---- | -----
P | &quot;P&quot;
X | &quot;X&quot;
S | &quot;S&quot;
R | &quot;R&quot;



