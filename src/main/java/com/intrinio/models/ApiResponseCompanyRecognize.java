

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.DefinitionsCompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanyRecognize
 */

public class ApiResponseCompanyRecognize {
  @SerializedName("companies")
  private List<DefinitionsCompanySummary> companies = null;

  public ApiResponseCompanyRecognize companies(List<DefinitionsCompanySummary> companies) {
    this.companies = companies;
    return this;
  }

  public ApiResponseCompanyRecognize addCompaniesItem(DefinitionsCompanySummary companiesItem) {
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
  public List<DefinitionsCompanySummary> getCompanies() {
    return companies;
  }

  public void setCompanies(List<DefinitionsCompanySummary> companies) {
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
    ApiResponseCompanyRecognize apiResponseCompanyRecognize = (ApiResponseCompanyRecognize) o;
    return Objects.equals(this.companies, apiResponseCompanyRecognize.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyRecognize {\n");
    
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

