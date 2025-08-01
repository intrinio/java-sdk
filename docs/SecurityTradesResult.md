
[//]: # (CLASS:SecurityTradesResult)

[//]: # (KIND:object)

### SecurityTradesResult

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**nextPage** | String | The token required to request the next page of the data. If null, no further results are available. &nbsp;
**source** | SourceEnum | The source of the trades. &nbsp;
**trades** | [**List&lt;SecurityTrades&gt;**](SecurityTrades.md) | Array of all the trades in this page of the result. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:SecurityTrades)



<br/>

#### Enum: SourceEnum

Name | Value
---- | -----
IEX | &quot;iex&quot;
DELAYED_SIP | &quot;delayed_sip&quot;
UTP_DELAYED | &quot;utp_delayed&quot;
CTA_A_DELAYED | &quot;cta_a_delayed&quot;
CTA_B_DELAYED | &quot;cta_b_delayed&quot;
OTC_DELAYED | &quot;otc_delayed&quot;
NASDAQ_BASIC | &quot;nasdaq_basic&quot;
CBOE_ONE_DELAYED | &quot;cboe_one_delayed&quot;
IEX_DELAYED | &quot;iex_delayed&quot;



