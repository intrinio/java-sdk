
[//]: # (CLASS:EarningsDateEstimate)

[//]: # (KIND:object)

### EarningsDateEstimate

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**fiscalYear** | Integer | The fiscal year for the earnings report &nbsp;
**fiscalPeriod** | String | The fiscal period for the earnings report (Q1, Q2, Q3, Q4, or FY) &nbsp;
**expectedDate** | [**LocalDate**](LocalDate.md) | The expected date of the earnings announcement &nbsp;
**expected8kAt** | [**OffsetDateTime**](OffsetDateTime.md) | The expected timestamp when the 8-K filing will be available &nbsp;
**historicallyEarliest** | String | The earliest date (MM-DD format) this company has historically announced earnings for this fiscal period &nbsp;
**historicallyLatest** | String | The latest date (MM-DD format) this company has historically announced earnings for this fiscal period &nbsp;
**confidenceIntervals** | [**Map&lt;String, EarningsDateEstimateConfidenceIntervals&gt;**](EarningsDateEstimateConfidenceIntervals.md) | Confidence intervals for the expected date, sorted by confidence level (descending) &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:EarningsDateEstimateConfidenceIntervals)





