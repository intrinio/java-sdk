
## ZacksSalesSurpriseSummary

### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Intrinio ID for the record |  [optional]
**fiscalYear** | [**BigDecimal**](BigDecimal.md) | The company’s fiscal year for the reported period |  [optional]
**fiscalQuarter** | **String** | The company’s fiscal quarter for the reported period |  [optional]
**calendarYear** | [**BigDecimal**](BigDecimal.md) | The closest calendar year for the company’s fiscal year |  [optional]
**calendarQuarter** | **String** | The closest calendar quarter for the company’s fiscal year |  [optional]
**actualReportedDate** | [**LocalDate**](LocalDate.md) | The actual report date for the earnings release |  [optional]
**actualReportedTime** | **String** | The actual report time for the earnings release |  [optional]
**actualReportedCode** | **String** | The code cooresponding to the earnings release  BTO &#x3D; BEFORE THE OPEN | DTM &#x3D; DURING THE MARKET | AMC &#x3D; AFTER MARKET CLOSE |  [optional]
**actualReportedDesc** | **String** | The description for the type of earnings release |  [optional]
**lastRevDate** | [**LocalDate**](LocalDate.md) | The last revision date for the analyst estimates |  [optional]
**salesActual** | [**BigDecimal**](BigDecimal.md) | The actual Non-GAAP sales figure released by the company, interpreted by Zacks. |  [optional]
**salesActualZacksAdj** | [**BigDecimal**](BigDecimal.md) | The adjustments Zacks made to get to Non-GAAP sales to reconcile with GAAP sales. |  [optional]
**salesActualGaap** | [**BigDecimal**](BigDecimal.md) | The actual GAAP sales figured released by the company |  [optional]
**salesMeanEstimate** | [**BigDecimal**](BigDecimal.md) | The pre-earnings release mean sales estimate for the company sales_count_estimate; the pre-earnings release number of estimates by analysts |  [optional]
**salesAmountDiff** | [**BigDecimal**](BigDecimal.md) | The sales surprise amount difference |  [optional]
**salesPercentDiff** | [**BigDecimal**](BigDecimal.md) | The sales surprise percent difference |  [optional]
**salesStdDevEstimate** | [**BigDecimal**](BigDecimal.md) | The pre-earnings release standard deviation of sales estimates |  [optional]
**security** | [**SecuritySummary**](SecuritySummary.md) | The Security of the Zacks Sales Surprise |  [optional]



