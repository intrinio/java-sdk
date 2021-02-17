

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
 * A single institutional holding for an owner.
 */
@ApiModel(description = "A single institutional holding for an owner.")

public class InstitutionalHolding {
  @SerializedName("cusip")
  private String cusip = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("security_name")
  private String securityName = null;

  @SerializedName("security_type")
  private String securityType = null;

  @SerializedName("title_of_class")
  private String titleOfClass = null;

  @SerializedName("stock_exchange")
  private String stockExchange = null;

  @SerializedName("filing_date")
  private LocalDate filingDate = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("investment_discretion")
  private String investmentDiscretion = null;

  @SerializedName("other_manager")
  private String otherManager = null;

  @SerializedName("sole_voting_authority")
  private BigDecimal soleVotingAuthority = null;

  @SerializedName("shared_voting_authority")
  private BigDecimal sharedVotingAuthority = null;

  @SerializedName("no_voting_authority")
  private BigDecimal noVotingAuthority = null;

  public InstitutionalHolding cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * The CUSIP number for the security report by the Institutional Owner
   * @return cusip
  **/
  @ApiModelProperty(value = "The CUSIP number for the security report by the Institutional Owner")
  public String getCusip() {
    return cusip;
  }

  public void setCusip(String cusip) {
    this.cusip = cusip;
  }

  public InstitutionalHolding ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker symbol for the security
   * @return ticker
  **/
  @ApiModelProperty(value = "The ticker symbol for the security")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public InstitutionalHolding securityName(String securityName) {
    this.securityName = securityName;
    return this;
  }

   /**
   * The name of the security
   * @return securityName
  **/
  @ApiModelProperty(value = "The name of the security")
  public String getSecurityName() {
    return securityName;
  }

  public void setSecurityName(String securityName) {
    this.securityName = securityName;
  }

  public InstitutionalHolding securityType(String securityType) {
    this.securityType = securityType;
    return this;
  }

   /**
   * The type of the security
   * @return securityType
  **/
  @ApiModelProperty(value = "The type of the security")
  public String getSecurityType() {
    return securityType;
  }

  public void setSecurityType(String securityType) {
    this.securityType = securityType;
  }

  public InstitutionalHolding titleOfClass(String titleOfClass) {
    this.titleOfClass = titleOfClass;
    return this;
  }

   /**
   * The class of stock held
   * @return titleOfClass
  **/
  @ApiModelProperty(value = "The class of stock held")
  public String getTitleOfClass() {
    return titleOfClass;
  }

  public void setTitleOfClass(String titleOfClass) {
    this.titleOfClass = titleOfClass;
  }

  public InstitutionalHolding stockExchange(String stockExchange) {
    this.stockExchange = stockExchange;
    return this;
  }

   /**
   * The stock exchange where the security is traded
   * @return stockExchange
  **/
  @ApiModelProperty(value = "The stock exchange where the security is traded")
  public String getStockExchange() {
    return stockExchange;
  }

  public void setStockExchange(String stockExchange) {
    this.stockExchange = stockExchange;
  }

