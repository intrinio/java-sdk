

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ETFSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * Daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility
 */
@ApiModel(description = "Daily stats for the Exchange Traded Fund (ETF) including net asset value, beta vs spy, returns, and volatility")

public class ETFStats {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("net_asset_value")
  private BigDecimal netAssetValue = null;

  @SerializedName("beta_vs_spy")
  private BigDecimal betaVsSpy = null;

  @SerializedName("trailing_one_month_return_split_and_dividend")
  private BigDecimal trailingOneMonthReturnSplitAndDividend = null;

  @SerializedName("trailing_one_month_return_split_only")
  private BigDecimal trailingOneMonthReturnSplitOnly = null;

  @SerializedName("trailing_one_year_return_split_and_dividend")
  private BigDecimal trailingOneYearReturnSplitAndDividend = null;

  @SerializedName("trailing_one_year_return_split_only")
  private BigDecimal trailingOneYearReturnSplitOnly = null;

  @SerializedName("trailing_one_year_volatility_annualized")
  private BigDecimal trailingOneYearVolatilityAnnualized = null;

  @SerializedName("trailing_three_year_annualized_return_split_and_dividend")
  private BigDecimal trailingThreeYearAnnualizedReturnSplitAndDividend = null;

  @SerializedName("trailing_three_year_annualized_return_split_only")
  private BigDecimal trailingThreeYearAnnualizedReturnSplitOnly = null;

  @SerializedName("trailing_three_year_volatility_annualized")
  private BigDecimal trailingThreeYearVolatilityAnnualized = null;

  @SerializedName("trailing_five_year_annualized_return_split_and_dividend")
  private BigDecimal trailingFiveYearAnnualizedReturnSplitAndDividend = null;

  @SerializedName("trailing_five_year_annualized_return_split_only")
  private BigDecimal trailingFiveYearAnnualizedReturnSplitOnly = null;

  @SerializedName("trailing_five_year_volatility_annualized")
  private BigDecimal trailingFiveYearVolatilityAnnualized = null;

  @SerializedName("trailing_ten_year_annualized_return_split_and_dividend")
  private BigDecimal trailingTenYearAnnualizedReturnSplitAndDividend = null;

  @SerializedName("trailing_ten_year_annualized_return_split_only")
  private BigDecimal trailingTenYearAnnualizedReturnSplitOnly = null;

  @SerializedName("inception_annualized_return_split_and_dividend")
  private BigDecimal inceptionAnnualizedReturnSplitAndDividend = null;

  @SerializedName("inception_annualized_return_split_only")
  private BigDecimal inceptionAnnualizedReturnSplitOnly = null;

  @SerializedName("calendar_year_5_return_split_and_dividend")
  private BigDecimal calendarYear5ReturnSplitAndDividend = null;

  @SerializedName("calendar_year_5_return_split_only")
  private BigDecimal calendarYear5ReturnSplitOnly = null;

  @SerializedName("calendar_year_4_return_split_and_dividend")
  private BigDecimal calendarYear4ReturnSplitAndDividend = null;

  @SerializedName("calendar_year_4_return_split_only")
  private BigDecimal calendarYear4ReturnSplitOnly = null;

  @SerializedName("calendar_year_3_return_split_and_dividend")
  private BigDecimal calendarYear3ReturnSplitAndDividend = null;

  @SerializedName("calendar_year_3_return_split_only")
  private BigDecimal calendarYear3ReturnSplitOnly = null;

  @SerializedName("calendar_year_2_return_split_and_dividend")
  private BigDecimal calendarYear2ReturnSplitAndDividend = null;

  @SerializedName("calendar_year_2_return_split_only")
  private BigDecimal calendarYear2ReturnSplitOnly = null;

  @SerializedName("calendar_year_1_return_split_and_dividend")
  private BigDecimal calendarYear1ReturnSplitAndDividend = null;

  @SerializedName("calendar_year_1_return_split_only")
  private BigDecimal calendarYear1ReturnSplitOnly = null;

  @SerializedName("calendar_year_to_date_return_split_and_dividend")
  private BigDecimal calendarYearToDateReturnSplitAndDividend = null;

  @SerializedName("calendar_year_to_date_return_split_only")
  private BigDecimal calendarYearToDateReturnSplitOnly = null;

  @SerializedName("etf")
  private ETFSummary etf = null;

  public ETFStats date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ETFStats netAssetValue(BigDecimal netAssetValue) {
    this.netAssetValue = netAssetValue;
    return this;
  }

   /**
   * The net asset value (NAV &#x3D; Total Assets - Total Liabilities)
   * @return netAssetValue
  **/
  @ApiModelProperty(value = "The net asset value (NAV = Total Assets - Total Liabilities)")
  public BigDecimal getNetAssetValue() {
    return netAssetValue;
  }

  public void setNetAssetValue(BigDecimal netAssetValue) {
    this.netAssetValue = netAssetValue;
  }

