

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
 * An extended option price contains extended price information for a specific options contract.
 */
@ApiModel(description = "An extended option price contains extended price information for a specific options contract.")

public class OptionPriceRealtimeExtended {
  @SerializedName("bid_open")
  private BigDecimal bidOpen = null;

  @SerializedName("bid_high")
  private BigDecimal bidHigh = null;

  @SerializedName("bid_low")
  private BigDecimal bidLow = null;

  @SerializedName("ask_open")
  private BigDecimal askOpen = null;

  @SerializedName("ask_high")
  private BigDecimal askHigh = null;

  @SerializedName("ask_low")
  private BigDecimal askLow = null;

  @SerializedName("trade_open")
  private BigDecimal tradeOpen = null;

  @SerializedName("trade_high")
  private BigDecimal tradeHigh = null;

  @SerializedName("trade_low")
  private BigDecimal tradeLow = null;

  @SerializedName("ask_close")
  private BigDecimal askClose = null;

  @SerializedName("bid_close")
  private BigDecimal bidClose = null;

  @SerializedName("trade_close")
  private BigDecimal tradeClose = null;

  @SerializedName("mark")
  private BigDecimal mark = null;

  public OptionPriceRealtimeExtended bidOpen(BigDecimal bidOpen) {
    this.bidOpen = bidOpen;
    return this;
  }

   /**
   * The price of the bid at open
   * @return bidOpen
  **/
  @ApiModelProperty(value = "The price of the bid at open")
  public BigDecimal getBidOpen() {
    return bidOpen;
  }

  public void setBidOpen(BigDecimal bidOpen) {
    this.bidOpen = bidOpen;
  }

  public OptionPriceRealtimeExtended bidHigh(BigDecimal bidHigh) {
    this.bidHigh = bidHigh;
    return this;
  }

   /**
   * The high bid so far today
   * @return bidHigh
  **/
  @ApiModelProperty(value = "The high bid so far today")
  public BigDecimal getBidHigh() {
    return bidHigh;
  }

  public void setBidHigh(BigDecimal bidHigh) {
    this.bidHigh = bidHigh;
  }

  public OptionPriceRealtimeExtended bidLow(BigDecimal bidLow) {
    this.bidLow = bidLow;
    return this;
  }

   /**
   * The low bid so far today
   * @return bidLow
  **/
  @ApiModelProperty(value = "The low bid so far today")
  public BigDecimal getBidLow() {
    return bidLow;
  }

  public void setBidLow(BigDecimal bidLow) {
    this.bidLow = bidLow;
  }

  public OptionPriceRealtimeExtended askOpen(BigDecimal askOpen) {
    this.askOpen = askOpen;
    return this;
  }

   /**
   * The price of the ask at open
   * @return askOpen
  **/
  @ApiModelProperty(value = "The price of the ask at open")
  public BigDecimal getAskOpen() {
    return askOpen;
  }

  public void setAskOpen(BigDecimal askOpen) {
    this.askOpen = askOpen;
  }

  public OptionPriceRealtimeExtended askHigh(BigDecimal askHigh) {
    this.askHigh = askHigh;
    return this;
  }

   /**
   * The high ask so far today
   * @return askHigh
  **/
  @ApiModelProperty(value = "The high ask so far today")
  public BigDecimal getAskHigh() {
    return askHigh;
  }

  public void setAskHigh(BigDecimal askHigh) {
    this.askHigh = askHigh;
  }

  public OptionPriceRealtimeExtended askLow(BigDecimal askLow) {
    this.askLow = askLow;
    return this;
  }

   /**
   * The low ask so far today
   * @return askLow
  **/
  @ApiModelProperty(value = "The low ask so far today")
  public BigDecimal getAskLow() {
    return askLow;
  }

  public void setAskLow(BigDecimal askLow) {
    this.askLow = askLow;
  }

  public OptionPriceRealtimeExtended tradeOpen(BigDecimal tradeOpen) {
    this.tradeOpen = tradeOpen;
    return this;
  }

   /**
   * The price of the trade at open
   * @return tradeOpen
  **/
  @ApiModelProperty(value = "The price of the trade at open")
  public BigDecimal getTradeOpen() {
    return tradeOpen;
  }

  public void setTradeOpen(BigDecimal tradeOpen) {
    this.tradeOpen = tradeOpen;
  }

  public OptionPriceRealtimeExtended tradeHigh(BigDecimal tradeHigh) {
    this.tradeHigh = tradeHigh;
    return this;
  }

   /**
   * The high trade so far today
   * @return tradeHigh
  **/
  @ApiModelProperty(value = "The high trade so far today")
  public BigDecimal getTradeHigh() {
    return tradeHigh;
  }

  public void setTradeHigh(BigDecimal tradeHigh) {
    this.tradeHigh = tradeHigh;
  }

