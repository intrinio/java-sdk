

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.FilingSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyFilings
 */

public class ApiResponseCompanyFilings {
  @SerializedName("filings")
  private List<FilingSummary> filings = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanyFilings filings(List<FilingSummary> filings) {
    this.filings = filings;
    return this;
  }

  public ApiResponseCompanyFilings addFilingsItem(FilingSummary filingsItem) {
    if (this.filings == null) {
      this.filings = new ArrayList<FilingSummary>();
    }
    this.filings.add(filingsItem);
    return this;
  }

   /**
   * Get filings
   * @return filings
  **/
  @ApiModelProperty(value = "")
  public List<FilingSummary> getFilings() {
    return filings;
  }

  public void setFilings(List<FilingSummary> filings) {
    this.filings = filings;
  }

  public ApiResponseCompanyFilings company(CompanySummary company) {
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

  public ApiResponseCompanyFilings nextPage(String nextPage) {
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
    ApiResponseCompanyFilings apiResponseCompanyFilings = (ApiResponseCompanyFilings) o;
    return Objects.equals(this.filings, apiResponseCompanyFilings.filings) &&
        Objects.equals(this.company, apiResponseCompanyFilings.company) &&
        Objects.equals(this.nextPage, apiResponseCompanyFilings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filings, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyFilings {\n");
    
    sb.append("    filings: ").append(toIndentedString(filings)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

