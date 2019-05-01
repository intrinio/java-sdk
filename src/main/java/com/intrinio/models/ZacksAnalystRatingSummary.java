

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
 * Buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. A rating includes data about mean, strong buys, buys, holds, sells, strong sells, and total.
 */
@ApiModel(description = "Buy, sell, and hold recommendations from analysts at brokerages for all companies in the Zacks universe. A rating includes data about mean, strong buys, buys, holds, sells, strong sells, and total.")

public class ZacksAnalystRatingSummary {
  @SerializedName("id")
  private String id = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("mean")
  private BigDecimal mean = null;

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

  public ZacksAnalystRatingSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Intrinio ID for the record
   * @return id
  **/
  @ApiModelProperty(value = "The Intrinio ID for the record")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ZacksAnalystRatingSummary date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the Zacks Analyst Rating.
   * @return date
  **/
  @ApiModelProperty(value = "The date of the Zacks Analyst Rating.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ZacksAnalystRatingSummary mean(BigDecimal mean) {
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

  public ZacksAnalystRatingSummary strongBuys(Integer strongBuys) {
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

  public ZacksAnalystRatingSummary buys(Integer buys) {
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

  public ZacksAnalystRatingSummary holds(Integer holds) {
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

  public ZacksAnalystRatingSummary sells(Integer sells) {
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

  public ZacksAnalystRatingSummary strongSells(Integer strongSells) {
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

  public ZacksAnalystRatingSummary total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of analyst recommendations.
   * @return total
  **/
  @ApiModelProperty(value = "The total number of analyst recommendations.")
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
    ZacksAnalystRatingSummary zacksAnalystRatingSummary = (ZacksAnalystRatingSummary) o;
    return Objects.equals(this.id, zacksAnalystRatingSummary.id) &&
        Objects.equals(this.date, zacksAnalystRatingSummary.date) &&
        Objects.equals(this.mean, zacksAnalystRatingSummary.mean) &&
        Objects.equals(this.strongBuys, zacksAnalystRatingSummary.strongBuys) &&
        Objects.equals(this.buys, zacksAnalystRatingSummary.buys) &&
        Objects.equals(this.holds, zacksAnalystRatingSummary.holds) &&
        Objects.equals(this.sells, zacksAnalystRatingSummary.sells) &&
        Objects.equals(this.strongSells, zacksAnalystRatingSummary.strongSells) &&
        Objects.equals(this.total, zacksAnalystRatingSummary.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, mean, strongBuys, buys, holds, sells, strongSells, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZacksAnalystRatingSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
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

