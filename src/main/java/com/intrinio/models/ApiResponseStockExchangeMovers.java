

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.StockExchange;
import com.intrinio.models.StockExchangeMover;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockExchangeMovers
 */

public class ApiResponseStockExchangeMovers {
  @SerializedName("movers")
  private List<StockExchangeMover> movers = null;

  @SerializedName("stock_exchange")
  private StockExchange stockExchange = null;

  public ApiResponseStockExchangeMovers movers(List<StockExchangeMover> movers) {
    this.movers = movers;
    return this;
  }

  public ApiResponseStockExchangeMovers addMoversItem(StockExchangeMover moversItem) {
    if (this.movers == null) {
      this.movers = new ArrayList<>();
    }
    this.movers.add(moversItem);
    return this;
  }

   /**
   * The mover security.
   * @return movers
  **/
  @ApiModelProperty(value = "The mover security.")
  public List<StockExchangeMover> getMovers() {
    return movers;
  }

  public void setMovers(List<StockExchangeMover> movers) {
    this.movers = movers;
  }

  public ApiResponseStockExchangeMovers stockExchange(StockExchange stockExchange) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseStockExchangeMovers apiResponseStockExchangeMovers = (ApiResponseStockExchangeMovers) o;
    return Objects.equals(this.movers, apiResponseStockExchangeMovers.movers) &&
        Objects.equals(this.stockExchange, apiResponseStockExchangeMovers.stockExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movers, stockExchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockExchangeMovers {\n");
    
    sb.append("    movers: ").append(toIndentedString(movers)).append("\n");
    sb.append("    stockExchange: ").append(toIndentedString(stockExchange)).append("\n");
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

