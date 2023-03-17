

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
 * A security interval data point.
 */
@ApiModel(description = "A security interval data point.")

public class SecurityIntervalMover {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("change")
  private BigDecimal change = null;

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

  @SerializedName("average")
  private BigDecimal average = null;

  public SecurityIntervalMover symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The ticker symbol for the interval
   * @return symbol
  **/
  @ApiModelProperty(value = "The ticker symbol for the interval")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public SecurityIntervalMover change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * The ratio of Close minus Open to Open.
   * @return change
  **/
  @ApiModelProperty(value = "The ratio of Close minus Open to Open.")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public SecurityIntervalMover open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * The first traded price in this interval.
   * @return open
  **/
  @ApiModelProperty(value = "The first traded price in this interval.")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public SecurityIntervalMover high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The highest traded price in this interval.
   * @return high
  **/
  @ApiModelProperty(value = "The highest traded price in this interval.")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public SecurityIntervalMover low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The lowest traded price in this interval.
   * @return low
  **/
  @ApiModelProperty(value = "The lowest traded price in this interval.")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public SecurityIntervalMover close(BigDecimal close) {
    this.close = close;
    return this;
  }

   /**
   * The last traded price in this interval.
   * @return close
  **/
  @ApiModelProperty(value = "The last traded price in this interval.")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public SecurityIntervalMover volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The volume of trades in this interval.
   * @return volume
  **/
  @ApiModelProperty(value = "The volume of trades in this interval.")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public SecurityIntervalMover average(BigDecimal average) {
    this.average = average;
    return this;
  }

   /**
   * The volume weighted average price of trades in this interval.
   * @return average
  **/
  @ApiModelProperty(value = "The volume weighted average price of trades in this interval.")
  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityIntervalMover securityIntervalMover = (SecurityIntervalMover) o;
    return Objects.equals(this.symbol, securityIntervalMover.symbol) &&
        Objects.equals(this.change, securityIntervalMover.change) &&
        Objects.equals(this.open, securityIntervalMover.open) &&
        Objects.equals(this.high, securityIntervalMover.high) &&
        Objects.equals(this.low, securityIntervalMover.low) &&
        Objects.equals(this.close, securityIntervalMover.close) &&
        Objects.equals(this.volume, securityIntervalMover.volume) &&
        Objects.equals(this.average, securityIntervalMover.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, change, open, high, low, close, volume, average);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityIntervalMover {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

