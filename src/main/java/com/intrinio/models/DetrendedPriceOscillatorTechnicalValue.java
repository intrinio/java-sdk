

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
 * The date_time and dpo values of a Detrended Price Oscillator technical indicator calculation
 */
@ApiModel(description = "The date_time and dpo values of a Detrended Price Oscillator technical indicator calculation")

public class DetrendedPriceOscillatorTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("dpo")
  private Float dpo = null;

  public DetrendedPriceOscillatorTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public DetrendedPriceOscillatorTechnicalValue dpo(Float dpo) {
    this.dpo = dpo;
    return this;
  }

   /**
   * The Detrended Price Oscillator calculation value
   * @return dpo
  **/
  @ApiModelProperty(value = "The Detrended Price Oscillator calculation value")
  public Float getDpo() {
    return dpo;
  }

  public void setDpo(Float dpo) {
    this.dpo = dpo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetrendedPriceOscillatorTechnicalValue detrendedPriceOscillatorTechnicalValue = (DetrendedPriceOscillatorTechnicalValue) o;
    return Objects.equals(this.dateTime, detrendedPriceOscillatorTechnicalValue.dateTime) &&
        Objects.equals(this.dpo, detrendedPriceOscillatorTechnicalValue.dpo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, dpo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetrendedPriceOscillatorTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    dpo: ").append(toIndentedString(dpo)).append("\n");
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

