

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.ZacksInstitutionalHoldingCompanySummary;
import com.intrinio.models.ZacksInstitutionalHoldingHistoricalSummary;
import com.intrinio.models.ZacksInstitutionalHoldingOwnerSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * Returns a list of all ownership interests and the value of their interests sourced from Zacks.
 */
@ApiModel(description = "Returns a list of all ownership interests and the value of their interests sourced from Zacks.")

public class ZacksInstitutionalHolding {
  @SerializedName("company")
  private ZacksInstitutionalHoldingCompanySummary company = null;

  @SerializedName("owner")
  private ZacksInstitutionalHoldingOwnerSummary owner = null;

  @SerializedName("as_of_date")
  private LocalDate asOfDate = null;

  @SerializedName("shares_held")
  private BigDecimal sharesHeld = null;

  @SerializedName("shared_held_percent")
  private BigDecimal sharedHeldPercent = null;

  @SerializedName("shares_change")
  private BigDecimal sharesChange = null;

  @SerializedName("shares_change_percent")
  private BigDecimal sharesChangePercent = null;

  @SerializedName("market_value")
  private BigDecimal marketValue = null;

  @SerializedName("market_value_change")
  private BigDecimal marketValueChange = null;

  @SerializedName("last_sec_filing_type")
  private String lastSecFilingType = null;

  @SerializedName("last_sec_filing_date")
  private LocalDate lastSecFilingDate = null;

  @SerializedName("last_sec_filing_shares")
  private BigDecimal lastSecFilingShares = null;

  @SerializedName("historical_holdings")
  private List<ZacksInstitutionalHoldingHistoricalSummary> historicalHoldings = null;

  public ZacksInstitutionalHolding company(ZacksInstitutionalHoldingCompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public ZacksInstitutionalHoldingCompanySummary getCompany() {
    return company;
  }

  public void setCompany(ZacksInstitutionalHoldingCompanySummary company) {
    this.company = company;
  }

  public ZacksInstitutionalHolding owner(ZacksInstitutionalHoldingOwnerSummary owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public ZacksInstitutionalHoldingOwnerSummary getOwner() {
    return owner;
  }

  public void setOwner(ZacksInstitutionalHoldingOwnerSummary owner) {
    this.owner = owner;
  }

  public ZacksInstitutionalHolding asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Quarter end date listed in the most recent 13F report filed by the institution
   * @return asOfDate
  **/
  @ApiModelProperty(value = "Quarter end date listed in the most recent 13F report filed by the institution")
  public LocalDate getAsOfDate() {
    return asOfDate;
  }

  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }

  public ZacksInstitutionalHolding sharesHeld(BigDecimal sharesHeld) {
    this.sharesHeld = sharesHeld;
    return this;
  }

   /**
   * Number of shares of the stock listed
   * @return sharesHeld
  **/
  @ApiModelProperty(value = "Number of shares of the stock listed")
  public BigDecimal getSharesHeld() {
    return sharesHeld;
  }

  public void setSharesHeld(BigDecimal sharesHeld) {
    this.sharesHeld = sharesHeld;
  }

  public ZacksInstitutionalHolding sharedHeldPercent(BigDecimal sharedHeldPercent) {
    this.sharedHeldPercent = sharedHeldPercent;
    return this;
  }

   /**
   * Percent of shares outstanding held of the stock by the institution listed
   * @return sharedHeldPercent
  **/
  @ApiModelProperty(value = "Percent of shares outstanding held of the stock by the institution listed")
  public BigDecimal getSharedHeldPercent() {
    return sharedHeldPercent;
  }

  public void setSharedHeldPercent(BigDecimal sharedHeldPercent) {
    this.sharedHeldPercent = sharedHeldPercent;
  }

  public ZacksInstitutionalHolding sharesChange(BigDecimal sharesChange) {
    this.sharesChange = sharesChange;
    return this;
  }

   /**
   * Change in shares of the stock held by the institution listed
   * @return sharesChange
  **/
  @ApiModelProperty(value = "Change in shares of the stock held by the institution listed")
  public BigDecimal getSharesChange() {
    return sharesChange;
  }

  public void setSharesChange(BigDecimal sharesChange) {
    this.sharesChange = sharesChange;
  }

  public ZacksInstitutionalHolding sharesChangePercent(BigDecimal sharesChangePercent) {
    this.sharesChangePercent = sharesChangePercent;
    return this;
  }

   /**
   * Percentage change in shares of the stock held by the institution listed
   * @return sharesChangePercent
  **/
  @ApiModelProperty(value = "Percentage change in shares of the stock held by the institution listed")
  public BigDecimal getSharesChangePercent() {
    return sharesChangePercent;
  }

  public void setSharesChangePercent(BigDecimal sharesChangePercent) {
    this.sharesChangePercent = sharesChangePercent;
  }

  public ZacksInstitutionalHolding marketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
    return this;
  }

   /**
   * Market value of shares outstanding held of the stock listed
   * @return marketValue
  **/
  @ApiModelProperty(value = "Market value of shares outstanding held of the stock listed")
  public BigDecimal getMarketValue() {
    return marketValue;
  }

  public void setMarketValue(BigDecimal marketValue) {
    this.marketValue = marketValue;
  }

  public ZacksInstitutionalHolding marketValueChange(BigDecimal marketValueChange) {
    this.marketValueChange = marketValueChange;
    return this;
  }

   /**
   * Change in market value shares of the stock listed
   * @return marketValueChange
  **/
  @ApiModelProperty(value = "Change in market value shares of the stock listed")
  public BigDecimal getMarketValueChange() {
    return marketValueChange;
  }

