

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
 * Returns a list of companies with its shares and positions sourced from Zacks.
 */
@ApiModel(description = "Returns a list of companies with its shares and positions sourced from Zacks.")

public class ZacksInstitutionalHoldingCompanyDetail {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("exchange")
  private String exchange = null;

  @SerializedName("shares_outstanding")
  private BigDecimal sharesOutstanding = null;

  @SerializedName("last_close_price")
  private BigDecimal lastClosePrice = null;

  @SerializedName("last_close_date")
  private LocalDate lastCloseDate = null;

  @SerializedName("institutional_shares_held_percent")
  private BigDecimal institutionalSharesHeldPercent = null;

  @SerializedName("institutional_shares_buy")
  private BigDecimal institutionalSharesBuy = null;

  @SerializedName("institutional_shares_sell")
  private BigDecimal institutionalSharesSell = null;

  @SerializedName("institutional_positions_increase")
  private BigDecimal institutionalPositionsIncrease = null;

  @SerializedName("institutional_positions_decrease")
  private BigDecimal institutionalPositionsDecrease = null;

  @SerializedName("institutional_positions_unchanged")
  private BigDecimal institutionalPositionsUnchanged = null;

  @SerializedName("institutional_positions_total")
  private BigDecimal institutionalPositionsTotal = null;

