

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
 * A snapshot of ratings data compared with previous timeframes. This includes mean percentiles for comparing one security to the universe of securities covered by Zacks analyst ratings, at a specific point in time.
 */
@ApiModel(description = "A snapshot of ratings data compared with previous timeframes. This includes mean percentiles for comparing one security to the universe of securities covered by Zacks analyst ratings, at a specific point in time.")

public class ZacksAnalystRatingSnapshot {
  @SerializedName("type")
  private String type = null;

  @SerializedName("snapshot_date")
  private LocalDate snapshotDate = null;

  @SerializedName("rating_date")
  private LocalDate ratingDate = null;

  @SerializedName("mean")
  private BigDecimal mean = null;

  @SerializedName("percentile")
  private BigDecimal percentile = null;

  @SerializedName("strong_buys")
  private Integer strongBuys = null;

  @SerializedName("buys")
  private Integer buys = null;

  @SerializedName("holds")
  private Integer holds = null;

  @SerializedName("sells")
  private Integer sells = null;

  @SerializedName("strong_sells")
  private Integer strongSells = null;

  @SerializedName("total")
  private Integer total = null;

  public ZacksAnalystRatingSnapshot type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The snapshot type, signifying the age of the ratings data from the snapshot date.
   * @return type
  **/
  @ApiModelProperty(value = "The snapshot type, signifying the age of the ratings data from the snapshot date.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ZacksAnalystRatingSnapshot snapshotDate(LocalDate snapshotDate) {
    this.snapshotDate = snapshotDate;
    return this;
  }

   /**
   * The date of the snapshot, when data was recorded.
   * @return snapshotDate
  **/
  @ApiModelProperty(value = "The date of the snapshot, when data was recorded.")
  public LocalDate getSnapshotDate() {
    return snapshotDate;
  }

  public void setSnapshotDate(LocalDate snapshotDate) {
    this.snapshotDate = snapshotDate;
  }

  public ZacksAnalystRatingSnapshot ratingDate(LocalDate ratingDate) {
    this.ratingDate = ratingDate;
    return this;
  }

   /**
   * The date of the latest rating for the snapshot timeframe. This is the effective date of the ratings data.
   * @return ratingDate
  **/
  @ApiModelProperty(value = "The date of the latest rating for the snapshot timeframe. This is the effective date of the ratings data.")
  public LocalDate getRatingDate() {
    return ratingDate;
  }

  public void setRatingDate(LocalDate ratingDate) {
    this.ratingDate = ratingDate;
  }

  public ZacksAnalystRatingSnapshot mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * The mean (average) weighing of analyst recommendations, from 1 (strong buy) to 5 (strong sell).
   * @return mean
  **/
  @ApiModelProperty(value = "The mean (average) weighing of analyst recommendations, from 1 (strong buy) to 5 (strong sell).")
  public BigDecimal getMean() {
    return mean;
  }

  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }

  public ZacksAnalystRatingSnapshot percentile(BigDecimal percentile) {
    this.percentile = percentile;
    return this;
  }

   /**
   * The percentile of the mean, derived by comparing to all securities rated by analysts as of the rating date, ranging 0.0 (strong buy) to 1.0 (strong sell).
   * @return percentile
  **/
  @ApiModelProperty(value = "The percentile of the mean, derived by comparing to all securities rated by analysts as of the rating date, ranging 0.0 (strong buy) to 1.0 (strong sell).")
  public BigDecimal getPercentile() {
    return percentile;
  }

  public void setPercentile(BigDecimal percentile) {
    this.percentile = percentile;
  }

  public ZacksAnalystRatingSnapshot strongBuys(Integer strongBuys) {
    this.strongBuys = strongBuys;
    return this;
  }

   /**
   * The number of analysts recommending Strong Buy.
   * @return strongBuys
  **/
  @ApiModelProperty(value = "The number of analysts recommending Strong Buy.")
  public Integer getStrongBuys() {
    return strongBuys;
  }

  public void setStrongBuys(Integer strongBuys) {
    this.strongBuys = strongBuys;
  }

  public ZacksAnalystRatingSnapshot buys(Integer buys) {
    this.buys = buys;
    return this;
  }

   /**
   * The number of analysts recommending Buy.
   * @return buys
  **/
  @ApiModelProperty(value = "The number of analysts recommending Buy.")
  public Integer getBuys() {
    return buys;
  }

  public void setBuys(Integer buys) {
    this.buys = buys;
  }

  public ZacksAnalystRatingSnapshot holds(Integer holds) {
    this.holds = holds;
    return this;
  }

   /**
   * The number of analysts recommending Hold.
   * @return holds
  **/
  @ApiModelProperty(value = "The number of analysts recommending Hold.")
  public Integer getHolds() {
    return holds;
  }

  public void setHolds(Integer holds) {
    this.holds = holds;
  }

  public ZacksAnalystRatingSnapshot sells(Integer sells) {
    this.sells = sells;
    return this;
  }

   /**
   * The number of analysts recommending Sell.
   * @return sells
  **/
  @ApiModelProperty(value = "The number of analysts recommending Sell.")
  public Integer getSells() {
    return sells;
  }

  public void setSells(Integer sells) {
    this.sells = sells;
  }

  public ZacksAnalystRatingSnapshot strongSells(Integer strongSells) {
    this.strongSells = strongSells;
    return this;
  }

   /**
   * The number of analysts recommending Strong Sell.
   * @return strongSells
  **/
  @ApiModelProperty(value = "The number of analysts recommending Strong Sell.")
  public Integer getStrongSells() {
    return strongSells;
  }

  public void setStrongSells(Integer strongSells) {
    this.strongSells = strongSells;
  }

  public ZacksAnalystRatingSnapshot total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of analysts recommendations.
   * @return total
  **/
  @ApiModelProperty(value = "The total number of analysts recommendations.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZacksAnalystRatingSnapshot zacksAnalystRatingSnapshot = (ZacksAnalystRatingSnapshot) o;
    return Objects.equals(this.type, zacksAnalystRatingSnapshot.type) &&
        Objects.equals(this.snapshotDate, zacksAnalystRatingSnapshot.snapshotDate) &&
        Objects.equals(this.ratingDate, zacksAnalystRatingSnapshot.ratingDate) &&
        Objects.equals(this.mean, zacksAnalystRatingSnapshot.mean) &&
        Objects.equals(this.percentile, zacksAnalystRatingSnapshot.percentile) &&
        Objects.equals(this.strongBuys, zacksAnalystRatingSnapshot.strongBuys) &&
        Objects.equals(this.buys, zacksAnalystRatingSnapshot.buys) &&
        Objects.equals(this.holds, zacksAnalystRatingSnapshot.holds) &&
        Objects.equals(this.sells, zacksAnalystRatingSnapshot.sells) &&
        Objects.equals(this.strongSells, zacksAnalystRatingSnapshot.strongSells) &&
        Objects.equals(this.total, zacksAnalystRatingSnapshot.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, snapshotDate, ratingDate, mean, percentile, strongBuys, buys, holds, sells, strongSells, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksAnalystRatingSnapshot {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    snapshotDate: ").append(toIndentedString(snapshotDate)).append("\n");
    sb.append("    ratingDate: ").append(toIndentedString(ratingDate)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    strongBuys: ").append(toIndentedString(strongBuys)).append("\n");
    sb.append("    buys: ").append(toIndentedString(buys)).append("\n");
    sb.append("    holds: ").append(toIndentedString(holds)).append("\n");
    sb.append("    sells: ").append(toIndentedString(sells)).append("\n");
    sb.append("    strongSells: ").append(toIndentedString(strongSells)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

