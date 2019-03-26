

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * All the BAR prices, time, and volume for the given Crypto Currency Pair on the given Crypto Exchange.
 */
@ApiModel(description = "All the BAR prices, time, and volume for the given Crypto Currency Pair on the given Crypto Exchange.")

public class CryptoPrice {
  @SerializedName("time")
  private String time = null;

  @SerializedName("open")
  private BigDecimal open = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("close")
  private BigDecimal close = null;

  @SerializedName("volume")
  private BigDecimal volume = null;

  public CryptoPrice time(String time) {
    this.time = time;
    return this;
  }

   /**
   * The date and time of the beginning of the timeframe (in UTC). The open prices would be at this time, while close prices would be at this time plus the timeframe.
   * @return time
  **/
  @ApiModelProperty(value = "The date and time of the beginning of the timeframe (in UTC). The open prices would be at this time, while close prices would be at this time plus the timeframe.")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public CryptoPrice open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * The opening price of the timeframe.
   * @return open
  **/
  @ApiModelProperty(value = "The opening price of the timeframe.")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public CryptoPrice high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The high price of the timeframe.
   * @return high
  **/
  @ApiModelProperty(value = "The high price of the timeframe.")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public CryptoPrice low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The low price of the timeframe.
   * @return low
  **/
  @ApiModelProperty(value = "The low price of the timeframe.")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public CryptoPrice close(BigDecimal close) {
    this.close = close;
    return this;
  }

   /**
   * The closing price of the timeframe.
   * @return close
  **/
  @ApiModelProperty(value = "The closing price of the timeframe.")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public CryptoPrice volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The volume during the timeframe.
   * @return volume
  **/
  @ApiModelProperty(value = "The volume during the timeframe.")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoPrice cryptoPrice = (CryptoPrice) o;
    return Objects.equals(this.time, cryptoPrice.time) &&
        Objects.equals(this.open, cryptoPrice.open) &&
        Objects.equals(this.high, cryptoPrice.high) &&
        Objects.equals(this.low, cryptoPrice.low) &&
        Objects.equals(this.close, cryptoPrice.close) &&
        Objects.equals(this.volume, cryptoPrice.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, open, high, low, close, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoPrice {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

