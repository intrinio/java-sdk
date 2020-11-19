

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import com.intrinio.models.StockPriceAdjustmentSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseSecurityStockPriceAdjustments
 */

public class ApiResponseSecurityStockPriceAdjustments {
  @SerializedName("stock_price_adjustments")
  private List<StockPriceAdjustmentSummary> stockPriceAdjustments = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseSecurityStockPriceAdjustments stockPriceAdjustments(List<StockPriceAdjustmentSummary> stockPriceAdjustments) {
    this.stockPriceAdjustments = stockPriceAdjustments;
    return this;
  }

  public ApiResponseSecurityStockPriceAdjustments addStockPriceAdjustmentsItem(StockPriceAdjustmentSummary stockPriceAdjustmentsItem) {
    if (this.stockPriceAdjustments == null) {
      this.stockPriceAdjustments = new ArrayList<>();
    }
    this.stockPriceAdjustments.add(stockPriceAdjustmentsItem);
    return this;
  }

   /**
   * The stock price adjustments for the Security
   * @return stockPriceAdjustments
  **/
  @ApiModelProperty(value = "The stock price adjustments for the Security")
  public List<StockPriceAdjustmentSummary> getStockPriceAdjustments() {
    return stockPriceAdjustments;
  }

  public void setStockPriceAdjustments(List<StockPriceAdjustmentSummary> stockPriceAdjustments) {
    this.stockPriceAdjustments = stockPriceAdjustments;
  }

  public ApiResponseSecurityStockPriceAdjustments security(SecuritySummary security) {
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

  public ApiResponseSecurityStockPriceAdjustments nextPage(String nextPage) {
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
    ApiResponseSecurityStockPriceAdjustments apiResponseSecurityStockPriceAdjustments = (ApiResponseSecurityStockPriceAdjustments) o;
    return Objects.equals(this.stockPriceAdjustments, apiResponseSecurityStockPriceAdjustments.stockPriceAdjustments) &&
        Objects.equals(this.security, apiResponseSecurityStockPriceAdjustments.security) &&
        Objects.equals(this.nextPage, apiResponseSecurityStockPriceAdjustments.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockPriceAdjustments, security, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityStockPriceAdjustments {\n");
    
    sb.append("    stockPriceAdjustments: ").append(toIndentedString(stockPriceAdjustments)).append("\n");
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

