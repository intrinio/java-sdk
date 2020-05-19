

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
 * The Exchange Traded Fund (ETF) holding data
 */
@ApiModel(description = "The Exchange Traded Fund (ETF) holding data")

public class ETFHolding {
  @SerializedName("as_of_date")
  private LocalDate asOfDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("composite_figi")
  private String compositeFigi = null;

  @SerializedName("isin")
  private String isin = null;

  @SerializedName("ric")
  private String ric = null;

  @SerializedName("sedol")
  private String sedol = null;

  @SerializedName("face")
  private BigDecimal face = null;

  @SerializedName("coupon")
  private BigDecimal coupon = null;

  @SerializedName("market_value_held")
  private BigDecimal marketValueHeld = null;

  @SerializedName("notional_value")
  private BigDecimal notionalValue = null;

  @SerializedName("maturity")
  private LocalDate maturity = null;

  @SerializedName("quantity_held")
  private BigDecimal quantityHeld = null;

  @SerializedName("weighting")
  private BigDecimal weighting = null;

  @SerializedName("quantity_units")
  private BigDecimal quantityUnits = null;

  @SerializedName("quantity_per_share")
  private BigDecimal quantityPerShare = null;

  @SerializedName("contract_expiry_date")
  private LocalDate contractExpiryDate = null;

