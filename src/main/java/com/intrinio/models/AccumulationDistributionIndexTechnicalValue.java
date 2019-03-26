

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
 * The date_time and adi values of a Accumulation/Distribution Index technical indicator calculation
 */
@ApiModel(description = "The date_time and adi values of a Accumulation/Distribution Index technical indicator calculation")

public class AccumulationDistributionIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("adi")
  private Float adi = null;

  public AccumulationDistributionIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public AccumulationDistributionIndexTechnicalValue adi(Float adi) {
    this.adi = adi;
    return this;
  }

   /**
   * The Accumulation/Distribution Index calculation value
   * @return adi
  **/
  @ApiModelProperty(value = "The Accumulation/Distribution Index calculation value")
  public Float getAdi() {
    return adi;
  }

  public void setAdi(Float adi) {
    this.adi = adi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccumulationDistributionIndexTechnicalValue accumulationDistributionIndexTechnicalValue = (AccumulationDistributionIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, accumulationDistributionIndexTechnicalValue.dateTime) &&
        Objects.equals(this.adi, accumulationDistributionIndexTechnicalValue.adi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, adi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccumulationDistributionIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    adi: ").append(toIndentedString(adi)).append("\n");
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