  public ETFStats betaVsSpy(BigDecimal betaVsSpy) {
    this.betaVsSpy = betaVsSpy;
    return this;
  }

   /**
   * Volatility this ETF is versus the SPY ETF
   * @return betaVsSpy
  **/
  @ApiModelProperty(value = "Volatility this ETF is versus the SPY ETF")
  public BigDecimal getBetaVsSpy() {
    return betaVsSpy;
  }

  public void setBetaVsSpy(BigDecimal betaVsSpy) {
    this.betaVsSpy = betaVsSpy;
  }

  public ETFStats trailingOneMonthReturnSplitAndDividend(BigDecimal trailingOneMonthReturnSplitAndDividend) {
    this.trailingOneMonthReturnSplitAndDividend = trailingOneMonthReturnSplitAndDividend;
    return this;
  }

   /**
   * Trailing one month return including dividends
   * @return trailingOneMonthReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Trailing one month return including dividends")
  public BigDecimal getTrailingOneMonthReturnSplitAndDividend() {
    return trailingOneMonthReturnSplitAndDividend;
  }

  public void setTrailingOneMonthReturnSplitAndDividend(BigDecimal trailingOneMonthReturnSplitAndDividend) {
    this.trailingOneMonthReturnSplitAndDividend = trailingOneMonthReturnSplitAndDividend;
  }

  public ETFStats trailingOneMonthReturnSplitOnly(BigDecimal trailingOneMonthReturnSplitOnly) {
    this.trailingOneMonthReturnSplitOnly = trailingOneMonthReturnSplitOnly;
    return this;
  }

   /**
   * Trailing one month return excluding dividends
   * @return trailingOneMonthReturnSplitOnly
  **/
  @ApiModelProperty(value = "Trailing one month return excluding dividends")
  public BigDecimal getTrailingOneMonthReturnSplitOnly() {
    return trailingOneMonthReturnSplitOnly;
  }

  public void setTrailingOneMonthReturnSplitOnly(BigDecimal trailingOneMonthReturnSplitOnly) {
    this.trailingOneMonthReturnSplitOnly = trailingOneMonthReturnSplitOnly;
  }

  public ETFStats trailingOneYearReturnSplitAndDividend(BigDecimal trailingOneYearReturnSplitAndDividend) {
    this.trailingOneYearReturnSplitAndDividend = trailingOneYearReturnSplitAndDividend;
    return this;
  }

   /**
   * Trailing one year return including dividends
   * @return trailingOneYearReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Trailing one year return including dividends")
  public BigDecimal getTrailingOneYearReturnSplitAndDividend() {
    return trailingOneYearReturnSplitAndDividend;
  }

  public void setTrailingOneYearReturnSplitAndDividend(BigDecimal trailingOneYearReturnSplitAndDividend) {
    this.trailingOneYearReturnSplitAndDividend = trailingOneYearReturnSplitAndDividend;
  }

  public ETFStats trailingOneYearReturnSplitOnly(BigDecimal trailingOneYearReturnSplitOnly) {
    this.trailingOneYearReturnSplitOnly = trailingOneYearReturnSplitOnly;
    return this;
  }

   /**
   * Trailing one year return excluding dividends
   * @return trailingOneYearReturnSplitOnly
  **/
  @ApiModelProperty(value = "Trailing one year return excluding dividends")
  public BigDecimal getTrailingOneYearReturnSplitOnly() {
    return trailingOneYearReturnSplitOnly;
  }

  public void setTrailingOneYearReturnSplitOnly(BigDecimal trailingOneYearReturnSplitOnly) {
    this.trailingOneYearReturnSplitOnly = trailingOneYearReturnSplitOnly;
  }

  public ETFStats trailingOneYearVolatilityAnnualized(BigDecimal trailingOneYearVolatilityAnnualized) {
    this.trailingOneYearVolatilityAnnualized = trailingOneYearVolatilityAnnualized;
    return this;
  }

   /**
   * Annualized standard deviation of daily price returns over trailing 252 trading days
   * @return trailingOneYearVolatilityAnnualized
  **/
  @ApiModelProperty(value = "Annualized standard deviation of daily price returns over trailing 252 trading days")
  public BigDecimal getTrailingOneYearVolatilityAnnualized() {
    return trailingOneYearVolatilityAnnualized;
  }

  public void setTrailingOneYearVolatilityAnnualized(BigDecimal trailingOneYearVolatilityAnnualized) {
    this.trailingOneYearVolatilityAnnualized = trailingOneYearVolatilityAnnualized;
  }

  public ETFStats trailingThreeYearAnnualizedReturnSplitAndDividend(BigDecimal trailingThreeYearAnnualizedReturnSplitAndDividend) {
    this.trailingThreeYearAnnualizedReturnSplitAndDividend = trailingThreeYearAnnualizedReturnSplitAndDividend;
    return this;
  }

