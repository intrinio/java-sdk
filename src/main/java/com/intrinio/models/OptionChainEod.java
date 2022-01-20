

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

/**
 * An realtime option chain contains an options contract and corresponding price data for that contract on a given date.
 */
@ApiModel(description = "An realtime option chain contains an options contract and corresponding price data for that contract on a given date.")

public class OptionChainEod {
  @SerializedName("option")
  private OptionEod option = null;

  @SerializedName("prices")
  private OptionPriceEod prices = null;

  public OptionChainEod option(OptionEod option) {
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

  public OptionChainEod prices(OptionPriceEod prices) {
    this.prices = prices;
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @ApiModelProperty(value = "")
  public OptionPriceEod getPrices() {
    return prices;
  }

  public void setPrices(OptionPriceEod prices) {
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
    OptionChainEod optionChainEod = (OptionChainEod) o;
    return Objects.equals(this.option, optionChainEod.option) &&
        Objects.equals(this.prices, optionChainEod.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, prices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChainEod {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

