

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
 * ApiResponseCompaniesSearch
 */

public class ApiResponseCompaniesSearch {
  @SerializedName("companies")
  private List<CompanySummary> companies = null;

  public ApiResponseCompaniesSearch companies(List<CompanySummary> companies) {
    this.companies = companies;
    return this;
  }

  public ApiResponseCompaniesSearch addCompaniesItem(CompanySummary companiesItem) {
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
  public List<CompanySummary> getCompanies() {
    return companies;
  }

  public void setCompanies(List<CompanySummary> companies) {
    this.companies = companies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCompaniesSearch apiResponseCompaniesSearch = (ApiResponseCompaniesSearch) o;
    return Objects.equals(this.companies, apiResponseCompaniesSearch.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompaniesSearch {\n");
    
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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

