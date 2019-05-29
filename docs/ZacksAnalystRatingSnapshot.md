
[//]: # (CLASS:ZacksAnalystRatingSnapshot)

[//]: # (KIND:object)

### ZacksAnalystRatingSnapshot

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**type** | String | The snapshot type, signifying the age of the ratings data from the snapshot date. &nbsp;
**snapshotDate** | [**LocalDate**](LocalDate.md) | The date of the snapshot, when data was recorded. &nbsp;
**ratingDate** | [**LocalDate**](LocalDate.md) | The date of the latest rating for the snapshot timeframe. This is the effective date of the ratings data. &nbsp;
**mean** | [**BigDecimal**](BigDecimal.md) | The mean (average) weighing of analyst recommendations, from 1 (strong buy) to 5 (strong sell). &nbsp;
**percentile** | [**BigDecimal**](BigDecimal.md) | The percentile of the mean, derived by comparing to all securities rated by analysts as of the rating date, ranging 0.0 (strong buy) to 1.0 (strong sell). &nbsp;
**strongBuys** | Integer | The number of analysts recommending Strong Buy. &nbsp;
**buys** | Integer | The number of analysts recommending Buy. &nbsp;
**holds** | Integer | The number of analysts recommending Hold. &nbsp;
**sells** | Integer | The number of analysts recommending Sell. &nbsp;
**strongSells** | Integer | The number of analysts recommending Strong Sell. &nbsp;
**total** | Integer | The total number of analysts recommendations. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)





