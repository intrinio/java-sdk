

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

/**
 * ShortInterest
 */

public class ShortInterest {
  @SerializedName("settlement_date")
  private LocalDate settlementDate = null;

  @SerializedName("current_short_position")
  private Integer currentShortPosition = null;

  @SerializedName("previous_short_position")
  private Integer previousShortPosition = null;

  @SerializedName("change_percent")
  private Float changePercent = null;

  @SerializedName("days_to_cover")
  private Float daysToCover = null;

  @SerializedName("average_daily_volume")
  private Integer averageDailyVolume = null;

  public ShortInterest settlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

   /**
   * The settlement date of the short interest record
   * @return settlementDate
  **/
  @ApiModelProperty(value = "The settlement date of the short interest record")
  public LocalDate getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(LocalDate settlementDate) {
    this.settlementDate = settlementDate;
  }

  public ShortInterest currentShortPosition(Integer currentShortPosition) {
    this.currentShortPosition = currentShortPosition;
    return this;
  }

   /**
   * The current short position (shares) as of the settlement date
   * @return currentShortPosition
  **/
  @ApiModelProperty(value = "The current short position (shares) as of the settlement date")
  public Integer getCurrentShortPosition() {
    return currentShortPosition;
  }

  public void setCurrentShortPosition(Integer currentShortPosition) {
    this.currentShortPosition = currentShortPosition;
  }

  public ShortInterest previousShortPosition(Integer previousShortPosition) {
    this.previousShortPosition = previousShortPosition;
    return this;
  }

   /**
   * The previous short position (shares) from the prior reporting period
   * @return previousShortPosition
  **/
  @ApiModelProperty(value = "The previous short position (shares) from the prior reporting period")
  public Integer getPreviousShortPosition() {
    return previousShortPosition;
  }

  public void setPreviousShortPosition(Integer previousShortPosition) {
    this.previousShortPosition = previousShortPosition;
  }

  public ShortInterest changePercent(Float changePercent) {
    this.changePercent = changePercent;
    return this;
  }

   /**
   * The percentage change in short position from the previous reporting period
   * @return changePercent
  **/
  @ApiModelProperty(value = "The percentage change in short position from the previous reporting period")
  public Float getChangePercent() {
    return changePercent;
  }

  public void setChangePercent(Float changePercent) {
    this.changePercent = changePercent;
  }

  public ShortInterest daysToCover(Float daysToCover) {
    this.daysToCover = daysToCover;
    return this;
  }

   /**
   * The estimated number of days to cover the short position based on average daily volume
   * @return daysToCover
  **/
  @ApiModelProperty(value = "The estimated number of days to cover the short position based on average daily volume")
  public Float getDaysToCover() {
    return daysToCover;
  }

  public void setDaysToCover(Float daysToCover) {
    this.daysToCover = daysToCover;
  }

  public ShortInterest averageDailyVolume(Integer averageDailyVolume) {
    this.averageDailyVolume = averageDailyVolume;
    return this;
  }

   /**
   * The average daily trading volume used to calculate days to cover
   * @return averageDailyVolume
  **/
  @ApiModelProperty(value = "The average daily trading volume used to calculate days to cover")
  public Integer getAverageDailyVolume() {
    return averageDailyVolume;
  }

  public void setAverageDailyVolume(Integer averageDailyVolume) {
    this.averageDailyVolume = averageDailyVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortInterest shortInterest = (ShortInterest) o;
    return Objects.equals(this.settlementDate, shortInterest.settlementDate) &&
        Objects.equals(this.currentShortPosition, shortInterest.currentShortPosition) &&
        Objects.equals(this.previousShortPosition, shortInterest.previousShortPosition) &&
        Objects.equals(this.changePercent, shortInterest.changePercent) &&
        Objects.equals(this.daysToCover, shortInterest.daysToCover) &&
        Objects.equals(this.averageDailyVolume, shortInterest.averageDailyVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementDate, currentShortPosition, previousShortPosition, changePercent, daysToCover, averageDailyVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortInterest {\n");
    
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    currentShortPosition: ").append(toIndentedString(currentShortPosition)).append("\n");
    sb.append("    previousShortPosition: ").append(toIndentedString(previousShortPosition)).append("\n");
    sb.append("    changePercent: ").append(toIndentedString(changePercent)).append("\n");
    sb.append("    daysToCover: ").append(toIndentedString(daysToCover)).append("\n");
    sb.append("    averageDailyVolume: ").append(toIndentedString(averageDailyVolume)).append("\n");
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

