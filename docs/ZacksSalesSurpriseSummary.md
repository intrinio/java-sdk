
[//]: # (CLASS:ZacksSalesSurpriseSummary)

[//]: # (KIND:object)

### ZacksSalesSurpriseSummary

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**id** | String | The Intrinio ID for the record &nbsp;
**fiscalYear** | [**BigDecimal**](BigDecimal.md) | The company’s fiscal year for the reported period &nbsp;
**fiscalQuarter** | String | The company’s fiscal quarter for the reported period &nbsp;
**calendarYear** | [**BigDecimal**](BigDecimal.md) | The closest calendar year for the company’s fiscal year &nbsp;
**calendarQuarter** | String | The closest calendar quarter for the company’s fiscal year &nbsp;
**actualReportedDate** | [**LocalDate**](LocalDate.md) | The actual report date for the earnings release &nbsp;
**actualReportedTime** | String | The actual report time for the earnings release &nbsp;
**actualReportedCode** | String | The code cooresponding to the earnings release  BTO &#x3D; BEFORE THE OPEN | DTM &#x3D; DURING THE MARKET | AMC &#x3D; AFTER MARKET CLOSE &nbsp;
**actualReportedDesc** | String | The description for the type of earnings release &nbsp;
**lastRevDate** | [**LocalDate**](LocalDate.md) | The last revision date for the analyst estimates &nbsp;
**salesActual** | [**BigDecimal**](BigDecimal.md) | The actual Non-GAAP sales figure released by the company, interpreted by Zacks. &nbsp;
**salesActualZacksAdj** | [**BigDecimal**](BigDecimal.md) | The adjustments Zacks made to get to Non-GAAP sales to reconcile with GAAP sales. &nbsp;
**salesActualGaap** | [**BigDecimal**](BigDecimal.md) | The actual GAAP sales figured released by the company &nbsp;
**salesMeanEstimate** | [**BigDecimal**](BigDecimal.md) | The pre-earnings release mean sales estimate for the company sales_count_estimate; the pre-earnings release number of estimates by analysts &nbsp;
**salesAmountDiff** | [**BigDecimal**](BigDecimal.md) | The sales surprise amount difference &nbsp;
**salesPercentDiff** | [**BigDecimal**](BigDecimal.md) | The sales surprise percent difference &nbsp;
**salesStdDevEstimate** | [**BigDecimal**](BigDecimal.md) | The pre-earnings release standard deviation of sales estimates &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security of the Zacks Sales Surprise &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:SecuritySummary)





