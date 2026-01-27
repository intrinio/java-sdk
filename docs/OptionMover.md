
[//]: # (CLASS:OptionMover)

[//]: # (KIND:object)

### OptionMover

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**code** | String | The unique options contract, in a format combining ticker symbol, expiration, strike, and put or call. Example - AAPL__260101P00123500.  The ticker symbol is right padded by underscores to 6 characters. Following that is the 2 digit year, 2 digit month, and 2 digit day, then a P for put or C for call.  The last section is the strike. The first 5 digits are the whole number portion, left padded by zeros. The last 3 digits are the decimal portion, right padded by zeros. &nbsp;
**ticker** | String | The ticker symbol of the underlying security for the options contract. &nbsp;
**lastPrice** | [**BigDecimal**](BigDecimal.md) | The most recent trade price of the options contract. &nbsp;
**lastClosePrice** | [**BigDecimal**](BigDecimal.md) | The closing price of the options contract from the previous trading session. &nbsp;
**change** | [**BigDecimal**](BigDecimal.md) | The absolute dollar change in the contract&#39;s price from the previous close to the last price. &nbsp;
**percentChange** | [**BigDecimal**](BigDecimal.md) | The percentage change in the contract&#39;s price from the previous close to the last price, expressed as a decimal (e.g., 0.12 for 12%). &nbsp;
**volume** | Integer | The total trading volume for this options contract during the current session. &nbsp;
**openInterest** | Integer | The total number of outstanding contracts for this option that have not yet been closed or exercised. &nbsp;
**lastCloseDate** | [**LocalDate**](LocalDate.md) | The date of the previous trading session&#39;s close for this contract. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)





