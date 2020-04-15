

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksTargetPriceConsensus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksTargetPriceConsensuses
 */

public class ApiResponseZacksTargetPriceConsensuses {
  @SerializedName("target_price_consensuses")
  private List<ZacksTargetPriceConsensus> targetPriceConsensuses = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksTargetPriceConsensuses targetPriceConsensuses(List<ZacksTargetPriceConsensus> targetPriceConsensuses) {
    this.targetPriceConsensuses = targetPriceConsensuses;
    return this;
  }

  public ApiResponseZacksTargetPriceConsensuses addTargetPriceConsensusesItem(ZacksTargetPriceConsensus targetPriceConsensusesItem) {
    if (this.targetPriceConsensuses == null) {
      this.targetPriceConsensuses = new ArrayList<ZacksTargetPriceConsensus>();
    }
    this.targetPriceConsensuses.add(targetPriceConsensusesItem);
    return this;
  }

   /**
   * Zacks target price consensuses for the latest date
   * @return targetPriceConsensuses
  **/
  @ApiModelProperty(value = "Zacks target price consensuses for the latest date")
  public List<ZacksTargetPriceConsensus> getTargetPriceConsensuses() {
    return targetPriceConsensuses;
  }

  public void setTargetPriceConsensuses(List<ZacksTargetPriceConsensus> targetPriceConsensuses) {
    this.targetPriceConsensuses = targetPriceConsensuses;
  }

  public ApiResponseZacksTargetPriceConsensuses nextPage(String nextPage) {
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
    ApiResponseZacksTargetPriceConsensuses apiResponseZacksTargetPriceConsensuses = (ApiResponseZacksTargetPriceConsensuses) o;
    return Objects.equals(this.targetPriceConsensuses, apiResponseZacksTargetPriceConsensuses.targetPriceConsensuses) &&
        Objects.equals(this.nextPage, apiResponseZacksTargetPriceConsensuses.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPriceConsensuses, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksTargetPriceConsensuses {\n");
    
    sb.append("    targetPriceConsensuses: ").append(toIndentedString(targetPriceConsensuses)).append("\n");
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

