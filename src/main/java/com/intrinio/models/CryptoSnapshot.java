

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
 * A snapshot is a point in time look at the given Crypto Currency Pair on the given Crypto Currency Exchange. The snapshot includes information from the last 24 hours such as bid price, bid size, ask price, ask size, notional change in price, percent change in price, volume, open price, high price, low price, and details of the last trade (price, time, size, and side).
 */
@ApiModel(description = "A snapshot is a point in time look at the given Crypto Currency Pair on the given Crypto Currency Exchange. The snapshot includes information from the last 24 hours such as bid price, bid size, ask price, ask size, notional change in price, percent change in price, volume, open price, high price, low price, and details of the last trade (price, time, size, and side).")

public class CryptoSnapshot {
  @SerializedName("last_updated")
  private String lastUpdated = null;

  @SerializedName("bid")
  private BigDecimal bid = null;

  @SerializedName("bid_size")
  private BigDecimal bidSize = null;

  @SerializedName("ask")
  private BigDecimal ask = null;

  @SerializedName("ask_size")
  private BigDecimal askSize = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("change_percent")
  private BigDecimal changePercent = null;

  @SerializedName("volume")
  private BigDecimal volume = null;

  @SerializedName("open")
  private BigDecimal open = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("last_trade_side")
  private String lastTradeSide = null;

  @SerializedName("last_trade_time")
  private String lastTradeTime = null;

  @SerializedName("last_trade_price")
  private BigDecimal lastTradePrice = null;

  @SerializedName("last_trade_size")
  private BigDecimal lastTradeSize = null;