  public void setMarketValueChange(BigDecimal marketValueChange) {
    this.marketValueChange = marketValueChange;
  }

  public ZacksInstitutionalHolding lastSecFilingType(String lastSecFilingType) {
    this.lastSecFilingType = lastSecFilingType;
    return this;
  }

   /**
   * The report type of the latest SEC filing
   * @return lastSecFilingType
  **/
  @ApiModelProperty(value = "The report type of the latest SEC filing")
  public String getLastSecFilingType() {
    return lastSecFilingType;
  }

  public void setLastSecFilingType(String lastSecFilingType) {
    this.lastSecFilingType = lastSecFilingType;
  }

  public ZacksInstitutionalHolding lastSecFilingDate(LocalDate lastSecFilingDate) {
    this.lastSecFilingDate = lastSecFilingDate;
    return this;
  }

   /**
   * The date of the latest SEC filing
   * @return lastSecFilingDate
  **/
  @ApiModelProperty(value = "The date of the latest SEC filing")
  public LocalDate getLastSecFilingDate() {
    return lastSecFilingDate;
  }

  public void setLastSecFilingDate(LocalDate lastSecFilingDate) {
    this.lastSecFilingDate = lastSecFilingDate;
  }

  public ZacksInstitutionalHolding lastSecFilingShares(BigDecimal lastSecFilingShares) {
    this.lastSecFilingShares = lastSecFilingShares;
    return this;
  }

   /**
   * The
   * @return lastSecFilingShares
  **/
  @ApiModelProperty(value = "The")
  public BigDecimal getLastSecFilingShares() {
    return lastSecFilingShares;
  }

  public void setLastSecFilingShares(BigDecimal lastSecFilingShares) {
    this.lastSecFilingShares = lastSecFilingShares;
  }

  public ZacksInstitutionalHolding historicalHoldings(List<ZacksInstitutionalHoldingHistoricalSummary> historicalHoldings) {
    this.historicalHoldings = historicalHoldings;
    return this;
  }

  public ZacksInstitutionalHolding addHistoricalHoldingsItem(ZacksInstitutionalHoldingHistoricalSummary historicalHoldingsItem) {
    if (this.historicalHoldings == null) {
      this.historicalHoldings = new ArrayList<ZacksInstitutionalHoldingHistoricalSummary>();
    }
    this.historicalHoldings.add(historicalHoldingsItem);
    return this;
  }

   /**
   * Get historicalHoldings
   * @return historicalHoldings
  **/
  @ApiModelProperty(value = "")
  public List<ZacksInstitutionalHoldingHistoricalSummary> getHistoricalHoldings() {
    return historicalHoldings;
  }

  public void setHistoricalHoldings(List<ZacksInstitutionalHoldingHistoricalSummary> historicalHoldings) {
    this.historicalHoldings = historicalHoldings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksInstitutionalHolding zacksInstitutionalHolding = (ZacksInstitutionalHolding) o;
    return Objects.equals(this.company, zacksInstitutionalHolding.company) &&
        Objects.equals(this.owner, zacksInstitutionalHolding.owner) &&
        Objects.equals(this.asOfDate, zacksInstitutionalHolding.asOfDate) &&
        Objects.equals(this.sharesHeld, zacksInstitutionalHolding.sharesHeld) &&
        Objects.equals(this.sharedHeldPercent, zacksInstitutionalHolding.sharedHeldPercent) &&
        Objects.equals(this.sharesChange, zacksInstitutionalHolding.sharesChange) &&
        Objects.equals(this.sharesChangePercent, zacksInstitutionalHolding.sharesChangePercent) &&
        Objects.equals(this.marketValue, zacksInstitutionalHolding.marketValue) &&
        Objects.equals(this.marketValueChange, zacksInstitutionalHolding.marketValueChange) &&
        Objects.equals(this.lastSecFilingType, zacksInstitutionalHolding.lastSecFilingType) &&
        Objects.equals(this.lastSecFilingDate, zacksInstitutionalHolding.lastSecFilingDate) &&
        Objects.equals(this.lastSecFilingShares, zacksInstitutionalHolding.lastSecFilingShares) &&
        Objects.equals(this.historicalHoldings, zacksInstitutionalHolding.historicalHoldings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, owner, asOfDate, sharesHeld, sharedHeldPercent, sharesChange, sharesChangePercent, marketValue, marketValueChange, lastSecFilingType, lastSecFilingDate, lastSecFilingShares, historicalHoldings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksInstitutionalHolding {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    sharesHeld: ").append(toIndentedString(sharesHeld)).append("\n");
    sb.append("    sharedHeldPercent: ").append(toIndentedString(sharedHeldPercent)).append("\n");
    sb.append("    sharesChange: ").append(toIndentedString(sharesChange)).append("\n");
    sb.append("    sharesChangePercent: ").append(toIndentedString(sharesChangePercent)).append("\n");
    sb.append("    marketValue: ").append(toIndentedString(marketValue)).append("\n");
    sb.append("    marketValueChange: ").append(toIndentedString(marketValueChange)).append("\n");
    sb.append("    lastSecFilingType: ").append(toIndentedString(lastSecFilingType)).append("\n");
    sb.append("    lastSecFilingDate: ").append(toIndentedString(lastSecFilingDate)).append("\n");
    sb.append("    lastSecFilingShares: ").append(toIndentedString(lastSecFilingShares)).append("\n");
    sb.append("    historicalHoldings: ").append(toIndentedString(historicalHoldings)).append("\n");
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

