

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
import org.threeten.bp.OffsetDateTime;

/**
 * A realtime price quote of a security.
 */
@ApiModel(description = "A realtime price quote of a security.")

public class ApiResponseSecurityQuote {
  @SerializedName("security")
  private SecuritySummary security = null;

  @SerializedName("last")
  private BigDecimal last = null;

  @SerializedName("last_time")
  private OffsetDateTime lastTime = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("open")
  private BigDecimal open = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("exchange_volume")
  private BigDecimal exchangeVolume = null;

  @SerializedName("eod_fifty_two_week_high")
  private BigDecimal eodFiftyTwoWeekHigh = null;

  @SerializedName("eod_fifty_two_week_low")
  private BigDecimal eodFiftyTwoWeekLow = null;

  @SerializedName("marketcap")
  private BigDecimal marketcap = null;

  @SerializedName("pricetoearnings")
  private BigDecimal pricetoearnings = null;

  @SerializedName("previous_close")
  private BigDecimal previousClose = null;

  @SerializedName("previous_close_date")
  private BigDecimal previousCloseDate = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("change_percent")
  private BigDecimal changePercent = null;

  public ApiResponseSecurityQuote security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security of the stock quote
   * @return security
  **/
  @ApiModelProperty(value = "The Security of the stock quote")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }

  public ApiResponseSecurityQuote last(BigDecimal last) {
    this.last = last;
    return this;
  }

   /**
   * The price of the latest trade
   * @return last
  **/
  @ApiModelProperty(value = "The price of the latest trade")
  public BigDecimal getLast() {
    return last;
  }

  public void setLast(BigDecimal last) {
    this.last = last;
  }

  public ApiResponseSecurityQuote lastTime(OffsetDateTime lastTime) {
    this.lastTime = lastTime;
    return this;
  }

   /**
   * The date and time when the last trade occurred.
   * @return lastTime
  **/
  @ApiModelProperty(value = "The date and time when the last trade occurred.")
  public OffsetDateTime getLastTime() {
    return lastTime;
  }

  public void setLastTime(OffsetDateTime lastTime) {
    this.lastTime = lastTime;
  }

  public ApiResponseSecurityQuote source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the pricing data.
   * @return source
  **/
  @ApiModelProperty(value = "The source of the pricing data.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ApiResponseSecurityQuote open(BigDecimal open) {
    this.open = open;
    return this;
  }

   /**
   * The open price from the latest day of trading.
   * @return open
  **/
  @ApiModelProperty(value = "The open price from the latest day of trading.")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public ApiResponseSecurityQuote high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The highest price from the latest day of trading.
   * @return high
  **/
  @ApiModelProperty(value = "The highest price from the latest day of trading.")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public ApiResponseSecurityQuote low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The lowest price from the latest day of trading.
   * @return low
  **/
  @ApiModelProperty(value = "The lowest price from the latest day of trading.")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public ApiResponseSecurityQuote exchangeVolume(BigDecimal exchangeVolume) {
    this.exchangeVolume = exchangeVolume;
    return this;
  }

   /**
   * The volume of the security from the source.
   * @return exchangeVolume
  **/
  @ApiModelProperty(value = "The volume of the security from the source.")
  public BigDecimal getExchangeVolume() {
    return exchangeVolume;
  }

  public void setExchangeVolume(BigDecimal exchangeVolume) {
    this.exchangeVolume = exchangeVolume;
  }

  public ApiResponseSecurityQuote eodFiftyTwoWeekHigh(BigDecimal eodFiftyTwoWeekHigh) {
    this.eodFiftyTwoWeekHigh = eodFiftyTwoWeekHigh;
    return this;
  }

   /**
   * The 52 week high price.
   * @return eodFiftyTwoWeekHigh
  **/
  @ApiModelProperty(value = "The 52 week high price.")
  public BigDecimal getEodFiftyTwoWeekHigh() {
    return eodFiftyTwoWeekHigh;
  }

  public void setEodFiftyTwoWeekHigh(BigDecimal eodFiftyTwoWeekHigh) {
    this.eodFiftyTwoWeekHigh = eodFiftyTwoWeekHigh;
  }

  public ApiResponseSecurityQuote eodFiftyTwoWeekLow(BigDecimal eodFiftyTwoWeekLow) {
    this.eodFiftyTwoWeekLow = eodFiftyTwoWeekLow;
    return this;
  }

   /**
   * The 52 week low price.
   * @return eodFiftyTwoWeekLow
  **/
  @ApiModelProperty(value = "The 52 week low price.")
  public BigDecimal getEodFiftyTwoWeekLow() {
    return eodFiftyTwoWeekLow;
  }

  public void setEodFiftyTwoWeekLow(BigDecimal eodFiftyTwoWeekLow) {
    this.eodFiftyTwoWeekLow = eodFiftyTwoWeekLow;
  }

  public ApiResponseSecurityQuote marketcap(BigDecimal marketcap) {
    this.marketcap = marketcap;
    return this;
  }

   /**
   * The current market cap.
   * @return marketcap
  **/
  @ApiModelProperty(value = "The current market cap.")
  public BigDecimal getMarketcap() {
    return marketcap;
  }

  public void setMarketcap(BigDecimal marketcap) {
    this.marketcap = marketcap;
  }

  public ApiResponseSecurityQuote pricetoearnings(BigDecimal pricetoearnings) {
    this.pricetoearnings = pricetoearnings;
    return this;
  }

   /**
   * The current price to earnings.
   * @return pricetoearnings
  **/
  @ApiModelProperty(value = "The current price to earnings.")
  public BigDecimal getPricetoearnings() {
    return pricetoearnings;
  }

  public void setPricetoearnings(BigDecimal pricetoearnings) {
    this.pricetoearnings = pricetoearnings;
  }

  public ApiResponseSecurityQuote previousClose(BigDecimal previousClose) {
    this.previousClose = previousClose;
    return this;
  }

   /**
   * The previous close price.
   * @return previousClose
  **/
  @ApiModelProperty(value = "The previous close price.")
  public BigDecimal getPreviousClose() {
    return previousClose;
  }

  public void setPreviousClose(BigDecimal previousClose) {
    this.previousClose = previousClose;
  }

  public ApiResponseSecurityQuote previousCloseDate(BigDecimal previousCloseDate) {
    this.previousCloseDate = previousCloseDate;
    return this;
  }

   /**
   * The date of the previous close.
   * @return previousCloseDate
  **/
  @ApiModelProperty(value = "The date of the previous close.")
  public BigDecimal getPreviousCloseDate() {
    return previousCloseDate;
  }

  public void setPreviousCloseDate(BigDecimal previousCloseDate) {
    this.previousCloseDate = previousCloseDate;
  }

  public ApiResponseSecurityQuote change(BigDecimal change) {
    this.change = change;
    return this;
  }

   /**
   * The difference in last price from the last close price
   * @return change
  **/
  @ApiModelProperty(value = "The difference in last price from the last close price")
  public BigDecimal getChange() {
    return change;
  }

  public void setChange(BigDecimal change) {
    this.change = change;
  }

  public ApiResponseSecurityQuote changePercent(BigDecimal changePercent) {
    this.changePercent = changePercent;
    return this;
  }

   /**
   * The percent difference in last price from the last close price
   * @return changePercent
  **/
  @ApiModelProperty(value = "The percent difference in last price from the last close price")
  public BigDecimal getChangePercent() {
    return changePercent;
  }

  public void setChangePercent(BigDecimal changePercent) {
    this.changePercent = changePercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseSecurityQuote apiResponseSecurityQuote = (ApiResponseSecurityQuote) o;
    return Objects.equals(this.security, apiResponseSecurityQuote.security) &&
        Objects.equals(this.last, apiResponseSecurityQuote.last) &&
        Objects.equals(this.lastTime, apiResponseSecurityQuote.lastTime) &&
        Objects.equals(this.source, apiResponseSecurityQuote.source) &&
        Objects.equals(this.open, apiResponseSecurityQuote.open) &&
        Objects.equals(this.high, apiResponseSecurityQuote.high) &&
        Objects.equals(this.low, apiResponseSecurityQuote.low) &&
        Objects.equals(this.exchangeVolume, apiResponseSecurityQuote.exchangeVolume) &&
        Objects.equals(this.eodFiftyTwoWeekHigh, apiResponseSecurityQuote.eodFiftyTwoWeekHigh) &&
        Objects.equals(this.eodFiftyTwoWeekLow, apiResponseSecurityQuote.eodFiftyTwoWeekLow) &&
        Objects.equals(this.marketcap, apiResponseSecurityQuote.marketcap) &&
        Objects.equals(this.pricetoearnings, apiResponseSecurityQuote.pricetoearnings) &&
        Objects.equals(this.previousClose, apiResponseSecurityQuote.previousClose) &&
        Objects.equals(this.previousCloseDate, apiResponseSecurityQuote.previousCloseDate) &&
        Objects.equals(this.change, apiResponseSecurityQuote.change) &&
        Objects.equals(this.changePercent, apiResponseSecurityQuote.changePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, last, lastTime, source, open, high, low, exchangeVolume, eodFiftyTwoWeekHigh, eodFiftyTwoWeekLow, marketcap, pricetoearnings, previousClose, previousCloseDate, change, changePercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseSecurityQuote {\n");
    
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    lastTime: ").append(toIndentedString(lastTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    exchangeVolume: ").append(toIndentedString(exchangeVolume)).append("\n");
    sb.append("    eodFiftyTwoWeekHigh: ").append(toIndentedString(eodFiftyTwoWeekHigh)).append("\n");
    sb.append("    eodFiftyTwoWeekLow: ").append(toIndentedString(eodFiftyTwoWeekLow)).append("\n");
    sb.append("    marketcap: ").append(toIndentedString(marketcap)).append("\n");
    sb.append("    pricetoearnings: ").append(toIndentedString(pricetoearnings)).append("\n");
    sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
    sb.append("    previousCloseDate: ").append(toIndentedString(previousCloseDate)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    changePercent: ").append(toIndentedString(changePercent)).append("\n");
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

