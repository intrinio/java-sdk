

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.FundamentalSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyFundamentals
 */

public class ApiResponseCompanyFundamentals {
  @SerializedName("fundamentals")
  private List<FundamentalSummary> fundamentals = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanyFundamentals fundamentals(List<FundamentalSummary> fundamentals) {
    this.fundamentals = fundamentals;
    return this;
  }

  public ApiResponseCompanyFundamentals addFundamentalsItem(FundamentalSummary fundamentalsItem) {
    if (this.fundamentals == null) {
      this.fundamentals = new ArrayList<FundamentalSummary>();
    }
    this.fundamentals.add(fundamentalsItem);
    return this;
  }

   /**
   * Get fundamentals
   * @return fundamentals
  **/
  @ApiModelProperty(value = "")
  public List<FundamentalSummary> getFundamentals() {
    return fundamentals;
  }

  public void setFundamentals(List<FundamentalSummary> fundamentals) {
    this.fundamentals = fundamentals;
  }

  public ApiResponseCompanyFundamentals company(CompanySummary company) {
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

  public ApiResponseCompanyFundamentals nextPage(String nextPage) {
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
    ApiResponseCompanyFundamentals apiResponseCompanyFundamentals = (ApiResponseCompanyFundamentals) o;
    return Objects.equals(this.fundamentals, apiResponseCompanyFundamentals.fundamentals) &&
        Objects.equals(this.company, apiResponseCompanyFundamentals.company) &&
        Objects.equals(this.nextPage, apiResponseCompanyFundamentals.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundamentals, company, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyFundamentals {\n");
    
    sb.append("    fundamentals: ").append(toIndentedString(fundamentals)).append("\n");
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

