

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Fundamental;
import com.intrinio.models.ReportedFinancial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseReportedFinancials
 */

public class ApiResponseReportedFinancials {
  @SerializedName("reported_financials")
  private List<ReportedFinancial> reportedFinancials = null;

  @SerializedName("fundamental")
  private Fundamental fundamental = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseReportedFinancials reportedFinancials(List<ReportedFinancial> reportedFinancials) {
    this.reportedFinancials = reportedFinancials;
    return this;
  }

  public ApiResponseReportedFinancials addReportedFinancialsItem(ReportedFinancial reportedFinancialsItem) {
    if (this.reportedFinancials == null) {
      this.reportedFinancials = new ArrayList<ReportedFinancial>();
    }
    this.reportedFinancials.add(reportedFinancialsItem);
    return this;
  }

   /**
   * Get reportedFinancials
   * @return reportedFinancials
  **/
  @ApiModelProperty(value = "")
  public List<ReportedFinancial> getReportedFinancials() {
    return reportedFinancials;
  }

  public void setReportedFinancials(List<ReportedFinancial> reportedFinancials) {
    this.reportedFinancials = reportedFinancials;
  }

  public ApiResponseReportedFinancials fundamental(Fundamental fundamental) {
    this.fundamental = fundamental;
    return this;
  }

   /**
   * Get fundamental
   * @return fundamental
  **/
  @ApiModelProperty(value = "")
  public Fundamental getFundamental() {
    return fundamental;
  }

  public void setFundamental(Fundamental fundamental) {
    this.fundamental = fundamental;
  }

  public ApiResponseReportedFinancials nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data. If null, no further results are available.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data. If null, no further results are available.")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseReportedFinancials apiResponseReportedFinancials = (ApiResponseReportedFinancials) o;
    return Objects.equals(this.reportedFinancials, apiResponseReportedFinancials.reportedFinancials) &&
        Objects.equals(this.fundamental, apiResponseReportedFinancials.fundamental) &&
        Objects.equals(this.nextPage, apiResponseReportedFinancials.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportedFinancials, fundamental, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseReportedFinancials {\n");
    
    sb.append("    reportedFinancials: ").append(toIndentedString(reportedFinancials)).append("\n");
    sb.append("    fundamental: ").append(toIndentedString(fundamental)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

