

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * The stock price of a security on a given date.
 */
@ApiModel(description = "The stock price of a security on a given date.")

public class StockPrice {
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

  @SerializedName("factor")
  private BigDecimal factor = null;

  @SerializedName("split_ratio")
  private BigDecimal splitRatio = null;

  @SerializedName("dividend")
  private BigDecimal dividend = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("percent_change")
  private BigDecimal percentChange = null;

  @SerializedName("fifty_two_week_high")
  private BigDecimal fiftyTwoWeekHigh = null;

  @SerializedName("fifty_two_week_low")
  private BigDecimal fiftyTwoWeekLow = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  public StockPrice date(LocalDate date) {
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

  public StockPrice intraperiod(Boolean intraperiod) {
    this.intraperiod = intraperiod;
    return this;
  }

   /**
   * If true, the stock price represents an unfinished period (be it day, week, quarter, month, or year), meaning that the close price is the latest price available, not the official close price for the period
   * @return intraperiod
  **/
  @ApiModelProperty(value = "If true, the stock price represents an unfinished period (be it day, week, quarter, month, or year), meaning that the close price is the latest price available, not the official close price for the period")
  public Boolean isIntraperiod() {
    return intraperiod;
  }

  public void setIntraperiod(Boolean intraperiod) {
    this.intraperiod = intraperiod;
  }

  public StockPrice frequency(FrequencyEnum frequency) {
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

  public StockPrice open(BigDecimal open) {
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

  public StockPrice high(BigDecimal high) {
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

  public StockPrice low(BigDecimal low) {
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

  public StockPrice close(BigDecimal close) {
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

  public StockPrice volume(BigDecimal volume) {
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

  public StockPrice adjOpen(BigDecimal adjOpen) {
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

  public StockPrice adjHigh(BigDecimal adjHigh) {
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

  public StockPrice adjLow(BigDecimal adjLow) {
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

  public StockPrice adjClose(BigDecimal adjClose) {
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

  public StockPrice adjVolume(BigDecimal adjVolume) {
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

  public StockPrice factor(BigDecimal factor) {
    this.factor = factor;
    return this;
  }

   /**
   * The factor by which to multiply stock prices before this date, in order to calculate historically-adjusted stock prices.
   * @return factor
  **/
  @ApiModelProperty(value = "The factor by which to multiply stock prices before this date, in order to calculate historically-adjusted stock prices.")
  public BigDecimal getFactor() {
    return factor;
  }

  public void setFactor(BigDecimal factor) {
    this.factor = factor;
  }

  public StockPrice splitRatio(BigDecimal splitRatio) {
    this.splitRatio = splitRatio;
    return this;
  }

   /**
   * The ratio of the stock split, if a stock split occurred.
   * @return splitRatio
  **/
  @ApiModelProperty(value = "The ratio of the stock split, if a stock split occurred.")
  public BigDecimal getSplitRatio() {
    return splitRatio;
  }

  public void setSplitRatio(BigDecimal splitRatio) {
    this.splitRatio = splitRatio;
  }

  public StockPrice dividend(BigDecimal dividend) {
    this.dividend = dividend;
    return this;
  }

   /**
   * The dividend amount, if a dividend was paid.
   * @return dividend
  **/
  @ApiModelProperty(value = "The dividend amount, if a dividend was paid.")
  public BigDecimal getDividend() {
    return dividend;
  }

  public void setDividend(BigDecimal dividend) {
    this.dividend = dividend;
  }

  public StockPrice change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * The difference in price from the last price for this frequency
   * @return change
  **/
  @ApiModelProperty(value = "The difference in price from the last price for this frequency")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public StockPrice percentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
    return this;
  }

   /**
   * The percent difference in price from the last price for this frequency
   * @return percentChange
  **/
  @ApiModelProperty(value = "The percent difference in price from the last price for this frequency")
  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public void setPercentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
  }

  public StockPrice fiftyTwoWeekHigh(BigDecimal fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    return this;
  }

   /**
   * The 52 week high price (daily only)
   * @return fiftyTwoWeekHigh
  **/
  @ApiModelProperty(value = "The 52 week high price (daily only)")
  public BigDecimal getFiftyTwoWeekHigh() {
    return fiftyTwoWeekHigh;
  }

  public void setFiftyTwoWeekHigh(BigDecimal fiftyTwoWeekHigh) {
    this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
  }

  public StockPrice fiftyTwoWeekLow(BigDecimal fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    return this;
  }

   /**
   * The 52 week low price (daily only)
   * @return fiftyTwoWeekLow
  **/
  @ApiModelProperty(value = "The 52 week low price (daily only)")
  public BigDecimal getFiftyTwoWeekLow() {
    return fiftyTwoWeekLow;
  }

  public void setFiftyTwoWeekLow(BigDecimal fiftyTwoWeekLow) {
    this.fiftyTwoWeekLow = fiftyTwoWeekLow;
  }

  public StockPrice security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security of the stock price
   * @return security
  **/
  @ApiModelProperty(value = "The Security of the stock price")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockPrice stockPrice = (StockPrice) o;
    return Objects.equals(this.date, stockPrice.date) &&
        Objects.equals(this.intraperiod, stockPrice.intraperiod) &&
        Objects.equals(this.frequency, stockPrice.frequency) &&
        Objects.equals(this.open, stockPrice.open) &&
        Objects.equals(this.high, stockPrice.high) &&
        Objects.equals(this.low, stockPrice.low) &&
        Objects.equals(this.close, stockPrice.close) &&
        Objects.equals(this.volume, stockPrice.volume) &&
        Objects.equals(this.adjOpen, stockPrice.adjOpen) &&
        Objects.equals(this.adjHigh, stockPrice.adjHigh) &&
        Objects.equals(this.adjLow, stockPrice.adjLow) &&
        Objects.equals(this.adjClose, stockPrice.adjClose) &&
        Objects.equals(this.adjVolume, stockPrice.adjVolume) &&
        Objects.equals(this.factor, stockPrice.factor) &&
        Objects.equals(this.splitRatio, stockPrice.splitRatio) &&
        Objects.equals(this.dividend, stockPrice.dividend) &&
        Objects.equals(this.change, stockPrice.change) &&
        Objects.equals(this.percentChange, stockPrice.percentChange) &&
        Objects.equals(this.fiftyTwoWeekHigh, stockPrice.fiftyTwoWeekHigh) &&
        Objects.equals(this.fiftyTwoWeekLow, stockPrice.fiftyTwoWeekLow) &&
        Objects.equals(this.security, stockPrice.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, intraperiod, frequency, open, high, low, close, volume, adjOpen, adjHigh, adjLow, adjClose, adjVolume, factor, splitRatio, dividend, change, percentChange, fiftyTwoWeekHigh, fiftyTwoWeekLow, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockPrice {\n");
    
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
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    splitRatio: ").append(toIndentedString(splitRatio)).append("\n");
    sb.append("    dividend: ").append(toIndentedString(dividend)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
    sb.append("    fiftyTwoWeekHigh: ").append(toIndentedString(fiftyTwoWeekHigh)).append("\n");
    sb.append("    fiftyTwoWeekLow: ").append(toIndentedString(fiftyTwoWeekLow)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

