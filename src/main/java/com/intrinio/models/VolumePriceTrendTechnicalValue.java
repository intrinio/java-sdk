

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
 * The date_time and vpt values of a Volume-price Trend technical indicator calculation
 */
@ApiModel(description = "The date_time and vpt values of a Volume-price Trend technical indicator calculation")

public class VolumePriceTrendTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("vpt")
  private Float vpt = null;

  public VolumePriceTrendTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public VolumePriceTrendTechnicalValue vpt(Float vpt) {
    this.vpt = vpt;
    return this;
  }

   /**
   * The Volume-price Trend calculation value
   * @return vpt
  **/
  @ApiModelProperty(value = "The Volume-price Trend calculation value")
  public Float getVpt() {
    return vpt;
  }

  public void setVpt(Float vpt) {
    this.vpt = vpt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumePriceTrendTechnicalValue volumePriceTrendTechnicalValue = (VolumePriceTrendTechnicalValue) o;
    return Objects.equals(this.dateTime, volumePriceTrendTechnicalValue.dateTime) &&
        Objects.equals(this.vpt, volumePriceTrendTechnicalValue.vpt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, vpt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumePriceTrendTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    vpt: ").append(toIndentedString(vpt)).append("\n");
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

