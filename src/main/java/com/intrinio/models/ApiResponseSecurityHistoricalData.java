

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.HistoricalData;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityHistoricalData
 */

public class ApiResponseSecurityHistoricalData {
  @SerializedName("historical_data")
  private List<HistoricalData> historicalData = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityHistoricalData historicalData(List<HistoricalData> historicalData) {
    this.historicalData = historicalData;
    return this;
  }

  public ApiResponseSecurityHistoricalData addHistoricalDataItem(HistoricalData historicalDataItem) {
    if (this.historicalData == null) {
      this.historicalData = new ArrayList<HistoricalData>();
    }
    this.historicalData.add(historicalDataItem);
    return this;
  }

   /**
   * Get historicalData
   * @return historicalData
  **/
  @ApiModelProperty(value = "")
  public List<HistoricalData> getHistoricalData() {
    return historicalData;
  }

  public void setHistoricalData(List<HistoricalData> historicalData) {
    this.historicalData = historicalData;
  }

  public ApiResponseSecurityHistoricalData security(SecuritySummary security) {
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

  public ApiResponseSecurityHistoricalData nextPage(String nextPage) {
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
    ApiResponseSecurityHistoricalData apiResponseSecurityHistoricalData = (ApiResponseSecurityHistoricalData) o;
    return Objects.equals(this.historicalData, apiResponseSecurityHistoricalData.historicalData) &&
        Objects.equals(this.security, apiResponseSecurityHistoricalData.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityHistoricalData.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicalData, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityHistoricalData {\n");
    
    sb.append("    historicalData: ").append(toIndentedString(historicalData)).append("\n");
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

