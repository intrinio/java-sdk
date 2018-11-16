
# StandardizedTag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Intrinio ID for the Standardized Tag |  [optional]
**name** | **String** | The readable name of tag |  [optional]
**tag** | **String** | The Intrinio standardized tag |  [optional]
**statementCode** | **String** | The code of the financial statement to which this tag belongs |  [optional]
**statementType** | [**StatementTypeEnum**](#StatementTypeEnum) | The format of the financial statment to which this tag belongs |  [optional]
**parent** | **String** | The parent Standardized Tag forming the statement relationship with the factor |  [optional]
**factor** | **String** | The operator forming the statement relationship between the child tag (or tags) and the parent |  [optional]
**balance** | [**BigDecimal**](BigDecimal.md) | Whether the tag represents a credit or debit |  [optional]
**type** | **String** | The nature of the tag, operating or nonoperating |  [optional]
**unit** | **String** | The unit of the tag |  [optional]


<a name="StatementTypeEnum"></a>
## Enum: StatementTypeEnum
Name | Value
---- | -----
FINANCIAL | &quot;financial&quot;
INDUSTRIAL | &quot;industrial&quot;



