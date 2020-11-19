

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.ZacksSalesSurpriseSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityZacksSalesSurprises
 */

public class ApiResponseSecurityZacksSalesSurprises {
  @SerializedName("sales_surprises")
  private List<ZacksSalesSurpriseSummary> salesSurprises = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityZacksSalesSurprises salesSurprises(List<ZacksSalesSurpriseSummary> salesSurprises) {
    this.salesSurprises = salesSurprises;
    return this;
  }

  public ApiResponseSecurityZacksSalesSurprises addSalesSurprisesItem(ZacksSalesSurpriseSummary salesSurprisesItem) {
    if (this.salesSurprises == null) {
      this.salesSurprises = new ArrayList<>();
    }
    this.salesSurprises.add(salesSurprisesItem);
    return this;
  }

   /**
   * Get salesSurprises
   * @return salesSurprises
  **/
  @ApiModelProperty(value = "")
  public List<ZacksSalesSurpriseSummary> getSalesSurprises() {
    return salesSurprises;
  }

  public void setSalesSurprises(List<ZacksSalesSurpriseSummary> salesSurprises) {
    this.salesSurprises = salesSurprises;
  }

  public ApiResponseSecurityZacksSalesSurprises security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security resolved from the given identifier
   * @return security
  **/
  @ApiModelProperty(value = "The Security resolved from the given identifier")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }

  public ApiResponseSecurityZacksSalesSurprises nextPage(String nextPage) {
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
    ApiResponseSecurityZacksSalesSurprises apiResponseSecurityZacksSalesSurprises = (ApiResponseSecurityZacksSalesSurprises) o;
    return Objects.equals(this.salesSurprises, apiResponseSecurityZacksSalesSurprises.salesSurprises) &&
        Objects.equals(this.security, apiResponseSecurityZacksSalesSurprises.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityZacksSalesSurprises.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesSurprises, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityZacksSalesSurprises {\n");
    
    sb.append("    salesSurprises: ").append(toIndentedString(salesSurprises)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