  public CryptoSnapshot lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * UTC timestamp of when the snapshot was last updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "UTC timestamp of when the snapshot was last updated.")
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public CryptoSnapshot bid(BigDecimal bid) {
    this.bid = bid;
    return this;
  }

   /**
   * The bid for the Crypto Currency Pair on the exchange.
   * @return bid
  **/
  @ApiModelProperty(value = "The bid for the Crypto Currency Pair on the exchange.")
  public BigDecimal getBid() {
    return bid;
  }

  public void setBid(BigDecimal bid) {
    this.bid = bid;
  }

  public CryptoSnapshot bidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
    return this;
  }

   /**
   * The size of the bid for the Crypto Currency Pair on the exchange.
   * @return bidSize
  **/
  @ApiModelProperty(value = "The size of the bid for the Crypto Currency Pair on the exchange.")
  public BigDecimal getBidSize() {
    return bidSize;
  }

  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  public CryptoSnapshot ask(BigDecimal ask) {
    this.ask = ask;
    return this;
  }

   /**
   * The ask for the Crypto Currency Pair on the exchange.
   * @return ask
  **/
  @ApiModelProperty(value = "The ask for the Crypto Currency Pair on the exchange.")
  public BigDecimal getAsk() {
    return ask;
  }

  public void setAsk(BigDecimal ask) {
    this.ask = ask;
  }

  public CryptoSnapshot askSize(BigDecimal askSize) {
    this.askSize = askSize;
    return this;
  }

   /**
   * The size of the ask for the Crypto Currency Pair on the exchange.
   * @return askSize
  **/
  @ApiModelProperty(value = "The size of the ask for the Crypto Currency Pair on the exchange.")
  public BigDecimal getAskSize() {
    return askSize;
  }

  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
  }

  public CryptoSnapshot change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * The notional change in price over the last 24 hours.
   * @return change
  **/
  @ApiModelProperty(value = "The notional change in price over the last 24 hours.")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public CryptoSnapshot changePercent(BigDecimal changePercent) {
    this.changePercent = changePercent;
    return this;
  }

   /**
   * The percent change in price over the last 24 hours.
   * @return changePercent
  **/
  @ApiModelProperty(value = "The percent change in price over the last 24 hours.")
  public BigDecimal getChangePercent() {
    return changePercent;
  }

  public void setChangePercent(BigDecimal changePercent) {
    this.changePercent = changePercent;
  }

  public CryptoSnapshot volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The volume of the Crypto Currency Pair on the exchange.
   * @return volume
  **/
  @ApiModelProperty(value = "The volume of the Crypto Currency Pair on the exchange.")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public CryptoSnapshot open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * The opening price of the currency on the exchange.
   * @return open
  **/
  @ApiModelProperty(value = "The opening price of the currency on the exchange.")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public CryptoSnapshot high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The highest price of the currency on the exchange for the last 24 hours.
   * @return high
  **/
  @ApiModelProperty(value = "The highest price of the currency on the exchange for the last 24 hours.")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public CryptoSnapshot low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The lowest price of the currency on the exchange for the last 24 hours.
   * @return low
  **/
  @ApiModelProperty(value = "The lowest price of the currency on the exchange for the last 24 hours.")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public CryptoSnapshot lastTradeSide(String lastTradeSide) {
    this.lastTradeSide = lastTradeSide;
    return this;
  }

   /**
   * The side of the last trade, either buy or sell.
   * @return lastTradeSide
  **/
  @ApiModelProperty(value = "The side of the last trade, either buy or sell.")
  public String getLastTradeSide() {
    return lastTradeSide;
  }

  public void setLastTradeSide(String lastTradeSide) {
    this.lastTradeSide = lastTradeSide;
  }

  public CryptoSnapshot lastTradeTime(String lastTradeTime) {
    this.lastTradeTime = lastTradeTime;
    return this;
  }

   /**
   * UTC timestamp of the last trade for the Crypto Currency Pair on the exchange.
   * @return lastTradeTime
  **/
  @ApiModelProperty(value = "UTC timestamp of the last trade for the Crypto Currency Pair on the exchange.")
  public String getLastTradeTime() {
    return lastTradeTime;
  }

  public void setLastTradeTime(String lastTradeTime) {
    this.lastTradeTime = lastTradeTime;
  }

  public CryptoSnapshot lastTradePrice(BigDecimal lastTradePrice) {
    this.lastTradePrice = lastTradePrice;
    return this;
  }

   /**
   * The price of the last trade for the Crypto Currency Pair on the exchange.
   * @return lastTradePrice
  **/
  @ApiModelProperty(value = "The price of the last trade for the Crypto Currency Pair on the exchange.")
  public BigDecimal getLastTradePrice() {
    return lastTradePrice;
  }

  public void setLastTradePrice(BigDecimal lastTradePrice) {
    this.lastTradePrice = lastTradePrice;
  }

  public CryptoSnapshot lastTradeSize(BigDecimal lastTradeSize) {
    this.lastTradeSize = lastTradeSize;
    return this;
  }

   /**
   * The size of the last trade for the Crypto Currency Pair on the exchange.
   * @return lastTradeSize
  **/
  @ApiModelProperty(value = "The size of the last trade for the Crypto Currency Pair on the exchange.")
  public BigDecimal getLastTradeSize() {
    return lastTradeSize;
  }

  public void setLastTradeSize(BigDecimal lastTradeSize) {
    this.lastTradeSize = lastTradeSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoSnapshot cryptoSnapshot = (CryptoSnapshot) o;
    return Objects.equals(this.lastUpdated, cryptoSnapshot.lastUpdated) &&
        Objects.equals(this.bid, cryptoSnapshot.bid) &&
        Objects.equals(this.bidSize, cryptoSnapshot.bidSize) &&
        Objects.equals(this.ask, cryptoSnapshot.ask) &&
        Objects.equals(this.askSize, cryptoSnapshot.askSize) &&
        Objects.equals(this.change, cryptoSnapshot.change) &&
        Objects.equals(this.changePercent, cryptoSnapshot.changePercent) &&
        Objects.equals(this.volume, cryptoSnapshot.volume) &&
        Objects.equals(this.open, cryptoSnapshot.open) &&
        Objects.equals(this.high, cryptoSnapshot.high) &&
        Objects.equals(this.low, cryptoSnapshot.low) &&
        Objects.equals(this.lastTradeSide, cryptoSnapshot.lastTradeSide) &&
        Objects.equals(this.lastTradeTime, cryptoSnapshot.lastTradeTime) &&
        Objects.equals(this.lastTradePrice, cryptoSnapshot.lastTradePrice) &&
        Objects.equals(this.lastTradeSize, cryptoSnapshot.lastTradeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, bid, bidSize, ask, askSize, change, changePercent, volume, open, high, low, lastTradeSide, lastTradeTime, lastTradePrice, lastTradeSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoSnapshot {\n");
    
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    changePercent: ").append(toIndentedString(changePercent)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    lastTradeSide: ").append(toIndentedString(lastTradeSide)).append("\n");
    sb.append("    lastTradeTime: ").append(toIndentedString(lastTradeTime)).append("\n");
    sb.append("    lastTradePrice: ").append(toIndentedString(lastTradePrice)).append("\n");
    sb.append("    lastTradeSize: ").append(toIndentedString(lastTradeSize)).append("\n");
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

