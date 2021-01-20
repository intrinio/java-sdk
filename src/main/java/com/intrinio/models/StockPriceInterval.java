

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
import org.threeten.bp.OffsetDateTime;

/**
 * Open, High, Low, Close, and Volume for a particular interval
 */
@ApiModel(description = "Open, High, Low, Close, and Volume for a particular interval")

public class StockPriceInterval {
  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("open")
  private BigDecimal open = null;

  @SerializedName("close")
  private BigDecimal close = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("volume")
  private BigDecimal volume = null;

  public StockPriceInterval time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * The timestamp that the &#x60;last_price&#x60; represents.
   * @return time
  **/
  @ApiModelProperty(value = "The timestamp that the `last_price` represents.")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public StockPriceInterval open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * The price at the beginning of the period
   * @return open
  **/
  @ApiModelProperty(value = "The price at the beginning of the period")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public StockPriceInterval close(BigDecimal close) {
    this.close = close;
    return this;
  }

   /**
   * The price at the end of the period
   * @return close
  **/
  @ApiModelProperty(value = "The price at the end of the period")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public StockPriceInterval high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The highest price over the span of the period
   * @return high
  **/
  @ApiModelProperty(value = "The highest price over the span of the period")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public StockPriceInterval low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The lowest price over the span of the period
   * @return low
  **/
  @ApiModelProperty(value = "The lowest price over the span of the period")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public StockPriceInterval volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The number of shares exchanged during the period
   * @return volume
  **/
  @ApiModelProperty(value = "The number of shares exchanged during the period")
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
    StockPriceInterval stockPriceInterval = (StockPriceInterval) o;
    return Objects.equals(this.time, stockPriceInterval.time) &&
        Objects.equals(this.open, stockPriceInterval.open) &&
        Objects.equals(this.close, stockPriceInterval.close) &&
        Objects.equals(this.high, stockPriceInterval.high) &&
        Objects.equals(this.low, stockPriceInterval.low) &&
        Objects.equals(this.volume, stockPriceInterval.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, open, close, high, low, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockPriceInterval {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
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