  public ZacksInstitutionalHoldingCompanyDetail ticker(String ticker) {
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

  public ZacksInstitutionalHoldingCompanyDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The company name of the stock listed
   * @return name
  **/
  @ApiModelProperty(value = "The company name of the stock listed")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZacksInstitutionalHoldingCompanyDetail exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Exhange where the stock is traded whose shares are held by the institution
   * @return exchange
  **/
  @ApiModelProperty(value = "Exhange where the stock is traded whose shares are held by the institution")
  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public ZacksInstitutionalHoldingCompanyDetail sharesOutstanding(BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

   /**
   * The number of shares shares outstanding for the stock
   * @return sharesOutstanding
  **/
  @ApiModelProperty(value = "The number of shares shares outstanding for the stock")
  public BigDecimal getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }

  public ZacksInstitutionalHoldingCompanyDetail lastClosePrice(BigDecimal lastClosePrice) {
    this.lastClosePrice = lastClosePrice;
    return this;
  }

   /**
   * The last close price of the stock listed
   * @return lastClosePrice
  **/
  @ApiModelProperty(value = "The last close price of the stock listed")
  public BigDecimal getLastClosePrice() {
    return lastClosePrice;
  }

  public void setLastClosePrice(BigDecimal lastClosePrice) {
    this.lastClosePrice = lastClosePrice;
  }

  public ZacksInstitutionalHoldingCompanyDetail lastCloseDate(LocalDate lastCloseDate) {
    this.lastCloseDate = lastCloseDate;
    return this;
  }

   /**
   * Last closing price of the stock listed
   * @return lastCloseDate
  **/
  @ApiModelProperty(value = "Last closing price of the stock listed")
  public LocalDate getLastCloseDate() {
    return lastCloseDate;
  }

  public void setLastCloseDate(LocalDate lastCloseDate) {
    this.lastCloseDate = lastCloseDate;
  }

  public ZacksInstitutionalHoldingCompanyDetail institutionalSharesHeldPercent(BigDecimal institutionalSharesHeldPercent) {
    this.institutionalSharesHeldPercent = institutionalSharesHeldPercent;
    return this;
  }

   /**
   * Percentage of shares outstanding held by institutions in the stock listed
   * @return institutionalSharesHeldPercent
  **/
  @ApiModelProperty(value = "Percentage of shares outstanding held by institutions in the stock listed")
  public BigDecimal getInstitutionalSharesHeldPercent() {
    return institutionalSharesHeldPercent;
  }

  public void setInstitutionalSharesHeldPercent(BigDecimal institutionalSharesHeldPercent) {
    this.institutionalSharesHeldPercent = institutionalSharesHeldPercent;
  }

  public ZacksInstitutionalHoldingCompanyDetail institutionalSharesBuy(BigDecimal institutionalSharesBuy) {
    this.institutionalSharesBuy = institutionalSharesBuy;
    return this;
  }

   /**
   * Number of shares bought by institutions in the stock listed
   * @return institutionalSharesBuy
  **/
  @ApiModelProperty(value = "Number of shares bought by institutions in the stock listed")
  public BigDecimal getInstitutionalSharesBuy() {
    return institutionalSharesBuy;
  }

  public void setInstitutionalSharesBuy(BigDecimal institutionalSharesBuy) {
    this.institutionalSharesBuy = institutionalSharesBuy;
  }

  public ZacksInstitutionalHoldingCompanyDetail institutionalSharesSell(BigDecimal institutionalSharesSell) {
    this.institutionalSharesSell = institutionalSharesSell;
    return this;
  }

   /**
   * Number of shares sold by institutions in the stock listed
   * @return institutionalSharesSell
  **/
  @ApiModelProperty(value = "Number of shares sold by institutions in the stock listed")
  public BigDecimal getInstitutionalSharesSell() {
    return institutionalSharesSell;
  }

  public void setInstitutionalSharesSell(BigDecimal institutionalSharesSell) {
    this.institutionalSharesSell = institutionalSharesSell;
  }

  public ZacksInstitutionalHoldingCompanyDetail institutionalPositionsIncrease(BigDecimal institutionalPositionsIncrease) {
    this.institutionalPositionsIncrease = institutionalPositionsIncrease;
    return this;
  }

   /**
   * Number of institutions who increased their shares held in the stock listed
   * @return institutionalPositionsIncrease
  **/
  @ApiModelProperty(value = "Number of institutions who increased their shares held in the stock listed")
  public BigDecimal getInstitutionalPositionsIncrease() {
    return institutionalPositionsIncrease;
  }

  public void setInstitutionalPositionsIncrease(BigDecimal institutionalPositionsIncrease) {
    this.institutionalPositionsIncrease = institutionalPositionsIncrease;
  }

  public ZacksInstitutionalHoldingCompanyDetail institutionalPositionsDecrease(BigDecimal institutionalPositionsDecrease) {
    this.institutionalPositionsDecrease = institutionalPositionsDecrease;
    return this;
  }

   /**
   * Number of institutions who decrease their shares held in the stock listed
   * @return institutionalPositionsDecrease
  **/
  @ApiModelProperty(value = "Number of institutions who decrease their shares held in the stock listed")
  public BigDecimal getInstitutionalPositionsDecrease() {
    return institutionalPositionsDecrease;
  }

  public void setInstitutionalPositionsDecrease(BigDecimal institutionalPositionsDecrease) {
    this.institutionalPositionsDecrease = institutionalPositionsDecrease;
  }

  public ZacksInstitutionalHoldingCompanyDetail institutionalPositionsUnchanged(BigDecimal institutionalPositionsUnchanged) {
    this.institutionalPositionsUnchanged = institutionalPositionsUnchanged;
    return this;
  }

   /**
   * Number of institutions who did not change their shares held in the stock listed
   * @return institutionalPositionsUnchanged
  **/
  @ApiModelProperty(value = "Number of institutions who did not change their shares held in the stock listed")
  public BigDecimal getInstitutionalPositionsUnchanged() {
    return institutionalPositionsUnchanged;
  }

  public void setInstitutionalPositionsUnchanged(BigDecimal institutionalPositionsUnchanged) {
    this.institutionalPositionsUnchanged = institutionalPositionsUnchanged;
  }

  public ZacksInstitutionalHoldingCompanyDetail institutionalPositionsTotal(BigDecimal institutionalPositionsTotal) {
    this.institutionalPositionsTotal = institutionalPositionsTotal;
    return this;
  }

   /**
   * Total number of institutions who hold shares in the stock listed
   * @return institutionalPositionsTotal
  **/
  @ApiModelProperty(value = "Total number of institutions who hold shares in the stock listed")
  public BigDecimal getInstitutionalPositionsTotal() {
    return institutionalPositionsTotal;
  }

  public void setInstitutionalPositionsTotal(BigDecimal institutionalPositionsTotal) {
    this.institutionalPositionsTotal = institutionalPositionsTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksInstitutionalHoldingCompanyDetail zacksInstitutionalHoldingCompanyDetail = (ZacksInstitutionalHoldingCompanyDetail) o;
    return Objects.equals(this.ticker, zacksInstitutionalHoldingCompanyDetail.ticker) &&
        Objects.equals(this.name, zacksInstitutionalHoldingCompanyDetail.name) &&
        Objects.equals(this.exchange, zacksInstitutionalHoldingCompanyDetail.exchange) &&
        Objects.equals(this.sharesOutstanding, zacksInstitutionalHoldingCompanyDetail.sharesOutstanding) &&
        Objects.equals(this.lastClosePrice, zacksInstitutionalHoldingCompanyDetail.lastClosePrice) &&
        Objects.equals(this.lastCloseDate, zacksInstitutionalHoldingCompanyDetail.lastCloseDate) &&
        Objects.equals(this.institutionalSharesHeldPercent, zacksInstitutionalHoldingCompanyDetail.institutionalSharesHeldPercent) &&
        Objects.equals(this.institutionalSharesBuy, zacksInstitutionalHoldingCompanyDetail.institutionalSharesBuy) &&
        Objects.equals(this.institutionalSharesSell, zacksInstitutionalHoldingCompanyDetail.institutionalSharesSell) &&
        Objects.equals(this.institutionalPositionsIncrease, zacksInstitutionalHoldingCompanyDetail.institutionalPositionsIncrease) &&
        Objects.equals(this.institutionalPositionsDecrease, zacksInstitutionalHoldingCompanyDetail.institutionalPositionsDecrease) &&
        Objects.equals(this.institutionalPositionsUnchanged, zacksInstitutionalHoldingCompanyDetail.institutionalPositionsUnchanged) &&
        Objects.equals(this.institutionalPositionsTotal, zacksInstitutionalHoldingCompanyDetail.institutionalPositionsTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, name, exchange, sharesOutstanding, lastClosePrice, lastCloseDate, institutionalSharesHeldPercent, institutionalSharesBuy, institutionalSharesSell, institutionalPositionsIncrease, institutionalPositionsDecrease, institutionalPositionsUnchanged, institutionalPositionsTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksInstitutionalHoldingCompanyDetail {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
    sb.append("    lastClosePrice: ").append(toIndentedString(lastClosePrice)).append("\n");
    sb.append("    lastCloseDate: ").append(toIndentedString(lastCloseDate)).append("\n");
    sb.append("    institutionalSharesHeldPercent: ").append(toIndentedString(institutionalSharesHeldPercent)).append("\n");
    sb.append("    institutionalSharesBuy: ").append(toIndentedString(institutionalSharesBuy)).append("\n");
    sb.append("    institutionalSharesSell: ").append(toIndentedString(institutionalSharesSell)).append("\n");
    sb.append("    institutionalPositionsIncrease: ").append(toIndentedString(institutionalPositionsIncrease)).append("\n");
    sb.append("    institutionalPositionsDecrease: ").append(toIndentedString(institutionalPositionsDecrease)).append("\n");
    sb.append("    institutionalPositionsUnchanged: ").append(toIndentedString(institutionalPositionsUnchanged)).append("\n");
    sb.append("    institutionalPositionsTotal: ").append(toIndentedString(institutionalPositionsTotal)).append("\n");
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

