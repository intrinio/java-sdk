

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
 * The date_time and rsi values of a Relative Strength Index technical indicator calculation
 */
@ApiModel(description = "The date_time and rsi values of a Relative Strength Index technical indicator calculation")

public class RelativeStrengthIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("rsi")
  private Float rsi = null;

  public RelativeStrengthIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public RelativeStrengthIndexTechnicalValue rsi(Float rsi) {
    this.rsi = rsi;
    return this;
  }

   /**
   * The Relative Strength Index calculation value
   * @return rsi
  **/
  @ApiModelProperty(value = "The Relative Strength Index calculation value")
  public Float getRsi() {
    return rsi;
  }

  public void setRsi(Float rsi) {
    this.rsi = rsi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeStrengthIndexTechnicalValue relativeStrengthIndexTechnicalValue = (RelativeStrengthIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, relativeStrengthIndexTechnicalValue.dateTime) &&
        Objects.equals(this.rsi, relativeStrengthIndexTechnicalValue.rsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, rsi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeStrengthIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    rsi: ").append(toIndentedString(rsi)).append("\n");
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

