

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
 * The date_time and tsi values of a True Strength Index technical indicator calculation
 */
@ApiModel(description = "The date_time and tsi values of a True Strength Index technical indicator calculation")

public class TrueStrengthIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("tsi")
  private Float tsi = null;

  public TrueStrengthIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public TrueStrengthIndexTechnicalValue tsi(Float tsi) {
    this.tsi = tsi;
    return this;
  }

   /**
   * The True Strength Index calculation value
   * @return tsi
  **/
  @ApiModelProperty(value = "The True Strength Index calculation value")
  public Float getTsi() {
    return tsi;
  }

  public void setTsi(Float tsi) {
    this.tsi = tsi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrueStrengthIndexTechnicalValue trueStrengthIndexTechnicalValue = (TrueStrengthIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, trueStrengthIndexTechnicalValue.dateTime) &&
        Objects.equals(this.tsi, trueStrengthIndexTechnicalValue.tsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, tsi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrueStrengthIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    tsi: ").append(toIndentedString(tsi)).append("\n");
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

