

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksEBITDAConsensus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseZacksEBITDAConsensus
 */

public class ApiResponseZacksEBITDAConsensus {
  @SerializedName("ebitda_consensuses")
  private List<ZacksEBITDAConsensus> ebitdaConsensuses = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseZacksEBITDAConsensus ebitdaConsensuses(List<ZacksEBITDAConsensus> ebitdaConsensuses) {
    this.ebitdaConsensuses = ebitdaConsensuses;
    return this;
  }

  public ApiResponseZacksEBITDAConsensus addEbitdaConsensusesItem(ZacksEBITDAConsensus ebitdaConsensusesItem) {
    if (this.ebitdaConsensuses == null) {
      this.ebitdaConsensuses = new ArrayList<>();
    }
    this.ebitdaConsensuses.add(ebitdaConsensusesItem);
    return this;
  }

   /**
   * Zacks target price consensuses for the latest date
   * @return ebitdaConsensuses
  **/
  @ApiModelProperty(value = "Zacks target price consensuses for the latest date")
  public List<ZacksEBITDAConsensus> getEbitdaConsensuses() {
    return ebitdaConsensuses;
  }

  public void setEbitdaConsensuses(List<ZacksEBITDAConsensus> ebitdaConsensuses) {
    this.ebitdaConsensuses = ebitdaConsensuses;
  }

  public ApiResponseZacksEBITDAConsensus nextPage(String nextPage) {
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
    ApiResponseZacksEBITDAConsensus apiResponseZacksEBITDAConsensus = (ApiResponseZacksEBITDAConsensus) o;
    return Objects.equals(this.ebitdaConsensuses, apiResponseZacksEBITDAConsensus.ebitdaConsensuses) &&
        Objects.equals(this.nextPage, apiResponseZacksEBITDAConsensus.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ebitdaConsensuses, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseZacksEBITDAConsensus {\n");
    
    sb.append("    ebitdaConsensuses: ").append(toIndentedString(ebitdaConsensuses)).append("\n");
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

