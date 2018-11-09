

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
 * A stock price adjustment for a security on a given day, most frequently representing a split and/or dividend.
 */
@ApiModel(description = "A stock price adjustment for a security on a given day, most frequently representing a split and/or dividend.")

public class StockPriceAdjustment {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("factor")
  private BigDecimal factor = null;

  @SerializedName("dividend")
  private BigDecimal dividend = null;

  @SerializedName("dividend_currency")
  private String dividendCurrency = null;

  @SerializedName("split_ratio")
  private BigDecimal splitRatio = null;

  public StockPriceAdjustment date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date on which the adjustment occurred. The adjustment should be applied to all stock prices before this date.
   * @return date
  **/
  @ApiModelProperty(value = "The date on which the adjustment occurred. The adjustment should be applied to all stock prices before this date.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public StockPriceAdjustment factor(BigDecimal factor) {
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

  public StockPriceAdjustment dividend(BigDecimal dividend) {
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

  public StockPriceAdjustment dividendCurrency(String dividendCurrency) {
    this.dividendCurrency = dividendCurrency;
    return this;
  }

   /**
   * The currency of the dividend, if known.
   * @return dividendCurrency
  **/
  @ApiModelProperty(value = "The currency of the dividend, if known.")
  public String getDividendCurrency() {
    return dividendCurrency;
  }

  public void setDividendCurrency(String dividendCurrency) {
    this.dividendCurrency = dividendCurrency;
  }

  public StockPriceAdjustment splitRatio(BigDecimal splitRatio) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockPriceAdjustment stockPriceAdjustment = (StockPriceAdjustment) o;
    return Objects.equals(this.date, stockPriceAdjustment.date) &&
        Objects.equals(this.factor, stockPriceAdjustment.factor) &&
        Objects.equals(this.dividend, stockPriceAdjustment.dividend) &&
        Objects.equals(this.dividendCurrency, stockPriceAdjustment.dividendCurrency) &&
        Objects.equals(this.splitRatio, stockPriceAdjustment.splitRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, factor, dividend, dividendCurrency, splitRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockPriceAdjustment {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    dividend: ").append(toIndentedString(dividend)).append("\n");
    sb.append("    dividendCurrency: ").append(toIndentedString(dividendCurrency)).append("\n");
    sb.append("    splitRatio: ").append(toIndentedString(splitRatio)).append("\n");
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

