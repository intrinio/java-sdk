

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
 * The summary of a company that submits filings to the SEC and has a security traded primarily on a US exchange
 */
@ApiModel(description = "The summary of a company that submits filings to the SEC and has a security traded primarily on a US exchange")

public class CompanySharesOutstanding {
  @SerializedName("xbrl_axis")
  private String xbrlAxis = null;

  @SerializedName("xbrl_member")
  private String xbrlMember = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("title_of_security")
  private String titleOfSecurity = null;

  @SerializedName("trading_symbol")
  private String tradingSymbol = null;

  @SerializedName("security_exchange_name")
  private String securityExchangeName = null;

  @SerializedName("shares_outstanding")
  private BigDecimal sharesOutstanding = null;

  public CompanySharesOutstanding xbrlAxis(String xbrlAxis) {
    this.xbrlAxis = xbrlAxis;
    return this;
  }

   /**
   * The xbrl concept axis member reported to the SEC.
   * @return xbrlAxis
  **/
  @ApiModelProperty(value = "The xbrl concept axis member reported to the SEC.")
  public String getXbrlAxis() {
    return xbrlAxis;
  }

  public void setXbrlAxis(String xbrlAxis) {
    this.xbrlAxis = xbrlAxis;
  }

  public CompanySharesOutstanding xbrlMember(String xbrlMember) {
    this.xbrlMember = xbrlMember;
    return this;
  }

   /**
   * Provides information about the class of stock as reported in XBRL
   * @return xbrlMember
  **/
  @ApiModelProperty(value = "Provides information about the class of stock as reported in XBRL")
  public String getXbrlMember() {
    return xbrlMember;
  }

  public void setXbrlMember(String xbrlMember) {
    this.xbrlMember = xbrlMember;
  }

  public CompanySharesOutstanding endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the filing period
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of the filing period")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public CompanySharesOutstanding titleOfSecurity(String titleOfSecurity) {
    this.titleOfSecurity = titleOfSecurity;
    return this;
  }

   /**
   * The description of the security type
   * @return titleOfSecurity
  **/
  @ApiModelProperty(value = "The description of the security type")
  public String getTitleOfSecurity() {
    return titleOfSecurity;
  }

  public void setTitleOfSecurity(String titleOfSecurity) {
    this.titleOfSecurity = titleOfSecurity;
  }

  public CompanySharesOutstanding tradingSymbol(String tradingSymbol) {
    this.tradingSymbol = tradingSymbol;
    return this;
  }

   /**
   * The symbol under which the security is traded in the exchange
   * @return tradingSymbol
  **/
  @ApiModelProperty(value = "The symbol under which the security is traded in the exchange")
  public String getTradingSymbol() {
    return tradingSymbol;
  }

  public void setTradingSymbol(String tradingSymbol) {
    this.tradingSymbol = tradingSymbol;
  }

  public CompanySharesOutstanding securityExchangeName(String securityExchangeName) {
    this.securityExchangeName = securityExchangeName;
    return this;
  }

   /**
   * The name of the secuirty exchange
   * @return securityExchangeName
  **/
  @ApiModelProperty(value = "The name of the secuirty exchange")
  public String getSecurityExchangeName() {
    return securityExchangeName;
  }

  public void setSecurityExchangeName(String securityExchangeName) {
    this.securityExchangeName = securityExchangeName;
  }

  public CompanySharesOutstanding sharesOutstanding(BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
    return this;
  }

   /**
   * The amount of stock currently held by all shareholders
   * @return sharesOutstanding
  **/
  @ApiModelProperty(value = "The amount of stock currently held by all shareholders")
  public BigDecimal getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(BigDecimal sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanySharesOutstanding companySharesOutstanding = (CompanySharesOutstanding) o;
    return Objects.equals(this.xbrlAxis, companySharesOutstanding.xbrlAxis) &&
        Objects.equals(this.xbrlMember, companySharesOutstanding.xbrlMember) &&
        Objects.equals(this.endDate, companySharesOutstanding.endDate) &&
        Objects.equals(this.titleOfSecurity, companySharesOutstanding.titleOfSecurity) &&
        Objects.equals(this.tradingSymbol, companySharesOutstanding.tradingSymbol) &&
        Objects.equals(this.securityExchangeName, companySharesOutstanding.securityExchangeName) &&
        Objects.equals(this.sharesOutstanding, companySharesOutstanding.sharesOutstanding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xbrlAxis, xbrlMember, endDate, titleOfSecurity, tradingSymbol, securityExchangeName, sharesOutstanding);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanySharesOutstanding {\n");
    
    sb.append("    xbrlAxis: ").append(toIndentedString(xbrlAxis)).append("\n");
    sb.append("    xbrlMember: ").append(toIndentedString(xbrlMember)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    titleOfSecurity: ").append(toIndentedString(titleOfSecurity)).append("\n");
    sb.append("    tradingSymbol: ").append(toIndentedString(tradingSymbol)).append("\n");
    sb.append("    securityExchangeName: ").append(toIndentedString(securityExchangeName)).append("\n");
    sb.append("    sharesOutstanding: ").append(toIndentedString(sharesOutstanding)).append("\n");
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

