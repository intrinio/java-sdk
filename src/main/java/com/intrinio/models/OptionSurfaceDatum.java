

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
 * Realtime stats such as greeks and implied volatility for a specific options contract.
 */
@ApiModel(description = "Realtime stats such as greeks and implied volatility for a specific options contract.")

public class OptionSurfaceDatum {
  @SerializedName("strike_price")
  private BigDecimal strikePrice = null;

  @SerializedName("unix_timestamp")
  private BigDecimal unixTimestamp = null;

  @SerializedName("forward_natural_log_moneyness")
  private BigDecimal forwardNaturalLogMoneyness = null;

  @SerializedName("square_root_tau")
  private BigDecimal squareRootTau = null;

  @SerializedName("implied_volatility")
  private BigDecimal impliedVolatility = null;

  public OptionSurfaceDatum strikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * The actual strike price.  Present when the requesting surface type is raw.
   * @return strikePrice
  **/
  @ApiModelProperty(value = "The actual strike price.  Present when the requesting surface type is raw.")
  public BigDecimal getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
  }

  public OptionSurfaceDatum unixTimestamp(BigDecimal unixTimestamp) {
    this.unixTimestamp = unixTimestamp;
    return this;
  }

   /**
   * The expiration DateTime.  Present when the requesting surface type is raw.
   * @return unixTimestamp
  **/
  @ApiModelProperty(value = "The expiration DateTime.  Present when the requesting surface type is raw.")
  public BigDecimal getUnixTimestamp() {
    return unixTimestamp;
  }

  public void setUnixTimestamp(BigDecimal unixTimestamp) {
    this.unixTimestamp = unixTimestamp;
  }

  public OptionSurfaceDatum forwardNaturalLogMoneyness(BigDecimal forwardNaturalLogMoneyness) {
    this.forwardNaturalLogMoneyness = forwardNaturalLogMoneyness;
    return this;
  }

   /**
   * The natural logarithm of forward moneyness, calculated as ln(F / K), where F is the forward underlying price adjusted for risk-free rate and dividend yield over time to expiration, and K is the option strike. Present when the requesting surface type is something other than raw.
   * @return forwardNaturalLogMoneyness
  **/
  @ApiModelProperty(value = "The natural logarithm of forward moneyness, calculated as ln(F / K), where F is the forward underlying price adjusted for risk-free rate and dividend yield over time to expiration, and K is the option strike. Present when the requesting surface type is something other than raw.")
  public BigDecimal getForwardNaturalLogMoneyness() {
    return forwardNaturalLogMoneyness;
  }

  public void setForwardNaturalLogMoneyness(BigDecimal forwardNaturalLogMoneyness) {
    this.forwardNaturalLogMoneyness = forwardNaturalLogMoneyness;
  }

  public OptionSurfaceDatum squareRootTau(BigDecimal squareRootTau) {
    this.squareRootTau = squareRootTau;
    return this;
  }

   /**
   * The square root of tau, where tau is the option’s time to expiration in years using a 365.25-day year basis. Present when the requesting surface type is something other than raw.
   * @return squareRootTau
  **/
  @ApiModelProperty(value = "The square root of tau, where tau is the option’s time to expiration in years using a 365.25-day year basis. Present when the requesting surface type is something other than raw.")
  public BigDecimal getSquareRootTau() {
    return squareRootTau;
  }

  public void setSquareRootTau(BigDecimal squareRootTau) {
    this.squareRootTau = squareRootTau;
  }

  public OptionSurfaceDatum impliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * The implied volatility of the contract calculated using the Black-Scholes Model, and smoothed if the requesting surface type was logarithmic_smoothed. Always present.
   * @return impliedVolatility
  **/
  @ApiModelProperty(value = "The implied volatility of the contract calculated using the Black-Scholes Model, and smoothed if the requesting surface type was logarithmic_smoothed. Always present.")
  public BigDecimal getImpliedVolatility() {
    return impliedVolatility;
  }

  public void setImpliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionSurfaceDatum optionSurfaceDatum = (OptionSurfaceDatum) o;
    return Objects.equals(this.strikePrice, optionSurfaceDatum.strikePrice) &&
        Objects.equals(this.unixTimestamp, optionSurfaceDatum.unixTimestamp) &&
        Objects.equals(this.forwardNaturalLogMoneyness, optionSurfaceDatum.forwardNaturalLogMoneyness) &&
        Objects.equals(this.squareRootTau, optionSurfaceDatum.squareRootTau) &&
        Objects.equals(this.impliedVolatility, optionSurfaceDatum.impliedVolatility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strikePrice, unixTimestamp, forwardNaturalLogMoneyness, squareRootTau, impliedVolatility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionSurfaceDatum {\n");
    
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    unixTimestamp: ").append(toIndentedString(unixTimestamp)).append("\n");
    sb.append("    forwardNaturalLogMoneyness: ").append(toIndentedString(forwardNaturalLogMoneyness)).append("\n");
    sb.append("    squareRootTau: ").append(toIndentedString(squareRootTau)).append("\n");
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
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

