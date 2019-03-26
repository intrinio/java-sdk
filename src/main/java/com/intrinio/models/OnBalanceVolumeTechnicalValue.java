

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
 * The date_time and obv values of a On-balance Volume technical indicator calculation
 */
@ApiModel(description = "The date_time and obv values of a On-balance Volume technical indicator calculation")

public class OnBalanceVolumeTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("obv")
  private Float obv = null;

  public OnBalanceVolumeTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public OnBalanceVolumeTechnicalValue obv(Float obv) {
    this.obv = obv;
    return this;
  }

   /**
   * The On-balance Volume calculation value
   * @return obv
  **/
  @ApiModelProperty(value = "The On-balance Volume calculation value")
  public Float getObv() {
    return obv;
  }

  public void setObv(Float obv) {
    this.obv = obv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnBalanceVolumeTechnicalValue onBalanceVolumeTechnicalValue = (OnBalanceVolumeTechnicalValue) o;
    return Objects.equals(this.dateTime, onBalanceVolumeTechnicalValue.dateTime) &&
        Objects.equals(this.obv, onBalanceVolumeTechnicalValue.obv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, obv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnBalanceVolumeTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    obv: ").append(toIndentedString(obv)).append("\n");
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

