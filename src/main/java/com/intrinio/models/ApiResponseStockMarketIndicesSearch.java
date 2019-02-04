

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.StockMarketIndexSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockMarketIndicesSearch
 */

public class ApiResponseStockMarketIndicesSearch {
  @SerializedName("indices")
  private List<StockMarketIndexSummary> indices = null;

  public ApiResponseStockMarketIndicesSearch indices(List<StockMarketIndexSummary> indices) {
    this.indices = indices;
    return this;
  }

  public ApiResponseStockMarketIndicesSearch addIndicesItem(StockMarketIndexSummary indicesItem) {
    if (this.indices == null) {
      this.indices = new ArrayList<StockMarketIndexSummary>();
    }
    this.indices.add(indicesItem);
    return this;
  }

   /**
   * Get indices
   * @return indices
  **/
  @ApiModelProperty(value = "")
  public List<StockMarketIndexSummary> getIndices() {
    return indices;
  }

  public void setIndices(List<StockMarketIndexSummary> indices) {
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
    ApiResponseStockMarketIndicesSearch apiResponseStockMarketIndicesSearch = (ApiResponseStockMarketIndicesSearch) o;
    return Objects.equals(this.indices, apiResponseStockMarketIndicesSearch.indices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockMarketIndicesSearch {\n");
    
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

