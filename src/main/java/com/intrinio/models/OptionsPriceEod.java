

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
 * OptionsPriceEod
 */

public class OptionsPriceEod {
  @SerializedName("price")
  private OptionPriceEod price = null;

  @SerializedName("option")
  private OptionEod option = null;

  public OptionsPriceEod price(OptionPriceEod price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public OptionPriceEod getPrice() {
    return price;
  }

  public void setPrice(OptionPriceEod price) {
    this.price = price;
  }

  public OptionsPriceEod option(OptionEod option) {
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
    OptionsPriceEod optionsPriceEod = (OptionsPriceEod) o;
    return Objects.equals(this.price, optionsPriceEod.price) &&
        Objects.equals(this.option, optionsPriceEod.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, option);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsPriceEod {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

