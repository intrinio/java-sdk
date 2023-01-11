

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
 * An options interval data point.
 */
@ApiModel(description = "An options interval data point.")

public class OptionInterval {
  @SerializedName("open_time")
  private OffsetDateTime openTime = null;

  @SerializedName("close_time")
  private OffsetDateTime closeTime = null;

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

  @SerializedName("change")
  private BigDecimal change = null;

  public OptionInterval openTime(OffsetDateTime openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * The UTC timestamp for the time this interval opened.
   * @return openTime
  **/
  @ApiModelProperty(value = "The UTC timestamp for the time this interval opened.")
  public OffsetDateTime getOpenTime() {
    return openTime;
  }

  public void setOpenTime(OffsetDateTime openTime) {
    this.openTime = openTime;
  }

  public OptionInterval closeTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * The UTC timestamp for the time this interval closed.
   * @return closeTime
  **/
  @ApiModelProperty(value = "The UTC timestamp for the time this interval closed.")
  public OffsetDateTime getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
  }

  public OptionInterval open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * The first traded contract price in this interval.
   * @return open
  **/
  @ApiModelProperty(value = "The first traded contract price in this interval.")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public OptionInterval high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The highest traded contract price in this interval.
   * @return high
  **/
  @ApiModelProperty(value = "The highest traded contract price in this interval.")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public OptionInterval low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The lowest traded contract price in this interval.
   * @return low
  **/
  @ApiModelProperty(value = "The lowest traded contract price in this interval.")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public OptionInterval close(BigDecimal close) {
    this.close = close;
    return this;
  }

   /**
   * The last traded contract price in this interval.
   * @return close
  **/
  @ApiModelProperty(value = "The last traded contract price in this interval.")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public OptionInterval volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The volume of contract trades in this interval.
   * @return volume
  **/
  @ApiModelProperty(value = "The volume of contract trades in this interval.")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public OptionInterval average(BigDecimal average) {
    this.average = average;
    return this;
  }

   /**
   * The volume weighted average price of contract trades in this interval.
   * @return average
  **/
  @ApiModelProperty(value = "The volume weighted average price of contract trades in this interval.")
  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }

  public OptionInterval change(BigDecimal change) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionInterval optionInterval = (OptionInterval) o;
    return Objects.equals(this.openTime, optionInterval.openTime) &&
        Objects.equals(this.closeTime, optionInterval.closeTime) &&
        Objects.equals(this.open, optionInterval.open) &&
        Objects.equals(this.high, optionInterval.high) &&
        Objects.equals(this.low, optionInterval.low) &&
        Objects.equals(this.close, optionInterval.close) &&
        Objects.equals(this.volume, optionInterval.volume) &&
        Objects.equals(this.average, optionInterval.average) &&
        Objects.equals(this.change, optionInterval.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openTime, closeTime, open, high, low, close, volume, average, change);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionInterval {\n");
    
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

