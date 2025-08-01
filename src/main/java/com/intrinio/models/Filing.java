

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * A filing submitted to the SEC by a company
 */
@ApiModel(description = "A filing submitted to the SEC by a company")

public class Filing {
  @SerializedName("id")
  private String id = null;

  @SerializedName("filing_date")
  private LocalDate filingDate = null;

  @SerializedName("accepted_date")
  private OffsetDateTime acceptedDate = null;

  @SerializedName("period_end_date")
  private LocalDate periodEndDate = null;

  @SerializedName("report_type")
  private String reportType = null;

  @SerializedName("sec_unique_id")
  private String secUniqueId = null;

  @SerializedName("filing_url")
  private String filingUrl = null;

  @SerializedName("report_url")
  private String reportUrl = null;

  @SerializedName("instance_url")
  private String instanceUrl = null;

  @SerializedName("industry_category")
  private String industryCategory = null;

  @SerializedName("industry_group")
  private String industryGroup = null;

  @SerializedName("word_count")
  private Integer wordCount = null;

  @SerializedName("earnings_disclosed_at")
  private OffsetDateTime earningsDisclosedAt = null;

  @SerializedName("earnings_disclosed_8k_id")
  private String earningsDisclosed8kId = null;

  @SerializedName("earnings_8k_url")
  private String earnings8kUrl = null;

  @SerializedName("company")
  private CompanySummary company = null;

