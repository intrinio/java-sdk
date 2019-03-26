

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
 * The date_time and mi values of a Mass Index technical indicator calculation
 */
@ApiModel(description = "The date_time and mi values of a Mass Index technical indicator calculation")

public class MassIndexTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("mi")
  private Float mi = null;

  public MassIndexTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public MassIndexTechnicalValue mi(Float mi) {
    this.mi = mi;
    return this;
  }

   /**
   * The Mass Index calculation value
   * @return mi
  **/
  @ApiModelProperty(value = "The Mass Index calculation value")
  public Float getMi() {
    return mi;
  }

  public void setMi(Float mi) {
    this.mi = mi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MassIndexTechnicalValue massIndexTechnicalValue = (MassIndexTechnicalValue) o;
    return Objects.equals(this.dateTime, massIndexTechnicalValue.dateTime) &&
        Objects.equals(this.mi, massIndexTechnicalValue.mi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, mi);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MassIndexTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    mi: ").append(toIndentedString(mi)).append("\n");
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

