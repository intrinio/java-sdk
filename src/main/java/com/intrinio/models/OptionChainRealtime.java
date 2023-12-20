

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.OptionPriceRealtime;
import com.intrinio.models.OptionPriceRealtimeExtended;
import com.intrinio.models.OptionRealtime;
import com.intrinio.models.OptionStatsRealtime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An realtime option chain contains an options contract and corresponding price data for that contract on a given date.
 */
@ApiModel(description = "An realtime option chain contains an options contract and corresponding price data for that contract on a given date.")

public class OptionChainRealtime {
  @SerializedName("option")
  private OptionRealtime option = null;

  @SerializedName("price")
  private OptionPriceRealtime price = null;

  @SerializedName("stats")
  private OptionStatsRealtime stats = null;

  @SerializedName("extended_price")
  private OptionPriceRealtimeExtended extendedPrice = null;

  public OptionChainRealtime option(OptionRealtime option) {
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

  public OptionChainRealtime price(OptionPriceRealtime price) {
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

  public OptionChainRealtime stats(OptionStatsRealtime stats) {
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

  public OptionChainRealtime extendedPrice(OptionPriceRealtimeExtended extendedPrice) {
    this.extendedPrice = extendedPrice;
    return this;
  }

   /**
   * Get extendedPrice
   * @return extendedPrice
  **/
  @ApiModelProperty(value = "")
  public OptionPriceRealtimeExtended getExtendedPrice() {
    return extendedPrice;
  }

  public void setExtendedPrice(OptionPriceRealtimeExtended extendedPrice) {
    this.extendedPrice = extendedPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionChainRealtime optionChainRealtime = (OptionChainRealtime) o;
    return Objects.equals(this.option, optionChainRealtime.option) &&
        Objects.equals(this.price, optionChainRealtime.price) &&
        Objects.equals(this.stats, optionChainRealtime.stats) &&
        Objects.equals(this.extendedPrice, optionChainRealtime.extendedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, price, stats, extendedPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChainRealtime {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    extendedPrice: ").append(toIndentedString(extendedPrice)).append("\n");
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

