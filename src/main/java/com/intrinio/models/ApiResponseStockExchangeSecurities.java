

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.StockExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseStockExchangeSecurities
 */

public class ApiResponseStockExchangeSecurities {
  @SerializedName("securities")
  private List<SecuritySummary> securities = null;

  @SerializedName("stock_exchange")
  private StockExchange stockExchange = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseStockExchangeSecurities securities(List<SecuritySummary> securities) {
    this.securities = securities;
    return this;
  }

  public ApiResponseStockExchangeSecurities addSecuritiesItem(SecuritySummary securitiesItem) {
    if (this.securities == null) {
      this.securities = new ArrayList<SecuritySummary>();
    }
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * The securities traded on the Stock Exchange
   * @return securities
  **/
  @ApiModelProperty(value = "The securities traded on the Stock Exchange")
  public List<SecuritySummary> getSecurities() {
    return securities;
  }

  public void setSecurities(List<SecuritySummary> securities) {
    this.securities = securities;
  }

  public ApiResponseStockExchangeSecurities stockExchange(StockExchange stockExchange) {
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

  public ApiResponseStockExchangeSecurities nextPage(String nextPage) {
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
    ApiResponseStockExchangeSecurities apiResponseStockExchangeSecurities = (ApiResponseStockExchangeSecurities) o;
    return Objects.equals(this.securities, apiResponseStockExchangeSecurities.securities) &&
        Objects.equals(this.stockExchange, apiResponseStockExchangeSecurities.stockExchange) &&
        Objects.equals(this.nextPage, apiResponseStockExchangeSecurities.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securities, stockExchange, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseStockExchangeSecurities {\n");
    
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
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

