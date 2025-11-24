

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.EarningsDateEstimate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyExpectedEarningsDates
 */

public class ApiResponseCompanyExpectedEarningsDates {
  @SerializedName("expected_earnings_dates")
  private List<EarningsDateEstimate> expectedEarningsDates = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanyExpectedEarningsDates expectedEarningsDates(List<EarningsDateEstimate> expectedEarningsDates) {
    this.expectedEarningsDates = expectedEarningsDates;
    return this;
  }

  public ApiResponseCompanyExpectedEarningsDates addExpectedEarningsDatesItem(EarningsDateEstimate expectedEarningsDatesItem) {
    if (this.expectedEarningsDates == null) {
      this.expectedEarningsDates = new ArrayList<>();
    }
    this.expectedEarningsDates.add(expectedEarningsDatesItem);
    return this;
  }

   /**
   * Get expectedEarningsDates
   * @return expectedEarningsDates
  **/
  @ApiModelProperty(value = "")
  public List<EarningsDateEstimate> getExpectedEarningsDates() {
    return expectedEarningsDates;
  }

  public void setExpectedEarningsDates(List<EarningsDateEstimate> expectedEarningsDates) {
    this.expectedEarningsDates = expectedEarningsDates;
  }

  public ApiResponseCompanyExpectedEarningsDates company(CompanySummary company) {
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

  public ApiResponseCompanyExpectedEarningsDates nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data. If null, no further data is available.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data. If null, no further data is available.")
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
    ApiResponseCompanyExpectedEarningsDates apiResponseCompanyExpectedEarningsDates = (ApiResponseCompanyExpectedEarningsDates) o;
    return Objects.equals(this.expectedEarningsDates, apiResponseCompanyExpectedEarningsDates.expectedEarningsDates) &&
        Objects.equals(this.company, apiResponseCompanyExpectedEarningsDates.company) &&
        Objects.equals(this.nextPage, apiResponseCompanyExpectedEarningsDates.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedEarningsDates, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyExpectedEarningsDates {\n");
    
    sb.append("    expectedEarningsDates: ").append(toIndentedString(expectedEarningsDates)).append("\n");
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

