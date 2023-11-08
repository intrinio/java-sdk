

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
 * The amount of a company&#39;s available stock owned by mutual or pension funds, insurance companies, investment firms, private foundations, endowments or other large entities that manage funds on behalf of others.
 */
@ApiModel(description = "The amount of a company's available stock owned by mutual or pension funds, insurance companies, investment firms, private foundations, endowments or other large entities that manage funds on behalf of others.")

public class InstitutionalOwnership {
  @SerializedName("owner_cik")
  private String ownerCik = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  @SerializedName("period_ended")
  private LocalDate periodEnded = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("sole_voting_authority")
  private BigDecimal soleVotingAuthority = null;

  @SerializedName("shared_voting_authority")
  private BigDecimal sharedVotingAuthority = null;

  @SerializedName("no_voting_authority")
  private BigDecimal noVotingAuthority = null;

  @SerializedName("previous_amount")
  private BigDecimal previousAmount = null;

  @SerializedName("amount_change")
  private BigDecimal amountChange = null;

  @SerializedName("amount_percent_change")
  private BigDecimal amountPercentChange = null;

  public InstitutionalOwnership ownerCik(String ownerCik) {
    this.ownerCik = ownerCik;
    return this;
  }

   /**
   * The Central Index Key issued by the SEC, which is the unique identifier all owner filings
   * @return ownerCik
  **/
  @ApiModelProperty(value = "The Central Index Key issued by the SEC, which is the unique identifier all owner filings")
  public String getOwnerCik() {
    return ownerCik;
  }

  public void setOwnerCik(String ownerCik) {
    this.ownerCik = ownerCik;
  }

  public InstitutionalOwnership ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the institutional owner
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name of the institutional owner")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public InstitutionalOwnership periodEnded(LocalDate periodEnded) {
    this.periodEnded = periodEnded;
    return this;
  }

   /**
   * The date of the latest 13-F filing on record with the SEC.
   * @return periodEnded
  **/
  @ApiModelProperty(value = "The date of the latest 13-F filing on record with the SEC.")
  public LocalDate getPeriodEnded() {
    return periodEnded;
  }

  public void setPeriodEnded(LocalDate periodEnded) {
    this.periodEnded = periodEnded;
  }

  public InstitutionalOwnership value(BigDecimal value) {
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

  public InstitutionalOwnership amount(BigDecimal amount) {
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

  public InstitutionalOwnership soleVotingAuthority(BigDecimal soleVotingAuthority) {
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

  public InstitutionalOwnership sharedVotingAuthority(BigDecimal sharedVotingAuthority) {
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

  public InstitutionalOwnership noVotingAuthority(BigDecimal noVotingAuthority) {
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

  public InstitutionalOwnership previousAmount(BigDecimal previousAmount) {
    this.previousAmount = previousAmount;
    return this;
  }

   /**
   * The prior quarter number of shares held by the owner
   * @return previousAmount
  **/
  @ApiModelProperty(value = "The prior quarter number of shares held by the owner")
  public BigDecimal getPreviousAmount() {
    return previousAmount;
  }

  public void setPreviousAmount(BigDecimal previousAmount) {
    this.previousAmount = previousAmount;
  }

  public InstitutionalOwnership amountChange(BigDecimal amountChange) {
    this.amountChange = amountChange;
    return this;
  }

   /**
   * The change in number of shares held from the prior quarter
   * @return amountChange
  **/
  @ApiModelProperty(value = "The change in number of shares held from the prior quarter")
  public BigDecimal getAmountChange() {
    return amountChange;
  }

  public void setAmountChange(BigDecimal amountChange) {
    this.amountChange = amountChange;
  }

  public InstitutionalOwnership amountPercentChange(BigDecimal amountPercentChange) {
    this.amountPercentChange = amountPercentChange;
    return this;
  }

   /**
   * The percentage change in the number of shares held from the prior quarter
   * @return amountPercentChange
  **/
  @ApiModelProperty(value = "The percentage change in the number of shares held from the prior quarter")
  public BigDecimal getAmountPercentChange() {
    return amountPercentChange;
  }

  public void setAmountPercentChange(BigDecimal amountPercentChange) {
    this.amountPercentChange = amountPercentChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionalOwnership institutionalOwnership = (InstitutionalOwnership) o;
    return Objects.equals(this.ownerCik, institutionalOwnership.ownerCik) &&
        Objects.equals(this.ownerName, institutionalOwnership.ownerName) &&
        Objects.equals(this.periodEnded, institutionalOwnership.periodEnded) &&
        Objects.equals(this.value, institutionalOwnership.value) &&
        Objects.equals(this.amount, institutionalOwnership.amount) &&
        Objects.equals(this.soleVotingAuthority, institutionalOwnership.soleVotingAuthority) &&
        Objects.equals(this.sharedVotingAuthority, institutionalOwnership.sharedVotingAuthority) &&
        Objects.equals(this.noVotingAuthority, institutionalOwnership.noVotingAuthority) &&
        Objects.equals(this.previousAmount, institutionalOwnership.previousAmount) &&
        Objects.equals(this.amountChange, institutionalOwnership.amountChange) &&
        Objects.equals(this.amountPercentChange, institutionalOwnership.amountPercentChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerCik, ownerName, periodEnded, value, amount, soleVotingAuthority, sharedVotingAuthority, noVotingAuthority, previousAmount, amountChange, amountPercentChange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionalOwnership {\n");
    
    sb.append("    ownerCik: ").append(toIndentedString(ownerCik)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    periodEnded: ").append(toIndentedString(periodEnded)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    soleVotingAuthority: ").append(toIndentedString(soleVotingAuthority)).append("\n");
    sb.append("    sharedVotingAuthority: ").append(toIndentedString(sharedVotingAuthority)).append("\n");
    sb.append("    noVotingAuthority: ").append(toIndentedString(noVotingAuthority)).append("\n");
    sb.append("    previousAmount: ").append(toIndentedString(previousAmount)).append("\n");
    sb.append("    amountChange: ").append(toIndentedString(amountChange)).append("\n");
    sb.append("    amountPercentChange: ").append(toIndentedString(amountPercentChange)).append("\n");
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

