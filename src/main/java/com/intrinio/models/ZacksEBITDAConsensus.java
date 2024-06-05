

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
 * Zacks estimates for EBITDA, EBITDA margin, EBIT, Enterprise Value, Cash Flow Per Share, and Pretax Income
 */
@ApiModel(description = "Zacks estimates for EBITDA, EBITDA margin, EBIT, Enterprise Value, Cash Flow Per Share, and Pretax Income")

public class ZacksEBITDAConsensus {
  @SerializedName("ticker")
  private String ticker = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("estimate_year")
  private BigDecimal estimateYear = null;

  @SerializedName("estimate_month")
  private BigDecimal estimateMonth = null;

  @SerializedName("period")
  private String period = null;

  @SerializedName("consensus_type")
  private String consensusType = null;

  @SerializedName("estimate_count")
  private BigDecimal estimateCount = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("mean")
  private BigDecimal mean = null;

  @SerializedName("std_dev")
  private BigDecimal stdDev = null;

  public ZacksEBITDAConsensus ticker(String ticker) {
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

  public ZacksEBITDAConsensus companyName(String companyName) {
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

  public ZacksEBITDAConsensus estimateYear(BigDecimal estimateYear) {
    this.estimateYear = estimateYear;
    return this;
  }

   /**
   * Fiscal year of the estimate
   * @return estimateYear
  **/
  @ApiModelProperty(value = "Fiscal year of the estimate")
  public BigDecimal getEstimateYear() {
    return estimateYear;
  }

  public void setEstimateYear(BigDecimal estimateYear) {
    this.estimateYear = estimateYear;
  }

  public ZacksEBITDAConsensus estimateMonth(BigDecimal estimateMonth) {
    this.estimateMonth = estimateMonth;
    return this;
  }

   /**
   * Fiscal month of the estimate
   * @return estimateMonth
  **/
  @ApiModelProperty(value = "Fiscal month of the estimate")
  public BigDecimal getEstimateMonth() {
    return estimateMonth;
  }

  public void setEstimateMonth(BigDecimal estimateMonth) {
    this.estimateMonth = estimateMonth;
  }

  public ZacksEBITDAConsensus period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Whether the estimate year and month are fiscal year (fy) or quarter (fq)
   * @return period
  **/
  @ApiModelProperty(value = "Whether the estimate year and month are fiscal year (fy) or quarter (fq)")
  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public ZacksEBITDAConsensus consensusType(String consensusType) {
    this.consensusType = consensusType;
    return this;
  }

   /**
   * The type of estimate (ebitda, ebitda, ebit, enterprise_value, cash_flow_per_share, pretax_income)
   * @return consensusType
  **/
  @ApiModelProperty(value = "The type of estimate (ebitda, ebitda, ebit, enterprise_value, cash_flow_per_share, pretax_income)")
  public String getConsensusType() {
    return consensusType;
  }

  public void setConsensusType(String consensusType) {
    this.consensusType = consensusType;
  }

  public ZacksEBITDAConsensus estimateCount(BigDecimal estimateCount) {
    this.estimateCount = estimateCount;
    return this;
  }

   /**
   * The number of estimates
   * @return estimateCount
  **/
  @ApiModelProperty(value = "The number of estimates")
  public BigDecimal getEstimateCount() {
    return estimateCount;
  }

  public void setEstimateCount(BigDecimal estimateCount) {
    this.estimateCount = estimateCount;
  }

  public ZacksEBITDAConsensus high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The highest estimate
   * @return high
  **/
  @ApiModelProperty(value = "The highest estimate")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public ZacksEBITDAConsensus low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The lowest estimate
   * @return low
  **/
  @ApiModelProperty(value = "The lowest estimate")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public ZacksEBITDAConsensus mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * The mean value of all estimates
   * @return mean
  **/
  @ApiModelProperty(value = "The mean value of all estimates")
  public BigDecimal getMean() {
    return mean;
  }

  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  public ZacksEBITDAConsensus stdDev(BigDecimal stdDev) {
    this.stdDev = stdDev;
    return this;
  }

   /**
   * The standard deviation of all estimates
   * @return stdDev
  **/
  @ApiModelProperty(value = "The standard deviation of all estimates")
  public BigDecimal getStdDev() {
    return stdDev;
  }

  public void setStdDev(BigDecimal stdDev) {
    this.stdDev = stdDev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksEBITDAConsensus zacksEBITDAConsensus = (ZacksEBITDAConsensus) o;
    return Objects.equals(this.ticker, zacksEBITDAConsensus.ticker) &&
        Objects.equals(this.companyName, zacksEBITDAConsensus.companyName) &&
        Objects.equals(this.estimateYear, zacksEBITDAConsensus.estimateYear) &&
        Objects.equals(this.estimateMonth, zacksEBITDAConsensus.estimateMonth) &&
        Objects.equals(this.period, zacksEBITDAConsensus.period) &&
        Objects.equals(this.consensusType, zacksEBITDAConsensus.consensusType) &&
        Objects.equals(this.estimateCount, zacksEBITDAConsensus.estimateCount) &&
        Objects.equals(this.high, zacksEBITDAConsensus.high) &&
        Objects.equals(this.low, zacksEBITDAConsensus.low) &&
        Objects.equals(this.mean, zacksEBITDAConsensus.mean) &&
        Objects.equals(this.stdDev, zacksEBITDAConsensus.stdDev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticker, companyName, estimateYear, estimateMonth, period, consensusType, estimateCount, high, low, mean, stdDev);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksEBITDAConsensus {\n");
    
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    estimateYear: ").append(toIndentedString(estimateYear)).append("\n");
    sb.append("    estimateMonth: ").append(toIndentedString(estimateMonth)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    consensusType: ").append(toIndentedString(consensusType)).append("\n");
    sb.append("    estimateCount: ").append(toIndentedString(estimateCount)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
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