   /**
   * Trailing three year return including dividends
   * @return trailingThreeYearAnnualizedReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Trailing three year return including dividends")
  public BigDecimal getTrailingThreeYearAnnualizedReturnSplitAndDividend() {
    return trailingThreeYearAnnualizedReturnSplitAndDividend;
  }

  public void setTrailingThreeYearAnnualizedReturnSplitAndDividend(BigDecimal trailingThreeYearAnnualizedReturnSplitAndDividend) {
    this.trailingThreeYearAnnualizedReturnSplitAndDividend = trailingThreeYearAnnualizedReturnSplitAndDividend;
  }

  public ETFStats trailingThreeYearAnnualizedReturnSplitOnly(BigDecimal trailingThreeYearAnnualizedReturnSplitOnly) {
    this.trailingThreeYearAnnualizedReturnSplitOnly = trailingThreeYearAnnualizedReturnSplitOnly;
    return this;
  }

   /**
   * Trailing three year return excluding dividends
   * @return trailingThreeYearAnnualizedReturnSplitOnly
  **/
  @ApiModelProperty(value = "Trailing three year return excluding dividends")
  public BigDecimal getTrailingThreeYearAnnualizedReturnSplitOnly() {
    return trailingThreeYearAnnualizedReturnSplitOnly;
  }

  public void setTrailingThreeYearAnnualizedReturnSplitOnly(BigDecimal trailingThreeYearAnnualizedReturnSplitOnly) {
    this.trailingThreeYearAnnualizedReturnSplitOnly = trailingThreeYearAnnualizedReturnSplitOnly;
  }

  public ETFStats trailingThreeYearVolatilityAnnualized(BigDecimal trailingThreeYearVolatilityAnnualized) {
    this.trailingThreeYearVolatilityAnnualized = trailingThreeYearVolatilityAnnualized;
    return this;
  }

   /**
   * Annualized standard deviation of daily price returns over trailing 756 trading days
   * @return trailingThreeYearVolatilityAnnualized
  **/
  @ApiModelProperty(value = "Annualized standard deviation of daily price returns over trailing 756 trading days")
  public BigDecimal getTrailingThreeYearVolatilityAnnualized() {
    return trailingThreeYearVolatilityAnnualized;
  }

  public void setTrailingThreeYearVolatilityAnnualized(BigDecimal trailingThreeYearVolatilityAnnualized) {
    this.trailingThreeYearVolatilityAnnualized = trailingThreeYearVolatilityAnnualized;
  }

  public ETFStats trailingFiveYearAnnualizedReturnSplitAndDividend(BigDecimal trailingFiveYearAnnualizedReturnSplitAndDividend) {
    this.trailingFiveYearAnnualizedReturnSplitAndDividend = trailingFiveYearAnnualizedReturnSplitAndDividend;
    return this;
  }

   /**
   * Trailing five year return including dividends
   * @return trailingFiveYearAnnualizedReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Trailing five year return including dividends")
  public BigDecimal getTrailingFiveYearAnnualizedReturnSplitAndDividend() {
    return trailingFiveYearAnnualizedReturnSplitAndDividend;
  }

  public void setTrailingFiveYearAnnualizedReturnSplitAndDividend(BigDecimal trailingFiveYearAnnualizedReturnSplitAndDividend) {
    this.trailingFiveYearAnnualizedReturnSplitAndDividend = trailingFiveYearAnnualizedReturnSplitAndDividend;
  }

  public ETFStats trailingFiveYearAnnualizedReturnSplitOnly(BigDecimal trailingFiveYearAnnualizedReturnSplitOnly) {
    this.trailingFiveYearAnnualizedReturnSplitOnly = trailingFiveYearAnnualizedReturnSplitOnly;
    return this;
  }

   /**
   * Trailing five year return excluding dividends
   * @return trailingFiveYearAnnualizedReturnSplitOnly
  **/
  @ApiModelProperty(value = "Trailing five year return excluding dividends")
  public BigDecimal getTrailingFiveYearAnnualizedReturnSplitOnly() {
    return trailingFiveYearAnnualizedReturnSplitOnly;
  }

  public void setTrailingFiveYearAnnualizedReturnSplitOnly(BigDecimal trailingFiveYearAnnualizedReturnSplitOnly) {
    this.trailingFiveYearAnnualizedReturnSplitOnly = trailingFiveYearAnnualizedReturnSplitOnly;
  }

  public ETFStats trailingFiveYearVolatilityAnnualized(BigDecimal trailingFiveYearVolatilityAnnualized) {
    this.trailingFiveYearVolatilityAnnualized = trailingFiveYearVolatilityAnnualized;
    return this;
  }

