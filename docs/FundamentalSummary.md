
[//]: # (CLASS:FundamentalSummary)

[//]: # (KIND:object)

### FundamentalSummary

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**id** | String | The Intrinio ID of the Fundamental &nbsp;
**statementCode** | String | The code of the financial statement that the Fundamental represents &nbsp;
**fiscalYear** | [**BigDecimal**](BigDecimal.md) | The fiscal year &nbsp;
**fiscalPeriod** | String | The fiscal period &nbsp;
**type** | TypeEnum | The type of Fundamental &nbsp;
**startDate** | [**LocalDate**](LocalDate.md) | The period start date &nbsp;
**endDate** | [**LocalDate**](LocalDate.md) | The period start date &nbsp;
**filingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the Fundamental was filed with the SEC &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:OffsetDateTime)



<br/>

#### Enum: TypeEnum

Name | Value
---- | -----
REPORTED | &quot;reported&quot;
RESTATED | &quot;restated&quot;
CALCULATED | &quot;calculated&quot;



