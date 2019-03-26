

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
 * The date_time and eom values of a Ease of Movement technical indicator calculation
 */
@ApiModel(description = "The date_time and eom values of a Ease of Movement technical indicator calculation")

public class EaseOfMovementTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("eom")
  private Float eom = null;

  public EaseOfMovementTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public EaseOfMovementTechnicalValue eom(Float eom) {
    this.eom = eom;
    return this;
  }

   /**
   * The Ease of Movement calculation value
   * @return eom
  **/
  @ApiModelProperty(value = "The Ease of Movement calculation value")
  public Float getEom() {
    return eom;
  }

  public void setEom(Float eom) {
    this.eom = eom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EaseOfMovementTechnicalValue easeOfMovementTechnicalValue = (EaseOfMovementTechnicalValue) o;
    return Objects.equals(this.dateTime, easeOfMovementTechnicalValue.dateTime) &&
        Objects.equals(this.eom, easeOfMovementTechnicalValue.eom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, eom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EaseOfMovementTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    eom: ").append(toIndentedString(eom)).append("\n");
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

