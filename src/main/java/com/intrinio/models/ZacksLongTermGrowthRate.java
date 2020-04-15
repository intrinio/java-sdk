

package com.intrinio.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intrinio.models.SecuritySummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Zacks long term growth rates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each Growth Rate includes metadata about the corresponding Security.
 */
@ApiModel(description = "Zacks long term growth rates from analysts for thousands of stocks.  Zacks storied research team aggregates and validates the estimates.  Each Growth Rate includes metadata about the corresponding Security.")

public class ZacksLongTermGrowthRate {
  @SerializedName("mean")
  private BigDecimal mean = null;

  @SerializedName("median")
  private BigDecimal median = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("high")
  private BigDecimal high = null;

  @SerializedName("low")
  private BigDecimal low = null;

  @SerializedName("std_dev")
  private String stdDev = null;

  @SerializedName("revisions_upward")
  private Integer revisionsUpward = null;

  @SerializedName("revisions_downward")
  private Integer revisionsDownward = null;

  @SerializedName("mean_7_days_ago")
  private String mean7DaysAgo = null;

  @SerializedName("mean_30_days_ago")
  private String mean30DaysAgo = null;

  @SerializedName("mean_60_days_ago")
  private String mean60DaysAgo = null;

  @SerializedName("mean_90_days_ago")
  private String mean90DaysAgo = null;

  @SerializedName("revisions_upward_last_7_days")
  private String revisionsUpwardLast7Days = null;

  @SerializedName("revisions_downward_last_7_days")
  private String revisionsDownwardLast7Days = null;

  @SerializedName("revisions_upward_last_30_days")
  private String revisionsUpwardLast30Days = null;

  @SerializedName("revisions_downward_last_30_days")
  private String revisionsDownwardLast30Days = null;

  @SerializedName("revisions_upward_last_60_days")
  private String revisionsUpwardLast60Days = null;

  @SerializedName("revisions_downward_last_60_days")
  private String revisionsDownwardLast60Days = null;

  @SerializedName("revisions_upward_last_90_days")
  private String revisionsUpwardLast90Days = null;

  @SerializedName("revisions_downward_last_90_days")
  private String revisionsDownwardLast90Days = null;

  @SerializedName("revisions_upward_last_120_days")
  private String revisionsUpwardLast120Days = null;

  @SerializedName("revisions_downward_last_120_days")
  private String revisionsDownwardLast120Days = null;

  @SerializedName("revisions_upward_last_150_days")
  private String revisionsUpwardLast150Days = null;

  @SerializedName("revisions_downward_last_150_days")
  private String revisionsDownwardLast150Days = null;

  @SerializedName("security")
  private SecuritySummary security = null;

  public ZacksLongTermGrowthRate mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * The mean long term growth estimate
   * @return mean
  **/
  @ApiModelProperty(value = "The mean long term growth estimate")
  public BigDecimal getMean() {
    return mean;
  }

  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  public ZacksLongTermGrowthRate median(BigDecimal median) {
    this.median = median;
    return this;
  }

   /**
   * The median long term growth estimate
   * @return median
  **/
  @ApiModelProperty(value = "The median long term growth estimate")
  public BigDecimal getMedian() {
    return median;
  }

  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  public ZacksLongTermGrowthRate count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of long term growth estimates
   * @return count
  **/
  @ApiModelProperty(value = "The number of long term growth estimates")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ZacksLongTermGrowthRate high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * The high long term growth estimate
   * @return high
  **/
  @ApiModelProperty(value = "The high long term growth estimate")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public ZacksLongTermGrowthRate low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * The low long term growth estimate
   * @return low
  **/
  @ApiModelProperty(value = "The low long term growth estimate")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public ZacksLongTermGrowthRate stdDev(String stdDev) {
    this.stdDev = stdDev;
    return this;
  }

   /**
   * The standard deviation long term growth estimate
   * @return stdDev
  **/
  @ApiModelProperty(value = "The standard deviation long term growth estimate")
  public String getStdDev() {
    return stdDev;
  }

  public void setStdDev(String stdDev) {
    this.stdDev = stdDev;
  }

