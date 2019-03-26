

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

/**
 * An option chain contains an options contract and corresponding price data for that contract on a given date.
 */
@ApiModel(description = "An option chain contains an options contract and corresponding price data for that contract on a given date.")

public class OptionChain {
  @SerializedName("option")
  private Option option = null;

  @SerializedName("price")
  private OptionPrice price = null;

  public OptionChain option(Option option) {
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

  public OptionChain price(OptionPrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public OptionPrice getPrice() {
    return price;
  }

  public void setPrice(OptionPrice price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionChain optionChain = (OptionChain) o;
    return Objects.equals(this.option, optionChain.option) &&
        Objects.equals(this.price, optionChain.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChain {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

