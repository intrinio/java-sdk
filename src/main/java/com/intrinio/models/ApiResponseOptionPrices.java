

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.Option;
import com.intrinio.models.OptionPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionPrices
 */

public class ApiResponseOptionPrices {
  @SerializedName("prices")
  private List<OptionPrice> prices = null;

  @SerializedName("option")
  private Option option = null;

  @SerializedName("next_page")
  private String nextPage = null;

  public ApiResponseOptionPrices prices(List<OptionPrice> prices) {
    this.prices = prices;
    return this;
  }

  public ApiResponseOptionPrices addPricesItem(OptionPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * A list of option prices in descending order by date
   * @return prices
  **/
  @ApiModelProperty(value = "A list of option prices in descending order by date")
  public List<OptionPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<OptionPrice> prices) {
    this.prices = prices;
  }

  public ApiResponseOptionPrices option(Option option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public Option getOption() {
    return option;
  }

  public void setOption(Option option) {
    this.option = option;
  }

  public ApiResponseOptionPrices nextPage(String nextPage) {
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
    ApiResponseOptionPrices apiResponseOptionPrices = (ApiResponseOptionPrices) o;
    return Objects.equals(this.prices, apiResponseOptionPrices.prices) &&
        Objects.equals(this.option, apiResponseOptionPrices.option) &&
        Objects.equals(this.nextPage, apiResponseOptionPrices.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, option, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionPrices {\n");
    
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

