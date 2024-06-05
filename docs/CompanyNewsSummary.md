
[//]: # (CLASS:CompanyNewsSummary)

[//]: # (KIND:object)

### CompanyNewsSummary

#### Properties

[//]: # (START_DEFINITION)

Name | Type | Description
------------ | ------------- | -------------
**id** | String | The Intrinio ID for the news article &nbsp;
**title** | String | The title of the news article &nbsp;
**publicationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The publication date of the news article &nbsp;
**url** | String | The url of the news article &nbsp;
**summary** | String | A summary of the news article &nbsp;
**source** | SourceEnum | The news source. &nbsp;
**topics** | [**List&lt;NewsTopic&gt;**](NewsTopic.md) |  &nbsp;
**copyright** | String | The copyright of the news article &nbsp;
**language** | String | The language code of the news article &nbsp;
**wordCount** | Integer | The word count of the news article &nbsp;
**spam** | Boolean | Whether the news article is marked as spam or not &nbsp;
**businessRelevance** | [**BigDecimal**](BigDecimal.md) | How strongly correlated the news article is to the business &nbsp;
**articleSentiment** | ArticleSentimentEnum | The news sentiment. &nbsp;
**articleSentimentConfidence** | [**BigDecimal**](BigDecimal.md) | The confidence score of the sentiment rating &nbsp;
**body** | String | The article body. Requires additional access. &nbsp;

[//]: # (END_DEFINITION)


[//]: # (CONTAINED_CLASS:OffsetDateTime)


[//]: # (CONTAINED_CLASS:NewsTopic)


[//]: # (CONTAINED_CLASS:BigDecimal)


[//]: # (CONTAINED_CLASS:BigDecimal)



<br/>

#### Enum: SourceEnum

Name | Value
---- | -----
YAHOO | &quot;yahoo&quot;
MOODY | &quot;moody&quot;
MOODY_US_NEWS | &quot;moody_us_news&quot;
MOODY_US_PRESS_RELEASES | &quot;moody_us_press_releases&quot;

<br/>

#### Enum: ArticleSentimentEnum

Name | Value
---- | -----
POSITIVE | &quot;positive&quot;
NEUTRAL | &quot;neutral&quot;
NEGATIVE | &quot;negative&quot;



