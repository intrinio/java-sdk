
[//]: # (CLASS:InsiderTransaction)

[//]: # (KIND:object)

### InsiderTransaction

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**director** | Boolean | (true/false) A boolean indicating whether or not the owner is a director in the company &nbsp;
**officer** | Boolean | (true/false) A boolean indicating whether or not the owner is a officer in the company &nbsp;
**tenPercentOwner** | Boolean | (true/false) A boolean indicating whether or not the owner has a ten percent or greater interest in the company &nbsp;
**otherRelation** | Boolean | (true/false) A boolean indicating whether or not the owner has another relationship with the company beside, direct, officer, or significant owner in the company &nbsp;
**officerTitle** | String | The officer title of the owner in the company &nbsp;
**derivativeTransaction** | Boolean | (true) A boolean indicating the transaction is a derivative transaction, which may or may not become common stock due to various possible exercise or conversion requirements &nbsp;
**ticker** | String | The ticker symbol for the company’s common stock &nbsp;
**securityTitle** | String | The name of the derivative security transacted &nbsp;
**conversionExercisePrice** | [**BigDecimal**](BigDecimal.md) | The conversion or exercise price of the derivative security transacted &nbsp;
**transactionDate** | [**LocalDate**](LocalDate.md) | The date of the transaction &nbsp;
**deemedExecutionDate** | [**LocalDate**](LocalDate.md) | The date of the transaction had it not a directly identifiable date &nbsp;
**transactionTypeCode** | String | A symbol representing the transaction type; P &#x3D; Purchase | S &#x3D; Sale | A  &#x3D; Award | M &#x3D; Conversion to Common | C &#x3D; Conversion | X &#x3D; Exercise of Derivative More Transaction Codes &nbsp;
**acquisitionDispositionCode** | String | A symbol representing whether or not the derivative securities are Acquired or Disposed; A &#x3D; Acquisition | D &#x3D; Disposition &nbsp;
**amountOfShares** | [**BigDecimal**](BigDecimal.md) | The number of derivative securities involved in the subject transaction &nbsp;
**exerciseDate** | [**LocalDate**](LocalDate.md) | The exercise date of the derivative securities &nbsp;
**expirationDate** | [**LocalDate**](LocalDate.md) | The expiration date of the derivative securities &nbsp;
**underlyingSecurityTitle** | String | The name of the underlying non-derivative security related to this derivative transaction &nbsp;
**underlyingShares** | [**BigDecimal**](BigDecimal.md) | The number of non-derivative shares involved in the subject transaction &nbsp;
**transactionPrice** | [**BigDecimal**](BigDecimal.md) | The price of the derivative securities &nbsp;
**totalSharesOwned** | [**BigDecimal**](BigDecimal.md) | The total number of derivative securities owned following the subject transaction &nbsp;
**ownershipTypeCode** | String | A symbol representing the ownership of the securities transacted; D &#x3D; Direct Ownership | I &#x3D; Indirect Ownership &nbsp;
**company** | [**CompanySummary**](CompanySummary.md) | The company associated with the filing &nbsp;
**owner** | [**OwnerSummary**](OwnerSummary.md) | The owner associated with the filing &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:LocalDate)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:CompanySummary)


[//]: # (CONTAINED_CLASS:OwnerSummary)