   /**
   * Annualized standard  deviation  of  daily  price  returns  over  trailing 1260 trading days
   * @return trailingFiveYearVolatilityAnnualized
  **/
  @ApiModelProperty(value = "Annualized standard  deviation  of  daily  price  returns  over  trailing 1260 trading days")
  public BigDecimal getTrailingFiveYearVolatilityAnnualized() {
    return trailingFiveYearVolatilityAnnualized;
  }

  public void setTrailingFiveYearVolatilityAnnualized(BigDecimal trailingFiveYearVolatilityAnnualized) {
    this.trailingFiveYearVolatilityAnnualized = trailingFiveYearVolatilityAnnualized;
  }

  public ETFStats trailingTenYearAnnualizedReturnSplitAndDividend(BigDecimal trailingTenYearAnnualizedReturnSplitAndDividend) {
    this.trailingTenYearAnnualizedReturnSplitAndDividend = trailingTenYearAnnualizedReturnSplitAndDividend;
    return this;
  }

   /**
   * Trailing ten year return including dividends
   * @return trailingTenYearAnnualizedReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Trailing ten year return including dividends")
  public BigDecimal getTrailingTenYearAnnualizedReturnSplitAndDividend() {
    return trailingTenYearAnnualizedReturnSplitAndDividend;
  }

  public void setTrailingTenYearAnnualizedReturnSplitAndDividend(BigDecimal trailingTenYearAnnualizedReturnSplitAndDividend) {
    this.trailingTenYearAnnualizedReturnSplitAndDividend = trailingTenYearAnnualizedReturnSplitAndDividend;
  }

  public ETFStats trailingTenYearAnnualizedReturnSplitOnly(BigDecimal trailingTenYearAnnualizedReturnSplitOnly) {
    this.trailingTenYearAnnualizedReturnSplitOnly = trailingTenYearAnnualizedReturnSplitOnly;
    return this;
  }

   /**
   * Trailing ten year return excluding dividends
   * @return trailingTenYearAnnualizedReturnSplitOnly
  **/
  @ApiModelProperty(value = "Trailing ten year return excluding dividends")
  public BigDecimal getTrailingTenYearAnnualizedReturnSplitOnly() {
    return trailingTenYearAnnualizedReturnSplitOnly;
  }

  public void setTrailingTenYearAnnualizedReturnSplitOnly(BigDecimal trailingTenYearAnnualizedReturnSplitOnly) {
    this.trailingTenYearAnnualizedReturnSplitOnly = trailingTenYearAnnualizedReturnSplitOnly;
  }

  public ETFStats inceptionAnnualizedReturnSplitAndDividend(BigDecimal inceptionAnnualizedReturnSplitAndDividend) {
    this.inceptionAnnualizedReturnSplitAndDividend = inceptionAnnualizedReturnSplitAndDividend;
    return this;
  }

   /**
   * Annualized return including dividends since inception
   * @return inceptionAnnualizedReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Annualized return including dividends since inception")
  public BigDecimal getInceptionAnnualizedReturnSplitAndDividend() {
    return inceptionAnnualizedReturnSplitAndDividend;
  }

  public void setInceptionAnnualizedReturnSplitAndDividend(BigDecimal inceptionAnnualizedReturnSplitAndDividend) {
    this.inceptionAnnualizedReturnSplitAndDividend = inceptionAnnualizedReturnSplitAndDividend;
  }

  public ETFStats inceptionAnnualizedReturnSplitOnly(BigDecimal inceptionAnnualizedReturnSplitOnly) {
    this.inceptionAnnualizedReturnSplitOnly = inceptionAnnualizedReturnSplitOnly;
    return this;
  }

   /**
   * Annualized return excluding dividends since inception
   * @return inceptionAnnualizedReturnSplitOnly
  **/
  @ApiModelProperty(value = "Annualized return excluding dividends since inception")
  public BigDecimal getInceptionAnnualizedReturnSplitOnly() {
    return inceptionAnnualizedReturnSplitOnly;
  }

  public void setInceptionAnnualizedReturnSplitOnly(BigDecimal inceptionAnnualizedReturnSplitOnly) {
    this.inceptionAnnualizedReturnSplitOnly = inceptionAnnualizedReturnSplitOnly;
  }

  public ETFStats calendarYear5ReturnSplitAndDividend(BigDecimal calendarYear5ReturnSplitAndDividend) {
    this.calendarYear5ReturnSplitAndDividend = calendarYear5ReturnSplitAndDividend;
    return this;
  }

   /**
   * Five years ago calendar year return including dividends
   * @return calendarYear5ReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Five years ago calendar year return including dividends")
  public BigDecimal getCalendarYear5ReturnSplitAndDividend() {
    return calendarYear5ReturnSplitAndDividend;
  }

  public void setCalendarYear5ReturnSplitAndDividend(BigDecimal calendarYear5ReturnSplitAndDividend) {
    this.calendarYear5ReturnSplitAndDividend = calendarYear5ReturnSplitAndDividend;
  }

  public ETFStats calendarYear5ReturnSplitOnly(BigDecimal calendarYear5ReturnSplitOnly) {
    this.calendarYear5ReturnSplitOnly = calendarYear5ReturnSplitOnly;
    return this;
  }

   /**
   * Five years ago calendar year return excluding dividends
   * @return calendarYear5ReturnSplitOnly
  **/
  @ApiModelProperty(value = "Five years ago calendar year return excluding dividends")
  public BigDecimal getCalendarYear5ReturnSplitOnly() {
    return calendarYear5ReturnSplitOnly;
  }

