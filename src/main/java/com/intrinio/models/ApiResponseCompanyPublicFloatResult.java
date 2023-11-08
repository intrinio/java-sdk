

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanyPublicFloat;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An company public floats result contains all public floats corresponding to the provided query.
 */
@ApiModel(description = "An company public floats result contains all public floats corresponding to the provided query.")

public class ApiResponseCompanyPublicFloatResult {
  @SerializedName("next_page")
  private String nextPage = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("public_floats")
  private List<CompanyPublicFloat> publicFloats = null;

  public ApiResponseCompanyPublicFloatResult nextPage(String nextPage) {
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

  public ApiResponseCompanyPublicFloatResult company(CompanySummary company) {
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

  public ApiResponseCompanyPublicFloatResult publicFloats(List<CompanyPublicFloat> publicFloats) {
    this.publicFloats = publicFloats;
    return this;
  }

  public ApiResponseCompanyPublicFloatResult addPublicFloatsItem(CompanyPublicFloat publicFloatsItem) {
    if (this.publicFloats == null) {
      this.publicFloats = new ArrayList<>();
    }
    this.publicFloats.add(publicFloatsItem);
    return this;
  }

   /**
   * Array of all the public floats in this page of the result.
   * @return publicFloats
  **/
  @ApiModelProperty(value = "Array of all the public floats in this page of the result.")
  public List<CompanyPublicFloat> getPublicFloats() {
    return publicFloats;
  }

  public void setPublicFloats(List<CompanyPublicFloat> publicFloats) {
    this.publicFloats = publicFloats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCompanyPublicFloatResult apiResponseCompanyPublicFloatResult = (ApiResponseCompanyPublicFloatResult) o;
    return Objects.equals(this.nextPage, apiResponseCompanyPublicFloatResult.nextPage) &&
        Objects.equals(this.company, apiResponseCompanyPublicFloatResult.company) &&
        Objects.equals(this.publicFloats, apiResponseCompanyPublicFloatResult.publicFloats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPage, company, publicFloats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanyPublicFloatResult {\n");
    
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    publicFloats: ").append(toIndentedString(publicFloats)).append("\n");
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

