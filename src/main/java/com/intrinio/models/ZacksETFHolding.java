

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
 * Returns detailed information and classifications on exchange traded funds sourced from Zacks.
 */
@ApiModel(description = "Returns detailed information and classifications on exchange traded funds sourced from Zacks.")

public class ZacksETFHolding {
  @SerializedName("etf_ticker")
  private String etfTicker = null;

  @SerializedName("etf_name")
  private String etfName = null;

  @SerializedName("holding_symbol")
  private String holdingSymbol = null;

  @SerializedName("holding_name")
  private String holdingName = null;

  @SerializedName("date_of_holding")
  private LocalDate dateOfHolding = null;

  @SerializedName("shares")
  private BigDecimal shares = null;

  @SerializedName("weight")
  private BigDecimal weight = null;

  public ZacksETFHolding etfTicker(String etfTicker) {
    this.etfTicker = etfTicker;
    return this;
  }

   /**
   * The ETF&#39;s common ticker
   * @return etfTicker
  **/
  @ApiModelProperty(value = "The ETF's common ticker")
  public String getEtfTicker() {
    return etfTicker;
  }

  public void setEtfTicker(String etfTicker) {
    this.etfTicker = etfTicker;
  }

  public ZacksETFHolding etfName(String etfName) {
    this.etfName = etfName;
    return this;
  }

   /**
   * The ETF&#39;s name
   * @return etfName
  **/
  @ApiModelProperty(value = "The ETF's name")
  public String getEtfName() {
    return etfName;
  }

  public void setEtfName(String etfName) {
    this.etfName = etfName;
  }

  public ZacksETFHolding holdingSymbol(String holdingSymbol) {
    this.holdingSymbol = holdingSymbol;
    return this;
  }

   /**
   * The holding&#39;s common ticker
   * @return holdingSymbol
  **/
  @ApiModelProperty(value = "The holding's common ticker")
  public String getHoldingSymbol() {
    return holdingSymbol;
  }

  public void setHoldingSymbol(String holdingSymbol) {
    this.holdingSymbol = holdingSymbol;
  }

  public ZacksETFHolding holdingName(String holdingName) {
    this.holdingName = holdingName;
    return this;
  }

   /**
   * The holding&#39;s name
   * @return holdingName
  **/
  @ApiModelProperty(value = "The holding's name")
  public String getHoldingName() {
    return holdingName;
  }

  public void setHoldingName(String holdingName) {
    this.holdingName = holdingName;
  }

  public ZacksETFHolding dateOfHolding(LocalDate dateOfHolding) {
    this.dateOfHolding = dateOfHolding;
    return this;
  }

   /**
   * The date of the holding
   * @return dateOfHolding
  **/
  @ApiModelProperty(value = "The date of the holding")
  public LocalDate getDateOfHolding() {
    return dateOfHolding;
  }

  public void setDateOfHolding(LocalDate dateOfHolding) {
    this.dateOfHolding = dateOfHolding;
  }

  public ZacksETFHolding shares(BigDecimal shares) {
    this.shares = shares;
    return this;
  }

   /**
   * The number of shares
   * @return shares
  **/
  @ApiModelProperty(value = "The number of shares")
  public BigDecimal getShares() {
    return shares;
  }

  public void setShares(BigDecimal shares) {
    this.shares = shares;
  }

  public ZacksETFHolding weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * The weight of the holding
   * @return weight
  **/
  @ApiModelProperty(value = "The weight of the holding")
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksETFHolding zacksETFHolding = (ZacksETFHolding) o;
    return Objects.equals(this.etfTicker, zacksETFHolding.etfTicker) &&
        Objects.equals(this.etfName, zacksETFHolding.etfName) &&
        Objects.equals(this.holdingSymbol, zacksETFHolding.holdingSymbol) &&
        Objects.equals(this.holdingName, zacksETFHolding.holdingName) &&
        Objects.equals(this.dateOfHolding, zacksETFHolding.dateOfHolding) &&
        Objects.equals(this.shares, zacksETFHolding.shares) &&
        Objects.equals(this.weight, zacksETFHolding.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etfTicker, etfName, holdingSymbol, holdingName, dateOfHolding, shares, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksETFHolding {\n");
    
    sb.append("    etfTicker: ").append(toIndentedString(etfTicker)).append("\n");
    sb.append("    etfName: ").append(toIndentedString(etfName)).append("\n");
    sb.append("    holdingSymbol: ").append(toIndentedString(holdingSymbol)).append("\n");
    sb.append("    holdingName: ").append(toIndentedString(holdingName)).append("\n");
    sb.append("    dateOfHolding: ").append(toIndentedString(dateOfHolding)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

