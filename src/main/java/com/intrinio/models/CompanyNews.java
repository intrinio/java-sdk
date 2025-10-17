

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.NewsTopic;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * A news article about a company
 */
@ApiModel(description = "A news article about a company")

public class CompanyNews {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("publication_date")
  private OffsetDateTime publicationDate = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("summary")
  private String summary = null;

  /**
   * The news source.
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    YAHOO("yahoo"),
    
    MOODY("moody"),
    
    MOODY_US_NEWS("moody_us_news"),
    
    MOODY_US_PRESS_RELEASES("moody_us_press_releases");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("source")
  private SourceEnum source = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("companies")
  private List<CompanySummary> companies = null;

  @SerializedName("securities")
  private List<SecuritySummary> securities = null;

  @SerializedName("topics")
  private List<NewsTopic> topics = null;

  @SerializedName("copyright")
  private String copyright = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("word_count")
  private Integer wordCount = null;

  @SerializedName("spam")
  private Boolean spam = null;

  @SerializedName("business_relevance")
  private BigDecimal businessRelevance = null;

  /**
   * The news sentiment.
   */
  @JsonAdapter(ArticleSentimentEnum.Adapter.class)
  public enum ArticleSentimentEnum {
    POSITIVE("positive"),
    
    NEUTRAL("neutral"),
    
    NEGATIVE("negative");

    private String value;

    ArticleSentimentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArticleSentimentEnum fromValue(String text) {
      for (ArticleSentimentEnum b : ArticleSentimentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ArticleSentimentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArticleSentimentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArticleSentimentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ArticleSentimentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("article_sentiment")
  private ArticleSentimentEnum articleSentiment = null;

  @SerializedName("article_sentiment_confidence")
  private BigDecimal articleSentimentConfidence = null;

  @SerializedName("issuer")
  private String issuer = null;

  @SerializedName("issuer_name")
  private String issuerName = null;

  @SerializedName("issuer_company")
  private CompanySummary issuerCompany = null;

  @SerializedName("issuer_security")
  private SecuritySummary issuerSecurity = null;

  public CompanyNews id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the news article
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the news article")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanyNews title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the news article
   * @return title
  **/
  @ApiModelProperty(value = "The title of the news article")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CompanyNews publicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

   /**
   * The publication date of the news article
   * @return publicationDate
  **/
  @ApiModelProperty(value = "The publication date of the news article")
  public OffsetDateTime getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
  }

  public CompanyNews url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of the news article
   * @return url
  **/
  @ApiModelProperty(value = "The url of the news article")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CompanyNews summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * A summary of the news article
   * @return summary
  **/
  @ApiModelProperty(value = "A summary of the news article")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public CompanyNews source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * The news source.
   * @return source
  **/
  @ApiModelProperty(value = "The news source.")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public CompanyNews company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * The Company to which the new article pertains.
   * @return company
  **/
  @ApiModelProperty(value = "The Company to which the new article pertains.")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }

  public CompanyNews companies(List<CompanySummary> companies) {
    this.companies = companies;
    return this;
  }

