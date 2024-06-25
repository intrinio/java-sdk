

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
 * Realtime factors for calculating stats such as greeks and implied volatility for a specific options contract.
 */
@ApiModel(description = "Realtime factors for calculating stats such as greeks and implied volatility for a specific options contract.")

public class OptionFactorsRealtime {
  @SerializedName("market_price")
  private BigDecimal marketPrice = null;

  @SerializedName("underlying_price")
  private BigDecimal underlyingPrice = null;

  @SerializedName("strike_price")
  private BigDecimal strikePrice = null;

  @SerializedName("days_to_expiration")
  private BigDecimal daysToExpiration = null;

  @SerializedName("risk_free_interest_rate")
  private BigDecimal riskFreeInterestRate = null;

  @SerializedName("dividend_yield")
  private BigDecimal dividendYield = null;

  public OptionFactorsRealtime marketPrice(BigDecimal marketPrice) {
    this.marketPrice = marketPrice;
    return this;
  }

   /**
   * The market price of the options contract
   * @return marketPrice
  **/
  @ApiModelProperty(value = "The market price of the options contract")
  public BigDecimal getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(BigDecimal marketPrice) {
    this.marketPrice = marketPrice;
  }

  public OptionFactorsRealtime underlyingPrice(BigDecimal underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
    return this;
  }

   /**
   * The market price of the underlying asset
   * @return underlyingPrice
  **/
  @ApiModelProperty(value = "The market price of the underlying asset")
  public BigDecimal getUnderlyingPrice() {
    return underlyingPrice;
  }

  public void setUnderlyingPrice(BigDecimal underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
  }

  public OptionFactorsRealtime strikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * The strike price of the options contract
   * @return strikePrice
  **/
  @ApiModelProperty(value = "The strike price of the options contract")
  public BigDecimal getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
  }

  public OptionFactorsRealtime daysToExpiration(BigDecimal daysToExpiration) {
    this.daysToExpiration = daysToExpiration;
    return this;
  }

   /**
   * The number of days to expiration
   * @return daysToExpiration
  **/
  @ApiModelProperty(value = "The number of days to expiration")
  public BigDecimal getDaysToExpiration() {
    return daysToExpiration;
  }

  public void setDaysToExpiration(BigDecimal daysToExpiration) {
    this.daysToExpiration = daysToExpiration;
  }

  public OptionFactorsRealtime riskFreeInterestRate(BigDecimal riskFreeInterestRate) {
    this.riskFreeInterestRate = riskFreeInterestRate;
    return this;
  }

   /**
   * The current risk-free interest rate, as measured by the 3-month Treasury Bill rate
   * @return riskFreeInterestRate
  **/
  @ApiModelProperty(value = "The current risk-free interest rate, as measured by the 3-month Treasury Bill rate")
  public BigDecimal getRiskFreeInterestRate() {
    return riskFreeInterestRate;
  }

  public void setRiskFreeInterestRate(BigDecimal riskFreeInterestRate) {
    this.riskFreeInterestRate = riskFreeInterestRate;
  }

  public OptionFactorsRealtime dividendYield(BigDecimal dividendYield) {
    this.dividendYield = dividendYield;
    return this;
  }

   /**
   * The dividend yield of the underlying asset (if applicable)
   * @return dividendYield
  **/
  @ApiModelProperty(value = "The dividend yield of the underlying asset (if applicable)")
  public BigDecimal getDividendYield() {
    return dividendYield;
  }

  public void setDividendYield(BigDecimal dividendYield) {
    this.dividendYield = dividendYield;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionFactorsRealtime optionFactorsRealtime = (OptionFactorsRealtime) o;
    return Objects.equals(this.marketPrice, optionFactorsRealtime.marketPrice) &&
        Objects.equals(this.underlyingPrice, optionFactorsRealtime.underlyingPrice) &&
        Objects.equals(this.strikePrice, optionFactorsRealtime.strikePrice) &&
        Objects.equals(this.daysToExpiration, optionFactorsRealtime.daysToExpiration) &&
        Objects.equals(this.riskFreeInterestRate, optionFactorsRealtime.riskFreeInterestRate) &&
        Objects.equals(this.dividendYield, optionFactorsRealtime.dividendYield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketPrice, underlyingPrice, strikePrice, daysToExpiration, riskFreeInterestRate, dividendYield);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionFactorsRealtime {\n");
    
    sb.append("    marketPrice: ").append(toIndentedString(marketPrice)).append("\n");
    sb.append("    underlyingPrice: ").append(toIndentedString(underlyingPrice)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    daysToExpiration: ").append(toIndentedString(daysToExpiration)).append("\n");
    sb.append("    riskFreeInterestRate: ").append(toIndentedString(riskFreeInterestRate)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
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

