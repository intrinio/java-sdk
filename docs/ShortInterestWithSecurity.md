
[//]: # (CLASS:ShortInterestWithSecurity)

[//]: # (KIND:object)

### ShortInterestWithSecurity

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**settlementDate** | [**LocalDate**](LocalDate.md) | The settlement date of the short interest record &nbsp;
**currentShortPosition** | Integer | The current short position (shares) as of the settlement date &nbsp;
**previousShortPosition** | Integer | The previous short position (shares) from the prior reporting period &nbsp;
**changePercent** | Float | The percentage change in short position from the previous reporting period &nbsp;
**daysToCover** | Float | The estimated number of days to cover the short position based on average daily volume &nbsp;
**averageDailyVolume** | Integer | The average daily trading volume used to calculate days to cover &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) | The security associated with this short interest record &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:SecuritySummary)