  public void setCalendarYear5ReturnSplitOnly(BigDecimal calendarYear5ReturnSplitOnly) {
    this.calendarYear5ReturnSplitOnly = calendarYear5ReturnSplitOnly;
  }

  public ETFStats calendarYear4ReturnSplitAndDividend(BigDecimal calendarYear4ReturnSplitAndDividend) {
    this.calendarYear4ReturnSplitAndDividend = calendarYear4ReturnSplitAndDividend;
    return this;
  }

   /**
   * Four years ago calendar year return including dividends
   * @return calendarYear4ReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Four years ago calendar year return including dividends")
  public BigDecimal getCalendarYear4ReturnSplitAndDividend() {
    return calendarYear4ReturnSplitAndDividend;
  }

  public void setCalendarYear4ReturnSplitAndDividend(BigDecimal calendarYear4ReturnSplitAndDividend) {
    this.calendarYear4ReturnSplitAndDividend = calendarYear4ReturnSplitAndDividend;
  }

  public ETFStats calendarYear4ReturnSplitOnly(BigDecimal calendarYear4ReturnSplitOnly) {
    this.calendarYear4ReturnSplitOnly = calendarYear4ReturnSplitOnly;
    return this;
  }

   /**
   * Four years ago calendar year return excluding dividends
   * @return calendarYear4ReturnSplitOnly
  **/
  @ApiModelProperty(value = "Four years ago calendar year return excluding dividends")
  public BigDecimal getCalendarYear4ReturnSplitOnly() {
    return calendarYear4ReturnSplitOnly;
  }

  public void setCalendarYear4ReturnSplitOnly(BigDecimal calendarYear4ReturnSplitOnly) {
    this.calendarYear4ReturnSplitOnly = calendarYear4ReturnSplitOnly;
  }

  public ETFStats calendarYear3ReturnSplitAndDividend(BigDecimal calendarYear3ReturnSplitAndDividend) {
    this.calendarYear3ReturnSplitAndDividend = calendarYear3ReturnSplitAndDividend;
    return this;
  }

   /**
   * Three years ago calendar year return including dividends
   * @return calendarYear3ReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Three years ago calendar year return including dividends")
  public BigDecimal getCalendarYear3ReturnSplitAndDividend() {
    return calendarYear3ReturnSplitAndDividend;
  }

  public void setCalendarYear3ReturnSplitAndDividend(BigDecimal calendarYear3ReturnSplitAndDividend) {
    this.calendarYear3ReturnSplitAndDividend = calendarYear3ReturnSplitAndDividend;
  }

  public ETFStats calendarYear3ReturnSplitOnly(BigDecimal calendarYear3ReturnSplitOnly) {
    this.calendarYear3ReturnSplitOnly = calendarYear3ReturnSplitOnly;
    return this;
  }

   /**
   * Three years ago calendar year return excluding dividends
   * @return calendarYear3ReturnSplitOnly
  **/
  @ApiModelProperty(value = "Three years ago calendar year return excluding dividends")
  public BigDecimal getCalendarYear3ReturnSplitOnly() {
    return calendarYear3ReturnSplitOnly;
  }

  public void setCalendarYear3ReturnSplitOnly(BigDecimal calendarYear3ReturnSplitOnly) {
    this.calendarYear3ReturnSplitOnly = calendarYear3ReturnSplitOnly;
  }

  public ETFStats calendarYear2ReturnSplitAndDividend(BigDecimal calendarYear2ReturnSplitAndDividend) {
    this.calendarYear2ReturnSplitAndDividend = calendarYear2ReturnSplitAndDividend;
    return this;
  }

   /**
   * Two years ago calendar year return including dividends
   * @return calendarYear2ReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Two years ago calendar year return including dividends")
  public BigDecimal getCalendarYear2ReturnSplitAndDividend() {
    return calendarYear2ReturnSplitAndDividend;
  }

  public void setCalendarYear2ReturnSplitAndDividend(BigDecimal calendarYear2ReturnSplitAndDividend) {
    this.calendarYear2ReturnSplitAndDividend = calendarYear2ReturnSplitAndDividend;
  }

  public ETFStats calendarYear2ReturnSplitOnly(BigDecimal calendarYear2ReturnSplitOnly) {
    this.calendarYear2ReturnSplitOnly = calendarYear2ReturnSplitOnly;
    return this;
  }

   /**
   * Two years ago calendar year return excluding dividends
   * @return calendarYear2ReturnSplitOnly
  **/
  @ApiModelProperty(value = "Two years ago calendar year return excluding dividends")
  public BigDecimal getCalendarYear2ReturnSplitOnly() {
    return calendarYear2ReturnSplitOnly;
  }

