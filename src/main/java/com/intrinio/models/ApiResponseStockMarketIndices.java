

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
 * ApiResponseStockMarketIndices
 */

public class ApiResponseStockMarketIndices {
  @SerializedName("indices")
  private List<StockMarketIndexSummary> indices = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStockMarketIndices indices(List<StockMarketIndexSummary> indices) {
    this.indices = indices;
    return this;
  }

  public ApiResponseStockMarketIndices addIndicesItem(StockMarketIndexSummary indicesItem) {
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

  public ApiResponseStockMarketIndices nextPage(String nextPage) {
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
    ApiResponseStockMarketIndices apiResponseStockMarketIndices = (ApiResponseStockMarketIndices) o;
    return Objects.equals(this.indices, apiResponseStockMarketIndices.indices) &&
        Objects.equals(this.nextPage, apiResponseStockMarketIndices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indices, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockMarketIndices {\n");
    
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

