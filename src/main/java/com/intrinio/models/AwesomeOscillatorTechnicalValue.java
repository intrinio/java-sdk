

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
 * The date_time and ao values of an Awesome Oscillator technical indicator calculation
 */
@ApiModel(description = "The date_time and ao values of an Awesome Oscillator technical indicator calculation")

public class AwesomeOscillatorTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("ao")
  private Float ao = null;

  public AwesomeOscillatorTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public AwesomeOscillatorTechnicalValue ao(Float ao) {
    this.ao = ao;
    return this;
  }

   /**
   * The Awesome Oscillator calculation value
   * @return ao
  **/
  @ApiModelProperty(value = "The Awesome Oscillator calculation value")
  public Float getAo() {
    return ao;
  }

  public void setAo(Float ao) {
    this.ao = ao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwesomeOscillatorTechnicalValue awesomeOscillatorTechnicalValue = (AwesomeOscillatorTechnicalValue) o;
    return Objects.equals(this.dateTime, awesomeOscillatorTechnicalValue.dateTime) &&
        Objects.equals(this.ao, awesomeOscillatorTechnicalValue.ao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, ao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwesomeOscillatorTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    ao: ").append(toIndentedString(ao)).append("\n");
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

