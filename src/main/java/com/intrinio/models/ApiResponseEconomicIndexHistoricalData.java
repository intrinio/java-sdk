

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.EconomicIndexSummary;
import com.intrinio.models.HistoricalData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseEconomicIndexHistoricalData
 */

public class ApiResponseEconomicIndexHistoricalData {
  @SerializedName("historical_data")
  private List<HistoricalData> historicalData = null;

  @SerializedName("index")
  private EconomicIndexSummary index = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseEconomicIndexHistoricalData historicalData(List<HistoricalData> historicalData) {
    this.historicalData = historicalData;
    return this;
  }

  public ApiResponseEconomicIndexHistoricalData addHistoricalDataItem(HistoricalData historicalDataItem) {
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

  public ApiResponseEconomicIndexHistoricalData index(EconomicIndexSummary index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public EconomicIndexSummary getIndex() {
    return index;
  }

  public void setIndex(EconomicIndexSummary index) {
    this.index = index;
  }

  public ApiResponseEconomicIndexHistoricalData nextPage(String nextPage) {
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
    ApiResponseEconomicIndexHistoricalData apiResponseEconomicIndexHistoricalData = (ApiResponseEconomicIndexHistoricalData) o;
    return Objects.equals(this.historicalData, apiResponseEconomicIndexHistoricalData.historicalData) &&
        Objects.equals(this.index, apiResponseEconomicIndexHistoricalData.index) &&
        Objects.equals(this.nextPage, apiResponseEconomicIndexHistoricalData.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(historicalData, index, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseEconomicIndexHistoricalData {\n");
    
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

