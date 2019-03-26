

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
 * The date_time and uo values of a Ultimate Oscillator technical indicator calculation
 */
@ApiModel(description = "The date_time and uo values of a Ultimate Oscillator technical indicator calculation")

public class UltimateOscillatorTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("uo")
  private Float uo = null;

  public UltimateOscillatorTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public UltimateOscillatorTechnicalValue uo(Float uo) {
    this.uo = uo;
    return this;
  }

   /**
   * The Ultimate Oscillator calculation value
   * @return uo
  **/
  @ApiModelProperty(value = "The Ultimate Oscillator calculation value")
  public Float getUo() {
    return uo;
  }

  public void setUo(Float uo) {
    this.uo = uo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UltimateOscillatorTechnicalValue ultimateOscillatorTechnicalValue = (UltimateOscillatorTechnicalValue) o;
    return Objects.equals(this.dateTime, ultimateOscillatorTechnicalValue.dateTime) &&
        Objects.equals(this.uo, ultimateOscillatorTechnicalValue.uo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, uo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UltimateOscillatorTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    uo: ").append(toIndentedString(uo)).append("\n");
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

