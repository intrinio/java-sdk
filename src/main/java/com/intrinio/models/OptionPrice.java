

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

public class OptionPrice {
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

  @SerializedName("volume_bid")
  private Integer volumeBid = null;

  @SerializedName("volume_ask")
  private Integer volumeAsk = null;

  @SerializedName("trades")
  private Integer trades = null;

  @SerializedName("open_interest")
  private Integer openInterest = null;

  @SerializedName("open_interest_change")
  private Integer openInterestChange = null;

  @SerializedName("next_day_open_interest")
  private Integer nextDayOpenInterest = null;

  @SerializedName("implied_volatility")
  private BigDecimal impliedVolatility = null;

  @SerializedName("implied_volatility_change")
  private BigDecimal impliedVolatilityChange = null;

  @SerializedName("delta")
  private BigDecimal delta = null;

  public OptionPrice date(String date) {
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

  public OptionPrice close(BigDecimal close) {
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

  public OptionPrice closeBid(BigDecimal closeBid) {
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

  public OptionPrice closeAsk(BigDecimal closeAsk) {
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

  public OptionPrice volume(Integer volume) {
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

  public OptionPrice volumeBid(Integer volumeBid) {
    this.volumeBid = volumeBid;
    return this;
  }

   /**
   * The cumulative volume of this options contract that traded on the bid price that day.
   * @return volumeBid
  **/
  @ApiModelProperty(value = "The cumulative volume of this options contract that traded on the bid price that day.")
  public Integer getVolumeBid() {
    return volumeBid;
  }

  public void setVolumeBid(Integer volumeBid) {
    this.volumeBid = volumeBid;
  }

  public OptionPrice volumeAsk(Integer volumeAsk) {
    this.volumeAsk = volumeAsk;
    return this;
  }

   /**
   * The cumulative volume of this options contract that traded on the ask price that day.
   * @return volumeAsk
  **/
  @ApiModelProperty(value = "The cumulative volume of this options contract that traded on the ask price that day.")
  public Integer getVolumeAsk() {
    return volumeAsk;
  }

  public void setVolumeAsk(Integer volumeAsk) {
    this.volumeAsk = volumeAsk;
  }

  public OptionPrice trades(Integer trades) {
    this.trades = trades;
    return this;
  }

   /**
   * The number of trades executed that for this options contract on that day.
   * @return trades
  **/
  @ApiModelProperty(value = "The number of trades executed that for this options contract on that day.")
  public Integer getTrades() {
    return trades;
  }

  public void setTrades(Integer trades) {
    this.trades = trades;
  }

  public OptionPrice openInterest(Integer openInterest) {
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

  public OptionPrice openInterestChange(Integer openInterestChange) {
    this.openInterestChange = openInterestChange;
    return this;
  }

   /**
   * The change in the total number of this options contract that are still open from the previous day.
   * @return openInterestChange
  **/
  @ApiModelProperty(value = "The change in the total number of this options contract that are still open from the previous day.")
  public Integer getOpenInterestChange() {
    return openInterestChange;
  }

  public void setOpenInterestChange(Integer openInterestChange) {
    this.openInterestChange = openInterestChange;
  }

  public OptionPrice nextDayOpenInterest(Integer nextDayOpenInterest) {
    this.nextDayOpenInterest = nextDayOpenInterest;
    return this;
  }

   /**
   * The total number of this options contract that are still open at the start of the next day.
   * @return nextDayOpenInterest
  **/
  @ApiModelProperty(value = "The total number of this options contract that are still open at the start of the next day.")
  public Integer getNextDayOpenInterest() {
    return nextDayOpenInterest;
  }

  public void setNextDayOpenInterest(Integer nextDayOpenInterest) {
    this.nextDayOpenInterest = nextDayOpenInterest;
  }

  public OptionPrice impliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * The estimated volatility of the Security&#39;s price. Volatility is a statistical measure of dispersion of returns for the Security. Standard deviation of a Security&#39;s returns and a market index is an example of a measurement of volatility. Implied volatility approximates the future value of an option, and the option&#39;s current value takes this into consideration.
   * @return impliedVolatility
  **/
  @ApiModelProperty(value = "The estimated volatility of the Security's price. Volatility is a statistical measure of dispersion of returns for the Security. Standard deviation of a Security's returns and a market index is an example of a measurement of volatility. Implied volatility approximates the future value of an option, and the option's current value takes this into consideration.")
  public BigDecimal getImpliedVolatility() {
    return impliedVolatility;
  }

  public void setImpliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }

  public OptionPrice impliedVolatilityChange(BigDecimal impliedVolatilityChange) {
    this.impliedVolatilityChange = impliedVolatilityChange;
    return this;
  }

   /**
   * The change in implied volatility for that day.
   * @return impliedVolatilityChange
  **/
  @ApiModelProperty(value = "The change in implied volatility for that day.")
  public BigDecimal getImpliedVolatilityChange() {
    return impliedVolatilityChange;
  }

  public void setImpliedVolatilityChange(BigDecimal impliedVolatilityChange) {
    this.impliedVolatilityChange = impliedVolatilityChange;
  }

  public OptionPrice delta(BigDecimal delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Delta measures the degree to which an options contract is exposed to shifts in the price of the underlying Security. Values of delta range from 0.0 to 1.0 for call options and -1.0 to 0.0 for put options. For example, if a put option has a delta of -0.50, if the price of the underlying Security increases by $1, the price of the put option will decrease by $0.50.
   * @return delta
  **/
  @ApiModelProperty(value = "Delta measures the degree to which an options contract is exposed to shifts in the price of the underlying Security. Values of delta range from 0.0 to 1.0 for call options and -1.0 to 0.0 for put options. For example, if a put option has a delta of -0.50, if the price of the underlying Security increases by $1, the price of the put option will decrease by $0.50.")
  public BigDecimal getDelta() {
    return delta;
  }

  public void setDelta(BigDecimal delta) {
    this.delta = delta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionPrice optionPrice = (OptionPrice) o;
    return Objects.equals(this.date, optionPrice.date) &&
        Objects.equals(this.close, optionPrice.close) &&
        Objects.equals(this.closeBid, optionPrice.closeBid) &&
        Objects.equals(this.closeAsk, optionPrice.closeAsk) &&
        Objects.equals(this.volume, optionPrice.volume) &&
        Objects.equals(this.volumeBid, optionPrice.volumeBid) &&
        Objects.equals(this.volumeAsk, optionPrice.volumeAsk) &&
        Objects.equals(this.trades, optionPrice.trades) &&
        Objects.equals(this.openInterest, optionPrice.openInterest) &&
        Objects.equals(this.openInterestChange, optionPrice.openInterestChange) &&
        Objects.equals(this.nextDayOpenInterest, optionPrice.nextDayOpenInterest) &&
        Objects.equals(this.impliedVolatility, optionPrice.impliedVolatility) &&
        Objects.equals(this.impliedVolatilityChange, optionPrice.impliedVolatilityChange) &&
        Objects.equals(this.delta, optionPrice.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, close, closeBid, closeAsk, volume, volumeBid, volumeAsk, trades, openInterest, openInterestChange, nextDayOpenInterest, impliedVolatility, impliedVolatilityChange, delta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionPrice {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    closeBid: ").append(toIndentedString(closeBid)).append("\n");
    sb.append("    closeAsk: ").append(toIndentedString(closeAsk)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volumeBid: ").append(toIndentedString(volumeBid)).append("\n");
    sb.append("    volumeAsk: ").append(toIndentedString(volumeAsk)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    openInterestChange: ").append(toIndentedString(openInterestChange)).append("\n");
    sb.append("    nextDayOpenInterest: ").append(toIndentedString(nextDayOpenInterest)).append("\n");
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    impliedVolatilityChange: ").append(toIndentedString(impliedVolatilityChange)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