  public void setCalendarYear2ReturnSplitOnly(BigDecimal calendarYear2ReturnSplitOnly) {
    this.calendarYear2ReturnSplitOnly = calendarYear2ReturnSplitOnly;
  }

  public ETFStats calendarYear1ReturnSplitAndDividend(BigDecimal calendarYear1ReturnSplitAndDividend) {
    this.calendarYear1ReturnSplitAndDividend = calendarYear1ReturnSplitAndDividend;
    return this;
  }

   /**
   * One year ago calendar year return including dividends
   * @return calendarYear1ReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "One year ago calendar year return including dividends")
  public BigDecimal getCalendarYear1ReturnSplitAndDividend() {
    return calendarYear1ReturnSplitAndDividend;
  }

  public void setCalendarYear1ReturnSplitAndDividend(BigDecimal calendarYear1ReturnSplitAndDividend) {
    this.calendarYear1ReturnSplitAndDividend = calendarYear1ReturnSplitAndDividend;
  }

  public ETFStats calendarYear1ReturnSplitOnly(BigDecimal calendarYear1ReturnSplitOnly) {
    this.calendarYear1ReturnSplitOnly = calendarYear1ReturnSplitOnly;
    return this;
  }

   /**
   * One year ago calendar year return excluding dividends
   * @return calendarYear1ReturnSplitOnly
  **/
  @ApiModelProperty(value = "One year ago calendar year return excluding dividends")
  public BigDecimal getCalendarYear1ReturnSplitOnly() {
    return calendarYear1ReturnSplitOnly;
  }

  public void setCalendarYear1ReturnSplitOnly(BigDecimal calendarYear1ReturnSplitOnly) {
    this.calendarYear1ReturnSplitOnly = calendarYear1ReturnSplitOnly;
  }

  public ETFStats calendarYearToDateReturnSplitAndDividend(BigDecimal calendarYearToDateReturnSplitAndDividend) {
    this.calendarYearToDateReturnSplitAndDividend = calendarYearToDateReturnSplitAndDividend;
    return this;
  }

   /**
   * Calendar year to date (YTD) return including dividends
   * @return calendarYearToDateReturnSplitAndDividend
  **/
  @ApiModelProperty(value = "Calendar year to date (YTD) return including dividends")
  public BigDecimal getCalendarYearToDateReturnSplitAndDividend() {
    return calendarYearToDateReturnSplitAndDividend;
  }

  public void setCalendarYearToDateReturnSplitAndDividend(BigDecimal calendarYearToDateReturnSplitAndDividend) {
    this.calendarYearToDateReturnSplitAndDividend = calendarYearToDateReturnSplitAndDividend;
  }

  public ETFStats calendarYearToDateReturnSplitOnly(BigDecimal calendarYearToDateReturnSplitOnly) {
    this.calendarYearToDateReturnSplitOnly = calendarYearToDateReturnSplitOnly;
    return this;
  }

   /**
   * Calendar year to date (YTD) return excluding dividends
   * @return calendarYearToDateReturnSplitOnly
  **/
  @ApiModelProperty(value = "Calendar year to date (YTD) return excluding dividends")
  public BigDecimal getCalendarYearToDateReturnSplitOnly() {
    return calendarYearToDateReturnSplitOnly;
  }

  public void setCalendarYearToDateReturnSplitOnly(BigDecimal calendarYearToDateReturnSplitOnly) {
    this.calendarYearToDateReturnSplitOnly = calendarYearToDateReturnSplitOnly;
  }

  public ETFStats etf(ETFSummary etf) {
    this.etf = etf;
    return this;
  }

   /**
   * A brief summary of the ETF to which these stats refer.  Not included when part of historical stats.
   * @return etf
  **/
  @ApiModelProperty(value = "A brief summary of the ETF to which these stats refer.  Not included when part of historical stats.")
  public ETFSummary getEtf() {
    return etf;
  }

