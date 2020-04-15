

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.CompanySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;

/**
 * Zacks consensus earnings-per-share (EPS) estimates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each EPS Estimate includes metadata about the corresponding Company.
 */
@ApiModel(description = "Zacks consensus earnings-per-share (EPS) estimates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each EPS Estimate includes metadata about the corresponding Company.")

public class ZacksEPSEstimate {
  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("fiscal_year")
  private Integer fiscalYear = null;

  @SerializedName("fiscal_quarter")
  private String fiscalQuarter = null;

  @SerializedName("calendar_year")
  private Integer calendarYear = null;

  @SerializedName("calendar_quarter")
  private String calendarQuarter = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("mean")
  private BigDecimal mean = null;

  @SerializedName("median")
  private BigDecimal median = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("standard_deviation")
  private BigDecimal standardDeviation = null;

  @SerializedName("percent_change")
  private BigDecimal percentChange = null;

  @SerializedName("mean_7_days_ago")
  private BigDecimal mean7DaysAgo = null;

  @SerializedName("mean_30_days_ago")
  private BigDecimal mean30DaysAgo = null;

  @SerializedName("mean_60_days_ago")
  private BigDecimal mean60DaysAgo = null;

  @SerializedName("mean_90_days_ago")
  private BigDecimal mean90DaysAgo = null;

  public ZacksEPSEstimate company(CompanySummary company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public CompanySummary getCompany() {
    return company;
  }

  public void setCompany(CompanySummary company) {
    this.company = company;
  }

  public ZacksEPSEstimate date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The period end date
   * @return date
  **/
  @ApiModelProperty(value = "The period end date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ZacksEPSEstimate fiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * The company’s fiscal year for the reported period
   * @return fiscalYear
  **/
  @ApiModelProperty(value = "The company’s fiscal year for the reported period")
  public Integer getFiscalYear() {
    return fiscalYear;
  }

  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }

  public ZacksEPSEstimate fiscalQuarter(String fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
    return this;
  }

   /**
   * The company’s fiscal quarter for the reported period
   * @return fiscalQuarter
  **/
  @ApiModelProperty(value = "The company’s fiscal quarter for the reported period")
  public String getFiscalQuarter() {
    return fiscalQuarter;
  }

  public void setFiscalQuarter(String fiscalQuarter) {
    this.fiscalQuarter = fiscalQuarter;
  }

  public ZacksEPSEstimate calendarYear(Integer calendarYear) {
    this.calendarYear = calendarYear;
    return this;
  }

   /**
   * The closest calendar year for the company’s fiscal year
   * @return calendarYear
  **/
  @ApiModelProperty(value = "The closest calendar year for the company’s fiscal year")
  public Integer getCalendarYear() {
    return calendarYear;
  }

  public void setCalendarYear(Integer calendarYear) {
    this.calendarYear = calendarYear;
  }

  public ZacksEPSEstimate calendarQuarter(String calendarQuarter) {
    this.calendarQuarter = calendarQuarter;
    return this;
  }

   /**
   * The closest calendar quarter for the company’s fiscal year
   * @return calendarQuarter
  **/
  @ApiModelProperty(value = "The closest calendar quarter for the company’s fiscal year")
  public String getCalendarQuarter() {
    return calendarQuarter;
  }

  public void setCalendarQuarter(String calendarQuarter) {
    this.calendarQuarter = calendarQuarter;
  }

  public ZacksEPSEstimate count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of estimates for the period
   * @return count
  **/
  @ApiModelProperty(value = "The number of estimates for the period")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ZacksEPSEstimate mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * The earnings per share (EPS) mean estimate for the period
   * @return mean
  **/
  @ApiModelProperty(value = "The earnings per share (EPS) mean estimate for the period")
  public BigDecimal getMean() {
    return mean;
  }

  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  public ZacksEPSEstimate median(BigDecimal median) {
    this.median = median;
    return this;
  }

   /**
   * The earnings per share (EPS) median estimate for the period
   * @return median
  **/
  @ApiModelProperty(value = "The earnings per share (EPS) median estimate for the period")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public ZacksEPSEstimate high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The earnings per share (EPS) high estimate for the period
   * @return high
  **/
  @ApiModelProperty(value = "The earnings per share (EPS) high estimate for the period")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public ZacksEPSEstimate low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The earnings per share (EPS) low estimate for the period
   * @return low
  **/
  @ApiModelProperty(value = "The earnings per share (EPS) low estimate for the period")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public ZacksEPSEstimate standardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
    return this;
  }

   /**
   * The earnings per share (EPS) standard deviation estimate for the period
   * @return standardDeviation
  **/
  @ApiModelProperty(value = "The earnings per share (EPS) standard deviation estimate for the period")
  public BigDecimal getStandardDeviation() {
    return standardDeviation;
  }

