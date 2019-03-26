

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
 * The date_time and kst values of a Know Sure Thing technical indicator calculation
 */
@ApiModel(description = "The date_time and kst values of a Know Sure Thing technical indicator calculation")

public class KnowSureThingTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("kst")
  private Float kst = null;

  public KnowSureThingTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public KnowSureThingTechnicalValue kst(Float kst) {
    this.kst = kst;
    return this;
  }

   /**
   * The Know Sure Thing calculation value
   * @return kst
  **/
  @ApiModelProperty(value = "The Know Sure Thing calculation value")
  public Float getKst() {
    return kst;
  }

  public void setKst(Float kst) {
    this.kst = kst;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowSureThingTechnicalValue knowSureThingTechnicalValue = (KnowSureThingTechnicalValue) o;
    return Objects.equals(this.dateTime, knowSureThingTechnicalValue.dateTime) &&
        Objects.equals(this.kst, knowSureThingTechnicalValue.kst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, kst);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowSureThingTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    kst: ").append(toIndentedString(kst)).append("\n");
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

