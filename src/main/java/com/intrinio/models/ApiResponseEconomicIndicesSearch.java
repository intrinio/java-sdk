

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
 * ApiResponseEconomicIndicesSearch
 */

public class ApiResponseEconomicIndicesSearch {
  @SerializedName("indices")
  private List<EconomicIndexSummary> indices = null;

  public ApiResponseEconomicIndicesSearch indices(List<EconomicIndexSummary> indices) {
    this.indices = indices;
    return this;
  }

  public ApiResponseEconomicIndicesSearch addIndicesItem(EconomicIndexSummary indicesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseEconomicIndicesSearch apiResponseEconomicIndicesSearch = (ApiResponseEconomicIndicesSearch) o;
    return Objects.equals(this.indices, apiResponseEconomicIndicesSearch.indices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseEconomicIndicesSearch {\n");
    
    sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
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

