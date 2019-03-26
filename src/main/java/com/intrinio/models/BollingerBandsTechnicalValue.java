

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
import org.threeten.bp.OffsetDateTime;

/**
 * The date_time, lower_band, middle_band, and upper_band values of a Bollinger Bands technical indicator calculation
 */
@ApiModel(description = "The date_time, lower_band, middle_band, and upper_band values of a Bollinger Bands technical indicator calculation")

public class BollingerBandsTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("lower_band")
  private Float lowerBand = null;

  @SerializedName("middle_band")
  private Float middleBand = null;

  @SerializedName("upper_band")
  private Float upperBand = null;

  public BollingerBandsTechnicalValue dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * The date_time of the observation
   * @return dateTime
  **/
  @ApiModelProperty(value = "The date_time of the observation")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public BollingerBandsTechnicalValue lowerBand(Float lowerBand) {
    this.lowerBand = lowerBand;
    return this;
  }

   /**
   * The lower band value of the Bollinger Bands technical indicator calculation
   * @return lowerBand
  **/
  @ApiModelProperty(value = "The lower band value of the Bollinger Bands technical indicator calculation")
  public Float getLowerBand() {
    return lowerBand;
  }

  public void setLowerBand(Float lowerBand) {
    this.lowerBand = lowerBand;
  }

  public BollingerBandsTechnicalValue middleBand(Float middleBand) {
    this.middleBand = middleBand;
    return this;
  }

   /**
   * The middle band value of the Bollinger Bands technical indicator calculation
   * @return middleBand
  **/
  @ApiModelProperty(value = "The middle band value of the Bollinger Bands technical indicator calculation")
  public Float getMiddleBand() {
    return middleBand;
  }

  public void setMiddleBand(Float middleBand) {
    this.middleBand = middleBand;
  }

  public BollingerBandsTechnicalValue upperBand(Float upperBand) {
    this.upperBand = upperBand;
    return this;
  }

   /**
   * The upper band value of the Bollinger Bands technical indicator calculation
   * @return upperBand
  **/
  @ApiModelProperty(value = "The upper band value of the Bollinger Bands technical indicator calculation")
  public Float getUpperBand() {
    return upperBand;
  }

  public void setUpperBand(Float upperBand) {
    this.upperBand = upperBand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BollingerBandsTechnicalValue bollingerBandsTechnicalValue = (BollingerBandsTechnicalValue) o;
    return Objects.equals(this.dateTime, bollingerBandsTechnicalValue.dateTime) &&
        Objects.equals(this.lowerBand, bollingerBandsTechnicalValue.lowerBand) &&
        Objects.equals(this.middleBand, bollingerBandsTechnicalValue.middleBand) &&
        Objects.equals(this.upperBand, bollingerBandsTechnicalValue.upperBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, lowerBand, middleBand, upperBand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BollingerBandsTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    lowerBand: ").append(toIndentedString(lowerBand)).append("\n");
    sb.append("    middleBand: ").append(toIndentedString(middleBand)).append("\n");
    sb.append("    upperBand: ").append(toIndentedString(upperBand)).append("\n");
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

