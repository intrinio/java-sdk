

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
 * The date_time and adtv values of a Average Daily Trading Volume technical indicator calculation
 */
@ApiModel(description = "The date_time and adtv values of a Average Daily Trading Volume technical indicator calculation")

public class AverageDailyTradingVolumeTechnicalValue {
  @SerializedName("date_time")
  private OffsetDateTime dateTime = null;

  @SerializedName("adtv")
  private Float adtv = null;

  public AverageDailyTradingVolumeTechnicalValue dateTime(OffsetDateTime dateTime) {
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

  public AverageDailyTradingVolumeTechnicalValue adtv(Float adtv) {
    this.adtv = adtv;
    return this;
  }

   /**
   * The Average Daily Trading Volume calculation value
   * @return adtv
  **/
  @ApiModelProperty(value = "The Average Daily Trading Volume calculation value")
  public Float getAdtv() {
    return adtv;
  }

  public void setAdtv(Float adtv) {
    this.adtv = adtv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AverageDailyTradingVolumeTechnicalValue averageDailyTradingVolumeTechnicalValue = (AverageDailyTradingVolumeTechnicalValue) o;
    return Objects.equals(this.dateTime, averageDailyTradingVolumeTechnicalValue.dateTime) &&
        Objects.equals(this.adtv, averageDailyTradingVolumeTechnicalValue.adtv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, adtv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AverageDailyTradingVolumeTechnicalValue {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    adtv: ").append(toIndentedString(adtv)).append("\n");
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

