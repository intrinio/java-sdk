

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
 * Zacks consensus sales estimates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each sales Estimate includes metadata about the corresponding Company.
 */
@ApiModel(description = "Zacks consensus sales estimates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each sales Estimate includes metadata about the corresponding Company.")

public class ZacksSalesEstimate {
  @SerializedName("company")
  private CompanySummary company = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("fiscal_year")
  private Integer fiscalYear = null;

  @SerializedName("fiscal_period")
  private String fiscalPeriod = null;

  @SerializedName("calendar_year")
  private Integer calendarYear = null;

  @SerializedName("calendar_period")
  private String calendarPeriod = null;

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

  @SerializedName("analyst_revisions_percent_change_1w")
  private BigDecimal analystRevisionsPercentChange1w = null;

  @SerializedName("analyst_revisions_up_1w")
  private BigDecimal analystRevisionsUp1w = null;

  @SerializedName("analyst_revisions_down_1w")
  private BigDecimal analystRevisionsDown1w = null;

  @SerializedName("analyst_revisions_percent_change_1m")
  private BigDecimal analystRevisionsPercentChange1m = null;

  @SerializedName("analyst_revisions_up_1m")
  private BigDecimal analystRevisionsUp1m = null;

  @SerializedName("analyst_revisions_down_1m")
  private BigDecimal analystRevisionsDown1m = null;

  @SerializedName("analyst_revisions_percent_change_3m")
  private BigDecimal analystRevisionsPercentChange3m = null;

  @SerializedName("analyst_revisions_up_3m")
  private BigDecimal analystRevisionsUp3m = null;

  @SerializedName("analyst_revisions_down_3m")
  private BigDecimal analystRevisionsDown3m = null;

