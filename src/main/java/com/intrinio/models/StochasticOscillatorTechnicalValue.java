

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
 * The date_time, sr, and sr_signal values of a Stochastic Oscillator technical indicator calculation
 */
@ApiModel(description = "The date_time, sr, and sr_signal values of a Stochastic Oscillator technical indicator calculation")

public class StochasticOscillatorTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("sr")
  private Float sr = null;

  @SerializedName("sr_signal")
  private Float srSignal = null;

  public StochasticOscillatorTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public StochasticOscillatorTechnicalValue sr(Float sr) {
    this.sr = sr;
    return this;
  }

   /**
   * The Stochastic Oscillator calculation value
   * @return sr
  **/
  @ApiModelProperty(value = "The Stochastic Oscillator calculation value")
  public Float getSr() {
    return sr;
  }

  public void setSr(Float sr) {
    this.sr = sr;
  }

  public StochasticOscillatorTechnicalValue srSignal(Float srSignal) {
    this.srSignal = srSignal;
    return this;
  }

   /**
   * The Stochastic Oscillator signal line value
   * @return srSignal
  **/
  @ApiModelProperty(value = "The Stochastic Oscillator signal line value")
  public Float getSrSignal() {
    return srSignal;
  }

  public void setSrSignal(Float srSignal) {
    this.srSignal = srSignal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StochasticOscillatorTechnicalValue stochasticOscillatorTechnicalValue = (StochasticOscillatorTechnicalValue) o;
    return Objects.equals(this.dateTime, stochasticOscillatorTechnicalValue.dateTime) &&
        Objects.equals(this.sr, stochasticOscillatorTechnicalValue.sr) &&
        Objects.equals(this.srSignal, stochasticOscillatorTechnicalValue.srSignal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, sr, srSignal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StochasticOscillatorTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    sr: ").append(toIndentedString(sr)).append("\n");
    sb.append("    srSignal: ").append(toIndentedString(srSignal)).append("\n");
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

