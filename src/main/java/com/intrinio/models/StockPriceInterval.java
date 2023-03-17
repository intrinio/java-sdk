

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
        Objects.equals(this.change, stockPriceInterval.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, open, close, high, low, volume, closeTime, interval, average, change);
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

