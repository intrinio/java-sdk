
### ZacksEPSSurpriseSummary

#### Properties
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
**epsActual** | [**BigDecimal**](BigDecimal.md) | The actual Non-GAAP EPS figure released by the company, interpreted by Zacks. |  [optional]
**epsActualZacksAdj** | [**BigDecimal**](BigDecimal.md) | The adjustments Zacks made to get to Non-GAAP EPS to reconcile with GAAP EPS. |  [optional]
**epsMeanEstimate** | [**BigDecimal**](BigDecimal.md) | The pre-earnings release mean EPS estimate for the company |  [optional]
**epsAmountDiff** | [**BigDecimal**](BigDecimal.md) | The EPS surprise amount difference |  [optional]
**epsPercentDiff** | [**BigDecimal**](BigDecimal.md) | The EPS surprise percent difference |  [optional]
**epsCountEstimate** | [**BigDecimal**](BigDecimal.md) | The pre-earnings release number of estimates by analysts |  [optional]
**epsStdDevEstimate** | [**BigDecimal**](BigDecimal.md) | The pre-earnings release standard deviation of EPS estimates |  [optional]



