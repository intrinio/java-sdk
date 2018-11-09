

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
import org.threeten.bp.LocalDate;

/**
 * The summary of a stock price for a security on a given date.
 */
@ApiModel(description = "The summary of a stock price for a security on a given date.")

public class StockPriceSummary {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("intraperiod")
  private Boolean intraperiod = null;

  /**
   * The type of period that the stock price represents
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    YEARLY("yearly");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String text) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("frequency")
  private FrequencyEnum frequency = null;

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

  @SerializedName("adj_open")
  private BigDecimal adjOpen = null;

  @SerializedName("adj_high")
  private BigDecimal adjHigh = null;

  @SerializedName("adj_low")
  private BigDecimal adjLow = null;

  @SerializedName("adj_close")
  private BigDecimal adjClose = null;

  @SerializedName("adj_volume")
  private BigDecimal adjVolume = null;

  public StockPriceSummary date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The calendar date that the stock price represents. For non-daily stock prices, this represents the last day in the period (end of the week, month, quarter, year, etc)
   * @return date
  **/
  @ApiModelProperty(value = "The calendar date that the stock price represents. For non-daily stock prices, this represents the last day in the period (end of the week, month, quarter, year, etc)")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public StockPriceSummary intraperiod(Boolean intraperiod) {
    this.intraperiod = intraperiod;
    return this;
  }

   /**
   * If true, the stock price represents an unfinished period (be it day, week, quarter, month, or year), meaning that the close price is the latest price available, not the official close price for the period
   * @return intraperiod
  **/
  @ApiModelProperty(value = "If true, the stock price represents an unfinished period (be it day, week, quarter, month, or year), meaning that the close price is the latest price available, not the official close price for the period")
  public Boolean isisIntraperiod() {
    return intraperiod;
  }

  public void setIntraperiod(Boolean intraperiod) {
    this.intraperiod = intraperiod;
  }

  public StockPriceSummary frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * The type of period that the stock price represents
   * @return frequency
  **/
  @ApiModelProperty(value = "The type of period that the stock price represents")
  public FrequencyEnum getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }

  public StockPriceSummary open(BigDecimal open) {
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

  public StockPriceSummary high(BigDecimal high) {
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

  public StockPriceSummary low(BigDecimal low) {
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

  public StockPriceSummary close(BigDecimal close) {
    this.close = close;
    return this;
  }

   /**
   * The price at the end of the period
   * @return close
  **/
  @ApiModelProperty(value = "The price at the end of the period")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public StockPriceSummary volume(BigDecimal volume) {
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

  public StockPriceSummary adjOpen(BigDecimal adjOpen) {
    this.adjOpen = adjOpen;
    return this;
  }

   /**
   * The price at the beginning of the period, adjusted for splits and dividends
   * @return adjOpen
  **/
  @ApiModelProperty(value = "The price at the beginning of the period, adjusted for splits and dividends")
  public BigDecimal getAdjOpen() {
    return adjOpen;
  }

  public void setAdjOpen(BigDecimal adjOpen) {
    this.adjOpen = adjOpen;
  }

  public StockPriceSummary adjHigh(BigDecimal adjHigh) {
    this.adjHigh = adjHigh;
    return this;
  }

   /**
   * The highest price over the span of the period, adjusted for splits and dividends
   * @return adjHigh
  **/
  @ApiModelProperty(value = "The highest price over the span of the period, adjusted for splits and dividends")
  public BigDecimal getAdjHigh() {
    return adjHigh;
  }

  public void setAdjHigh(BigDecimal adjHigh) {
    this.adjHigh = adjHigh;
  }

  public StockPriceSummary adjLow(BigDecimal adjLow) {
    this.adjLow = adjLow;
    return this;
  }

   /**
   * The lowest price over the span of the period, adjusted for splits and dividends
   * @return adjLow
  **/
  @ApiModelProperty(value = "The lowest price over the span of the period, adjusted for splits and dividends")
  public BigDecimal getAdjLow() {
    return adjLow;
  }

  public void setAdjLow(BigDecimal adjLow) {
    this.adjLow = adjLow;
  }

  public StockPriceSummary adjClose(BigDecimal adjClose) {
    this.adjClose = adjClose;
    return this;
  }

   /**
   * The price at the end of the period, adjusted for splits and dividends
   * @return adjClose
  **/
  @ApiModelProperty(value = "The price at the end of the period, adjusted for splits and dividends")
  public BigDecimal getAdjClose() {
    return adjClose;
  }

  public void setAdjClose(BigDecimal adjClose) {
    this.adjClose = adjClose;
  }

  public StockPriceSummary adjVolume(BigDecimal adjVolume) {
    this.adjVolume = adjVolume;
    return this;
  }

   /**
   * The number of shares exchanged during the period, adjusted for splits and dividends
   * @return adjVolume
  **/
  @ApiModelProperty(value = "The number of shares exchanged during the period, adjusted for splits and dividends")
  public BigDecimal getAdjVolume() {
    return adjVolume;
  }

  public void setAdjVolume(BigDecimal adjVolume) {
    this.adjVolume = adjVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockPriceSummary stockPriceSummary = (StockPriceSummary) o;
    return Objects.equals(this.date, stockPriceSummary.date) &&
        Objects.equals(this.intraperiod, stockPriceSummary.intraperiod) &&
        Objects.equals(this.frequency, stockPriceSummary.frequency) &&
        Objects.equals(this.open, stockPriceSummary.open) &&
        Objects.equals(this.high, stockPriceSummary.high) &&
        Objects.equals(this.low, stockPriceSummary.low) &&
        Objects.equals(this.close, stockPriceSummary.close) &&
        Objects.equals(this.volume, stockPriceSummary.volume) &&
        Objects.equals(this.adjOpen, stockPriceSummary.adjOpen) &&
        Objects.equals(this.adjHigh, stockPriceSummary.adjHigh) &&
        Objects.equals(this.adjLow, stockPriceSummary.adjLow) &&
        Objects.equals(this.adjClose, stockPriceSummary.adjClose) &&
        Objects.equals(this.adjVolume, stockPriceSummary.adjVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, intraperiod, frequency, open, high, low, close, volume, adjOpen, adjHigh, adjLow, adjClose, adjVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockPriceSummary {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    intraperiod: ").append(toIndentedString(intraperiod)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    adjOpen: ").append(toIndentedString(adjOpen)).append("\n");
    sb.append("    adjHigh: ").append(toIndentedString(adjHigh)).append("\n");
    sb.append("    adjLow: ").append(toIndentedString(adjLow)).append("\n");
    sb.append("    adjClose: ").append(toIndentedString(adjClose)).append("\n");
    sb.append("    adjVolume: ").append(toIndentedString(adjVolume)).append("\n");
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

