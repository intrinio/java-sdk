
## DividendRecord

### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exDividend** | [**BigDecimal**](BigDecimal.md) | Amount of dividend in US dollars |  [optional]
**currency** | **String** | The 3-digit currency code the dividend amount was reported in |  [optional]
**announcementDate** | [**LocalDate**](LocalDate.md) | Date dividend was announced |  [optional]
**recordDate** | [**LocalDate**](LocalDate.md) | Date before which holders-of-record will receive the dividend |  [optional]
**payDate** | [**LocalDate**](LocalDate.md) | Date the divdiend was paid |  [optional]
**frequency** | **String** | Identifies payment frequency of announced dividend |  [optional]
**status** | **StatusEnum** | Status of the dividend |  [optional]
**forwardYield** | [**BigDecimal**](BigDecimal.md) | The forward dividend yield |  [optional]
**forwardRate** | [**BigDecimal**](BigDecimal.md) | The forward dividend rate |  [optional]
**security** | [**SecuritySummary**](SecuritySummary.md) |  |  [optional]


<br/>
<br/>

**Enum: StatusEnum**

Name | Value
---- | -----
P | &quot;P&quot;
X | &quot;X&quot;
S | &quot;S&quot;
R | &quot;R&quot;