  public void setEtf(ETFSummary etf) {
    this.etf = etf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETFStats etFStats = (ETFStats) o;
    return Objects.equals(this.date, etFStats.date) &&
        Objects.equals(this.netAssetValue, etFStats.netAssetValue) &&
        Objects.equals(this.betaVsSpy, etFStats.betaVsSpy) &&
        Objects.equals(this.trailingOneMonthReturnSplitAndDividend, etFStats.trailingOneMonthReturnSplitAndDividend) &&
        Objects.equals(this.trailingOneMonthReturnSplitOnly, etFStats.trailingOneMonthReturnSplitOnly) &&
        Objects.equals(this.trailingOneYearReturnSplitAndDividend, etFStats.trailingOneYearReturnSplitAndDividend) &&
        Objects.equals(this.trailingOneYearReturnSplitOnly, etFStats.trailingOneYearReturnSplitOnly) &&
        Objects.equals(this.trailingOneYearVolatilityAnnualized, etFStats.trailingOneYearVolatilityAnnualized) &&
        Objects.equals(this.trailingThreeYearAnnualizedReturnSplitAndDividend, etFStats.trailingThreeYearAnnualizedReturnSplitAndDividend) &&
        Objects.equals(this.trailingThreeYearAnnualizedReturnSplitOnly, etFStats.trailingThreeYearAnnualizedReturnSplitOnly) &&
        Objects.equals(this.trailingThreeYearVolatilityAnnualized, etFStats.trailingThreeYearVolatilityAnnualized) &&
        Objects.equals(this.trailingFiveYearAnnualizedReturnSplitAndDividend, etFStats.trailingFiveYearAnnualizedReturnSplitAndDividend) &&
        Objects.equals(this.trailingFiveYearAnnualizedReturnSplitOnly, etFStats.trailingFiveYearAnnualizedReturnSplitOnly) &&
        Objects.equals(this.trailingFiveYearVolatilityAnnualized, etFStats.trailingFiveYearVolatilityAnnualized) &&
        Objects.equals(this.trailingTenYearAnnualizedReturnSplitAndDividend, etFStats.trailingTenYearAnnualizedReturnSplitAndDividend) &&
        Objects.equals(this.trailingTenYearAnnualizedReturnSplitOnly, etFStats.trailingTenYearAnnualizedReturnSplitOnly) &&
        Objects.equals(this.inceptionAnnualizedReturnSplitAndDividend, etFStats.inceptionAnnualizedReturnSplitAndDividend) &&
        Objects.equals(this.inceptionAnnualizedReturnSplitOnly, etFStats.inceptionAnnualizedReturnSplitOnly) &&
        Objects.equals(this.calendarYear5ReturnSplitAndDividend, etFStats.calendarYear5ReturnSplitAndDividend) &&
        Objects.equals(this.calendarYear5ReturnSplitOnly, etFStats.calendarYear5ReturnSplitOnly) &&
        Objects.equals(this.calendarYear4ReturnSplitAndDividend, etFStats.calendarYear4ReturnSplitAndDividend) &&
        Objects.equals(this.calendarYear4ReturnSplitOnly, etFStats.calendarYear4ReturnSplitOnly) &&
        Objects.equals(this.calendarYear3ReturnSplitAndDividend, etFStats.calendarYear3ReturnSplitAndDividend) &&
        Objects.equals(this.calendarYear3ReturnSplitOnly, etFStats.calendarYear3ReturnSplitOnly) &&
        Objects.equals(this.calendarYear2ReturnSplitAndDividend, etFStats.calendarYear2ReturnSplitAndDividend) &&
        Objects.equals(this.calendarYear2ReturnSplitOnly, etFStats.calendarYear2ReturnSplitOnly) &&
        Objects.equals(this.calendarYear1ReturnSplitAndDividend, etFStats.calendarYear1ReturnSplitAndDividend) &&
        Objects.equals(this.calendarYear1ReturnSplitOnly, etFStats.calendarYear1ReturnSplitOnly) &&
        Objects.equals(this.calendarYearToDateReturnSplitAndDividend, etFStats.calendarYearToDateReturnSplitAndDividend) &&
        Objects.equals(this.calendarYearToDateReturnSplitOnly, etFStats.calendarYearToDateReturnSplitOnly) &&
        Objects.equals(this.etf, etFStats.etf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, netAssetValue, betaVsSpy, trailingOneMonthReturnSplitAndDividend, trailingOneMonthReturnSplitOnly, trailingOneYearReturnSplitAndDividend, trailingOneYearReturnSplitOnly, trailingOneYearVolatilityAnnualized, trailingThreeYearAnnualizedReturnSplitAndDividend, trailingThreeYearAnnualizedReturnSplitOnly, trailingThreeYearVolatilityAnnualized, trailingFiveYearAnnualizedReturnSplitAndDividend, trailingFiveYearAnnualizedReturnSplitOnly, trailingFiveYearVolatilityAnnualized, trailingTenYearAnnualizedReturnSplitAndDividend, trailingTenYearAnnualizedReturnSplitOnly, inceptionAnnualizedReturnSplitAndDividend, inceptionAnnualizedReturnSplitOnly, calendarYear5ReturnSplitAndDividend, calendarYear5ReturnSplitOnly, calendarYear4ReturnSplitAndDividend, calendarYear4ReturnSplitOnly, calendarYear3ReturnSplitAndDividend, calendarYear3ReturnSplitOnly, calendarYear2ReturnSplitAndDividend, calendarYear2ReturnSplitOnly, calendarYear1ReturnSplitAndDividend, calendarYear1ReturnSplitOnly, calendarYearToDateReturnSplitAndDividend, calendarYearToDateReturnSplitOnly, etf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFStats {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    netAssetValue: ").append(toIndentedString(netAssetValue)).append("\n");
    sb.append("    betaVsSpy: ").append(toIndentedString(betaVsSpy)).append("\n");
    sb.append("    trailingOneMonthReturnSplitAndDividend: ").append(toIndentedString(trailingOneMonthReturnSplitAndDividend)).append("\n");
    sb.append("    trailingOneMonthReturnSplitOnly: ").append(toIndentedString(trailingOneMonthReturnSplitOnly)).append("\n");
    sb.append("    trailingOneYearReturnSplitAndDividend: ").append(toIndentedString(trailingOneYearReturnSplitAndDividend)).append("\n");
    sb.append("    trailingOneYearReturnSplitOnly: ").append(toIndentedString(trailingOneYearReturnSplitOnly)).append("\n");
    sb.append("    trailingOneYearVolatilityAnnualized: ").append(toIndentedString(trailingOneYearVolatilityAnnualized)).append("\n");
    sb.append("    trailingThreeYearAnnualizedReturnSplitAndDividend: ").append(toIndentedString(trailingThreeYearAnnualizedReturnSplitAndDividend)).append("\n");
    sb.append("    trailingThreeYearAnnualizedReturnSplitOnly: ").append(toIndentedString(trailingThreeYearAnnualizedReturnSplitOnly)).append("\n");
    sb.append("    trailingThreeYearVolatilityAnnualized: ").append(toIndentedString(trailingThreeYearVolatilityAnnualized)).append("\n");
    sb.append("    trailingFiveYearAnnualizedReturnSplitAndDividend: ").append(toIndentedString(trailingFiveYearAnnualizedReturnSplitAndDividend)).append("\n");
    sb.append("    trailingFiveYearAnnualizedReturnSplitOnly: ").append(toIndentedString(trailingFiveYearAnnualizedReturnSplitOnly)).append("\n");
    sb.append("    trailingFiveYearVolatilityAnnualized: ").append(toIndentedString(trailingFiveYearVolatilityAnnualized)).append("\n");
    sb.append("    trailingTenYearAnnualizedReturnSplitAndDividend: ").append(toIndentedString(trailingTenYearAnnualizedReturnSplitAndDividend)).append("\n");
    sb.append("    trailingTenYearAnnualizedReturnSplitOnly: ").append(toIndentedString(trailingTenYearAnnualizedReturnSplitOnly)).append("\n");
    sb.append("    inceptionAnnualizedReturnSplitAndDividend: ").append(toIndentedString(inceptionAnnualizedReturnSplitAndDividend)).append("\n");
    sb.append("    inceptionAnnualizedReturnSplitOnly: ").append(toIndentedString(inceptionAnnualizedReturnSplitOnly)).append("\n");
    sb.append("    calendarYear5ReturnSplitAndDividend: ").append(toIndentedString(calendarYear5ReturnSplitAndDividend)).append("\n");
    sb.append("    calendarYear5ReturnSplitOnly: ").append(toIndentedString(calendarYear5ReturnSplitOnly)).append("\n");
    sb.append("    calendarYear4ReturnSplitAndDividend: ").append(toIndentedString(calendarYear4ReturnSplitAndDividend)).append("\n");
    sb.append("    calendarYear4ReturnSplitOnly: ").append(toIndentedString(calendarYear4ReturnSplitOnly)).append("\n");
    sb.append("    calendarYear3ReturnSplitAndDividend: ").append(toIndentedString(calendarYear3ReturnSplitAndDividend)).append("\n");
    sb.append("    calendarYear3ReturnSplitOnly: ").append(toIndentedString(calendarYear3ReturnSplitOnly)).append("\n");
    sb.append("    calendarYear2ReturnSplitAndDividend: ").append(toIndentedString(calendarYear2ReturnSplitAndDividend)).append("\n");
    sb.append("    calendarYear2ReturnSplitOnly: ").append(toIndentedString(calendarYear2ReturnSplitOnly)).append("\n");
    sb.append("    calendarYear1ReturnSplitAndDividend: ").append(toIndentedString(calendarYear1ReturnSplitAndDividend)).append("\n");
    sb.append("    calendarYear1ReturnSplitOnly: ").append(toIndentedString(calendarYear1ReturnSplitOnly)).append("\n");
    sb.append("    calendarYearToDateReturnSplitAndDividend: ").append(toIndentedString(calendarYearToDateReturnSplitAndDividend)).append("\n");
    sb.append("    calendarYearToDateReturnSplitOnly: ").append(toIndentedString(calendarYearToDateReturnSplitOnly)).append("\n");
    sb.append("    etf: ").append(toIndentedString(etf)).append("\n");
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

