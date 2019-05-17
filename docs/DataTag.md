
## DataTag

### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Intrinio ID for the Data Tag |  [optional]
**name** | **String** | The readable name of the Data Tag |  [optional]
**tag** | **String** | The code-name of the Data Tag |  [optional]
**statementCode** | **String** | The code of the financial statement to which this Data Tag belongs |  [optional]
**statementType** | [**StatementTypeEnum**](#StatementTypeEnum) | The format of the financial statment to which this Data Tag belongs |  [optional]
**parent** | **String** | The parent Data Tag forming the statement relationship with the factor |  [optional]
**factor** | **String** | The operator forming the statement relationship between the child Data Tag (or Data Tags) and the parent Data Tag |  [optional]
**balance** | **String** | Whether the Data Tag represents a credit or debit |  [optional]
**type** | **String** | The nature of the Data Tag, operating or nonoperating |  [optional]
**unit** | **String** | The unit of the Data Tag |  [optional]


**Enum: StatementTypeEnum**

Name | Value
---- | -----
FINANCIAL | &quot;financial&quot;
INDUSTRIAL | &quot;industrial&quot;



