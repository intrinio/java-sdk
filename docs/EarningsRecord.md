
# EarningsRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quarter** | **String** | The letter “Q” followed by the quarter number the earnings information applies to |  [optional]
**timeOfDay** | [**TimeOfDayEnum**](#TimeOfDayEnum) | Indicates the time of the announcement |  [optional]
**broadcastUrl** | **String** | Link for Conference Call recording |  [optional]
**transcriptUrl** | **String** | Link to the earnings release transcript |  [optional]
**transcriptQuarter** | **String** | The letter “Q” followed by the quarter number the earnings transcript applies to |  [optional]
**transcriptFiscalYear** | **String** | Fiscal year in YYYY format for the earnings transcript |  [optional]
**conferenceCallDate** | [**LocalDate**](LocalDate.md) | Date of the conference call |  [optional]
**conferenceCallTime** | **String** | Published time of the conference call |  [optional]
**conferenceCallPhoneNumber** | **String** | Publicly available phone number for replay conference call |  [optional]
**conferenceCallPasscode** | **String** | Passcode for replay conference call |  [optional]
**lastConfirmationDate** | [**LocalDate**](LocalDate.md) | Date of last earnings date update by a WSH analyst |  [optional]
**boardOfDirectorsMeetingDate** | [**LocalDate**](LocalDate.md) | Date of Board/Shareholder Meeting |  [optional]
**boardOfDirectorsMeetingType** | [**BoardOfDirectorsMeetingTypeEnum**](#BoardOfDirectorsMeetingTypeEnum) | The type of meeting - \&quot;B\&quot; indicates a Board of Directors meeting and \&quot;S\&quot; indicates a Shareholder meeting |  [optional]
**companyWebsite** | **String** | Website link for the company |  [optional]
**q1Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 1st quarter |  [optional]
**q2Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 2nd quarter |  [optional]
**q3Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 3rd quarter |  [optional]
**q4Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 4th quarter |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The nature of the next reported earnings date - \&quot;V\&quot; indicates a Verified date, \&quot;T\&quot; indicates that the date was gathered from the company, but is still considered Tentative, and \&quot;I\&quot; indicates that the date is forecased or Inferred |  [optional]
**nextEarningsDate** | [**LocalDate**](LocalDate.md) | Next earnings date |  [optional]
**nextEarningsQuarter** | **String** | The quarter of the next earnings release |  [optional]
**nextEarningsFiscalYear** | **Integer** | The fiscal year associated with next earnings date and next earnings quarter |  [optional]
**security** | [**SecuritySummary**](SecuritySummary.md) |  |  [optional]


<a name="TimeOfDayEnum"></a>
## Enum: TimeOfDayEnum
Name | Value
---- | -----
BEFORE_MARKET | &quot;Before Market&quot;
DURING_MARKET | &quot;During Market&quot;
AFTER_MARKET | &quot;After Market&quot;
UNSPECIFIED | &quot;Unspecified&quot;


<a name="BoardOfDirectorsMeetingTypeEnum"></a>
## Enum: BoardOfDirectorsMeetingTypeEnum
Name | Value
---- | -----
B | &quot;B&quot;
S | &quot;S&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
V | &quot;V&quot;
T | &quot;T&quot;
I | &quot;I&quot;



