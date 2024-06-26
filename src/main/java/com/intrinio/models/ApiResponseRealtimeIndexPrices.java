

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.RealtimeIndexPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseRealtimeIndexPrices
 */

public class ApiResponseRealtimeIndexPrices {
  @SerializedName("prices")
  private List<RealtimeIndexPrice> prices = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseRealtimeIndexPrices prices(List<RealtimeIndexPrice> prices) {
    this.prices = prices;
    return this;
  }

  public ApiResponseRealtimeIndexPrices addPricesItem(RealtimeIndexPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @ApiModelProperty(value = "")
  public List<RealtimeIndexPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<RealtimeIndexPrice> prices) {
    this.prices = prices;
  }

  public ApiResponseRealtimeIndexPrices nextPage(String nextPage) {
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
    ApiResponseRealtimeIndexPrices apiResponseRealtimeIndexPrices = (ApiResponseRealtimeIndexPrices) o;
    return Objects.equals(this.prices, apiResponseRealtimeIndexPrices.prices) &&
        Objects.equals(this.nextPage, apiResponseRealtimeIndexPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseRealtimeIndexPrices {\n");
    
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