  public ZacksLongTermGrowthRate revisionsUpward(Integer revisionsUpward) {
    this.revisionsUpward = revisionsUpward;
    return this;
  }

   /**
   * The number of long term growth estimate revisions upward
   * @return revisionsUpward
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions upward")
  public Integer getRevisionsUpward() {
    return revisionsUpward;
  }

  public void setRevisionsUpward(Integer revisionsUpward) {
    this.revisionsUpward = revisionsUpward;
  }

  public ZacksLongTermGrowthRate revisionsDownward(Integer revisionsDownward) {
    this.revisionsDownward = revisionsDownward;
    return this;
  }

   /**
   * The number of long term growth estimate revisions downward
   * @return revisionsDownward
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions downward")
  public Integer getRevisionsDownward() {
    return revisionsDownward;
  }

  public void setRevisionsDownward(Integer revisionsDownward) {
    this.revisionsDownward = revisionsDownward;
  }

  public ZacksLongTermGrowthRate mean7DaysAgo(String mean7DaysAgo) {
    this.mean7DaysAgo = mean7DaysAgo;
    return this;
  }

   /**
   * The mean long term growth estimate 7 days ago
   * @return mean7DaysAgo
  **/
  @ApiModelProperty(value = "The mean long term growth estimate 7 days ago")
  public String getMean7DaysAgo() {
    return mean7DaysAgo;
  }

  public void setMean7DaysAgo(String mean7DaysAgo) {
    this.mean7DaysAgo = mean7DaysAgo;
  }

  public ZacksLongTermGrowthRate mean30DaysAgo(String mean30DaysAgo) {
    this.mean30DaysAgo = mean30DaysAgo;
    return this;
  }

   /**
   * The mean long term growth estimate 30 days ago
   * @return mean30DaysAgo
  **/
  @ApiModelProperty(value = "The mean long term growth estimate 30 days ago")
  public String getMean30DaysAgo() {
    return mean30DaysAgo;
  }

  public void setMean30DaysAgo(String mean30DaysAgo) {
    this.mean30DaysAgo = mean30DaysAgo;
  }

  public ZacksLongTermGrowthRate mean60DaysAgo(String mean60DaysAgo) {
    this.mean60DaysAgo = mean60DaysAgo;
    return this;
  }

   /**
   * The mean long term growth estimate 60 days ago
   * @return mean60DaysAgo
  **/
  @ApiModelProperty(value = "The mean long term growth estimate 60 days ago")
  public String getMean60DaysAgo() {
    return mean60DaysAgo;
  }

  public void setMean60DaysAgo(String mean60DaysAgo) {
    this.mean60DaysAgo = mean60DaysAgo;
  }

  public ZacksLongTermGrowthRate mean90DaysAgo(String mean90DaysAgo) {
    this.mean90DaysAgo = mean90DaysAgo;
    return this;
  }

   /**
   * The mean long term growth estimate 90 days ago
   * @return mean90DaysAgo
  **/
  @ApiModelProperty(value = "The mean long term growth estimate 90 days ago")
  public String getMean90DaysAgo() {
    return mean90DaysAgo;
  }

  public void setMean90DaysAgo(String mean90DaysAgo) {
    this.mean90DaysAgo = mean90DaysAgo;
  }