  public ZacksSalesEstimate company(CompanySummary company) {
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

  public ZacksSalesEstimate date(LocalDate date) {
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

  public ZacksSalesEstimate fiscalYear(Integer fiscalYear) {
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

  public ZacksSalesEstimate fiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * The company’s fiscal quarter for the reported period
   * @return fiscalPeriod
  **/
  @ApiModelProperty(value = "The company’s fiscal quarter for the reported period")
  public String getFiscalPeriod() {
    return fiscalPeriod;
  }

  public void setFiscalPeriod(String fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }

  public ZacksSalesEstimate calendarYear(Integer calendarYear) {
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

  public ZacksSalesEstimate calendarPeriod(String calendarPeriod) {
    this.calendarPeriod = calendarPeriod;
    return this;
  }

   /**
   * The closest calendar quarter for the company’s fiscal year
   * @return calendarPeriod
  **/
  @ApiModelProperty(value = "The closest calendar quarter for the company’s fiscal year")
  public String getCalendarPeriod() {
    return calendarPeriod;
  }

  public void setCalendarPeriod(String calendarPeriod) {
    this.calendarPeriod = calendarPeriod;
  }

  public ZacksSalesEstimate count(Integer count) {
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

  public ZacksSalesEstimate mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * The sales estimate mean estimate for the period
   * @return mean
  **/
  @ApiModelProperty(value = "The sales estimate mean estimate for the period")
  public BigDecimal getMean() {
    return mean;
  }

  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  public ZacksSalesEstimate median(BigDecimal median) {
    this.median = median;
    return this;
  }

   /**
   * The sales estimate median estimate for the period
   * @return median
  **/
  @ApiModelProperty(value = "The sales estimate median estimate for the period")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public ZacksSalesEstimate high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The sales estimate high estimate for the period
   * @return high
  **/
  @ApiModelProperty(value = "The sales estimate high estimate for the period")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public ZacksSalesEstimate low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The sales estimate low estimate for the period
   * @return low
  **/
  @ApiModelProperty(value = "The sales estimate low estimate for the period")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public ZacksSalesEstimate standardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
    return this;
  }

   /**
   * The sales estimate standard deviation estimate for the period
   * @return standardDeviation
  **/
  @ApiModelProperty(value = "The sales estimate standard deviation estimate for the period")
  public BigDecimal getStandardDeviation() {
    return standardDeviation;
  }

  public void setStandardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  public ZacksSalesEstimate analystRevisionsPercentChange1w(BigDecimal analystRevisionsPercentChange1w) {
    this.analystRevisionsPercentChange1w = analystRevisionsPercentChange1w;
    return this;
  }

   /**
   * The analyst revisions percent change in estimate for the period of 1 week.
   * @return analystRevisionsPercentChange1w
  **/
  @ApiModelProperty(value = "The analyst revisions percent change in estimate for the period of 1 week.")
  public BigDecimal getAnalystRevisionsPercentChange1w() {
    return analystRevisionsPercentChange1w;
  }

  public void setAnalystRevisionsPercentChange1w(BigDecimal analystRevisionsPercentChange1w) {
    this.analystRevisionsPercentChange1w = analystRevisionsPercentChange1w;
  }

  public ZacksSalesEstimate analystRevisionsUp1w(BigDecimal analystRevisionsUp1w) {
    this.analystRevisionsUp1w = analystRevisionsUp1w;
    return this;
  }

   /**
   * The analyst revisions going up for the period of 1 week.
   * @return analystRevisionsUp1w
  **/
  @ApiModelProperty(value = "The analyst revisions going up for the period of 1 week.")
  public BigDecimal getAnalystRevisionsUp1w() {
    return analystRevisionsUp1w;
  }

  public void setAnalystRevisionsUp1w(BigDecimal analystRevisionsUp1w) {
    this.analystRevisionsUp1w = analystRevisionsUp1w;
  }

  public ZacksSalesEstimate analystRevisionsDown1w(BigDecimal analystRevisionsDown1w) {
    this.analystRevisionsDown1w = analystRevisionsDown1w;
    return this;
  }

   /**
   * The analyst revisions going down for the period of 1 week.
   * @return analystRevisionsDown1w
  **/
  @ApiModelProperty(value = "The analyst revisions going down for the period of 1 week.")
  public BigDecimal getAnalystRevisionsDown1w() {
    return analystRevisionsDown1w;
  }

  public void setAnalystRevisionsDown1w(BigDecimal analystRevisionsDown1w) {
    this.analystRevisionsDown1w = analystRevisionsDown1w;
  }

  public ZacksSalesEstimate analystRevisionsPercentChange1m(BigDecimal analystRevisionsPercentChange1m) {
    this.analystRevisionsPercentChange1m = analystRevisionsPercentChange1m;
    return this;
  }

   /**
   * The analyst revisions percent change in estimate for the period of 1 month.
   * @return analystRevisionsPercentChange1m
  **/
  @ApiModelProperty(value = "The analyst revisions percent change in estimate for the period of 1 month.")
  public BigDecimal getAnalystRevisionsPercentChange1m() {
    return analystRevisionsPercentChange1m;
  }

  public void setAnalystRevisionsPercentChange1m(BigDecimal analystRevisionsPercentChange1m) {
    this.analystRevisionsPercentChange1m = analystRevisionsPercentChange1m;
  }

  public ZacksSalesEstimate analystRevisionsUp1m(BigDecimal analystRevisionsUp1m) {
    this.analystRevisionsUp1m = analystRevisionsUp1m;
    return this;
  }

   /**
   * The analyst revisions going up for the period of 1 month.
   * @return analystRevisionsUp1m
  **/
  @ApiModelProperty(value = "The analyst revisions going up for the period of 1 month.")
  public BigDecimal getAnalystRevisionsUp1m() {
    return analystRevisionsUp1m;
  }

  public void setAnalystRevisionsUp1m(BigDecimal analystRevisionsUp1m) {
    this.analystRevisionsUp1m = analystRevisionsUp1m;
  }

  public ZacksSalesEstimate analystRevisionsDown1m(BigDecimal analystRevisionsDown1m) {
    this.analystRevisionsDown1m = analystRevisionsDown1m;
    return this;
  }

   /**
   * The analyst revisions going down for the period of 1 month.
   * @return analystRevisionsDown1m
  **/
  @ApiModelProperty(value = "The analyst revisions going down for the period of 1 month.")
  public BigDecimal getAnalystRevisionsDown1m() {
    return analystRevisionsDown1m;
  }

  public void setAnalystRevisionsDown1m(BigDecimal analystRevisionsDown1m) {
    this.analystRevisionsDown1m = analystRevisionsDown1m;
  }

  public ZacksSalesEstimate analystRevisionsPercentChange3m(BigDecimal analystRevisionsPercentChange3m) {
    this.analystRevisionsPercentChange3m = analystRevisionsPercentChange3m;
    return this;
  }

   /**
   * The analyst revisions percent change in estimate for the period of 3 months.
   * @return analystRevisionsPercentChange3m
  **/
  @ApiModelProperty(value = "The analyst revisions percent change in estimate for the period of 3 months.")
  public BigDecimal getAnalystRevisionsPercentChange3m() {
    return analystRevisionsPercentChange3m;
  }

  public void setAnalystRevisionsPercentChange3m(BigDecimal analystRevisionsPercentChange3m) {
    this.analystRevisionsPercentChange3m = analystRevisionsPercentChange3m;
  }

  public ZacksSalesEstimate analystRevisionsUp3m(BigDecimal analystRevisionsUp3m) {
    this.analystRevisionsUp3m = analystRevisionsUp3m;
    return this;
  }

   /**
   * The analyst revisions going up for the period of 3 months.
   * @return analystRevisionsUp3m
  **/
  @ApiModelProperty(value = "The analyst revisions going up for the period of 3 months.")
  public BigDecimal getAnalystRevisionsUp3m() {
    return analystRevisionsUp3m;
  }

  public void setAnalystRevisionsUp3m(BigDecimal analystRevisionsUp3m) {
    this.analystRevisionsUp3m = analystRevisionsUp3m;
  }

  public ZacksSalesEstimate analystRevisionsDown3m(BigDecimal analystRevisionsDown3m) {
    this.analystRevisionsDown3m = analystRevisionsDown3m;
    return this;
  }

   /**
   * The analyst revisions going down for the period of 3 months.
   * @return analystRevisionsDown3m
  **/
  @ApiModelProperty(value = "The analyst revisions going down for the period of 3 months.")
  public BigDecimal getAnalystRevisionsDown3m() {
    return analystRevisionsDown3m;
  }

  public void setAnalystRevisionsDown3m(BigDecimal analystRevisionsDown3m) {
    this.analystRevisionsDown3m = analystRevisionsDown3m;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksSalesEstimate zacksSalesEstimate = (ZacksSalesEstimate) o;
    return Objects.equals(this.company, zacksSalesEstimate.company) &&
        Objects.equals(this.date, zacksSalesEstimate.date) &&
        Objects.equals(this.fiscalYear, zacksSalesEstimate.fiscalYear) &&
        Objects.equals(this.fiscalPeriod, zacksSalesEstimate.fiscalPeriod) &&
        Objects.equals(this.calendarYear, zacksSalesEstimate.calendarYear) &&
        Objects.equals(this.calendarPeriod, zacksSalesEstimate.calendarPeriod) &&
        Objects.equals(this.count, zacksSalesEstimate.count) &&
        Objects.equals(this.mean, zacksSalesEstimate.mean) &&
        Objects.equals(this.median, zacksSalesEstimate.median) &&
        Objects.equals(this.high, zacksSalesEstimate.high) &&
        Objects.equals(this.low, zacksSalesEstimate.low) &&
        Objects.equals(this.standardDeviation, zacksSalesEstimate.standardDeviation) &&
        Objects.equals(this.analystRevisionsPercentChange1w, zacksSalesEstimate.analystRevisionsPercentChange1w) &&
        Objects.equals(this.analystRevisionsUp1w, zacksSalesEstimate.analystRevisionsUp1w) &&
        Objects.equals(this.analystRevisionsDown1w, zacksSalesEstimate.analystRevisionsDown1w) &&
        Objects.equals(this.analystRevisionsPercentChange1m, zacksSalesEstimate.analystRevisionsPercentChange1m) &&
        Objects.equals(this.analystRevisionsUp1m, zacksSalesEstimate.analystRevisionsUp1m) &&
        Objects.equals(this.analystRevisionsDown1m, zacksSalesEstimate.analystRevisionsDown1m) &&
        Objects.equals(this.analystRevisionsPercentChange3m, zacksSalesEstimate.analystRevisionsPercentChange3m) &&
        Objects.equals(this.analystRevisionsUp3m, zacksSalesEstimate.analystRevisionsUp3m) &&
        Objects.equals(this.analystRevisionsDown3m, zacksSalesEstimate.analystRevisionsDown3m);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, date, fiscalYear, fiscalPeriod, calendarYear, calendarPeriod, count, mean, median, high, low, standardDeviation, analystRevisionsPercentChange1w, analystRevisionsUp1w, analystRevisionsDown1w, analystRevisionsPercentChange1m, analystRevisionsUp1m, analystRevisionsDown1m, analystRevisionsPercentChange3m, analystRevisionsUp3m, analystRevisionsDown3m);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksSalesEstimate {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    calendarYear: ").append(toIndentedString(calendarYear)).append("\n");
    sb.append("    calendarPeriod: ").append(toIndentedString(calendarPeriod)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
    sb.append("    analystRevisionsPercentChange1w: ").append(toIndentedString(analystRevisionsPercentChange1w)).append("\n");
    sb.append("    analystRevisionsUp1w: ").append(toIndentedString(analystRevisionsUp1w)).append("\n");
    sb.append("    analystRevisionsDown1w: ").append(toIndentedString(analystRevisionsDown1w)).append("\n");
    sb.append("    analystRevisionsPercentChange1m: ").append(toIndentedString(analystRevisionsPercentChange1m)).append("\n");
    sb.append("    analystRevisionsUp1m: ").append(toIndentedString(analystRevisionsUp1m)).append("\n");
    sb.append("    analystRevisionsDown1m: ").append(toIndentedString(analystRevisionsDown1m)).append("\n");
    sb.append("    analystRevisionsPercentChange3m: ").append(toIndentedString(analystRevisionsPercentChange3m)).append("\n");
    sb.append("    analystRevisionsUp3m: ").append(toIndentedString(analystRevisionsUp3m)).append("\n");
    sb.append("    analystRevisionsDown3m: ").append(toIndentedString(analystRevisionsDown3m)).append("\n");
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

