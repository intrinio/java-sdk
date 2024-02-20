

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksSalesEstimate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksSalesEstimates
 */

public class ApiResponseZacksSalesEstimates {
  @SerializedName("estimates")
  private List<ZacksSalesEstimate> estimates = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksSalesEstimates estimates(List<ZacksSalesEstimate> estimates) {
    this.estimates = estimates;
    return this;
  }

  public ApiResponseZacksSalesEstimates addEstimatesItem(ZacksSalesEstimate estimatesItem) {
    if (this.estimates == null) {
      this.estimates = new ArrayList<>();
    }
    this.estimates.add(estimatesItem);
    return this;
  }

   /**
   * Zacks Sales estimate data for a given date range
   * @return estimates
  **/
  @ApiModelProperty(value = "Zacks Sales estimate data for a given date range")
  public List<ZacksSalesEstimate> getEstimates() {
    return estimates;
  }

  public void setEstimates(List<ZacksSalesEstimate> estimates) {
    this.estimates = estimates;
  }

  public ApiResponseZacksSalesEstimates nextPage(String nextPage) {
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
    ApiResponseZacksSalesEstimates apiResponseZacksSalesEstimates = (ApiResponseZacksSalesEstimates) o;
    return Objects.equals(this.estimates, apiResponseZacksSalesEstimates.estimates) &&
        Objects.equals(this.nextPage, apiResponseZacksSalesEstimates.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimates, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksSalesEstimates {\n");
    
    sb.append("    estimates: ").append(toIndentedString(estimates)).append("\n");
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

