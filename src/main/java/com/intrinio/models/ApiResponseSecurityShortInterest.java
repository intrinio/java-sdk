

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.ShortInterest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityShortInterest
 */

public class ApiResponseSecurityShortInterest {
  @SerializedName("short_interest")
  private List<ShortInterest> shortInterest = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityShortInterest shortInterest(List<ShortInterest> shortInterest) {
    this.shortInterest = shortInterest;
    return this;
  }

  public ApiResponseSecurityShortInterest addShortInterestItem(ShortInterest shortInterestItem) {
    if (this.shortInterest == null) {
      this.shortInterest = new ArrayList<>();
    }
    this.shortInterest.add(shortInterestItem);
    return this;
  }

   /**
   * Get shortInterest
   * @return shortInterest
  **/
  @ApiModelProperty(value = "")
  public List<ShortInterest> getShortInterest() {
    return shortInterest;
  }

  public void setShortInterest(List<ShortInterest> shortInterest) {
    this.shortInterest = shortInterest;
  }

  public ApiResponseSecurityShortInterest security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }

  public ApiResponseSecurityShortInterest nextPage(String nextPage) {
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
    ApiResponseSecurityShortInterest apiResponseSecurityShortInterest = (ApiResponseSecurityShortInterest) o;
    return Objects.equals(this.shortInterest, apiResponseSecurityShortInterest.shortInterest) &&
        Objects.equals(this.security, apiResponseSecurityShortInterest.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityShortInterest.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortInterest, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityShortInterest {\n");
    
    sb.append("    shortInterest: ").append(toIndentedString(shortInterest)).append("\n");
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

