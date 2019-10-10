

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.HistoricalData;
import com.intrinio.models.StockMarketIndexSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockMarketIndexHistoricalData
 */

public class ApiResponseStockMarketIndexHistoricalData {
  @SerializedName("historical_data")
  private List<HistoricalData> historicalData = null;

  @SerializedName("index")
  private StockMarketIndexSummary index = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStockMarketIndexHistoricalData historicalData(List<HistoricalData> historicalData) {
    this.historicalData = historicalData;
    return this;
  }

  public ApiResponseStockMarketIndexHistoricalData addHistoricalDataItem(HistoricalData historicalDataItem) {
    if (this.historicalData == null) {
      this.historicalData = new ArrayList<HistoricalData>();
    }
    this.historicalData.add(historicalDataItem);
    return this;
  }

   /**
   * Get historicalData
   * @return historicalData
  **/
  @ApiModelProperty(value = "")
  public List<HistoricalData> getHistoricalData() {
    return historicalData;
  }

  public void setHistoricalData(List<HistoricalData> historicalData) {
    this.historicalData = historicalData;
  }

  public ApiResponseStockMarketIndexHistoricalData index(StockMarketIndexSummary index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public StockMarketIndexSummary getIndex() {
    return index;
  }

  public void setIndex(StockMarketIndexSummary index) {
    this.index = index;
  }

  public ApiResponseStockMarketIndexHistoricalData nextPage(String nextPage) {
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
    ApiResponseStockMarketIndexHistoricalData apiResponseStockMarketIndexHistoricalData = (ApiResponseStockMarketIndexHistoricalData) o;
    return Objects.equals(this.historicalData, apiResponseStockMarketIndexHistoricalData.historicalData) &&
        Objects.equals(this.index, apiResponseStockMarketIndexHistoricalData.index) &&
        Objects.equals(this.nextPage, apiResponseStockMarketIndexHistoricalData.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicalData, index, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockMarketIndexHistoricalData {\n");
    
    sb.append("    historicalData: ").append(toIndentedString(historicalData)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

