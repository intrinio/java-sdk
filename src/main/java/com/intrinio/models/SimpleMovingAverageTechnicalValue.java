

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
 * The date_time and sma values of a Simple Moving Average technical indicator calculation
 */
@ApiModel(description = "The date_time and sma values of a Simple Moving Average technical indicator calculation")

public class SimpleMovingAverageTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("sma")
  private Float sma = null;

  public SimpleMovingAverageTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public SimpleMovingAverageTechnicalValue sma(Float sma) {
    this.sma = sma;
    return this;
  }

   /**
   * The Simple Moving Average calculation value
   * @return sma
  **/
  @ApiModelProperty(value = "The Simple Moving Average calculation value")
  public Float getSma() {
    return sma;
  }

  public void setSma(Float sma) {
    this.sma = sma;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleMovingAverageTechnicalValue simpleMovingAverageTechnicalValue = (SimpleMovingAverageTechnicalValue) o;
    return Objects.equals(this.dateTime, simpleMovingAverageTechnicalValue.dateTime) &&
        Objects.equals(this.sma, simpleMovingAverageTechnicalValue.sma);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, sma);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleMovingAverageTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    sma: ").append(toIndentedString(sma)).append("\n");
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

