

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Fundamental;
import com.intrinio.models.StandardizedFinancial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStandardizedFinancials
 */

public class ApiResponseStandardizedFinancials {
  @SerializedName("standardized_financials")
  private List<StandardizedFinancial> standardizedFinancials = null;

  @SerializedName("fundamental")
  private Fundamental fundamental = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStandardizedFinancials standardizedFinancials(List<StandardizedFinancial> standardizedFinancials) {
    this.standardizedFinancials = standardizedFinancials;
    return this;
  }

  public ApiResponseStandardizedFinancials addStandardizedFinancialsItem(StandardizedFinancial standardizedFinancialsItem) {
    if (this.standardizedFinancials == null) {
      this.standardizedFinancials = new ArrayList<>();
    }
    this.standardizedFinancials.add(standardizedFinancialsItem);
    return this;
  }

   /**
   * Get standardizedFinancials
   * @return standardizedFinancials
  **/
  @ApiModelProperty(value = "")
  public List<StandardizedFinancial> getStandardizedFinancials() {
    return standardizedFinancials;
  }

  public void setStandardizedFinancials(List<StandardizedFinancial> standardizedFinancials) {
    this.standardizedFinancials = standardizedFinancials;
  }

  public ApiResponseStandardizedFinancials fundamental(Fundamental fundamental) {
    this.fundamental = fundamental;
    return this;
  }

   /**
   * Get fundamental
   * @return fundamental
  **/
  @ApiModelProperty(value = "")
  public Fundamental getFundamental() {
    return fundamental;
  }

  public void setFundamental(Fundamental fundamental) {
    this.fundamental = fundamental;
  }

  public ApiResponseStandardizedFinancials nextPage(String nextPage) {
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
    ApiResponseStandardizedFinancials apiResponseStandardizedFinancials = (ApiResponseStandardizedFinancials) o;
    return Objects.equals(this.standardizedFinancials, apiResponseStandardizedFinancials.standardizedFinancials) &&
        Objects.equals(this.fundamental, apiResponseStandardizedFinancials.fundamental) &&
        Objects.equals(this.nextPage, apiResponseStandardizedFinancials.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standardizedFinancials, fundamental, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStandardizedFinancials {\n");
    
    sb.append("    standardizedFinancials: ").append(toIndentedString(standardizedFinancials)).append("\n");
    sb.append("    fundamental: ").append(toIndentedString(fundamental)).append("\n");
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