  public ETFHolding asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * The date on which the holding and their weights correspond
   * @return asOfDate
  **/
  @ApiModelProperty(value = "The date on which the holding and their weights correspond")
  public LocalDate getAsOfDate() {
    return asOfDate;
  }

  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }

  public ETFHolding name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The common name for the holding
   * @return name
  **/
  @ApiModelProperty(value = "The common name for the holding")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ETFHolding ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The common exchange ticker for the holding
   * @return ticker
  **/
  @ApiModelProperty(value = "The common exchange ticker for the holding")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public ETFHolding type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of instrument for this holding.  Examples (Bond &#x3D; &#39;BOND&#39;, Equity &#x3D; &#39;EQUI&#39;, Options &#x3D; &#39;OPTN&#39;)
   * @return type
  **/
  @ApiModelProperty(value = "The type of instrument for this holding.  Examples (Bond = 'BOND', Equity = 'EQUI', Options = 'OPTN')")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ETFHolding compositeFigi(String compositeFigi) {
    this.compositeFigi = compositeFigi;
    return this;
  }

   /**
   * The OpenFIGI ticker for the holding
   * @return compositeFigi
  **/
  @ApiModelProperty(value = "The OpenFIGI ticker for the holding")
  public String getCompositeFigi() {
    return compositeFigi;
  }

  public void setCompositeFigi(String compositeFigi) {
    this.compositeFigi = compositeFigi;
  }

  public ETFHolding isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * International Securities Identification Number (ISIN) for the holding
   * @return isin
  **/
  @ApiModelProperty(value = "International Securities Identification Number (ISIN) for the holding")
  public String getIsin() {
    return isin;
  }

  public void setIsin(String isin) {
    this.isin = isin;
  }

  public ETFHolding ric(String ric) {
    this.ric = ric;
    return this;
  }

   /**
   * Reuters Instrument Code (RIC) for the holding
   * @return ric
  **/
  @ApiModelProperty(value = "Reuters Instrument Code (RIC) for the holding")
  public String getRic() {
    return ric;
  }

  public void setRic(String ric) {
    this.ric = ric;
  }

  public ETFHolding sedol(String sedol) {
    this.sedol = sedol;
    return this;
  }

   /**
   * Stock Exchange Daily Official List (SEDOL) for the holding
   * @return sedol
  **/
  @ApiModelProperty(value = "Stock Exchange Daily Official List (SEDOL) for the holding")
  public String getSedol() {
    return sedol;
  }

  public void setSedol(String sedol) {
    this.sedol = sedol;
  }

  public ETFHolding face(BigDecimal face) {
    this.face = face;
    return this;
  }

   /**
   * Face value of the debt security, if available
   * @return face
  **/
  @ApiModelProperty(value = "Face value of the debt security, if available")
  public BigDecimal getFace() {
    return face;
  }

  public void setFace(BigDecimal face) {
    this.face = face;
  }

  public ETFHolding coupon(BigDecimal coupon) {
    this.coupon = coupon;
    return this;
  }

   /**
   * Coupon rate of the debt security, if available
   * @return coupon
  **/
  @ApiModelProperty(value = "Coupon rate of the debt security, if available")
  public BigDecimal getCoupon() {
    return coupon;
  }

  public void setCoupon(BigDecimal coupon) {
    this.coupon = coupon;
  }

  public ETFHolding marketValueHeld(BigDecimal marketValueHeld) {
    this.marketValueHeld = marketValueHeld;
    return this;
  }

   /**
   * The market value of this holding in the ETF as of the &#x60;as_of_date&#x60;
   * @return marketValueHeld
  **/
  @ApiModelProperty(value = "The market value of this holding in the ETF as of the `as_of_date`")
  public BigDecimal getMarketValueHeld() {
    return marketValueHeld;
  }

  public void setMarketValueHeld(BigDecimal marketValueHeld) {
    this.marketValueHeld = marketValueHeld;
  }

  public ETFHolding notionalValue(BigDecimal notionalValue) {
    this.notionalValue = notionalValue;
    return this;
  }

   /**
   * Notional value of derivatives contracts held in the Exchange Traded Fund (ETF) or Exchange Traded Note (ETN)
   * @return notionalValue
  **/
  @ApiModelProperty(value = "Notional value of derivatives contracts held in the Exchange Traded Fund (ETF) or Exchange Traded Note (ETN)")
  public BigDecimal getNotionalValue() {
    return notionalValue;
  }

  public void setNotionalValue(BigDecimal notionalValue) {
    this.notionalValue = notionalValue;
  }

  public ETFHolding maturity(LocalDate maturity) {
    this.maturity = maturity;
    return this;
  }

   /**
   * Maturity date for the debt security, if available
   * @return maturity
  **/
  @ApiModelProperty(value = "Maturity date for the debt security, if available")
  public LocalDate getMaturity() {
    return maturity;
  }

  public void setMaturity(LocalDate maturity) {
    this.maturity = maturity;
  }

  public ETFHolding quantityHeld(BigDecimal quantityHeld) {
    this.quantityHeld = quantityHeld;
    return this;
  }

   /**
   * Number of units of the security held if available
   * @return quantityHeld
  **/
  @ApiModelProperty(value = "Number of units of the security held if available")
  public BigDecimal getQuantityHeld() {
    return quantityHeld;
  }

  public void setQuantityHeld(BigDecimal quantityHeld) {
    this.quantityHeld = quantityHeld;
  }

  public ETFHolding weighting(BigDecimal weighting) {
    this.weighting = weighting;
    return this;
  }

   /**
   * Fraction of the funds market value held
   * @return weighting
  **/
  @ApiModelProperty(value = "Fraction of the funds market value held")
  public BigDecimal getWeighting() {
    return weighting;
  }

  public void setWeighting(BigDecimal weighting) {
    this.weighting = weighting;
  }

  public ETFHolding quantityUnits(BigDecimal quantityUnits) {
    this.quantityUnits = quantityUnits;
    return this;
  }

   /**
   * The unit of the &#x60;quanity_held&#x60; field. Examples (&#39;oz&#39;, &#39;shares&#39;, &#39;contracts&#39;)
   * @return quantityUnits
  **/
  @ApiModelProperty(value = "The unit of the `quanity_held` field. Examples ('oz', 'shares', 'contracts')")
  public BigDecimal getQuantityUnits() {
    return quantityUnits;
  }

  public void setQuantityUnits(BigDecimal quantityUnits) {
    this.quantityUnits = quantityUnits;
  }

  public ETFHolding quantityPerShare(BigDecimal quantityPerShare) {
    this.quantityPerShare = quantityPerShare;
    return this;
  }

   /**
   * Number of units of the security held per units of shares outstanding of the Exchange Traded Fund (ETF), if available
   * @return quantityPerShare
  **/
  @ApiModelProperty(value = "Number of units of the security held per units of shares outstanding of the Exchange Traded Fund (ETF), if available")
  public BigDecimal getQuantityPerShare() {
    return quantityPerShare;
  }

  public void setQuantityPerShare(BigDecimal quantityPerShare) {
    this.quantityPerShare = quantityPerShare;
  }

  public ETFHolding contractExpiryDate(LocalDate contractExpiryDate) {
    this.contractExpiryDate = contractExpiryDate;
    return this;
  }

   /**
   * Expiry date for the futures contract held in the Exchange Traded Fund (ETF) or Exchange Traded Note (ETN)
   * @return contractExpiryDate
  **/
  @ApiModelProperty(value = "Expiry date for the futures contract held in the Exchange Traded Fund (ETF) or Exchange Traded Note (ETN)")
  public LocalDate getContractExpiryDate() {
    return contractExpiryDate;
  }

  public void setContractExpiryDate(LocalDate contractExpiryDate) {
    this.contractExpiryDate = contractExpiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETFHolding etFHolding = (ETFHolding) o;
    return Objects.equals(this.asOfDate, etFHolding.asOfDate) &&
        Objects.equals(this.name, etFHolding.name) &&
        Objects.equals(this.ticker, etFHolding.ticker) &&
        Objects.equals(this.type, etFHolding.type) &&
        Objects.equals(this.compositeFigi, etFHolding.compositeFigi) &&
        Objects.equals(this.isin, etFHolding.isin) &&
        Objects.equals(this.ric, etFHolding.ric) &&
        Objects.equals(this.sedol, etFHolding.sedol) &&
        Objects.equals(this.face, etFHolding.face) &&
        Objects.equals(this.coupon, etFHolding.coupon) &&
        Objects.equals(this.marketValueHeld, etFHolding.marketValueHeld) &&
        Objects.equals(this.notionalValue, etFHolding.notionalValue) &&
        Objects.equals(this.maturity, etFHolding.maturity) &&
        Objects.equals(this.quantityHeld, etFHolding.quantityHeld) &&
        Objects.equals(this.weighting, etFHolding.weighting) &&
        Objects.equals(this.quantityUnits, etFHolding.quantityUnits) &&
        Objects.equals(this.quantityPerShare, etFHolding.quantityPerShare) &&
        Objects.equals(this.contractExpiryDate, etFHolding.contractExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, name, ticker, type, compositeFigi, isin, ric, sedol, face, coupon, marketValueHeld, notionalValue, maturity, quantityHeld, weighting, quantityUnits, quantityPerShare, contractExpiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETFHolding {\n");
    
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    compositeFigi: ").append(toIndentedString(compositeFigi)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    ric: ").append(toIndentedString(ric)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    marketValueHeld: ").append(toIndentedString(marketValueHeld)).append("\n");
    sb.append("    notionalValue: ").append(toIndentedString(notionalValue)).append("\n");
    sb.append("    maturity: ").append(toIndentedString(maturity)).append("\n");
    sb.append("    quantityHeld: ").append(toIndentedString(quantityHeld)).append("\n");
    sb.append("    weighting: ").append(toIndentedString(weighting)).append("\n");
    sb.append("    quantityUnits: ").append(toIndentedString(quantityUnits)).append("\n");
    sb.append("    quantityPerShare: ").append(toIndentedString(quantityPerShare)).append("\n");
    sb.append("    contractExpiryDate: ").append(toIndentedString(contractExpiryDate)).append("\n");
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

