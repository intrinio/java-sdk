

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.ZacksEPSSurpriseSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityZacksEPSSurprises
 */

public class ApiResponseSecurityZacksEPSSurprises {
  @SerializedName("eps_surprises")
  private List<ZacksEPSSurpriseSummary> epsSurprises = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityZacksEPSSurprises epsSurprises(List<ZacksEPSSurpriseSummary> epsSurprises) {
    this.epsSurprises = epsSurprises;
    return this;
  }

  public ApiResponseSecurityZacksEPSSurprises addEpsSurprisesItem(ZacksEPSSurpriseSummary epsSurprisesItem) {
    if (this.epsSurprises == null) {
      this.epsSurprises = new ArrayList<ZacksEPSSurpriseSummary>();
    }
    this.epsSurprises.add(epsSurprisesItem);
    return this;
  }

   /**
   * Get epsSurprises
   * @return epsSurprises
  **/
  @ApiModelProperty(value = "")
  public List<ZacksEPSSurpriseSummary> getEpsSurprises() {
    return epsSurprises;
  }

  public void setEpsSurprises(List<ZacksEPSSurpriseSummary> epsSurprises) {
    this.epsSurprises = epsSurprises;
  }

  public ApiResponseSecurityZacksEPSSurprises security(SecuritySummary security) {
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

  public ApiResponseSecurityZacksEPSSurprises nextPage(String nextPage) {
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
    ApiResponseSecurityZacksEPSSurprises apiResponseSecurityZacksEPSSurprises = (ApiResponseSecurityZacksEPSSurprises) o;
    return Objects.equals(this.epsSurprises, apiResponseSecurityZacksEPSSurprises.epsSurprises) &&
        Objects.equals(this.security, apiResponseSecurityZacksEPSSurprises.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityZacksEPSSurprises.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsSurprises, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityZacksEPSSurprises {\n");
    
    sb.append("    epsSurprises: ").append(toIndentedString(epsSurprises)).append("\n");
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

