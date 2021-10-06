

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
 * An option price contains price information for a specific options contract.
 */
@ApiModel(description = "An option price contains price information for a specific options contract.")

public class OptionPriceEod {
  @SerializedName("date")
  private String date = null;

  @SerializedName("close")
  private BigDecimal close = null;

  @SerializedName("close_bid")
  private BigDecimal closeBid = null;

  @SerializedName("close_ask")
  private BigDecimal closeAsk = null;

  @SerializedName("volume")
  private Integer volume = null;

  @SerializedName("open")
  private BigDecimal open = null;

  @SerializedName("open_ask")
  private BigDecimal openAsk = null;

  @SerializedName("open_bid")
  private BigDecimal openBid = null;

  @SerializedName("open_interest")
  private Integer openInterest = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("mark")
  private BigDecimal mark = null;

  @SerializedName("ask_high")
  private BigDecimal askHigh = null;

  @SerializedName("ask_low")
  private BigDecimal askLow = null;

  @SerializedName("bid_high")
  private BigDecimal bidHigh = null;

  @SerializedName("bid_low")
  private Object bidLow = null;

  public OptionPriceEod date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the price, in the format YYYY-MM-DD
   * @return date
  **/
  @ApiModelProperty(value = "The date of the price, in the format YYYY-MM-DD")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OptionPriceEod close(BigDecimal close) {
    this.close = close;
    return this;
  }

   /**
   * The closing price of the options contract.
   * @return close
  **/
  @ApiModelProperty(value = "The closing price of the options contract.")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public OptionPriceEod closeBid(BigDecimal closeBid) {
    this.closeBid = closeBid;
    return this;
  }

   /**
   * The closing bid price of the options contract.
   * @return closeBid
  **/
  @ApiModelProperty(value = "The closing bid price of the options contract.")
  public BigDecimal getCloseBid() {
    return closeBid;
  }

  public void setCloseBid(BigDecimal closeBid) {
    this.closeBid = closeBid;
  }

  public OptionPriceEod closeAsk(BigDecimal closeAsk) {
    this.closeAsk = closeAsk;
    return this;
  }

   /**
   * The closing ask price of the options contract.
   * @return closeAsk
  **/
  @ApiModelProperty(value = "The closing ask price of the options contract.")
  public BigDecimal getCloseAsk() {
    return closeAsk;
  }

  public void setCloseAsk(BigDecimal closeAsk) {
    this.closeAsk = closeAsk;
  }

