

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
 * Zacks Forward PE Estimates
 */
@ApiModel(description = "Zacks Forward PE Estimates")

public class ZacksForwardPE {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("forward_pe_year1")
  private BigDecimal forwardPeYear1 = null;

  @SerializedName("forward_pe_year2")
  private BigDecimal forwardPeYear2 = null;

  @SerializedName("forward_pe_year3")
  private BigDecimal forwardPeYear3 = null;

  @SerializedName("forward_pe_year4")
  private BigDecimal forwardPeYear4 = null;

  @SerializedName("forward_pe_year5")
  private BigDecimal forwardPeYear5 = null;

  @SerializedName("forward_peg_ratio_year1")
  private BigDecimal forwardPegRatioYear1 = null;

  @SerializedName("last_ttm_eps")
  private BigDecimal lastTtmEps = null;

  public ZacksForwardPE ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The Zacks common exchange ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "The Zacks common exchange ticker")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public ZacksForwardPE companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * The company name
   * @return companyName
  **/
  @ApiModelProperty(value = "The company name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public ZacksForwardPE forwardPeYear1(BigDecimal forwardPeYear1) {
    this.forwardPeYear1 = forwardPeYear1;
    return this;
  }

   /**
   * The forward PE estimate for the first year
   * @return forwardPeYear1
  **/
  @ApiModelProperty(value = "The forward PE estimate for the first year")
  public BigDecimal getForwardPeYear1() {
    return forwardPeYear1;
  }

  public void setForwardPeYear1(BigDecimal forwardPeYear1) {
    this.forwardPeYear1 = forwardPeYear1;
  }

  public ZacksForwardPE forwardPeYear2(BigDecimal forwardPeYear2) {
    this.forwardPeYear2 = forwardPeYear2;
    return this;
  }

   /**
   * The forward PE estimate for the second year
   * @return forwardPeYear2
  **/
  @ApiModelProperty(value = "The forward PE estimate for the second year")
  public BigDecimal getForwardPeYear2() {
    return forwardPeYear2;
  }

  public void setForwardPeYear2(BigDecimal forwardPeYear2) {
    this.forwardPeYear2 = forwardPeYear2;
  }

  public ZacksForwardPE forwardPeYear3(BigDecimal forwardPeYear3) {
    this.forwardPeYear3 = forwardPeYear3;
    return this;
  }

   /**
   * The forward PE estimate for the third year
   * @return forwardPeYear3
  **/
  @ApiModelProperty(value = "The forward PE estimate for the third year")
  public BigDecimal getForwardPeYear3() {
    return forwardPeYear3;
  }

  public void setForwardPeYear3(BigDecimal forwardPeYear3) {
    this.forwardPeYear3 = forwardPeYear3;
  }

  public ZacksForwardPE forwardPeYear4(BigDecimal forwardPeYear4) {
    this.forwardPeYear4 = forwardPeYear4;
    return this;
  }

   /**
   * The forward PE estimate for the fourth year
   * @return forwardPeYear4
  **/
  @ApiModelProperty(value = "The forward PE estimate for the fourth year")
  public BigDecimal getForwardPeYear4() {
    return forwardPeYear4;
  }

  public void setForwardPeYear4(BigDecimal forwardPeYear4) {
    this.forwardPeYear4 = forwardPeYear4;
  }

  public ZacksForwardPE forwardPeYear5(BigDecimal forwardPeYear5) {
    this.forwardPeYear5 = forwardPeYear5;
    return this;
  }

   /**
   * The forward PE estimate for the fifth year
   * @return forwardPeYear5
  **/
  @ApiModelProperty(value = "The forward PE estimate for the fifth year")
  public BigDecimal getForwardPeYear5() {
    return forwardPeYear5;
  }

  public void setForwardPeYear5(BigDecimal forwardPeYear5) {
    this.forwardPeYear5 = forwardPeYear5;
  }

  public ZacksForwardPE forwardPegRatioYear1(BigDecimal forwardPegRatioYear1) {
    this.forwardPegRatioYear1 = forwardPegRatioYear1;
    return this;
  }

   /**
   * The forward PEG ratio for the first year
   * @return forwardPegRatioYear1
  **/
  @ApiModelProperty(value = "The forward PEG ratio for the first year")
  public BigDecimal getForwardPegRatioYear1() {
    return forwardPegRatioYear1;
  }

  public void setForwardPegRatioYear1(BigDecimal forwardPegRatioYear1) {
    this.forwardPegRatioYear1 = forwardPegRatioYear1;
  }

  public ZacksForwardPE lastTtmEps(BigDecimal lastTtmEps) {
    this.lastTtmEps = lastTtmEps;
    return this;
  }

   /**
   * Trailing twelve months earnings per share
   * @return lastTtmEps
  **/
  @ApiModelProperty(value = "Trailing twelve months earnings per share")
  public BigDecimal getLastTtmEps() {
    return lastTtmEps;
  }

  public void setLastTtmEps(BigDecimal lastTtmEps) {
    this.lastTtmEps = lastTtmEps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksForwardPE zacksForwardPE = (ZacksForwardPE) o;
    return Objects.equals(this.ticker, zacksForwardPE.ticker) &&
        Objects.equals(this.companyName, zacksForwardPE.companyName) &&
        Objects.equals(this.forwardPeYear1, zacksForwardPE.forwardPeYear1) &&
        Objects.equals(this.forwardPeYear2, zacksForwardPE.forwardPeYear2) &&
        Objects.equals(this.forwardPeYear3, zacksForwardPE.forwardPeYear3) &&
        Objects.equals(this.forwardPeYear4, zacksForwardPE.forwardPeYear4) &&
        Objects.equals(this.forwardPeYear5, zacksForwardPE.forwardPeYear5) &&
        Objects.equals(this.forwardPegRatioYear1, zacksForwardPE.forwardPegRatioYear1) &&
        Objects.equals(this.lastTtmEps, zacksForwardPE.lastTtmEps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, companyName, forwardPeYear1, forwardPeYear2, forwardPeYear3, forwardPeYear4, forwardPeYear5, forwardPegRatioYear1, lastTtmEps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksForwardPE {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    forwardPeYear1: ").append(toIndentedString(forwardPeYear1)).append("\n");
    sb.append("    forwardPeYear2: ").append(toIndentedString(forwardPeYear2)).append("\n");
    sb.append("    forwardPeYear3: ").append(toIndentedString(forwardPeYear3)).append("\n");
    sb.append("    forwardPeYear4: ").append(toIndentedString(forwardPeYear4)).append("\n");
    sb.append("    forwardPeYear5: ").append(toIndentedString(forwardPeYear5)).append("\n");
    sb.append("    forwardPegRatioYear1: ").append(toIndentedString(forwardPegRatioYear1)).append("\n");
    sb.append("    lastTtmEps: ").append(toIndentedString(lastTtmEps)).append("\n");
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

