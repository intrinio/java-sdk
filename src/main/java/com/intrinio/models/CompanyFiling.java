

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

public class CompanyFiling {
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

  @SerializedName("company")
  private CompanySummary company = null;

  public CompanyFiling id(String id) {
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

  public CompanyFiling filingDate(LocalDate filingDate) {
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

  public CompanyFiling acceptedDate(OffsetDateTime acceptedDate) {
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

  public CompanyFiling periodEndDate(LocalDate periodEndDate) {
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

  public CompanyFiling reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * The filing report type
   * @return reportType
  **/
  @ApiModelProperty(value = "The filing report type")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public CompanyFiling secUniqueId(String secUniqueId) {
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

  public CompanyFiling filingUrl(String filingUrl) {
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

  public CompanyFiling reportUrl(String reportUrl) {
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

  public CompanyFiling instanceUrl(String instanceUrl) {
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

  public CompanyFiling company(CompanySummary company) {
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
    CompanyFiling companyFiling = (CompanyFiling) o;
    return Objects.equals(this.id, companyFiling.id) &&
        Objects.equals(this.filingDate, companyFiling.filingDate) &&
        Objects.equals(this.acceptedDate, companyFiling.acceptedDate) &&
        Objects.equals(this.periodEndDate, companyFiling.periodEndDate) &&
        Objects.equals(this.reportType, companyFiling.reportType) &&
        Objects.equals(this.secUniqueId, companyFiling.secUniqueId) &&
        Objects.equals(this.filingUrl, companyFiling.filingUrl) &&
        Objects.equals(this.reportUrl, companyFiling.reportUrl) &&
        Objects.equals(this.instanceUrl, companyFiling.instanceUrl) &&
        Objects.equals(this.company, companyFiling.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filingDate, acceptedDate, periodEndDate, reportType, secUniqueId, filingUrl, reportUrl, instanceUrl, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyFiling {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
    sb.append("    acceptedDate: ").append(toIndentedString(acceptedDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    secUniqueId: ").append(toIndentedString(secUniqueId)).append("\n");
    sb.append("    filingUrl: ").append(toIndentedString(filingUrl)).append("\n");
    sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
    sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
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

