

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ForexPair;
import com.intrinio.models.ForexPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseForexPrices
 */

public class ApiResponseForexPrices {
  @SerializedName("prices")
  private List<ForexPrice> prices = null;

  @SerializedName("pair")
  private ForexPair pair = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseForexPrices prices(List<ForexPrice> prices) {
    this.prices = prices;
    return this;
  }

  public ApiResponseForexPrices addPricesItem(ForexPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<ForexPrice>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @ApiModelProperty(value = "")
  public List<ForexPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<ForexPrice> prices) {
    this.prices = prices;
  }

  public ApiResponseForexPrices pair(ForexPair pair) {
    this.pair = pair;
    return this;
  }

   /**
   * The Forex currency pair for which prices were requested
   * @return pair
  **/
  @ApiModelProperty(value = "The Forex currency pair for which prices were requested")
  public ForexPair getPair() {
    return pair;
  }

  public void setPair(ForexPair pair) {
    this.pair = pair;
  }

  public ApiResponseForexPrices nextPage(String nextPage) {
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
    ApiResponseForexPrices apiResponseForexPrices = (ApiResponseForexPrices) o;
    return Objects.equals(this.prices, apiResponseForexPrices.prices) &&
        Objects.equals(this.pair, apiResponseForexPrices.pair) &&
        Objects.equals(this.nextPage, apiResponseForexPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, pair, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseForexPrices {\n");
    
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
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

