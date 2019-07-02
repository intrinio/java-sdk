

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.RealtimeStockPrice;
import com.intrinio.models.StockExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockExchangeRealtimeStockPrices
 */

public class ApiResponseStockExchangeRealtimeStockPrices {
  @SerializedName("stock_prices")
  private List<RealtimeStockPrice> stockPrices = null;

  @SerializedName("stock_exchange")
  private StockExchange stockExchange = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStockExchangeRealtimeStockPrices stockPrices(List<RealtimeStockPrice> stockPrices) {
    this.stockPrices = stockPrices;
    return this;
  }

  public ApiResponseStockExchangeRealtimeStockPrices addStockPricesItem(RealtimeStockPrice stockPricesItem) {
    if (this.stockPrices == null) {
      this.stockPrices = new ArrayList<RealtimeStockPrice>();
    }
    this.stockPrices.add(stockPricesItem);
    return this;
  }

   /**
   * The realtime stock prices for all Securities traded on the Stock Exchange
   * @return stockPrices
  **/
  @ApiModelProperty(value = "The realtime stock prices for all Securities traded on the Stock Exchange")
  public List<RealtimeStockPrice> getStockPrices() {
    return stockPrices;
  }

  public void setStockPrices(List<RealtimeStockPrice> stockPrices) {
    this.stockPrices = stockPrices;
  }

  public ApiResponseStockExchangeRealtimeStockPrices stockExchange(StockExchange stockExchange) {
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

  public ApiResponseStockExchangeRealtimeStockPrices nextPage(String nextPage) {
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
    ApiResponseStockExchangeRealtimeStockPrices apiResponseStockExchangeRealtimeStockPrices = (ApiResponseStockExchangeRealtimeStockPrices) o;
    return Objects.equals(this.stockPrices, apiResponseStockExchangeRealtimeStockPrices.stockPrices) &&
        Objects.equals(this.stockExchange, apiResponseStockExchangeRealtimeStockPrices.stockExchange) &&
        Objects.equals(this.nextPage, apiResponseStockExchangeRealtimeStockPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockPrices, stockExchange, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockExchangeRealtimeStockPrices {\n");
    
    sb.append("    stockPrices: ").append(toIndentedString(stockPrices)).append("\n");
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

