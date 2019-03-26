

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
 * The date_time and wr values of a Willliams %R technical indicator calculation
 */
@ApiModel(description = "The date_time and wr values of a Willliams %R technical indicator calculation")

public class WilliamsRTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("wr")
  private Float wr = null;

  public WilliamsRTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public WilliamsRTechnicalValue wr(Float wr) {
    this.wr = wr;
    return this;
  }

   /**
   * The Willaims %R calculation value
   * @return wr
  **/
  @ApiModelProperty(value = "The Willaims %R calculation value")
  public Float getWr() {
    return wr;
  }

  public void setWr(Float wr) {
    this.wr = wr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WilliamsRTechnicalValue williamsRTechnicalValue = (WilliamsRTechnicalValue) o;
    return Objects.equals(this.dateTime, williamsRTechnicalValue.dateTime) &&
        Objects.equals(this.wr, williamsRTechnicalValue.wr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, wr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WilliamsRTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    wr: ").append(toIndentedString(wr)).append("\n");
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

