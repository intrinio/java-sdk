

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.StockPriceSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityStockPrices
 */

public class ApiResponseSecurityStockPrices {
  @SerializedName("stock_prices")
  private List<StockPriceSummary> stockPrices = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityStockPrices stockPrices(List<StockPriceSummary> stockPrices) {
    this.stockPrices = stockPrices;
    return this;
  }

  public ApiResponseSecurityStockPrices addStockPricesItem(StockPriceSummary stockPricesItem) {
    if (this.stockPrices == null) {
      this.stockPrices = new ArrayList<StockPriceSummary>();
    }
    this.stockPrices.add(stockPricesItem);
    return this;
  }

   /**
   * The stock prices for the Security
   * @return stockPrices
  **/
  @ApiModelProperty(value = "The stock prices for the Security")
  public List<StockPriceSummary> getStockPrices() {
    return stockPrices;
  }

  public void setStockPrices(List<StockPriceSummary> stockPrices) {
    this.stockPrices = stockPrices;
  }

  public ApiResponseSecurityStockPrices security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security resolved from the given identifier
   * @return security
  **/
  @ApiModelProperty(value = "The Security resolved from the given identifier")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }

  public ApiResponseSecurityStockPrices nextPage(String nextPage) {
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
    ApiResponseSecurityStockPrices apiResponseSecurityStockPrices = (ApiResponseSecurityStockPrices) o;
    return Objects.equals(this.stockPrices, apiResponseSecurityStockPrices.stockPrices) &&
        Objects.equals(this.security, apiResponseSecurityStockPrices.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityStockPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockPrices, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityStockPrices {\n");
    
    sb.append("    stockPrices: ").append(toIndentedString(stockPrices)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

