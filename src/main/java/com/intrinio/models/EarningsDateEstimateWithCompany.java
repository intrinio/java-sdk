

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
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * An estimated earnings announcement date for a company&#39;s fiscal period
 */
@ApiModel(description = "An estimated earnings announcement date for a company's fiscal period")

public class EarningsDateEstimateWithCompany {
  @SerializedName("company_id")
  private String companyId = null;

  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("fiscal_year")
  private Integer fiscalYear = null;

  @SerializedName("fiscal_period")
  private String fiscalPeriod = null;

  @SerializedName("expected_date")
  private LocalDate expectedDate = null;

  @SerializedName("expected_8k_at")
  private OffsetDateTime expected8kAt = null;

  @SerializedName("historically_earliest")
  private String historicallyEarliest = null;

  @SerializedName("historically_latest")
  private String historicallyLatest = null;

  public EarningsDateEstimateWithCompany companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * The Intrinio ID for the company
   * @return companyId
  **/
  @ApiModelProperty(value = "The Intrinio ID for the company")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public EarningsDateEstimateWithCompany ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * The ticker symbol of the company
   * @return ticker
  **/
  @ApiModelProperty(value = "The ticker symbol of the company")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public EarningsDateEstimateWithCompany fiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * The fiscal year for the earnings report
   * @return fiscalYear
  **/
  @ApiModelProperty(value = "The fiscal year for the earnings report")
  public Integer getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public EarningsDateEstimateWithCompany fiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * The fiscal period for the earnings report (Q1, Q2, Q3, Q4, or FY)
   * @return fiscalPeriod
  **/
  @ApiModelProperty(value = "The fiscal period for the earnings report (Q1, Q2, Q3, Q4, or FY)")
  public String getFiscalPeriod() {
    return fiscalPeriod;
  }

  public void setFiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }

  public EarningsDateEstimateWithCompany expectedDate(LocalDate expectedDate) {
    this.expectedDate = expectedDate;
    return this;
  }

   /**
   * The expected date of the earnings announcement
   * @return expectedDate
  **/
  @ApiModelProperty(value = "The expected date of the earnings announcement")
  public LocalDate getExpectedDate() {
    return expectedDate;
  }

  public void setExpectedDate(LocalDate expectedDate) {
    this.expectedDate = expectedDate;
  }

  public EarningsDateEstimateWithCompany expected8kAt(OffsetDateTime expected8kAt) {
    this.expected8kAt = expected8kAt;
    return this;
  }

   /**
   * The expected timestamp when the 8-K filing will be available
   * @return expected8kAt
  **/
  @ApiModelProperty(value = "The expected timestamp when the 8-K filing will be available")
  public OffsetDateTime getExpected8kAt() {
    return expected8kAt;
  }

  public void setExpected8kAt(OffsetDateTime expected8kAt) {
    this.expected8kAt = expected8kAt;
  }

  public EarningsDateEstimateWithCompany historicallyEarliest(String historicallyEarliest) {
    this.historicallyEarliest = historicallyEarliest;
    return this;
  }

   /**
   * The earliest date (MM-DD format) this company has historically announced earnings for this fiscal period
   * @return historicallyEarliest
  **/
  @ApiModelProperty(value = "The earliest date (MM-DD format) this company has historically announced earnings for this fiscal period")
  public String getHistoricallyEarliest() {
    return historicallyEarliest;
  }

  public void setHistoricallyEarliest(String historicallyEarliest) {
    this.historicallyEarliest = historicallyEarliest;
  }

  public EarningsDateEstimateWithCompany historicallyLatest(String historicallyLatest) {
    this.historicallyLatest = historicallyLatest;
    return this;
  }

   /**
   * The latest date (MM-DD format) this company has historically announced earnings for this fiscal period
   * @return historicallyLatest
  **/
  @ApiModelProperty(value = "The latest date (MM-DD format) this company has historically announced earnings for this fiscal period")
  public String getHistoricallyLatest() {
    return historicallyLatest;
  }

  public void setHistoricallyLatest(String historicallyLatest) {
    this.historicallyLatest = historicallyLatest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsDateEstimateWithCompany earningsDateEstimateWithCompany = (EarningsDateEstimateWithCompany) o;
    return Objects.equals(this.companyId, earningsDateEstimateWithCompany.companyId) &&
        Objects.equals(this.ticker, earningsDateEstimateWithCompany.ticker) &&
        Objects.equals(this.fiscalYear, earningsDateEstimateWithCompany.fiscalYear) &&
        Objects.equals(this.fiscalPeriod, earningsDateEstimateWithCompany.fiscalPeriod) &&
        Objects.equals(this.expectedDate, earningsDateEstimateWithCompany.expectedDate) &&
        Objects.equals(this.expected8kAt, earningsDateEstimateWithCompany.expected8kAt) &&
        Objects.equals(this.historicallyEarliest, earningsDateEstimateWithCompany.historicallyEarliest) &&
        Objects.equals(this.historicallyLatest, earningsDateEstimateWithCompany.historicallyLatest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, ticker, fiscalYear, fiscalPeriod, expectedDate, expected8kAt, historicallyEarliest, historicallyLatest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsDateEstimateWithCompany {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    expectedDate: ").append(toIndentedString(expectedDate)).append("\n");
    sb.append("    expected8kAt: ").append(toIndentedString(expected8kAt)).append("\n");
    sb.append("    historicallyEarliest: ").append(toIndentedString(historicallyEarliest)).append("\n");
    sb.append("    historicallyLatest: ").append(toIndentedString(historicallyLatest)).append("\n");
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

