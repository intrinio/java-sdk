
[//]: # (CLASS:Fundamental)

[//]: # (KIND:object)

### Fundamental

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
**isLatest** | Boolean | Is this the latest fundamental available based on the company&#39;s most recent filings? Use the Lookup Fundamental endpoint to find the latest fundamental (&lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/web_api/lookup_fundamental_v2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;reference&lt;/a&gt;) &nbsp;
**company** | [**CompanySummary**](CompanySummary.md) | The Company that the Fundamental was belongs to &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:CompanySummary)



<br/>

#### Enum: TypeEnum

Name | Value
---- | -----
REPORTED | &quot;reported&quot;
RESTATED | &quot;restated&quot;
CALCULATED | &quot;calculated&quot;