  public InstitutionalHolding filingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
    return this;
  }

   /**
   * The date when the filing was submitted to the SEC by the company
   * @return filingDate
  **/
  @ApiModelProperty(value = "The date when the filing was submitted to the SEC by the company")
  public LocalDate getFilingDate() {
    return filingDate;
  }

  public void setFilingDate(LocalDate filingDate) {
    this.filingDate = filingDate;
  }

  public InstitutionalHolding value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The market value in amount of dollars of the holding in the listed security
   * @return value
  **/
  @ApiModelProperty(value = "The market value in amount of dollars of the holding in the listed security")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public InstitutionalHolding amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The number of shares held in the listed security
   * @return amount
  **/
  @ApiModelProperty(value = "The number of shares held in the listed security")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public InstitutionalHolding type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Shares
   * @return type
  **/
  @ApiModelProperty(value = "Shares")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InstitutionalHolding investmentDiscretion(String investmentDiscretion) {
    this.investmentDiscretion = investmentDiscretion;
    return this;
  }

   /**
   * Segregate the holdings of securities of a class according to the nature of the investment discretion held by the Manager.
   * @return investmentDiscretion
  **/
  @ApiModelProperty(value = "Segregate the holdings of securities of a class according to the nature of the investment discretion held by the Manager.")
  public String getInvestmentDiscretion() {
    return investmentDiscretion;
  }

  public void setInvestmentDiscretion(String investmentDiscretion) {
    this.investmentDiscretion = investmentDiscretion;
  }

  public InstitutionalHolding otherManager(String otherManager) {
    this.otherManager = otherManager;
    return this;
  }

   /**
   * A code for other managerial authority of the securities listed
   * @return otherManager
  **/
  @ApiModelProperty(value = "A code for other managerial authority of the securities listed")
  public String getOtherManager() {
    return otherManager;
  }

  public void setOtherManager(String otherManager) {
    this.otherManager = otherManager;
  }

  public InstitutionalHolding soleVotingAuthority(BigDecimal soleVotingAuthority) {
    this.soleVotingAuthority = soleVotingAuthority;
    return this;
  }

   /**
   * The number of shares where the insitutional holder has sole voting authority
   * @return soleVotingAuthority
  **/
  @ApiModelProperty(value = "The number of shares where the insitutional holder has sole voting authority")
  public BigDecimal getSoleVotingAuthority() {
    return soleVotingAuthority;
  }

  public void setSoleVotingAuthority(BigDecimal soleVotingAuthority) {
    this.soleVotingAuthority = soleVotingAuthority;
  }

  public InstitutionalHolding sharedVotingAuthority(BigDecimal sharedVotingAuthority) {
    this.sharedVotingAuthority = sharedVotingAuthority;
    return this;
  }

   /**
   * The number of shares where the insitutional holder has shared voting authority
   * @return sharedVotingAuthority
  **/
  @ApiModelProperty(value = "The number of shares where the insitutional holder has shared voting authority")
  public BigDecimal getSharedVotingAuthority() {
    return sharedVotingAuthority;
  }

  public void setSharedVotingAuthority(BigDecimal sharedVotingAuthority) {
    this.sharedVotingAuthority = sharedVotingAuthority;
  }

  public InstitutionalHolding noVotingAuthority(BigDecimal noVotingAuthority) {
    this.noVotingAuthority = noVotingAuthority;
    return this;
  }

   /**
   * The number of shares where the insitutional holder has no voting authority
   * @return noVotingAuthority
  **/
  @ApiModelProperty(value = "The number of shares where the insitutional holder has no voting authority")
  public BigDecimal getNoVotingAuthority() {
    return noVotingAuthority;
  }

  public void setNoVotingAuthority(BigDecimal noVotingAuthority) {
    this.noVotingAuthority = noVotingAuthority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionalHolding institutionalHolding = (InstitutionalHolding) o;
    return Objects.equals(this.cusip, institutionalHolding.cusip) &&
        Objects.equals(this.ticker, institutionalHolding.ticker) &&
        Objects.equals(this.securityName, institutionalHolding.securityName) &&
        Objects.equals(this.securityType, institutionalHolding.securityType) &&
        Objects.equals(this.titleOfClass, institutionalHolding.titleOfClass) &&
        Objects.equals(this.stockExchange, institutionalHolding.stockExchange) &&
        Objects.equals(this.filingDate, institutionalHolding.filingDate) &&
        Objects.equals(this.value, institutionalHolding.value) &&
        Objects.equals(this.amount, institutionalHolding.amount) &&
        Objects.equals(this.type, institutionalHolding.type) &&
        Objects.equals(this.investmentDiscretion, institutionalHolding.investmentDiscretion) &&
        Objects.equals(this.otherManager, institutionalHolding.otherManager) &&
        Objects.equals(this.soleVotingAuthority, institutionalHolding.soleVotingAuthority) &&
        Objects.equals(this.sharedVotingAuthority, institutionalHolding.sharedVotingAuthority) &&
        Objects.equals(this.noVotingAuthority, institutionalHolding.noVotingAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cusip, ticker, securityName, securityType, titleOfClass, stockExchange, filingDate, value, amount, type, investmentDiscretion, otherManager, soleVotingAuthority, sharedVotingAuthority, noVotingAuthority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionalHolding {\n");
    
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    securityName: ").append(toIndentedString(securityName)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    titleOfClass: ").append(toIndentedString(titleOfClass)).append("\n");
    sb.append("    stockExchange: ").append(toIndentedString(stockExchange)).append("\n");
    sb.append("    filingDate: ").append(toIndentedString(filingDate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    investmentDiscretion: ").append(toIndentedString(investmentDiscretion)).append("\n");
    sb.append("    otherManager: ").append(toIndentedString(otherManager)).append("\n");
    sb.append("    soleVotingAuthority: ").append(toIndentedString(soleVotingAuthority)).append("\n");
    sb.append("    sharedVotingAuthority: ").append(toIndentedString(sharedVotingAuthority)).append("\n");
    sb.append("    noVotingAuthority: ").append(toIndentedString(noVotingAuthority)).append("\n");
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

