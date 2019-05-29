

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * A filing submitted to the SEC by a company
 */
@ApiModel(description = "A filing submitted to the SEC by a company")

public class FilingNoteFiling {
  @SerializedName("cik")
  private String cik = null;

  @SerializedName("report_type")
  private String reportType = null;

  @SerializedName("period_end_date")
  private LocalDate periodEndDate = null;

  @SerializedName("filing_date")
  private LocalDate filingDate = null;

  public FilingNoteFiling cik(String cik) {
    this.cik = cik;
    return this;
  }

   /**
   * The Central Index Key (CIK) assigned to the company
   * @return cik
  **/
  @ApiModelProperty(value = "The Central Index Key (CIK) assigned to the company")
  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }

  public FilingNoteFiling reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * The filing &lt;a href&#x3D;\&quot;/documentation/sec_filing_report_types\&quot; target&#x3D;\&quot;_blank\&quot;&gt;report type&lt;/a&gt;
   * @return reportType
  **/
  @ApiModelProperty(value = "The filing <a href=\"/documentation/sec_filing_report_types\" target=\"_blank\">report type</a>")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public FilingNoteFiling periodEndDate(LocalDate periodEndDate) {
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

  public FilingNoteFiling filingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
    return this;
  }

   /**
   * The date the report was filed with the SEC
   * @return filingDate
  **/
  @ApiModelProperty(value = "The date the report was filed with the SEC")
  public LocalDate getFilingDate() {
    return filingDate;
  }

  public void setFilingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilingNoteFiling filingNoteFiling = (FilingNoteFiling) o;
    return Objects.equals(this.cik, filingNoteFiling.cik) &&
        Objects.equals(this.reportType, filingNoteFiling.reportType) &&
        Objects.equals(this.periodEndDate, filingNoteFiling.periodEndDate) &&
        Objects.equals(this.filingDate, filingNoteFiling.filingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cik, reportType, periodEndDate, filingDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilingNoteFiling {\n");
    
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
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

