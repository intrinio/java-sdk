
[//]: # (CLASS:CompanyInitialPublicOffering)

[//]: # (KIND:object)

### CompanyInitialPublicOffering

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**id** | String | The Intrinio ID for the IPO &nbsp;
**ticker** | String | The ticker under which the Company will be traded after the IPO takes place &nbsp;
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the IPO, when the stock first trades on a major exchange &nbsp;
**status** | StatusEnum | The status of the IPO. Upcoming IPOs have not taken place yet but are expected to. Priced IPOs have taken place. Withdrawn IPOs were expected to take place, but were subsequently withdrawn and did not take place &nbsp;
**exchange** | String | The acronym of the stock exchange that the company is going to trade publicly on. Typically NYSE or NASDAQ &nbsp;
**offerAmount** | [**BigDecimal**](BigDecimal.md) | The total dollar amount of shares offered in the IPO. Typically this is share price * share count &nbsp;
**sharePrice** | [**BigDecimal**](BigDecimal.md) | The price per share at which the IPO was offered &nbsp;
**sharePriceLowest** | [**BigDecimal**](BigDecimal.md) | The expected lowest price per share at which the IPO will be offered. Before an IPO is priced, companies typically provide a range of prices per share at which they expect to offer the IPO (typically available for upcoming IPOs) &nbsp;
**sharePriceHighest** | [**BigDecimal**](BigDecimal.md) | The expected highest price per share at which the IPO will be offered. Before an IPO is priced, companies typically provide a range of prices per share at which they expect to offer the IPO (typically available for upcoming IPOs) &nbsp;
**shareCount** | [**BigDecimal**](BigDecimal.md) | The number of shares offered in the IPO &nbsp;
**shareCountLowest** | [**BigDecimal**](BigDecimal.md) | The expected lowest number of shares that will be offered in the IPO. Before an IPO is priced, companies typically provide a range of shares that they expect to offer in the IPO (typically available for upcoming IPOs) &nbsp;
**shareCountHighest** | [**BigDecimal**](BigDecimal.md) | The expected highest number of shares that will be offered in the IPO. Before an IPO is priced, companies typically provide a range of shares that they expect to offer in the IPO (typically available for upcoming IPOs) &nbsp;
**announcementUrl** | String | The URL to the company&#39;s announcement of the IPO &nbsp;
**secReportUrl** | String | The IRL to the company&#39;s S-1, S-1/A, F-1, or F-1/A SEC filing, which is required to be filed before an IPO takes place. &nbsp;
**openPrice** | [**BigDecimal**](BigDecimal.md) | The opening price at the beginning of the first trading day (only available for priced IPOs) &nbsp;
**closePrice** | [**BigDecimal**](BigDecimal.md) | The closing price at the end of the first trading day (only available for priced IPOs) &nbsp;
**volume** | [**BigDecimal**](BigDecimal.md) | The volume at the end of the first trading day (only available for priced IPOs) &nbsp;
**dayChange** | [**BigDecimal**](BigDecimal.md) | The percentage change between the open price and the close price on the first trading day (only available for priced IPOs) &nbsp;
**weekChange** | [**BigDecimal**](BigDecimal.md) | The percentage change between the open price on the first trading day and the close price approximately a week after the first trading day (only available for priced IPOs) &nbsp;
**monthChange** | [**BigDecimal**](BigDecimal.md) | The percentage change between the open price on the first trading day and the close price approximately a month after the first trading day (only available for priced IPOs) &nbsp;
**company** | [**CompanySummary**](CompanySummary.md) | The Company that is going public via the IPO &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) | The primary Security for the Company that is going public via the IPO &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:CompanySummary)


[//]: # (CONTAINED_CLASS:SecuritySummary)



<br/>

#### Enum: StatusEnum

Name | Value
---- | -----
UPCOMING | &quot;upcoming&quot;
PRICED | &quot;priced&quot;
WITHDRAWN | &quot;withdrawn&quot;



