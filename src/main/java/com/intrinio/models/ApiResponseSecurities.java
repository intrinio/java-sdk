

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurities
 */

public class ApiResponseSecurities {
  @SerializedName("securities")
  private List<SecuritySummary> securities = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurities securities(List<SecuritySummary> securities) {
    this.securities = securities;
    return this;
  }

  public ApiResponseSecurities addSecuritiesItem(SecuritySummary securitiesItem) {
    if (this.securities == null) {
      this.securities = new ArrayList<SecuritySummary>();
    }
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * Get securities
   * @return securities
  **/
  @ApiModelProperty(value = "")
  public List<SecuritySummary> getSecurities() {
    return securities;
  }

  public void setSecurities(List<SecuritySummary> securities) {
    this.securities = securities;
  }

  public ApiResponseSecurities nextPage(String nextPage) {
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
    ApiResponseSecurities apiResponseSecurities = (ApiResponseSecurities) o;
    return Objects.equals(this.securities, apiResponseSecurities.securities) &&
        Objects.equals(this.nextPage, apiResponseSecurities.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securities, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurities {\n");
    
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
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

