
[//]: # (CLASS:ETFHolding)

[//]: # (KIND:object)

### ETFHolding

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**asOfDate** | [**LocalDate**](LocalDate.md) | The date on which the holding and their weights correspond &nbsp;
**name** | String | The common name for the holding &nbsp;
**ticker** | String | The common exchange ticker for the holding &nbsp;
**type** | String | The type of instrument for this holding.  Examples (Bond &#x3D; &#39;BOND&#39;, Equity &#x3D; &#39;EQUI&#39;, Options &#x3D; &#39;OPTN&#39;) &nbsp;
**compositeFigi** | String | DEPRECATED &nbsp;
**shareClassFigi** | String | The OpenFIGI symbol for the holding &nbsp;
**isin** | String | International Securities Identification Number (ISIN) for the holding &nbsp;
**ric** | String | Reuters Instrument Code (RIC) for the holding &nbsp;
**sedol** | String | Stock Exchange Daily Official List (SEDOL) for the holding &nbsp;
**face** | [**BigDecimal**](BigDecimal.md) | Face value of the debt security, if available &nbsp;
**coupon** | [**BigDecimal**](BigDecimal.md) | Coupon rate of the debt security, if available &nbsp;
**marketValueHeld** | [**BigDecimal**](BigDecimal.md) | The market value of this holding in the ETF as of the &#x60;as_of_date&#x60; &nbsp;
**notionalValue** | [**BigDecimal**](BigDecimal.md) | Notional value of derivatives contracts held in the Exchange Traded Fund (ETF) or Exchange Traded Note (ETN) &nbsp;
**maturity** | [**LocalDate**](LocalDate.md) | Maturity date for the debt security, if available &nbsp;
**quantityHeld** | [**BigDecimal**](BigDecimal.md) | Number of units of the security held if available &nbsp;
**weighting** | [**BigDecimal**](BigDecimal.md) | Fraction of the funds market value held &nbsp;
**quantityUnits** | [**BigDecimal**](BigDecimal.md) | The unit of the &#x60;quanity_held&#x60; field. Examples (&#39;oz&#39;, &#39;shares&#39;, &#39;contracts&#39;) &nbsp;
**quantityPerShare** | [**BigDecimal**](BigDecimal.md) | Number of units of the security held per units of shares outstanding of the Exchange Traded Fund (ETF), if available &nbsp;
**contractExpiryDate** | [**LocalDate**](LocalDate.md) | Expiry date for the futures contract held in the Exchange Traded Fund (ETF) or Exchange Traded Note (ETN) &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)





