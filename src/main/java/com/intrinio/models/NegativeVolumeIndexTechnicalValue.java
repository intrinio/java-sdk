

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
 * The date_time and nvi values of a Negative Volume Index technical indicator calculation
 */
@ApiModel(description = "The date_time and nvi values of a Negative Volume Index technical indicator calculation")

public class NegativeVolumeIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("nvi")
  private Float nvi = null;

  public NegativeVolumeIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public NegativeVolumeIndexTechnicalValue nvi(Float nvi) {
    this.nvi = nvi;
    return this;
  }

   /**
   * The Negative Volume Index calculation value
   * @return nvi
  **/
  @ApiModelProperty(value = "The Negative Volume Index calculation value")
  public Float getNvi() {
    return nvi;
  }

  public void setNvi(Float nvi) {
    this.nvi = nvi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegativeVolumeIndexTechnicalValue negativeVolumeIndexTechnicalValue = (NegativeVolumeIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, negativeVolumeIndexTechnicalValue.dateTime) &&
        Objects.equals(this.nvi, negativeVolumeIndexTechnicalValue.nvi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, nvi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegativeVolumeIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    nvi: ").append(toIndentedString(nvi)).append("\n");
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

