

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ApiResponseSecurityQuote;
import com.intrinio.models.StockExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockExchangeQuote
 */

public class ApiResponseStockExchangeQuote {
  @SerializedName("quotes")
  private List<ApiResponseSecurityQuote> quotes = null;

  @SerializedName("stock_exchange")
  private StockExchange stockExchange = null;

  public ApiResponseStockExchangeQuote quotes(List<ApiResponseSecurityQuote> quotes) {
    this.quotes = quotes;
    return this;
  }

  public ApiResponseStockExchangeQuote addQuotesItem(ApiResponseSecurityQuote quotesItem) {
    if (this.quotes == null) {
      this.quotes = new ArrayList<>();
    }
    this.quotes.add(quotesItem);
    return this;
  }

   /**
   * The realtime stock prices for all Securities traded on the Stock Exchange
   * @return quotes
  **/
  @ApiModelProperty(value = "The realtime stock prices for all Securities traded on the Stock Exchange")
  public List<ApiResponseSecurityQuote> getQuotes() {
    return quotes;
  }

  public void setQuotes(List<ApiResponseSecurityQuote> quotes) {
    this.quotes = quotes;
  }

  public ApiResponseStockExchangeQuote stockExchange(StockExchange stockExchange) {
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
    ApiResponseStockExchangeQuote apiResponseStockExchangeQuote = (ApiResponseStockExchangeQuote) o;
    return Objects.equals(this.quotes, apiResponseStockExchangeQuote.quotes) &&
        Objects.equals(this.stockExchange, apiResponseStockExchangeQuote.stockExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotes, stockExchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockExchangeQuote {\n");
    
    sb.append("    quotes: ").append(toIndentedString(quotes)).append("\n");
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

