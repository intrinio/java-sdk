

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.StockExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockExchanges
 */

public class ApiResponseStockExchanges {
  @SerializedName("stock_exchanges")
  private List<StockExchange> stockExchanges = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStockExchanges stockExchanges(List<StockExchange> stockExchanges) {
    this.stockExchanges = stockExchanges;
    return this;
  }

  public ApiResponseStockExchanges addStockExchangesItem(StockExchange stockExchangesItem) {
    if (this.stockExchanges == null) {
      this.stockExchanges = new ArrayList<>();
    }
    this.stockExchanges.add(stockExchangesItem);
    return this;
  }

   /**
   * Get stockExchanges
   * @return stockExchanges
  **/
  @ApiModelProperty(value = "")
  public List<StockExchange> getStockExchanges() {
    return stockExchanges;
  }

  public void setStockExchanges(List<StockExchange> stockExchanges) {
    this.stockExchanges = stockExchanges;
  }

  public ApiResponseStockExchanges nextPage(String nextPage) {
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
    ApiResponseStockExchanges apiResponseStockExchanges = (ApiResponseStockExchanges) o;
    return Objects.equals(this.stockExchanges, apiResponseStockExchanges.stockExchanges) &&
        Objects.equals(this.nextPage, apiResponseStockExchanges.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockExchanges, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockExchanges {\n");
    
    sb.append("    stockExchanges: ").append(toIndentedString(stockExchanges)).append("\n");
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