  public void setStandardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  public ZacksEPSEstimate percentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
    return this;
  }

   /**
   * The earnings per share (EPS) percent change in estimate for the period
   * @return percentChange
  **/
  @ApiModelProperty(value = "The earnings per share (EPS) percent change in estimate for the period")
  public BigDecimal getPercentChange() {
    return percentChange;
  }

  public void setPercentChange(BigDecimal percentChange) {
    this.percentChange = percentChange;
  }

  public ZacksEPSEstimate mean7DaysAgo(BigDecimal mean7DaysAgo) {
    this.mean7DaysAgo = mean7DaysAgo;
    return this;
  }

   /**
   * The long term growth mean estimate - 7 Days Ago
   * @return mean7DaysAgo
  **/
  @ApiModelProperty(value = "The long term growth mean estimate - 7 Days Ago")
  public BigDecimal getMean7DaysAgo() {
    return mean7DaysAgo;
  }

  public void setMean7DaysAgo(BigDecimal mean7DaysAgo) {
    this.mean7DaysAgo = mean7DaysAgo;
  }

  public ZacksEPSEstimate mean30DaysAgo(BigDecimal mean30DaysAgo) {
    this.mean30DaysAgo = mean30DaysAgo;
    return this;
  }

   /**
   * The long term growth mean estimate - 30 Days Ago
   * @return mean30DaysAgo
  **/
  @ApiModelProperty(value = "The long term growth mean estimate - 30 Days Ago")
  public BigDecimal getMean30DaysAgo() {
    return mean30DaysAgo;
  }

  public void setMean30DaysAgo(BigDecimal mean30DaysAgo) {
    this.mean30DaysAgo = mean30DaysAgo;
  }

  public ZacksEPSEstimate mean60DaysAgo(BigDecimal mean60DaysAgo) {
    this.mean60DaysAgo = mean60DaysAgo;
    return this;
  }

   /**
   * The long term growth mean estimate - 60 Days Ago
   * @return mean60DaysAgo
  **/
  @ApiModelProperty(value = "The long term growth mean estimate - 60 Days Ago")
  public BigDecimal getMean60DaysAgo() {
    return mean60DaysAgo;
  }

  public void setMean60DaysAgo(BigDecimal mean60DaysAgo) {
    this.mean60DaysAgo = mean60DaysAgo;
  }

  public ZacksEPSEstimate mean90DaysAgo(BigDecimal mean90DaysAgo) {
    this.mean90DaysAgo = mean90DaysAgo;
    return this;
  }

   /**
   * The long term growth mean estimate - 90 Days Ago
   * @return mean90DaysAgo
  **/
  @ApiModelProperty(value = "The long term growth mean estimate - 90 Days Ago")
  public BigDecimal getMean90DaysAgo() {
    return mean90DaysAgo;
  }

  public void setMean90DaysAgo(BigDecimal mean90DaysAgo) {
    this.mean90DaysAgo = mean90DaysAgo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksEPSEstimate zacksEPSEstimate = (ZacksEPSEstimate) o;
    return Objects.equals(this.company, zacksEPSEstimate.company) &&
        Objects.equals(this.date, zacksEPSEstimate.date) &&
        Objects.equals(this.fiscalYear, zacksEPSEstimate.fiscalYear) &&
        Objects.equals(this.fiscalQuarter, zacksEPSEstimate.fiscalQuarter) &&
        Objects.equals(this.calendarYear, zacksEPSEstimate.calendarYear) &&
        Objects.equals(this.calendarQuarter, zacksEPSEstimate.calendarQuarter) &&
        Objects.equals(this.count, zacksEPSEstimate.count) &&
        Objects.equals(this.mean, zacksEPSEstimate.mean) &&
        Objects.equals(this.median, zacksEPSEstimate.median) &&
        Objects.equals(this.high, zacksEPSEstimate.high) &&
        Objects.equals(this.low, zacksEPSEstimate.low) &&
        Objects.equals(this.standardDeviation, zacksEPSEstimate.standardDeviation) &&
        Objects.equals(this.percentChange, zacksEPSEstimate.percentChange) &&
        Objects.equals(this.mean7DaysAgo, zacksEPSEstimate.mean7DaysAgo) &&
        Objects.equals(this.mean30DaysAgo, zacksEPSEstimate.mean30DaysAgo) &&
        Objects.equals(this.mean60DaysAgo, zacksEPSEstimate.mean60DaysAgo) &&
        Objects.equals(this.mean90DaysAgo, zacksEPSEstimate.mean90DaysAgo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, date, fiscalYear, fiscalQuarter, calendarYear, calendarQuarter, count, mean, median, high, low, standardDeviation, percentChange, mean7DaysAgo, mean30DaysAgo, mean60DaysAgo, mean90DaysAgo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksEPSEstimate {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalQuarter: ").append(toIndentedString(fiscalQuarter)).append("\n");
    sb.append("    calendarYear: ").append(toIndentedString(calendarYear)).append("\n");
    sb.append("    calendarQuarter: ").append(toIndentedString(calendarQuarter)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
    sb.append("    percentChange: ").append(toIndentedString(percentChange)).append("\n");
    sb.append("    mean7DaysAgo: ").append(toIndentedString(mean7DaysAgo)).append("\n");
    sb.append("    mean30DaysAgo: ").append(toIndentedString(mean30DaysAgo)).append("\n");
    sb.append("    mean60DaysAgo: ").append(toIndentedString(mean60DaysAgo)).append("\n");
    sb.append("    mean90DaysAgo: ").append(toIndentedString(mean90DaysAgo)).append("\n");
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

