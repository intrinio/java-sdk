

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
  private BigDecimal bidLow = null;

  @SerializedName("implied_volatility")
  private BigDecimal impliedVolatility = null;

  @SerializedName("delta")
  private BigDecimal delta = null;

  @SerializedName("gamma")
  private BigDecimal gamma = null;

  @SerializedName("theta")
  private BigDecimal theta = null;

  @SerializedName("vega")
  private BigDecimal vega = null;

  @SerializedName("close_time")
  private OffsetDateTime closeTime = null;

  @SerializedName("close_size")
  private Integer closeSize = null;

  @SerializedName("close_bid_time")
  private OffsetDateTime closeBidTime = null;

  @SerializedName("close_bid_size")
  private Integer closeBidSize = null;

  @SerializedName("close_ask_time")
  private OffsetDateTime closeAskTime = null;

  @SerializedName("close_ask_size")
  private Integer closeAskSize = null;

  @SerializedName("exercise_style")
  private String exerciseStyle = null;

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

  public OptionPriceEod bidLow(BigDecimal bidLow) {
    this.bidLow = bidLow;
    return this;
  }

   /**
   * The lowest bid over the span of the period
   * @return bidLow
  **/
  @ApiModelProperty(value = "The lowest bid over the span of the period")
  public BigDecimal getBidLow() {
    return bidLow;
  }

  public void setBidLow(BigDecimal bidLow) {
    this.bidLow = bidLow;
  }

  public OptionPriceEod impliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * The implied volatility of the contract calculated using the Black-Scholes Model.
   * @return impliedVolatility
  **/
  @ApiModelProperty(value = "The implied volatility of the contract calculated using the Black-Scholes Model.")
  public BigDecimal getImpliedVolatility() {
    return impliedVolatility;
  }

  public void setImpliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }

  public OptionPriceEod delta(BigDecimal delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Delta represents the rate of change between the option&#39;s price and a $1 change in the underlying asset&#39;s price.
   * @return delta
  **/
  @ApiModelProperty(value = "Delta represents the rate of change between the option's price and a $1 change in the underlying asset's price.")
  public BigDecimal getDelta() {
    return delta;
  }

  public void setDelta(BigDecimal delta) {
    this.delta = delta;
  }

  public OptionPriceEod gamma(BigDecimal gamma) {
    this.gamma = gamma;
    return this;
  }

   /**
   * Gamma represents the rate of change between an option&#39;s delta and the underlying asset&#39;s price.
   * @return gamma
  **/
  @ApiModelProperty(value = "Gamma represents the rate of change between an option's delta and the underlying asset's price.")
  public BigDecimal getGamma() {
    return gamma;
  }

  public void setGamma(BigDecimal gamma) {
    this.gamma = gamma;
  }

  public OptionPriceEod theta(BigDecimal theta) {
    this.theta = theta;
    return this;
  }

   /**
   * Theta represents the rate of change between the option price and time, or time sensitivity - sometimes known as an option&#39;s time decay.
   * @return theta
  **/
  @ApiModelProperty(value = "Theta represents the rate of change between the option price and time, or time sensitivity - sometimes known as an option's time decay.")
  public BigDecimal getTheta() {
    return theta;
  }

  public void setTheta(BigDecimal theta) {
    this.theta = theta;
  }

  public OptionPriceEod vega(BigDecimal vega) {
    this.vega = vega;
    return this;
  }

   /**
   * Vega represents the rate of change between an option&#39;s value and the underlying asset&#39;s implied volatility.
   * @return vega
  **/
  @ApiModelProperty(value = "Vega represents the rate of change between an option's value and the underlying asset's implied volatility.")
  public BigDecimal getVega() {
    return vega;
  }

  public void setVega(BigDecimal vega) {
    this.vega = vega;
  }

  public OptionPriceEod closeTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * The time of the last trade before close.
   * @return closeTime
  **/
  @ApiModelProperty(value = "The time of the last trade before close.")
  public OffsetDateTime getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
  }

  public OptionPriceEod closeSize(Integer closeSize) {
    this.closeSize = closeSize;
    return this;
  }

   /**
   * The size of the last trade before close.
   * @return closeSize
  **/
  @ApiModelProperty(value = "The size of the last trade before close.")
  public Integer getCloseSize() {
    return closeSize;
  }

  public void setCloseSize(Integer closeSize) {
    this.closeSize = closeSize;
  }

  public OptionPriceEod closeBidTime(OffsetDateTime closeBidTime) {
    this.closeBidTime = closeBidTime;
    return this;
  }

   /**
   * The time of the last bid before close.
   * @return closeBidTime
  **/
  @ApiModelProperty(value = "The time of the last bid before close.")
  public OffsetDateTime getCloseBidTime() {
    return closeBidTime;
  }

  public void setCloseBidTime(OffsetDateTime closeBidTime) {
    this.closeBidTime = closeBidTime;
  }

  public OptionPriceEod closeBidSize(Integer closeBidSize) {
    this.closeBidSize = closeBidSize;
    return this;
  }

   /**
   * The size of the last bid before close.
   * @return closeBidSize
  **/
  @ApiModelProperty(value = "The size of the last bid before close.")
  public Integer getCloseBidSize() {
    return closeBidSize;
  }

  public void setCloseBidSize(Integer closeBidSize) {
    this.closeBidSize = closeBidSize;
  }

  public OptionPriceEod closeAskTime(OffsetDateTime closeAskTime) {
    this.closeAskTime = closeAskTime;
    return this;
  }

   /**
   * The time of the last ask before close.
   * @return closeAskTime
  **/
  @ApiModelProperty(value = "The time of the last ask before close.")
  public OffsetDateTime getCloseAskTime() {
    return closeAskTime;
  }

  public void setCloseAskTime(OffsetDateTime closeAskTime) {
    this.closeAskTime = closeAskTime;
  }

  public OptionPriceEod closeAskSize(Integer closeAskSize) {
    this.closeAskSize = closeAskSize;
    return this;
  }

   /**
   * The size of the last ask before close.
   * @return closeAskSize
  **/
  @ApiModelProperty(value = "The size of the last ask before close.")
  public Integer getCloseAskSize() {
    return closeAskSize;
  }

  public void setCloseAskSize(Integer closeAskSize) {
    this.closeAskSize = closeAskSize;
  }

  public OptionPriceEod exerciseStyle(String exerciseStyle) {
    this.exerciseStyle = exerciseStyle;
    return this;
  }

   /**
   * The exercise style.
   * @return exerciseStyle
  **/
  @ApiModelProperty(value = "The exercise style.")
  public String getExerciseStyle() {
    return exerciseStyle;
  }

  public void setExerciseStyle(String exerciseStyle) {
    this.exerciseStyle = exerciseStyle;
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
        Objects.equals(this.bidLow, optionPriceEod.bidLow) &&
        Objects.equals(this.impliedVolatility, optionPriceEod.impliedVolatility) &&
        Objects.equals(this.delta, optionPriceEod.delta) &&
        Objects.equals(this.gamma, optionPriceEod.gamma) &&
        Objects.equals(this.theta, optionPriceEod.theta) &&
        Objects.equals(this.vega, optionPriceEod.vega) &&
        Objects.equals(this.closeTime, optionPriceEod.closeTime) &&
        Objects.equals(this.closeSize, optionPriceEod.closeSize) &&
        Objects.equals(this.closeBidTime, optionPriceEod.closeBidTime) &&
        Objects.equals(this.closeBidSize, optionPriceEod.closeBidSize) &&
        Objects.equals(this.closeAskTime, optionPriceEod.closeAskTime) &&
        Objects.equals(this.closeAskSize, optionPriceEod.closeAskSize) &&
        Objects.equals(this.exerciseStyle, optionPriceEod.exerciseStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, close, closeBid, closeAsk, volume, open, openAsk, openBid, openInterest, high, low, mark, askHigh, askLow, bidHigh, bidLow, impliedVolatility, delta, gamma, theta, vega, closeTime, closeSize, closeBidTime, closeBidSize, closeAskTime, closeAskSize, exerciseStyle);
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
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
    sb.append("    theta: ").append(toIndentedString(theta)).append("\n");
    sb.append("    vega: ").append(toIndentedString(vega)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    closeSize: ").append(toIndentedString(closeSize)).append("\n");
    sb.append("    closeBidTime: ").append(toIndentedString(closeBidTime)).append("\n");
    sb.append("    closeBidSize: ").append(toIndentedString(closeBidSize)).append("\n");
    sb.append("    closeAskTime: ").append(toIndentedString(closeAskTime)).append("\n");
    sb.append("    closeAskSize: ").append(toIndentedString(closeAskSize)).append("\n");
    sb.append("    exerciseStyle: ").append(toIndentedString(exerciseStyle)).append("\n");
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

