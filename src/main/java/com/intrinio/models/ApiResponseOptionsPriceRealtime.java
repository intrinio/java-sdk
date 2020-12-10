

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionPriceRealtime;
import com.intrinio.models.OptionRealtime;
import com.intrinio.models.OptionStatsRealtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiResponseOptionsPriceRealtime
 */

public class ApiResponseOptionsPriceRealtime {
  @SerializedName("price")
  private OptionPriceRealtime price = null;

  @SerializedName("stats")
  private OptionStatsRealtime stats = null;

  @SerializedName("option")
  private OptionRealtime option = null;

  public ApiResponseOptionsPriceRealtime price(OptionPriceRealtime price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public OptionPriceRealtime getPrice() {
    return price;
  }

  public void setPrice(OptionPriceRealtime price) {
    this.price = price;
  }

  public ApiResponseOptionsPriceRealtime stats(OptionStatsRealtime stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public OptionStatsRealtime getStats() {
    return stats;
  }

  public void setStats(OptionStatsRealtime stats) {
    this.stats = stats;
  }

  public ApiResponseOptionsPriceRealtime option(OptionRealtime option) {
    this.option = option;
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public OptionRealtime getOption() {
    return option;
  }

  public void setOption(OptionRealtime option) {
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
    ApiResponseOptionsPriceRealtime apiResponseOptionsPriceRealtime = (ApiResponseOptionsPriceRealtime) o;
    return Objects.equals(this.price, apiResponseOptionsPriceRealtime.price) &&
        Objects.equals(this.stats, apiResponseOptionsPriceRealtime.stats) &&
        Objects.equals(this.option, apiResponseOptionsPriceRealtime.option);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, stats, option);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseOptionsPriceRealtime {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

