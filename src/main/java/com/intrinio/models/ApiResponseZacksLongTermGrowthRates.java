

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksLongTermGrowthRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksLongTermGrowthRates
 */

public class ApiResponseZacksLongTermGrowthRates {
  @SerializedName("long_term_growth_estimates")
  private List<ZacksLongTermGrowthRate> longTermGrowthEstimates = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksLongTermGrowthRates longTermGrowthEstimates(List<ZacksLongTermGrowthRate> longTermGrowthEstimates) {
    this.longTermGrowthEstimates = longTermGrowthEstimates;
    return this;
  }

  public ApiResponseZacksLongTermGrowthRates addLongTermGrowthEstimatesItem(ZacksLongTermGrowthRate longTermGrowthEstimatesItem) {
    if (this.longTermGrowthEstimates == null) {
      this.longTermGrowthEstimates = new ArrayList<ZacksLongTermGrowthRate>();
    }
    this.longTermGrowthEstimates.add(longTermGrowthEstimatesItem);
    return this;
  }

   /**
   * Zacks latest long term growth rates
   * @return longTermGrowthEstimates
  **/
  @ApiModelProperty(value = "Zacks latest long term growth rates")
  public List<ZacksLongTermGrowthRate> getLongTermGrowthEstimates() {
    return longTermGrowthEstimates;
  }

  public void setLongTermGrowthEstimates(List<ZacksLongTermGrowthRate> longTermGrowthEstimates) {
    this.longTermGrowthEstimates = longTermGrowthEstimates;
  }

  public ApiResponseZacksLongTermGrowthRates nextPage(String nextPage) {
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
    ApiResponseZacksLongTermGrowthRates apiResponseZacksLongTermGrowthRates = (ApiResponseZacksLongTermGrowthRates) o;
    return Objects.equals(this.longTermGrowthEstimates, apiResponseZacksLongTermGrowthRates.longTermGrowthEstimates) &&
        Objects.equals(this.nextPage, apiResponseZacksLongTermGrowthRates.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longTermGrowthEstimates, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksLongTermGrowthRates {\n");
    
    sb.append("    longTermGrowthEstimates: ").append(toIndentedString(longTermGrowthEstimates)).append("\n");
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

