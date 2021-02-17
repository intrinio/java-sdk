

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import com.intrinio.models.OwnerSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * A transaction where the owner is considered an insider of that company. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.
 */
@ApiModel(description = "A transaction where the owner is considered an insider of that company. Criteria for being an insider include being a director, officer, or 10%+ owner in the company. Transactions are detailed for both non-derivative and derivative transactions by the insider.")

public class InsiderTransaction {
  @SerializedName("director")
  private Boolean director = null;

  @SerializedName("officer")
  private Boolean officer = null;

  @SerializedName("ten_percent_owner")
  private Boolean tenPercentOwner = null;

  @SerializedName("other_relation")
  private Boolean otherRelation = null;

  @SerializedName("officer_title")
  private String officerTitle = null;

  @SerializedName("derivative_transaction")
  private Boolean derivativeTransaction = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("security_title")
  private String securityTitle = null;

  @SerializedName("conversion_exercise_price")
  private BigDecimal conversionExercisePrice = null;

  @SerializedName("transaction_type_code")
  private String transactionTypeCode = null;

  @SerializedName("acquisition_disposition_code")
  private String acquisitionDispositionCode = null;

  @SerializedName("amount_of_shares")
  private BigDecimal amountOfShares = null;

  @SerializedName("underlying_security_title")
  private String underlyingSecurityTitle = null;

  @SerializedName("underlying_shares")
  private BigDecimal underlyingShares = null;

  @SerializedName("transaction_price")
  private BigDecimal transactionPrice = null;

  @SerializedName("total_shares_owned")
  private BigDecimal totalSharesOwned = null;

  @SerializedName("ownership_type_code")
  private String ownershipTypeCode = null;

  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("owner")
  private OwnerSummary owner = null;

  public InsiderTransaction director(Boolean director) {
    this.director = director;
    return this;
  }

   /**
   * (true/false) A boolean indicating whether or not the owner is a director in the company
   * @return director
  **/
  @ApiModelProperty(value = "(true/false) A boolean indicating whether or not the owner is a director in the company")
  public Boolean isDirector() {
    return director;
  }

  public void setDirector(Boolean director) {
    this.director = director;
  }

  public InsiderTransaction officer(Boolean officer) {
    this.officer = officer;
    return this;
  }

   /**
   * (true/false) A boolean indicating whether or not the owner is a officer in the company
   * @return officer
  **/
  @ApiModelProperty(value = "(true/false) A boolean indicating whether or not the owner is a officer in the company")
  public Boolean isOfficer() {
    return officer;
  }

  public void setOfficer(Boolean officer) {
    this.officer = officer;
  }

  public InsiderTransaction tenPercentOwner(Boolean tenPercentOwner) {
    this.tenPercentOwner = tenPercentOwner;
    return this;
  }

   /**
   * (true/false) A boolean indicating whether or not the owner has a ten percent or greater interest in the company
   * @return tenPercentOwner
  **/
  @ApiModelProperty(value = "(true/false) A boolean indicating whether or not the owner has a ten percent or greater interest in the company")
  public Boolean isTenPercentOwner() {
    return tenPercentOwner;
  }

  public void setTenPercentOwner(Boolean tenPercentOwner) {
    this.tenPercentOwner = tenPercentOwner;
  }

  public InsiderTransaction otherRelation(Boolean otherRelation) {
    this.otherRelation = otherRelation;
    return this;
  }

   /**
   * (true/false) A boolean indicating whether or not the owner has another relationship with the company beside, direct, officer, or significant owner in the company
   * @return otherRelation
  **/
  @ApiModelProperty(value = "(true/false) A boolean indicating whether or not the owner has another relationship with the company beside, direct, officer, or significant owner in the company")
  public Boolean isOtherRelation() {
    return otherRelation;
  }

  public void setOtherRelation(Boolean otherRelation) {
    this.otherRelation = otherRelation;
  }

  public InsiderTransaction officerTitle(String officerTitle) {
    this.officerTitle = officerTitle;
    return this;
  }

   /**
   * The officer title of the owner in the company
   * @return officerTitle
  **/
  @ApiModelProperty(value = "The officer title of the owner in the company")
  public String getOfficerTitle() {
    return officerTitle;
  }

  public void setOfficerTitle(String officerTitle) {
    this.officerTitle = officerTitle;
  }

  public InsiderTransaction derivativeTransaction(Boolean derivativeTransaction) {
    this.derivativeTransaction = derivativeTransaction;
    return this;
  }

   /**
   * (true) A boolean indicating the transaction is a derivative transaction, which may or may not become common stock due to various possible exercise or conversion requirements
   * @return derivativeTransaction
  **/
  @ApiModelProperty(value = "(true) A boolean indicating the transaction is a derivative transaction, which may or may not become common stock due to various possible exercise or conversion requirements")
  public Boolean isDerivativeTransaction() {
    return derivativeTransaction;
  }

  public void setDerivativeTransaction(Boolean derivativeTransaction) {
    this.derivativeTransaction = derivativeTransaction;
  }

