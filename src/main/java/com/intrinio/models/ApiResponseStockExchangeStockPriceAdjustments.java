

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.StockExchange;
import com.intrinio.models.StockPriceAdjustment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockExchangeStockPriceAdjustments
 */

public class ApiResponseStockExchangeStockPriceAdjustments {
  @SerializedName("stock_price_adjustments")
  private List<StockPriceAdjustment> stockPriceAdjustments = null;

  @SerializedName("stock_exchange")
  private StockExchange stockExchange = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStockExchangeStockPriceAdjustments stockPriceAdjustments(List<StockPriceAdjustment> stockPriceAdjustments) {
    this.stockPriceAdjustments = stockPriceAdjustments;
    return this;
  }

  public ApiResponseStockExchangeStockPriceAdjustments addStockPriceAdjustmentsItem(StockPriceAdjustment stockPriceAdjustmentsItem) {
    if (this.stockPriceAdjustments == null) {
      this.stockPriceAdjustments = new ArrayList<>();
    }
    this.stockPriceAdjustments.add(stockPriceAdjustmentsItem);
    return this;
  }

   /**
   * The stock price adjustments for all Securities traded on the Stock Exchange on the given date
   * @return stockPriceAdjustments
  **/
  @ApiModelProperty(value = "The stock price adjustments for all Securities traded on the Stock Exchange on the given date")
  public List<StockPriceAdjustment> getStockPriceAdjustments() {
    return stockPriceAdjustments;
  }

  public void setStockPriceAdjustments(List<StockPriceAdjustment> stockPriceAdjustments) {
    this.stockPriceAdjustments = stockPriceAdjustments;
  }

  public ApiResponseStockExchangeStockPriceAdjustments stockExchange(StockExchange stockExchange) {
    this.stockExchange = stockExchange;
    return this;
  }

   /**
   * The Stock Exchange resolved from the given identifier
   * @return stockExchange
  **/
  @ApiModelProperty(value = "The Stock Exchange resolved from the given identifier")
  public StockExchange getStockExchange() {
    return stockExchange;
  }

  public void setStockExchange(StockExchange stockExchange) {
    this.stockExchange = stockExchange;
  }

  public ApiResponseStockExchangeStockPriceAdjustments nextPage(String nextPage) {
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
    ApiResponseStockExchangeStockPriceAdjustments apiResponseStockExchangeStockPriceAdjustments = (ApiResponseStockExchangeStockPriceAdjustments) o;
    return Objects.equals(this.stockPriceAdjustments, apiResponseStockExchangeStockPriceAdjustments.stockPriceAdjustments) &&
        Objects.equals(this.stockExchange, apiResponseStockExchangeStockPriceAdjustments.stockExchange) &&
        Objects.equals(this.nextPage, apiResponseStockExchangeStockPriceAdjustments.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockPriceAdjustments, stockExchange, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockExchangeStockPriceAdjustments {\n");
    
    sb.append("    stockPriceAdjustments: ").append(toIndentedString(stockPriceAdjustments)).append("\n");
    sb.append("    stockExchange: ").append(toIndentedString(stockExchange)).append("\n");
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