  public OptionPriceRealtimeExtended tradeLow(BigDecimal tradeLow) {
    this.tradeLow = tradeLow;
    return this;
  }

   /**
   * The low trade so far today
   * @return tradeLow
  **/
  @ApiModelProperty(value = "The low trade so far today")
  public BigDecimal getTradeLow() {
    return tradeLow;
  }

  public void setTradeLow(BigDecimal tradeLow) {
    this.tradeLow = tradeLow;
  }

  public OptionPriceRealtimeExtended askClose(BigDecimal askClose) {
    this.askClose = askClose;
    return this;
  }

   /**
   * The price of ask at close today
   * @return askClose
  **/
  @ApiModelProperty(value = "The price of ask at close today")
  public BigDecimal getAskClose() {
    return askClose;
  }

  public void setAskClose(BigDecimal askClose) {
    this.askClose = askClose;
  }

  public OptionPriceRealtimeExtended bidClose(BigDecimal bidClose) {
    this.bidClose = bidClose;
    return this;
  }

   /**
   * The price of bid at close today
   * @return bidClose
  **/
  @ApiModelProperty(value = "The price of bid at close today")
  public BigDecimal getBidClose() {
    return bidClose;
  }

  public void setBidClose(BigDecimal bidClose) {
    this.bidClose = bidClose;
  }

  public OptionPriceRealtimeExtended tradeClose(BigDecimal tradeClose) {
    this.tradeClose = tradeClose;
    return this;
  }

   /**
   * The price of the last trade of the day
   * @return tradeClose
  **/
  @ApiModelProperty(value = "The price of the last trade of the day")
  public BigDecimal getTradeClose() {
    return tradeClose;
  }

  public void setTradeClose(BigDecimal tradeClose) {
    this.tradeClose = tradeClose;
  }

  public OptionPriceRealtimeExtended mark(BigDecimal mark) {
    this.mark = mark;
    return this;
  }

   /**
   * The mark price
   * @return mark
  **/
  @ApiModelProperty(value = "The mark price")
  public BigDecimal getMark() {
    return mark;
  }

  public void setMark(BigDecimal mark) {
    this.mark = mark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionPriceRealtimeExtended optionPriceRealtimeExtended = (OptionPriceRealtimeExtended) o;
    return Objects.equals(this.bidOpen, optionPriceRealtimeExtended.bidOpen) &&
        Objects.equals(this.bidHigh, optionPriceRealtimeExtended.bidHigh) &&
        Objects.equals(this.bidLow, optionPriceRealtimeExtended.bidLow) &&
        Objects.equals(this.askOpen, optionPriceRealtimeExtended.askOpen) &&
        Objects.equals(this.askHigh, optionPriceRealtimeExtended.askHigh) &&
        Objects.equals(this.askLow, optionPriceRealtimeExtended.askLow) &&
        Objects.equals(this.tradeOpen, optionPriceRealtimeExtended.tradeOpen) &&
        Objects.equals(this.tradeHigh, optionPriceRealtimeExtended.tradeHigh) &&
        Objects.equals(this.tradeLow, optionPriceRealtimeExtended.tradeLow) &&
        Objects.equals(this.askClose, optionPriceRealtimeExtended.askClose) &&
        Objects.equals(this.bidClose, optionPriceRealtimeExtended.bidClose) &&
        Objects.equals(this.tradeClose, optionPriceRealtimeExtended.tradeClose) &&
        Objects.equals(this.mark, optionPriceRealtimeExtended.mark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidOpen, bidHigh, bidLow, askOpen, askHigh, askLow, tradeOpen, tradeHigh, tradeLow, askClose, bidClose, tradeClose, mark);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionPriceRealtimeExtended {\n");
    
    sb.append("    bidOpen: ").append(toIndentedString(bidOpen)).append("\n");
    sb.append("    bidHigh: ").append(toIndentedString(bidHigh)).append("\n");
    sb.append("    bidLow: ").append(toIndentedString(bidLow)).append("\n");
    sb.append("    askOpen: ").append(toIndentedString(askOpen)).append("\n");
    sb.append("    askHigh: ").append(toIndentedString(askHigh)).append("\n");
    sb.append("    askLow: ").append(toIndentedString(askLow)).append("\n");
    sb.append("    tradeOpen: ").append(toIndentedString(tradeOpen)).append("\n");
    sb.append("    tradeHigh: ").append(toIndentedString(tradeHigh)).append("\n");
    sb.append("    tradeLow: ").append(toIndentedString(tradeLow)).append("\n");
    sb.append("    askClose: ").append(toIndentedString(askClose)).append("\n");
    sb.append("    bidClose: ").append(toIndentedString(bidClose)).append("\n");
    sb.append("    tradeClose: ").append(toIndentedString(tradeClose)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
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