  public InsiderTransaction ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker symbol for the company’s common stock
   * @return ticker
  **/
  @ApiModelProperty(value = "The ticker symbol for the company’s common stock")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public InsiderTransaction securityTitle(String securityTitle) {
    this.securityTitle = securityTitle;
    return this;
  }

   /**
   * The name of the derivative security transacted
   * @return securityTitle
  **/
  @ApiModelProperty(value = "The name of the derivative security transacted")
  public String getSecurityTitle() {
    return securityTitle;
  }

  public void setSecurityTitle(String securityTitle) {
    this.securityTitle = securityTitle;
  }

  public InsiderTransaction conversionExercisePrice(BigDecimal conversionExercisePrice) {
    this.conversionExercisePrice = conversionExercisePrice;
    return this;
  }

   /**
   * The conversion or exercise price of the derivative security transacted
   * @return conversionExercisePrice
  **/
  @ApiModelProperty(value = "The conversion or exercise price of the derivative security transacted")
  public BigDecimal getConversionExercisePrice() {
    return conversionExercisePrice;
  }

  public void setConversionExercisePrice(BigDecimal conversionExercisePrice) {
    this.conversionExercisePrice = conversionExercisePrice;
  }

  public InsiderTransaction transactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
    return this;
  }

   /**
   * A symbol representing the transaction type; P &#x3D; Purchase | S &#x3D; Sale | A  &#x3D; Award | M &#x3D; Conversion to Common | C &#x3D; Conversion | X &#x3D; Exercise of Derivative More Transaction Codes
   * @return transactionTypeCode
  **/
  @ApiModelProperty(value = "A symbol representing the transaction type; P = Purchase | S = Sale | A  = Award | M = Conversion to Common | C = Conversion | X = Exercise of Derivative More Transaction Codes")
  public String getTransactionTypeCode() {
    return transactionTypeCode;
  }

  public void setTransactionTypeCode(String transactionTypeCode) {
    this.transactionTypeCode = transactionTypeCode;
  }

  public InsiderTransaction acquisitionDispositionCode(String acquisitionDispositionCode) {
    this.acquisitionDispositionCode = acquisitionDispositionCode;
    return this;
  }

   /**
   * A symbol representing whether or not the derivative securities are Acquired or Disposed; A &#x3D; Acquisition | D &#x3D; Disposition
   * @return acquisitionDispositionCode
  **/
  @ApiModelProperty(value = "A symbol representing whether or not the derivative securities are Acquired or Disposed; A = Acquisition | D = Disposition")
  public String getAcquisitionDispositionCode() {
    return acquisitionDispositionCode;
  }

  public void setAcquisitionDispositionCode(String acquisitionDispositionCode) {
    this.acquisitionDispositionCode = acquisitionDispositionCode;
  }

  public InsiderTransaction amountOfShares(BigDecimal amountOfShares) {
    this.amountOfShares = amountOfShares;
    return this;
  }

   /**
   * The number of derivative securities involved in the subject transaction
   * @return amountOfShares
  **/
  @ApiModelProperty(value = "The number of derivative securities involved in the subject transaction")
  public BigDecimal getAmountOfShares() {
    return amountOfShares;
  }

  public void setAmountOfShares(BigDecimal amountOfShares) {
    this.amountOfShares = amountOfShares;
  }

  public InsiderTransaction underlyingSecurityTitle(String underlyingSecurityTitle) {
    this.underlyingSecurityTitle = underlyingSecurityTitle;
    return this;
  }

   /**
   * The name of the underlying non-derivative security related to this derivative transaction
   * @return underlyingSecurityTitle
  **/
  @ApiModelProperty(value = "The name of the underlying non-derivative security related to this derivative transaction")
  public String getUnderlyingSecurityTitle() {
    return underlyingSecurityTitle;
  }

  public void setUnderlyingSecurityTitle(String underlyingSecurityTitle) {
    this.underlyingSecurityTitle = underlyingSecurityTitle;
  }

  public InsiderTransaction underlyingShares(BigDecimal underlyingShares) {
    this.underlyingShares = underlyingShares;
    return this;
  }

   /**
   * The number of non-derivative shares involved in the subject transaction
   * @return underlyingShares
  **/
  @ApiModelProperty(value = "The number of non-derivative shares involved in the subject transaction")
  public BigDecimal getUnderlyingShares() {
    return underlyingShares;
  }

  public void setUnderlyingShares(BigDecimal underlyingShares) {
    this.underlyingShares = underlyingShares;
  }

  public InsiderTransaction transactionPrice(BigDecimal transactionPrice) {
    this.transactionPrice = transactionPrice;
    return this;
  }

   /**
   * The price of the derivative securities
   * @return transactionPrice
  **/
  @ApiModelProperty(value = "The price of the derivative securities")
  public BigDecimal getTransactionPrice() {
    return transactionPrice;
  }

  public void setTransactionPrice(BigDecimal transactionPrice) {
    this.transactionPrice = transactionPrice;
  }

  public InsiderTransaction totalSharesOwned(BigDecimal totalSharesOwned) {
    this.totalSharesOwned = totalSharesOwned;
    return this;
  }

   /**
   * The total number of derivative securities owned following the subject transaction
   * @return totalSharesOwned
  **/
  @ApiModelProperty(value = "The total number of derivative securities owned following the subject transaction")
  public BigDecimal getTotalSharesOwned() {
    return totalSharesOwned;
  }

  public void setTotalSharesOwned(BigDecimal totalSharesOwned) {
    this.totalSharesOwned = totalSharesOwned;
  }

  public InsiderTransaction ownershipTypeCode(String ownershipTypeCode) {
    this.ownershipTypeCode = ownershipTypeCode;
    return this;
  }

   /**
   * A symbol representing the ownership of the securities transacted; D &#x3D; Direct Ownership | I &#x3D; Indirect Ownership
   * @return ownershipTypeCode
  **/
  @ApiModelProperty(value = "A symbol representing the ownership of the securities transacted; D = Direct Ownership | I = Indirect Ownership")
  public String getOwnershipTypeCode() {
    return ownershipTypeCode;
  }

  public void setOwnershipTypeCode(String ownershipTypeCode) {
    this.ownershipTypeCode = ownershipTypeCode;
  }

  public InsiderTransaction company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * The company associated with the filing
   * @return company
  **/
  @ApiModelProperty(value = "The company associated with the filing")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }

  public InsiderTransaction owner(OwnerSummary owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The owner associated with the filing
   * @return owner
  **/
  @ApiModelProperty(value = "The owner associated with the filing")
  public OwnerSummary getOwner() {
    return owner;
  }

  public void setOwner(OwnerSummary owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsiderTransaction insiderTransaction = (InsiderTransaction) o;
    return Objects.equals(this.director, insiderTransaction.director) &&
        Objects.equals(this.officer, insiderTransaction.officer) &&
        Objects.equals(this.tenPercentOwner, insiderTransaction.tenPercentOwner) &&
        Objects.equals(this.otherRelation, insiderTransaction.otherRelation) &&
        Objects.equals(this.officerTitle, insiderTransaction.officerTitle) &&
        Objects.equals(this.derivativeTransaction, insiderTransaction.derivativeTransaction) &&
        Objects.equals(this.ticker, insiderTransaction.ticker) &&
        Objects.equals(this.securityTitle, insiderTransaction.securityTitle) &&
        Objects.equals(this.conversionExercisePrice, insiderTransaction.conversionExercisePrice) &&
        Objects.equals(this.transactionTypeCode, insiderTransaction.transactionTypeCode) &&
        Objects.equals(this.acquisitionDispositionCode, insiderTransaction.acquisitionDispositionCode) &&
        Objects.equals(this.amountOfShares, insiderTransaction.amountOfShares) &&
        Objects.equals(this.underlyingSecurityTitle, insiderTransaction.underlyingSecurityTitle) &&
        Objects.equals(this.underlyingShares, insiderTransaction.underlyingShares) &&
        Objects.equals(this.transactionPrice, insiderTransaction.transactionPrice) &&
        Objects.equals(this.totalSharesOwned, insiderTransaction.totalSharesOwned) &&
        Objects.equals(this.ownershipTypeCode, insiderTransaction.ownershipTypeCode) &&
        Objects.equals(this.company, insiderTransaction.company) &&
        Objects.equals(this.owner, insiderTransaction.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(director, officer, tenPercentOwner, otherRelation, officerTitle, derivativeTransaction, ticker, securityTitle, conversionExercisePrice, transactionTypeCode, acquisitionDispositionCode, amountOfShares, underlyingSecurityTitle, underlyingShares, transactionPrice, totalSharesOwned, ownershipTypeCode, company, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsiderTransaction {\n");
    
    sb.append("    director: ").append(toIndentedString(director)).append("\n");
    sb.append("    officer: ").append(toIndentedString(officer)).append("\n");
    sb.append("    tenPercentOwner: ").append(toIndentedString(tenPercentOwner)).append("\n");
    sb.append("    otherRelation: ").append(toIndentedString(otherRelation)).append("\n");
    sb.append("    officerTitle: ").append(toIndentedString(officerTitle)).append("\n");
    sb.append("    derivativeTransaction: ").append(toIndentedString(derivativeTransaction)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    securityTitle: ").append(toIndentedString(securityTitle)).append("\n");
    sb.append("    conversionExercisePrice: ").append(toIndentedString(conversionExercisePrice)).append("\n");
    sb.append("    transactionTypeCode: ").append(toIndentedString(transactionTypeCode)).append("\n");
    sb.append("    acquisitionDispositionCode: ").append(toIndentedString(acquisitionDispositionCode)).append("\n");
    sb.append("    amountOfShares: ").append(toIndentedString(amountOfShares)).append("\n");
    sb.append("    underlyingSecurityTitle: ").append(toIndentedString(underlyingSecurityTitle)).append("\n");
    sb.append("    underlyingShares: ").append(toIndentedString(underlyingShares)).append("\n");
    sb.append("    transactionPrice: ").append(toIndentedString(transactionPrice)).append("\n");
    sb.append("    totalSharesOwned: ").append(toIndentedString(totalSharesOwned)).append("\n");
    sb.append("    ownershipTypeCode: ").append(toIndentedString(ownershipTypeCode)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

