

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ESGCompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseESGCompanies
 */

public class ApiResponseESGCompanies {
  @SerializedName("companies")
  private List<ESGCompanySummary> companies = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseESGCompanies companies(List<ESGCompanySummary> companies) {
    this.companies = companies;
    return this;
  }

  public ApiResponseESGCompanies addCompaniesItem(ESGCompanySummary companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @ApiModelProperty(value = "")
  public List<ESGCompanySummary> getCompanies() {
    return companies;
  }

  public void setCompanies(List<ESGCompanySummary> companies) {
    this.companies = companies;
  }

  public ApiResponseESGCompanies nextPage(String nextPage) {
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
    ApiResponseESGCompanies apiResponseESGCompanies = (ApiResponseESGCompanies) o;
    return Objects.equals(this.companies, apiResponseESGCompanies.companies) &&
        Objects.equals(this.nextPage, apiResponseESGCompanies.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseESGCompanies {\n");
    
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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

