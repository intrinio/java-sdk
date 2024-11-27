

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
 * An options interval data point.
 */
@ApiModel(description = "An options interval data point.")

public class OptionIntervalMover {
  @SerializedName("contract")
  private String contract = null;

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

  @SerializedName("trade_count")
  private BigDecimal tradeCount = null;

  public OptionIntervalMover contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The option contract for the intervals
   * @return contract
  **/
  @ApiModelProperty(value = "The option contract for the intervals")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public OptionIntervalMover change(BigDecimal change) {
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

  public OptionIntervalMover open(BigDecimal open) {
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

  public OptionIntervalMover high(BigDecimal high) {
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

  public OptionIntervalMover low(BigDecimal low) {
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

  public OptionIntervalMover close(BigDecimal close) {
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

  public OptionIntervalMover volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The volume of contracts traded in this interval.
   * @return volume
  **/
  @ApiModelProperty(value = "The volume of contracts traded in this interval.")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public OptionIntervalMover average(BigDecimal average) {
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

  public OptionIntervalMover tradeCount(BigDecimal tradeCount) {
    this.tradeCount = tradeCount;
    return this;
  }

   /**
   * The number of contract trades executed in this interval
   * @return tradeCount
  **/
  @ApiModelProperty(value = "The number of contract trades executed in this interval")
  public BigDecimal getTradeCount() {
    return tradeCount;
  }

  public void setTradeCount(BigDecimal tradeCount) {
    this.tradeCount = tradeCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionIntervalMover optionIntervalMover = (OptionIntervalMover) o;
    return Objects.equals(this.contract, optionIntervalMover.contract) &&
        Objects.equals(this.change, optionIntervalMover.change) &&
        Objects.equals(this.open, optionIntervalMover.open) &&
        Objects.equals(this.high, optionIntervalMover.high) &&
        Objects.equals(this.low, optionIntervalMover.low) &&
        Objects.equals(this.close, optionIntervalMover.close) &&
        Objects.equals(this.volume, optionIntervalMover.volume) &&
        Objects.equals(this.average, optionIntervalMover.average) &&
        Objects.equals(this.tradeCount, optionIntervalMover.tradeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, change, open, high, low, close, volume, average, tradeCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionIntervalMover {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    tradeCount: ").append(toIndentedString(tradeCount)).append("\n");
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

