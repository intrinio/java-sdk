

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
 * An intraday stock price for a Security.
 */
@ApiModel(description = "An intraday stock price for a Security.")

public class IntradayStockPrice {
  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("last_price")
  private BigDecimal lastPrice = null;

  @SerializedName("ask_price")
  private BigDecimal askPrice = null;

  @SerializedName("ask_size")
  private BigDecimal askSize = null;

  @SerializedName("bid_price")
  private BigDecimal bidPrice = null;

  @SerializedName("bid_size")
  private BigDecimal bidSize = null;

  @SerializedName("volume")
  private BigDecimal volume = null;

  @SerializedName("source")
  private String source = null;

  public IntradayStockPrice time(OffsetDateTime time) {
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

  public IntradayStockPrice lastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * The price of the last trade.
   * @return lastPrice
  **/
  @ApiModelProperty(value = "The price of the last trade.")
  public BigDecimal getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(BigDecimal lastPrice) {
    this.lastPrice = lastPrice;
  }

  public IntradayStockPrice askPrice(BigDecimal askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * The price of the top ask order.
   * @return askPrice
  **/
  @ApiModelProperty(value = "The price of the top ask order.")
  public BigDecimal getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(BigDecimal askPrice) {
    this.askPrice = askPrice;
  }

  public IntradayStockPrice askSize(BigDecimal askSize) {
    this.askSize = askSize;
    return this;
  }

   /**
   * The size of the top ask order.
   * @return askSize
  **/
  @ApiModelProperty(value = "The size of the top ask order.")
  public BigDecimal getAskSize() {
    return askSize;
  }

  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
  }

  public IntradayStockPrice bidPrice(BigDecimal bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * The price of the top bid order.
   * @return bidPrice
  **/
  @ApiModelProperty(value = "The price of the top bid order.")
  public BigDecimal getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(BigDecimal bidPrice) {
    this.bidPrice = bidPrice;
  }

  public IntradayStockPrice bidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
    return this;
  }

   /**
   * The size of the top bid order.
   * @return bidSize
  **/
  @ApiModelProperty(value = "The size of the top bid order.")
  public BigDecimal getBidSize() {
    return bidSize;
  }

  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  public IntradayStockPrice volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * The number of shares exchanged during the trading day on the exchange.
   * @return volume
  **/
  @ApiModelProperty(value = "The number of shares exchanged during the trading day on the exchange.")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public IntradayStockPrice source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the data.
   * @return source
  **/
  @ApiModelProperty(value = "The source of the data.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayStockPrice intradayStockPrice = (IntradayStockPrice) o;
    return Objects.equals(this.time, intradayStockPrice.time) &&
        Objects.equals(this.lastPrice, intradayStockPrice.lastPrice) &&
        Objects.equals(this.askPrice, intradayStockPrice.askPrice) &&
        Objects.equals(this.askSize, intradayStockPrice.askSize) &&
        Objects.equals(this.bidPrice, intradayStockPrice.bidPrice) &&
        Objects.equals(this.bidSize, intradayStockPrice.bidSize) &&
        Objects.equals(this.volume, intradayStockPrice.volume) &&
        Objects.equals(this.source, intradayStockPrice.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, lastPrice, askPrice, askSize, bidPrice, bidSize, volume, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayStockPrice {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

