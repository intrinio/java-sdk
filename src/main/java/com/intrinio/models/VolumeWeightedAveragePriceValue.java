

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
 * The date_time and vwap values of a Volume Weighted Average Price technical indicator calculation
 */
@ApiModel(description = "The date_time and vwap values of a Volume Weighted Average Price technical indicator calculation")

public class VolumeWeightedAveragePriceValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("vwap")
  private Float vwap = null;

  public VolumeWeightedAveragePriceValue dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * The date and time of the observation
   * @return dateTime
  **/
  @ApiModelProperty(value = "The date and time of the observation")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public VolumeWeightedAveragePriceValue vwap(Float vwap) {
    this.vwap = vwap;
    return this;
  }

   /**
   * The Volume Weighted Average Price calculation value
   * @return vwap
  **/
  @ApiModelProperty(value = "The Volume Weighted Average Price calculation value")
  public Float getVwap() {
    return vwap;
  }

  public void setVwap(Float vwap) {
    this.vwap = vwap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeWeightedAveragePriceValue volumeWeightedAveragePriceValue = (VolumeWeightedAveragePriceValue) o;
    return Objects.equals(this.dateTime, volumeWeightedAveragePriceValue.dateTime) &&
        Objects.equals(this.vwap, volumeWeightedAveragePriceValue.vwap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, vwap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeWeightedAveragePriceValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    vwap: ").append(toIndentedString(vwap)).append("\n");
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

