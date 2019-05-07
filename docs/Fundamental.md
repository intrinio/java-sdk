
## Fundamental

### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Intrinio ID of the Fundamental |  [optional]
**statementCode** | **String** | The code of the financial statement that the Fundamental represents |  [optional]
**fiscalYear** | [**BigDecimal**](BigDecimal.md) | The fiscal year |  [optional]
**fiscalPeriod** | **String** | The fiscal period |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of Fundamental |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) | The period start date |  [optional]
**endDate** | [**LocalDate**](LocalDate.md) | The period start date |  [optional]
**filingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the Fundamental was filed with the SEC |  [optional]
**company** | [**CompanySummary**](CompanySummary.md) | The Company that the Fundamental was belongs to |  [optional]


<a name="TypeEnum"></a>
### Enum: TypeEnum
Name | Value
---- | -----
REPORTED | &quot;reported&quot;
RESTATED | &quot;restated&quot;
CALCULATED | &quot;calculated&quot;



