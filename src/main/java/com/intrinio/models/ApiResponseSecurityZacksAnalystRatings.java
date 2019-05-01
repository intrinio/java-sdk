

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.ZacksAnalystRatingSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityZacksAnalystRatings
 */

public class ApiResponseSecurityZacksAnalystRatings {
  @SerializedName("analyst_ratings")
  private List<ZacksAnalystRatingSummary> analystRatings = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityZacksAnalystRatings analystRatings(List<ZacksAnalystRatingSummary> analystRatings) {
    this.analystRatings = analystRatings;
    return this;
  }

  public ApiResponseSecurityZacksAnalystRatings addAnalystRatingsItem(ZacksAnalystRatingSummary analystRatingsItem) {
    if (this.analystRatings == null) {
      this.analystRatings = new ArrayList<ZacksAnalystRatingSummary>();
    }
    this.analystRatings.add(analystRatingsItem);
    return this;
  }

   /**
   * Get analystRatings
   * @return analystRatings
  **/
  @ApiModelProperty(value = "")
  public List<ZacksAnalystRatingSummary> getAnalystRatings() {
    return analystRatings;
  }

  public void setAnalystRatings(List<ZacksAnalystRatingSummary> analystRatings) {
    this.analystRatings = analystRatings;
  }

  public ApiResponseSecurityZacksAnalystRatings security(SecuritySummary security) {
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

  public ApiResponseSecurityZacksAnalystRatings nextPage(String nextPage) {
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
    ApiResponseSecurityZacksAnalystRatings apiResponseSecurityZacksAnalystRatings = (ApiResponseSecurityZacksAnalystRatings) o;
    return Objects.equals(this.analystRatings, apiResponseSecurityZacksAnalystRatings.analystRatings) &&
        Objects.equals(this.security, apiResponseSecurityZacksAnalystRatings.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityZacksAnalystRatings.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analystRatings, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityZacksAnalystRatings {\n");
    
    sb.append("    analystRatings: ").append(toIndentedString(analystRatings)).append("\n");
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