  public OptionPriceEod volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The cumulative volume of this options contract that traded that day.
   * @return volume
  **/
  @ApiModelProperty(value = "The cumulative volume of this options contract that traded that day.")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public OptionPriceEod open(BigDecimal open) {
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

  public OptionPriceEod openAsk(BigDecimal openAsk) {
    this.openAsk = openAsk;
    return this;
  }

   /**
   * The ask at the beginning of the period
   * @return openAsk
  **/
  @ApiModelProperty(value = "The ask at the beginning of the period")
  public BigDecimal getOpenAsk() {
    return openAsk;
  }

  public void setOpenAsk(BigDecimal openAsk) {
    this.openAsk = openAsk;
  }

  public OptionPriceEod openBid(BigDecimal openBid) {
    this.openBid = openBid;
    return this;
  }

   /**
   * The bid at the beginning of the period
   * @return openBid
  **/
  @ApiModelProperty(value = "The bid at the beginning of the period")
  public BigDecimal getOpenBid() {
    return openBid;
  }

  public void setOpenBid(BigDecimal openBid) {
    this.openBid = openBid;
  }

  public OptionPriceEod openInterest(Integer openInterest) {
    this.openInterest = openInterest;
    return this;
  }

   /**
   * The total number of this options contract that are still open.
   * @return openInterest
  **/
  @ApiModelProperty(value = "The total number of this options contract that are still open.")
  public Integer getOpenInterest() {
    return openInterest;
  }

  public void setOpenInterest(Integer openInterest) {
    this.openInterest = openInterest;
  }

  public OptionPriceEod high(BigDecimal high) {
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

  public OptionPriceEod low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The highest price over the span of the period
   * @return low
  **/
  @ApiModelProperty(value = "The highest price over the span of the period")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public OptionPriceEod mark(BigDecimal mark) {
    this.mark = mark;
    return this;
  }

   /**
   * The mid price between the latest bid and ask spread
   * @return mark
  **/
  @ApiModelProperty(value = "The mid price between the latest bid and ask spread")
  public BigDecimal getMark() {
    return mark;
  }

  public void setMark(BigDecimal mark) {
    this.mark = mark;
  }

  public OptionPriceEod askHigh(BigDecimal askHigh) {
    this.askHigh = askHigh;
    return this;
  }

   /**
   * The highest ask over the span of the period
   * @return askHigh
  **/
  @ApiModelProperty(value = "The highest ask over the span of the period")
  public BigDecimal getAskHigh() {
    return askHigh;
  }

  public void setAskHigh(BigDecimal askHigh) {
    this.askHigh = askHigh;
  }

  public OptionPriceEod askLow(BigDecimal askLow) {
    this.askLow = askLow;
    return this;
  }

   /**
   * The lowest ask over the span of the period
   * @return askLow
  **/
  @ApiModelProperty(value = "The lowest ask over the span of the period")
  public BigDecimal getAskLow() {
    return askLow;
  }

  public void setAskLow(BigDecimal askLow) {
    this.askLow = askLow;
  }

  public OptionPriceEod bidHigh(BigDecimal bidHigh) {
    this.bidHigh = bidHigh;
    return this;
  }

   /**
   * The highest bid over the span of the period
   * @return bidHigh
  **/
  @ApiModelProperty(value = "The highest bid over the span of the period")
  public BigDecimal getBidHigh() {
    return bidHigh;
  }

  public void setBidHigh(BigDecimal bidHigh) {
    this.bidHigh = bidHigh;
  }

  public OptionPriceEod bidLow(Object bidLow) {
    this.bidLow = bidLow;
    return this;
  }

   /**
   * The lowest bid over the span of the period
   * @return bidLow
  **/
  @ApiModelProperty(value = "The lowest bid over the span of the period")
  public Object getBidLow() {
    return bidLow;
  }

  public void setBidLow(Object bidLow) {
    this.bidLow = bidLow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionPriceEod optionPriceEod = (OptionPriceEod) o;
    return Objects.equals(this.date, optionPriceEod.date) &&
        Objects.equals(this.close, optionPriceEod.close) &&
        Objects.equals(this.closeBid, optionPriceEod.closeBid) &&
        Objects.equals(this.closeAsk, optionPriceEod.closeAsk) &&
        Objects.equals(this.volume, optionPriceEod.volume) &&
        Objects.equals(this.open, optionPriceEod.open) &&
        Objects.equals(this.openAsk, optionPriceEod.openAsk) &&
        Objects.equals(this.openBid, optionPriceEod.openBid) &&
        Objects.equals(this.openInterest, optionPriceEod.openInterest) &&
        Objects.equals(this.high, optionPriceEod.high) &&
        Objects.equals(this.low, optionPriceEod.low) &&
        Objects.equals(this.mark, optionPriceEod.mark) &&
        Objects.equals(this.askHigh, optionPriceEod.askHigh) &&
        Objects.equals(this.askLow, optionPriceEod.askLow) &&
        Objects.equals(this.bidHigh, optionPriceEod.bidHigh) &&
        Objects.equals(this.bidLow, optionPriceEod.bidLow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, close, closeBid, closeAsk, volume, open, openAsk, openBid, openInterest, high, low, mark, askHigh, askLow, bidHigh, bidLow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionPriceEod {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    closeBid: ").append(toIndentedString(closeBid)).append("\n");
    sb.append("    closeAsk: ").append(toIndentedString(closeAsk)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    openAsk: ").append(toIndentedString(openAsk)).append("\n");
    sb.append("    openBid: ").append(toIndentedString(openBid)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    askHigh: ").append(toIndentedString(askHigh)).append("\n");
    sb.append("    askLow: ").append(toIndentedString(askLow)).append("\n");
    sb.append("    bidHigh: ").append(toIndentedString(bidHigh)).append("\n");
    sb.append("    bidLow: ").append(toIndentedString(bidLow)).append("\n");
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