  public Filing id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID of the Filing
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID of the Filing")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Filing filingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
    return this;
  }

   /**
   * The date when the filing was submitted to the SEC by the company
   * @return filingDate
  **/
  @ApiModelProperty(value = "The date when the filing was submitted to the SEC by the company")
  public LocalDate getFilingDate() {
    return filingDate;
  }

  public void setFilingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
  }

  public Filing acceptedDate(OffsetDateTime acceptedDate) {
    this.acceptedDate = acceptedDate;
    return this;
  }

   /**
   * The date and time when the filing was accepted by SEC
   * @return acceptedDate
  **/
  @ApiModelProperty(value = "The date and time when the filing was accepted by SEC")
  public OffsetDateTime getAcceptedDate() {
    return acceptedDate;
  }

  public void setAcceptedDate(OffsetDateTime acceptedDate) {
    this.acceptedDate = acceptedDate;
  }

  public Filing periodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

   /**
   * The ending date of the fiscal period for the filing
   * @return periodEndDate
  **/
  @ApiModelProperty(value = "The ending date of the fiscal period for the filing")
  public LocalDate getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  public Filing reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * The filing &lt;a href&#x3D;\&quot;https://docs.intrinio.com/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt;
   * @return reportType
  **/
  @ApiModelProperty(value = "The filing <a href=\"https://docs.intrinio.com/documentation/sec_filing_report_types\" target=\"_blank\">report type</a>")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public Filing secUniqueId(String secUniqueId) {
    this.secUniqueId = secUniqueId;
    return this;
  }

   /**
   * A unique identifier for the filing provided by the SEC
   * @return secUniqueId
  **/
  @ApiModelProperty(value = "A unique identifier for the filing provided by the SEC")
  public String getSecUniqueId() {
    return secUniqueId;
  }

  public void setSecUniqueId(String secUniqueId) {
    this.secUniqueId = secUniqueId;
  }

  public Filing filingUrl(String filingUrl) {
    this.filingUrl = filingUrl;
    return this;
  }

   /**
   * The URL to the filing page on the SEC site
   * @return filingUrl
  **/
  @ApiModelProperty(value = "The URL to the filing page on the SEC site")
  public String getFilingUrl() {
    return filingUrl;
  }

  public void setFilingUrl(String filingUrl) {
    this.filingUrl = filingUrl;
  }

  public Filing reportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
    return this;
  }

   /**
   * The URL to the actual report on the SEC site
   * @return reportUrl
  **/
  @ApiModelProperty(value = "The URL to the actual report on the SEC site")
  public String getReportUrl() {
    return reportUrl;
  }

  public void setReportUrl(String reportUrl) {
    this.reportUrl = reportUrl;
  }

  public Filing instanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
    return this;
  }

   /**
   * The URL for the XBRL filing for the report
   * @return instanceUrl
  **/
  @ApiModelProperty(value = "The URL for the XBRL filing for the report")
  public String getInstanceUrl() {
    return instanceUrl;
  }

  public void setInstanceUrl(String instanceUrl) {
    this.instanceUrl = instanceUrl;
  }

  public Filing industryCategory(String industryCategory) {
    this.industryCategory = industryCategory;
    return this;
  }

   /**
   * The company&#39;s operating industry category
   * @return industryCategory
  **/
  @ApiModelProperty(value = "The company's operating industry category")
  public String getIndustryCategory() {
    return industryCategory;
  }

  public void setIndustryCategory(String industryCategory) {
    this.industryCategory = industryCategory;
  }

  public Filing industryGroup(String industryGroup) {
    this.industryGroup = industryGroup;
    return this;
  }

   /**
   * The company&#39;s operating industry group
   * @return industryGroup
  **/
  @ApiModelProperty(value = "The company's operating industry group")
  public String getIndustryGroup() {
    return industryGroup;
  }

  public void setIndustryGroup(String industryGroup) {
    this.industryGroup = industryGroup;
  }

  public Filing wordCount(Integer wordCount) {
    this.wordCount = wordCount;
    return this;
  }

   /**
   * The number of words in the filing
   * @return wordCount
  **/
  @ApiModelProperty(value = "The number of words in the filing")
  public Integer getWordCount() {
    return wordCount;
  }

  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }

  public Filing earningsDisclosedAt(OffsetDateTime earningsDisclosedAt) {
    this.earningsDisclosedAt = earningsDisclosedAt;
    return this;
  }

   /**
   * The date and time when the earnings information was first disclosed via 8-K filing
   * @return earningsDisclosedAt
  **/
  @ApiModelProperty(value = "The date and time when the earnings information was first disclosed via 8-K filing")
  public OffsetDateTime getEarningsDisclosedAt() {
    return earningsDisclosedAt;
  }

  public void setEarningsDisclosedAt(OffsetDateTime earningsDisclosedAt) {
    this.earningsDisclosedAt = earningsDisclosedAt;
  }

  public Filing earningsDisclosed8kId(String earningsDisclosed8kId) {
    this.earningsDisclosed8kId = earningsDisclosed8kId;
    return this;
  }

   /**
   * The Intrinio ID of the 8-K filing where earnings were first disclosed
   * @return earningsDisclosed8kId
  **/
  @ApiModelProperty(value = "The Intrinio ID of the 8-K filing where earnings were first disclosed")
  public String getEarningsDisclosed8kId() {
    return earningsDisclosed8kId;
  }

  public void setEarningsDisclosed8kId(String earningsDisclosed8kId) {
    this.earningsDisclosed8kId = earningsDisclosed8kId;
  }

  public Filing earnings8kUrl(String earnings8kUrl) {
    this.earnings8kUrl = earnings8kUrl;
    return this;
  }

   /**
   * The URL to the 8-K filing page on the SEC site where earnings were first disclosed
   * @return earnings8kUrl
  **/
  @ApiModelProperty(value = "The URL to the 8-K filing page on the SEC site where earnings were first disclosed")
  public String getEarnings8kUrl() {
    return earnings8kUrl;
  }

  public void setEarnings8kUrl(String earnings8kUrl) {
    this.earnings8kUrl = earnings8kUrl;
  }

  public Filing company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filing filing = (Filing) o;
    return Objects.equals(this.id, filing.id) &&
        Objects.equals(this.filingDate, filing.filingDate) &&
        Objects.equals(this.acceptedDate, filing.acceptedDate) &&
        Objects.equals(this.periodEndDate, filing.periodEndDate) &&
        Objects.equals(this.reportType, filing.reportType) &&
        Objects.equals(this.secUniqueId, filing.secUniqueId) &&
        Objects.equals(this.filingUrl, filing.filingUrl) &&
        Objects.equals(this.reportUrl, filing.reportUrl) &&
        Objects.equals(this.instanceUrl, filing.instanceUrl) &&
        Objects.equals(this.industryCategory, filing.industryCategory) &&
        Objects.equals(this.industryGroup, filing.industryGroup) &&
        Objects.equals(this.wordCount, filing.wordCount) &&
        Objects.equals(this.earningsDisclosedAt, filing.earningsDisclosedAt) &&
        Objects.equals(this.earningsDisclosed8kId, filing.earningsDisclosed8kId) &&
        Objects.equals(this.earnings8kUrl, filing.earnings8kUrl) &&
        Objects.equals(this.company, filing.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filingDate, acceptedDate, periodEndDate, reportType, secUniqueId, filingUrl, reportUrl, instanceUrl, industryCategory, industryGroup, wordCount, earningsDisclosedAt, earningsDisclosed8kId, earnings8kUrl, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
    sb.append("    acceptedDate: ").append(toIndentedString(acceptedDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    secUniqueId: ").append(toIndentedString(secUniqueId)).append("\n");
    sb.append("    filingUrl: ").append(toIndentedString(filingUrl)).append("\n");
    sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
    sb.append("    industryCategory: ").append(toIndentedString(industryCategory)).append("\n");
    sb.append("    industryGroup: ").append(toIndentedString(industryGroup)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    earningsDisclosedAt: ").append(toIndentedString(earningsDisclosedAt)).append("\n");
    sb.append("    earningsDisclosed8kId: ").append(toIndentedString(earningsDisclosed8kId)).append("\n");
    sb.append("    earnings8kUrl: ").append(toIndentedString(earnings8kUrl)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

