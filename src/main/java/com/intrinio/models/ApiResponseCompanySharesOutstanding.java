

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySharesOutstanding;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseCompanySharesOutstanding
 */

public class ApiResponseCompanySharesOutstanding {
  @SerializedName("shares_outstanding")
  private List<CompanySharesOutstanding> sharesOutstanding = null;

  @SerializedName("company")
  private CompanySummary company = null;

  public ApiResponseCompanySharesOutstanding sharesOutstanding(List<CompanySharesOutstanding> sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

  public ApiResponseCompanySharesOutstanding addSharesOutstandingItem(CompanySharesOutstanding sharesOutstandingItem) {
    if (this.sharesOutstanding == null) {
      this.sharesOutstanding = new ArrayList<>();
    }
    this.sharesOutstanding.add(sharesOutstandingItem);
    return this;
  }

   /**
   * Get sharesOutstanding
   * @return sharesOutstanding
  **/
  @ApiModelProperty(value = "")
  public List<CompanySharesOutstanding> getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(List<CompanySharesOutstanding> sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }

  public ApiResponseCompanySharesOutstanding company(CompanySummary company) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCompanySharesOutstanding apiResponseCompanySharesOutstanding = (ApiResponseCompanySharesOutstanding) o;
    return Objects.equals(this.sharesOutstanding, apiResponseCompanySharesOutstanding.sharesOutstanding) &&
        Objects.equals(this.company, apiResponseCompanySharesOutstanding.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharesOutstanding, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCompanySharesOutstanding {\n");
    
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

