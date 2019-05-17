
### ZacksAnalystRatingSnapshot

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The snapshot type, signifying the age of the ratings data from the snapshot date. |  [optional]
**snapshotDate** | [**LocalDate**](LocalDate.md) | The date of the snapshot, when data was recorded. |  [optional]
**ratingDate** | [**LocalDate**](LocalDate.md) | The date of the latest rating for the snapshot timeframe. This is the effective date of the ratings data. |  [optional]
**mean** | [**BigDecimal**](BigDecimal.md) | The mean (average) weighing of analyst recommendations, from 1 (strong buy) to 5 (strong sell). |  [optional]
**percentile** | [**BigDecimal**](BigDecimal.md) | The percentile of the mean, derived by comparing to all securities rated by analysts as of the rating date, ranging 0.0 (strong buy) to 1.0 (strong sell). |  [optional]
**strongBuys** | **Integer** | The number of analysts recommending Strong Buy. |  [optional]
**buys** | **Integer** | The number of analysts recommending Buy. |  [optional]
**holds** | **Integer** | The number of analysts recommending Hold. |  [optional]
**sells** | **Integer** | The number of analysts recommending Sell. |  [optional]
**strongSells** | **Integer** | The number of analysts recommending Strong Sell. |  [optional]
**total** | **Integer** | The total number of analysts recommendations. |  [optional]