  public ZacksLongTermGrowthRate revisionsUpwardLast7Days(String revisionsUpwardLast7Days) {
    this.revisionsUpwardLast7Days = revisionsUpwardLast7Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions upward in the last 7 days
   * @return revisionsUpwardLast7Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions upward in the last 7 days")
  public String getRevisionsUpwardLast7Days() {
    return revisionsUpwardLast7Days;
  }

  public void setRevisionsUpwardLast7Days(String revisionsUpwardLast7Days) {
    this.revisionsUpwardLast7Days = revisionsUpwardLast7Days;
  }

  public ZacksLongTermGrowthRate revisionsDownwardLast7Days(String revisionsDownwardLast7Days) {
    this.revisionsDownwardLast7Days = revisionsDownwardLast7Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions downward in the last 7 days
   * @return revisionsDownwardLast7Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions downward in the last 7 days")
  public String getRevisionsDownwardLast7Days() {
    return revisionsDownwardLast7Days;
  }

  public void setRevisionsDownwardLast7Days(String revisionsDownwardLast7Days) {
    this.revisionsDownwardLast7Days = revisionsDownwardLast7Days;
  }

  public ZacksLongTermGrowthRate revisionsUpwardLast30Days(String revisionsUpwardLast30Days) {
    this.revisionsUpwardLast30Days = revisionsUpwardLast30Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions upward in the last 30 days
   * @return revisionsUpwardLast30Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions upward in the last 30 days")
  public String getRevisionsUpwardLast30Days() {
    return revisionsUpwardLast30Days;
  }

  public void setRevisionsUpwardLast30Days(String revisionsUpwardLast30Days) {
    this.revisionsUpwardLast30Days = revisionsUpwardLast30Days;
  }

  public ZacksLongTermGrowthRate revisionsDownwardLast30Days(String revisionsDownwardLast30Days) {
    this.revisionsDownwardLast30Days = revisionsDownwardLast30Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions downward in the last 30 days
   * @return revisionsDownwardLast30Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions downward in the last 30 days")
  public String getRevisionsDownwardLast30Days() {
    return revisionsDownwardLast30Days;
  }

  public void setRevisionsDownwardLast30Days(String revisionsDownwardLast30Days) {
    this.revisionsDownwardLast30Days = revisionsDownwardLast30Days;
  }

  public ZacksLongTermGrowthRate revisionsUpwardLast60Days(String revisionsUpwardLast60Days) {
    this.revisionsUpwardLast60Days = revisionsUpwardLast60Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions upward in the last 60 days
   * @return revisionsUpwardLast60Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions upward in the last 60 days")
  public String getRevisionsUpwardLast60Days() {
    return revisionsUpwardLast60Days;
  }

  public void setRevisionsUpwardLast60Days(String revisionsUpwardLast60Days) {
    this.revisionsUpwardLast60Days = revisionsUpwardLast60Days;
  }

  public ZacksLongTermGrowthRate revisionsDownwardLast60Days(String revisionsDownwardLast60Days) {
    this.revisionsDownwardLast60Days = revisionsDownwardLast60Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions downward in the last 60 days
   * @return revisionsDownwardLast60Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions downward in the last 60 days")
  public String getRevisionsDownwardLast60Days() {
    return revisionsDownwardLast60Days;
  }

  public void setRevisionsDownwardLast60Days(String revisionsDownwardLast60Days) {
    this.revisionsDownwardLast60Days = revisionsDownwardLast60Days;
  }

  public ZacksLongTermGrowthRate revisionsUpwardLast90Days(String revisionsUpwardLast90Days) {
    this.revisionsUpwardLast90Days = revisionsUpwardLast90Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions upward in the last 90 days
   * @return revisionsUpwardLast90Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions upward in the last 90 days")
  public String getRevisionsUpwardLast90Days() {
    return revisionsUpwardLast90Days;
  }

  public void setRevisionsUpwardLast90Days(String revisionsUpwardLast90Days) {
    this.revisionsUpwardLast90Days = revisionsUpwardLast90Days;
  }

  public ZacksLongTermGrowthRate revisionsDownwardLast90Days(String revisionsDownwardLast90Days) {
    this.revisionsDownwardLast90Days = revisionsDownwardLast90Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions downward in the last 90 days
   * @return revisionsDownwardLast90Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions downward in the last 90 days")
  public String getRevisionsDownwardLast90Days() {
    return revisionsDownwardLast90Days;
  }

  public void setRevisionsDownwardLast90Days(String revisionsDownwardLast90Days) {
    this.revisionsDownwardLast90Days = revisionsDownwardLast90Days;
  }

  public ZacksLongTermGrowthRate revisionsUpwardLast120Days(String revisionsUpwardLast120Days) {
    this.revisionsUpwardLast120Days = revisionsUpwardLast120Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions upward in the last 120 days
   * @return revisionsUpwardLast120Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions upward in the last 120 days")
  public String getRevisionsUpwardLast120Days() {
    return revisionsUpwardLast120Days;
  }

  public void setRevisionsUpwardLast120Days(String revisionsUpwardLast120Days) {
    this.revisionsUpwardLast120Days = revisionsUpwardLast120Days;
  }

  public ZacksLongTermGrowthRate revisionsDownwardLast120Days(String revisionsDownwardLast120Days) {
    this.revisionsDownwardLast120Days = revisionsDownwardLast120Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions downward in the last 120 days
   * @return revisionsDownwardLast120Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions downward in the last 120 days")
  public String getRevisionsDownwardLast120Days() {
    return revisionsDownwardLast120Days;
  }

  public void setRevisionsDownwardLast120Days(String revisionsDownwardLast120Days) {
    this.revisionsDownwardLast120Days = revisionsDownwardLast120Days;
  }

  public ZacksLongTermGrowthRate revisionsUpwardLast150Days(String revisionsUpwardLast150Days) {
    this.revisionsUpwardLast150Days = revisionsUpwardLast150Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions upward in the last 150 days
   * @return revisionsUpwardLast150Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions upward in the last 150 days")
  public String getRevisionsUpwardLast150Days() {
    return revisionsUpwardLast150Days;
  }

  public void setRevisionsUpwardLast150Days(String revisionsUpwardLast150Days) {
    this.revisionsUpwardLast150Days = revisionsUpwardLast150Days;
  }

  public ZacksLongTermGrowthRate revisionsDownwardLast150Days(String revisionsDownwardLast150Days) {
    this.revisionsDownwardLast150Days = revisionsDownwardLast150Days;
    return this;
  }

   /**
   * The number of long term growth estimate revisions downward in the last 150 days
   * @return revisionsDownwardLast150Days
  **/
  @ApiModelProperty(value = "The number of long term growth estimate revisions downward in the last 150 days")
  public String getRevisionsDownwardLast150Days() {
    return revisionsDownwardLast150Days;
  }

  public void setRevisionsDownwardLast150Days(String revisionsDownwardLast150Days) {
    this.revisionsDownwardLast150Days = revisionsDownwardLast150Days;
  }

  public ZacksLongTermGrowthRate security(SecuritySummary security) {
    this.security = security;
    return this;
  }

   /**
   * The Security of the Zacks long term growth estimate
   * @return security
  **/
  @ApiModelProperty(value = "The Security of the Zacks long term growth estimate")
  public SecuritySummary getSecurity() {
    return security;
  }

  public void setSecurity(SecuritySummary security) {
    this.security = security;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksLongTermGrowthRate zacksLongTermGrowthRate = (ZacksLongTermGrowthRate) o;
    return Objects.equals(this.mean, zacksLongTermGrowthRate.mean) &&
        Objects.equals(this.median, zacksLongTermGrowthRate.median) &&
        Objects.equals(this.count, zacksLongTermGrowthRate.count) &&
        Objects.equals(this.high, zacksLongTermGrowthRate.high) &&
        Objects.equals(this.low, zacksLongTermGrowthRate.low) &&
        Objects.equals(this.stdDev, zacksLongTermGrowthRate.stdDev) &&
        Objects.equals(this.revisionsUpward, zacksLongTermGrowthRate.revisionsUpward) &&
        Objects.equals(this.revisionsDownward, zacksLongTermGrowthRate.revisionsDownward) &&
        Objects.equals(this.mean7DaysAgo, zacksLongTermGrowthRate.mean7DaysAgo) &&
        Objects.equals(this.mean30DaysAgo, zacksLongTermGrowthRate.mean30DaysAgo) &&
        Objects.equals(this.mean60DaysAgo, zacksLongTermGrowthRate.mean60DaysAgo) &&
        Objects.equals(this.mean90DaysAgo, zacksLongTermGrowthRate.mean90DaysAgo) &&
        Objects.equals(this.revisionsUpwardLast7Days, zacksLongTermGrowthRate.revisionsUpwardLast7Days) &&
        Objects.equals(this.revisionsDownwardLast7Days, zacksLongTermGrowthRate.revisionsDownwardLast7Days) &&
        Objects.equals(this.revisionsUpwardLast30Days, zacksLongTermGrowthRate.revisionsUpwardLast30Days) &&
        Objects.equals(this.revisionsDownwardLast30Days, zacksLongTermGrowthRate.revisionsDownwardLast30Days) &&
        Objects.equals(this.revisionsUpwardLast60Days, zacksLongTermGrowthRate.revisionsUpwardLast60Days) &&
        Objects.equals(this.revisionsDownwardLast60Days, zacksLongTermGrowthRate.revisionsDownwardLast60Days) &&
        Objects.equals(this.revisionsUpwardLast90Days, zacksLongTermGrowthRate.revisionsUpwardLast90Days) &&
        Objects.equals(this.revisionsDownwardLast90Days, zacksLongTermGrowthRate.revisionsDownwardLast90Days) &&
        Objects.equals(this.revisionsUpwardLast120Days, zacksLongTermGrowthRate.revisionsUpwardLast120Days) &&
        Objects.equals(this.revisionsDownwardLast120Days, zacksLongTermGrowthRate.revisionsDownwardLast120Days) &&
        Objects.equals(this.revisionsUpwardLast150Days, zacksLongTermGrowthRate.revisionsUpwardLast150Days) &&
        Objects.equals(this.revisionsDownwardLast150Days, zacksLongTermGrowthRate.revisionsDownwardLast150Days) &&
        Objects.equals(this.security, zacksLongTermGrowthRate.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mean, median, count, high, low, stdDev, revisionsUpward, revisionsDownward, mean7DaysAgo, mean30DaysAgo, mean60DaysAgo, mean90DaysAgo, revisionsUpwardLast7Days, revisionsDownwardLast7Days, revisionsUpwardLast30Days, revisionsDownwardLast30Days, revisionsUpwardLast60Days, revisionsDownwardLast60Days, revisionsUpwardLast90Days, revisionsDownwardLast90Days, revisionsUpwardLast120Days, revisionsDownwardLast120Days, revisionsUpwardLast150Days, revisionsDownwardLast150Days, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksLongTermGrowthRate {\n");
    
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    revisionsUpward: ").append(toIndentedString(revisionsUpward)).append("\n");
    sb.append("    revisionsDownward: ").append(toIndentedString(revisionsDownward)).append("\n");
    sb.append("    mean7DaysAgo: ").append(toIndentedString(mean7DaysAgo)).append("\n");
    sb.append("    mean30DaysAgo: ").append(toIndentedString(mean30DaysAgo)).append("\n");
    sb.append("    mean60DaysAgo: ").append(toIndentedString(mean60DaysAgo)).append("\n");
    sb.append("    mean90DaysAgo: ").append(toIndentedString(mean90DaysAgo)).append("\n");
    sb.append("    revisionsUpwardLast7Days: ").append(toIndentedString(revisionsUpwardLast7Days)).append("\n");
    sb.append("    revisionsDownwardLast7Days: ").append(toIndentedString(revisionsDownwardLast7Days)).append("\n");
    sb.append("    revisionsUpwardLast30Days: ").append(toIndentedString(revisionsUpwardLast30Days)).append("\n");
    sb.append("    revisionsDownwardLast30Days: ").append(toIndentedString(revisionsDownwardLast30Days)).append("\n");
    sb.append("    revisionsUpwardLast60Days: ").append(toIndentedString(revisionsUpwardLast60Days)).append("\n");
    sb.append("    revisionsDownwardLast60Days: ").append(toIndentedString(revisionsDownwardLast60Days)).append("\n");
    sb.append("    revisionsUpwardLast90Days: ").append(toIndentedString(revisionsUpwardLast90Days)).append("\n");
    sb.append("    revisionsDownwardLast90Days: ").append(toIndentedString(revisionsDownwardLast90Days)).append("\n");
    sb.append("    revisionsUpwardLast120Days: ").append(toIndentedString(revisionsUpwardLast120Days)).append("\n");
    sb.append("    revisionsDownwardLast120Days: ").append(toIndentedString(revisionsDownwardLast120Days)).append("\n");
    sb.append("    revisionsUpwardLast150Days: ").append(toIndentedString(revisionsUpwardLast150Days)).append("\n");
    sb.append("    revisionsDownwardLast150Days: ").append(toIndentedString(revisionsDownwardLast150Days)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

