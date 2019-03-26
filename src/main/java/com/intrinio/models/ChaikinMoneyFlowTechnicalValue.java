

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
 * The date_time and cmf values of a Chaikin Money Flow technical indicator calculation
 */
@ApiModel(description = "The date_time and cmf values of a Chaikin Money Flow technical indicator calculation")

public class ChaikinMoneyFlowTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("cmf")
  private Float cmf = null;

  public ChaikinMoneyFlowTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public ChaikinMoneyFlowTechnicalValue cmf(Float cmf) {
    this.cmf = cmf;
    return this;
  }

   /**
   * The Chaikin Money Flow calculation value
   * @return cmf
  **/
  @ApiModelProperty(value = "The Chaikin Money Flow calculation value")
  public Float getCmf() {
    return cmf;
  }

  public void setCmf(Float cmf) {
    this.cmf = cmf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChaikinMoneyFlowTechnicalValue chaikinMoneyFlowTechnicalValue = (ChaikinMoneyFlowTechnicalValue) o;
    return Objects.equals(this.dateTime, chaikinMoneyFlowTechnicalValue.dateTime) &&
        Objects.equals(this.cmf, chaikinMoneyFlowTechnicalValue.cmf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, cmf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaikinMoneyFlowTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    cmf: ").append(toIndentedString(cmf)).append("\n");
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

