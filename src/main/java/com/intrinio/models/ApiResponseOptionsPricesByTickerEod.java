

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionsPriceEod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsPricesByTickerEod
 */

public class ApiResponseOptionsPricesByTickerEod {
  @SerializedName("next_page")
  private String nextPage = null;

  @SerializedName("prices")
  private List<OptionsPriceEod> prices = null;

  public ApiResponseOptionsPricesByTickerEod nextPage(String nextPage) {
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

  public ApiResponseOptionsPricesByTickerEod prices(List<OptionsPriceEod> prices) {
    this.prices = prices;
    return this;
  }

  public ApiResponseOptionsPricesByTickerEod addPricesItem(OptionsPriceEod pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * The contracts pricing for this security.
   * @return prices
  **/
  @ApiModelProperty(value = "The contracts pricing for this security.")
  public List<OptionsPriceEod> getPrices() {
    return prices;
  }

  public void setPrices(List<OptionsPriceEod> prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsPricesByTickerEod apiResponseOptionsPricesByTickerEod = (ApiResponseOptionsPricesByTickerEod) o;
    return Objects.equals(this.nextPage, apiResponseOptionsPricesByTickerEod.nextPage) &&
        Objects.equals(this.prices, apiResponseOptionsPricesByTickerEod.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPage, prices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsPricesByTickerEod {\n");
    
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

