

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
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanies
 */

public class ApiResponseCompanies {
  @SerializedName("companies")
  private List<CompanySummary> companies = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseCompanies companies(List<CompanySummary> companies) {
    this.companies = companies;
    return this;
  }

  public ApiResponseCompanies addCompaniesItem(CompanySummary companiesItem) {
    if (this.companies == null) {
      this.companies = new ArrayList<CompanySummary>();
    }
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @ApiModelProperty(value = "")
  public List<CompanySummary> getCompanies() {
    return companies;
  }

  public void setCompanies(List<CompanySummary> companies) {
    this.companies = companies;
  }

  public ApiResponseCompanies nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * The token required to request the next page of the data
   * @return nextPage
  **/
  @ApiModelProperty(value = "The token required to request the next page of the data")
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
    ApiResponseCompanies apiResponseCompanies = (ApiResponseCompanies) o;
    return Objects.equals(this.companies, apiResponseCompanies.companies) &&
        Objects.equals(this.nextPage, apiResponseCompanies.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanies {\n");
    
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

