

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

  @SerializedName("market_volume")
  private BigDecimal marketVolume = null;

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
  private LocalDate previousCloseDate = null;

  @SerializedName("change")
  private BigDecimal change = null;

  @SerializedName("change_percent")
  private BigDecimal changePercent = null;

  @SerializedName("adj_close_5_days_ago")
  private BigDecimal adjClose5DaysAgo = null;

  @SerializedName("adj_close_30_days_ago")
  private BigDecimal adjClose30DaysAgo = null;

  @SerializedName("adj_close_90_days_ago")
  private BigDecimal adjClose90DaysAgo = null;

  @SerializedName("adj_close_180_days_ago")
  private BigDecimal adjClose180DaysAgo = null;

  @SerializedName("adj_close_365_days_ago")
  private BigDecimal adjClose365DaysAgo = null;

  @SerializedName("adj_close_730_days_ago")
  private BigDecimal adjClose730DaysAgo = null;

  @SerializedName("adj_close_1825_days_ago")
  private BigDecimal adjClose1825DaysAgo = null;

  @SerializedName("adj_close_year_to_date")
  private BigDecimal adjCloseYearToDate = null;

  @SerializedName("change_percent_5_days")
  private BigDecimal changePercent5Days = null;

  @SerializedName("change_percent_30_days")
  private BigDecimal changePercent30Days = null;

  @SerializedName("change_percent_90_days")
  private BigDecimal changePercent90Days = null;

  @SerializedName("change_percent_180_days")
  private BigDecimal changePercent180Days = null;

  @SerializedName("change_percent_365_days")
  private BigDecimal changePercent365Days = null;

  @SerializedName("change_percent_730_days_ago")
  private BigDecimal changePercent730DaysAgo = null;

  @SerializedName("change_percent_1825_days")
  private BigDecimal changePercent1825Days = null;

  @SerializedName("change_percent_year_to_date")
  private BigDecimal changePercentYearToDate = null;

  @SerializedName("extended_hours_last")
  private BigDecimal extendedHoursLast = null;

  @SerializedName("extended_hours_change")
  private BigDecimal extendedHoursChange = null;

  @SerializedName("extended_hours_change_percent")
  private BigDecimal extendedHoursChangePercent = null;

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

  public ApiResponseSecurityQuote marketVolume(BigDecimal marketVolume) {
    this.marketVolume = marketVolume;
    return this;
  }

   /**
   * The volume of the security for the entire market.
   * @return marketVolume
  **/
  @ApiModelProperty(value = "The volume of the security for the entire market.")
  public BigDecimal getMarketVolume() {
    return marketVolume;
  }

  public void setMarketVolume(BigDecimal marketVolume) {
    this.marketVolume = marketVolume;
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

  public ApiResponseSecurityQuote previousCloseDate(LocalDate previousCloseDate) {
    this.previousCloseDate = previousCloseDate;
    return this;
  }

   /**
   * The date of the previous close.
   * @return previousCloseDate
  **/
  @ApiModelProperty(value = "The date of the previous close.")
  public LocalDate getPreviousCloseDate() {
    return previousCloseDate;
  }

  public void setPreviousCloseDate(LocalDate previousCloseDate) {
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

  public ApiResponseSecurityQuote adjClose5DaysAgo(BigDecimal adjClose5DaysAgo) {
    this.adjClose5DaysAgo = adjClose5DaysAgo;
    return this;
  }

   /**
   * The adjusted close price 5 days ago.
   * @return adjClose5DaysAgo
  **/
  @ApiModelProperty(value = "The adjusted close price 5 days ago.")
  public BigDecimal getAdjClose5DaysAgo() {
    return adjClose5DaysAgo;
  }

  public void setAdjClose5DaysAgo(BigDecimal adjClose5DaysAgo) {
    this.adjClose5DaysAgo = adjClose5DaysAgo;
  }

  public ApiResponseSecurityQuote adjClose30DaysAgo(BigDecimal adjClose30DaysAgo) {
    this.adjClose30DaysAgo = adjClose30DaysAgo;
    return this;
  }

   /**
   * The adjusted close price 30 days ago.
   * @return adjClose30DaysAgo
  **/
  @ApiModelProperty(value = "The adjusted close price 30 days ago.")
  public BigDecimal getAdjClose30DaysAgo() {
    return adjClose30DaysAgo;
  }

  public void setAdjClose30DaysAgo(BigDecimal adjClose30DaysAgo) {
    this.adjClose30DaysAgo = adjClose30DaysAgo;
  }

  public ApiResponseSecurityQuote adjClose90DaysAgo(BigDecimal adjClose90DaysAgo) {
    this.adjClose90DaysAgo = adjClose90DaysAgo;
    return this;
  }

   /**
   * The adjusted close price 90 days ago.
   * @return adjClose90DaysAgo
  **/
  @ApiModelProperty(value = "The adjusted close price 90 days ago.")
  public BigDecimal getAdjClose90DaysAgo() {
    return adjClose90DaysAgo;
  }

  public void setAdjClose90DaysAgo(BigDecimal adjClose90DaysAgo) {
    this.adjClose90DaysAgo = adjClose90DaysAgo;
  }

  public ApiResponseSecurityQuote adjClose180DaysAgo(BigDecimal adjClose180DaysAgo) {
    this.adjClose180DaysAgo = adjClose180DaysAgo;
    return this;
  }

   /**
   * The adjusted close price 180 days ago.
   * @return adjClose180DaysAgo
  **/
  @ApiModelProperty(value = "The adjusted close price 180 days ago.")
  public BigDecimal getAdjClose180DaysAgo() {
    return adjClose180DaysAgo;
  }

  public void setAdjClose180DaysAgo(BigDecimal adjClose180DaysAgo) {
    this.adjClose180DaysAgo = adjClose180DaysAgo;
  }

  public ApiResponseSecurityQuote adjClose365DaysAgo(BigDecimal adjClose365DaysAgo) {
    this.adjClose365DaysAgo = adjClose365DaysAgo;
    return this;
  }

   /**
   * The adjusted close price 365 days ago.
   * @return adjClose365DaysAgo
  **/
  @ApiModelProperty(value = "The adjusted close price 365 days ago.")
  public BigDecimal getAdjClose365DaysAgo() {
    return adjClose365DaysAgo;
  }

  public void setAdjClose365DaysAgo(BigDecimal adjClose365DaysAgo) {
    this.adjClose365DaysAgo = adjClose365DaysAgo;
  }

  public ApiResponseSecurityQuote adjClose730DaysAgo(BigDecimal adjClose730DaysAgo) {
    this.adjClose730DaysAgo = adjClose730DaysAgo;
    return this;
  }

   /**
   * The adjusted close price 730 days ago.
   * @return adjClose730DaysAgo
  **/
  @ApiModelProperty(value = "The adjusted close price 730 days ago.")
  public BigDecimal getAdjClose730DaysAgo() {
    return adjClose730DaysAgo;
  }

  public void setAdjClose730DaysAgo(BigDecimal adjClose730DaysAgo) {
    this.adjClose730DaysAgo = adjClose730DaysAgo;
  }

  public ApiResponseSecurityQuote adjClose1825DaysAgo(BigDecimal adjClose1825DaysAgo) {
    this.adjClose1825DaysAgo = adjClose1825DaysAgo;
    return this;
  }

   /**
   * The adjusted close price 1825 days ago.
   * @return adjClose1825DaysAgo
  **/
  @ApiModelProperty(value = "The adjusted close price 1825 days ago.")
  public BigDecimal getAdjClose1825DaysAgo() {
    return adjClose1825DaysAgo;
  }

  public void setAdjClose1825DaysAgo(BigDecimal adjClose1825DaysAgo) {
    this.adjClose1825DaysAgo = adjClose1825DaysAgo;
  }

  public ApiResponseSecurityQuote adjCloseYearToDate(BigDecimal adjCloseYearToDate) {
    this.adjCloseYearToDate = adjCloseYearToDate;
    return this;
  }

   /**
   * The adjusted close price at the start of the calendar year.
   * @return adjCloseYearToDate
  **/
  @ApiModelProperty(value = "The adjusted close price at the start of the calendar year.")
  public BigDecimal getAdjCloseYearToDate() {
    return adjCloseYearToDate;
  }

  public void setAdjCloseYearToDate(BigDecimal adjCloseYearToDate) {
    this.adjCloseYearToDate = adjCloseYearToDate;
  }

  public ApiResponseSecurityQuote changePercent5Days(BigDecimal changePercent5Days) {
    this.changePercent5Days = changePercent5Days;
    return this;
  }

   /**
   * The percent change from the adjusted price 5 days ago to now.
   * @return changePercent5Days
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price 5 days ago to now.")
  public BigDecimal getChangePercent5Days() {
    return changePercent5Days;
  }

  public void setChangePercent5Days(BigDecimal changePercent5Days) {
    this.changePercent5Days = changePercent5Days;
  }

  public ApiResponseSecurityQuote changePercent30Days(BigDecimal changePercent30Days) {
    this.changePercent30Days = changePercent30Days;
    return this;
  }

   /**
   * The percent change from the adjusted price 30 days ago to now.
   * @return changePercent30Days
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price 30 days ago to now.")
  public BigDecimal getChangePercent30Days() {
    return changePercent30Days;
  }

  public void setChangePercent30Days(BigDecimal changePercent30Days) {
    this.changePercent30Days = changePercent30Days;
  }

  public ApiResponseSecurityQuote changePercent90Days(BigDecimal changePercent90Days) {
    this.changePercent90Days = changePercent90Days;
    return this;
  }

   /**
   * The percent change from the adjusted price 90 days ago to now.
   * @return changePercent90Days
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price 90 days ago to now.")
  public BigDecimal getChangePercent90Days() {
    return changePercent90Days;
  }

  public void setChangePercent90Days(BigDecimal changePercent90Days) {
    this.changePercent90Days = changePercent90Days;
  }

  public ApiResponseSecurityQuote changePercent180Days(BigDecimal changePercent180Days) {
    this.changePercent180Days = changePercent180Days;
    return this;
  }

   /**
   * The percent change from the adjusted price 180 days ago to now.
   * @return changePercent180Days
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price 180 days ago to now.")
  public BigDecimal getChangePercent180Days() {
    return changePercent180Days;
  }

  public void setChangePercent180Days(BigDecimal changePercent180Days) {
    this.changePercent180Days = changePercent180Days;
  }

  public ApiResponseSecurityQuote changePercent365Days(BigDecimal changePercent365Days) {
    this.changePercent365Days = changePercent365Days;
    return this;
  }

   /**
   * The percent change from the adjusted price 365 days ago to now.
   * @return changePercent365Days
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price 365 days ago to now.")
  public BigDecimal getChangePercent365Days() {
    return changePercent365Days;
  }

  public void setChangePercent365Days(BigDecimal changePercent365Days) {
    this.changePercent365Days = changePercent365Days;
  }

  public ApiResponseSecurityQuote changePercent730DaysAgo(BigDecimal changePercent730DaysAgo) {
    this.changePercent730DaysAgo = changePercent730DaysAgo;
    return this;
  }

   /**
   * The percent change from the adjusted price 730 days ago to now.
   * @return changePercent730DaysAgo
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price 730 days ago to now.")
  public BigDecimal getChangePercent730DaysAgo() {
    return changePercent730DaysAgo;
  }

  public void setChangePercent730DaysAgo(BigDecimal changePercent730DaysAgo) {
    this.changePercent730DaysAgo = changePercent730DaysAgo;
  }

  public ApiResponseSecurityQuote changePercent1825Days(BigDecimal changePercent1825Days) {
    this.changePercent1825Days = changePercent1825Days;
    return this;
  }

   /**
   * The percent change from the adjusted price 1825 days ago to now.
   * @return changePercent1825Days
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price 1825 days ago to now.")
  public BigDecimal getChangePercent1825Days() {
    return changePercent1825Days;
  }

  public void setChangePercent1825Days(BigDecimal changePercent1825Days) {
    this.changePercent1825Days = changePercent1825Days;
  }

  public ApiResponseSecurityQuote changePercentYearToDate(BigDecimal changePercentYearToDate) {
    this.changePercentYearToDate = changePercentYearToDate;
    return this;
  }

   /**
   * The percent change from the adjusted price since the start of the calendar year to now.
   * @return changePercentYearToDate
  **/
  @ApiModelProperty(value = "The percent change from the adjusted price since the start of the calendar year to now.")
  public BigDecimal getChangePercentYearToDate() {
    return changePercentYearToDate;
  }

  public void setChangePercentYearToDate(BigDecimal changePercentYearToDate) {
    this.changePercentYearToDate = changePercentYearToDate;
  }

  public ApiResponseSecurityQuote extendedHoursLast(BigDecimal extendedHoursLast) {
    this.extendedHoursLast = extendedHoursLast;
    return this;
  }

   /**
   * The price of the latest trade in pre and post market trading.  Might be null during normal trading
   * @return extendedHoursLast
  **/
  @ApiModelProperty(value = "The price of the latest trade in pre and post market trading.  Might be null during normal trading")
  public BigDecimal getExtendedHoursLast() {
    return extendedHoursLast;
  }

  public void setExtendedHoursLast(BigDecimal extendedHoursLast) {
    this.extendedHoursLast = extendedHoursLast;
  }

  public ApiResponseSecurityQuote extendedHoursChange(BigDecimal extendedHoursChange) {
    this.extendedHoursChange = extendedHoursChange;
    return this;
  }

   /**
   * The difference in extended_hours_last price from most recent official close price
   * @return extendedHoursChange
  **/
  @ApiModelProperty(value = "The difference in extended_hours_last price from most recent official close price")
  public BigDecimal getExtendedHoursChange() {
    return extendedHoursChange;
  }

  public void setExtendedHoursChange(BigDecimal extendedHoursChange) {
    this.extendedHoursChange = extendedHoursChange;
  }

  public ApiResponseSecurityQuote extendedHoursChangePercent(BigDecimal extendedHoursChangePercent) {
    this.extendedHoursChangePercent = extendedHoursChangePercent;
    return this;
  }

   /**
   * The percent difference in extended_hours_last from the most recent official close price
   * @return extendedHoursChangePercent
  **/
  @ApiModelProperty(value = "The percent difference in extended_hours_last from the most recent official close price")
  public BigDecimal getExtendedHoursChangePercent() {
    return extendedHoursChangePercent;
  }

  public void setExtendedHoursChangePercent(BigDecimal extendedHoursChangePercent) {
    this.extendedHoursChangePercent = extendedHoursChangePercent;
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
        Objects.equals(this.marketVolume, apiResponseSecurityQuote.marketVolume) &&
        Objects.equals(this.eodFiftyTwoWeekHigh, apiResponseSecurityQuote.eodFiftyTwoWeekHigh) &&
        Objects.equals(this.eodFiftyTwoWeekLow, apiResponseSecurityQuote.eodFiftyTwoWeekLow) &&
        Objects.equals(this.marketcap, apiResponseSecurityQuote.marketcap) &&
        Objects.equals(this.pricetoearnings, apiResponseSecurityQuote.pricetoearnings) &&
        Objects.equals(this.previousClose, apiResponseSecurityQuote.previousClose) &&
        Objects.equals(this.previousCloseDate, apiResponseSecurityQuote.previousCloseDate) &&
        Objects.equals(this.change, apiResponseSecurityQuote.change) &&
        Objects.equals(this.changePercent, apiResponseSecurityQuote.changePercent) &&
        Objects.equals(this.adjClose5DaysAgo, apiResponseSecurityQuote.adjClose5DaysAgo) &&
        Objects.equals(this.adjClose30DaysAgo, apiResponseSecurityQuote.adjClose30DaysAgo) &&
        Objects.equals(this.adjClose90DaysAgo, apiResponseSecurityQuote.adjClose90DaysAgo) &&
        Objects.equals(this.adjClose180DaysAgo, apiResponseSecurityQuote.adjClose180DaysAgo) &&
        Objects.equals(this.adjClose365DaysAgo, apiResponseSecurityQuote.adjClose365DaysAgo) &&
        Objects.equals(this.adjClose730DaysAgo, apiResponseSecurityQuote.adjClose730DaysAgo) &&
        Objects.equals(this.adjClose1825DaysAgo, apiResponseSecurityQuote.adjClose1825DaysAgo) &&
        Objects.equals(this.adjCloseYearToDate, apiResponseSecurityQuote.adjCloseYearToDate) &&
        Objects.equals(this.changePercent5Days, apiResponseSecurityQuote.changePercent5Days) &&
        Objects.equals(this.changePercent30Days, apiResponseSecurityQuote.changePercent30Days) &&
        Objects.equals(this.changePercent90Days, apiResponseSecurityQuote.changePercent90Days) &&
        Objects.equals(this.changePercent180Days, apiResponseSecurityQuote.changePercent180Days) &&
        Objects.equals(this.changePercent365Days, apiResponseSecurityQuote.changePercent365Days) &&
        Objects.equals(this.changePercent730DaysAgo, apiResponseSecurityQuote.changePercent730DaysAgo) &&
        Objects.equals(this.changePercent1825Days, apiResponseSecurityQuote.changePercent1825Days) &&
        Objects.equals(this.changePercentYearToDate, apiResponseSecurityQuote.changePercentYearToDate) &&
        Objects.equals(this.extendedHoursLast, apiResponseSecurityQuote.extendedHoursLast) &&
        Objects.equals(this.extendedHoursChange, apiResponseSecurityQuote.extendedHoursChange) &&
        Objects.equals(this.extendedHoursChangePercent, apiResponseSecurityQuote.extendedHoursChangePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, last, lastTime, source, open, high, low, exchangeVolume, marketVolume, eodFiftyTwoWeekHigh, eodFiftyTwoWeekLow, marketcap, pricetoearnings, previousClose, previousCloseDate, change, changePercent, adjClose5DaysAgo, adjClose30DaysAgo, adjClose90DaysAgo, adjClose180DaysAgo, adjClose365DaysAgo, adjClose730DaysAgo, adjClose1825DaysAgo, adjCloseYearToDate, changePercent5Days, changePercent30Days, changePercent90Days, changePercent180Days, changePercent365Days, changePercent730DaysAgo, changePercent1825Days, changePercentYearToDate, extendedHoursLast, extendedHoursChange, extendedHoursChangePercent);
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
    sb.append("    marketVolume: ").append(toIndentedString(marketVolume)).append("\n");
    sb.append("    eodFiftyTwoWeekHigh: ").append(toIndentedString(eodFiftyTwoWeekHigh)).append("\n");
    sb.append("    eodFiftyTwoWeekLow: ").append(toIndentedString(eodFiftyTwoWeekLow)).append("\n");
    sb.append("    marketcap: ").append(toIndentedString(marketcap)).append("\n");
    sb.append("    pricetoearnings: ").append(toIndentedString(pricetoearnings)).append("\n");
    sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
    sb.append("    previousCloseDate: ").append(toIndentedString(previousCloseDate)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    changePercent: ").append(toIndentedString(changePercent)).append("\n");
    sb.append("    adjClose5DaysAgo: ").append(toIndentedString(adjClose5DaysAgo)).append("\n");
    sb.append("    adjClose30DaysAgo: ").append(toIndentedString(adjClose30DaysAgo)).append("\n");
    sb.append("    adjClose90DaysAgo: ").append(toIndentedString(adjClose90DaysAgo)).append("\n");
    sb.append("    adjClose180DaysAgo: ").append(toIndentedString(adjClose180DaysAgo)).append("\n");
    sb.append("    adjClose365DaysAgo: ").append(toIndentedString(adjClose365DaysAgo)).append("\n");
    sb.append("    adjClose730DaysAgo: ").append(toIndentedString(adjClose730DaysAgo)).append("\n");
    sb.append("    adjClose1825DaysAgo: ").append(toIndentedString(adjClose1825DaysAgo)).append("\n");
    sb.append("    adjCloseYearToDate: ").append(toIndentedString(adjCloseYearToDate)).append("\n");
    sb.append("    changePercent5Days: ").append(toIndentedString(changePercent5Days)).append("\n");
    sb.append("    changePercent30Days: ").append(toIndentedString(changePercent30Days)).append("\n");
    sb.append("    changePercent90Days: ").append(toIndentedString(changePercent90Days)).append("\n");
    sb.append("    changePercent180Days: ").append(toIndentedString(changePercent180Days)).append("\n");
    sb.append("    changePercent365Days: ").append(toIndentedString(changePercent365Days)).append("\n");
    sb.append("    changePercent730DaysAgo: ").append(toIndentedString(changePercent730DaysAgo)).append("\n");
    sb.append("    changePercent1825Days: ").append(toIndentedString(changePercent1825Days)).append("\n");
    sb.append("    changePercentYearToDate: ").append(toIndentedString(changePercentYearToDate)).append("\n");
    sb.append("    extendedHoursLast: ").append(toIndentedString(extendedHoursLast)).append("\n");
    sb.append("    extendedHoursChange: ").append(toIndentedString(extendedHoursChange)).append("\n");
    sb.append("    extendedHoursChangePercent: ").append(toIndentedString(extendedHoursChangePercent)).append("\n");
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

