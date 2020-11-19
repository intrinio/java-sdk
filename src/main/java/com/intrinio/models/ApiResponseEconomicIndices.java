

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.EconomicIndexSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseEconomicIndices
 */

public class ApiResponseEconomicIndices {
  @SerializedName("indices")
  private List<EconomicIndexSummary> indices = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseEconomicIndices indices(List<EconomicIndexSummary> indices) {
    this.indices = indices;
    return this;
  }

  public ApiResponseEconomicIndices addIndicesItem(EconomicIndexSummary indicesItem) {
    if (this.indices == null) {
      this.indices = new ArrayList<>();
    }
    this.indices.add(indicesItem);
    return this;
  }

   /**
   * Get indices
   * @return indices
  **/
  @ApiModelProperty(value = "")
  public List<EconomicIndexSummary> getIndices() {
    return indices;
  }

  public void setIndices(List<EconomicIndexSummary> indices) {
    this.indices = indices;
  }

  public ApiResponseEconomicIndices nextPage(String nextPage) {
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
    ApiResponseEconomicIndices apiResponseEconomicIndices = (ApiResponseEconomicIndices) o;
    return Objects.equals(this.indices, apiResponseEconomicIndices.indices) &&
        Objects.equals(this.nextPage, apiResponseEconomicIndices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indices, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseEconomicIndices {\n");
    
    sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
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

