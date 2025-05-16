

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

public class OptionSyntheticGreeksRealtime {
  @SerializedName("implied_volatility")
  private BigDecimal impliedVolatility = null;

  @SerializedName("delta")
  private BigDecimal delta = null;

  @SerializedName("gamma")
  private BigDecimal gamma = null;

  @SerializedName("theta")
  private BigDecimal theta = null;

  @SerializedName("vega")
  private BigDecimal vega = null;

  @SerializedName("synthetic_price")
  private BigDecimal syntheticPrice = null;

  public OptionSyntheticGreeksRealtime impliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * The implied volatility of the contract calculated using the Black-Scholes Model.
   * @return impliedVolatility
  **/
  @ApiModelProperty(value = "The implied volatility of the contract calculated using the Black-Scholes Model.")
  public BigDecimal getImpliedVolatility() {
    return impliedVolatility;
  }

  public void setImpliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }

  public OptionSyntheticGreeksRealtime delta(BigDecimal delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Delta represents the rate of change between the option&#39;s price and a $1 change in the underlying asset&#39;s price.
   * @return delta
  **/
  @ApiModelProperty(value = "Delta represents the rate of change between the option's price and a $1 change in the underlying asset's price.")
  public BigDecimal getDelta() {
    return delta;
  }

  public void setDelta(BigDecimal delta) {
    this.delta = delta;
  }

  public OptionSyntheticGreeksRealtime gamma(BigDecimal gamma) {
    this.gamma = gamma;
    return this;
  }

   /**
   * Gamma represents the rate of change between an option&#39;s delta and the underlying asset&#39;s price.
   * @return gamma
  **/
  @ApiModelProperty(value = "Gamma represents the rate of change between an option's delta and the underlying asset's price.")
  public BigDecimal getGamma() {
    return gamma;
  }

  public void setGamma(BigDecimal gamma) {
    this.gamma = gamma;
  }

  public OptionSyntheticGreeksRealtime theta(BigDecimal theta) {
    this.theta = theta;
    return this;
  }

   /**
   * Theta represents the rate of change between the option price and time, or time sensitivity - sometimes known as an option&#39;s time decay.
   * @return theta
  **/
  @ApiModelProperty(value = "Theta represents the rate of change between the option price and time, or time sensitivity - sometimes known as an option's time decay.")
  public BigDecimal getTheta() {
    return theta;
  }

  public void setTheta(BigDecimal theta) {
    this.theta = theta;
  }

  public OptionSyntheticGreeksRealtime vega(BigDecimal vega) {
    this.vega = vega;
    return this;
  }

   /**
   * Vega represents the rate of change between an option&#39;s value and the underlying asset&#39;s implied volatility.
   * @return vega
  **/
  @ApiModelProperty(value = "Vega represents the rate of change between an option's value and the underlying asset's implied volatility.")
  public BigDecimal getVega() {
    return vega;
  }

  public void setVega(BigDecimal vega) {
    this.vega = vega;
  }

  public OptionSyntheticGreeksRealtime syntheticPrice(BigDecimal syntheticPrice) {
    this.syntheticPrice = syntheticPrice;
    return this;
  }

   /**
   * The derived synthetic price of the contract.
   * @return syntheticPrice
  **/
  @ApiModelProperty(value = "The derived synthetic price of the contract.")
  public BigDecimal getSyntheticPrice() {
    return syntheticPrice;
  }

  public void setSyntheticPrice(BigDecimal syntheticPrice) {
    this.syntheticPrice = syntheticPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionSyntheticGreeksRealtime optionSyntheticGreeksRealtime = (OptionSyntheticGreeksRealtime) o;
    return Objects.equals(this.impliedVolatility, optionSyntheticGreeksRealtime.impliedVolatility) &&
        Objects.equals(this.delta, optionSyntheticGreeksRealtime.delta) &&
        Objects.equals(this.gamma, optionSyntheticGreeksRealtime.gamma) &&
        Objects.equals(this.theta, optionSyntheticGreeksRealtime.theta) &&
        Objects.equals(this.vega, optionSyntheticGreeksRealtime.vega) &&
        Objects.equals(this.syntheticPrice, optionSyntheticGreeksRealtime.syntheticPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impliedVolatility, delta, gamma, theta, vega, syntheticPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionSyntheticGreeksRealtime {\n");
    
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
    sb.append("    theta: ").append(toIndentedString(theta)).append("\n");
    sb.append("    vega: ").append(toIndentedString(vega)).append("\n");
    sb.append("    syntheticPrice: ").append(toIndentedString(syntheticPrice)).append("\n");
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

