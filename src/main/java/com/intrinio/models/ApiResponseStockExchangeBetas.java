

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Beta;
import com.intrinio.models.StockExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockExchangeBetas
 */

public class ApiResponseStockExchangeBetas {
  @SerializedName("betas")
  private List<Beta> betas = null;

  @SerializedName("stock_exchange")
  private StockExchange stockExchange = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStockExchangeBetas betas(List<Beta> betas) {
    this.betas = betas;
    return this;
  }

  public ApiResponseStockExchangeBetas addBetasItem(Beta betasItem) {
    if (this.betas == null) {
      this.betas = new ArrayList<>();
    }
    this.betas.add(betasItem);
    return this;
  }

   /**
   * The mover security.
   * @return betas
  **/
  @ApiModelProperty(value = "The mover security.")
  public List<Beta> getBetas() {
    return betas;
  }

  public void setBetas(List<Beta> betas) {
    this.betas = betas;
  }

  public ApiResponseStockExchangeBetas stockExchange(StockExchange stockExchange) {
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

  public ApiResponseStockExchangeBetas nextPage(String nextPage) {
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
    ApiResponseStockExchangeBetas apiResponseStockExchangeBetas = (ApiResponseStockExchangeBetas) o;
    return Objects.equals(this.betas, apiResponseStockExchangeBetas.betas) &&
        Objects.equals(this.stockExchange, apiResponseStockExchangeBetas.stockExchange) &&
        Objects.equals(this.nextPage, apiResponseStockExchangeBetas.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(betas, stockExchange, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockExchangeBetas {\n");
    
    sb.append("    betas: ").append(toIndentedString(betas)).append("\n");
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

