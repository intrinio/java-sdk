

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionEod;
import com.intrinio.models.OptionPriceEod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiResponseOptionsPricesEod
 */

public class ApiResponseOptionsPricesEod {
  @SerializedName("prices")
  private List<OptionPriceEod> prices = null;

  @SerializedName("option")
  private OptionEod option = null;

  public ApiResponseOptionsPricesEod prices(List<OptionPriceEod> prices) {
    this.prices = prices;
    return this;
  }

  public ApiResponseOptionsPricesEod addPricesItem(OptionPriceEod pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * A list of options prices with the given symbol
   * @return prices
  **/
  @ApiModelProperty(value = "A list of options prices with the given symbol")
  public List<OptionPriceEod> getPrices() {
    return prices;
  }

  public void setPrices(List<OptionPriceEod> prices) {
    this.prices = prices;
  }

  public ApiResponseOptionsPricesEod option(OptionEod option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public OptionEod getOption() {
    return option;
  }

  public void setOption(OptionEod option) {
    this.option = option;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseOptionsPricesEod apiResponseOptionsPricesEod = (ApiResponseOptionsPricesEod) o;
    return Objects.equals(this.prices, apiResponseOptionsPricesEod.prices) &&
        Objects.equals(this.option, apiResponseOptionsPricesEod.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, option);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsPricesEod {\n");
    
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

