

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.EarningsDateEstimateConfidenceIntervals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * An estimated earnings announcement date for a company&#39;s fiscal period
 */
@ApiModel(description = "An estimated earnings announcement date for a company's fiscal period")

public class EarningsDateEstimate {
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

  @SerializedName("confidence_intervals")
  private Map<String, EarningsDateEstimateConfidenceIntervals> confidenceIntervals = null;

  public EarningsDateEstimate fiscalYear(Integer fiscalYear) {
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

  public EarningsDateEstimate fiscalPeriod(String fiscalPeriod) {
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

  public EarningsDateEstimate expectedDate(LocalDate expectedDate) {
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

  public EarningsDateEstimate expected8kAt(OffsetDateTime expected8kAt) {
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

  public EarningsDateEstimate historicallyEarliest(String historicallyEarliest) {
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

  public EarningsDateEstimate historicallyLatest(String historicallyLatest) {
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

  public EarningsDateEstimate confidenceIntervals(Map<String, EarningsDateEstimateConfidenceIntervals> confidenceIntervals) {
    this.confidenceIntervals = confidenceIntervals;
    return this;
  }

  public EarningsDateEstimate putConfidenceIntervalsItem(String key, EarningsDateEstimateConfidenceIntervals confidenceIntervalsItem) {
    if (this.confidenceIntervals == null) {
      this.confidenceIntervals = new HashMap<>();
    }
    this.confidenceIntervals.put(key, confidenceIntervalsItem);
    return this;
  }

   /**
   * Confidence intervals for the expected date, sorted by confidence level (descending)
   * @return confidenceIntervals
  **/
  @ApiModelProperty(value = "Confidence intervals for the expected date, sorted by confidence level (descending)")
  public Map<String, EarningsDateEstimateConfidenceIntervals> getConfidenceIntervals() {
    return confidenceIntervals;
  }

  public void setConfidenceIntervals(Map<String, EarningsDateEstimateConfidenceIntervals> confidenceIntervals) {
    this.confidenceIntervals = confidenceIntervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsDateEstimate earningsDateEstimate = (EarningsDateEstimate) o;
    return Objects.equals(this.fiscalYear, earningsDateEstimate.fiscalYear) &&
        Objects.equals(this.fiscalPeriod, earningsDateEstimate.fiscalPeriod) &&
        Objects.equals(this.expectedDate, earningsDateEstimate.expectedDate) &&
        Objects.equals(this.expected8kAt, earningsDateEstimate.expected8kAt) &&
        Objects.equals(this.historicallyEarliest, earningsDateEstimate.historicallyEarliest) &&
        Objects.equals(this.historicallyLatest, earningsDateEstimate.historicallyLatest) &&
        Objects.equals(this.confidenceIntervals, earningsDateEstimate.confidenceIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, fiscalPeriod, expectedDate, expected8kAt, historicallyEarliest, historicallyLatest, confidenceIntervals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsDateEstimate {\n");
    
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    expectedDate: ").append(toIndentedString(expectedDate)).append("\n");
    sb.append("    expected8kAt: ").append(toIndentedString(expected8kAt)).append("\n");
    sb.append("    historicallyEarliest: ").append(toIndentedString(historicallyEarliest)).append("\n");
    sb.append("    historicallyLatest: ").append(toIndentedString(historicallyLatest)).append("\n");
    sb.append("    confidenceIntervals: ").append(toIndentedString(confidenceIntervals)).append("\n");
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

