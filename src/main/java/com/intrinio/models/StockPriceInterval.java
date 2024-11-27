

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
 * Open, close, high, low, volume, average price, and change ratio for a particular interval
 */
@ApiModel(description = "Open, close, high, low, volume, average price, and change ratio for a particular interval")

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

  @SerializedName("close_time")
  private OffsetDateTime closeTime = null;

  /**
   * The size of the interval.
   */
  @JsonAdapter(IntervalEnum.Adapter.class)
  public enum IntervalEnum {
    SIXTYMINUTE("SixtyMinute"),
    
    THIRTYMINUTE("ThirtyMinute"),
    
    FIFTEENMINUTE("FifteenMinute"),
    
    TENMINUTE("TenMinute"),
    
    FIVEMINUTE("FiveMinute"),
    
    ONEMINUTE("OneMinute");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IntervalEnum fromValue(String text) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("interval")
  private IntervalEnum interval = null;

  @SerializedName("average")
  private BigDecimal average = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("bid_high")
  private BigDecimal bidHigh = null;

  @SerializedName("bid_low")
  private BigDecimal bidLow = null;

  @SerializedName("bid_close")
  private BigDecimal bidClose = null;

  @SerializedName("bid_open")
  private BigDecimal bidOpen = null;

  @SerializedName("bid_first_time")
  private OffsetDateTime bidFirstTime = null;

  @SerializedName("bid_last_time")
  private OffsetDateTime bidLastTime = null;

  @SerializedName("bid_change_percent")
  private BigDecimal bidChangePercent = null;

  @SerializedName("ask_high")
  private BigDecimal askHigh = null;

  @SerializedName("ask_low")
  private BigDecimal askLow = null;

  @SerializedName("ask_close")
  private BigDecimal askClose = null;

  @SerializedName("ask_open")
  private BigDecimal askOpen = null;

  @SerializedName("ask_first_time")
  private OffsetDateTime askFirstTime = null;

  @SerializedName("ask_last_time")
  private OffsetDateTime askLastTime = null;

  @SerializedName("ask_change_percent")
  private BigDecimal askChangePercent = null;

  @SerializedName("trade_count")
  private BigDecimal tradeCount = null;

  public StockPriceInterval time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * The timestamp that represents the start of the interval span.
   * @return time
  **/
  @ApiModelProperty(value = "The timestamp that represents the start of the interval span.")
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
   * The first traded price during the period
   * @return open
  **/
  @ApiModelProperty(value = "The first traded price during the period")
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
   * The last traded price during the period
   * @return close
  **/
  @ApiModelProperty(value = "The last traded price during the period")
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

  public StockPriceInterval closeTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
    return this;
  }

   /**
   * The timestamp that represents the end of the interval span.
   * @return closeTime
  **/
  @ApiModelProperty(value = "The timestamp that represents the end of the interval span.")
  public OffsetDateTime getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(OffsetDateTime closeTime) {
    this.closeTime = closeTime;
  }

  public StockPriceInterval interval(IntervalEnum interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The size of the interval.
   * @return interval
  **/
  @ApiModelProperty(value = "The size of the interval.")
  public IntervalEnum getInterval() {
    return interval;
  }

  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }

  public StockPriceInterval average(BigDecimal average) {
    this.average = average;
    return this;
  }

   /**
   * The average trade price of an individual stock during the interval.
   * @return average
  **/
  @ApiModelProperty(value = "The average trade price of an individual stock during the interval.")
  public BigDecimal getAverage() {
    return average;
  }

  public void setAverage(BigDecimal average) {
    this.average = average;
  }

  public StockPriceInterval change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * The change ratio from open to close.  ((Close - Open)/Open).
   * @return change
  **/
  @ApiModelProperty(value = "The change ratio from open to close.  ((Close - Open)/Open).")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public StockPriceInterval bidHigh(BigDecimal bidHigh) {
    this.bidHigh = bidHigh;
    return this;
  }

   /**
   * The highest bid price from the interval.
   * @return bidHigh
  **/
  @ApiModelProperty(value = "The highest bid price from the interval.")
  public BigDecimal getBidHigh() {
    return bidHigh;
  }

  public void setBidHigh(BigDecimal bidHigh) {
    this.bidHigh = bidHigh;
  }

  public StockPriceInterval bidLow(BigDecimal bidLow) {
    this.bidLow = bidLow;
    return this;
  }

   /**
   * The lowest bid price from the interval.
   * @return bidLow
  **/
  @ApiModelProperty(value = "The lowest bid price from the interval.")
  public BigDecimal getBidLow() {
    return bidLow;
  }

  public void setBidLow(BigDecimal bidLow) {
    this.bidLow = bidLow;
  }

  public StockPriceInterval bidClose(BigDecimal bidClose) {
    this.bidClose = bidClose;
    return this;
  }

   /**
   * The last bid price from the interval.
   * @return bidClose
  **/
  @ApiModelProperty(value = "The last bid price from the interval.")
  public BigDecimal getBidClose() {
    return bidClose;
  }

  public void setBidClose(BigDecimal bidClose) {
    this.bidClose = bidClose;
  }

  public StockPriceInterval bidOpen(BigDecimal bidOpen) {
    this.bidOpen = bidOpen;
    return this;
  }

   /**
   * The first bid price from the interval.
   * @return bidOpen
  **/
  @ApiModelProperty(value = "The first bid price from the interval.")
  public BigDecimal getBidOpen() {
    return bidOpen;
  }

  public void setBidOpen(BigDecimal bidOpen) {
    this.bidOpen = bidOpen;
  }

  public StockPriceInterval bidFirstTime(OffsetDateTime bidFirstTime) {
    this.bidFirstTime = bidFirstTime;
    return this;
  }

   /**
   * The timestamp that represents the first bid time from the interval span.
   * @return bidFirstTime
  **/
  @ApiModelProperty(value = "The timestamp that represents the first bid time from the interval span.")
  public OffsetDateTime getBidFirstTime() {
    return bidFirstTime;
  }

  public void setBidFirstTime(OffsetDateTime bidFirstTime) {
    this.bidFirstTime = bidFirstTime;
  }

  public StockPriceInterval bidLastTime(OffsetDateTime bidLastTime) {
    this.bidLastTime = bidLastTime;
    return this;
  }

   /**
   * The timestamp that represents the last bid time from the interval span.
   * @return bidLastTime
  **/
  @ApiModelProperty(value = "The timestamp that represents the last bid time from the interval span.")
  public OffsetDateTime getBidLastTime() {
    return bidLastTime;
  }

  public void setBidLastTime(OffsetDateTime bidLastTime) {
    this.bidLastTime = bidLastTime;
  }

  public StockPriceInterval bidChangePercent(BigDecimal bidChangePercent) {
    this.bidChangePercent = bidChangePercent;
    return this;
  }

   /**
   * The ratio of the close to open bid difference, in percent.
   * @return bidChangePercent
  **/
  @ApiModelProperty(value = "The ratio of the close to open bid difference, in percent.")
  public BigDecimal getBidChangePercent() {
    return bidChangePercent;
  }

  public void setBidChangePercent(BigDecimal bidChangePercent) {
    this.bidChangePercent = bidChangePercent;
  }

  public StockPriceInterval askHigh(BigDecimal askHigh) {
    this.askHigh = askHigh;
    return this;
  }

   /**
   * The highest ask price from the interval.
   * @return askHigh
  **/
  @ApiModelProperty(value = "The highest ask price from the interval.")
  public BigDecimal getAskHigh() {
    return askHigh;
  }

  public void setAskHigh(BigDecimal askHigh) {
    this.askHigh = askHigh;
  }

  public StockPriceInterval askLow(BigDecimal askLow) {
    this.askLow = askLow;
    return this;
  }

   /**
   * The lowest ask price from the interval.
   * @return askLow
  **/
  @ApiModelProperty(value = "The lowest ask price from the interval.")
  public BigDecimal getAskLow() {
    return askLow;
  }

  public void setAskLow(BigDecimal askLow) {
    this.askLow = askLow;
  }

  public StockPriceInterval askClose(BigDecimal askClose) {
    this.askClose = askClose;
    return this;
  }

   /**
   * The last ask price from the interval.
   * @return askClose
  **/
  @ApiModelProperty(value = "The last ask price from the interval.")
  public BigDecimal getAskClose() {
    return askClose;
  }

  public void setAskClose(BigDecimal askClose) {
    this.askClose = askClose;
  }

  public StockPriceInterval askOpen(BigDecimal askOpen) {
    this.askOpen = askOpen;
    return this;
  }

   /**
   * The first ask price from the interval.
   * @return askOpen
  **/
  @ApiModelProperty(value = "The first ask price from the interval.")
  public BigDecimal getAskOpen() {
    return askOpen;
  }

  public void setAskOpen(BigDecimal askOpen) {
    this.askOpen = askOpen;
  }

  public StockPriceInterval askFirstTime(OffsetDateTime askFirstTime) {
    this.askFirstTime = askFirstTime;
    return this;
  }

   /**
   * The timestamp that represents the first ask time from the interval span.
   * @return askFirstTime
  **/
  @ApiModelProperty(value = "The timestamp that represents the first ask time from the interval span.")
  public OffsetDateTime getAskFirstTime() {
    return askFirstTime;
  }

  public void setAskFirstTime(OffsetDateTime askFirstTime) {
    this.askFirstTime = askFirstTime;
  }

  public StockPriceInterval askLastTime(OffsetDateTime askLastTime) {
    this.askLastTime = askLastTime;
    return this;
  }

   /**
   * The timestamp that represents the last ask time from the interval span.
   * @return askLastTime
  **/
  @ApiModelProperty(value = "The timestamp that represents the last ask time from the interval span.")
  public OffsetDateTime getAskLastTime() {
    return askLastTime;
  }

  public void setAskLastTime(OffsetDateTime askLastTime) {
    this.askLastTime = askLastTime;
  }

  public StockPriceInterval askChangePercent(BigDecimal askChangePercent) {
    this.askChangePercent = askChangePercent;
    return this;
  }

   /**
   * The ratio of the close to open ask difference, in percent.
   * @return askChangePercent
  **/
  @ApiModelProperty(value = "The ratio of the close to open ask difference, in percent.")
  public BigDecimal getAskChangePercent() {
    return askChangePercent;
  }

  public void setAskChangePercent(BigDecimal askChangePercent) {
    this.askChangePercent = askChangePercent;
  }

  public StockPriceInterval tradeCount(BigDecimal tradeCount) {
    this.tradeCount = tradeCount;
    return this;
  }

   /**
   * The number of qualified trades executed during the period
   * @return tradeCount
  **/
  @ApiModelProperty(value = "The number of qualified trades executed during the period")
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
    StockPriceInterval stockPriceInterval = (StockPriceInterval) o;
    return Objects.equals(this.time, stockPriceInterval.time) &&
        Objects.equals(this.open, stockPriceInterval.open) &&
        Objects.equals(this.close, stockPriceInterval.close) &&
        Objects.equals(this.high, stockPriceInterval.high) &&
        Objects.equals(this.low, stockPriceInterval.low) &&
        Objects.equals(this.volume, stockPriceInterval.volume) &&
        Objects.equals(this.closeTime, stockPriceInterval.closeTime) &&
        Objects.equals(this.interval, stockPriceInterval.interval) &&
        Objects.equals(this.average, stockPriceInterval.average) &&
        Objects.equals(this.change, stockPriceInterval.change) &&
        Objects.equals(this.bidHigh, stockPriceInterval.bidHigh) &&
        Objects.equals(this.bidLow, stockPriceInterval.bidLow) &&
        Objects.equals(this.bidClose, stockPriceInterval.bidClose) &&
        Objects.equals(this.bidOpen, stockPriceInterval.bidOpen) &&
        Objects.equals(this.bidFirstTime, stockPriceInterval.bidFirstTime) &&
        Objects.equals(this.bidLastTime, stockPriceInterval.bidLastTime) &&
        Objects.equals(this.bidChangePercent, stockPriceInterval.bidChangePercent) &&
        Objects.equals(this.askHigh, stockPriceInterval.askHigh) &&
        Objects.equals(this.askLow, stockPriceInterval.askLow) &&
        Objects.equals(this.askClose, stockPriceInterval.askClose) &&
        Objects.equals(this.askOpen, stockPriceInterval.askOpen) &&
        Objects.equals(this.askFirstTime, stockPriceInterval.askFirstTime) &&
        Objects.equals(this.askLastTime, stockPriceInterval.askLastTime) &&
        Objects.equals(this.askChangePercent, stockPriceInterval.askChangePercent) &&
        Objects.equals(this.tradeCount, stockPriceInterval.tradeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, open, close, high, low, volume, closeTime, interval, average, change, bidHigh, bidLow, bidClose, bidOpen, bidFirstTime, bidLastTime, bidChangePercent, askHigh, askLow, askClose, askOpen, askFirstTime, askLastTime, askChangePercent, tradeCount);
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
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    bidHigh: ").append(toIndentedString(bidHigh)).append("\n");
    sb.append("    bidLow: ").append(toIndentedString(bidLow)).append("\n");
    sb.append("    bidClose: ").append(toIndentedString(bidClose)).append("\n");
    sb.append("    bidOpen: ").append(toIndentedString(bidOpen)).append("\n");
    sb.append("    bidFirstTime: ").append(toIndentedString(bidFirstTime)).append("\n");
    sb.append("    bidLastTime: ").append(toIndentedString(bidLastTime)).append("\n");
    sb.append("    bidChangePercent: ").append(toIndentedString(bidChangePercent)).append("\n");
    sb.append("    askHigh: ").append(toIndentedString(askHigh)).append("\n");
    sb.append("    askLow: ").append(toIndentedString(askLow)).append("\n");
    sb.append("    askClose: ").append(toIndentedString(askClose)).append("\n");
    sb.append("    askOpen: ").append(toIndentedString(askOpen)).append("\n");
    sb.append("    askFirstTime: ").append(toIndentedString(askFirstTime)).append("\n");
    sb.append("    askLastTime: ").append(toIndentedString(askLastTime)).append("\n");
    sb.append("    askChangePercent: ").append(toIndentedString(askChangePercent)).append("\n");
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

