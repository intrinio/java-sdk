

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
 * The date_time, negative_vi, and positive_vi values of a Vortex Indicator technical indicator calculation
 */
@ApiModel(description = "The date_time, negative_vi, and positive_vi values of a Vortex Indicator technical indicator calculation")

public class VortexIndicatorTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("negative_vi")
  private Float negativeVi = null;

  @SerializedName("positive_vi")
  private Float positiveVi = null;

  public VortexIndicatorTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public VortexIndicatorTechnicalValue negativeVi(Float negativeVi) {
    this.negativeVi = negativeVi;
    return this;
  }

   /**
   * The negative Vortex Indicator value
   * @return negativeVi
  **/
  @ApiModelProperty(value = "The negative Vortex Indicator value")
  public Float getNegativeVi() {
    return negativeVi;
  }

  public void setNegativeVi(Float negativeVi) {
    this.negativeVi = negativeVi;
  }

  public VortexIndicatorTechnicalValue positiveVi(Float positiveVi) {
    this.positiveVi = positiveVi;
    return this;
  }

   /**
   * The positive Vortex Indicator value
   * @return positiveVi
  **/
  @ApiModelProperty(value = "The positive Vortex Indicator value")
  public Float getPositiveVi() {
    return positiveVi;
  }

  public void setPositiveVi(Float positiveVi) {
    this.positiveVi = positiveVi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VortexIndicatorTechnicalValue vortexIndicatorTechnicalValue = (VortexIndicatorTechnicalValue) o;
    return Objects.equals(this.dateTime, vortexIndicatorTechnicalValue.dateTime) &&
        Objects.equals(this.negativeVi, vortexIndicatorTechnicalValue.negativeVi) &&
        Objects.equals(this.positiveVi, vortexIndicatorTechnicalValue.positiveVi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, negativeVi, positiveVi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VortexIndicatorTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    negativeVi: ").append(toIndentedString(negativeVi)).append("\n");
    sb.append("    positiveVi: ").append(toIndentedString(positiveVi)).append("\n");
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

