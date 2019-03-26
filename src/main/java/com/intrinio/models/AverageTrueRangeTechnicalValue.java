

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
 * The date_time and atr values of an Average True range technical indicator calculation
 */
@ApiModel(description = "The date_time and atr values of an Average True range technical indicator calculation")

public class AverageTrueRangeTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("atr")
  private Float atr = null;

  public AverageTrueRangeTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public AverageTrueRangeTechnicalValue atr(Float atr) {
    this.atr = atr;
    return this;
  }

   /**
   * The Average True Range calculation value
   * @return atr
  **/
  @ApiModelProperty(value = "The Average True Range calculation value")
  public Float getAtr() {
    return atr;
  }

  public void setAtr(Float atr) {
    this.atr = atr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AverageTrueRangeTechnicalValue averageTrueRangeTechnicalValue = (AverageTrueRangeTechnicalValue) o;
    return Objects.equals(this.dateTime, averageTrueRangeTechnicalValue.dateTime) &&
        Objects.equals(this.atr, averageTrueRangeTechnicalValue.atr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, atr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AverageTrueRangeTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    atr: ").append(toIndentedString(atr)).append("\n");
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