  public CompanyNews addCompaniesItem(CompanySummary companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * The Companies to which the new article pertains
   * @return companies
  **/
  @ApiModelProperty(value = "The Companies to which the new article pertains")
  public List<CompanySummary> getCompanies() {
    return companies;
  }

  public void setCompanies(List<CompanySummary> companies) {
    this.companies = companies;
  }

  public CompanyNews securities(List<SecuritySummary> securities) {
    this.securities = securities;
    return this;
  }

  public CompanyNews addSecuritiesItem(SecuritySummary securitiesItem) {
    if (this.securities == null) {
      this.securities = new ArrayList<>();
    }
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * The Securities to which the new article pertains
   * @return securities
  **/
  @ApiModelProperty(value = "The Securities to which the new article pertains")
  public List<SecuritySummary> getSecurities() {
    return securities;
  }

  public void setSecurities(List<SecuritySummary> securities) {
    this.securities = securities;
  }

  public CompanyNews topics(List<NewsTopic> topics) {
    this.topics = topics;
    return this;
  }

  public CompanyNews addTopicsItem(NewsTopic topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @ApiModelProperty(value = "")
  public List<NewsTopic> getTopics() {
    return topics;
  }

  public void setTopics(List<NewsTopic> topics) {
    this.topics = topics;
  }

  public CompanyNews copyright(String copyright) {
    this.copyright = copyright;
    return this;
  }

   /**
   * The copyright of the news article
   * @return copyright
  **/
  @ApiModelProperty(value = "The copyright of the news article")
  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public CompanyNews language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language code of the news article
   * @return language
  **/
  @ApiModelProperty(value = "The language code of the news article")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CompanyNews wordCount(Integer wordCount) {
    this.wordCount = wordCount;
    return this;
  }

   /**
   * The word count of the news article
   * @return wordCount
  **/
  @ApiModelProperty(value = "The word count of the news article")
  public Integer getWordCount() {
    return wordCount;
  }

  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }

  public CompanyNews spam(Boolean spam) {
    this.spam = spam;
    return this;
  }

   /**
   * Whether the news article is marked as spam or not
   * @return spam
  **/
  @ApiModelProperty(value = "Whether the news article is marked as spam or not")
  public Boolean isSpam() {
    return spam;
  }

  public void setSpam(Boolean spam) {
    this.spam = spam;
  }

  public CompanyNews businessRelevance(BigDecimal businessRelevance) {
    this.businessRelevance = businessRelevance;
    return this;
  }

   /**
   * How strongly correlated the news article is to the business
   * @return businessRelevance
  **/
  @ApiModelProperty(value = "How strongly correlated the news article is to the business")
  public BigDecimal getBusinessRelevance() {
    return businessRelevance;
  }

  public void setBusinessRelevance(BigDecimal businessRelevance) {
    this.businessRelevance = businessRelevance;
  }

  public CompanyNews articleSentiment(ArticleSentimentEnum articleSentiment) {
    this.articleSentiment = articleSentiment;
    return this;
  }

   /**
   * The news sentiment.
   * @return articleSentiment
  **/
  @ApiModelProperty(value = "The news sentiment.")
  public ArticleSentimentEnum getArticleSentiment() {
    return articleSentiment;
  }

  public void setArticleSentiment(ArticleSentimentEnum articleSentiment) {
    this.articleSentiment = articleSentiment;
  }

  public CompanyNews articleSentimentConfidence(BigDecimal articleSentimentConfidence) {
    this.articleSentimentConfidence = articleSentimentConfidence;
    return this;
  }

   /**
   * The confidence score of the sentiment rating
   * @return articleSentimentConfidence
  **/
  @ApiModelProperty(value = "The confidence score of the sentiment rating")
  public BigDecimal getArticleSentimentConfidence() {
    return articleSentimentConfidence;
  }

  public void setArticleSentimentConfidence(BigDecimal articleSentimentConfidence) {
    this.articleSentimentConfidence = articleSentimentConfidence;
  }

  public CompanyNews issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * The issuer of the story.
   * @return issuer
  **/
  @ApiModelProperty(value = "The issuer of the story.")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public CompanyNews issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * The issuer of the story.
   * @return issuerName
  **/
  @ApiModelProperty(value = "The issuer of the story.")
  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }

  public CompanyNews issuerCompany(CompanySummary issuerCompany) {
    this.issuerCompany = issuerCompany;
    return this;
  }

   /**
   * The company that issued the story.
   * @return issuerCompany
  **/
  @ApiModelProperty(value = "The company that issued the story.")
  public CompanySummary getIssuerCompany() {
    return issuerCompany;
  }

  public void setIssuerCompany(CompanySummary issuerCompany) {
    this.issuerCompany = issuerCompany;
  }

  public CompanyNews issuerSecurity(SecuritySummary issuerSecurity) {
    this.issuerSecurity = issuerSecurity;
    return this;
  }

   /**
   * The security that issued the story.
   * @return issuerSecurity
  **/
  @ApiModelProperty(value = "The security that issued the story.")
  public SecuritySummary getIssuerSecurity() {
    return issuerSecurity;
  }

  public void setIssuerSecurity(SecuritySummary issuerSecurity) {
    this.issuerSecurity = issuerSecurity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyNews companyNews = (CompanyNews) o;
    return Objects.equals(this.id, companyNews.id) &&
        Objects.equals(this.title, companyNews.title) &&
        Objects.equals(this.publicationDate, companyNews.publicationDate) &&
        Objects.equals(this.url, companyNews.url) &&
        Objects.equals(this.summary, companyNews.summary) &&
        Objects.equals(this.source, companyNews.source) &&
        Objects.equals(this.company, companyNews.company) &&
        Objects.equals(this.companies, companyNews.companies) &&
        Objects.equals(this.securities, companyNews.securities) &&
        Objects.equals(this.topics, companyNews.topics) &&
        Objects.equals(this.copyright, companyNews.copyright) &&
        Objects.equals(this.language, companyNews.language) &&
        Objects.equals(this.wordCount, companyNews.wordCount) &&
        Objects.equals(this.spam, companyNews.spam) &&
        Objects.equals(this.businessRelevance, companyNews.businessRelevance) &&
        Objects.equals(this.articleSentiment, companyNews.articleSentiment) &&
        Objects.equals(this.articleSentimentConfidence, companyNews.articleSentimentConfidence) &&
        Objects.equals(this.issuer, companyNews.issuer) &&
        Objects.equals(this.issuerName, companyNews.issuerName) &&
        Objects.equals(this.issuerCompany, companyNews.issuerCompany) &&
        Objects.equals(this.issuerSecurity, companyNews.issuerSecurity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, publicationDate, url, summary, source, company, companies, securities, topics, copyright, language, wordCount, spam, businessRelevance, articleSentiment, articleSentimentConfidence, issuer, issuerName, issuerCompany, issuerSecurity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyNews {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    copyright: ").append(toIndentedString(copyright)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    businessRelevance: ").append(toIndentedString(businessRelevance)).append("\n");
    sb.append("    articleSentiment: ").append(toIndentedString(articleSentiment)).append("\n");
    sb.append("    articleSentimentConfidence: ").append(toIndentedString(articleSentimentConfidence)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    issuerCompany: ").append(toIndentedString(issuerCompany)).append("\n");
    sb.append("    issuerSecurity: ").append(toIndentedString(issuerSecurity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

