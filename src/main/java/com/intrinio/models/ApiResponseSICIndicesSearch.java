

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SICIndex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSICIndicesSearch
 */

public class ApiResponseSICIndicesSearch {
  @SerializedName("indices")
  private List<SICIndex> indices = null;

  public ApiResponseSICIndicesSearch indices(List<SICIndex> indices) {
    this.indices = indices;
    return this;
  }

  public ApiResponseSICIndicesSearch addIndicesItem(SICIndex indicesItem) {
    if (this.indices == null) {
      this.indices = new ArrayList<SICIndex>();
    }
    this.indices.add(indicesItem);
    return this;
  }

   /**
   * Get indices
   * @return indices
  **/
  @ApiModelProperty(value = "")
  public List<SICIndex> getIndices() {
    return indices;
  }

  public void setIndices(List<SICIndex> indices) {
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
    ApiResponseSICIndicesSearch apiResponseSICIndicesSearch = (ApiResponseSICIndicesSearch) o;
    return Objects.equals(this.indices, apiResponseSICIndicesSearch.indices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSICIndicesSearch {\n");
    
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

