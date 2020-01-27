
[//]: # (CLASS:EarningsRecord)

[//]: # (KIND:object)

### EarningsRecord

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**quarter** | String | The letter “Q” followed by the quarter number the earnings information applies to &nbsp;
**timeOfDay** | TimeOfDayEnum | Indicates the time of the announcement &nbsp;
**broadcastUrl** | String | Link for Conference Call recording &nbsp;
**transcriptUrl** | String | Link to the earnings release transcript &nbsp;
**transcriptQuarter** | String | The letter “Q” followed by the quarter number the earnings transcript applies to &nbsp;
**transcriptFiscalYear** | String | Fiscal year in YYYY format for the earnings transcript &nbsp;
**conferenceCallDate** | [**LocalDate**](LocalDate.md) | Date of the conference call &nbsp;
**conferenceCallTime** | String | Published time of the conference call &nbsp;
**conferenceCallPhoneNumber** | String | Publicly available phone number for replay conference call &nbsp;
**conferenceCallPasscode** | String | Passcode for replay conference call &nbsp;
**lastConfirmationDate** | [**LocalDate**](LocalDate.md) | Date of last earnings date update by a WSH analyst &nbsp;
**boardOfDirectorsMeetingDate** | [**LocalDate**](LocalDate.md) | Date of Board/Shareholder Meeting &nbsp;
**boardOfDirectorsMeetingType** | BoardOfDirectorsMeetingTypeEnum | The type of meeting - \&quot;B\&quot; indicates a Board of Directors meeting and \&quot;S\&quot; indicates a Shareholder meeting &nbsp;
**companyWebsite** | String | Website link for the company &nbsp;
**q1Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 1st quarter &nbsp;
**q2Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 2nd quarter &nbsp;
**q3Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 3rd quarter &nbsp;
**q4Date** | [**LocalDate**](LocalDate.md) | Earnings Date for 4th quarter &nbsp;
**type** | TypeEnum | The nature of the next reported earnings date - \&quot;V\&quot; indicates a Verified date, \&quot;T\&quot; indicates that the date was gathered from the company, but is still considered Tentative, and \&quot;I\&quot; indicates that the date is forecased or Inferred &nbsp;
**nextEarningsDate** | [**LocalDate**](LocalDate.md) | Next earnings date &nbsp;
**nextEarningsQuarter** | String | The quarter of the next earnings release &nbsp;
**nextEarningsFiscalYear** | Integer | The fiscal year associated with next earnings date and next earnings quarter &nbsp;
**preliminaryEarningsDate** | [**LocalDate**](LocalDate.md) | The release date of a preliminary earnings report &nbsp;
**security** | [**SecuritySummary**](SecuritySummary.md) |  &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:SecuritySummary)



<br/>

#### Enum: TimeOfDayEnum

Name | Value
---- | -----
BEFORE_MARKET | &quot;Before Market&quot;
DURING_MARKET | &quot;During Market&quot;
AFTER_MARKET | &quot;After Market&quot;
UNSPECIFIED | &quot;Unspecified&quot;

<br/>

#### Enum: BoardOfDirectorsMeetingTypeEnum

Name | Value
---- | -----
B | &quot;B&quot;
S | &quot;S&quot;

<br/>

#### Enum: TypeEnum

Name | Value
---- | -----
V | &quot;V&quot;
T | &quot;T&quot;
I | &quot;I&quot;



